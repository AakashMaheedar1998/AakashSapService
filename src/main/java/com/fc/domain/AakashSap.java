package com.fc.domain;

public class AakashSap {

    private final long id;
    private final String content;

    public AakashSap(long id, String content) {
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
