/*
 * 
 * Shawn Bolin
 */
public class Clothing {

	private String type;
	private String color;

	public Clothing() {
		this.setColor("Black");
		this.setType("Socks");
	}

	public Clothing(String type, String color) {
		this.setColor(color);
		this.setType(type);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		if (type.equalsIgnoreCase("Undergarment") || type.equalsIgnoreCase("Socks") || type.equalsIgnoreCase("Top") ||
				type.equalsIgnoreCase("Bottom") || type.equalsIgnoreCase("Cape") || type.equalsIgnoreCase("Stockings")) {
			this.type = type;
		}
		else {
			this.type = "Socks";
		}
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if (color.equalsIgnoreCase("Brown") || color.equalsIgnoreCase("Red") || color.equalsIgnoreCase("Pink") || color.equalsIgnoreCase("Black") ||
				color.equalsIgnoreCase("White") || color.equalsIgnoreCase("Orange") || color.equalsIgnoreCase("Green") || color.equalsIgnoreCase("Blue") || 
				color.equalsIgnoreCase("Purple") ||color.equalsIgnoreCase("Grey")) {
			this.color = color;
		}
		else {
			this.color = "Black";
		}
	}
	public String toString() {
		return "Clothing Type: " + this.getType() + ". Color: " + this.getColor() + ".";
	}
	public boolean equals(Clothing aC) {
		return aC != null &&
				this.getColor().equalsIgnoreCase(aC.getColor()) &&
				this.getType().equalsIgnoreCase(aC.getType());
	}


}
