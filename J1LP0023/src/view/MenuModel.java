package view;

public class MenuModel {

    private String[] menuItems = {
        "Create Fruit",
        "View orders",
        "Shopping (for buyer)",
        "Exit"};

    private int selectedMenuItem;

    public String[] getMenuItems() {
        return menuItems;
    }

    public void setSelectedMenuItem(int selectedMenuItem) {
        this.selectedMenuItem = selectedMenuItem;
    }

    public int getSelectedMenuItem() {
        return selectedMenuItem;
    }
}
