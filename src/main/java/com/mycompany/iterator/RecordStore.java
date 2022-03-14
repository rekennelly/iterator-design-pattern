/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author kennelra
 */
public class RecordStore implements RecordCollection {
    protected static int MAX_NUM_RECORDS = 10;
    protected static int MAX_NUM_ROCK_RECORDS = 2;
    protected int totalRecords = 0;
    protected int totalRockRecords = 0;
    protected List<Record> records;
    
    public RecordStore() {
        super();
        records = new ArrayList<Record>();
    }
    
    public boolean addRecord(Record record) {
        if (totalRecords < (MAX_NUM_RECORDS - 1)) {
            // See if the record is rock & handle it accordingly
            if ((totalRockRecords < (MAX_NUM_ROCK_RECORDS - 1)) && record.getGenre().contains("rock")) {
                totalRecords++;
                totalRockRecords++;
                records.add(record);
                return true;
            }
            else if (!record.getGenre().contains("rock")) {
                totalRecords++;
                records.add(record);
                return true;
            }
            // if rock record didn't get addded, it means we're full
            else if (record.getGenre().contains("rock")) {
                System.out.println("We don't stock more than 10 rock records. It's not what our customers want.");
                return false;
            }
        }
        else {
            System.out.println("Oh no! The record store inventory is full and can't accept any more records!");
            return false;
        }
        return false;
    }
    
    public boolean addRecord(String name, String artist, String genre, long upc, double price) {
        Record record = new Record(name, artist, genre, upc, price);
        if (totalRecords < (MAX_NUM_RECORDS - 1)) {
            // See if the record is rock & handle it accordingly
            if ((totalRockRecords < (MAX_NUM_ROCK_RECORDS - 1)) && genre.contains("rock")) {
                totalRecords++;
                totalRockRecords++;
                records.add(record);
                return true;
            }
            else if (!genre.contains("rock")) {
                totalRecords++;
                records.add(record);
                return true;
            }
            // if rock record didn't get addded, it means we're full
            else if (record.getGenre().contains("rock")) {
                System.out.println("We don't stock more than 10 rock records. It's not what our customers want.");
                return false;
            }
        }
        else {
            System.out.println("Oh no! The record store inventory is full and can't accept any more records!");
            return false;
        }
        return false;
    }
    
    public List<Record> getRecords() {
        return records;
    }
    

    @Override
    public RecordIterator iterator() {
        return new RecordIterator(records);
    }    
}
