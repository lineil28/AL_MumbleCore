import java.util.ArrayList;
// Write class ALTester, which will populate an ArrayList with 23 Integers and determine whether the list is sorted or not.
// Implement class OrderedArrayList, a wrapper class for ArrayList maintaining the invariant that its elements are sorted.

public class ALTester {

  public static boolean sorted(ArrayList<Integer> arr){
    for(int i = 0; i < arr.size()-1; i++) {
      if(arr.get(i) > arr.get(i+1)) {
        return false;
      }
    }
    return true;
  }



  public static void main(String[] args){
    ArrayList<Integer> testArrayList = new ArrayList<>();
    for(int i = 0; i < 23; i++) {
      testArrayList.add((int)(Math.random()*50));
    }
    System.out.println(sorted(testArrayList));
    OrderedArrayList joe = new OrderedArrayList(testArrayList); //orders the testArraylist upon being made into an OrderedArrayList.
    System.out.println("is it sorted!?: " + sorted(joe._data));
    System.out.println(joe);
    System.out.println("adding values 50 and 25 to joe");
    joe.add(50);
    joe.add(25);
    System.out.println(joe);
    System.out.println("size is: "+ joe.size());
    System.out.println("removing 50");
    joe.remove(24);
    System.out.print(" "+joe);
    System.out.println("\n getting value at index 20: " + joe.get(20));

  }
}