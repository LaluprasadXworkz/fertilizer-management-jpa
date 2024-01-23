package com.xworkz.fertilizer.boot;

import com.xworkz.fertilizer.entity.FertilizerEntity;
import com.xworkz.fertilizer.repository.impl.FertilizerRepositryimpl;

import java.time.LocalDate;

public class FertiizerRunner {
    public static void main(String[] args) {
        FertilizerEntity fertilizerEntity=new FertilizerEntity(1,"Urea",2,
                LocalDate.of(2024,01,23),LocalDate.of(2024,12,25),500,
                1500);

        FertilizerRepositryimpl fertilizerRepositryimpl=new FertilizerRepositryimpl();
        fertilizerRepositryimpl.save(fertilizerEntity);
        
    }
}
