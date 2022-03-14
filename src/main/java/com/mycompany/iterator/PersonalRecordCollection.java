
package com.mycompany.iterator;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kennelra
 */
public class PersonalRecordCollection implements RecordCollection {
    protected List<Record> records;
    
    public PersonalRecordCollection() {
        super();
        records = new ArrayList<Record>();
    }
    
    public void addRecord(String name, String artist, String genre, long upc, double price) {
        Record record = new Record(name, artist, genre, upc, price);
        records.add(record);
        System.out.println(record.toString() + " added to collection.");
    }
    
    public void addRecord(Record record) {
        records.add(record);
    }
    
    public List<Record> getRecords() {
        return records;
    }
    
    @Override
    public RecordIterator iterator() {
        return new RecordIterator(records);
    }
    
}