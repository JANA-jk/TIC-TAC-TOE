package tictactoe;

public class Result {

        public int r(int[] o,int[] t){
            //1
            int a=0,b=0,c=0;
            for (int h = 0; h < 5; h++) {

                if (o[h] == 1) {
                    a++;
                } else if (o[h] == 2) {
                    b++;
                } else if (o[h] == 3) {
                    c++;
                }
            }
            if(a!=0&&b!=0&&c!=0){
                System.out.println("user one is the winner");
                return 4;
            }
            //2
            a=0;b=0;c=0;
            for (int h = 0; h < 5; h++) {

                if(o[h]==4){
                    a++;
                }
                else if(o[h]==5){
                    b++;
                }else if(o[h]==6){
                    c++;
                }
            }
            if(a!=0&&b!=0&&c!=0){
                System.out.println("user one is the winner");
                return 4;
            }//3
            a=0;b=0;c=0;
            for (int h = 0; h < 5; h++) {

                if(o[h]==7){
                    a++;
                }
                else if(o[h]==8){
                    b++;
                }else if(o[h]==9){
                    c++;
                }
            }
            if(a!=0&&b!=0&&c!=0){
                System.out.println("user one is the winner");
                return 4;
            }//4
            a=0;b=0;c=0;
            for (int h = 0; h < 5; h++) {

                if(o[h]==1){
                    a++;
                }
                else if(o[h]==4){
                    b++;
                }else if(o[h]==7){
                    c++;
                }
            }
            if(a!=0&&b!=0&&c!=0){
                System.out.println("user one is the winner");
                return 4;
            }//5
            a=0;b=0;c=0;
            for (int h = 0; h < 5; h++) {

                if(o[h]==2){
                    a++;
                }
                else if(o[h]==5){
                    b++;
                }else if(o[h]==8){
                    c++;
                }
            }
            if(a!=0&&b!=0&&c!=0){
                System.out.println("user one is the winner");
                return 4;
            }//6
            a=0;b=0;c=0;
            for (int h = 0; h < 5; h++) {

                if(o[h]==3){
                    a++;
                }
                else if(o[h]==6){
                    b++;
                }else if(o[h]==9){
                    c++;
                }
            }
            if(a!=0&&b!=0&&c!=0){
                System.out.println("user one is the winner");
                return 4;
            }//7
            a=0;b=0;c=0;
            for (int h = 0; h < 5; h++) {

                if(o[h]==1){
                    a++;
                }
                else if(o[h]==5){
                    b++;
                }else if(o[h]==9){
                    c++;
                }
            }
            if(a!=0&&b!=0&&c!=0){
                System.out.println("user one is the winner");
                return 4;
            }//8
            a=0;b=0;c=0;
            for (int h = 0; h < 5; h++) {

                if(o[h]==3){
                    a++;
                }
                else if(o[h]==5){
                    b++;
                }else if(o[h]==7){
                    c++;
                }
            }
            if(a!=0&&b!=0&&c!=0){
                System.out.println("user one is the winner");
                return 4;
            }//one is overrrrrrrrrrrrrrrr
            a=0;b=0;c=0;
            for (int h = 0; h < 5; h++) {

                if(t[h]==4){
                    a++;
                }
                else if(t[h]==5){
                    b++;
                }else if(t[h]==6){
                    c++;
                }
            }
            if(a!=0&&b!=0&&c!=0){
                System.out.println("user two is the winner");
                return 4;
            }//2
            a=0;b=0;c=0;
            for (int h = 0; h < 5; h++) {

                if(t[h]==1){
                    a++;
                }
                else if(t[h]==2){
                    b++;
                }else if(t[h]==3){
                    c++;
                }
            }
            if(a!=0&&b!=0&&c!=0){
                System.out.println("user two is the winner");
                return 4;
            }//3
            a=0;b=0;c=0;
            for (int h = 0; h < 5; h++) {

                if(t[h]==7){
                    a++;
                }
                else if(t[h]==8){
                    b++;
                }else if(t[h]==9){
                    c++;
                }
            }
            if(a!=0&&b!=0&&c!=0){
                System.out.println("user two is the winner");
                return 4;
            }//4
            a=0;b=0;c=0;
            for (int h = 0; h < 5; h++) {

                if(t[h]==1){
                    a++;
                }
                else if(t[h]==4){
                    b++;
                }else if(t[h]==7){
                    c++;
                }
            }
            if(a!=0&&b!=0&&c!=0){
                System.out.println("user two is the winner");
                return 4;
            }//5
            a=0;b=0;c=0;
            for (int h = 0; h < 5; h++) {

                if(t[h]==2){
                    a++;
                }
                else if(t[h]==5){
                    b++;
                }else if(t[h]==8){
                    c++;
                }
            }
            if(a!=0&&b!=0&&c!=0){
                System.out.println("user two is the winner");
                return 4;
            }//6
            a=0;b=0;c=0;
            for (int h = 0; h < 5; h++) {

                if(t[h]==3){
                    a++;
                }
                else if(t[h]==6){
                    b++;
                }else if(t[h]==9){
                    c++;
                }
            }
            if(a!=0&&b!=0&&c!=0){
                System.out.println("user two is the winner");
                return 4;
            }//7
            a=0;b=0;c=0;
            for (int h = 0; h < 5; h++) {

                if(t[h]==1){
                    a++;
                }
                else if(t[h]==5){
                    b++;
                }else if(t[h]==9){
                    c++;
                }
            }
            if(a!=0&&b!=0&&c!=0){
                System.out.println("user two is the winner");
                return 4;
            }//8
            a=0;b=0;c=0;
            for (int h = 0; h < 5; h++) {

                if(t[h]==3){
                    a++;
                }
                else if(t[h]==5){
                    b++;
                }else if(t[h]==7){
                    c++;
                }
            }
            if(a!=0&&b!=0&&c!=0){
                System.out.println("user two is the winner");
                return 4;
            }
            return 1;
        }

    }

