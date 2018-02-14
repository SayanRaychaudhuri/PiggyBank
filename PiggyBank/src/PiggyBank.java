public class PiggyBank {
	private int dollarCoins, quarters, dimes, nickels, pennies, amount;
	private int numCoins;
	public enum Coin {
		DOLLARCOIN,
		QUARTER,
		DIME,
		NICKEL,
		PENNY;	
	}
	
	public PiggyBank(int dollarCoins, int quarters, int dimes, int nickels, int pennies) {
		this.dollarCoins = dollarCoins;
		this.quarters = quarters;
		this.dimes = dimes;
		this.nickels = nickels;
		this.pennies = pennies;
	}
	
	public void depositCoins(Coin coin) {
		switch(coin) {
			case DOLLARCOIN:
				dollarCoins++;
				break;
			case QUARTER:
				quarters++;
				break;
			case DIME:
				dimes++;
				break;
			case NICKEL:
				nickels++;
				break;
			case PENNY:
				pennies++;
				break;
				
		}
	}
	
	public void withdrawCoins(Coin coin, int numCoins) throws CoinWithdrawalException {
		this.numCoins = numCoins;
		switch(coin) {
		case DOLLARCOIN:
			if (dollarCoins>=numCoins) {
			dollarCoins -= numCoins;
			} else {
				throw new CoinWithdrawalException("You can't withraw more " + coin + "s than you have. You have " + dollarCoins + " " + coin);
			}
			break;
		case QUARTER:
			if (quarters>=numCoins) {
			quarters -= numCoins;
			} else {
				throw new CoinWithdrawalException("You can't withraw more " + coin + "s than you have. You have " + quarters + " " + coin);
			}
			break;
		case DIME:
			if (dimes>=numCoins) {
			dimes -= numCoins;
			} else {
				throw new CoinWithdrawalException("You can't withraw more " + coin + "s than you have. You have " + dimes + " " + coin);
			}
			break;
		case NICKEL:
			if (nickels>=numCoins) {
			nickels -= numCoins;
			} else {
				throw new CoinWithdrawalException("You can't withraw more " + coin + "s than you have. You have " + nickels + " " + coin);
			}
			break;
		case PENNY:
			if (pennies>=numCoins) {
			pennies -= numCoins;
			} else {
				throw new CoinWithdrawalException("You can't withraw more " + coin + "s than you have. You have " + pennies + " " + coin);
			}
			break;
		}
	}
	
	public int getNumCoins() {
		return numCoins;
	}
	
	public int getAmount() {
		return amount = dollarCoins*100 + quarters*25 + dimes*10 + nickels*5 + pennies;
	}
	
	public int getCoin(Coin coin) {
		switch(coin) {
		case DOLLARCOIN:
			return dollarCoins;
		case QUARTER:
			return quarters;
		case DIME:
			return dimes;
		case NICKEL:
			return nickels;
		case PENNY:
			return pennies;
		default:
			return -1;
	}
		
	}
	public boolean equalTo(PiggyBank piggy) {
		return getAmount() == piggy.getAmount();
	}
}