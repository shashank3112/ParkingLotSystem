package strategies;

import models.ParkingLot;
import models.ParkingSlot;
import models.VehicleType;

public interface SlotAssignmentStrategy {
    public ParkingSlot assignSlot(ParkingLot parkingLot , VehicleType vehicleType );
}
