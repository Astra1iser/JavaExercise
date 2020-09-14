package lianxijava;

import java.util.Scanner;

public class lianxiyixia {
    public static void main(String [] args){
        Scanner f=new java.util.Scanner(System.in);
        long sum=0;
        for(int i=1;i<=1000;i++) {
            if (i % 7 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        sum=1;
        int j=0;
        for(int i=2;i<=100;i++){
            if(i%2!=0)
            {j=-i;}
            else j=i;
            sum=sum+j;
        }
        System.out.println(sum);

        long  a;
        sum=1;
        a=f.nextInt();
        while(a>1){
            sum=sum*a;
            --a;
        }
        System.out.println(sum);

        a=f.nextInt();
        int b= 0;
        for(int i=2;i<a;i++){
            if(a%i==0){
                System.out.println("不是质数");
                b=1;break;}
        }
        if(b==0){
            System.out.println("是质数");
        }
        a=f.nextInt();
        int i=1;
        for(i=1;i<=a;i++){
            for(long k=a-i;k>0;k--)
                System.out.print(" ");
            for(int l=0;l<i*2-1;l++)
                System.out.print("*");
            System.out.print("\n");}
        double sum2=0;
        int q=0;
        while(sum2<100){
            q++;
            sum2=sum2+2.5;
            if(q%5==0){
                sum2=sum2-6;
            }


        }
        System.out.println(q);

        for(int w=2;w<=1000;w++){
            sum2=0;
            for(int e=1;e<=w/2;e++){
                if(w%e==0)
                    sum2=sum2+e;}
            if(sum2==w)
                System.out.println(w);

        }


        int r;
        r=f.nextInt();
        int n,m=1;
        int result=0;

        while(true){
            n=r%10;
            r=r/10;
            result=result*10+n;

            if(r!=0){
                m=m+1;}
            else {
                break;
            }
        }
        System.out.print(result);
        System.out.println("\n");
        System.out.println(m);




    }
}