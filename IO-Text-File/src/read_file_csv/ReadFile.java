package read_file_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        List<Nation> list = new ArrayList<>();
        File file = new File("src/read_file_csv/file.csv");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line="";
            while ((line= reader.readLine())!=null) {
                Nation nation = new Nation();
                String[] arr = line.split(",");
                nation.setId(arr[0]);
                nation.setAbbreviation(arr[1]);
                nation.setName(arr[2]);
                System.out.println(nation);
                list.add(nation);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("File không tìm thấy hoặc lỗi");
        }
        System.out.printf("%4s%25s%15s\n","Id","Tên viết tắt","Tên");
        for (Nation nation:list
             ) {
            System.out.printf("%3s%20s%25s\n",nation.getId(),nation.getAbbreviation(),nation.getName());
        }
    }

}
