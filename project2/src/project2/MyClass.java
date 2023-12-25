package project2;
class MyClass {
 // Public variable
 public int publicVar = 10;

 // Default (package-private) variable
 int defaultVar = 20;

 // Protected variable
 protected int protectedVar = 30;

 // Private variable
 private int privateVar = 40;

 // Public method
 public void publicMethod() {
     System.out.println("Public method called");
 }

 // Default (package-private) method
 void defaultMethod() {
     System.out.println("Default method called");
 }

 // Protected method
 protected void protectedMethod() {
     System.out.println("Protected method called");
 }

 // Private method
 private void privateMethod() {
     System.out.println("Private method called");
 }
}

//Another class in the same package
class AnotherClass {
 public static void main(String[] args) {
     MyClass myObject = new MyClass();

     // Accessing public members
     System.out.println("Public variable: " + myObject.publicVar);
     myObject.publicMethod();

     // Accessing default (package-private) members
     System.out.println("Default variable: " + myObject.defaultVar);
     myObject.defaultMethod();

     // Accessing protected members
     System.out.println("Protected variable: " + myObject.protectedVar);
     myObject.protectedMethod();
 }
}
