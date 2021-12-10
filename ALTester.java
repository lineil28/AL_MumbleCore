public class ALTester{

  public static boolean sorted(){

    for(int i = 0; i< this.length - 1 ; i++){

      if( this[i]>this[i+1] ){
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args){
    OrderedArrayList a = new OrderedArrayList();
    a.add(2);
    a.add(2);
    a.add(2);
    System.out.println(a);
  }

}
