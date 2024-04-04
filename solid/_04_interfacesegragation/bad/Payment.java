package solid._04_interfacesegragation.bad;

public interface Payment {
    public void payMoney();
    
    public void getScratchCard();
    
    // BAD this is not payment
    public void getCashBackAsCreditBalance();
}
