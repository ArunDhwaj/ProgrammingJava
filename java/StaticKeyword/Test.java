import java.io.*;

class Test {
    public static void main(String[] args) {
	String s = "abcdefgh";
	int stringLength = s.length();
	char chars[] = new char[stringLength];
        s.getChars(0, stringLength, chars, 0);
        CharArrayReader reader1 = newCharArrayReader(s);
        CharArrayReader reader2 = newCharArrayReader(s, 1, 4);
        int i;
        int j;
        try {
            while ((i = reader1.read()) == (j = reader2.read())) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
