package models;

import java.util.List;

public class ParkingFloor extends  BaseModel{
    private String floorNumber;
    private List<ParkingSlot> parkingSlots;
    private List<SupportedVehicleType> VehicleTypes;
    private ParkingSlotStatus parkingSlotStatus;
    //private List<ParkingSlot> availableSlots;


    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public List<SupportedVehicleType> getVehicleTypes() {
        return VehicleTypes;
    }

    public void setVehicleTypes(List<SupportedVehicleType> vehicleTypes) {
        VehicleTypes = vehicleTypes;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }
}
