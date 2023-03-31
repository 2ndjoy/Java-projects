
// // Create a Main class
// public class Main {
 
//   // Create a fullThrottle() method
//   public void fullThrottle() {
//     System.out.println("The car is going as fast as it can!");
//   }

//   // Create a speed() method and add a parameter
//   public void speed(int maxSpeed) {
//     System.out.println("Max speed is: " + maxSpeed);
//   }

//   // Inside main, call the methods on the myCar object

// }

// // The car is going as fast as it can!
// // Max speed is: 200
class Main {

  int age;
  Main(int age){
      this.age = age;
  }

  public static void main(String[] args) {
      Main obj = new Main(8);
      System.out.println("obj.age = " + obj.age);
  }
}