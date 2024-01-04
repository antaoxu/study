package com.xat.pojo;

import lombok.Data;

@Data
public class EsbRequest<b> {

    private EsbRequestHead head;
    private b body;

    public EsbRequest(){

    }

    public EsbRequestHead getHead() {
        return head;
    }

    public b getBody() {
        return body;
    }

    public void setBody(b body) {
        this.body = body;
    }
}
