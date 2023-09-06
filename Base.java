package tictactoe;

public class Base {
        public void b(){
            int a=1;
            System.out.println("*****TIK-TAK-TOE*****");
            System.out.println("USER ONE BE X");
            System.out.println("USER TWO BE O");
            for(int i=0;i<7;i++){
                for(int j=0;j<7;j++){
                    if(j%2==0&&i%2==0){
                        System.out.print(" ");
                    }
                    else if(j%2!=0&&i%2!=0){
                        System.out.print(" "+a+" ");
                        a++;

                    }
                    else if(i%2!=0&&j%2==0){
                        System.out.print("|");
                    }
                    else{
                        System.out.print("___");
                    }
                }
                System.out.println(" ");
            }}}

