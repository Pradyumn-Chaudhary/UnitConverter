import java.util.*;

public class UnitConverter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input;
        for (;;) {
            System.out.println("================================================================================");
            System.out.println("1->KM to Mile\n2->Inche to Foot\n3->CM to Inche\n4->Pound to KG\n5->Inche to Meter\n6->Quit");
            System.out.println("================================================================================");input = sc.nextInt();
            switch (input) {
                case 1:
                    kmToMile();
                    break;
                case 2:
                    incheToFoot();
                    break;
                case 3:
                    cmToInche();
                    break;
                case 4:
                    poundToKg();
                    break;
                case 5:
                    incheToMeter();
                    break;
                case 6:
                    System.out.println("Thank You");
                    return;
                default:
                    System.out.println("Invalid Input");
                    return;
            }
        }
    }

    public static void kmToMile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value");
        float value = sc.nextFloat();
        System.out.println(value + " Km = " + value * 0.621371 + " Mile");
    }
    public static void incheToFoot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value");
        float value = sc.nextFloat();
        System.out.println(value + " Inche = " + value * 0.0833333 + " Foot");
    }

    public static void cmToInche() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value");
        float value = sc.nextFloat();
        System.out.println(value + " Cm = " + value * 0.393701 + " Inche");
    }

    public static void poundToKg() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value");
        float value = sc.nextFloat();
        System.out.println(value + " Pound = " + value * 0.453592 + " Kg");
    }
    public static void incheToMeter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value");
        float value = sc.nextFloat();
        System.out.println(value + " Inche = " + value * 0.0254 + " Meter");
    }
}
