package com.acme.statusmgr.beans;

public abstract class ServerStatusDecorator implements ServerStatus {
    protected ServerStatus decoratedStatus;

    private static SystemInfo systemInfo = new RealSystemInfo();

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
    public static void setSystemInfo(SystemInfo systemInfo) {
        ServerStatusDecorator.systemInfo = systemInfo;
    }
    public static SystemInfo getSystemInfo() {
        return systemInfo;
    }
}
