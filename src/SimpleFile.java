class SimpleFile implements File {
    private final String filename;

    public SimpleFile(String filename) {
        this.filename = filename;
    }

    @Override
    public void read() {
        System.out.println("Reading file: " + filename);
    }

    @Override
    public void write() {
        System.out.println("Writing to file: " + filename);
    }
}
