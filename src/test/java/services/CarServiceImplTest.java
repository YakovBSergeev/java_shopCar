package services;

import domain.Car;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceImplTest {
    private final String DEFAULT_MARK = "вольво";
    private final String DEFAULT_COLOR = "белый";
    List<Car> testCarList = new ArrayList<>();

    @Test
    void takeCarByMark() {
        Car expectedCar = new Car(DEFAULT_MARK, DEFAULT_COLOR);
        testCarList.add(expectedCar);
        assertFalse(testCarList.isEmpty());
        CarService carService = new CarServiceImpl(testCarList);
        carService.takeCarByMark(DEFAULT_MARK);
//        assertEquals(expectedCar, carService.takeCarByMark(DEFAULT_MARK));
        assertTrue(testCarList.isEmpty());
//        assertEquals(DEFAULT_MARK ,testCarList.getMark());
    }

    @Test
    void putCar() {
    }

    @Test
    void hasCar() {
    }

    @Test
    void printCars() {
    }
}