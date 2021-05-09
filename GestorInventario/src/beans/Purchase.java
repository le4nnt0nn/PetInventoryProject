package beans;

import java.util.Date;

public class Purchase {

	private int idPurchase;
    private int idUser;
    private int idPet;
    private String datePurchase;
    private double totalPrice;

    public Purchase() {}

    public Purchase(int idPurchase, int idUser, int idPet, String datePurchase, double totalPrice) {
        this.idPurchase = idPurchase;
        this.idUser = idUser;
        this.idPet = idPet;
        this.datePurchase = datePurchase;
        this.totalPrice = totalPrice;
    }
    
    public Purchase(int idUser, int idPet, String datePurchase, double totalPrice) {
        this.idUser = idUser;
        this.idPet = idPet;
        this.datePurchase = datePurchase;
        this.totalPrice = totalPrice;
    }
    
    public Purchase(int idPet, String datePurchase, double totalPrice) {
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

    public int getIdUser() {
        return idUser;
    }

    public void setIdClient(int idUser) {
        this.idUser = idUser;
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public String getDatePurchase() {
        return datePurchase;
    }

    public void setDatePurchase(String datePurchase) {
        this.datePurchase = datePurchase;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
