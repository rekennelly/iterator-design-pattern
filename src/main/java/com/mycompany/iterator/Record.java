/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iterator;

/**
 *
 * @author kennelra
 */
public class Record {
	private String name;
	private String artist;
	private String genre;
	private long releaseID; 
	private double price;

	public Record(String name, String artist, String genre, long upc, double price) {
		this.name = name;
		this.artist = artist;
		this.genre = genre;
		this.releaseID = upc;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
  
  	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public long getReleaseID() {
		return releaseID;
	}
	
	public void setReleaseID(long releaseID) {
		this.releaseID = releaseID;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Record [").append(artist).append(" — ").append(name).append(" (genre: ").append(genre).append(", price: $").
		append(price).append(", Release ID: ").append(releaseID).append(")]");

		return builder.toString();
	}
}
