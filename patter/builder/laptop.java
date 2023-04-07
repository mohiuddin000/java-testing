package builder;

public class laptop {
    private String model;
    private int ram;
    private String process;
    private String storage;
    private String gpu;


    public laptop(String model, int ram, String process, String storage, String gpu) {
        this.model = model;
        this.ram = ram;
        this.process = process;
        this.storage = storage;
        this.gpu = gpu;
        }
        
        @Override
        public String toString() {
        return "laptop{" +
        "model='" + model + '\'' +
        ", ram=" + ram +
        ", process='" + process + '\'' +
        ", storage=" + storage +
        ", gpu='" + gpu + '\'' +
        '}';
}
}
