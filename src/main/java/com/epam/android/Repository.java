package com.epam.android;

import java.util.List;

/**
 * Created by root on 2014.12.24..
 */
public interface Repository<T> {
    public void addEntry(T type);

    public int count();

    public List getEntries();

    public void printEntries();
}
