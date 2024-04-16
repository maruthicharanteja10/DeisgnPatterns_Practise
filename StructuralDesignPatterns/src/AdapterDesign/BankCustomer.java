package AdapterDesign;

import java.util.Scanner;

public class BankCustomer extends BankDetails implements CreditCard {

	@Override
	public void giveBankDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bank name :");
		String bankname = sc.next();
		System.out.println("Enter the Account Holder Name :");
		String customername = sc.next();
		System.out.println("Enter the Account Number :");
		Long accNo = sc.nextLong();
		setBankName(bankname);
		setAccHolderName(customername);
		setAccNumber(accNo);
	}

	@Override
	public String getCreditCard() {
		long accno = getAccNumber();
		String accholdername = getAccHolderName();
		String bname = getBankName();

		return ("The Account number " + accno + " of " + accholdername + " in " + bname
				+ " bank is valid and authenticated for issuing the credit card. ");
	}

}
