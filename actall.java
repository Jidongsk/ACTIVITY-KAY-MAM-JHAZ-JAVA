PART 1 ACT 1 JAVA

class Animal {
    void speak() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("The cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.speak();
        myDog.speak();
        myCat.speak();
    }
}


ACT 2


class Vehicle {
    String brand;
    int fuel;

    
    Vehicle(String brand, int fuel) {
        this.brand = brand;
        this.fuel = fuel;
    }
}


class Car extends Vehicle {
    int doors;

    
    Car(String brand, int fuel, int doors) {
        super(brand, fuel);  
        this.doors = doors;
    }

    
    void drive() {
        if (fuel > 0) {
            fuel -= 10;
            System.out.println(brand + " is driving. Remaining fuel: " + fuel);
        } else {
            System.out.println(brand + " has no fuel left!");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 50, 4);
        myCar.drive();
        myCar.drive();
    }
}

PART 2 ACT 1

class BankAccount:
    def __init__(self, balance=0):
        self.__balance = balance   # private attribute

    def deposit(self, amount):
        if amount > 0:
            self.__balance += amount

    def withdraw(self, amount):
        if 0 < amount <= self.__balance:
            self.__balance -= amount

    def get_balance(self):
        return self.__balance

ACT 2 

class Person:
    def __init__(self, age):
        self._age = None
        self.age = age  

    @property
    def age(self):
        return self._age

    @age.setter
    def age(self, value):
        if isinstance(value, int) and value > 0:
            self._age = value
        else:
            raise ValueError("Age must be a positive integer")


PART 3 ACT 1

class InkPrinter:
    def print_document(self):
        print("Printing document using ink printer...")

class LaserPrinter:
    def print_document(self):
        print("Printing document using laser printer...")

ACT 2

def make_it_speak(obj):
    obj.speak()

class Bird:
    def speak(self):
        print("Chirp chirp!")

class Robot:
    def speak(self):
        print("Beep boop!")

PART 4 ACT 1

from abc import ABC, abstractmethod

class Shape(ABC):
    @abstractmethod
    def area(self):
        pass

class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return 3.14 * self.radius ** 2

class Rectangle(Shape):
    def __init__(self, width, height):
        self.width = width
        self.height = height

    def area(self):
        return self.width * self.height

ACT 2

from abc import ABC, abstractmethod

class Employee(ABC):
    @abstractmethod
    def calculate_pay(self):
        pass

class HourlyEmployee(Employee):
    def __init__(self, rate, hours):
        self.rate = rate
        self.hours = hours

    def calculate_pay(self):
        return self.rate * self.hours

class SalariedEmployee(Employee):
    def __init__(self, salary):
        self.salary = salary

    def calculate_pay(self):
        return self.salary


