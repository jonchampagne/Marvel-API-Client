package com.jayseeofficial.marvel.rest.parameter;

/**
 * Created by jon on 21/01/16.
 */
public enum EventOrderBy {
    NAME_ASC("name"),
    START_DATE_ASC("startDate"),
    MODIFIED_ASC("modified"),
    NAME_DESC("-name"),
    START_DATE_DESC("-startDate"),
    MODIFIED_DESC("-modified"),;

    private final String string;

    private EventOrderBy(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}
