class Main {
  public static void main(String[] args) {
    String[] fruit = {"banana", "apple", "grapes", "pear", "orange", "watermelon", "mango"};
  
  for(int i= 0; i < 6; i++){
    System.out.println("The fruit is " + fruit[i]);
  }
  
fruit[6] = "strawberry";

for(int i = 0; i < 7; i++){
  System.out.println("The update " + fruit[i]);
  }

for(int i = 6; i > -1; i--){
  System.out.println("The fruit is " + fruit[i]);
  } 
 
  }
}