class EncryptionDecorator extends FileDecorator {
    public EncryptionDecorator(File decoratedFile) {
        super(decoratedFile);
    }

    @Override
    public void read() {
        System.out.println("Decrypting file...");
        super.read();
    }

    @Override
    public void write() {
        super.write();
        System.out.println("Encrypting file...");
    }
}