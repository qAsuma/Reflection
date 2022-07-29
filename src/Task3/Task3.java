package Task3;

public class Task3 {
    private String where;
    private int are;
    private String you;

    public Task3(String where, int are, String you) {
        this.where = where;
        this.are = are;
        this.you = you;
    }

    public Task3(String where, int are) {
        this.where = where;
        this.are = are;
    }

    public Task3(String you) {
        this.you = you;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public int getAre() {
        return are;
    }

    public void setAre(int are) {
        this.are = are;
    }

    public String getYou() {
        return you;
    }

    public void setYou(String you) {
        this.you = you;
    }
}



