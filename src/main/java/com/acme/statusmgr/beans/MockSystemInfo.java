package com.acme.statusmgr.beans;

public class MockSystemInfo implements SystemInfo {
    @Override
    public long getFreeJvmMemory() { return 127268272; }

    @Override
    public long getTotalJvmMemory() { return 159383552; }

    @Override
    public int getAvailableProcessors() { return 4; }

    @Override
    public String getJreVersion() { return "15.0.2+7-27"; }

    @Override
    public String getTempLocation() { return "M:\\\\AppData\\\\Local\\\\Temp"; }
}
