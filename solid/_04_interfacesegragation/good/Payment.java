package solid._04_interfacesegragation.good;


// https://medium.com/@javatechie/solid-design-principle-java-ae96a48db97
// Interface Segregation Principle (ISP)
// This principle is the first principle that applies to Interfaces instead of classes in SOLID and it is similar to the single responsibility principle

public interface Payment {
    public void payMoney();
    
    public void getScratchCard();

}
