package DSA;

import java.lang.*;
import java.util.Random;
class sq extends Thread{
    public void run(int x){
        x = x*x;
        System.out.print(x);
    }
}
class tij extends Thread{
    sq s1 = new sq();
    public void run(){
        Random r = new Random();
        int x = r.nextInt(11);
        if(x%2==0){
            s1.run(x);
        }else{
            System.out.print(x);
        }
    }
}
class mmain {
    public static void main(String[] args) {
        tij t1 = new tij();
        System.out.println("thread is running");
        t1.start();
    }
}