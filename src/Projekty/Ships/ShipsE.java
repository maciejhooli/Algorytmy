package Projekty.Ships;

public enum ShipsE {
    FOUR(4, 1),
    THREE(3, 2),
    TWO(2, 3),
    ONE(1, 4);

    private int shipSize;
    private int shipAmount;

    ShipsE(int shipSize, int shipAmount) {
        this.shipSize = shipSize;
        this.shipAmount = shipAmount;
    }

    public int getShipSize() {
        return shipSize;
    }

    public int getShipAmount() {
        return shipAmount;
    }

    public static ShipsE getShipSize(int value) {
        for (ShipsE ship : ShipsE.values()) {
            if (ship.getShipSize() == value) {
                return ship;
            }
        }
        return ONE;
    }

    public static ShipsE getShipAmount(int value) {
        for (ShipsE ship : ShipsE.values()) {
            if (ship.getShipAmount() == value) {
                return ship;
            }
        }
        return ONE;
    }
}
