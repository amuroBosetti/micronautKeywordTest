package model;

import javax.persistence.*;

@Entity
@Table(name = "heroes")
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "something_instrument_id")
    private SomethingInstrument somethingInstrument;

    @ManyToOne
    @JoinColumn(name = "race_id")
    private Race race;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Race getRace() {
        return race;
    }

    public SomethingInstrument getSomethingIstrument() {
        return somethingInstrument;
    }
}
