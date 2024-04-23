package april.twentyThrid;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        String pathString = "src\\april\\twentyThrid\\input.txt";
        String output = "src\\april\\twentyThrid\\empty.txt";
//
//        Path paths = Paths.get(pathString);
//        Path outputPath = Paths.get(output);
//
//        try {
////            FileInputStream fileStream = new FileInputStream(path);
////
////            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileStream);
////            byte[] myByte = bufferedInputStream.readAllBytes();
////
////            System.out.println("Byte : ");
////            for (int i = 0; i < myByte.length; i++) {
////                System.out.print(Character.toChars(myByte[i]));
////            }
//
//            System.out.println("Character :");
//
//            List<String> lines = Files.readAllLines(paths);
//            Files.write(outputPath, lines);
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        List<String> names = new ArrayList<>();
        names.add("Gosho");
        names.add("Ivan");

        FileOutputStream outputStream = new FileOutputStream(output);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(names);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(output));
        List<String> desList = (List<String>) objectInputStream.readObject();

        desList.forEach(e -> System.out.println(e));
    }
}
