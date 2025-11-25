// // Parent class
// class Animal {
//     String name;

//     public void eat() {
//         System.out.println(name + " is eating");
//     }
// }

// // Child class
// class Dog extends Animal {
//     public void bark() {
//         System.out.println(name + " is barking");
//     }
// }

// // Main class
// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.name = "Buddy";  // inherited field from Animal
//         d.eat();           // inherited method from Animal
//         d.bark();          // Dog's own method
//     }
// }


// Parent class
// class Animal {
//     String name;

//     // Parent constructor
//     public Animal(String name) {
//         this.name = name;
//     }

//     public void eat() {
//         System.out.println(name + " is eating");
//     }
// }

// // Child class
// class Dog extends Animal {
//     String breed;

//     // Child constructor calls parent constructor using super
//     public Dog(String name, String breed) {
//         super(name); // calls Animal(String name)
//         this.breed = breed;
//     }

//     public void bark() {
//         System.out.println(name + " the " + breed + " is barking");
//     }
// }

// // Main class
// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog("Buddy", "Labrador");
//         d.eat();   // inherited method from Animal
//         d.bark();  // Dog's own method
//     }
// }


// Parent class
class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void vehicleInfo() {
        System.out.println("The brand is " + brand + ". The year is " + year);
    }
}

// Child class Car
class Car extends Vehicle {
    int seats;

    public Car(String brand, int year, int seats) {
        super(brand, year);
        this.seats = seats;
    }

    @Override
    public void vehicleInfo() {
        System.out.println("The brand is " + brand + ". The year is " + year + ". The seats are " + seats);
    }
}

// Child class Bike
class Bike extends Vehicle {
    String type;

    public Bike(String brand, int year, String type) {
        super(brand, year);
        this.type = type;
    }

    @Override
    public void vehicleInfo() {
        System.out.println("The brand is " + brand + ". The year is " + year + ". The type is " + type);
    }
}

// Main class
class Main {
    public static void main(String[] args) {

        // Create a Vehicle
        Vehicle v = new Vehicle("ABC", 2025);
        v.vehicleInfo();

        // Create a Car
        Car c = new Car("Toyota", 2023, 5);
        c.vehicleInfo();

        // Create a Bike
        Bike b = new Bike("Yamaha", 2022, "Sports");
        b.vehicleInfo();
    }
}
