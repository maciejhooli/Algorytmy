package PracaDomowa2701;

public class ZD05Date {
    private int day;
    private int month;
    private int year;
    private int[] calendar = new int[12];


    private void fillCalendar() {
        calendar[0] = 31;
        calendar[1] = (((this.year % 4 == 0) && (this.year % 100 != 0)) || (this.year % 400 == 0)) ? 29 : 28;
        calendar[2] = 31;
        calendar[3] = 30;
        calendar[4] = 31;
        calendar[5] = 30;
        calendar[6] = 31;
        calendar[7] = 31;
        calendar[8] = 30;
        calendar[9] = 31;
        calendar[10] = 30;
        calendar[11] = 31;
    }

    public ZD05Date(String userInput) throws Exception {
        setDate(userInput);
    }

    public int getDay() {
        return day;
    }

    public void setDay(String userInput) throws Exception {
        int tempDay = Integer.parseInt(userInput.substring(0, 2).trim());
        if (tempDay >= 1 && tempDay <= calendar[getMonth() - 1]) {
            this.day = tempDay;
        } else {
            throw new Exception("Wartość dni nieprawidlowa");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(String userInput) throws Exception {
        int tempMonth = Integer.parseInt(userInput.substring(3, 5).trim());
        if (tempMonth >= 1 && tempMonth <= 12)
            this.month = tempMonth;
        else {
            throw new Exception("Wartość miesięcy nieprawidłowa");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(String userInput) throws Exception {
        int tempYear = Integer.parseInt(userInput.substring(6, 10).trim());
        if (tempYear > 0)
            this.year = tempYear;
        else {
            throw new Exception("Wartość roku nieprawidłowa");
        }
    }

    public void setDate(String userInput) throws Exception {
        try {
            setYear(userInput);
            fillCalendar();
            setMonth(userInput);
            setDay(userInput);
        } catch (Exception e) {
            throw new Exception("Nie ma takiego dnia");
        }
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

    public void dayOfYear() {
        int days = 0;
        int month = getMonth();
        for (int i = 0; i < month - 1; i++) {
            days = days + calendar[i];
        }
        days += getDay();

        System.out.printf("%d %d %d => %d",this.toString(), days);
    }

}