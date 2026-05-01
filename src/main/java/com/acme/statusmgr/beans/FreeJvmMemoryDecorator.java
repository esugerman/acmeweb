package com.acme.statusmgr.beans;

public class FreeJvmMemoryDecorator extends ServerStatusDecorator {
    public FreeJvmMemoryDecorator(ServerStatus decoratedStatus) {
        super(decoratedStatus);
    }
    @Override
    public String getStatusDesc() {
        return decoratedStatus.getStatusDesc() + ", and there are " + getSystemInfo().getFreeJvmMemory() + " bytes of JVM memory free";
    }

    @Override
    public String getContentHeader() {
        return decoratedStatus.getContentHeader();
    }

    @Override
    public Integer getRequestCost(){
        return decoratedStatus.getRequestCost() + 7;
    }

}
