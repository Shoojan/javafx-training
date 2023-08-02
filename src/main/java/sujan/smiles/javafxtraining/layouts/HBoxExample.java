package sujan.smiles.javafxtraining.layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.io.IOException;

public class HBoxExample extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        HBox hBox = new HBox();
        for (int i = 0; i < 10; i++) {
            ImageView imageView = ImageUtil.createImageView(i + 1);
            hBox.getChildren().add(imageView);
        }
        hBox.setPadding(new Insets(5));
        hBox.setSpacing(10);

//        HBox.setHgrow(hBox.getChildren().get(3), Priority.ALWAYS);

        Scene scene = new Scene(hBox, 800, 600);
        stage.setScene(scene);
        stage.setTitle("HBox Example!");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}