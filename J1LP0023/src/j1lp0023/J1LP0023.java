package j1lp0023;

import controller.Manager;
import view.MenuModel;
import view.MenuView;

public class J1LP0023 {

    public static void main(String[] args) {
        MenuModel model = new MenuModel();
        MenuView view = new MenuView(model);
        Manager manager = new Manager(model, view);
        manager.startMenu();
    }

}
