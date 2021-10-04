package com.company;
import java.util.*;
class Matrix_20BAI1159 {
        public static void main(String[] args) {
            int [][] A={{40,50},{50,60},{38,30}};
            int [][] B={{25,30},{23,26},{28,22}};
            int sum[][]=new int[1][2];
            int i,j,k;
            System.out.println("The sales of the day are :");
            for (i=0;i<3;i++){
                for (j=0;j<2;j++)
                    System.out.print(A[i][j]-B[i][j]+" ");
                System.out.println(" ");}
            sum[0][0]=(A[0][0]-B[0][0])*30+(A[1][0]-B[1][0])*40+(A[2][0]-B[2][0])*50;
            sum[0][1]=(A[0][1]-B[0][1])*30+(A[1][1]-B[1][1])*40+(A[2][1]-B[2][1])*50;
            System.out.println("The total profit for each brand is");
            System.out.println(sum[0][0]+" "+sum[0][1]);
            System.out.println("The total profit of the day is "+(sum[0][0]+sum[0][1]));
            if ((sum[0][0]+sum[0][1])>5000)
                System.out.println("Awesome");
            else
                System.out.println("Success");}}

