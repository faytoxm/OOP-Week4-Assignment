public class Veterinarian {
    private int vetId;
    private String name;
    private String specialization;
    private int experience;

    // !Constructor with validation logic
    public Veterinarian(int vetId, String name, String specialization, int experience) {
        setVetId(vetId);
        setName(name);
        setSpecialization(specialization);
        setExperience(experience);
    }

    public void setVetId(int vetId) {
        this.vetId = (vetId > 0) ? vetId : 0;
    }
    // !Ensuring doctor name is valid
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            this.name = "Unknown Doctor";
        }
    }

    public void setSpecialization(String specialization) {
        this.specialization = (specialization != null) ? specialization : "General";
    }
    //Validation for years of experience
    public void setExperience(int experience) {
        if (experience >= 0) {
            this.experience = experience;
        } else {
            this.experience = 0;
        }
    }

    public String getName() { return name; }
    public String getSpecialization() { return specialization; }

    // Logic: check if doctor has 5+ years of experience
    public boolean isExperienced() {
        return experience >= 5;
    }

    // Logic: check if doctor can treat a specific species
    public boolean canTreat(String animalSpecies) {
        return specialization.equalsIgnoreCase(animalSpecies) || specialization.equalsIgnoreCase("General");
    }

    @Override
    public String toString() {
        return "Vet [ID=" + vetId + ", Name=" + name + ", Spec=" + specialization + ", Exp=" + experience + " years]";
    }
}