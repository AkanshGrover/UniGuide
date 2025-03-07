//By Akansh Grover

package com.Akansh.UniGuide.service;

import java.util.ArrayList;

public class GraphInfo {
    public static ArrayList<ArrayList<FindPath.Nodes>> getVerticeInfo(int v){
        ArrayList<ArrayList<FindPath.Nodes>> graph = new ArrayList<>();
        for (int i=0; i<v; i++){
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(new FindPath.Nodes(1, 21.4));
        graph.get(1).add(new FindPath.Nodes(0, 21.4));
        graph.get(1).add(new FindPath.Nodes(2, 41.73));
        graph.get(1).add(new FindPath.Nodes(3, 82.94));
        graph.get(1).add(new FindPath.Nodes(49, 24.50));
        graph.get(2).add(new FindPath.Nodes(1, 41.73));
        graph.get(2).add(new FindPath.Nodes(4, 23.51));
        graph.get(2).add(new FindPath.Nodes(55, 27.34));
        graph.get(3).add(new FindPath.Nodes(1, 82.94));
        graph.get(3).add(new FindPath.Nodes(5, 49.90));
        graph.get(3).add(new FindPath.Nodes(49, 50.03));
        graph.get(4).add(new FindPath.Nodes(2, 23.51));
        graph.get(4).add(new FindPath.Nodes(5, 59.51));
        graph.get(4).add(new FindPath.Nodes(7, 68.17));
        graph.get(4).add(new FindPath.Nodes(49, 44.40));
        graph.get(5).add(new FindPath.Nodes(3, 49.90));
        graph.get(5).add(new FindPath.Nodes(4, 59.51));
        graph.get(5).add(new FindPath.Nodes(8, 35.22));
        graph.get(5).add(new FindPath.Nodes(9, 31.45));
        graph.get(6).add(new FindPath.Nodes(15, 39.94));
        graph.get(6).add(new FindPath.Nodes(55, 37.07));
        graph.get(7).add(new FindPath.Nodes(4, 68.17));
        graph.get(7).add(new FindPath.Nodes(56, 14.68));
        graph.get(8).add(new FindPath.Nodes(5, 35.22));
        graph.get(8).add(new FindPath.Nodes(12, 31.90));
        graph.get(8).add(new FindPath.Nodes(48, 30.19));
        graph.get(9).add(new FindPath.Nodes(5, 31.45));
        graph.get(9).add(new FindPath.Nodes(10, 26.89));
        graph.get(9).add(new FindPath.Nodes(52, 15.20));
        graph.get(10).add(new FindPath.Nodes(9, 26.89));
        graph.get(10).add(new FindPath.Nodes(53, 17.38));
        graph.get(11).add(new FindPath.Nodes(12, 32.18));
        graph.get(11).add(new FindPath.Nodes(32, 111.19));
        graph.get(11).add(new FindPath.Nodes(53, 21.19));
        graph.get(11).add(new FindPath.Nodes(54, 26.18));
        graph.get(12).add(new FindPath.Nodes(8, 31.90));
        graph.get(12).add(new FindPath.Nodes(11, 32.18));
        graph.get(12).add(new FindPath.Nodes(51, 20.53));
        graph.get(12).add(new FindPath.Nodes(52, 21.05));
        graph.get(13).add(new FindPath.Nodes(14, 46.18));
        graph.get(13).add(new FindPath.Nodes(19, 12.3));
        graph.get(13).add(new FindPath.Nodes(47, 66.72));
        graph.get(13).add(new FindPath.Nodes(51, 21.09));
        graph.get(14).add(new FindPath.Nodes(13, 46.18));
        graph.get(14).add(new FindPath.Nodes(19, 49.34));
        graph.get(14).add(new FindPath.Nodes(21, 36.76));
        graph.get(14).add(new FindPath.Nodes(29, 32.39));
        graph.get(14).add(new FindPath.Nodes(38, 98.66));
        graph.get(14).add(new FindPath.Nodes(54, 22.49));
        graph.get(15).add(new FindPath.Nodes(6, 39.94));
        graph.get(15).add(new FindPath.Nodes(16, 12.23));
        graph.get(16).add(new FindPath.Nodes(15, 12.23));
        graph.get(16).add(new FindPath.Nodes(17, 18.20));
        graph.get(17).add(new FindPath.Nodes(16, 18.20));
        graph.get(17).add(new FindPath.Nodes(46, 33.31));
        graph.get(17).add(new FindPath.Nodes(25, 36.40));
        graph.get(18).add(new FindPath.Nodes(46, 23.25));
        graph.get(18).add(new FindPath.Nodes(19, 39.43));
        graph.get(18).add(new FindPath.Nodes(24, 36.76));
        graph.get(19).add(new FindPath.Nodes(13, 12.3));
        graph.get(19).add(new FindPath.Nodes(14, 49.34));
        graph.get(19).add(new FindPath.Nodes(18, 39.43));
        graph.get(19).add(new FindPath.Nodes(20, 36.76));
        graph.get(20).add(new FindPath.Nodes(19, 36.76));
        graph.get(20).add(new FindPath.Nodes(21, 49.34));
        graph.get(20).add(new FindPath.Nodes(24, 39.43));
        graph.get(21).add(new FindPath.Nodes(14, 36.76));
        graph.get(21).add(new FindPath.Nodes(20, 49.34));
        graph.get(21).add(new FindPath.Nodes(22, 28.49));
        graph.get(22).add(new FindPath.Nodes(21, 28.49));
        graph.get(22).add(new FindPath.Nodes(23, 88.77));
        graph.get(22).add(new FindPath.Nodes(41, 70.34));
        graph.get(23).add(new FindPath.Nodes(22, 88.77));
        graph.get(23).add(new FindPath.Nodes(24, 28.49));
        graph.get(23).add(new FindPath.Nodes(27, 80.25));
        graph.get(24).add(new FindPath.Nodes(18, 36.76));
        graph.get(24).add(new FindPath.Nodes(20, 39.43));
        graph.get(24).add(new FindPath.Nodes(23, 28.49));
        graph.get(25).add(new FindPath.Nodes(17, 36.40));
        graph.get(25).add(new FindPath.Nodes(26, 22.62));
        graph.get(26).add(new FindPath.Nodes(25, 22.62));
        graph.get(26).add(new FindPath.Nodes(27, 42.88));
        graph.get(27).add(new FindPath.Nodes(23, 80.25));
        graph.get(27).add(new FindPath.Nodes(26, 42.88));
        graph.get(27).add(new FindPath.Nodes(28, 18.76));
        graph.get(28).add(new FindPath.Nodes(27, 18.76));
        graph.get(28).add(new FindPath.Nodes(42, 78.76));
        graph.get(29).add(new FindPath.Nodes(14, 32.39));
        graph.get(29).add(new FindPath.Nodes(30, 13.48));
        graph.get(29).add(new FindPath.Nodes(31, 43.58));
        graph.get(30).add(new FindPath.Nodes(29, 13.48));
        graph.get(31).add(new FindPath.Nodes(29, 43.58));
        graph.get(31).add(new FindPath.Nodes(32, 14.88));
        graph.get(31).add(new FindPath.Nodes(33, 18.86));
        graph.get(32).add(new FindPath.Nodes(31, 14.88));
        graph.get(32).add(new FindPath.Nodes(11, 111.19));
        graph.get(33).add(new FindPath.Nodes(31, 18.86));
        graph.get(33).add(new FindPath.Nodes(34, 25.53));
        graph.get(33).add(new FindPath.Nodes(37, 14));
        graph.get(34).add(new FindPath.Nodes(33, 25.53));
        graph.get(34).add(new FindPath.Nodes(35, 22.44));
        graph.get(34).add(new FindPath.Nodes(39, 29.65));
        graph.get(35).add(new FindPath.Nodes(34, 22.44));
        graph.get(35).add(new FindPath.Nodes(36, 29.41));
        graph.get(36).add(new FindPath.Nodes(35, 29.41));
        graph.get(37).add(new FindPath.Nodes(33, 14));
        graph.get(37).add(new FindPath.Nodes(38, 8.02));
        graph.get(38).add(new FindPath.Nodes(14, 98.66));
        graph.get(38).add(new FindPath.Nodes(37, 8.02));
        graph.get(38).add(new FindPath.Nodes(39, 25.53));
        graph.get(39).add(new FindPath.Nodes(34, 29.65));
        graph.get(39).add(new FindPath.Nodes(38, 25.53));
        graph.get(39).add(new FindPath.Nodes(40, 15.69));
        graph.get(40).add(new FindPath.Nodes(39, 15.69));
        graph.get(41).add(new FindPath.Nodes(22, 70.34));
        graph.get(41).add(new FindPath.Nodes(42, 101.97));
        graph.get(41).add(new FindPath.Nodes(43, 32.43));
        graph.get(42).add(new FindPath.Nodes(41, 101.97));
        graph.get(42).add(new FindPath.Nodes(28, 78.76));
        graph.get(43).add(new FindPath.Nodes(41, 32.43));
        graph.get(43).add(new FindPath.Nodes(44, 54.45));
        graph.get(43).add(new FindPath.Nodes(45, 28.57));
        graph.get(44).add(new FindPath.Nodes(43, 54.45));
        graph.get(45).add(new FindPath.Nodes(43, 28.57));
        graph.get(46).add(new FindPath.Nodes(17, 33.31));
        graph.get(46).add(new FindPath.Nodes(18, 23.25));
        graph.get(46).add(new FindPath.Nodes(47, 12.3));
        graph.get(47).add(new FindPath.Nodes(13, 66.72));
        graph.get(47).add(new FindPath.Nodes(46, 12.3));
        graph.get(47).add(new FindPath.Nodes(50, 19.47));
        graph.get(48).add(new FindPath.Nodes(8, 30.19));
        graph.get(48).add(new FindPath.Nodes(56, 45.97));
        graph.get(49).add(new FindPath.Nodes(1, 24.50));
        graph.get(49).add(new FindPath.Nodes(3, 50.03));
        graph.get(49).add(new FindPath.Nodes(4, 44.0));
        graph.get(50).add(new FindPath.Nodes(47, 19.47));
        graph.get(50).add(new FindPath.Nodes(56, 16.71));
        graph.get(51).add(new FindPath.Nodes(12, 20.53));
        graph.get(51).add(new FindPath.Nodes(13, 21.09));
        graph.get(52).add(new FindPath.Nodes(9, 15.20));
        graph.get(52).add(new FindPath.Nodes(12, 21.05));
        graph.get(53).add(new FindPath.Nodes(10, 17.38));
        graph.get(53).add(new FindPath.Nodes(11, 21.19));
        graph.get(54).add(new FindPath.Nodes(11, 26.18));
        graph.get(54).add(new FindPath.Nodes(14, 22.49));
        graph.get(55).add(new FindPath.Nodes(2, 27.34));
        graph.get(55).add(new FindPath.Nodes(6, 37.07));
        graph.get(56).add(new FindPath.Nodes(7, 14.68));
        graph.get(56).add(new FindPath.Nodes(48, 45.97));
        graph.get(56).add(new FindPath.Nodes(50, 16.71));
        //hidden vertices, only used for location detection v
        graph.get(57).add(new FindPath.Nodes(57, 0));//hubble
        graph.get(58).add(new FindPath.Nodes(58, 0));//b1
        graph.get(59).add(new FindPath.Nodes(58, 0));//mac

        graph.get(24).add(new FindPath.Nodes(60, 0));//library
        graph.get(60).add(new FindPath.Nodes(24, 0));//library

        graph.get(61).add(new FindPath.Nodes(24, 0));//it
        graph.get(24).add(new FindPath.Nodes(61, 0));//it

        graph.get(62).add(new FindPath.Nodes(32, 0));//b10
        graph.get(32).add(new FindPath.Nodes(62, 0));//b10
        
        graph.get(63).add(new FindPath.Nodes(36, 0));//b11 left
        graph.get(36).add(new FindPath.Nodes(63, 0));//b11 left

        graph.get(64).add(new FindPath.Nodes(36, 0));//b11 right
        graph.get(36).add(new FindPath.Nodes(64, 0));//b11 right
        return graph;
    }
}
