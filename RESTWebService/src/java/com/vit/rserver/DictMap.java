package com.vit.rserver;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DictMap
{
    public static void main(String a[])
    {        
     Map<String, String> m = new HashMap<String, String>();
     m.put("SCSE", "Cloud Computing");
     m.put("SITE", "Network Simulator");
     m.put("SMBS", "Thermal LAB");
     Set<String> s= m.keySet();
     for (String temp : s)
     {
         System.out.println(temp);
     }
     
     System.out.println(m.get("SCSE"));
     
    }
    
    
}
