<<<<<<< HEAD
import java.io.File;

public class errorHandling {
    public static void main(String[] args) {
        // CHECK EXCEPTION
        try {
        File f = new File("d:\\abc.txt");

        f.createNewFile();
        } catch(Exception e) {} // this is called checked excpetion
    }
}
=======
import java.io.File;

public class errorHandling {
    public static void main(String[] args) {
        // CHECK EXCEPTION
        try {
        File f = new File("d:\\abc.txt");

        f.createNewFile();
        } catch(Exception e) {} // this is called checked excpetion
    }
}
>>>>>>> f52601dc09d716e275ea11a0fa19e53d869e677a
