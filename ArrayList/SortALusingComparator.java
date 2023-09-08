package ArrayList;
    
import java.util.ArrayList;
import java.util.Comparator;

public class SortALusingComparator {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Technologies");
        a.add("Java");
        a.add("Besant");
        a.add("welcome");
        System.out.println("Unsorted ArrayList: " + a);
        a.sort(Comparator.naturalOrder());
        System.out.println("Sorted ArrayList: " + a);
    }
}
