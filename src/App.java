import model.BioskopModel;
import controller.loginController;
public class App {
    public static void main(String[] args) {
        BioskopModel.initialData();
        new loginController().keDashboard();
    }
}