import View.ConsoleView;

public class Main {
    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        while(true) {
            // TODO 이게 맞나
            if (view.InputNumber() == -1) {
                break;
            }
        }
    }
}