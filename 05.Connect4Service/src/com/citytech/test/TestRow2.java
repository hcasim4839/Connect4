package com.citytech.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import com.citytech.service.Connect4Service;

public final class TestRow2 {
	
	@Test
	public final void testRow2a() {
		String[] moves = {
				"?","?","?","?","?","?","?",
				"X","X","X","X","?","?","?"
				,"?","?","?","?","?","?","?"
				,"?","?","?","?","?","?","?"
				,"?","?","?","?","?","?","?"
				,"?","?","?","?","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 7 && winners[1] == 8
				&& winners[2] == 9 && winners[3] == 10;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));
	}
	
	@Test
	public final void testRow2b() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","X","X","X","X","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 8 && winners[1] == 9
				&& winners[2] == 10 && winners[3] == 11;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));		
	}
	
	@Test
	public final void testRow2c() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","O","O","O","O","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 9 && winners[1] == 10
				&& winners[2] == 11 && winners[3] == 12;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));
	}
	
	@Test
	public final void testRow2d() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","O","O","O","X"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners.length == 0;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));
	}
}
