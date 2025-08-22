package models;

import java.util.List;

public class ParkingLot extends BaseModel{
    private String parkingLotName;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> entryGates;
    private List<Gate> exitGates;
    private ParkingLotStatus parkingLotStatus;
    private List<SupportedVehicleType> vehicleTypes;
    private int parkingLotcapacity;
    private String parkingLotAdress;

    public String getParkingLotName() {
        return parkingLotName;
    }

    public void setParkingLotName(String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getEntryGates() {
        return entryGates;
    }

    public void setEntryGates(List<Gate> entryGates) {
        this.entryGates = entryGates;
    }

    public List<Gate> getExitGates() {
        return exitGates;
    }

    public void setExitGates(List<Gate> exitGates) {
        this.exitGates = exitGates;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<SupportedVehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<SupportedVehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public int getParkingLotcapacity() {
        return parkingLotcapacity;
    }

    public void setParkingLotcapacity(int parkingLotcapacity) {
        this.parkingLotcapacity = parkingLotcapacity;
    }

    public String getParkingLotAdress() {
        return parkingLotAdress;
    }

    public void setParkingLotAdress(String parkingLotAdress) {
        this.parkingLotAdress = parkingLotAdress;
    }
}
