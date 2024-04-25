public interface Disc {
    public String getTypeOfMedia();
    public Float getMemory();
    public void play() throws InterruptedException;
    public void write(String data, String mediaType);
}
