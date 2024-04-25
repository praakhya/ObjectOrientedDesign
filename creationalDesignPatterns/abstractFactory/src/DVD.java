import java.util.concurrent.TimeUnit;

public class DVD implements Disc{
    private String mediaType;
    private Float memory;
    private DataUnit memporyUnit;
    private String data;
    DVD() {
        this.mediaType = "";
        this.memory = 3f;
        this.memporyUnit = DataUnit.GB;
        this.data = "";
    }
    DVD(String mediaType) {
        this.mediaType = mediaType;
        this.memory = 3f;
        this.memporyUnit = DataUnit.GB;
        this.data = "";
    }
    DVD(String mediaType, Float memory) {
        this.mediaType = mediaType;
        this.memory = memory;
        this.memporyUnit = DataUnit.GB;
        this.data = "";
    }
    public String getTypeOfMedia() {
        return this.mediaType;
    }
    public Float getMemory() {
        return DataUnitConvertor.instance.unitToLong(memory, memporyUnit);
    }
    public void play() throws InterruptedException {
        System.out.printf("Playing DVD: media = '%s'\n",mediaType);
        for (Character c:data.toCharArray()) {
            System.out.print(c);
            TimeUnit.SECONDS.sleep(1);
        }
    }
    public void write(String data, String mediaType) {
        new ProgressBar("Writing to DVD",25,50);
        this.data = data;
        this.mediaType = mediaType;
    }
}
