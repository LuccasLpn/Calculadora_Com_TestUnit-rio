import service.Service;
import utils.Utils;

public class App {
    public static void main(String[] args) {
        Utils utils = new Utils();
        Service service = new Service();

        utils.primeiraOpcao();
        service.testing();
    }
}
