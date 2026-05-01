package com.acme.statusmgr.beans;


public class AvailableProcessorsDecorator extends ServerStatusDecorator {
    public AvailableProcessorsDecorator(ServerStatus decoratedStatus) {
        super(decoratedStatus);
    }
    @Override
    public String getStatusDesc() {
        return decoratedStatus.getStatusDesc() + ", and there are 4 processors available";
    }

    @Override
    public String getContentHeader() {
        return decoratedStatus.getContentHeader();
    }

    @Override
    public Integer getRequestCost(){
        return decoratedStatus.getRequestCost() + 3;
    }

}
