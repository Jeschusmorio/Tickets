import java.util.ArrayList;
public class TicketsMain {

	public static void main(String[] args) {
		SportTicket st1 = new SportTicket("Allianz Arena");
		SportTicket st2 = new SportTicket("Tivoli Stadion", "FCW vs FCB");
		SportTicket st3 = new SportTicket("Tivoli Stadion", "FCW vs FCB", "01.01.2020", 60);
		ConcertTicket ct1 = new ConcertTicket("Zenith Kulturh.", "Shindy Konzert", "22.02.2020");
		ConcertTicket ct2 = new ConcertTicket("VAZ Hafen", "Genetikk", "10.02.2020", 70);
		TheaterTicket tt1 = new TheaterTicket();
		TheaterTicket tt2 = new TheaterTicket("Theater Munich");
		/*
		st1.output();
		st2.output();
		ct1.output();
		ct2.output();
		tt1.output();
		tt2.output();
		*/
		ArrayList<Ticket> shop = new ArrayList<Ticket>();
		bestellen(shop, st1);
		bestellen(shop, st2);
		bestellen(shop, st3);
		bestellen(shop, ct1);
		bestellen(shop, ct2);
		bestellen(shop, tt1);
		bestellen(shop, tt2);
		
		System.out.println("Anzahl der Tickets in der Liste: "+numberOfTickets(shop));
		/*for (int i = 0; i < shop.size(); i++) {
			Ticket ticket = shop.get(i);
			double ticketPrice = ticket.getTicketPrice();
			System.out.println(ticketPrice);
		}*/
		System.out.println("\nGünstigstes Ticket:");
		cheapestOrMostExpensiveTicket(shop, true);
		System.out.println("\nTeuerstes Ticket:");
		cheapestOrMostExpensiveTicket(shop, false);
		
		System.out.println("\nTickets für das Event 'FCW vs FCB':");
		ArrayList<Ticket> FCWvsFCB = getTicketsOfSameEvent(shop, "FCW vs FCB");
		System.out.println("\nAnzahl der Tickets für das Event 'FCW vs FCB': "+numberOfTickets(FCWvsFCB));
		System.out.println("\nGünstigstes 'FCW vs FCB' Ticket:");
		cheapestOrMostExpensiveTicket(FCWvsFCB, true);
		System.out.println("\nTeuerstes 'FCW vs FCB' Ticket:");
		cheapestOrMostExpensiveTicket(FCWvsFCB, false);
	}
	
	//cheap = true if cheapest Ticket is searched, false if most expensive ticket is searched
	public static void cheapestOrMostExpensiveTicket(ArrayList<Ticket> shop, boolean cheap) { 
		Ticket searchedTicket = shop.get(0);
		for (int i = 1; i < shop.size(); i++) { //mit 1 starten, weil wir mit einer vorherigen Karte vergleichen
			Ticket currentTicket = shop.get(i);
			double searchedTicketPrice = searchedTicket.getTicketPrice();
			double currentTicketPrice = currentTicket.getTicketPrice();
			if (cheap && currentTicketPrice < searchedTicketPrice) {
				searchedTicket = shop.get(i);
			}
			else if (!cheap && currentTicketPrice > searchedTicketPrice) {
				searchedTicket = shop.get(i);
			}
		}
		searchedTicket.output();
	}
	public static void bestellen(ArrayList<Ticket> shop, Ticket t) {
		shop.add(t);
	}
	public static int numberOfTickets(ArrayList<Ticket> shop) {
		return shop.size();
	}
	public static ArrayList<Ticket> getTicketsOfSameEvent(ArrayList<Ticket> shop, String eventName) {
		ArrayList<Ticket> event = new ArrayList<Ticket>();
		for (int i = 0; i < shop.size(); i++) {
			Ticket currentTicket = shop.get(i);
			String currentTicketEventName = currentTicket.getEventName();
			if (currentTicketEventName == eventName) {
				bestellen(event, currentTicket);
			}
		}
		return event;
	}
}
