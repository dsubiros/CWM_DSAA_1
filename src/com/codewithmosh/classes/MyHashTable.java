package com.codewithmosh.classes;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyHashTable {

    private class Entry {
        public int key;
        public String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{K: " + this.key + ", V: \"" + this.value + "\"}";
        }
    }

    private final int MAX;

    private LinkedList<Entry>[] entries;

    public MyHashTable(int max) {
        this.entries = new LinkedList[this.MAX = max];
    }

    public void remove(int key) {
        var entry = getEntry(key);
        if (entry == null)
            throw new IllegalStateException();

        getBucket(key).remove(entry);
    }

    public String get(int key) {
        var entry = getEntry(key);
        return entry != null ? entry.value : null;
    }

    // public void put(int key, String value) {
    // System.out.println("Put K: " + key + ", V: " + value);

    // var slotIdx = hash(key);
    // var slot = getOrCreateSlot(slotIdx);
    // var itemIdx = getItemIdx(key, slot);

    // if (itemIdx != -1)
    // slot.remove(itemIdx);

    // slot.addLast(new Entry(key, value));
    // }

    public void put(int key, String value) {
        System.out.println("Put K: " + key + ", V: " + value);

        var index = hash(key);

        if (this.entries[index] == null)
            this.entries[index] = new LinkedList<>();

        var entry = getEntry(key);

        if (entry != null) {
            entry.value = value;
            return;
        }
        getOrCreateBucket(key)
                .addLast(new Entry(key, value));
    }

    private LinkedList<Entry> getBucket(int key) {
        return entries[hash(key)];
    }

    private LinkedList<Entry> getOrCreateBucket(int key) {
        var index = hash(key);
        var bucket = entries[index];
        if (bucket == null)
            this.entries[hash(key)] = new LinkedList<>();

        return bucket;
    }

    private Entry getEntry(int key) {
        var bucket = getBucket(key);

        if (bucket != null)
            for (var entry : bucket) {
                if (entry.key == key)
                    return entry;
            }
        return null;
    }

    // private int getItemIdx(int key, LinkedList<Entry> slot) {
    // var itemIdx = -1;

    // var bucket = entries[];

    // for (int i = 0; i < slot.size(); i++) {
    // if (slot.get(i).key == key) {
    // itemIdx = i;
    // break;
    // }
    // }
    // return itemIdx;
    // }

    // private LinkedList<Entry> getOrCreateSlot(int idx) {
    // return this.entries[idx] == null ? this.entries[idx] = new LinkedList<>() :
    // this.entries[idx];
    // }

    private int hash(int key) {
        return key % entries.length;
    }

    @Override
    public String toString() {

        String result = "";

        for (var slot : entries) {
            if (slot == null) {
                result += "[]\n";
                continue;
            }

            String str = "[";
            for (var entry : slot)
                str += entry.toString() + ", ";
            result += str + "] \n";
        }

        return result;
    }

    // put(k, v)
    // get(k)
    // remove(k)
    // k: int
    // v: string
    // Collisions: chaining
    // LinkedList<Entry>[]
    // [LL, LL, LL, LL]
}
