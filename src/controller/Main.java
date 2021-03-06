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
		
	//turno de ataque enemigo:
		
		int attack=200;
		
		OperationAlly.effectiveAtack(ally1, attack);
		
		int actualLife= OperationAlly.calculationLife(ally1, attack);
		
		System.out.println("La vida actual de " + ally1.getName() + " es: " + actualLife);

	}

}
