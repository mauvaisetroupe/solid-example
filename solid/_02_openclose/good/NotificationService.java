package solid._02_openclose.good;

public interface NotificationService{
    public void sendOTP(String medium);
    public void sendTransactionNotification(String medium);
}
