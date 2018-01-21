package AP01PapScisorsStone;

public enum Figures {
    PAPER("p"), SCISORS("n"), ROCK("k");

    public static Figures getEnumBasedOnString(String value) {
        for (Figures figures : Figures.values()) {
            if (figures.getName().equals(value)) {
                return figures;
            }
        }
        return PAPER;
    }

    private final String name;

    Figures(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
