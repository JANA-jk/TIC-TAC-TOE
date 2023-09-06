package tictactoe;
import java.util.Scanner;
public class Main {
    public static int onee=0,twoo=0;
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                Base b=new Base();
                b.b();
                int[] selected =new int[9];
                int[] one=new int[5];
                int[] two=new int[5];
                for(int la=0;la<9;la++){

                    System.out.println("type a digit");
                    for(int a=1;a<=9;a++){
                        System.out.print(" "+a+" ");
                    }
                    System.out.println(":");
                    if(la%2==0){
                        System.out.println("user one's turn:");
                    }
                    else{
                        System.out.println("user two's turn");
                    }

                    int input=sc.nextInt();
                    while(input>9){
                        System.out.println("number is invalid");
                        input=sc.nextInt();
                    }
                    for(int v=0;v<9;v++){
                        while(input==selected[v]){
                            System.out.println("number is already selected");
                            input=sc.nextInt();
                        }}
                    selected[la] = input;
                    if(la%2==0){
                        one[onee]=input;
                        onee++;}
                    else{
                        two[twoo]=input;
                        twoo++;
                    }

                    Design d=new Design();
                    d.d(input,la,selected,one,two);
                    Result r=new Result();
                    if(r.r(one,two)==4){

                        System.out.println("the game is over");
                        break;
                    }}}}


