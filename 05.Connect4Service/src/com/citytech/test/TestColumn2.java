package com.citytech.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.citytech.service.Connect4Service;

class TestColumn2 {

	@Test
	void test1() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 1);
		assertTrue(validPosition == 36, "validPosition: " + validPosition);

	}

	@Test
	void test2() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 1);
		assertTrue(validPosition == 29, "validPosition: " + validPosition);
	
	}

	@Test
	void test3() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 1);
		assertTrue(validPosition == 22, "validPosition: " + validPosition);
	
	}

	@Test
	void test4() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 1);
		assertTrue(validPosition == 15, "validPosition: " + validPosition);
	
	}

	@Test
	void test5() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 1);
		assertTrue(validPosition == 8, "validPosition: " + validPosition);
	
	}

	@Test
	void test6() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 1);
		assertTrue(validPosition == 1, "validPosition: " + validPosition);
	
	}

}
