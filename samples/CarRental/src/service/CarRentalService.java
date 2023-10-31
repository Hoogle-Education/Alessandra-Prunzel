package service;

import model.CarRental;
import model.Invoice;

import java.time.Duration;

public class CarRentalService {

    private final double pricePerHour;
    private final double pricePerDay;
    TaxService taxService;
    private final double MINUTES_IN_HOUR = 60.0;
    private final double HOURS_IN_DAY = 24.0;

    public CarRentalService(double pricePerHour, double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        Duration duration = carRental.getDuration();

        // pegando a hora completa a partir dos minutos quebrados
        int hoursPassed = (int) Math.ceil((double)duration.toMinutes() / MINUTES_IN_HOUR);
        int daysPassed = (int) Math.ceil((double)duration.toHours() / HOURS_IN_DAY);

        double basicPayment, tax;

        if(hoursPassed <= 12)
            basicPayment = hoursPassed * pricePerHour;
        else
            basicPayment = daysPassed * pricePerDay;

        tax = taxService.calculateTax(basicPayment);

        // carRental.setInvoice(new Invoice(basicPayment, tax));
        carRental.produceInvoice(basicPayment, tax);
    }
}
