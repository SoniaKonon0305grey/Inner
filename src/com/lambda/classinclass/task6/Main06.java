package com.lambda.classinclass.task06;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        Thr thread = new Thr(new Runnable() {
            @Override
            public void run() {
            	Random t = new Random();
				int s = t.nextInt(1000);
                try {
                    for (int i = 1; i <= 5; i++) {
                        System.out.println(i);
                        Thread.sleep(1000+s); 
                    }
                } catch (InterruptedException e) {
                   
                    e.printStackTrace();
                }
            }
        });
        
       
        thread.start();
    }
}

