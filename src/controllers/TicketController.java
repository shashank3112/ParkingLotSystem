package controllers;

import dtos.IssueTicketRequestDTO;
import dtos.IssueTicketResponseDTO;
import dtos.ResponseStatus;
import models.ParkingLot;
import models.Ticket;
import services.TicketService;

public class TicketController {
    // controller will only receive request DTO and will only return response DTO
    private TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO){
        IssueTicketResponseDTO response = new IssueTicketResponseDTO();

        //request dto object can have a lot of other details as well
        //so we don't send the entire object internally to issueTicket method
        try {
            Ticket ticket = ticketService.issueTicket(requestDTO.getGateId(),
                    requestDTO.getVehicleNumber(),
                    requestDTO.getVehicleType(),
                    requestDTO.getOwnerName()
            );

            response.setTicket(ticket);
            response.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception ex){
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setFailureMessage(ex.getMessage());
        }
        return response;
    }
}

//It's not a good practise to send models(in this case Ticket) to client directly
//hence we create DTOS - Data Transfer Objects
