package com.acme.statusmgr.beans;

public class TempLocationDecorator extends ServerStatusDecorator {
    public TempLocationDecorator(ServerStatus decoratedStatus) {
        super(decoratedStatus);
    }
    @Override
    public String getStatusDesc() {
        return decoratedStatus.getStatusDesc() + ", and the server's temp file location is " + getSystemInfo().getTempLocation();
    }
    @Override
    public Integer getRequestCost(){
        return decoratedStatus.getRequestCost() + 29;
    }

}
