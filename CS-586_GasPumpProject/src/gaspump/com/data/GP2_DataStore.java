package gaspump.com.data;

//DataStore for GasPump2
public class GP2_DataStore extends DataStore {

	int regularGPrice2; // the price of Regular gas per liter
	int premiumGPrice2; // the price of Premium gas per liter
	int superGPrice2; // the price of Super gas per liter
	int L; // number of liter
	float price; // stores the selected gas price
	int cash; // store cash from user
	int tempCash; // store temporary cash from user
	float totalCost; // total cost of user
	int tempRegularGPrice2; // temporary price of Regular gas per liter
	int tempPremiumGPrice2; // temporary price of Premium gas per liter
	int tempSuperGPrice2; // temporary price of Super gas per liter

	public int getRegularGPrice2() {
		return regularGPrice2;
	}

	public void setRegularGPrice2(int regularGPrice2) {
		this.regularGPrice2 = regularGPrice2;
	}

	public int getPremiumGPrice2() {
		return premiumGPrice2;
	}

	public void setPremiumGPrice2(int premiumGPrice2) {
		this.premiumGPrice2 = premiumGPrice2;
	}

	public int getSuperGPrice2() {
		return superGPrice2;
	}

	public void setSuperGPrice2(int superGPrice2) {
		this.superGPrice2 = superGPrice2;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	public int getL() {
		return L;
	}

	public void setL(int l) {
		L = l;
	}

	public int getTempCash() {
		return tempCash;
	}

	public void setTempCash(int tempCash) {
		this.tempCash = tempCash;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public int getTempRegularGPrice2() {
		return tempRegularGPrice2;
	}

	public void setTempRegularGPrice2(int tempRegularGPrice2) {
		this.tempRegularGPrice2 = tempRegularGPrice2;
	}

	public int getTempPremiumGPrice2() {
		return tempPremiumGPrice2;
	}

	public void setTempPremiumGPrice2(int tempPremiumGPrice2) {
		this.tempPremiumGPrice2 = tempPremiumGPrice2;
	}

	public int getTempSuperGPrice2() {
		return tempSuperGPrice2;
	}

	public void setTempSuperGPrice2(int tempSuperGPrice2) {
		this.tempSuperGPrice2 = tempSuperGPrice2;
	}

}
