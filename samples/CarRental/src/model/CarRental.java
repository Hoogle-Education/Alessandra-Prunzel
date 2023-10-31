package model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class CarRental {

    private LocalDateTime start;
    private LocalDateTime finish;
    private Vehicle vehicle;
    private Invoice invoice;

    private CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    // "singleton" strategy
    public static CarRental of(String vehicleModel, String startMoment, String finishMoment){
        Vehicle vehicle = new Vehicle(vehicleModel);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
        LocalDateTime start = LocalDateTime.parse(startMoment, formatter);
        LocalDateTime finish = LocalDateTime.parse(finishMoment, formatter);
        return new CarRental(start, finish, vehicle);
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void produceInvoice(double basicPayment, double tax) {
        this.invoice = new Invoice(basicPayment, tax);
    }

    public Duration getDuration() {
        return Duration.between(start, finish);
    }
}
