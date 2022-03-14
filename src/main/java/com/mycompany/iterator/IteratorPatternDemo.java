/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kennelra
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        List<Record> records = new ArrayList<Record>();
        records.add(new Record("Love Angel Music Baby", "Gwen Stefani", "pop", 15797287, 122.50));
        records.add(new Record("Reputation", "Taylor Swift", "pop", 11256175, 59.19));
        records.add(new Record("Floral Shoppe", "Macintosh Plus", "vaporwave", 10960101,77.50));
        records.add(new Record("Stop Making Sense", "Talking Heads", "rock", 266391, 49.99));
        records.add(new Record("Random Access Memories","Daft Punk", "electronic", 9216088, 47.98));
        records.add(new Record("Saves the World", "MUNA", "indie pop", 14097394, 200.00));
        records.add(new Record("Dreamland", "Glass Animals","indie psychedelic", 15727330, 64.94));
        records.add(new Record("Wasteland, Baby!", "Hozier", "indie", 13284229, 45.45));
        records.add(new Record("Bloom", "Troye Sivan", "electronic pop", 12452758, 81.52));
        records.add(new Record("evermore", "Taylor Swift", "folk pop", 18924628, 21.95));
        records.add(new Record("1989", "Taylor Swift", "pop", 6379963, 37.99));
        records.add(new Record("Women In Music Pt. III", "HAIM", "pop rock", 15532255, 40.00));
        records.add(new Record("Happier than Ever", "Billie Eilish", "pop", 19692598, 49.00));
        records.add(new Record("You Signed Up For This", "Maisie Peters", "pop", 20009530, 24.17));
        records.add(new Record("Sunset Tree","The Mountain Goats", "indie folk", 1337955, 75.98));
        
        RecordStore store = new RecordStore();
        PersonalRecordCollection mycollection = new PersonalRecordCollection();
        
        records.forEach((record) -> {
            store.addRecord(record);
            mycollection.addRecord(record);
        });
        
        RecordIterator collectionIterator = mycollection.iterator();
        RecordIterator storeIterator = store.iterator();
        
        System.out.println("Printing my collection");
        printRecords(collectionIterator);
        System.out.println("Printing store inventory");
        printRecords(storeIterator);
        
        while (storeIterator.hasNext()) {
            System.out.println(storeIterator.next().toString());
        }
        
    }
    
    private static void printRecords(RecordIterator iterator) {
        System.out.printf("%20s | %25s | %20s | %15s | %10s\n", "Artist", "Name", "Genre", "ReleaseID", "Price");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        while (iterator.hasNext()) {
            Record record = iterator.next();
            System.out.printf("%20s | %25s | %20s | %15s | %10.2f\n", record.getArtist(), record.getName(), record.getGenre(), record.getReleaseID(), record.getPrice());
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println();
    }
}
