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
//removes element at index of input AND return INTEGER
  public Integer remove(int index) {
    Integer temp = _data.get(index);
    _data.remove(index);
    return temp;
  }

//returns the value at the given index
  public Integer get(int index) {
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

  public void addLinear(Integer newVal){
    for(int i = 0;i< size();i++){
      if(newVal<_data.get(i)){
        _data.add(i, newVal);
        return; //ends for loop
      }
    }
    _data.add(newVal); // if size 0, then add newVal
  }

  public void addBinary(Integer newVal){
    int half = size() / 2;
    if (size() == 0){
      _data.add(newVal);
    }
    for(;;){
      if (newVal > _data.get(half)){
        half += half/2;
      }
      if (newVal > _data.get(half)){
        _data.add(half, newVal);
        return;
      }
      if (newVal < _data.get(half)){
        half -=  half/2;
      }
    }
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
  public static void main( String[] args )
  {
    OrderedArrayList Franz = new OrderedArrayList();

    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz.toString() );
    /*-----v-------move-me-down-----------------v--------

    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ )
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
      =====^====================================^=========*/

  }//end main()
}
