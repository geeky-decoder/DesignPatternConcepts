public class DBConnectionSingeltonClass {

    private static DBConnectionSingeltonClass dbConnectionClass = new DBConnectionSingeltonClass();

    private DBConnectionSingeltonClass() {
        
    }

    public static DBConnectionSingeltonClass getResult() {
        return dbConnectionClass;
    }
}
