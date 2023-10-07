package fruit_box;

import java.util.Arrays;

public class  Main {
    public static void main(String[] args) {
        // Створимо коробки з фруктами
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        // Виведемо вагу коробок
        System.out.println("Вага коробки з яблуками 1: " + appleBox1.getWeight());
        System.out.println("Вага коробки з яблуками 2: " + appleBox2.getWeight());
        Box<Apple> OrangeBox;
        System.out.println("Вага коробки з апельсинами: " + orangeBox.getWeight());

        // Порівняння коробок
        Box<Orange> appleBox = null;
        for (String s : Arrays.asList("Порівняння коробок appleBox1 і appleBox2: " + appleBox1.compare(appleBox), "Порівняння коробок appleBox1 і orangeBox: " + appleBox1.compare(orangeBox))) {
            System.out.println(s);
        }

        // Об'єднання коробок
        appleBox1.merge(appleBox2);
        System.out.println("Вага коробки після об'єднання: " + appleBox1.getWeight());
    }
}