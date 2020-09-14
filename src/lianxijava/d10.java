package lianxijava;
import java.util.Scanner;
public class d10 {
    public static void main(String[] args){
        Scanner f=new Scanner(System.in);

        int a=f.nextInt();
        int length = (int)(Math.log10(a)+1);
        int[] numlist=new int[length];
                int num=0;
                int ok=0;
        while(true){
            numlist[num]=a%10;
            a=a/10;
            num++;
            if(a==0)
                break;
        }

        for(int i=0;i<length;i++)
            if(numlist[i]==numlist[length-1-i]){
                ok++;
                if(ok==length){
                    System.out.println("是回文数");
                break;}
                continue;}
            else {
            System.out.println("不是回文数");
            break;
            }


        int peach=1;
        for(int i=2;i<=10;i++){
            peach=(peach+1)*2;
        }
        System.out.println(peach);

        int jiecheng=f.nextInt();
        int summ=1;
        int sum=0;
        for(int i=1;i<=jiecheng;i++){
            for(int j=1;j<=i;j++){
                summ=summ*j;}
                sum=sum+summ;
        }
        System.out.println(sum);


        double jvli=f.nextDouble();
        double zonghe=0;
        for(int i=0;i<10;i++){
            zonghe=zonghe+jvli;
            jvli/=2;
            if(i==9)
                break;
            zonghe=zonghe+jvli;
        }

        System.out.println(zonghe);


            int siweishu=1000;
            int weishu[]=new int[3];

            while(true){
                int beishu=1;
                sum=0;
                if (siweishu==10000)
                    break;
                int j=siweishu;
                for(int i=0;i<3;i++){
                weishu[i]=j%10;
                j=j/10;
                sum=sum+weishu[i]*beishu;
                beishu=beishu*10;
                }
                if(sum*3==siweishu)
                    System.out.println(siweishu);
                ++siweishu;

            }

    }












}
