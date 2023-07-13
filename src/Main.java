import java.io.*;

/**
 * Створіть файл, запишіть у нього довільні дані та закрийте файл.
 * Потім знову відкрийте цей файл, прочитайте дані і виведіть їх на консоль.
 */


public class Main {
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("someFile.bin"))) {
            outputStream.writeInt(123456789);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (DataInputStream inputStream = new DataInputStream(new FileInputStream("someFile.bin"))) {
            int someInt = inputStream.readInt();
            System.out.println(someInt);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
