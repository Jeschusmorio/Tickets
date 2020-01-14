
public class ConcertTicket implements Ticket {
	private String eventLocation;
	private String eventName;
	private String date;
	private double basicPrice;
	private double ticketPrice;
	
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
	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}
	public String getEventLocation() {
		return eventLocation;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventName() {
		return eventName;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDate() {
		return date;
	}
	public void setBasicPrice(double basicPrice) {
		this.basicPrice = basicPrice;
	}
	public double getBasicPrice() {
		return basicPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void output() {
		System.out.println();
		System.out.println("+-----------------------------------------------v-------------+");
		System.out.println("|\t\t"+eventLocation+"\t\t\t|             |");
		System.out.println("|\t\t"+eventName+"\t\t\t|             |");
		System.out.println("+-----------------------+-----------------------+             |");
		System.out.println("|\t"+date+"\t|\t"+ticketPrice+" €\t\t|             |");
		System.out.println("+-----------------------------------------------^-------------+");
	}
}
