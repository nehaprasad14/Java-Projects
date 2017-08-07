package gaspump.com.data;

//DataStore for GasPump1
public class GP1_DataStore extends DataStore {

	float regularGPrice1; // the price of the Regular gas per gallon
	float superGPrice1; // the price of the Super gas per gallon
	int G ; // number of gallon
	float price; // stores the selected gas price
	float totalCost; // total cost of user
	float tempRegularGPrice1; // temporary price of the Regular gas per gallon
	float tempSuperGPrice1; // temporary price of the Super gas per gallon

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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getG() {
		return G;
	}

	public void setG(int g) {
		G = g;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
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
	
	
}
