import jakarta.xml.ws.Endpoint;
import ws.BankService;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8080/bank";
        Endpoint.publish(url, new BankService());
        System.out.println("BankService is published on " + url);
    }
}
