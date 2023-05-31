package kohhx;

public class Decoder {
    public String decode(String text, char c) {
        if (isTextEmpty(text)) {
            return text;
        }
        text = text.toUpperCase();
        String table = Table.getTable();
        StringBuilder sb = new StringBuilder();
        for (String s : text.split("")) {
            if (s.equals(" ")) {
                sb.append(" ");
            } else  {
                int encoderNo = table.indexOf(s) + Table.getOffset(Character.toUpperCase(c));
                sb.append(table.charAt(Math.abs(encoderNo) % Table.getTotalLength()));
            }
        }
        return sb.toString();
    }

    private boolean isTextEmpty(String text) {
        return text.isEmpty() || text.isBlank();
    }
}
