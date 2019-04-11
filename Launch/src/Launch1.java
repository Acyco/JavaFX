import javafx.application.Application;
import javafx.stage.Stage;

/**
 * 第一种启动方式
 *
 * @author Acyco
 * @create 2019-04-11 15:00
 */
public class Launch1 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Acyco");
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
