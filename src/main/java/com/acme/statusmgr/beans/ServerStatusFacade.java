package com.acme.statusmgr.beans;

public class ServerStatusFacade {

    private ServerStatus serverStatus;

    public ServerStatusFacade() {
        this.serverStatus = new BasicServerStatus();
    }

    public ServerStatusFacade(long id, String contentHeader) {
        this.serverStatus = new BasicServerStatus(id, contentHeader);
    }

    public ServerStatusFacade withAvailableProcessors() {
        serverStatus = new AvailableProcessorsDecorator(serverStatus); // wraps current
        return this;
    }

    public ServerStatusFacade withFreeJvmMemory() {
        serverStatus = new FreeJvmMemoryDecorator(serverStatus); // wraps current
        return this;
    }

    public ServerStatusFacade withTotalJvmMemory() {
        serverStatus = new TotalJvmMemoryDecorator(serverStatus); // wraps current
        return this;
    }

    public ServerStatusFacade withJreVersion() {
        serverStatus = new JreVersionDecorator(serverStatus); // wraps current
        return this;
    }

    public ServerStatusFacade withTempLocation() {
        serverStatus = new TempLocationDecorator(serverStatus); // wraps current
        return this;
    }

    public ServerStatus getServerStatus() {
        return serverStatus;
    }
}