import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", 20);
        Plate plate = new Plate(100);
        Cat[] cats = {new Cat("Мурзик", 30),new Cat("Тиша", 40),new Cat("Том", 40)};

        System.out.println(plate);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].catInfo();
        }
        plate.increaseFood(50);
        System.out.println(plate);






    }

}

