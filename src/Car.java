public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, double engineVolume, String color, String country, int year) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.country = country;
        this.year = year;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", сборка — " + country + ", цвет кузова — " + color + ", объем двигателя — " + engineVolume + " л, год выпуска — " + year + " год.";
    }
}
