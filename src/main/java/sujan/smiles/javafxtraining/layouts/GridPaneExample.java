package sujan.smiles.javafxtraining.layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GridPaneExample extends Application {
    @Override
    public void start(Stage stage){
        GridPane gridPane = new GridPane();
        ArrayList<ImageView> imageViewList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ImageView imageView = ImageUtil.createImageView(0);
            imageViewList.add(imageView);
        }

        gridPane.add(imageViewList.get(0), 0, 0, 1, 1);
        gridPane.add(imageViewList.get(1), 0, 1, 1, 1);
        gridPane.add(imageViewList.get(2), 0, 2, 1, 1);
        gridPane.add(imageViewList.get(3), 0, 3, 1, 1);

        gridPane.add(imageViewList.get(4), 1, 0, 1, 1);
        gridPane.add(imageViewList.get(5), 1, 1, 1, 1);
        gridPane.add(imageViewList.get(6), 1, 2, 1, 1);
        gridPane.add(imageViewList.get(7), 1, 3, 1, 1);

        gridPane.add(imageViewList.get(8), 2, 0, 2, 2);
        gridPane.add(imageViewList.get(9), 4, 2, 1, 1);

        gridPane.setPadding(new Insets(5));
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(gridPane, 800, 600);
        stage.setScene(scene);
        stage.setTitle("GridPane Example!");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}