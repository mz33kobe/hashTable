package misc;
import java.util.*;

public class Misc {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        
        hashtable.put(1, "One");
        hashtable.put(2, "Two");

        for(Object o: hashtable.values()){
        System.out.println(o);
        }
           System.out.println(hashtable.containsKey(2));

        }

        }
   



/*public static void main(String[] args) {
        LinkedList list = new LinkedList();
        ArrayList list2 = new ArrayList();
        list.add(1);
        list.add(7);
        list.add(4);
        for(Object o: list){
        System.out.println(o);
        }
        list.sort( null);
        for(Object o: list){
         System.out.println(o);
*/


/*//INORDER TRAVERSAL
        TreeSet treeSet = new TreeSet();
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(4);
        
        for(Object o : treeSet){
        System.out.println(o);
        }
    System.out.println(treeSet.contains(10));
*/ 