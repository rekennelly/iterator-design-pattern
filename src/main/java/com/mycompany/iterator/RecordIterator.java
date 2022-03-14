/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iterator;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author kennelra
 */
public class RecordIterator implements Iterator<Record> {
    protected List<Record> records;
    protected Integer current = 0;
    
    public RecordIterator(List<Record> records) {
        this.records = records;
    }

    @Override
    public boolean hasNext() {
        return current < records.size() && records.get(current) != null;
    }

    public Record next() {
        if (this.hasNext()) {
            return records.get(current++);
        }
        return null;
    }

    public Record first() {
        return records.get(0);
    }

    public Record CurrentItem() {
        return records.get(current);
    }

    public boolean isDone() {
        return current == null;
    }
    
    public int getRecordsSize() {
        return records.size();
    }
    
}
