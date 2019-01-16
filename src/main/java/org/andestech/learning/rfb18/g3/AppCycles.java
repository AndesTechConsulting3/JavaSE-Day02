package org.andestech.learning.rfb18.g3;

public class AppCycles {

    public static void main(String[] args)
    {

       /// while
       int res = 0, k=0;

       int res2 = 2 + res + (++res);
        System.out.println(res2);
        System.out.println(res);


       int j =0, N=6;
       while(j<N){

           System.out.println("j=" + j);
           //j++;
           ++j;
       }

        //j=0;
        while(true){
            if(j<0) break;
            System.out.println("j=" + j);
            //j++;
            --j;
        }

    // for

        {
           int k2 =0;
           k2 = j;


        }


//        {
//            int i = 0;
//            for (; i < N; i++) {
//            }
//        }


        for(int i = 0 ; i<N || k<N+1; i++, k++)
        {
            System.out.println(i+"^2=" + i*i);
        }

        {   int i =0;
            for (;;) {
                if(i>=N) break;
                System.out.println(i + "^2=" + i * i);
                //...
                //...
                i++;
            }
        }

        k=2;
        for (;;) {
            if(k>=N) break;
            System.out.println(k + "^2=" + k * k);
            //...
            //...
            k++;
        }


//        for(int i = 0; i<N; i++)
//        {
//            System.out.println(i+"^2=" + i*i);
//        }

    }

}
