package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Repository.CarRepository;
import web.model.Car;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List<Car> getCarsByCount(int count){
        return carRepository.getCarsByCount(count);
    }
}
