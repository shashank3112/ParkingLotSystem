package dtos;

import models.VehicleType;

public class IssueTicketRequestDTO {
    private int gateId;
    private String vehicleNumber;
    private VehicleType vehicleType;
    private String ownerName;

    public int getGateId() {
        return gateId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setGateId(int gateId) {
        this.gateId = gateId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}
