package src.java.test;

import junit.framework.Assert;
import src.java.dao.BankAccount;

import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {

	@Test
	public void testDebitWithSufficientFunds() {
		BankAccount account = new BankAccount(10);
		double amount = account.debit(5.0);
		Assert.assertEquals(5.0, amount);

	}

	@Test
	public void testDebitWithInSufficientFunds() {
		BankAccount account = new BankAccount(11);
		double amount = account.debit(5.0);
		Assert.assertEquals(10.0, amount);

	}
}
