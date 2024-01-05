public class MainClass {
    public static void main(String[] args) throws Exception {

        /*
         * 2 objects got created for DBConnectionClass when called by two different
         * classes and that's why the output gives 2 different hashcode values for
         * given objects
         */
        DBConnectionNonSingeltonClass dbConnectionClass = new DBConnectionNonSingeltonClass();
        DBConnectionNonSingeltonClass dbConnectionClass2 = new DBConnectionNonSingeltonClass();
        System.out.println(dbConnectionClass.getResult().hashCode());
        System.out.println(dbConnectionClass2.getResult().hashCode());
    }
}
~