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

}
