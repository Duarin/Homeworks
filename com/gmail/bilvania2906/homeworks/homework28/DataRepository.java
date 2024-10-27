package com.gmail.bilvania2906.homeworks.homework28;

import java.util.HashMap;
import java.util.Map;

public class DataRepository {

    public Map<Integer, String> getData() {
        Map<Integer, String > map = new HashMap<>();
        map.put(387,"Lucy");
        map.put(231,"Alice");
        map.put(394,"Bob");
        map.put(172,"Tom");


        return map;
    }
}

