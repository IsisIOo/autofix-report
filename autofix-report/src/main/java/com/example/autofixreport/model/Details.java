package com.example.autofixreport.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Details {

    private Long id;
    private Long repair_id; //id de repair para conectarlo con lo detalles de reparacion

    private String patent; //patente del auto

    private String repairType;
    private int repairDay; //fecha de reparacion
    private int repairMonth;

    private int repairHour; //hora de reparacion

    private double totalAmount; //el costo total de las reparaciones, solo el total que implica las reparaciones en el auto
}
