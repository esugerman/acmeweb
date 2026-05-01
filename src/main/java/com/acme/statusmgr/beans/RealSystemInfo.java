package com.acme.statusmgr.beans;

public class RealSystemInfo implements SystemInfo {
    @Override
    public long getFreeJvmMemory() { return Runtime.getRuntime().freeMemory(); }

    @Override
    public long getTotalJvmMemory() { return Runtime.getRuntime().totalMemory(); }

    @Override
    public int getAvailableProcessors() { return Runtime.getRuntime().availableProcessors(); }

    @Override
    public String getJreVersion() { return System.getProperty("java.version"); }

    @Override
    public String getTempLocation() { return System.getenv("TEMP"); }
}
