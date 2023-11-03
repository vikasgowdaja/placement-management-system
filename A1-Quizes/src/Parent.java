class Parent {
 int i = 20; 
void display()  { 
System.out.println("Parent");
 } } 
 class Child extends Parent {
int i= 100; 
 void display(){
 super.display(); System.out.println("Child"); System.out.println(super.i+i); 
 } } 
