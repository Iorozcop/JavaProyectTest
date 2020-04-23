package logic;

import model.Ally;

public class OperationAlly {
	
	public static boolean effectiveAtack(Ally aliado1, int attack) {
		boolean effectiveAttack;
		
		if (attack > aliado1.getArmour()) {
			effectiveAttack = true;
			System.out.println("Tu ataque ha sido efectivo");
		} else {
			effectiveAttack= false;
			System.out.println("Tu ataque no ha tenido efecto");
		}
		
		return effectiveAttack;
	}

	public static int calculationLife(Ally aliado1, int attack) {
	
		int lifeAfterAttack = aliado1.getTotalLife() - (attack/2);
		
		if((attack/2)>=aliado1.getTotalLife()) {
			System.out.println(aliado1.getName() + " está muerto");
		}else {
			System.out.println("Tu ataque ha infringido daño a " + aliado1.getName());
		}
		return lifeAfterAttack;
	}
}
