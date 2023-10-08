class CompressionDecorator extends FileDecorator {
    public CompressionDecorator(File decoratedFile) {
        super(decoratedFile);
    }

    @Override
    public void read() {
        super.read();
        System.out.println("Decompressing file...");
    }

    @Override
    public void write() {
        System.out.println("Compressing file...");
        super.write();
    }
}
