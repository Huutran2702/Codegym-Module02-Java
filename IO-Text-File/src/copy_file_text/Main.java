package copy_file_text;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = CopyFile.readFile("src/copy_file_text/source.csv");
        CopyFile.writeFile("src/copy_file_text/target.csv",list);
    }
}
