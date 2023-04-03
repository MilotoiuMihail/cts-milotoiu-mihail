package ro.ase.prototype.model;

public class Client implements AbstractPrototype{
	private String clientName;
	private String phoneNumber;
	private String email;
	
	private Client() {
		
	}
	
	public Client(String clientName, String phoneNumber, String email) {
		if(clientName.length()>=3) {
			this.clientName = clientName;			
		}
		else {
			throw new IllegalArgumentException();
		}
		this.phoneNumber = phoneNumber;
		if(email.contains("@")) {
			this.email = email;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	public AbstractPrototype createDeepCopy() {
		Client client=new Client();
		client.clientName=this.clientName;
		client.phoneNumber=this.phoneNumber;
		client.email=this.email;
		return client;
		
	}

	@Override
	public AbstractPrototype createCopy() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (AbstractPrototype)this.clone();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [clientName=");
		builder.append(clientName);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

}
