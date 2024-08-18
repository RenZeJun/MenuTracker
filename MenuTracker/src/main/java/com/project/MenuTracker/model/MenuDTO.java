package com.project.MenuTracker.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

//@Entity
//@Table(name = "menu")
@Setter
@Getter
public class MenuDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "store_name")
    private String storeName;

    //TODO find out how to parse a BLOB and map it correctly
    @Lob
    @Column(name = "dishes")
    private Map<String, Long> dishes = new HashMap<>();

    //active, inactive
    @Column(name = "status")
    private String status;

    @Column(name = "lastUpdateDTTM")
    private LocalDateTime lastUpdatedDTTM;

    public void setDishesFromBlob(String RawMenu) {
        //TODO parse dishes name and price to map

    }



    //Constructors
    public MenuDTO() {}

    public MenuDTO(long id, String storeName, Map<String, Long> dishes, String status, LocalDateTime lastUpdatedDTTM) {
        this.id = id;
        this.storeName = storeName;
        this.dishes = dishes;
        this.status = status;
        this.lastUpdatedDTTM = lastUpdatedDTTM;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "id=" + id +
                ", storeName='" + storeName + '\'' +
                ", dishes=" + dishes +
                ", status='" + status + '\'' +
                ", lastUpdatedDTTM=" + lastUpdatedDTTM +
                '}';
    }

}
