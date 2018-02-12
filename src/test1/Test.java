package test1;
import java.awt.Button;
import java.awt.Frame;
import java.util.HashSet;

//import java.*;
//public class Test {}
//public interface Second {}
//abstract class SecondClass{}

//class DataServer extends Server {
//    public String serverName;
//    public DataServer() {
//        serverName = “Customer Service”;
//        super(serverName);
//    }
//}

//class TestServer {
//    public TestServer() { int users = 1; }
//    public void inc() { users++; }
//    public static void main(String[] args) {
//        TestServer ts = new TestServer();
//        ts.inc();
//        System.out.println(“Var users = “+ts.users);
//    }
// }


//public class Test {
//    public int t=4;
//    public static void main(String[] args) {
//        new Test().NumberPlay();
//    }
//    public void NumberPlay() {
//        int t=2;
//        t = t+5;
//        this.t = this.t-2;
//        t = t-this.t;
//        System.out.println(t+this.t+"ok");
//    }
//}

//class A {
//    static int i = 0;//1
//    double f = 1.0;//2
//    A() {
//        String str = "Hello";//3
//    }
//}
//public class Test extends A {
//    static int j=3;//4
//    boolean isHi = true;//5
//    Test(boolean hi) {
//        isHi = hi;//6
//    }
//    public static void main(String[] args) {
//        Test bb = new Test(false);
//    }
//}

//class Letter {
//    char c;
//}
//public class Test {
//    static void f(Letter y) {
//        y.c = 'z';
//    }
//    public static void main(String[] args) {
//        Letter x = new Letter();
//        x.c = 'a';
//        f(x);
//        System.out.println(x.c);
//    }
//}

public class Test {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);
    }
}


//
//public class Test {
//    public static void main(String[] args){
////    		arrayList st = new arrayList()
////    		for(int i; i<n;)
//	    	String s1 = "Hello";
//	    	String s2 = "Hello";
//	    	String s3 = "Hellp";
//	    	s3 = s3.replace('p', 'o');
//	    	
//	    	System.out.println(s1 == s2);
//	    System.out.println(s1 == s3);
//    }
//}

//class Base{
//    Base(int i){
//        System.out.println("base constructor");
//    }
//    Base(){}
//}
//public class Test extends Base{
//    public static void main(String argv[]){
//        Test s= new Test();
//        //One
//    }
//    Test(){
//        //Two
//    	super(10);
//    }
//    public void derived(){
//        //Three
//    }
//}

//private class Base{
//    Base(){
//        int i = 100;
//        System.out.println(i);
//    }
//}
//public class Test extends Base{
//    static int i = 200;
//    public static void main(String argv[]){
//        Test p = new Test();
//        System.out.println(i);
//    }
//}

//class Value {
//    int i;
//}
//public class Test {
//    public static void main(String[] argv) {
//        Integer v1 = 39;
//        Integer v2 = 39;
//        System.out.println(v1.equals(v2));
//    }
//}

//class Base {
//    void f(int i) {System.out.println("int"); }
//    void f(double d) {System.out.println("double");}
//}
//public class Test extends Base {
//    void f(String s) { System.out.println("String"); }
//    public static void main(String argv[]){
//        Test a = new Test();
//        a.f(10);
//    }
//}

//public class Test {
//    String s;
//    static class Inner {
//        void testMethod() {
//            s = "Hello world.";
//        }
//    }
//    public static void main(String[] argv) {
//        Inner i = new Inner();
//        i.testMethod();
//        System.out.println(s);
//    }
//}

//interface I {
//    void setValue(int val);
//    int getValue();
//}

//class A extends I {
//    int value;
//    void setValue(int val) { value = val; }
//    int getValue() { return value; }
//}

//interface A implements I {
//    void increment();    
//}

//abstract class C implements I {//right
//    int value;
//    public void setValue(int val) { value = val; }
//    public int getValue() { return value; }
//}

//class A extends I {
//    void increment();
//}

//class Base{
//    public Base(int i){}
//}
//public class Test extends Base{
//    public static void main(String arg[]){
//        Test m = new Test(10);
//    }
//    Test(int i){
//        super(i);
//    }
//    Test(String s, int i){
//        this(i);
//        //Here
////        Base b = new Base(10);
////        super(); 
////        this("Hello",10);
////        ver m = new Test();
//    }
//}

//public class Test extends Frame{
//    public static void main(String argv[]){
//        Test fa=new Test();
//        fa.setSize(400,300);
//        fa.setVisible(true);
//    }
//    Test(){
//        add(new Button("One"));
//        add(new Button("Two"));
//        add(new Button("Three"));
//        add(new Button("Four"));
//    }//End of constructor
//}//End of Application


//Package f(int port) {
//    return new Package(port) {
//        private int pt = port;
//        public int getPort() { return pt; }
//    };    
//}

//class Base {
//    private Base() { System.out.println(0);}
//    public Base(int i) {System.out.println(i);}
//}
//public class Test extends Base {
//    public Test() {super(1);};
//    public static void main(String argv[]){
//        Test t = new Test();
//    }
//}

//public class Test {
//    private int i = f(); 
//    private int j = 10;
//    private int f() {
//        return j;
//    }
//    public static void main(String args[]) { 
//        System.out.println((new Test()).i); 
//    }
//}
//
//class Value {
//    int i;
//    public boolean equals(Value v) {
//        return v.i == i;
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        HashSet<Value> set = new HashSet<Value>();
//        Value v1 = new Value();
//        Value v2 = new Value();
//        v1.i = v2.i = 39;
//        set.add(v1);
//        set.add(v2);
//        System.out.println(set.size());
//    }
//}

//public class Test {
//    public static void main(String argv[]){
//        int anar[]=new int[5];
//        System.out.println(anar[0]);
//    }
//}

//class TestBed {
//    TestBed() {}
//    void f() { System.out.println("f()"); }
//    public static void main(String[] args) {
//        TestBed t = new TestBed();
//        t.f();
//    }
//}
//class TestDoor {
//    TestDoor() {}
//    void f() { System.out.println("f()"); }
//    public static void main(String[] args) {
//        TestDoor t = new TestDoor();
//        t.f();
//    }
//}