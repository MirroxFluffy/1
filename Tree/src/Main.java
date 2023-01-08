import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Scanner x = new Scanner(System.in);
        System.out.println("Current age:");
        tree.CurrentAge = x.nextInt();
        System.out.println("Height:");
        tree.Height = x.nextInt();
        System.out.println("Type the species of this tree");
        tree.Species = "Pine";
        System.out.println(tree.Species);
        System.out.println("Number of branches:");
        tree.NumberOfBranches = x.nextInt();
        System.out.println("Amount of leafs:");
        tree.AmountOfLeafs = x.nextInt();
        System.out.println("Tree trunk diameter:");
        tree.TreeTrunkDiameter = x.nextDouble();
        System.out.println(tree.TreeInfo());
    }
}