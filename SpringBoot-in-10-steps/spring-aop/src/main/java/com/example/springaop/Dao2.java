package com.example.springaop;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {
    public String retrieveSomething() {
        return "Dao2";
    }

}
