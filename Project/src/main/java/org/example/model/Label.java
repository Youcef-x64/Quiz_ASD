package org.example.model;

public enum Label {
    HOME("Home"),
    MOBILE("Mobile"),
    WORK("Work");

    private String name;

    Label(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
