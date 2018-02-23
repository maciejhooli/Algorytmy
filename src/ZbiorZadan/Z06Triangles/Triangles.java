package ZbiorZadan.Z06Triangles;

public class Triangles {
    //TODO ZADANIE NA 09.02.2018
    private int testConditions;
    private int numberOfUsers;
    private int chalkConsumption;

    public Triangles(int testConditions, int numberOfUsers, int chalkConsumption) throws Exception {
        setTestConditions(testConditions);
        setNumberOfUsers(numberOfUsers);
        setChalkConsumption(chalkConsumption);
    }

    public int getTestConditions() {
        return testConditions;
    }

    public void setTestConditions(int testConditions) throws Exception {
        if (testConditions <= 10) {
            this.testConditions = testConditions;
        } else {
            throw new Exception("To many tests");
        }
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public void setNumberOfUsers(int numberOfUsers) throws Exception {
        if (numberOfUsers <= Math.pow(10.0, 3.0)) {
            this.numberOfUsers = numberOfUsers;
        } else {
            throw new Exception("To many userNumber");
        }
    }

    public int getChalkConsumption() {
        return chalkConsumption;
    }

    public void setChalkConsumption(int chalkConsumption) throws Exception {
        if (numberOfUsers <= 10) {
            this.chalkConsumption = chalkConsumption;
        } else {
            throw new Exception("To many chalkConsumption");
        }
    }

    private double calcTriangleSurface(int a, int b, int c) {
        int circuit = a + b + c;
        double triangleSurface = Math.sqrt(0.5 * circuit * (0.5 * circuit - a) * (0.5 * circuit - b) * (0.5 * circuit - c));
        return triangleSurface;
    }

    private boolean isTriangle(int a, int b, int c) {
        return ((a + b > c) && (b + c > a) && (a + c > b));
    }

//    public double calculateChalkConsumpt\ion(int a, int b, int c) throws Exception {
//        double chalkConsumptionResult = 0;
//        if (isTriangle(a, b, c)) {
//            chalkConsumptionResult = calcTriangleSurface(a, b, c) * getChalkConsumption();
//        } else {
//            throw new Exception("This is not a triangle");
//        }
//        return chalkConsumptionResult;
//    }

}