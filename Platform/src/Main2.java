import javafx.application.Application;
import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.stage.Stage;

/**
 * @author Acyco
 * @create 2019-04-25 04:03
 */
public class Main2 extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

//        Platform.setImplicitExit(false);//窗口关闭，但程序依然没有退出
        System.out.println(Platform.isSupported(ConditionalFeature.SCENE3D));
        System.out.println(Platform.isSupported(ConditionalFeature.FXML));

        primaryStage.show();

//        Platform.exit();
    }
}
