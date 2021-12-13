import java.util.ArrayList;
/*
Team MumbleCore - Abdullah Faruque, Neil Lin, Russell Goychayev
APCS
Lab02 -- Well Al B. Sorted
2021-12-1
time spent: 0.5 hrs
*/

/*
DISCO:
ArrayList has a lot of built in functions like add() and remove(). 
QCC
are there more effecient ways of sorting an ArrayList?
*/

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
    joe.addLinear(50);
    joe.addBinary(25);
    System.out.println(joe);
    System.out.println("size is: "+ joe.size());
    System.out.println("removing 50");
    joe.remove(24);
    System.out.print(" "+joe);
    System.out.println("\n getting value at index 20: " + joe.get(20));

  }
}
