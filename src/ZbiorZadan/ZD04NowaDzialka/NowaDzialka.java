package ZbiorZadan.ZD04NowaDzialka;

import java.util.Scanner;

public class NowaDzialka {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numberOfData = 0;
        System.out.println("Podaj ilosc danych ktore chcesz wprowadzic:");
        try {
            numberOfData = Integer.parseInt(sc.nextLine().trim());
        } catch (Exception e) {
            System.out.println("Błedne dane wejściowe");
        }

        if (numberOfData>500 || numberOfData<1) throw new Exception("Po za limitem");

        int[] length = new int[numberOfData];
        for (int i = 0; i < numberOfData; i++) {
            System.out.println("Podaj " +i+" liczbe krokow:");
            try {
                length[i] = Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Błedne dane wejściowe");
            }
            if (length[i]>1000 || length[i]<1) throw new Exception("Liczba po za limitem");
        }

        for (int i = 0; i < numberOfData; i++) {
            System.out.println(length[i]*length[i]);
        }

    }
}
