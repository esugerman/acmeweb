package com.acme.statusmgr.beans;

public class JreVersionDecorator extends ServerStatusDecorator {
    public JreVersionDecorator(ServerStatus decoratedStatus) {
        super(decoratedStatus);
    }
    @Override
    public String getStatusDesc() {
        return decoratedStatus.getStatusDesc() + ", and the JRE version is " + getSystemInfo().getJreVersion();
    }
    @Override
    public Integer getRequestCost(){
        return decoratedStatus.getRequestCost() + 19;
    }

}
