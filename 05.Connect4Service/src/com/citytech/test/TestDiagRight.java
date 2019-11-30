package com.citytech.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import com.citytech.service.Connect4Service;

public final class TestDiagRight {

	@Test
	public final void testDiag58() {
		String[] moves = 
					{"?","?","?","?","?","?","?"
					,"?","?","?","?","?","?","?"
					,"?","?","?","?","?","?","X"
					,"?","?","?","?","?","X","?"
					,"?","?","?","?","X","?","?"
					,"?","?","?","X","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 20 && winners[1] == 26
				&& winners[2] == 32 && winners[3] == 38;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));
	}
	
	@Test
	public final void testDiag59() {
		String[] moves = 
					{"?","?","?","?","?","?","?"
					,"?","?","?","?","?","?","X"
					,"?","X","?","?","?","X","?"
					,"?","?","X","?","X","?","?"
					,"?","?","?","X","?","?","?"
					,"?","?","?","?","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 13 && winners[1] == 19
				&& winners[2] == 25 && winners[3] == 31;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));
	}
	
	@Test
	public final void testDiag60() {
		String[] moves = 
					{"?","?","?","?","?","?","?"
					,"?","?","?","?","?","?","?"
					,"?","X","?","?","?","X","?"
					,"?","?","X","?","X","?","?"
					,"?","?","?","X","?","?","?"
					,"?","?","X","?","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 19 && winners[1] == 25
				&& winners[2] == 31 && winners[3] == 37;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));
	}
	
	@Test
	public final void testDiag61() {
		String[] moves = 
					{"?","?","?","?","?","?","X"
					,"?","X","?","?","?","X","?"
					,"?","?","X","?","X","?","?"
					,"?","?","?","X","?","?","?"
					,"?","?","?","?","?","?","?"
					,"?","?","?","?","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 6 && winners[1] == 12
				&& winners[2] == 18 && winners[3] == 24;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));
	}
	
	@Test
	public final void testDiag62() {
		String[] moves = 
					{"?","?","?","?","?","?","?"
					,"?","X","?","?","?","X","?"
					,"?","?","X","?","X","?","?"
					,"?","?","?","X","?","?","?"
					,"?","?","X","?","?","?","?"
					,"?","?","?","?","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 12 && winners[1] == 18
				&& winners[2] == 24 && winners[3] == 30;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));
	}
	
	@Test
	public final void testDiag63() {
		String[] moves = 
					{"?","?","?","?","?","?","?"
					,"?","?","?","?","?","?","?"
					,"?","?","?","?","X","?","?"
					,"?","?","?","X","?","?","?"
					,"?","?","X","?","?","?","?"
					,"?","X","?","?","?","?","?"};
		
		int[] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 18 && winners[1] == 24
				&& winners[2] == 30 && winners[3] == 36;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));
	}	
}
