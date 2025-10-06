import java.io.*;

public class Day39 {
    public static void main(String[] args) {

        // how to create a file

//        File file=new File("./src/meriFile.txt");
//        try {
//            file.createNewFile();
//            System.out.println("New File Created");
//        } catch (IOException e) {
//            System.out.println("Exception Occurred: ");
//            e.printStackTrace();
//        }

        // how to write in file

//        try{
//            FileWriter fileWriter=new FileWriter("./src/meriFile.txt",true);
//            fileWriter.write("\nVandana khush hai today\n");
////            fileWriter.write("Khushi khush hai today\n");
////            fileWriter.write("I am khush very very");
//            fileWriter.close();
//            System.out.println("Content written");
//        } catch (IOException e) {
//            System.out.println("Error Occurred");
//            e.printStackTrace();
//        }
        // Reading a file
//        File file=new File("./src/meriFile.txt");
//        try {
//            FileReader fileReader=new FileReader(file);
//            BufferedReader bufferedReader=new BufferedReader(fileReader);
////            String line1=bufferedReader.readLine();
////            System.out.println(line1);
////
////            String line2=bufferedReader.readLine();
////            System.out.println(line2);
//            String line;
//            while ((line=bufferedReader.readLine())!=null) {
//                System.out.println(line);
//            }
//            fileReader.close();
//            bufferedReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("Error Occurred While Reading");
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.out.println("Error Occurred While Reading Line");
//            e.printStackTrace();
//        }

//        update a file
//        File file=new File("./src/meriFile.txt");
//        try {
//            FileReader fileReader=new FileReader(file);
//            BufferedReader bufferedReader=new BufferedReader(fileReader);
//
//            StringBuilder sb= new StringBuilder();
////            String line1=bufferedReader.readLine();
////            System.out.println(line1);
////
////            String line2=bufferedReader.readLine();
////            System.out.println(line2);
//
//            String line;
//            while ((line=bufferedReader.readLine())!=null) {
//                sb.append(line.replace("sad","Happy")).append("\n");
//                System.out.println(line);
//            }

//            FileWriter writer = new FileWriter(file);
//            writer.write(sb.toString());
//            writer.close();
//            fileReader.close();
//            bufferedReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("Error Occurred While Reading");
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.out.println("Error Occurred While Reading Line");
//            e.printStackTrace();
//        }


//        delete line
        File file =new File("./src/meriFile.txt");
        file.delete();
    }
}
