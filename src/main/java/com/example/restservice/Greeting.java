package com.example.restservice;

/************************************************************************
 Made by        PatrickSys
 Date           20/04/2021
 Package        com.example.restservice
 Description:
 ************************************************************************/
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}