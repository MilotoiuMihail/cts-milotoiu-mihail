package ro.ase.chainOfResponsability.main;

import ro.ase.chainOfResponsability.model.Client;
import ro.ase.chainOfResponsability.model.EmailNotificator;
import ro.ase.chainOfResponsability.model.Manager;
import ro.ase.chainOfResponsability.model.Notificare;
import ro.ase.chainOfResponsability.model.SMSNotificator;

public class Main {
	public static void main(String[] args) {
		Notificare manager = new Manager(null);
		Notificare email = new EmailNotificator(manager);
		Notificare sms = new SMSNotificator(null);		
		sms.setSuccesor(email);
		
		Client client1=new Client("Alex", "0781394012", "alex@gmail.com");
		Client client2=new Client("Andrei", null, "andrei@gmail.com");
		Client client3=new Client("Ana", "0752194012", null);
		Client client4=new Client("Vasile", null, null);
		
		sms.trimiteNotificare(client2, "mesaj");
		sms.trimiteNotificare(client3, "ceva");
		sms.trimiteNotificare(client4, "vedem");
		sms.trimiteNotificare(client1, "hai");
	}
}
