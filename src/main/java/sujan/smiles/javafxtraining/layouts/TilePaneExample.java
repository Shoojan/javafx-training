package sujan.smiles.javafxtraining.layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.io.IOException;

public class TilePaneExample extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        TilePane tilePane = new TilePane();
        for (int i = 0; i < 10; i++) {
            ImageView imageView = ImageUtil.createImageView(i + 1);
            tilePane.getChildren().add(imageView);
        }
        tilePane.setPadding(new Insets(5));
        tilePane.setHgap(5);
        tilePane.setVgap(5);
        tilePane.setOrientation(Orientation.HORIZONTAL);
//        tilePane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(tilePane, 800, 600);
        stage.setScene(scene);
        stage.setTitle("TilePane Example!");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}