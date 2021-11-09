package copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static List<String> readFile(String filePath) {
        List<String> list = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            String line = "";
            BufferedReader bf = new BufferedReader(new FileReader(file));

            while ((line = bf.readLine())!=null) {
                list.add(line);
            }
            bf.close();
        } catch (Exception e) {
            System.out.println(filePath +" lỗi hoặc không tồn tại");
        }
        return list;
    }
    public static void writeFile(String filePath, List<String> list) {
        try {
            FileWriter fileWriter = new FileWriter(filePath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String str: list
                 ) {
                bufferedWriter.write(str);
                bufferedWriter.write(" ");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
