package sum_of_numbers_in_text_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public void readFileText(String filePath){
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line= buffer.readLine())!=null) {
                System.out.println(line);
                sum+= Integer.parseInt(line);
            }
            buffer.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}
