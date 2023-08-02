package sujan.smiles.javafxtraining.layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class AnchorPaneExample extends Application {
    @Override
    public void start(Stage stage) {
        TextArea textArea = new TextArea();
        Button b1 = new Button("Start");
        Button b2 = new Button("End");

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().addAll(textArea, b1, b2);

        AnchorPane.setTopAnchor(textArea,10.0);
        AnchorPane.setLeftAnchor(textArea,10.0);
        AnchorPane.setBottomAnchor(textArea,10.0);
        AnchorPane.setRightAnchor(textArea, 55.0);

        AnchorPane.setTopAnchor(b1,10.0);
        AnchorPane.setRightAnchor(b1,10.0);

        AnchorPane.setBottomAnchor(b2,10.0);
        AnchorPane.setRightAnchor(b2,10.0);

        Scene scene = new Scene(anchorPane, 800, 600);
        stage.setScene(scene);
        stage.setTitle("AnchorPane Example!");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}