package models;

import java.util.List;

public class ParkingSlot extends BaseModel{
    private String slotNumber;
    private ParkingSlotStatus parkingSlotStatus;
    private List<SupportedVehicleType> vehicleTypes;
    private ParkingFloor parkingFloor;
}
