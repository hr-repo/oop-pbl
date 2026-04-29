import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ex35 extends Application {
    public void start(Stage s) {
        HBox h = new HBox(10);

        VBox v1 = new VBox(new Rectangle(50, 100, Color.RED), new Label("Projects 20%"));
        VBox v2 = new VBox(new Rectangle(50, 50, Color.BLUE), new Label("Quizzes 10%"));
        VBox v3 = new VBox(new Rectangle(50, 150, Color.GREEN), new Label("Midterm 30%"));
        VBox v4 = new VBox(new Rectangle(50, 200, Color.ORANGE), new Label("Final 40%"));

        h.getChildren().addAll(v1, v2, v3, v4);

        s.setScene(new Scene(h, 400, 300));
        s.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}