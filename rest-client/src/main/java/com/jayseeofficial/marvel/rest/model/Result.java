package com.jayseeofficial.marvel.rest.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Result<T> implements Serializable {
    private int code;
    private String status;
    private String etag;
    private String copyright;
    private String attributionText;
    private String attributionHTML;
    private Container<T> data;
    private String rawResponse;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Container<T> getData() {
        return data;
    }

    public void setData(Container<T> data) {
        this.data = data;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getAttributionText() {
        return attributionText;
    }

    public void setAttributionText(String attributionText) {
        this.attributionText = attributionText;
    }

    public String getAttributionHTML() {
        return attributionHTML;
    }

    public void setAttributionHTML(String attributionHTML) {
        this.attributionHTML = attributionHTML;
    }

    public String getRawResponse() {
        return rawResponse;
    }

    public void setRawResponse(String rawResponse) {
        this.rawResponse = rawResponse;
    }

    public boolean isResultOf(Class c) {
        for (T t : data.getResults()) {
            if (!c.isInstance(t)) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
