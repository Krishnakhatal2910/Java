package dateAndTime;

class Derived extends Base {

    // Overriding method as already up in base class
//    @Override
    public void display() {
        // Print statement when this method is called
        System.out.println("Derived display(int )");
    }

    public static void main(String args[]) {
        // Creating object of this class inside main()
    	Base obj = new Derived();

        // Calling display() method inside main()
        obj.display();
    }
}