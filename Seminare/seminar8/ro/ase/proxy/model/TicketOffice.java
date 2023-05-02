package ro.ase.proxy.model;

public class TicketOffice implements ITicketOffice {

	@Override
	public void sellTicket(Client client) {
		// TODO Auto-generated method stub
		System.out.println("Ticket was sold to " + client.getName());
	}

}
