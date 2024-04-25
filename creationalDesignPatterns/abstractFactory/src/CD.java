import java.util.concurrent.TimeUnit;

public class CD implements Disc{
    private String mediaType;
    private Float memory;
    private DataUnit memporyUnit;
    private String data;
    CD() {
        this.mediaType = "";
        this.memory = 300f;
        this.memporyUnit = DataUnit.MB;
        this.data = "";
    }
    CD(String mediaType) {
        this.mediaType = mediaType;
        this.memory = 300f;
        this.memporyUnit = DataUnit.MB;
        this.data = "";
    }
    CD(String mediaType, Float memory) {
        this.mediaType = mediaType;
        this.memory = memory;
        this.memporyUnit = DataUnit.MB;
        this.data = "";
    }
    public String getTypeOfMedia() {
        return this.mediaType;
    }
    public Float getMemory() {
        return DataUnitConvertor.instance.unitToLong(memory, memporyUnit);
    }
    public void play() throws InterruptedException {
        System.out.printf("Playing CD: media = '%s'\n",mediaType);
        for (Character c:data.toCharArray()) {
            System.out.print(c);
            TimeUnit.SECONDS.sleep(2);
        }
    }
    public void write(String data, String mediaType) {
        new ProgressBar("Writing to CD",25,100);
        this.data = data;
        this.mediaType = mediaType;
    }
}
