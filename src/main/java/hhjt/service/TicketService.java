package hhjt.service;

import java.util.List;

import hhjt.bean.Ticket;


public interface TicketService {
	boolean addTicket(Ticket instance);
	boolean deleteTicket(Ticket instance);
	Ticket alterTicket(Ticket instance);
	Ticket findTicketById(Integer id);
	List<Ticket> findTicketByPrice(Double price);
	List<Ticket> findTicketByType(String ticketType);
	List<Ticket> findTicketByBeginTime(String dateTime);
	List<Ticket> findTicketByDeadline(String dateTime);
	List<Ticket> findTicketByPriceAndBeginTime(Double price,String begin);
	List<Ticket> findTicketByPriceAndDeadline(Double price,String deadline);
	List<Ticket> findTicketByBeginTimeAndDeadline(String begin,String deadline);
	List<Ticket> findTicketByPriceAndTime(Double price,String begin,String deadline);
	List<Ticket> findTicketByTypeAndTime(String ticketType,String begin,String deadline);
	List<Ticket> findTicketByTime(String dateTime);
}
