package sujan.smiles.javafxtraining.layouts;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

public class FlowPaneExample extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FlowPane flowPane = new FlowPane();
        for (int i = 0; i < 10; i++) {
            ImageView imageView = ImageUtil.createImageView(i + 1);
            flowPane.getChildren().add(imageView);
        }
        flowPane.setPadding(new Insets(10));
        flowPane.setHgap(10);
        flowPane.setVgap(10);
        flowPane.setOrientation(Orientation.HORIZONTAL);
//        flowPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(flowPane, 800, 600);
        stage.setScene(scene);
        stage.setTitle("FlowPane Example!");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}