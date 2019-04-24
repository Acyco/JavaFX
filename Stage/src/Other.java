import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 * 点击按钮 切换图标
 *
 * @author Acyco
 * @create 2019-04-13 23:44
 */
public class Other extends Application {
    static int iconIndex = 0;
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane an = new AnchorPane();
        Button button = new Button("切换窗口图标");

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

          primaryStage.getIcons().add(new Image("/img/logo.jpg"));
                for (int i = 0; i < primaryStage.getIcons().size(); i++) {
                    System.out.println(primaryStage.getIcons().get(i));
                }
            }
        });
        
        an.getChildren().add(button);
        primaryStage.setWidth(300);
        primaryStage.setHeight(300);
        primaryStage.getIcons().add(new Image("/img/xygu.png"));
        primaryStage.setScene(new Scene(an));
        primaryStage.show();
    }
}
