package repositories;

import models.Gate;
import models.ParkingLot;

import java.util.TreeMap;

public class ParkingLotRepository {
    // we are not storing data in database like Mysql in this project
    // hence we are using treemap as it is closer to actual database mysql
    private TreeMap<Integer , ParkingLot> parkingLots = new TreeMap<>();

    public ParkingLot findParkingLotByGate(Gate gateToCheck){
        for(ParkingLot parkingLot: parkingLots.values()){
            for(Gate gate: parkingLot.getEntryGates()){
                if(gate.getId() == gateToCheck.getId()){
                    return parkingLot;
                }
            }
        }
        return null;
    }

    public ParkingLot findParkingLotById(int parkingLotId){
        if(parkingLots.containsKey(parkingLotId)){
            return parkingLots.get(parkingLotId);
        }
        return null;
    }
}
