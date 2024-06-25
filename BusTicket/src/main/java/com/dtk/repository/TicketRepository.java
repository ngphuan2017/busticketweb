/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dtk.repository;

import com.dtk.pojo.Seat;
import com.dtk.pojo.Ticket;
import com.dtk.pojo.TicketDetail;
import com.dtk.pojo.User;
import java.util.List;
import java.util.Map;

/**
 *
 * @author GIGABYTE
 */
public interface TicketRepository {
    List<TicketDetail> getTickets(Map<String, String> params);
    List<Ticket> getTicketBook(Map<String, String> params);
    List<Ticket> getTicketBookByIDUser(int idUser);
    Ticket getTicketBookByID(int id);
    List<TicketDetail> getTicketDeatilByIDTrip(int idTrip);
    List<TicketDetail> getTicketDetailByIDTicket(int idTicket);
    List<TicketDetail> getTicketDetailByIDUserLogin(int idUser);
    User addUserCustomer(String fullname, String gender, String address, String phone, String email);
    Ticket addTicket(Map<String, String> params, int idTrip);
    TicketDetail addSeatTicketDetail(Ticket ticket, Seat seat);
    boolean xacNhanTicket(int idTicket);
}
