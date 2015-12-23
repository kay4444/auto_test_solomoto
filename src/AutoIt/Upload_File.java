package AutoIt;

/**
 * Created by serhii.kaihorodov on 12/7/2015.
 */

        import java.io.IOException;

public class Upload_File
{

    public static void main(String[] args) throws IOException, InterruptedException {

        Runtime.getRuntime().exec("D:\\Projects\\UploadFile1.exe");

        Thread.sleep(5000);

    }
}
