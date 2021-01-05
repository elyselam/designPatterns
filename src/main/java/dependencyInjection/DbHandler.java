package dependencyInjection;



// Handler doesn't care what kind of Db, knows nothing about Oracle.java or MySql.java
// just need to reference the Interface
public class DbHandler {
    private Database db;

    public DbHandler(Database db) {
        this.db = db;
    }
    public void connect() {
        this.db.connect();
    }
    public void disconnect(){
        this.db.disconnect();
    }


    /**
 * if don't use interface
 * private MySql myql;
    public DbHandler() {
        this.myql = new MySql();
    }
    public void connect(){
        this.myql.connect();
    }
    public void disconnect(){
        this.myql.disconnect();
    }
 **/
}
