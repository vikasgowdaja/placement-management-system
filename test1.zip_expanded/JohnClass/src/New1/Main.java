package New1;
class Store
{ 
void info(){ 
System.out.println("Parent Store");}
}
 class Store1 extends Store
{ void info()
{ 
System.out.println("Child of Store");
} } class Store2 extends Store1
{ 
void info(){
System.out.println("Child of Store1");
} } 
class Main{
 public static void main(String args[]){ 
Store2 d=new Store2(); d.info();
 } }