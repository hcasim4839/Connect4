package com.citytech.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.citytech.service.Connect4Service;

class TestColumn6 {

		@Test
		void test1() {
			String[] moves = {"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"};
			
			int validPosition = Connect4Service.getValidCellMoves(moves, 5);
			assertTrue(validPosition == 40, "validPosition: " + validPosition);

		}

		@Test
		void test2() {
			String[] moves = {"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","X","?"};
			
			int validPosition = Connect4Service.getValidCellMoves(moves, 5);
			assertTrue(validPosition == 33, "validPosition: " + validPosition);
		
		}

		@Test
		void test3() {
			String[] moves = {"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","O","?"
					         ,"?","?","?","?","?","X","?"};
			
			int validPosition = Connect4Service.getValidCellMoves(moves, 5);
			assertTrue(validPosition == 26, "validPosition: " + validPosition);
		
		}

		@Test
		void test4() {
			String[] moves = {"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","X","?"
					         ,"?","?","?","?","?","O","?"
					         ,"?","?","?","?","?","X","?"};
			
			int validPosition = Connect4Service.getValidCellMoves(moves, 5);
			assertTrue(validPosition == 19, "validPosition: " + validPosition);
		
		}

		@Test
		void test5() {
			String[] moves = {"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","O","?"
					         ,"?","?","?","?","?","X","?"
					         ,"?","?","?","?","?","O","?"
					         ,"?","?","?","?","?","X","?"};
			
			int validPosition = Connect4Service.getValidCellMoves(moves, 5);
			assertTrue(validPosition == 12, "validPosition: " + validPosition);
		
		}

		@Test
		void test6() {
			String[] moves = {"?","?","?","?","?","?","?"
					         ,"?","?","?","?","?","X","?"
					         ,"?","?","?","?","?","O","?"
					         ,"?","?","?","?","?","X","?"
					         ,"?","?","?","?","?","O","?"
					         ,"?","?","?","?","?","X","?"};
			
			int validPosition = Connect4Service.getValidCellMoves(moves, 5);
			assertTrue(validPosition == 5, "validPosition: " + validPosition);
		
		}
	}
