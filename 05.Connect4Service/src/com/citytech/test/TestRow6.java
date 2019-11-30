package com.citytech.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import com.citytech.service.Connect4Service;

public final class TestRow6 {
	
	@Test
	public final void testRow6a() {
		String[] moves = 
					{"?","?","?","?","?","?","?"
					,"?","?","?","?","?","?","?"
					,"?","?","?","?","?","?","?"
					,"?","?","?","?","?","?","?"
					,"?","?","?","?","?","?","?"
					,"X","X","X","X","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 35 && winners[1] == 36
				&& winners[2] == 37 && winners[3] == 38;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));
	}
	
	@Test
	public final void testRow6b() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","X","X","X","X","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 36 && winners[1] == 37
				&& winners[2] == 38 && winners[3] == 39;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));		
	}
	
	@Test
	public final void testRow6c() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","O","O","O","O","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 37 && winners[1] == 38
				&& winners[2] == 39 && winners[3] == 40;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));
	}
	
	@Test
	public final void testRow6d() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","O","O","O","X"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners.length == 0;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));
	}
}
