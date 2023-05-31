package kohhx;

public class MainApplication {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        System.out.println(encoder.encode("HELLO WORLD", 'F'));
        System.out.println(encoder.encode("hello wo/rld", 'F'));

        Decoder decoder = new Decoder();
        System.out.println(decoder.decode("C/GGJ RJMG.", 'F'));
    }

}
