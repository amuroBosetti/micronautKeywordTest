package model;

import javax.persistence.*;

@Entity
@Table(name = "heroes")
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "something_istrument_id")
    private SomethingIstrument somethingIstrument;

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

    public SomethingIstrument getSomethingIstrument() {
        return somethingIstrument;
    }
}
