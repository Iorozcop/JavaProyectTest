package logic;

import model.Ally;

public class OperationAlly {
	
	public static int effectiveAtack(Ally aliado1, int attack) {
		int effectiveAttack = 0;
		
		if (attack > aliado1.getArmour()) {
			effectiveAttack = attack / 2;
			System.out.println("Tu ataque ha sido efectivo");
		} else {
			System.out.println("Tu ataque no ha tenido efecto");
		}
		
		return effectiveAttack;
	}

	public static int calculationLife(Ally aliado1, int effectiveAttack) {
		
		int lifeAfterAttack = aliado1.getTotalLife() - effectiveAttack;
		return lifeAfterAttack;
	}
}
