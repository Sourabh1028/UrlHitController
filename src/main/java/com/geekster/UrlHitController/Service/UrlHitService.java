package com.geekster.UrlHitController.Service;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UrlHitService {

    HashMap<String, Integer> hm;

    public UrlHitService(){
        hm = new HashMap<>();
    }
    public String hitCount(String userName) {
        hm.put(userName, hm.getOrDefault(userName, 0) + 1);
        return "username : " + userName + "\n" + "hitcount : " + hm.get(userName);
    }
}

