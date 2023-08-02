package sujan.smiles.javafxtraining.layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class VBoxExample extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox vBox = new VBox();
        for (int i = 0; i < 10; i++) {
            ImageView imageView = ImageUtil.createImageView(i + 1);
            vBox.getChildren().add(imageView);
        }
        vBox.setPadding(new Insets(5));
        vBox.setSpacing(10);

//        HBox.setHgrow(hBox.getChildren().get(3), Priority.ALWAYS);

        Scene scene = new Scene(vBox, 800, 600);
        stage.setScene(scene);
        stage.setTitle("VBox Example!");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}