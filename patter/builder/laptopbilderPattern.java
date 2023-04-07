package builder;

public class laptopbilderPattern {
    private String model;
    private int ram;
    private String process;
    private String storage;
    private String gpu;

    public laptopbilderPattern setModel(String model) {
        this.model = model;
        return this;
    }
    public laptopbilderPattern setRam(int ram) {
        this.ram = ram;
        return this;
    }
    public laptopbilderPattern setProcess(String process) {
        this.process = process;
        return this;
    }
    public laptopbilderPattern setStorage(String storage) {
        this.storage = storage;
        return this;
    }
    public laptopbilderPattern setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public laptop setLaptopProperty(){
        return new laptop(model,  ram , process, storage , gpu);
    }
}
