package org.example.location;

import org.example.entity.Entity;
import org.example.exceptions.MentalException;

import java.util.List;

public class UnderwaterMeadow extends Location{

    public List<String> getListObj() throws MentalException {
        List<String> listObj = notLLivingObj.getListObj();
        if (listObj.isEmpty()){
            throw new MentalException("луг разочарован что у него нет обьектов, а вы ещё его простите о них рассказать! " +
                    "Уму грустно и он выбрасил вам ошибку, так вам и нужно!");
        }
        return listObj;
    }

    @Override
    public String toString() {
        return "луг";
    }

    @Override
    public int hashCode() {
        int result = "луг".hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return true;
    }

}
