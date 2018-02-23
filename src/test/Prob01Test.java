package test;

import prob01.*;

public class Prob01Test {
	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println(randomize(1, 9)); // 1~9까지 생성
		System.out.println(randomize(1, 9));
		System.out.println(randomize(0, 8)); // 0~8까지 생성, 배열 인덱스
	}
	
	private static int randomize( int lNum, int rNum ) {
        int random = (int) ( Math.random() * rNum ) + lNum;
        return random;
	}
}
