// class name will be same as file name
// class name can only start with a letter or underscore or dollar
// class name should start with a capital letter
class ClassDemo {
    String name;
    static String college;
    // public - because JVM search for main method so it must be public
    // static - they gets loaded with class in memory
    // void - because main returns nothing
    // String[] args - array of String type
    // String ...args - array of String type
    // Command Line Argument
    public static void main(String ...args) {
        System.out.println("Hello World...");
        System.out.println(args[0] + " " + args[1]);
        // System.out.println(name);
        // System.out.println(college);
    }
}