import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter broto");
        double broto = scanner.nextDouble();

        double pensionRate = broto * 0.06;

        double hishtalmutCeiling = Math.min(broto, 15712.0) * 0.025;
        double btlTier1 = Math.min(broto, 7522.0);
        double btlTier2 = Math.max(0.0, Math.min(broto, 49030.0) - 7522.0);

        double bituachLeumi = (btlTier1 * 0.004) + (btlTier2 * 0.07);
        double masBriut = (btlTier1 * 0.03104) + (btlTier2 * 0.05065);

        double bracket1 = Math.max(0.0, Math.min(broto, 7010.0));
        double bracket2 = Math.max(0.0, Math.min(broto, 10060.0) - 7010.0);
        double bracket3 = Math.max(0.0, Math.min(broto, 16150.0) - 10060.0);
        double bracket4 = Math.max(0.0, Math.min(broto, 22440.0) - 16150.0);
        double bracket5 = Math.max(0.0, Math.min(broto, 46690.0) - 22440.0);
        double bracket6 = Math.max(0.0, Math.min(broto, 60130.0) - 46690.0);
        double bracket7 = Math.max(0.0, broto - 60130.0);

        double taxBeforeCredits = (bracket1 * 0.10) + (bracket2 * 0.14) + (bracket3 * 0.20) + (bracket4 * 0.31) + (bracket5 * 0.35) + (bracket6 * 0.47) + (bracket7 * 0.50);

        double creditPointsValue = 544.5;

        double masHachnasa = Math.max(0.0, taxBeforeCredits - creditPointsValue);

        double netSalary = broto - pensionRate - hishtalmutCeiling - bituachLeumi - masBriut - masHachnasa;

        System.out.println("broto: " + broto);
        System.out.println("pension fund: " + pensionRate);
        System.out.println("hishtakmut fund: " + hishtalmutCeiling);
        System.out.println("bituach leumi: " + bituachLeumi);
        System.out.println("health tax: " + masBriut);
        System.out.println("income tax: " + masHachnasa);
        System.out.println("neto: " + netSalary);

    }
}