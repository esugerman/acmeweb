package com.acme.statusmgr.beans;

public class ServerStatusFacade {

    private final ServerStatus baseStatus;

    public ServerStatusFacade(ServerStatus baseStatus){
        this.baseStatus = baseStatus;
    }
    public ServerStatus withAvailableProcessors() {
        return new AvailableProcessorsDecorator(baseStatus);
    }

    public ServerStatus withFreeJvmMemory() {
        return new FreeJvmMemoryDecorator(baseStatus);
    }

    public ServerStatus withTotalJvmMemory() {
        return new TotalJvmMemoryDecorator(baseStatus);
    }

    public ServerStatus withJreVersion() {
        return new JreVersionDecorator(baseStatus);
    }

    public ServerStatus withTempLocation() {
        return new TempLocationDecorator(baseStatus);
    }
}
