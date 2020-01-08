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
		shop.add(st1);
		shop.add(st2);
		shop.add(st3);
		shop.add(ct1);
		shop.add(ct2);
		shop.add(tt1);
		shop.add(tt2);
		
		System.out.println("Anzahl der Tickets in der Liste: "+numberOfTickets(shop));
		/*for (int i = 0; i < shop.size(); i++) {
			Ticket ticket = shop.get(i);
			double ticketPrice = ticket.getTicketPrice();
			System.out.println(ticketPrice);
		}*/
		System.out.println("\nGünstigstes Ticket:");
		cheapestTicket(shop);
		System.out.println("\nTeuerstes Ticket:");
		mostExpensiveTicket(shop);
		
		System.out.println("\nTickets für das Event 'FCW vs FCB':");
		ArrayList<Ticket> FCWvsFCB = getTicketsOfSameEvent(shop, "FCW vs FCB");
		System.out.println("\nAnzahl der Tickets für das Event 'FCW vs FCB': "+numberOfTickets(FCWvsFCB));
		System.out.println("\nGünstigstes 'FCW vs FCB' Ticket:");
		cheapestTicket(FCWvsFCB);
		System.out.println("\nTeuerstes 'FCW vs FCB' Ticket:");
		mostExpensiveTicket(FCWvsFCB);
	}
	
	public static void cheapestTicket(ArrayList<Ticket> shop) {
		Ticket cheapestTicket = shop.get(0);
		for (int i = 1; i < shop.size(); i++) { //mit 1 starten, weil wir mit einer vorherigen Karte vergleichen
			Ticket currentTicket = shop.get(i);
			double cheapestTicketPrice = cheapestTicket.getTicketPrice();
			double currentTicketPrice = currentTicket.getTicketPrice();
			if (currentTicketPrice < cheapestTicketPrice) {
				cheapestTicket = shop.get(i);
			}
		}
		cheapestTicket.output();
	}
	public static void mostExpensiveTicket(ArrayList<Ticket> shop) {
		Ticket mostExpensiveTicket = shop.get(0);
		for (int i = 1; i < shop.size(); i++) { //mit 1 starten, weil wir mit einer vorherigen Karte vergleichen
			Ticket currentTicket = shop.get(i);
			double mostExpensiveTicketPrice = mostExpensiveTicket.getTicketPrice();
			double currentTicketPrice = currentTicket.getTicketPrice();
			if (currentTicketPrice > mostExpensiveTicketPrice) {
				mostExpensiveTicket = shop.get(i);
			}
		}
		mostExpensiveTicket.output();
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
				event.add(currentTicket);
			}
		}
		return event;
	}
}
