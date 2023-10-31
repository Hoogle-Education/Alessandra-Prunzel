package models.cars;

public class Corolla implements CarFunctionalities {

    private String plate;
    private String year;

    public Corolla(String plate, String year) {
        this.plate = plate;
        this.year = year;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("Corolla is turned on");
    }

    public void turnOff() {
        System.out.println("Corolla is turned off");
    }
}
