package models;

import java.util.List;

public class ParkingFloor extends  BaseModel{
    private String floorNumber;
    private List<ParkingSlot> parkingSlots;
    private List<SupportedVehicleType> VehicleTypes;
    private ParkingSlotStatus parkingSlotStatus;
    //private List<ParkingSlot> availableSlots;

}
