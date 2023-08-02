package sujan.smiles.javafxtraining.layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class BorderPaneExample extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(this.createButton("Top"));
        borderPane.setBottom(this.createButton("Bottom"));
        borderPane.setLeft(this.createButton("Left"));
        borderPane.setRight(this.createButton("Right"));
        borderPane.setCenter(this.createButton("Center"));

        borderPane.setPadding(new Insets(10));

        Scene scene = new Scene(borderPane, 800, 600);
        stage.setScene(scene);
        stage.setTitle("BorderPane Example!");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private Button createButton(String buttonText) {
        Button button = new Button(buttonText, ImageUtil.createImageView(1 ));
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        button.setMinSize(100, 100);
        BorderPane.setAlignment(button, Pos.CENTER);
        BorderPane.setMargin(button, new Insets(5));
        return button;
    }

}