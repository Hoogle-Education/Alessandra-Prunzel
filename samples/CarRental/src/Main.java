import model.CarRental;
import service.BrazilTaxService;
import service.CarRentalService;

public class Main {
    public static void main(String[] args) {
        CarRental meuAluguel = CarRental.of("Civic", "30/10/23 15:00", "31/10/23 16:00");
        CarRental meuAluguel2 = CarRental.of("Corsa", "31/10/23 15:00", "31/10/23 16:30");

        CarRentalService service = new CarRentalService(10.0, 50.0, new BrazilTaxService());

        service.processInvoice(meuAluguel);
    }
}