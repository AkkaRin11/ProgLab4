package org.example.location;

public class EntranceValleyOfMoomins extends Location{
    @Override
    public String toString() {
        return "въезд в долину муми-троллей";
    }

    @Override
    public int hashCode() {
        int result = "въезд в долину муми-троллей".hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return true;
    }
}
