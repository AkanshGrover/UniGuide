//By Akansh Grover

package com.Akansh.UniGuide.service;

import java.util.HashMap;

public class FinalizeUserIP {
    static boolean isNumber(String r){
        try{
            Integer.parseInt(r);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    static String[] breakRoomNo(String r, int l){
        String[] info = new String[3];
        if (l == 6){
            info[0] = r.substring(0, 2);
            info[1] = r.substring(2, 4);
            info[2] = r.substring(4, 6);
        }
        else{
            info[0] = r.substring(0, 1);
            info[1] = r.substring(1, 3);
            info[2] = r.substring(3, 5);
        }
        
        return info;
    }

    public static int[] returnBlock(String rawip){
        HashMap<String, int[]> coord_nodes = NodeInfo.getNodeInfo();
        if (coord_nodes.containsKey(rawip)){
            int[] blocknodes = coord_nodes.get(rawip);
            return blocknodes;
        }
        else{
            if (isNumber(rawip)){
                String b;
                if (rawip.length() == 6){
                    b = "B" + breakRoomNo(rawip,6)[0];
                }
                else if (rawip.length() == 5){
                    b = "B" + breakRoomNo(rawip,5)[0];
                }
                else{
                    b = "-1";
                }
                if (coord_nodes.containsKey(b)){
                    int[] blocknodes = coord_nodes.get(b);
                    return blocknodes;
                }
                else{
                    return new int[] {-1};
                }
            }
            else{
                return new int[] {-1};
            }
        }
    }
}
