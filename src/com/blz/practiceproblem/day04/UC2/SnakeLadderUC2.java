package com.blz.practiceproblem.day04.UC2;

import java.util.concurrent.ThreadLocalRandom;

public class SnakeLadderUC2 {
    public static void main(String[] args) {
           int firstPlayer =0;
          firstPlayerPosition(firstPlayer);
	}

	public static void firstPlayerPosition(int firstPlayer) {
		int randomNum = ThreadLocalRandom.current().nextInt(1,6+1);
          System.out.println(+randomNum);
          firstPlayer=firstPlayer+randomNum;
          System.out.println("position of first player position is: "+firstPlayer);
	}
}
