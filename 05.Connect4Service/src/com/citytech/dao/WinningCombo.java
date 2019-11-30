package com.citytech.dao;

public final class WinningCombo {

	public int moveOne;
	public int moveTwo;
	public int moveThree;
	public int moveFour;

	public WinningCombo(String m1, String m2, String m3, String m4) {
		moveOne = Integer.parseInt(m1);
		moveTwo = Integer.parseInt(m2);
		moveThree = Integer.parseInt(m3);
		moveFour = Integer.parseInt(m4);
	}

	public int[] toArray() {
		return new int[] { moveOne, moveTwo, moveThree, moveFour };
	}

	@Override
	public String toString() {
		return String.format("Winning Combo: %d, %d, %d, %d", moveOne, moveTwo, moveThree, moveFour);
	}
}
