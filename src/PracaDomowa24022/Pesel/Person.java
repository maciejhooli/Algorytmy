package PracaDomowa24022.Pesel;

public class Person {
    private String birthDate;

    public Person(String pesel) {
        setBirthDate(pesel);
    }

    public void setBirthDate(String pesel) {
        String birthDate = pesel.substring(0, 5).trim();
        if (areNumbers(birthDate)) {
            this.birthDate = birthDate;
        } else {
            throw new IllegalArgumentException("Wrong input data.");
        }
    }

    public String getBirthDate() {
        return birthDate;
    }

    private boolean areNumbers(String birthDate) {
        boolean isNumber = true;
        for (int i = 0; i < birthDate.length(); i++) {
            if (Character.isDigit(birthDate.charAt(i))) {
                isNumber = isNumber && true;
            } else {
                isNumber = false;
            }
        }
        return isNumber;
    }

    public boolean isAdult() {
        boolean isAdult = false;
        //TODO tu będzie funkcja sprawdzająca wiek na podstawie lat

        return true;
    }

    private int yearReprezentation() {
        StringBuilder sb = new StringBuilder();
        int birthYear = Integer.parseInt(getBirthDate().substring(0, 2).trim());
        int birthMonth = Integer.parseInt(getBirthDate().substring(2, 4).trim());
        char firstNumberOfMonth = getBirthDate().charAt(2);
        switch (firstNumberOfMonth) {
            case 0:
            case 1:
                sb.append(19);
                break;
            case 2:
            case 3:
                sb.append(20);
                break;
            case 4:
            case 5:
                sb.append(21);
                break;
            case 6:
            case 7:
                sb.append(21);
                break;
            case 8:
            case 9:
                sb.append(21);
                break;
        }
        sb.append(birthYear);
        return Integer.parseInt(sb.toString());
    }
}