
public class TicketsMain {

	public static void main(String[] args) {
		SportTicket st1 = new SportTicket("Allianz Arena");
		st1.output();
		SportTicket st2 = new SportTicket("Tivoli Stadion", "FCW vs FCB");
		st2.output();
		ConcertTicket ct1 = new ConcertTicket("Zenith Kulturh.", "Shindy Konzert", "22.02.2020");
		ct1.output();
		ConcertTicket ct2 = new ConcertTicket("VAZ Hafen", "Genetikk", "10.02.2020", 70);
		ct2.output();
		TheaterTicket tt1 = new TheaterTicket();
		tt1.output();
		TheaterTicket tt2 = new TheaterTicket("Theater Munich");
		tt2.output();
	}

}
