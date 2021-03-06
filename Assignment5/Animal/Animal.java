
public abstract class Animal {
	String breed;
	int age;
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Animal(String breed, int age) {
		super();
		this.breed = breed;
		this.age = age;
	}
	
	public abstract void makeNoise();
	public abstract void jump();
	
}
