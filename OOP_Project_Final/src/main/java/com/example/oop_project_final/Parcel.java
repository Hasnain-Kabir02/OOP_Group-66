// Parcel.java (updated with 'destination' property)
package com.example.oop_project_final;

public class Parcel {
    private String parcelId;
    private String senderName;
    private String recipientName;
    private String destination; // New field
    private String status;
    private String location;
    private String lastUpdate;

    // You will need a new constructor
    public Parcel(String parcelId, String recipientName, String destination, String status) {
        this.parcelId = parcelId;
        this.recipientName = recipientName;
        this.destination = destination;
        this.status = status;
    }

    // Existing constructor (keep it)
    public Parcel(String parcelId, String senderName, String recipientName, String status, String location, String lastUpdate) {
        this.parcelId = parcelId;
        this.senderName = senderName;
        this.recipientName = recipientName;
        this.status = status;
        this.location = location;
        this.lastUpdate = lastUpdate;
    }

    // Getters for all fields (including destination)
    public String getParcelId() { return parcelId; }
    public String getSenderName() { return senderName; }
    public String getRecipientName() { return recipientName; }
    public String getDestination() { return destination; } // New getter
    public String getStatus() { return status; }
    public String getLocation() { return location; }
    public String getLastUpdate() { return lastUpdate; }
}