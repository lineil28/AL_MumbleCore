import java.util.ArrayList;

/*
 * Team MumbleCore: Abdullah Faruque, Neil Lin, Russell Goychayev
 * APCS pd8
 * Lab02
 * 2021-12-13
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
  	if (size() > 0) {
  		int left = 0;
		int middle = (size()-1)/2;
		int right = size()-1;
        	while (right - left > 1) {
     			if (newVal >= _data.get(middle)) {
   				left = middle;
				middle += (right - middle) / 2;// by being greater than the middle value we are only working with the second half of the array
   			}
      			else {
				right = middle;
				middle = left + (middle - left) / 2;//else if less than the middle we just work with the first half of the array
              		}
		}
		if (newVal >= _data.get(right)) {
			 _data.add(newVal); }//by being the biggest element it's half it is ended to the end of the half.
		else if (newVal >= _data.get(left)) {
			 _data.add(right, newVal); } //by bring the smallest element in the half it is added at the beginning of the half.
		else {
			 _data.add(left, newVal); }
	}
	else { _data.add(newVal); }
  }//took inspiration from dojo spenapsi
  
//Forders the array from least to greatest
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
    

    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ )
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );

  }//end main()
}
