
public class SportTicket extends Ticket {
	public SportTicket(String eventLocation, String eventName, String date, double basicPrice) {
		setEventLocation(eventLocation);
		setEventName(eventName);
		setDate(date);
		setBasicPrice(basicPrice);
		calculateTicketPrice();
	}
	public SportTicket(String eventLocation, String eventName, String date) {
		this(eventLocation, eventName, date, 50);
	}
	public SportTicket(String eventLocation, String eventName) {
		this(eventLocation, eventName, "01.01.2020", 50);
	}
	public SportTicket(String eventLocation) {
		this(eventLocation, "Event Name", "01.01.2020", 50);
	}
	public SportTicket() {
		this("Event Location", "Event Name", "01.01.2020", 50);
	}
	public void calculateTicketPrice() {
		if (eventLocation == "Tivoli Stadion") {
			ticketPrice = basicPrice * 0.5;
		}
		else if (eventLocation == "Allianz Arena") {
			ticketPrice = basicPrice * 1.5;
		}
		else {
			ticketPrice = basicPrice;
		}
	}
}
