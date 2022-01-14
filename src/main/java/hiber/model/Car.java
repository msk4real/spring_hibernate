package hiber.model;

import javax.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "series", unique = true)
    private int series;

    @Column(name = "model")
    private String model;


    public Car(){
    }

    public Car(String model, int seires) {
        this.model = model;
        this.series = seires;
    }

    public Long getId() {
        return id;
    }

    public int getSeires() {
        return series;
    }

    public String getModel() {
        return model;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSeires(int seires) {
        this.series = seires;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", series=" + series +
                ", model='" + model + '\'' +
                '}';
    }
}
