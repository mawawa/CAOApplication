package com.nano.CAO.computer.memory;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Memory {
    @Id
    private long sysID;
    final static String DEFINITION = "";

    //location refers to internal or external
    private  MemoryLocation location;

    //capacity refers to either words o bytes.
    private int capacity;

    //storage typ
    private StorageType storageType;

    //define the unit of transfer.
    private TransferUnit transferUnit;

    //define the physical of the ram
    private PhysicalType physicalType;

    //define if the memory is volatile
    private boolean isVolatile;

    //define if the memory is erasable.
    private boolean isErasable;

    //defining her performance
    private double accessTime, cycleTime, transferRate;

    //defining the size of the memory
    private int size;



    public Memory(MemoryLocation location, int capacity, StorageType storageType, TransferUnit transferUnit, PhysicalType physicalType, boolean isVolatile, boolean isErasable, double accessTime, double cycleTime, double transferRate, int size) {
        this.location = location;
        this.capacity = capacity;
        this.storageType = storageType;
        this.transferUnit = transferUnit;
        this.physicalType = physicalType;
        this.isVolatile = isVolatile;
        this.isErasable = isErasable;
        this.accessTime = accessTime;
        this.cycleTime = cycleTime;
        this.transferRate = transferRate;
        this.size = size;
    }

    public long getSysID() {
        return sysID;
    }

    public void setSysID(long sysID) {
        this.sysID = sysID;
    }

    public MemoryLocation getLocation() {
        return location;
    }

    public void setLocation(MemoryLocation location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public StorageType getStorageType() {
        return storageType;
    }

    public void setStorageType(StorageType storageType) {
        this.storageType = storageType;
    }

    public TransferUnit getTransferUnit() {
        return transferUnit;
    }

    public void setTransferUnit(TransferUnit transferUnit) {
        this.transferUnit = transferUnit;
    }

    public PhysicalType getPhysicalType() {
        return physicalType;
    }

    public void setPhysicalType(PhysicalType physicalType) {
        this.physicalType = physicalType;
    }

    public boolean isVolatile() {
        return isVolatile;
    }

    public void setVolatile(boolean aVolatile) {
        isVolatile = aVolatile;
    }

    public boolean isErasable() {
        return isErasable;
    }

    public void setErasable(boolean erasable) {
        isErasable = erasable;
    }

    public double getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(double accessTime) {
        this.accessTime = accessTime;
    }

    public double getCycleTime() {
        return cycleTime;
    }

    public void setCycleTime(double cycleTime) {
        this.cycleTime = cycleTime;
    }

    public double getTransferRate() {
        return transferRate;
    }

    public void setTransferRate(double transferRate) {
        this.transferRate = transferRate;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    enum StorageType{
        WORDS,
        BYTES;
    }

    enum MemoryLocation{
        INTERNAL,
        EXTERNAL;
    }

    enum TransferUnit{
        SEQUENTIAL,
        DIRECT,
        RANDOM,
        ASSOCIATIVE;
    }

    enum PhysicalType{
        SEMICONDUCTOR,
        MAGNETIC,
        OPTICAL,
        MAGNETO_OPTICAL;
    }


}
