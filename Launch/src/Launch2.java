import javafx.application.Application;
import javafx.stage.Stage;

/**
 * 第二种启动方式
 *
 * @author Acyco
 * @create 2019-04-11 15:07
 */
public class Launch2 extends Application {
    public static void main(String[] args){
        launch(Launch2.class,args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Acyco");
        primaryStage.show();
    }
}
