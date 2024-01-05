public class MainClassSingelton {
    public static void main(String[] args) throws Exception {

        /*
         * Here again 2 different objects were created but this time the object returned
         * was the same
         * that got created once and that's why it gives the same hashcode as output
         */

        DBConnectionSingeltonClass dbConnectionClass = DBConnectionSingeltonClass.getResult();
        DBConnectionSingeltonClass dbConnectionClass2 = DBConnectionSingeltonClass.getResult();

        System.out.println(dbConnectionClass.hashCode());
        System.out.println(dbConnectionClass2.hashCode());
    }
}
