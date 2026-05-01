package com.acme.statusmgr.beans;

import com.acme.servermgr.ServerManager;

public interface ServerStatus{
    String getContentHeader();
    Integer getRequestCost();
    String getStatusDesc();

}

abstract class ServerStatusDecorator implements ServerStatus {
    protected ServerStatus decoratedStatus;

    public ServerStatusDecorator(ServerStatus decoratedStatus) {
        this.decoratedStatus = decoratedStatus;
    }

    @Override
    public String getContentHeader(){
        return decoratedStatus.getContentHeader();
    }
    @Override
    public Integer getRequestCost(){
        return decoratedStatus.getRequestCost();
    }
    @Override
    public String getStatusDesc() {
        return decoratedStatus.getStatusDesc();
    }
}

