package com.citytech.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import com.citytech.service.Connect4Service;

public final class TestRow5 {
	
	@Test
	public final void testRow5a() {
		String[] moves = 
					{"?","?","?","?","?","?","?"
					,"?","?","?","?","?","?","?"
					,"?","?","?","?","?","?","?"
					,"?","?","?","?","?","?","?"
					,"X","X","X","X","?","?","?"
					,"?","?","?","?","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 28 && winners[1] == 29
				&& winners[2] == 30 && winners[3] == 31;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));
	}
	
	@Test
	public final void testRow5b() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","X","X","X","X","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 29 && winners[1] == 30
				&& winners[2] == 31 && winners[3] == 32;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));		
	}
	
	@Test
	public final void testRow5c() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","O","O","O","O","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 30 && winners[1] == 31
				&& winners[2] == 32 && winners[3] == 33;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));
	}
	
	@Test
	public final void testRow5d() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","O","O","O","X"
				         ,"?","?","?","?","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners.length == 0;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));
	}
}
