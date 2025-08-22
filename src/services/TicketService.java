package services;

import models.*;
import repositories.GateRepository;
import repositories.VehicleRepository;
import strategies.RandomSlotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;

    public TicketService(GateRepository gateRepository , VehicleRepository vehicleRepository){
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public Ticket issueTicket(int gateId ,
                              String vehicleNumber,
                              VehicleType vehicleType,
                              String ownerName) throws Exception {
        // 1. create a ticket object ->

        Ticket ticket  = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> gateOptional = gateRepository.findGateById(gateId);
        if(gateOptional.isEmpty()){
            throw new Exception("Gate not found");
        }
        Gate gate = gateOptional.get();
        ticket.setGate(gate);
        ticket.setOperator(gate.getOperator());

        Optional<Vehicle> vehicleOptional = vehicleRepository.findVehicleByNumber(vehicleNumber);
        Vehicle vehicle;
        if(vehicleOptional.isEmpty()){
            vehicle = new Vehicle();
            vehicle.setLicensePlateNumber(vehicleNumber);
            vehicle.setOwnerName(ownerName);
            vehicle.setVehicleType(vehicleType);
            vehicleRepository.save(vehicle);
        }
        else{
            vehicle = vehicleOptional.get();
        }

        ticket.setVehicle(vehicle);

        //2. assign the slot ->
        RandomSlotAssignmentStrategy randomSlotAssignmentStrategy = new RandomSlotAssignmentStrategy();
        ParkingSlot parkingSlot = randomSlotAssignmentStrategy.assignSlot();

        return ticket;
    }
}
