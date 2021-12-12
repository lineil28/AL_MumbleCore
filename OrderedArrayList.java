import java.util.ArrayList;

/*
 * Team MumbleCore: Abdullah Faruque, Neil Lin, Russell Goychayev
 * APCS pd8
*/

public class OrderedArrayList {
  public ArrayList<Integer> _data;

  public OrderedArrayList() {
    _data = new ArrayList<>();
  }
//overloaded constructor, takes an ArrayList
  public OrderedArrayList(ArrayList<Integer> startingAL) {
    _data = startingAL;
    _data = order(_data);
  }
//returns size
  public int size() {
    return _data.size();
  }
//adds specified input
  public boolean add(int entry) {
    _data.add(entry);
    _data = order(_data);
    return true;
  }
//removes element at index of input
  public void remove(int index) {
    _data.remove(index);
  }
//returns the value at the given index
  public int get(int index) {
    return _data.get(index);
  }
//prints out the array
  public String toString() {
    String output = "[";
    for(int number: _data) {
      output += number + " ";
    }
    output += " ]";
    return output;
  }
//orders the array from least to greatest
  public static ArrayList<Integer> order(ArrayList<Integer> arr) {
    while(!ALTester.sorted(arr)) {
      for(int i = 0; i < arr.size()-1; i++) {
        if(arr.get(i) > arr.get(i+1)) {
          int larger = arr.get(i);
          arr.set(i, arr.get(i+1));
          arr.set(i+1, larger);
        }
      }
    }
    return arr;
  }
}