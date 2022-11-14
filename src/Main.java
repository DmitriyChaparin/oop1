public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada", "Granta", 1.7, "желтый", "Россия",2015);
        Car audiA8 = new Car("Audi", "A8", 3.0, "черный", "Германия",2020);
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "черный", "Германия",2021);
        Car kiaSportage = new Car("KIA", "Sportage 4-го поколения", 2.4, "красный", "Южная Корея",2018);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "оранжевый", "Южная Корея",2016);
        System.out.println(ladaGranta.toString());
        System.out.println(audiA8.toString());
        System.out.println(bmwZ8.toString());
        System.out.println(kiaSportage.toString());
        System.out.println(hyundaiAvante.toString());

    }

}