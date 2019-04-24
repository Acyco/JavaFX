import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;

/**
 * 模式 模态
 *
 * @author Acyco
 * @create 2019-04-25 03:30
 */
public class Main2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        primaryStage.setOpacity(0.5); //设置窗口透明度
        primaryStage.setAlwaysOnTop(true); //设置置顶

        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setX(100);
        primaryStage.setY(100);

        primaryStage.xProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("窗口X坐标=" + newValue);
            }
        });
        primaryStage.yProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("窗口Y坐标=" + newValue);
            }
        });
        primaryStage.show();
    }
}
