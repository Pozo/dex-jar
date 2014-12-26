package com.epam.android;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class InMemoryRepository<T> implements Repository<T> {
    private final HashSet<T> entries = new HashSet<T>();

    @Override
    public void addEntry(T type) {
        entries.add(type);
    }

    @Override
    public int count() {
        return entries.size();
    }

    @Override
    public List getEntries() {
        return new ArrayList<T>(entries);
    }

    @Override
    public void printEntries() {
        for (T entry : entries) {
            System.out.println("entry = " + entry);
        }
    }
}
