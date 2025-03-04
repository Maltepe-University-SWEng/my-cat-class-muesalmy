package tr.edu.maltepe.oop;

public class Main {
    public static void main(String[] args) {
        // İki farklı Cat nesnesi oluşturuluyor
        Cat cat1 = new Cat("Tekir", 3);
        Cat cat2 = new Cat("Minnak", 2);

        // Her iki nesne için meow metodu çağrılıyor
        cat1.meow();
        cat2.meow();
    }
}

