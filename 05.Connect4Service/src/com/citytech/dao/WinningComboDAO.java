package com.citytech.dao;

import com.citytech.service.Connect4Service;

public final class WinningComboDAO {
	public static void main(String[] args) {
		WinningCombo[] combos = Connect4Service.getAll();
		for (WinningCombo winningCombo : combos) {
			System.out.println(winningCombo);
		}
	}
}