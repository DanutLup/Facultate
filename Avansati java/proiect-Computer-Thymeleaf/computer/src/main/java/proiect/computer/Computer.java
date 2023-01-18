package proiect.computer;

import jakarta.persistence.*;

@Entity
@Table(name="computer")
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String productCode;
    private String type;
    private String processor;
    private int memory;

    public Computer(){}
    public Computer(String productCode, String type, String processor, int memory) {
        this.productCode = productCode;
        this.type = type;
        this.processor = processor;
        this.memory = memory;
    }

    public Long getId() {
        return id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
    public void setId(long id){
        this.id=id;
    }
}
