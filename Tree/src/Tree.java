public class Tree {
    int AmountOfLeafs;
    int NumberOfBranches;
    String Species;
    int CurrentAge;
    double Height;
    double TreeTrunkDiameter;

   public String TreeInfo() {
        return  "Tree: [ Amount of leafs = " + AmountOfLeafs + ", Number of branches = " + NumberOfBranches + ", Species = " + Species + ", Current age = " + CurrentAge + ", Height = " + Height + ", Tree trunk diameter = " + TreeTrunkDiameter + " ]";

    }
}
