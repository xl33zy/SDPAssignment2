public class Main {
    public static void main(String[] args) {
        File simpleFile = new SimpleFile("sample.txt");

        File encryptedCompressedFile = new CompressionDecorator(new EncryptionDecorator(simpleFile));

        System.out.println("Reading decorated file:");
        encryptedCompressedFile.read();

        System.out.println("\nWriting to decorated file:");
        encryptedCompressedFile.write();
    }
}








