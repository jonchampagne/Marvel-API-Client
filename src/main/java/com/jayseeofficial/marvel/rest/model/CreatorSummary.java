package com.jayseeofficial.marvel.rest.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class CreatorSummary implements Serializable {
    private String resourceURI;
    private String name;
    private String role;

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
