package beans;

public class Pet {

	private int idPet;
	private String species;
	private String breed;
	private String sex;
	private int age;
	private double price;
	
	public Pet() {}
	public Pet(int idPet, String species, String breed, String sex, int age, double price) {
        this.idPet = idPet;
        this.species = species;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.price = price;
    }
	
	public Pet(String species, String breed, String sex, int age, double price) {
        this.species = species;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.price = price;
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
	
}
