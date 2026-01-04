public class Pet {
    private int petId;
    private String name;
    private String species;
    private int age;

    // !Constructor using setters for validation
    public Pet(int petId, String name, String species, int age) {
        setPetId(petId);
        setName(name);
        setSpecies(species);
        setAge(age);
    }

    // !Validation: ID must be a positive number
    public void setPetId(int petId) {
        this.petId = (petId > 0) ? petId : 0;
    }

    // !Encapsulation with data protection
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            this.name = "Unknown Pet";
        }
    }

    public void setSpecies(String species) {
        this.species = (species != null) ? species : "Unknown";
    }

    // !Validation: Age cannot be negative
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Warning: Age cannot be negative. Setting to 0.");
            this.age = 0;
        }
    }

    // Getters
    public int getPetId() { return petId; }
    public String getName() { return name; }
    public String getSpecies() { return species; }
    public int getAge() { return age; }

    // Logic: check if the pet is young
    public boolean isYoung() {
        return age < 2;
    }

    // Logic: determine life stage based on age
    public String getLifeStage() {
        if (age < 1) return "Infant";
        else if (age < 5) return "Adult";
        else return "Senior";
    }

    @Override
    public String toString() {
        return "Pet [ID=" + petId + ", Name=" + name + ", Species=" + species + ", Age=" + age + "]";
    }
}