package com.citytech.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import com.citytech.dao.WinningCombo;

public final class Connect4Service {
	private static final String WINNING_COMBO = "winning-combination.txt";
	public static WinningCombo[] Combos = null;	

	public static final WinningCombo[] getAll() {
		WinningCombo[] combos = null;

		try {
			Path path = Paths.get(Connect4Service.class.getResource(WINNING_COMBO).toURI());
			String[] lines;
			try (Stream<String> stream = Files.lines(path)) {
				lines = stream.toArray(String[]::new);
			}

			combos = new WinningCombo[lines.length - 1];
			for (int i = 0; i < lines.length; i++) {
				if (i == 0)
					continue;

				String line = lines[i];
				String[] splits = line.split(",");
				WinningCombo combo = new WinningCombo(splits[2], splits[3], splits[4], splits[5]);
				combos[i - 1] = combo;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Combos = combos;
		return combos;
	}

	public static final int getValidCellMoves(String[] moves, int move) {
		int p = move;

		while (p < moves.length) {
			boolean status = moves[p].equals("?");

			if (!status)
				break;

			p += 7;
		}

		return p -= 7;
	}

	public static int[] getWinner(String[] moves) {
		int[] status = {};

		WinningCombo[] combos = Combos == null ? getAll() : Combos;
		for (WinningCombo combo : combos) {
			
			if (!isMatch(moves[combo.moveOne], moves[combo.moveTwo], moves[combo.moveThree], moves[combo.moveFour]))
				continue;
			
			status = combo.toArray();
			break;
		}

		return status;
	}

	private final static boolean isMatch(String m1, String m2, String m3, String m4) {
		return m1.equals(m2) && m2.equals(m3) && m3.equals(m4) && !m1.equals("?");
	}
}