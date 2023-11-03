package New3;

class Data1
{ int a; 
void show() { 
System.out.println(a);
 } } class Data2 extends Data1
 { 
int b; void show() { 
System.out.println(b);  
 } }
 class Main
 { 
public static void main(String args[]) { 
Data2 obj = new Data2(); obj.show();
 }}