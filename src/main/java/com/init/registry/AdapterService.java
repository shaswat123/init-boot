package com.init.registry;

public interface AdapterService<T> {

    public void process(T request);
}
