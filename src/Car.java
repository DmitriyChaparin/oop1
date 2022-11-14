public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;
//    Если передана пустая строка или null в поля модель, марка машины и страна сборки, то значение по умолчанию — default.
//    Если переданный объем двигателя ≤=0, то значение по умолчанию — 1,5 л.
//    Если передана пустая строка или null, то цвет кузова по умолчанию — белый.
//    Если год производства ≤0, то значение по умолчанию — 2000.
    Car(String brand, String model, double engineVolume, String color, String country, int year) {
        this.brand = brand;
        if (model == null || model.trim().isEmpty()){
            this.model = "default";
        }else {
            this.model = model;
        }
        if (engineVolume <= 0){
            this.engineVolume = 1.5;
        }else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.trim().isEmpty()){
            this.color = "белый";
        }else {
            this.color = color;
        }
        this.country = country;
        if (year <=0){
            this.year = 2000;
        }else {
            this.year = year;
        }
    }

    @Override
    public String toString() {
        return brand + " " + model + ", сборка — " + country + ", цвет кузова — " + color + ", объем двигателя — " + engineVolume + " л, год выпуска — " + year + " год.";
    }
}
