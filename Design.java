package tictactoe;

public class Design {

        int s;
        int y;
        public int d(int b, int a,int[] arr,int[] o,int[] t) {
            // arr[a] = b;
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {

                    if (j % 2 == 0 && i % 2 == 0) {
                        System.out.print(" ");
                    } else if (j % 2 != 0 && i % 2 != 0) {

                        //1
                        if (i == 1 && j == 1 && b == 1) {
                            if(a%2==0){ System.out.print(" X ");}
                            else{
                                System.out.print(" O ");}
                        } else if (i == 1 && j == 1) {
                            s = 0;
                            y=0;
                            for (int h = 0; h < 5; h++) {
                                if (o[h] == 1) {
                                    System.out.print(" X ");
                                    s++;
                                } else if(t[h]==1) {
                                    System.out.print(" O ");
                                    y++;
                                }
                                else{
                                    System.out.print("");
                                }
                            }
                            if (s == 0&&y==0) {
                                System.out.print(" 1 ");
                            }
                        }//2
                        if (i == 1 && j == 3 && b == 2) {
                            if(a%2==0){ System.out.print(" X ");}
                            else{
                                System.out.print(" O ");
                            }
                        } else if (i == 1 && j == 3) {
                            s = 0;
                            y=0;
                            for (int h = 0; h < 5; h++) {
                                if (o[h] == 2) {
                                    System.out.print(" X ");
                                    s++;
                                } else if(t[h]==2){
                                    System.out.print(" O ");
                                    y++;
                                }else{
                                    System.out.print("");
                                }
                            }
                            if (s == 0&& y==0) {
                                System.out.print(" 2 ");
                            }
                        }
                        //3
                        if (i == 1 && j == 5 && b == 3) {
                            if(a%2==0){System.out.print(" X ");}
                            else{
                                System.out.print(" O ");
                            }
                        } else if (i == 1 && j == 5) {
                            s = 0;
                            y=0;
                            for (int h = 0; h < 5; h++) {
                                if (o[h] == 3) {
                                    System.out.print(" X ");
                                    s++;
                                } else if(t[h]==3){
                                    System.out.print(" O ");
                                    y++;
                                }
                                else{
                                    System.out.print("");
                                }
                            }
                            if (s == 0&& y==0) {
                                System.out.print(" 3 ");
                            }
                        }//4
                        if (i == 3 && j == 1 && b == 4) {
                            if(a%2==0){System.out.print(" X ");}
                            else{
                                System.out.print(" O ");
                            }
                            //break;

                        } else if (i == 3 && j == 1) {
                            s = 0;
                            y=0;
                            for (int h = 0; h < 5; h++) {
                                if (o[h] == 4) {
                                    System.out.print(" X ");
                                    s++;
                                } else if(t[h]==4){
                                    System.out.print(" O ");
                                    y++;
                                }else{
                                    System.out.print("");
                                }
                            }
                            if (s == 0&& y==0) {
                                System.out.print(" 4 ");
                            }
                        }//5
                        if (i == 3 && j == 3 && b == 5) {
                            if(a%2==0){System.out.print(" X ");}
                            else{
                                System.out.print(" O ");
                            }
                            //break;

                        } else if (i == 3 && j == 3) {
                            s = 0;
                            y=0;
                            for (int h = 0; h < 5; h++) {
                                if (o[h] == 5) {
                                    System.out.print(" X ");
                                    s++;
                                } else if(t[h]==5){
                                    System.out.print(" O ");
                                    y++;
                                }else{
                                    System.out.print("");
                                }
                            }
                            if (s == 0&& y==0) {
                                System.out.print(" 5 ");
                            }
                        }//6
                        if (i == 3 && j == 5 && b == 6) {
                            if(a%2==0){System.out.print(" X ");}
                            else{
                                System.out.print(" O ");
                            }
                            //break;

                        } else if (i == 3 && j == 5) {
                            s = 0;
                            y=0;
                            for (int h = 0; h < 5; h++) {
                                if (o[h] == 6) {
                                    System.out.print(" X ");
                                    s++;
                                } else if(t[h]==6){
                                    System.out.print(" O ");
                                    y++;
                                }else{
                                    System.out.print("");
                                }
                            }
                            if (s == 0&&y==0) {
                                System.out.print(" 6 ");
                            }
                        }
                        //7
                        if (i == 5 && j == 1 && b == 7) {
                            if(a%2==0){System.out.print(" X ");}
                            else{
                                System.out.print(" O ");
                            }
                            //break;

                        } else if (i == 5 && j == 1) {
                            s = 0;
                            y=0;
                            for (int h = 0; h < 5; h++) {
                                if (o[h] == 7) {
                                    System.out.print(" X ");
                                    s++;
                                } else if(t[h]==7){
                                    System.out.print(" O ");
                                    y++;
                                }else{
                                    System.out.print("");
                                }
                            }
                            if (s == 0&&y==0) {
                                System.out.print(" 7 ");
                            }
                        }//8
                        if (i == 5 && j == 3 && b == 8) {
                            if(a%2==0){System.out.print(" X ");}
                            else{
                                System.out.print(" O ");
                            }
                            //break;

                        } else if (i == 5 && j == 3) {
                            s = 0;
                            y=0;
                            for (int h = 0; h < 5; h++) {
                                if (o[h] == 8) {
                                    System.out.print(" X ");
                                    s++;
                                } else if(t[h]==8){
                                    System.out.print(" O ");
                                    y++;
                                }else{
                                    System.out.print("");
                                }
                            }
                            if (s == 0&&y==0) {
                                System.out.print(" 8 ");
                            }
                        }//9
                        if (i == 5 && j == 5 && b == 9) {
                            if(a%2==0){System.out.print(" X ");}
                            else{
                                System.out.print(" O ");
                            }
                            //break;

                        } else if (i == 5 && j == 5) {
                            s = 0;
                            y=0;
                            for (int h = 0; h < 5; h++) {
                                if (o[h] == 9) {
                                    System.out.print(" X ");
                                    s++;
                                } else if(t[h]==9){
                                    System.out.print(" O ");
                                }else{
                                    System.out.print("");
                                }
                            }
                            if (s == 0&&y==0) {
                                System.out.print(" 9 ");
                            }
                        } }
                    else if (i % 2 != 0&& j % 2 == 0) {
                        System.out.print("|");
                    }
                    else {
                        System.out.print("___");
                    }

                }
                System.out.println(" ");
            }
            return arr[a];

        }
    }

