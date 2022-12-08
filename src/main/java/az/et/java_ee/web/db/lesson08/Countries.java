package az.et.java_ee.web.db.lesson08;

import java.util.Objects;

public class Countries {
    Integer id;
    String name;

    public Countries() {
    }

    public Countries(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Countries that = (Countries) o;
        return Objects.equals(this.id, that.id)
                && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return String.format("Countries{id=%d, name='%s'}", id, name);
    }
}
