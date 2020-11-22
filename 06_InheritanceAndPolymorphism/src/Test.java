import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class Test {

       public static void main(String[] args) {


           double[] mass = new double[30];

           try {
               for (int i = 0; i < 31; i++){
                   mass[i] = random();
                   System.out.printf("%.2f%n", mass[i]);
               }
           } catch (Exception ex){
               ex.printStackTrace();
           }


    }
    public static double random(){
        double a = 115000 + Math.random() * 25001;
        return a;
    }
}
