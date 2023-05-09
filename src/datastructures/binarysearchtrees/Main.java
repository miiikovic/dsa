package datastructures.binarysearchtrees;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);

        myBST.insert(27);

//        myBST.rInsert(69);
//
//        System.out.println("root = " + myBST.root);
//        System.out.println("Does it contain 18?: " + myBST.rContains(18));
//        System.out.println("Does it contain 69?: " + myBST.rContains(69));

        System.out.println(myBST.BFS());
        System.out.println(myBST.DFSPreOrder());
        System.out.println(myBST.DFSPostOrder());
        System.out.println(myBST.DFSInOrder());
    }
}
