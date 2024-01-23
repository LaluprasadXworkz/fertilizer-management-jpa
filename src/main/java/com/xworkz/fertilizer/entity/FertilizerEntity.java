package com.xworkz.fertilizer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fertilizer_info")
public class FertilizerEntity {
//    f_id, F_name, quantity, ManfDate, expiryDate, netweigth
    @Id
    @Column(name = "f_id")
    private int id;

    @Column(name = "F_name")
    private String fertilizerName;

    @Column(name = "quantity")
    private int quatity;

    @Column(name = "ManfDate")
    private LocalDate manfDate;

    @Column(name = "expiryDate")
    private LocalDate expiryDate;

    @Column(name = "netweigth")
    private int netweight;

    @Column(name = "cost")
    private double fertilizerCost;

    @Override
    public String toString() {
        return "FertilizerEntity -" +
                "\n---------------------"+
                "\nid  :" + id +
                "\nfertilizerName :" + fertilizerName +
                "\nquatity :" + quatity +
                "\nmanfDate :" + manfDate +
                "\nexpiryDate :" + expiryDate +
                "\nnetweight :" + netweight ;
    }
}
