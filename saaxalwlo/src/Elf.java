class Elf extends WorkshopMember implements ChristmasCelebrator {
    private int skillLevel;
    private String elfType;
    private int experience;

    public Elf(String name, String nickName, int age, int skillLevel, String elfType) {
        super(name, nickName, age);
        this.skillLevel = skillLevel;
        this.elfType = elfType;
        this.experience = 0;
    }

    public void makeToy() {
        System.out.println(getName() + " aketebs satamashlos!");
        increaseExperience();
    }

    public void wrapGifts() {
        System.out.println(getName() + " axvebs sachukrebs!");
        increaseExperience();
    }

    private void increaseExperience() {
        experience = experience + 10;
        System.out.println(getName() + "-is gamocdileba gaizarda! gamocdileba: " + experience);
    }

    public void celebrateChristmas() {
        System.out.println(getName() + " aghnishnavs shobas!");
    }

    public void hostChristmasParty() {
        System.out.println(getName() + " maspindzlobs sashabao tsveulebs!");
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public String getElfType() {
        return elfType;
    }

    public void setElfType(String elfType) {
        this.elfType = elfType;
    }

    public int getExperience() {
        return experience;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Elf elf = (Elf) o;
        if (skillLevel == elf.skillLevel && getName().equals(elf.getName()) && elfType.equals(elf.elfType)) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = getName().hashCode();
        result = result + skillLevel * 31;
        result = result + elfType.hashCode();
        return result;
    }

    public String toString() {
        return "Elf{name='" + getName() + "', skillLevel=" + skillLevel + ", elfType='" + elfType + "', experience=" + experience + "}";
    }
}
