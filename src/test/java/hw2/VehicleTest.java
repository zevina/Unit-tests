package hw2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    // Машина:
    //экземпляр объекта Car является экземпляром транспортного средства Vehicle
    @Test
    @DisplayName("Car instanceof Vehicle")
    void checkInstanceCar() {
        Car car = new Car("Toyota", "Camry", 2023);
        assertTrue(car instanceof Vehicle);
    }

    //объект Car создается с 4-мя колесами
    @Test
    @DisplayName("Car has 4 wheels")
    void checkNumberWheelsCar() {
        Car car = new Car("Toyota", "Camry", 2023);
        assertEquals(4, car.getNumWheels());
    }

    //объект Car развивает скорость 60 в режиме тестового вождения
    @Test
    @DisplayName("Car's speed is 60")
    void checkSpeedCar() {
        Car car = new Car("Toyota", "Camry", 2023);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    //в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    @DisplayName("Car's speed is 0 after park")
    void checkSpeedCarPark() {
        Car car = new Car("Toyota", "Camry", 2023);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }


    // Мотоцикл:
    //экземпляр объекта Motorcycle является экземпляром транспортного средства Vehicle
    @Test
    @DisplayName("Motorcycle  instanceof Vehicle")
    void checkInstanceMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "Cruiser", 1989);
        assertTrue(motorcycle instanceof Vehicle);
    }

    //объект Motorcycle создается с 2-мя колесами
    @Test
    @DisplayName("Motorcycle has 2 wheels")
    void checkNumberWheelsMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "Cruiser", 1989);
        assertEquals(2, motorcycle.getNumWheels());
    }

    //объект Motorcycle развивает скорость 75 в режиме тестового вождения
    @Test
    @DisplayName("Motorcycle's speed is 75")
    void checkSpeedMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "Cruiser", 1989);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    //в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    @DisplayName("Motorcycle's speed is 0 after park")
    void checkSpeedMotorcyclePark() {
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "Cruiser", 1989);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}