package ro.ase.proxy.model;

public class Proxy implements ITicketOffice {
	private ITicketOffice office;

	public Proxy(ITicketOffice office) {
		super();
		this.office = office;
	}

	@Override
	public void sellTicket(Client client) {
		// TODO Auto-generated method stub
		if (client.getAge() >= 15) {
			this.office.sellTicket(client);
		} else {
			System.out.println("Client " + client.getName() + " is too young.");
		}
	}

}
