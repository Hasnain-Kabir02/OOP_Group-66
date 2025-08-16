package com.example.oop_project_final;

public class ParcelDummy {
        private String packageId;
        private String senderId;
        private String origin;
        private String destination;
        private double weight;
        private String type;   // e.g. "Document", "Box", "Fragile"
        private String receiverId;
        private String assignedWarehouse;

        // Constructor
        public ParcelDummy(String packageId, String senderId, String origin, String destination,
                      double weight, String type, String receiverId, String assignedWarehouse) {
            this.packageId = packageId;
            this.senderId = senderId;
            this.origin = origin;
            this.destination = destination;
            this.weight = weight;
            this.type = type;
            this.receiverId = receiverId;
            this.assignedWarehouse = assignedWarehouse;
        }

        // Getters
        public String getPackageId() { return packageId; }
        public String getSenderId() { return senderId; }
        public String getOrigin() { return origin; }
        public String getDestination() { return destination; }
        public double getWeight() { return weight; }
        public String getType() { return type; }
        public String getReceiverId() { return receiverId; }
        public String getAssignedWarehouse() { return assignedWarehouse; }

        // Setters
        public void setPackageId(String packageId) { this.packageId = packageId; }
        public void setSenderId(String senderId) { this.senderId = senderId; }
        public void setOrigin(String origin) { this.origin = origin; }
        public void setDestination(String destination) { this.destination = destination; }
        public void setWeight(double weight) { this.weight = weight; }
        public void setType(String type) { this.type = type; }
        public void setReceiverId(String receiverId) { this.receiverId = receiverId; }
        public void setAssignedWarehouse(String assignedWarehouse) { this.assignedWarehouse = assignedWarehouse; }

        @Override
        public String toString() {
            return "Parcel{" +
                    "packageId='" + packageId + '\'' +
                    ", senderId='" + senderId + '\'' +
                    ", origin='" + origin + '\'' +
                    ", destination='" + destination + '\'' +
                    ", weight=" + weight +
                    ", type='" + type + '\'' +
                    ", receiverId='" + receiverId + '\'' +
                    ", assignedWarehouse='" + assignedWarehouse + '\'' +
                    '}';
        }
    }
