package sujan.smiles.javafxtraining.layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class StackPaneExample extends Application {
    @Override
    public void start(Stage stage) {
        StackPane stackPane = new StackPane();
//        for (int i = 6; i > 0; i--) {
//            Rectangle rectangle = new Rectangle(50 * i, 50 * i, getRandomColor());
//            stackPane.getChildren().add(rectangle);
//        }
//        stackPane.setAlignment(Pos.TOP_LEFT);
//        StackPane.setAlignment(stackPane.getChildren().get(5),Pos.BOTTOM_RIGHT);

        ImageView imageView = ImageUtil.createImageView("/images/pheonix-wallpaper.png");
        stackPane.getChildren().add(imageView);
        stackPane.setAlignment(Pos.CENTER);

        Label label = new Label("Welcome to StackPane!");
        label.setFont(Font.font("Arial", FontWeight.BOLD, 32));
        label.setTextFill(Color.WHITE);
        stackPane.getChildren().add(label);
        StackPane.setMargin(label, new Insets(10));
        StackPane.setAlignment(label, Pos.TOP_LEFT);

        Scene scene = new Scene(stackPane, 1024, 800);
        stage.setScene(scene);
        stage.setTitle("AnchorPane Example!");
        stage.show();
    }

    private Paint getRandomColor() {
        return Color.color(Math.random(), Math.random(), Math.random());
    }

    public static void main(String[] args) {
        launch();
    }

}