package ru.thecop.dopl.model;

import javax.persistence.*;

@Entity(name = "example")
public class Example extends BaseEntity<Long> {

    private String field;

    @Id
    @GeneratedValue(generator = "example_sequence", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "example_sequence", sequenceName = "example_sequence", allocationSize = 1)
    public Long getId() {
        return id;
    }

    @Column(name = "field")
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
