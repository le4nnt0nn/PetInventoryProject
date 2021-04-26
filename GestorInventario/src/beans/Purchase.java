package beans;

import java.sql.Date;

public class Purchase {

	private int idPurchase;
    private int idClient;
    private int idPet;
    private Date datePurchase;
    private double totalPrice;

    public Purchase() {}

    public Purchase(int idPurchase, int idClient, int idPet, Date datePurchase, double totalPrice) {
        this.idPurchase = idPurchase;
        this.idClient = idClient;
        this.idPet = idPet;
        this.datePurchase = datePurchase;
        this.totalPrice = totalPrice;
    }

    public int getIdPurchase() {
        return idPurchase;
    }

    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public Date getDatePurchase() {
        return datePurchase;
    }

    public void setDatePurchase(Date datePurchase) {
        this.datePurchase = datePurchase;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
