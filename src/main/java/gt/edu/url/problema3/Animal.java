package gt.edu.url.problema3;

public class Animal {
	
	private String type;
	private int age;
	private double weight;
	private String skinColor;
	
	/**
	 * Constructor that generetes a deep attribute copy
	 * @return new instance with same values
	 */
	
	public Animal(Animal old) {
		this(old.type, old.age, old.weight, old.skinColor);
	}
	
	
	public Animal(String type, int age, double weight, String skinColor) {
		super();
		this.type = type + "";
		this.age = age;
		this.weight = weight;
		this.skinColor = skinColor + "";
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getSkinColor() {
		return skinColor;
	}
	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}
	
	public Object clone() {
		return new Animal(this);
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", age=" + age + ", weight=" + weight + ", skinColor=" + skinColor + "]";
	}
	
	
	

}
