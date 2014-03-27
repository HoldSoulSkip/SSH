package hhjt.service;

import java.util.Date;
import java.util.List;

import hhjt.bean.Ticket;


public interface TicketService {
	boolean addTicket(Ticket instance);
	boolean deleteTicket(Ticket instance);
	Ticket alterTicket(Ticket instance);
	Ticket findTicketById(Integer id);
	List<Ticket> findTicketByPrice(Double price);
	List<Ticket> findTicketByType(String ticketType);
	List<Ticket> findTicketByBeginTime(Date dateTime);
	List<Ticket> findTicketByDeadline(Date dateTime);
	List<Ticket> findTicketByPriceAndBeginTime(Double price,Date begin);
	List<Ticket> findTicketByPriceAndDeadline(Double price,Date deadline);
	List<Ticket> findTicketByBeginTimeAndDeadline(Date begin,Date deadline);
	List<Ticket> findTicketByPriceAndTime(Double price,Date begin,Date deadline);
	List<Ticket> findTicketByTypeAndTime(String ticketType,Date begin,Date deadline);	
}
