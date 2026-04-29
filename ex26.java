import java.io.*;

class ex26 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        int l = 0, w = 0, c = 0;
        String s;
        while ((s = br.readLine()) != null) {
            l++;
            w += s.split("\\s+").length;
            c += s.length();
        }
        br.close();
        System.out.println(l + " " + w + " " + c);
    }
}