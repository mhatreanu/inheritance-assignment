package com.capgemini.bankapp.tests;
import org.junit.Test;

import com.capgemini.bankapp.model.BankAccount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;


public class BankAccountTest {

	private BankAccount account;
	
	@Before
	public void setUp() {
		account=new BankAccount(101,"John","SAVING",45000);
	}
	
	@Test
	public void testBankAccountIsCreatedWithDefaultConstructor() {
		BankAccount account=new BankAccount();
		assertNotNull(account);
	}

	@Test
	public void testBankAccountIsCreatedWithParameterizedConstructor() {
		BankAccount account=new BankAccount(101,"John","SAVING",4500);
		assertNotNull(account);
		assertEquals(101,account.getAccountId());
		assertEquals("John",account.getAccountHolderName());
		assertEquals("SAVING",account.getAccountType());
		assertEquals(4500,account.getAccountBalance(),0.01);
	}
	
	@Test
	public void testBankAccountCurrentBalance() {
		assertEquals(45000,account.getAccountBalance(),0.01);
	}
	
	@Test
	public void testWithdrawWithSufficientFund() {
		account.withdraw(5000);
		assertEquals(40000,account.getAccountBalance(),0.01);
	}
	
	@Test
	public void testWithdrawWithInsufficientFund() {
		account.withdraw(50000);
		assertEquals(45000,account.getAccountBalance(),0.01);
	}
	
	@Test
	public void testDeposite() {
		account.deposite(5000);
		assertEquals(50000,account.getAccountBalance());
	}
}
