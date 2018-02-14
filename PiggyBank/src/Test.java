
public class Test {
	static PiggyBank piggy1 = new PiggyBank(1,1,1,1,1);
	static PiggyBank piggy2 = new PiggyBank(1,1,1,1,1);
	public static void main(String arg[]) {	
		piggy1.depositCoins(PiggyBank.Coin.DIME);
		piggy1.depositCoins(PiggyBank.Coin.DIME);
		piggy1.depositCoins(PiggyBank.Coin.DIME);
		piggy1.depositCoins(PiggyBank.Coin.QUARTER);
		piggy1.depositCoins(PiggyBank.Coin.QUARTER);
		piggy1.depositCoins(PiggyBank.Coin.QUARTER);
		piggy1.depositCoins(PiggyBank.Coin.DOLLARCOIN);
		piggy1.depositCoins(PiggyBank.Coin.DOLLARCOIN);
		piggy1.depositCoins(PiggyBank.Coin.DOLLARCOIN);
		piggy1.depositCoins(PiggyBank.Coin.PENNY);
		piggy1.depositCoins(PiggyBank.Coin.PENNY);
		piggy1.depositCoins(PiggyBank.Coin.PENNY);
		piggy1.depositCoins(PiggyBank.Coin.NICKEL);
		piggy1.depositCoins(PiggyBank.Coin.NICKEL);
		piggy1.depositCoins(PiggyBank.Coin.NICKEL);
		
		//TESTS//
		
		System.out.println("testDepositDollarCoinPiggy1()" + testDepositDollarCoinPiggy1());
		System.out.println("testDepositQuarterPiggy1()" + testDepositQuarterPiggy1());
		System.out.println("testDepositDimesPiggy1()" + testDepositDimesPiggy1());
		System.out.println("testDepositNickelPiggy1()" + testDepositNickelPiggy1());
		System.out.println("testDepositPennyPiggy1()" + testDepositPennyPiggy1());
		
		try {
			piggy1.withdrawCoins(PiggyBank.Coin.DIME, 3);
			piggy1.withdrawCoins(PiggyBank.Coin.QUARTER, 3);
			piggy1.withdrawCoins(PiggyBank.Coin.DOLLARCOIN, 3);
			piggy1.withdrawCoins(PiggyBank.Coin.PENNY, 3);
			piggy1.withdrawCoins(PiggyBank.Coin.NICKEL, 3);
		} catch (CoinWithdrawalException e) {
			e.printStackTrace();
		}	
		System.out.println(piggy1.equalTo(piggy2));
		
		//TESTS//
		System.out.println("testEqualsTo()" + testEqualsTo());
		System.out.println("testWithdrawDollarCoinsPiggy1()" + testWithdrawDollarCoinsPiggy1());
		System.out.println("testWithdrawQuartersPiggy1()" + testWithdrawQuartersPiggy1());
		System.out.println("testWithdrawDimesPiggy1()" + testWithdrawDimesPiggy1());
		System.out.println("testWithdrawNickelsPiggy1()" + testWithdrawNickelsPiggy1());
		System.out.println("testWithdrawPenniesPiggy1()" + testWithdrawPenniesPiggy1());
	}
	
	public static boolean testDepositDollarCoinPiggy1() {
		return piggy1.getCoin(PiggyBank.Coin.DOLLARCOIN) == 4 ? true : false ;	
	}
	
	public static boolean testDepositQuarterPiggy1() {
		return piggy1.getCoin(PiggyBank.Coin.QUARTER) == 4 ? true : false ;	
	}
	
	public static boolean testDepositDimesPiggy1() {
		return piggy1.getCoin(PiggyBank.Coin.DIME) == 4 ? true : false ;	
	}
	
	public static boolean testDepositNickelPiggy1() {
		return piggy1.getCoin(PiggyBank.Coin.NICKEL) == 4 ? true : false ;	
	}
	
	public static boolean testDepositPennyPiggy1() {
		return piggy1.getCoin(PiggyBank.Coin.PENNY) == 4 ? true : false ;	
	}
	
	public static boolean testWithdrawDollarCoinsPiggy1() {
		return piggy1.getCoin(PiggyBank.Coin.DOLLARCOIN) == 1 ? true : false ;	
	}
	
	public static boolean testWithdrawQuartersPiggy1() {
		return piggy1.getCoin(PiggyBank.Coin.QUARTER) == 1 ? true : false ;	
	}
	
	public static boolean testWithdrawDimesPiggy1() {
		return piggy1.getCoin(PiggyBank.Coin.DIME) == 1 ? true : false ;	
	}
	
	public static boolean testWithdrawNickelsPiggy1() {
		return piggy1.getCoin(PiggyBank.Coin.NICKEL) == 1 ? true : false ;	
	}
	
	public static boolean testWithdrawPenniesPiggy1() {
		return piggy1.getCoin(PiggyBank.Coin.PENNY) == 1 ? true : false ;	
	}
	
	public static boolean testEqualsTo() {
		return piggy1.equalTo(piggy2) == true ? true : false;
	}
}