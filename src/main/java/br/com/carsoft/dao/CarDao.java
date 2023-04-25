package br.com.carsoft.dao;

import br.com.carsoft.model.Car;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarDao {

    public void createCar(Car car) {
        String SQL = "INSERT INTO CAR (NAME) VALUES (?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, car.getName()); //1 = primeiro paramentro identificando na String SQL do ponto de interrogação
            preparedStatement.execute();
            System.out.println("success in connection");
            connection.close();

        } catch (Exception e) {
            System.out.println("fail in connection");
        }
    }

    public List<Car> findAllCars() {

        String SQL = "SELECT * FROM CAR";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Car> cars = new ArrayList<>();

            while (resultSet.next()) {

                String carId = resultSet.getString("id");
                String carName = resultSet.getString("name");
                String carRepeticao = resultSet.getString("repeticao");

                Car car = new Car(carId, carName);

                cars.add(car);

            }

            System.out.println("success in select * car");

            connection.close();

            return cars;

        } catch (Exception e) {

            System.out.println("fail in database connection");

            return Collections.emptyList();

        }

    }
}