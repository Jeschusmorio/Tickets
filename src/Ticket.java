
public interface Ticket {
	
	void calculateTicketPrice();
	
	void setEventLocation(String eventLocation);
	String getEventLocation();
	
	void setEventName(String eventName);
	String getEventName();
	
	void setDate(String date);
	String getDate();
	
	void setBasicPrice(double basicPrice);
	double getBasicPrice();
	
	void setTicketPrice(double ticketPrice);
	double getTicketPrice();
	
	void output();
}
