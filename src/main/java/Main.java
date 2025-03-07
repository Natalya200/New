import org.example.Animal;
import org.example.Shape;

public class Main {
        public static void main(String[] args) {
            Dog dog1 = new Dog("Бобик");
            Cat cat1 = new Cat("Мурка");
            Cat cat2 = new Cat("Умка");

            dog1.run(150);
            dog1.swim(5);

            cat1.run(100);

            System.out.println("Общее количество животных: " + Animal.getAnimalCount());
            System.out.println("Количество котов: " + Cat.getCatCount());
        }
    {

        Shape circle = new Circle(5, "Красный", "Черный");
        Shape square = new Square(10, 8, "синий", "жёлтый");
        Shape triangle = new Triangle(6, 2,4, "коричневый", "розовый");

        System.out.println("Круг:" );
        circle.printInfo();


    }
    }
