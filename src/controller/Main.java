package controller;

import logic.OperationAlly;
import model.Ally;

public class Main {

	public static void main(String[] args) {
		
		Ally ally1 = new Ally();
		
		ally1.setName("Maegor");
		ally1.setRace("Human");
		ally1.setArmour(50);
		ally1.setTotalLife(100);
		
		System.out.println(ally1.toString());
		
		int effectiveAttack= OperationAlly.effectiveAtack(ally1, 100);
		
		int actualLife= OperationAlly.calculationLife(ally1, effectiveAttack);
		
		System.out.println("La vida actual de " + ally1.getName() + " es: " + actualLife);

	}

}
