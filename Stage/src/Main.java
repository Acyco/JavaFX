import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * main
 *
 * @author Acyco
 * @create 2019-04-11 15:25
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("JavaFX");
        primaryStage.getIcons().add(new Image("/img/logo.jpg"));//设置图标
        primaryStage.setWidth(300);//设置窗口宽度
        primaryStage.setHeight(300);//设置窗口高度
//        primaryStage.setIconified(true);  //设置最小化
//        primaryStage.setMaximized(true); //设置最大化
//        primaryStage.close(); // 关闭窗口

//        primaryStage.setResizable(false); // 设置 不可以改变窗口的大小

        primaryStage.setWidth(500);
        primaryStage.setHeight(500);


//        primaryStage.setMaxWidth(800);
//        primaryStage.setMaxHeight(800);
//
//        primaryStage.setMinWidth(300);
//        primaryStage.setMinHeight(300);

        // getWidth() getHeight()  前面没有设置 一定要放到 放在show()后面
//        System.out.println("宽度: "+primaryStage.getWidth());
//        System.out.println("高度: "+primaryStage.getHeight());

        primaryStage.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("当前高度"+newValue);
            }
        });
        primaryStage.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("当前宽度"+newValue);
            }
        });

        primaryStage.setFullScreen(true);    //设置全屏  设置Scene

        primaryStage.setScene(new Scene(new Group()));

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }

}
