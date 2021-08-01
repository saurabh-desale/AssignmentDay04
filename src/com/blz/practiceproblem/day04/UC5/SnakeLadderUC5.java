package com.blz.practiceproblem.day04.UC5;

import java.util.concurrent.ThreadLocalRandom;

public class SnakeLadderUC5 {
    public static void main(String[] args) {
        int firstPlayer =0;
       firstPlayerPosition(firstPlayer);
	}

	public static void firstPlayerPosition(int firstPlayer) {
		do {
		int randomNum = ThreadLocalRandom.current().nextInt(1,6+1);
       System.out.println(+randomNum);
       int choice = ThreadLocalRandom.current().nextInt(1,3+1);
       switch(choice) {
       case 1:System.out.println("noPlay");
       firstPlayer=0+firstPlayer;       
    	   break;
       case 2:System.out.println("Ladder");
       firstPlayer=randomNum+firstPlayer;
       if(firstPlayer>100) {
              firstPlayer=firstPlayer-randomNum;    	   
       }
       break;
       case 3:System.out.println("Snake");
       firstPlayer=firstPlayer-randomNum;
       if(firstPlayer<=0) {
    	   firstPlayer=0;
       }
       break;
       }
    	   
       
       System.out.println("position of first player position is: "+firstPlayer);
		}while (firstPlayer<100);
	}


}
