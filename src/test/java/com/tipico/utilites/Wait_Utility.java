package com.tipico.utilites;

public class Wait_Utility {

    public static void wait(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e){

        }
    }
}
