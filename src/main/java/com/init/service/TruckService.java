package com.init.service;

import com.init.model.Vehicle;
import com.init.registry.AdapterService;
import org.springframework.stereotype.Service;

@Service("Truck")
public class TruckService  implements AdapterService<Vehicle> {

    @Override
    public void process(Vehicle vehicle){

        System.out.println("Inside truck service -"+vehicle.toString());

    }
}
