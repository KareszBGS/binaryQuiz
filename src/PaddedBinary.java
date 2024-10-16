import java.util.ArrayList;

public class PaddedBinary {
    private int bitNum;
    private int value;
    private ArrayList<Character> bits = new ArrayList<>();

    public PaddedBinary(int b, int v) {
        bitNum = b;
        value = v;
    }

    public String toPaddedString() {
        String binary = Integer.toBinaryString(value);
        char[] binaries = binary.toCharArray();
        for (int i = 0; i < binary.length(); i++) {
            bits.add(binaries[i]);
        }

        if (bits.size() < bitNum) {
            for (int i = 0; i < (bits.size() - bitNum); i++) {
                bits.add('0');
            }
            String test = String.valueOf(bits);
            System.out.println(test);
            return test;
        } else if (bits.size() > bitNum) {
            for (int i = 0; i < (bitNum - bits.size()); i++) {
                bits.remove(0);
            }
            String test = String.valueOf(bits);
            System.out.println(test);
            return test;
        } else {
            String test = String.valueOf(bits);
            System.out.println(test);
            return test;
        }

    }
}
