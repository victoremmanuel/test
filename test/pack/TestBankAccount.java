package test;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {

@Test
public void testDebitWithSufficientFunds(){
 BankAccount account = new Bankaccount(10);
 double amount =amount.debit(5);
	Assert.assertEquals(5.0, amount);

}
}
