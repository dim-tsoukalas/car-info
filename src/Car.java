// Exercise 4 
// AM: 3212018232 Name: Τσουκαλάς Δημήτριος

public class Car {
    private final String company;
    private final String model;
    private final int value;

    public Car(String company, String model, int value) {
        this.company = company;
        this.model = model;
        this.value = value;
    }
    // Functions we use at CategorizeList to get values
    
    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return company + " " + model + " " + value;
    }
}
