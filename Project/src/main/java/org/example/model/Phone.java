package org.example.model;

public class Phone {

    private String value;
    private Label label;

    public Phone(String value, Label label) {
        this.value = value;
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public String toJson() {
        return String.format("{value: \"%s\", label: \"%s\"}", value, label.getName());
    }

}
