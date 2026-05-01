package com.acme.statusmgr.beans;

public class TotalJvmMemoryDecorator extends ServerStatusDecorator {
    public TotalJvmMemoryDecorator(ServerStatus decoratedStatus) {
        super(decoratedStatus);
    }
    @Override
    public String getStatusDesc() {
        return decoratedStatus.getStatusDesc() + ", and there is a total of " + Runtime.getRuntime().totalMemory() + " bytes of JVM memory";
    }
    @Override
    public Integer getRequestCost(){
        return decoratedStatus.getRequestCost() + 13;
    }

}
