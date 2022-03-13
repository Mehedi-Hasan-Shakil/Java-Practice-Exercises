public class BankAccountTester {
    public static void main(String[] args){
        Bag bag1 = new Bag();
        bag1.add("Pen");
        bag1.add("Pen");
        bag1.add("Pen");
        bag1.add("Pen");
        bag1.add("Pencil");
        bag1.add("Pencil");
        bag1.add("Pencil");
        System.out.println("Number of pen is " + bag1.count("Pen"));
        System.out.println("Number of pencil is " + bag1.count("Pencil"));
    }
}
