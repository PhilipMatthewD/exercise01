public class Main {
    public static void main(String[] args) {
        String cityName = "Columbus";
        int zipCode = 43225;
        double highs[] = {35, 40, 49, 53, 47};
        double avgHighs = 0;
        for (int i = 0; i < highs.length; i++) {
            avgHighs = avgHighs + highs[i];
        }
        avgHighs = avgHighs / highs.length;
        System.out.println(cityName);
        System.out.println(zipCode);
        System.out.println("Highs for the next 5 days are: ");
        for (int i = 0; i < highs.length; i++) {
            System.out.println(highs[i]);
        }
        System.out.println("Average highs: " + avgHighs);
    }
}