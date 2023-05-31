package kohhx;

public class Table {
    private final static String TABLE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()*+,-./";

    public static String getTable() {
        return TABLE;
    }
    public static int getTotalLength() {
        return TABLE.length();
    }

    public static int getOffset(char c) {
        return TABLE.indexOf(c);
    }

}
