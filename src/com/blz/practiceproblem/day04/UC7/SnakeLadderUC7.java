package com.blz.practiceproblem.day04.UC7;

import java.util.concurrent.ThreadLocalRandom;

public class SnakeLadderUC7 {
	static int dieOne = 0;
	static int dieTwo = 0;
    public static void main(String[] args) {
        int firstPlayer =0;
        int secondPlayer =0;
	firstPlayerPosition(firstPlayer);
	secondPlayerPosition(secondPlayer);
	//if (firstPlayerPosition(dieOne)==secondPlayerPosition(dieTwo)) {
	System.out.println("1st player rolled dice: "+dieOne+"times\n 2nd player rolled dice: "+dieTwo+"times");
	if (dieOne<dieTwo) {
     	   System.out.println("first Player won the game");
       }
	else {
		System.out.println("second Player won the game");
		
	}
	}

	public static void firstPlayerPosition(int firstPlayer) {
		
		do {
			dieOne++;
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
       randomNum = ThreadLocalRandom.current().nextInt(1,6+1);
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
		System.out.println("first player dice rolled :"+dieOne+"times");
	}
	public static void secondPlayerPosition(int secondPlayer) {
		
		do {
			dieTwo++;
			int randomNum = ThreadLocalRandom.current().nextInt(1,6+1);
			System.out.println(+randomNum);
			int choice = ThreadLocalRandom.current().nextInt(1,3+1);
			switch(choice) {
			case 1:System.out.println("noPlay");
			secondPlayer=0+secondPlayer;       
			break;
			case 2:System.out.println("Ladder");
			secondPlayer=randomNum+secondPlayer;
			if(secondPlayer>100) {
				secondPlayer=secondPlayer-randomNum;    	   
			}
			randomNum = ThreadLocalRandom.current().nextInt(1,6+1);
			secondPlayer=randomNum+secondPlayer;
			if(secondPlayer>100) {
				secondPlayer=secondPlayer-randomNum;    	   
			}
			break;
			case 3:System.out.println("Snake");
			secondPlayer=secondPlayer-randomNum;
			if(secondPlayer<=0) {
				secondPlayer=0;
			}
			break;
			}
			
			
			System.out.println("position of second player position is: "+secondPlayer);
		}while (secondPlayer<100);
		System.out.println("second player dice rolled :"+dieTwo+"times");
	}



}
