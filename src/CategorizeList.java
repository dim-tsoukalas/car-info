// Exercise 4 
// AM: 3212018232 Name: Τσουκαλάς Δημήτριος

import java.util.*;

public class CategorizeList {   
    // Java Encapsulation for sensitive information
    private LinkedList<Car> list = new LinkedList<>();

    public CategorizeList(LinkedList<Car> list) {
        this.list = list;
    }

    /*
    This function is to insert the models and companies from
    LinkedList to HashMap<String, Set<String>>. I insert to key->Company 
    and at value->Models
    */
    public Map<String, Set<String>> toTreeMap() {
        HashMap<String, Set<String>> hash = new HashMap<>();

        // Insert companies first
        list.forEach((c) -> {
            
      /*if company don't exists create new Set with this 
            company and add the models*/
            if(!hash.containsKey(c.getCompany())) {
                Set set = new HashSet<String>();
                set.add(c.getModel());
                hash.put(c.getCompany(), set);
      /*if company is already exists 
                just add the new value to Set*/
            } else { 
                hash.get(c.getCompany()).add(c.getModel());
            }
        });
        // We put our values to a tree Map for alphabetical order
        Map<String, Set<String>> map = new TreeMap<>(hash);
        return map;
    }
    /*Method to print values as asked. We add values 
    from Tree Map to StringBuilder*/
    @Override
    public String toString() {
        Map<String, Set<String>> map = toTreeMap();
        StringBuilder sb = new StringBuilder();

        map.entrySet().stream().map((s) -> {
            sb.append(s.getKey());
            return s;
        }).map((s) -> {
            sb.append(":");
            sb.append(" ");
            sb.append(s.getValue().size());
            return s;
        }).map((s) -> {
            sb.append(s.getValue());
            return s;
        }).forEachOrdered((_item) -> {
            sb.append("\n");
        });

        return sb.toString();
    }

}
