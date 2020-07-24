package org.envirocar.app.test.dao;

import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;

import org.envirocar.core.EnviroCarDB;
import org.envirocar.core.entity.Car;
import org.envirocar.core.entity.CarImpl;
import org.envirocar.storage.EnviroCarDBImpl;
import org.envirocar.storage.TrackRoomDatabase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TrackDAOTest {

    private EnviroCarDB enviroCarDB;
    private TrackRoomDatabase trackRoomDatabase;

   // Room database instance in memory for test
    @Before
    public void initTrackDb() throws Exception {
         trackRoomDatabase = Room.inMemoryDatabaseBuilder(InstrumentationRegistry.getContext(),
                TrackRoomDatabase.class)
                .allowMainThreadQueries()
                .build();
        this.enviroCarDB = new EnviroCarDBImpl(trackRoomDatabase);
    }

    @After
    public  void closeTrackDb() throws Exception {
        trackRoomDatabase.close();
    }

    @Test
    public void trackTest() {


    }

    // create new car
    private Car createCar() {
        Car car = new CarImpl();
        car.setId("5750591ee4b09078f98673d8");
        car.setConstructionYear(2004);
        car.setManufacturer("Opel");
        car.setModel("Vectra C Caravan");
        car.setFuelType(Car.FuelType.GASOLINE);
        car.setEngineDisplacement(2200);

        return car;
    }
}
