package sujan.smiles.javafxtraining;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

interface IVehicle {
    void run();
}

class Car implements IVehicle {
    @Override
    public void run() {
        System.out.println("Car runs...");
    }
}

public class HelloController {
    @FXML
    private Label welcomeText;

    HelloController() {
        IVehicle vehicle = new Car();
        vehicle.run();
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}