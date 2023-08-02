package sujan.smiles.javafxtraining;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application implements EventHandler<ActionEvent> {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Image img = new Image(getClass().getResourceAsStream("/icons/pheonix.png"));
        ImageView imageView = new ImageView(img);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);

        Label label = new Label();
        label.setText("Hello there!");
        label.setGraphic(imageView);
        label.setFont(Font.font("Arial", FontWeight.BOLD, 20));

        Button btn = this.createButton("I_nterface Implementation");

        //Using Interface Implementation
        btn.setOnAction(this);

        //Using Anonymous Inner Class
        Button btn2 = this.createButton("Anonymous Inner Class");
        EventHandler<ActionEvent> eventHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Using Anonymous Inner Class");
            }
        };
        btn2.setOnAction(eventHandler);

        //Using Custom Method
        Button btn3 = this.createButton("Custom Method");
        btn3.setOnAction(HelloApplication::handleUsingCustomMethod);

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));
        root.setCenter(label);
        root.setLeft(btn);
        root.setBottom(btn2);
        root.setRight(btn3);

        Scene scene = new Scene(root, 800, 600);

//        Scene scene = new Scene(fxmlLoader.load(), 800, 600); //Width, Height
        //Add Background color
        scene.setFill(Color.SKYBLUE);
//            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("What's up Pheonix!");
        //Set Icon
        stage.getIcons().add(img);
        //Fix Height and Width
        stage.setResizable(false);
        //Launch in fix coordinates
        stage.setX(100);
        stage.setY(100);
        //Enable Fullscreen
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Press Q to exit Fullscreen.");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("Q"));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private Button createButton(String buttonText) {
        Button button = new Button(buttonText);
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        button.setMinSize(100,100);
        BorderPane.setAlignment(button, Pos.CENTER);
        BorderPane.setMargin(button, new Insets(5));
        return button;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Using Interface Implementation");
    }

    public static void handleUsingCustomMethod(ActionEvent actionEvent) {
        System.out.println("Using Custom Method");
    }
}