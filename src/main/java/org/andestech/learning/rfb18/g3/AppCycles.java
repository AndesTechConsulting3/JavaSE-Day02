package org.andestech.learning.rfb18.g3;

public class AppCycles {

    static void mult1(int sw)
    {
        int N=10, j=0;

        int start_i=2, start_j=2;

        switch (sw)
        {
            case 0: start_i=2; start_j=2; break;
            case 1: start_i=1; start_j=1; break;
            case 2: start_i=1; start_j=2; break;
        }


        System.out.print("\t");
        for(j=start_j; j<=N; j=j+2) System.out.print(j + "\t");

        System.out.println();

        for(int i=start_i; i<=N; i=i+2)
        {
            System.out.print(i + "\t");
            for( j=start_j; j<=N; j=j+2)
            {
                System.out.print(j*i + "\t");
            }
            System.out.println();
        }



    }

    static void echo(){
        echo("-",72);
    }

    static void echo(String s1, int NN)
    {
        String s2="";

        for (int i1=0; i1<NN; i1++)  s2 += s1; //s2 = s2 + s1;
        System.out.println(s2);

    }



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

        echo();

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

        echo();
        k=2;
        for (;;) {
            if(k>=N) break;
            System.out.println(k + "^2=" + k * k);
            //...
            //...
            k++;
        }

        //-------------------
        System.out.println("------------------------");
        int n=1;
        do{
            System.out.println("n=" + n);
            n++;
        }
        while (n<6);
        echo();

//1
        System.out.print("task1,\t");
        System.out.print("task2,\t");
        System.out.print("task3");
//2
        System.out.println();
        System.out.print("\r\n");

        if(7%2==0) System.out.println("чётное");

        echo("+", 72);
        // mult table
        N=10;


        System.out.print("\t");
        for(int i=1; i<=N; i++) System.out.print(i + "\t");

        System.out.println();

        for(int i=1; i<=N; i++)
        {
            System.out.print(i + "\t");
            for( j=1; j<=N; j++)
            {
                System.out.print(j*i + "\t");
            }
            System.out.println();
        }

// odd even
        echo("#", 72);

        N=10;

        int start_i=2, start_j=2;
        int sw = 2;
        // sw=1, sw =2

        switch (sw)
        {
            case 0: start_i=2; start_j=2; break;
            case 1: start_i=1; start_j=1; break;
            case 2: start_i=1; start_j=2; break;
        }


        System.out.print("\t");
        for(j=start_j; j<=N; j=j+2) System.out.print(j + "\t");

        System.out.println();

        for(int i=start_i; i<=N; i=i+2)
        {
            System.out.print(i + "\t");
            for( j=start_j; j<=N; j=j+2)
            {
                System.out.print(j*i + "\t");
            }
            System.out.println();
        }


//-------------------------------------
N=15;
        for(int i = 0 ; i<=N; i++)
        {
            if( i%3 != 0) continue;
            System.out.println(i+"^2=" + i*i);
            //..
            //..
        }


//----------------------------------

       ext: for(int i1 = 0; i1<12; i1++)
        {
            for(int i2 = 0; i2<12; i2++)
            {
                if(i1*i2 == 80)
                {
                    System.out.println("i1=" + i1 + ", i2=" + i2);
                    System.out.println("found!");
                    break ext;
                }
            }

        }

        {
            int NN = 75;
            String s2 = "", s1 = "*";

            for (int i1 = 0; i1 < NN; i1++) s2 += s1; //s2 = s2 + s1;
            System.out.println(s2);
        }
//        for(int i = 0; i<N; i++)
//        {
//            System.out.println(i+"^2=" + i*i);
//        }

        for(int i=0; i<3; i++) {echo(); mult1(i);}

        }

        }
