
public class ConcertTicket extends Ticket {
	public ConcertTicket(String eventLocation, String eventName, String date, double basicPrice) {
		setEventLocation(eventLocation);
		setEventName(eventName);
		setDate(date);
		setBasicPrice(basicPrice);
		calculateTicketPrice();
	}
	public ConcertTicket(String eventLocation, String eventName, String date) {
		this(eventLocation, eventName, date, 100);
	}
	public ConcertTicket(String eventLocation, String eventName) {
		this(eventLocation, eventName, "01.01.2020", 100);
	}
	public ConcertTicket(String eventLocation) {
		this(eventLocation, "Event Name", "01.01.2020", 100);
	}
	public ConcertTicket() {
		this("Event Location", "Event Name", "01.01.2020", 100);
	}
	public void calculateTicketPrice() {
		if (getEventLocation() == "VAZ Hafen") {
			setTicketPrice(getBasicPrice() * 0.75);
		}
		else if (getEventLocation() == "Zenith Kulturh.") {
			setTicketPrice(getBasicPrice() * 1.25);
		}
		else {
			setTicketPrice(getBasicPrice());
		}
	}
}
