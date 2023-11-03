package Lern;
//package Lern;
//
//class PingPong2 {
//synchronized void hit(long n) {
//for(int i = 1; i < 3; i++)
//System.out.print(n + "-" + i + " ");
//}
//}
//public class Tester implements Runnable {
//static PingPong2 pp2 = new PingPong2();
//public static void main(String[] args) {
//new Thread(new Tester()).start();
//new Thread(new Tester()).start();
//}
//public void run() { pp2.hit(Thread.currentThread().getId()); }
//}
public class Threads4 {
public static void main (String[] args) {
new Threads4().go();
}
public void go() {
Runnable r = new Runnable() {
public void run() {
System.out.print("foo");
}
};
Thread t = new Thread(r);
t.start();

}
}