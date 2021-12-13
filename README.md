# TEAM MumbleCore
# Abdullah Faruque, Neil Lin, Russell Goychayev

## ALTester
* <code>sorted(ArrayList<Integer> arr)</code> takes an ArrayList, and returns <code>true</code> when it is sorted, and <code>false</code> if it is not sorted. It does so by checking if an element is less than its proceeding element. 
* The main method in ALTester has all of our testcases, including those for <code>OrderedArrayList</code>.

## OrderedArrayList
* Attribute: <code>ArrayList<Integer> _data;</code>, which is an ArrayList. 
* <code>OrderedArrayList()</code> is the default constructor, spawning an empty ArrayList called <code>_data</code>.
* <code>OrderedArrayList(ArrayList<Integer> startingAL)</code> is the overloaded constructor, that takes an existing ArrayList, sets it equal to <code>_data</code> and orders it. 
* <code>size()</code> returns the size of the ArrayList using the existing <code>size()</code> provided by ArrayList.
* <code>add(int entry)</code> adds <code>entry</code> to the ArrayList using the existing <code>add()</code> provided by ArrayList. It then orders it using <code>order(ArrayList<Integer> arr)</code> by doing <code>order(_data)</code>. Lastly, returns <code>true</code>.
* <code>remove(int index)</code> removes the value at <code>index</code> using the existing <code>remove(int index)</code> function given by ArrayList. 
* <code>get(int index)</code> returns the value at the given <code>index</code> using the built in <code>get(int index></code> given by ArrayList. 
* <code>toString()</code> returns the ArrayList in a string format. 
* example: <code> [1 1 5 7 10 11 23 24 24 24 26 30 31 31 32 36 40 41 42 45 47 49 49  ] </code>
* <code>order(ArrayList<Integer> arr)</code> orders the given ArrayList. While <code>sorted()</code> is false (found in ALTester), this method compares an element with its proceeding element using a for loop. If the first element is greater than its proceeding element, the method will basically "swap" their places. In order to swap, a temporary variable called <code>larger</code> is set to the larger element. Then the swapping process is done. After all of this, the for loop continues. This for loop will repeat itself until <code>sorted()</code> returns true. 
* <code>addLinear</code> adds by comparing each value linearly, with the newValue. If it is less than indexed value, it adds at that spot.
* <code>addBinary</code> does the same job, but in a binary fashion. it searches the array through "halves" depending on the value of newValue, whether it is greater than or less than the middle point. From there, we continue chopping the array until we the newVal can be added without destroying the order.

