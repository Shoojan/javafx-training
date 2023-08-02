package sujan.smiles.javafxtraining.layouts;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class ImageUtil {
    public static ImageView createImageView(int i) {
        ImageView imageView = createImageView("/icons/phoenix-icon-png-5.jpg");
        imageView.setFitHeight(i == 0 ? 100 : (double) (100 * i) / 5);
        imageView.setFitWidth(i == 0 ? 100 : (double) (100 * i) / 5);
        return imageView;
    }

    public static ImageView createImageView(String imagePath) {
        Image img = new Image(Objects.requireNonNull(ImageUtil.class.getResourceAsStream(imagePath)));
        return new ImageView(img);
    }
}
