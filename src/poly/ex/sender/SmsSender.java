package poly.ex.sender;

public class SmsSender implements Sender{
    public void sendMessage(String message) {
        System.out.println("SMS를 발송합니다: " + message);
    }
}
