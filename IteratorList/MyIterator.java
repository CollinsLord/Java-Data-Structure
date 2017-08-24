import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
public class MyIterator {
 
    public static void main(String a[]){
         
        List<String> myList = new ArrayList<String>();
        myList.add("Collins");
        myList.add("Herman");
        myList.add("Kelvin");
        myList.add("Sam");
        Iterator<String> itr = myList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
