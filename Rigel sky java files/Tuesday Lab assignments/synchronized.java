package mydemo;
class Table{  
  synchronized void printTable(int n){//method not synchronized
	  System.out.println("Will print for every thread");
	 //synchronized(this)
	 //{
   for(int i=1;i<=5;i++){  
     System.out.println(n+"*"+i+"="+n*i);  
     try{  
      Thread.sleep(500);  
     }catch(Exception e){System.out.println(e);}  
   //}  
	  }
 }  
}  
  
class MyThread1 implements Runnable{
	
Table t;
	
MyThread1(Table t){  
	
this.t=t;
	
}  
public void run()
{  
t.printTable(5);  
}  
  
}  
class MyThread2 implements Runnable{  
Table t1;

MyThread2(Table t1){  
this.t1=t1;  
}  
public void run(){  
t1.printTable(100);  
}  
} 
class ThreadSynchronization{  
public static void main(String args[]){  
Table obj = new Table();//only one objec
Thread t1=new Thread(new MyThread1(obj));  
Thread t2=new Thread(new MyThread2(obj));
t1.start();  
t2.start();
}
   
}  
