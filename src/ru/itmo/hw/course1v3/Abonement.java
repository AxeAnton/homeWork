package ru.itmo.hw.course1v3;

import java.time.LocalDate;

public class Abonement {
    private Owner owner;
    private Type type;
    private Zone[] zone;

    LocalDate dateOfRegistration = LocalDate.now();
    LocalDate expireDate = dateOfRegistration.minusMonths(6);

    public Abonement(Owner owner, Type type, Zone[] zone) {
        this.owner = owner;
        this.type = type;
        setZone(zone);
    }


    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public LocalDate getFirstRegistrationDate() {
        return dateOfRegistration;
    }

    public void setFirstRegistrationDate(LocalDate firstRegistrationDate) {
        this.dateOfRegistration = firstRegistrationDate;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public Zone[] getZone() {
        return zone;
    }

    public void setZone(Zone[] zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return "Abonnement{" +
                "Owner=" + owner +
                ", Type=" + type +
                ", Zone=" + zone +
                ", Date of Registration=" + dateOfRegistration +
                ", Expire Date=" + expireDate +
                '}';
    }
}