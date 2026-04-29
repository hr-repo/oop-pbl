import java.io.*;

class ex28 {
    public static void main(String[] args) {
        int l = 0, w = 0, c = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                l++;
                w += s.split("\\s+").length;
                c += s.replace(" ", "").length();
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(l + " " + w + " " + c);
    }
}