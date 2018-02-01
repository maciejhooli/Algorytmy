package PracaDomowa2701;

public enum ZD02ChessboardGeneratorEnum {
    White('C'), Black('B');

    private final char name;

    ZD02ChessboardGeneratorEnum(char name) {
        this.name = name;
    }

    public char getName() {
        return name;
    }
}

