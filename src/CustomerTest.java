import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class CustomerTest {


	@Test
	void testStatement() {
		Movie aladdin= new Movie("Aladdin", 2);
		Movie detetivePikachu= new Movie("DetetivePikachu", 1);
		Movie sherlockHolmes = new Movie("SherlockHolmes", 0);

		Rental rentalAladdin= new Rental(aladdin, 5);
		Rental rentalPikachu= new Rental(detetivePikachu, 3);
		Rental rentalSherlock= new Rental(sherlockHolmes, 2);

		Customer antonio= new Customer("Antonio");

		antonio.addRental(rentalAladdin);
		antonio.addRental(rentalPikachu);
		antonio.addRental(rentalSherlock);

		//Checar qual é o output disso
		String result= antonio.statement();
		String expected = "Rental Record for Antonio\n" + 
				"\tAladdin\t4.5\n" + 
				"\tDetetivePikachu\t9.0\n" + 
				"\tSherlockHolmes\t2.0\n" + 
				"Amount owed is 15.5\n" + 
				"You earned 4 frequent renter points";

		//Teste de fato
		assertEquals(expected, result);
	}
}
