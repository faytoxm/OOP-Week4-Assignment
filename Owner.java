public class Owner {
    private int ownerId;
    private String name;
    private String phone;
    private int numberOfPets;

    // !Constructor ensuring data protection through setters
    public Owner(int ownerId, String name, String phone, int numberOfPets) {
        setOwnerId(ownerId);
        setName(name);
        setPhone(phone);
        setNumberOfPets(numberOfPets);
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = (ownerId > 0) ? ownerId : 0;
    }
    // !Name validation
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            this.name = "Unknown Owner";
        }
    }

    public void setPhone(String phone) {
        this.phone = (phone != null) ? phone : "No Phone";
    }
    // !Protection against negative pet count
    public void setNumberOfPets(int numberOfPets) {
        if (numberOfPets >= 0) {
            this.numberOfPets = numberOfPets;
        } else {
            this.numberOfPets = 0;
        }
    }

    public int getOwnerId() { return ownerId; }
    public String getName() { return name; }
    public int getNumberOfPets() { return numberOfPets; }

    // Logic: increment pet count
    public void addPet() {
        this.numberOfPets++;
    }

    // Logic: frequent client has more than 2 pets
    public boolean isFrequentClient() {
        return numberOfPets > 2;
    }

    @Override
    public String toString() {
        return "Owner [ID=" + ownerId + ", Name=" + name + ", Phone=" + phone + ", Pets=" + numberOfPets + "]";
    }
}