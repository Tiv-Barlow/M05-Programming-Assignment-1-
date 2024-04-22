//M05 Programming Assignment (1)
//Ivy Tech Community College
//SDEV 200 - Java
//Professor Bumgardner
//Nativida Muhammad
// 21 April 2024

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;


public class Main extends Application {

  @Override
  public void start(Stage primaryStage) {
    // Code below creates a GridPane
    GridPane gridPane = new GridPane();
    gridPane.setHgap(10);
    gridPane.setVgap(10);

    // Code below creates a paths to the images
    String[] imagePaths = {
        "walkingToAtm.jpg",
        "frontOfAtm.jpg",
        "punchNumbers.jpg",
        "jackPot.jpg"
    };

    // Code below loads images and add them to the grid
    for (int i = 0; i < imagePaths.length; i++) {
      Image image = new Image(getClass().getResourceAsStream(imagePaths[i]));
      ImageView imageView = new ImageView(image);
      imageView.setFitWidth(200);
      imageView.setFitHeight(200);
      gridPane.add(imageView, i % 2, i / 2);
    }

    // Code creates a scene and set it on the stage
    Scene scene = new Scene(gridPane, 450, 300);
    primaryStage.setTitle("Image Grid Pane");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
