package gaspump.com.data;

//Data Store Class
public abstract class DataStore {

	float regularGPrice1; // the price of the Regular gas per gallon
	float superGPrice1; // the price of the Super gas per gallon
	int regularGPrice2; // the price of Regular gas per liter
	int premiumGPrice2; // the price of Premium gas per liter
	int superGPrice2; // the price of Super gas per liter
	float tempRegularGPrice1; // temporary price of the Regular gas per gallon
	float tempSuperGPrice1; // temporary price of the Super gas per gallon
	int tempRegularGPrice2; // temporary price of Regular gas per liter
	int tempPremiumGPrice2; // temporary price of Premium gas per liter
	int tempSuperGPrice2; // temporary price of Super gas per liter
	int tempCash; // store temporary cash from user
	float totalCost; // total cost of user
	int G; // number of gallon
	int L; // number of liter
	float price; // stores the selected gas price
	int cash; // store cash from user

	public float getRegularGPrice1() {
		return regularGPrice1;
	}

	public void setRegularGPrice1(float regularGPrice1) {
		this.regularGPrice1 = regularGPrice1;
	}

	public float getSuperGPrice1() {
		return superGPrice1;
	}

	public void setSuperGPrice1(float superGPrice1) {
		this.superGPrice1 = superGPrice1;
	}

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

	public int getG() {
		return G;
	}

	public void setG(int g) {
		G = g;
	}

	public int getL() {
		return L;
	}

	public void setL(int l) {
		L = l;
	}

	public float getTempRegularGPrice1() {
		return tempRegularGPrice1;
	}

	public void setTempRegularGPrice1(float tempRegularGPrice1) {
		this.tempRegularGPrice1 = tempRegularGPrice1;
	}

	public float getTempSuperGPrice1() {
		return tempSuperGPrice1;
	}

	public void setTempSuperGPrice1(float tempSuperGPrice1) {
		this.tempSuperGPrice1 = tempSuperGPrice1;
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

}
