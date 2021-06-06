package web.Repository;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarRepository {
    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Hennesey", "Venom GT", 1451));
        cars.add(new Car("Koenisegg", "Agera RS", 1341));
        cars.add(new Car("SSC", "Tuatara", 1350));
        cars.add(new Car("Lamborgini", "Aventador", 700));
        cars.add(new Car("Audi", "R8", 610));
    }

    public List<Car> getCarsByCount (int count){
        if (count < 1 || count >5){
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
