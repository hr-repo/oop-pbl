import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.Random;

public class ex33 extends Application {
    public void start(Stage s) {
        VBox v = new VBox(10);
        v.setStyle("-fx-alignment:center;");
        Random r = new Random();

        for (int i = 1; i <= 5; i++) {
            Text t = new Text("Text " + i);
            t.setFont(Font.font("Times New Roman", 22));
            t.setFill(Color.color(r.nextDouble(), r.nextDouble(), r.nextDouble(), 0.3 + r.nextDouble() * 0.7));
            v.getChildren().add(t);
        }

        s.setScene(new Scene(v, 300, 300));
        s.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}