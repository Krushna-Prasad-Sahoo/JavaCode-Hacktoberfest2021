package com.company;

public class pattern {
    public static void main(String[] args) {
        int n=3;
        pattern31(2);
        System.out.println();
        pattern1(n);
        System.out.println();
        pattern2(4);
        System.out.println();
        pattern3(3);
        System.out.println();
        pattern4(4);
        System.out.println();
        pattern5(3);
        System.out.println();
        pattern30(n);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern17(3);
        System.out.println();


    }
    static void pattern2(int n){
        for (int row = 1; row <=n; row++) {
            // for every row, run the column
            for (int col = 1; col <=n ; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    static void pattern1(int n){
        for (int row = 1; row <=n; row++) {
            // for every row, run the column
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            // for every row, run the column
            for (int col = n; col >=row ; col--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {

                System.out.print(col+" ");
            }
            System.out.println();
        }
    }static void pattern5(int n){

        for (int row = 1; row <=2*n-1 ; row++) {
            int col= row>n ? 2*n-row : row;
            for (int colum=0; colum <col; colum++) {
                System.out.print(" *");
            }

            System.out.println();
        }

    }
    static void pattern6(int n){

        for (int row = 1; row <=2*n-1 ; row++) {
            int col= row>n ? 2*n-row : row;
            int space=n-col;
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            for (int colum=0; colum <col; colum++) {
                System.out.print(" *");
            }

            System.out.println();
        }

    }
    static void pattern30(int n){
        for(int row=1;row<=n;row++){
            int space = n-row;
            for (int i = 1; i <=space; i++) {
                System.out.print("  ");
            }

            for (int col = row; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int column = 2; column <=row ; column++) {
                System.out.print(column+" ");

            }
            System.out.println();
        }

    }
    static void pattern17(int n){
        n=2*n;
        for(int row=1;row<=n;row++){

            for (int col = 0; col<=n ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();

        }

    }
    static void pattern31(int n){
        n=2*n;
        for (int row = 0; row <=n ; row++) {


            for (int col = 0; col <=n ; col++) {
                int atEveryIndex = Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");

            }
            System.out.println();

        }

    }
}
