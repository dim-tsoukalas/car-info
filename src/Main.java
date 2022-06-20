// Exercise 4 
// AM: 3212018232 Name: Τσουκαλάς Δημήτριος
import javax.swing.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        
 // Create the start list
        LinkedList<Car> list = new LinkedList();
        
        list.add(new Car("Toyota", "Yaris", 14000));
        list.add(new Car("Opel", "Corsa", 16000));
        list.add(new Car("Toyota", "Aygo", 11000));
        list.add(new Car("Fiat", "Panda", 19000));
        list.add(new Car("Toyota", "Yaris", 14000));
        list.add(new Car("Opel", "Astra", 20000));
        list.add(new Car("Opel", "Insignia", 26000));
        list.add(new Car("Fiat", "Mobi", 19000));
        list.add(new Car("Fiat", "Tipo", 14000));
        list.add(new Car("Alfa Romeo", "giulia", 14000));
        
// Create object, insert list and run the functions
        CategorizeList c = new CategorizeList(list);
        c.toTreeMap();
        JOptionPane.showMessageDialog(null,c.toString());
    }
}
