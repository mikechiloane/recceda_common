package com.recceda.common.form;

import lombok.Getter;

@Getter
public enum FieldType {
    TEXT("text"),
    NUMBER("number"),
    EMAIL("email"),
    PASSWORD("password"),
    DATE("date"),
    TEXTAREA("textarea"),
    CHECKBOX("checkbox"),
    RADIO("radio"),
    SELECT("select"),
    MULTISELECT("select-multiple"), // Differentiate from single select
    FILE("file"),
    URL("url"),
    PHONE("tel"),
    TIME("time"),
    DATETIME("datetime-local"),
    COLOR("color"),
    RANGE("range"),
    HIDDEN("hidden");

    private final String htmlEquivalent;

    FieldType(String htmlEquivalent) {
        this.htmlEquivalent = htmlEquivalent;
    }

}