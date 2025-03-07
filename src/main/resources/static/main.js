function getFloorandRoom(){
    const ip = document.getElementById("destination");
    const ipValue = ip.value;
    if (Number.isInteger(Number(ipValue)) && ipValue.length>=4 && ipValue.length<=5){
        let roomNumber = ipValue.split('').reverse().join('');
        let block = roomNumber.substring(3).split('').reverse().join('');
        let floor = roomNumber.substring(2,3).split('').reverse().join('');
        let room = roomNumber.substring(0,2).split('').reverse().join('');
        if (Number(block) < 12){
            document.getElementById('block').textContent = block;
            document.getElementById('floor').textContent = floor;
            document.getElementById('room').textContent = room;
            document.getElementById('roominfo').style.display = "table";
            document.getElementById('response_container').style.display="flex";
        }
        else{
            document.getElementById('roominfo').style.display = "none";
        }
    }
    else{
        document.getElementById('roominfo').style.display = "none";
    }
}

var sourceCoords;
var isLocUsed;

document.getElementById('getLoc').addEventListener('click', async function(e) {
    e.preventDefault();
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(async function(position) {
            const latitude = position.coords.latitude;
            const longitude = position.coords.longitude;

            const response = await fetch('/api/getLoc', {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify({ latitude, longitude })
            });
            if (response.ok){
                const data = await response.json();
                if (data.place != "-1"){
                    document.getElementById('source').value = data.place;
                    sourceCoords = [[latitude, longitude]];
                    isLocUsed = true;
                    inputChange();
                    drawPath(sourceCoords, "Current location");
                }
                else{
                    document.getElementById('source').value = "You are far away from the campus.";
                    sourceCoords = [];
                    isLocUsed = false;
                    inputChange();
                }
            }
        }, function(){
            alert("Location access denied. Please enable location services.");
        });
    }
    else {
        alert("Geolocation is not supported by this browser.");
    }
});

function setDest(button){
    document.getElementById('destination').value = button.textContent;
    inputChange();
}

var polylines = [];
var markers = [];

function drawPath(vertices, s, d=-1, dis=0) {
    var sm = L.marker(vertices[0], {"title" : s}).addTo(map).bindPopup(s).openPopup();
    if (d!=-1){
        var dm = L.marker(vertices[vertices.length-1], {"title" : d}).addTo(map).bindPopup(d + ", " + dis + "m away").openPopup();
        markers.push(dm);
        var path = L.polyline(vertices,  {"weight":5,"color":"#266bf2"}).addTo(map);
        polylines.push(path);
        map.fitBounds(path.getBounds());
    }
    markers.push(sm);
}

document.getElementById('search_btn').addEventListener('click', async function(e) {
    e.preventDefault();
    const source = document.getElementById('source').value;
    const destination = document.getElementById('destination').value;

    const response = await fetch('/api/getPath', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ source, destination })
    });
    if (response.ok) {
        const data = await response.json();
        if (data.path != -1 && data.totalDistance != -1) {
            document.getElementById('response').innerHTML = '';
            if (isLocUsed) {
                drawPath(sourceCoords.concat(data.pathCoords), "Current location", destination, data.totalDistance.toFixed(2));
            }
            else {
                drawPath(data.pathCoords, source, destination, data.totalDistance.toFixed(2));
            }
        }
        else if(data.path[0] == -1) {
            document.getElementById('response').innerHTML = 'The source does not exist.';
            document.getElementById('response_container').style.display="flex";
            document.getElementById('response').style.display="block";
        }
        else if (data.path[1] == -1) {
            document.getElementById('response').innerHTML = 'The destination does not exist.';
            document.getElementById('response_container').style.display="flex";
            document.getElementById('response').style.display="block";
        }
        getFloorandRoom();
    }
    else {
        document.getElementById('response').innerHTML = 'Error retrieving path. Please try again.';
        document.getElementById('response_container').style.display="flex";
        document.getElementById('response').style.display="block";
    }
});

function inputChange(){
    document.getElementById('response_container').style.display="none";
    document.getElementById('response').style.display="none";
    polylines.forEach(function (item) {
        map.removeLayer(item)
    });
    markers.forEach(function (item) {
        map.removeLayer(item)
    });
}

var map = L.map('map').setView([30.41686387274698, 77.96860215062047], 17);
L.tileLayer('https://server.arcgisonline.com/ArcGIS/rest/services/World_Imagery/MapServer/tile/{z}/{y}/{x}', {maxZoom: 18, attribution: '&copy; <a href="https://www.esri.com/en-us/arcgis/about-arcgis/what-is-arcgis">Esri</a> &mdash; Esri and others'}).addTo(map);
