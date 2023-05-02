package ro.ase.proxy.main;

import ro.ase.proxy.model.Client;
import ro.ase.proxy.model.ITicketOffice;
import ro.ase.proxy.model.Proxy;
import ro.ase.proxy.model.TicketOffice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client1 = new Client(15, "Mihai");
		Client client2 = new Client(10, "Ion");

		ITicketOffice office = new TicketOffice();
		office.sellTicket(client1);
		office.sellTicket(client2);

		ITicketOffice proxyOffice = new Proxy(office);
		proxyOffice.sellTicket(client1);
		proxyOffice.sellTicket(client2);
	}

}
