abstract class FileDecorator implements File {
    protected File decoratedFile;

    public FileDecorator(File decoratedFile) {
        this.decoratedFile = decoratedFile;
    }

    @Override
    public void read() {
        decoratedFile.read();
    }

    @Override
    public void write() {
        decoratedFile.write();
    }
}