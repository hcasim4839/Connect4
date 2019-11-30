package com.citytech.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import com.citytech.service.Connect4Service;

public final class TestRow3 {
	
	@Test
	public final void testRow3a() {
		String[] moves = 
					{"?","?","?","?","?","?","?"
					,"?","?","?","?","?","?","?"
					,"X","X","X","X","?","?","?"
					,"?","?","?","?","?","?","?"
					,"?","?","?","?","?","?","?"
					,"?","?","?","?","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 14 && winners[1] == 15
				&& winners[2] == 16 && winners[3] == 17;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));
	}
	
	@Test
	public final void testRow3b() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","X","X","X","X","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 15 && winners[1] == 16
				&& winners[2] == 17 && winners[3] == 18;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));		
	}
	
	@Test
	public final void testRow3c() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","O","O","O","O","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 16 && winners[1] == 17
				&& winners[2] == 18 && winners[3] == 19;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));
	}
	
	@Test
	public final void testRow3d() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","O","O","O","X"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners.length == 0;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));
	}
}
