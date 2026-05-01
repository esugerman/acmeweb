package com.acme.statusmgr.beans;

public interface SystemInfo {
    long getFreeJvmMemory();
    long getTotalJvmMemory();
    int getAvailableProcessors();
    String getJreVersion();
    String getTempLocation();
}
