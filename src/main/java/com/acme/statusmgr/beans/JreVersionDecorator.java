package com.acme.statusmgr.beans;

public class JreVersionDecorator extends ServerStatusDecorator {
    public JreVersionDecorator(ServerStatus decoratedStatus) {
        super(decoratedStatus);
    }
    @Override
    public String getStatusDesc() {
        return decoratedStatus.getStatusDesc() + ", and the JRE version is " + System.getProperty("java.version");
    }
    @Override
    public Integer getRequestCost(){
        return decoratedStatus.getRequestCost() + 19;
    }

}
