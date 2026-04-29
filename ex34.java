import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ex34 extends Application {
    public void start(Stage s) {
        GridPane g = new GridPane();

        TextField r = new TextField();
        TextField n = new TextField();
        TextField a = new TextField();
        TextField e = new TextField();
        Button b = new Button("Submit");

        g.add(new Label("Roll"), 0, 0);
        g.add(r, 1, 0);
        g.add(new Label("Name"), 0, 1);
        g.add(n, 1, 1);
        g.add(new Label("Age"), 0, 2);
        g.add(a, 1, 2);
        g.add(new Label("Email"), 0, 3);
        g.add(e, 1, 3);
        g.add(b, 1, 4);

        b.setOnAction(x -> {
            try {
                Integer.parseInt(r.getText());
                Integer.parseInt(a.getText());
                if (!e.getText().contains("@") || !e.getText().contains(".")) throw new Exception();
                new Alert(Alert.AlertType.INFORMATION, r.getText()+" "+n.getText()+" "+a.getText()+" "+e.getText()).show();
            } catch (Exception ex) {
                new Alert(Alert.AlertType.ERROR, "Invalid Input").show();
            }
        });

        s.setScene(new Scene(g, 300, 200));
        s.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}