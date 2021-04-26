package beans;

import java.sql.Date;

public class Client {
	
	private int idClient;
	private String clientName;
	private String lastName;
	private String address;
	private Date birth;
	
	public Client() {}
	public Client(int idClient, String clientName, String lastName, String address, Date birth) {
        this.idClient = idClient;
        this.clientName = clientName;
        this.lastName = lastName;
        this.address = address;
        this.birth = birth;
    }


    public int getIdClient() {
        return idClient;
    }


    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }


    public String getClientName() {
        return clientName;
    }


    public void setClientName(String clientName) {
        this.clientName = clientName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public Date getBirth() {
        return birth;
    }


    public void setBirth(Date birth) {
        this.birth = birth;
    }
	
}
