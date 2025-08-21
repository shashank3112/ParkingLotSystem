package controllers;

import dtos.IssueTicketRequestDTO;
import dtos.IssueTicketResponseDTO;
import dtos.ResponseStatus;
import models.ParkingLot;
import models.Ticket;
import services.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO){
        IssueTicketResponseDTO response = new IssueTicketResponseDTO();
        Ticket ticket = ticketService.issueTicket(requestDTO.getGateId() , requestDTO.getVehicleNumber());
        response.setTicketId(ticket.getId());
        response.setResponseStatus(ResponseStatus.SUCCESS);
        return null;
    }
}

//It's not a good practise to send models(in this case Ticket) to client directly
//hence we create DTOS - Data Transfer Objects
