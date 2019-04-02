package com.company.Tasks;

import java.util.Scanner;

public class DetroitTiger {
       /*
   This is another way to assign the score values to the arrays and to return the max score
   int O(1) instead of O(n)
   public void setRunScoreByInningTigers(int Tigers[], int index, int score){
         Tigers[index] = score;
         if(score > maxA){
             maxA = score;
         }
     }
     public getHighTigers(){
     return maxA;
     }
    public void setRunScoreByInningBlueJays(int BlueJay [], int index, int score){
        BlueJays[index] = score;
        if(score > maxB)
            maxB = score;
    }
     public getHighBlueJays(){
     return maxB;
     }
    */


    private int Tigers [], BlueJays [], maxA, maxB, tigersScore, blueScore;
     String order [] = {"","first", "second", "third", "fourth", "fifth"};
     public DetroitTiger(){
         Tigers = new int[6];
         BlueJays = new int[6];
         maxA = Integer.MIN_VALUE;
         maxB = Integer.MIN_VALUE;
         tigersScore = 0; blueScore = 0;
     }
     public int teamScore(int runs[], int inning){
         System.out.println("The runs scored by this team int the "+inning+" inning is : ");
         return runs[inning];
     }
     public int teamHigh(int runs[]){
         int result = Integer.MIN_VALUE, inning = 0;
         for(int i=1; i<=5; ++i){
             if(runs[i] > result){
                 result = runs[i];
                 inning = i;
             }

         }
          return inning;
     }
     public void printBoxScore(int runsUs[], int runsThem[], int innings){
         System.out.println();
         System.out.println("-------Box Score-------");
         System.out.println("________________________");

         for(int i=1; i<=5; ++i){
             System.out.println("At the "+order[i]+" inning"+"\n"+
                     "Tigers --- Blue Jays"+"\n"+
                     "    "+Tigers[i]+ " ---- "+ BlueJays[i]+"\n");
          }
         System.out.println("Overall score \n"+
                 "Tigers --- Blue Jays"+"\n"+
                 "    "+tigersScore+ " ---- "+ blueScore+"\n");

     }



    public static void main(String[] args) {

        DetroitTiger game = new DetroitTiger();
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Detroit Tiger baseball games");
        for(int i=1; i<=5; ++i){

            System.out.print("Enter the number of runs in the " + game.order[i] + " inning by Team Tigers : ");
            game.Tigers[i] = in.nextInt();
            game.tigersScore+= game.Tigers[i];

            System.out.print("Enter the number of runs in the " + game.order[i] + " inning by Blue Jays : ");
            game.BlueJays[i] = in.nextInt();
            game.blueScore+= game.BlueJays[i];
        }
        game.printBoxScore(game.Tigers, game.BlueJays, 2);
        System.out.println("Tigers higest run score was at the "+ game.order[game.teamHigh(game.Tigers)]+" inning with \n"+
                "Blue Jays higest run score was at the "+ game.order[game.teamHigh(game.BlueJays)]+" inning");
    }
}
