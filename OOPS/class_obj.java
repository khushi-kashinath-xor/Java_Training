import java.util.HashMap;
import java.util.Map;

class VendingMachine {
    int balance;
    Map<String, Integer> items;

    public VendingMachine(int balance, Map<String, Integer> items) {
        this.balance = balance;
        this.items = items;
    }

    public void showItems() {
        System.out.println("The item prices are:");
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    public void insertMoney(int amount) {
        balance += amount;
        System.out.println("The balance is " + balance);
    }

    public void buyItem(String itemName) {
        if (!items.containsKey(itemName)) {
            System.out.println("Item not found!");
            return;
        }

        int cost = items.get(itemName);

        if (cost <= balance) {
            System.out.println("Item bought: " + itemName);
            balance -= cost;
            System.out.println("New balance is " + balance);
        } else {
            System.out.println("No balance");
        }
    }

    public void returnChange() {
        System.out.println("The balance is " + balance);
    }
}

class Main {
    public static void main(String[] args) {

        int balance = 10;

        // Creating dictionary of items
        Map<String, Integer> items = new HashMap<>();
        items.put("Coke", 10);
        items.put("Chips", 20);
        items.put("Chocolate", 30);
        items.put("Juice", 40);
        items.put("Water", 50);

        VendingMachine v1 = new VendingMachine(balance, items);

        v1.showItems();
        v1.insertMoney(0);
        v1.buyItem("Chocolate");
        v1.returnChange();
    }
}
