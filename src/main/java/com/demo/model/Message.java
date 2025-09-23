package com.demo.model;

public class Message {
    private String name;
    private String content;

    public Message() {}  // Required for deserialization

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
}
