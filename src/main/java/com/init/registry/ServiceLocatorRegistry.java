package com.init.registry;


public interface ServiceLocatorRegistry {

    public <T> AdapterService<T> getService(String serviceName);
}
