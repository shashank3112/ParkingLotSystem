package models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private Date exitTime;
    private int amount;
    private Gate gate;
    private Operator operator;
    private Ticket ticket;
    //A bill can be paid via multiple payments - for ex i pay 50 rs cash and 50 UPI
    private List<Payment> payments;

}
