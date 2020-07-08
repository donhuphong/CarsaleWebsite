package com.vn.gao.salecar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class CarEntity {

    @Id
    @Column(name = "id")
    private Long idCar;

    @Column(name = "name")
    private String nameCar;

    @Column(name = "origin")
    private String originCar;

    @Column(name = "color")
    private String colorCar;

    @Column(name = "price")
    private Integer priceCar;

    @Column(name = "seats")
    private String seatsCar;

    @Column(name = "brand")
    private String brandCar;

    @Column(name = "image")
    private String imageCar;

    public CarEntity() {
    }

    public Long getIdCar() {
        return idCar;
    }

    public void setIdCar(Long idCar) {
        this.idCar = idCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getOriginCar() {
        return originCar;
    }

    public void setOriginCar(String originCar) {
        this.originCar = originCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public Integer getPriceCar() {
        return priceCar;
    }

    public void setPriceCar(Integer priceCar) {
        this.priceCar = priceCar;
    }

    public String getSeatsCar() {
        return seatsCar;
    }

    public void setSeatsCar(String seatsCar) {
        this.seatsCar = seatsCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getImageCar() {
        return imageCar;
    }

    public void setImageCar(String imageCar) {
        this.imageCar = imageCar;
    }
}
