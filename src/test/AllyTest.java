package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import logic.OperationAlly;
import model.Ally;

class AllyTest {

	@Test
	void testEffectiveAtack() {
		Ally ally1= new Ally(100, 50, "Filerea", "Elfo");
		assertEquals(true, OperationAlly.effectiveAtack(ally1, 200));
	}

	@Test
	void testCalculationLife() {
		Ally ally1= new Ally(100, 50, "Filerea", "Elfo");
		assertEquals(50, OperationAlly.calculationLife(ally1, 100));
	}

}
