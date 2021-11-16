package com.xat.pojo;

public class EsbRequest<b> {
    private EsbRequestHead head;
    private b body;

    public EsbRequest(){

    }

    public EsbRequestHead getHead() {
        return head;
    }

    public void setHead(EsbRequestHead head) {
        this.head = head;
    }

    public b getBody() {
        return body;
    }

    public void setBody(b body) {
        this.body = body;
    }
}
