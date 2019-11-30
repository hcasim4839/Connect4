package com.citytech.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import com.citytech.service.Connect4Service;

public final class TestRow4 {
	
	@Test
	public final void testRow4a() {
		String[] moves = 
					{"?","?","?","?","?","?","?"
					,"?","?","?","?","?","?","?"
					,"?","?","?","?","?","?","?"
					,"X","X","X","X","?","?","?"
					,"?","?","?","?","?","?","?"
					,"?","?","?","?","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 21 && winners[1] == 22
				&& winners[2] == 23 && winners[3] == 24;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));
	}
	
	@Test
	public final void testRow4b() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","X","X","X","X","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 22 && winners[1] == 23
				&& winners[2] == 24 && winners[3] == 25;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));		
	}
	
	@Test
	public final void testRow4c() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","O","O","O","O","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 23 && winners[1] == 24
				&& winners[2] == 25 && winners[3] == 26;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));
	}
	
	@Test
	public final void testRow4d() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","O","O","O","X"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners.length == 0;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));
	}
}
