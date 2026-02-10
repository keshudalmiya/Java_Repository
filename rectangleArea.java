class Rectangle{
  int breadth , length;
  void getData(int breadth , int length){
    this.breadth = breadth;   //Instance variables or object variables | this represents the current object and b and l are local variable
    this.length = length;        //Instance variables or object variables
  }
  int area(){
    int a= length*breadth;
    return a;
  
  }

}
public class rectangleArea {
  public static void main(String[] args) {
    Rectangle R = new Rectangle();
    R.getData(3, 5);
    int result = R.area();
    System.out.println("the area of rectangle is: " + result);

  }
  
}
