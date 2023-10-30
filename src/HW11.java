import java.util.Random;

public class HW11 {
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        Random random = new Random();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 25; i++) {
            team1[i] = random.nextInt(23) + 18;
            sum1 += team1[i];
            team2[i] = random.nextInt(23) + 18;
            sum2 += team2[i];
        }
        System.out.println("Вік гравців команди 1:");
        for (int i = 0; i < 25; i++) {
            System.out.print(team1[i] + " ");
        }
        System.out.println("\nСередній вік гравців команди 1: " + (double) sum1 / 25);
        System.out.println("\nВік гравців команди 2:");
        for (int i = 0; i < 25; i++) {
            System.out.print(team2[i] + " ");
        }
        System.out.println("\nСередній вік гравців команди 2: " + (double) sum2 / 25);
    }
}