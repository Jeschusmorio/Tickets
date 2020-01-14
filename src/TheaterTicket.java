
public class TheaterTicket implements Ticket {
	private String eventLocation;
	private String eventName;
	private String date;
	private double basicPrice;
	private double ticketPrice;
	
	public TheaterTicket(String eventLocation, String eventName, String date, double basicPrice) {
		setEventLocation(eventLocation);
		setEventName(eventName);
		setDate(date);
		setBasicPrice(basicPrice);
		calculateTicketPrice();
	}
	public TheaterTicket(String eventLocation, String eventName, String date) {
		this(eventLocation, eventName, date, 20);
	}
	public TheaterTicket(String eventLocation, String eventName) {
		this(eventLocation, eventName, "01.01.2020", 20);
	}
	public TheaterTicket(String eventLocation) {
		this(eventLocation, "Event Name", "01.01.2020", 20);
	}
	public TheaterTicket() {
		this("Event Location", "Event Name", "01.01.2020", 20);
	}
	public void calculateTicketPrice() {
		if (getEventLocation() == "Landestheater") {
			setTicketPrice(getBasicPrice() * 0.5);
		}
		else if (getEventLocation() == "Theater Munich") {
			setTicketPrice(getBasicPrice() * 1.5);
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
