package VivekFurniture;

public abstract class Bero{
	protected String beroType;
	protected String beroColour;
	protected double price;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public String getBeroType() {
		return beroType;
	}
	public void setBeroType(String beroType) {
		this.beroType=beroType;
	}
	public String getBeroColour() {
        return beroColour;
    }
	public void setBeroColour(String BeroColour) {
		this.beroColour=beroColour;
	}
	public Bero(String beroType,String beroColour) {
        this.beroType=beroType;
        this.beroColour=beroColour;
    }
    public abstract void calculatePrice();

}
