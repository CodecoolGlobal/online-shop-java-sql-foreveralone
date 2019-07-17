import java.sql.ResultSet;

public interface SQL {

    ResultSet selectQuery(String sql);
        void doQuery(String sql);
        void closeQuery();
    }

