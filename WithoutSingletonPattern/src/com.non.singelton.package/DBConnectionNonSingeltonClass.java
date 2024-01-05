public class DBConnectionNonSingeltonClass {

    private DBConnectionNonSingeltonClass dbConnectionClass;

    DBConnectionNonSingeltonClass() {
        
    }

    public static DBConnectionNonSingeltonClass getResult() {
        return new DBConnectionNonSingeltonClass();
    }
}
