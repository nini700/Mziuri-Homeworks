class Toy {
    private String type;
    private int difficultyLevel;

    public Toy(String type, int difficultyLevel) {
        this.type = type;
        this.difficultyLevel = difficultyLevel;
    }

    public boolean isChallenging() {
        if (difficultyLevel > 7) {
            return true;
        } else {
            return false;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public String toString() {
        return "Toy{type='" + type + "', difficultyLevel=" + difficultyLevel + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Toy toy = (Toy) o;
        if (difficultyLevel == toy.difficultyLevel && type.equals(toy.type)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = result + difficultyLevel * 31;
        return result;
    }
}
