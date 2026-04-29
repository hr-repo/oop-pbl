import java.io.*;

class ex27 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));
            bw.write("1 A 80\n2 B 75\n3 C 90");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            String s;
            while ((s = br.readLine()) != null) System.out.println(s);
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Done");
        }
    }
}