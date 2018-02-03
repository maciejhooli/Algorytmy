package PracaDomowa2701;

public class ZD05Date {
    private int day;
    private int month;
    private int year;
    private int[] calendar = new int[12];


    private void fillCalendar() {
        calendar[0] = 31;
        calendar[1] = ((this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0)) ? 29 : 28;
        calendar[2] = 31;
        calendar[3] = 30;
        calendar[4] = 31;
        calendar[5] = 31;
        calendar[6] = 31;
        calendar[7] = 31;
        calendar[8] = 30;
        calendar[9] = 31;
        calendar[10] = 30;
        calendar[11] = 31;
    }


    public ZD05Date(char[] userInput) {
        setYear(userInput);
        if (getYear() != 0) {
            fillCalendar();
            setMonth(userInput);
            if (getMonth() != 0) {
                setDay(userInput);
            } else
                this.month = 0;
        } else
            this.year = 0;
    }

    public int getDay() {
        return day;
    }

    public void setDay(char[] userInput) {
        int tempDay = 0;
        for (int i = 0; i < 2; i++) {
            if (Character.isDigit(userInput[i])) {
                tempDay = tempDay + (int) Math.pow(10, 1 - i) * Character.getNumericValue(userInput[i]);
            } else {
                System.out.println("Błędnie wprowadzony dzień");
            }
        }

        if (tempDay >= 1 && tempDay <= calendar[getMonth() - 1]) {
            this.day = tempDay;
        } else
            this.day = 0;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(char[] userInput) {
        int tempMonth = 0;
        for (int i = 3; i < 5; i++) {
            if (Character.isDigit(userInput[i])) {
                tempMonth = tempMonth + (int) Math.pow(10, 4 - i) * Character.getNumericValue(userInput[i]);
            } else {
                System.out.println("Błędnie wprowadzony miesiąc");
            }
        }
        if (tempMonth >= 1 && tempMonth <= 12)
            this.month = tempMonth;
        else
            this.month = 0;
    }

    public int getYear() {
        return year;
    }

    public void setYear(char[] userInput) {
        int tempYear = 0;
        for (int i = 6; i < 10; i++) {
            if (Character.isDigit(userInput[i])) {
                tempYear = tempYear + (int) Math.pow(10, 9 - i) * Character.getNumericValue(userInput[i]);
            } else {
                System.out.println("Błędnie wprowadzony rok");
            }
        }

        if (tempYear > 0)
            this.year = tempYear;
        else
            this.year = 0;
    }

    public void setDate(char[] userInput) {
        setYear(userInput);
        if (getYear() != 0) {
            setMonth(userInput);
            if (getMonth() != 0) {
                setDay(userInput);
            } else
                this.month = 0;
        } else
            this.year = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (day < 10) {
            sb.append(0).append(day);
        } else {
            sb.append(day);
        }
        sb.append("/");
        if (month < 10) {
            sb.append(0).append(month);
        } else {
            sb.append(month);
        }
        sb.append("/").append(year);

        return sb.toString();
    }

    public int dayOfYear() {
        int days = 0;
        for (int i = 0; i < getMonth() - 1; i++) {
            days = days + calendar[i];
        }
        if (getDay() > 0) {
            days += getDay();
        } else {
            days = -1;
        }
        return days;
    }

}