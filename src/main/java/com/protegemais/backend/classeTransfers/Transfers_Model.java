package com.protegemais.backend.classeTransfers;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "transfers")
public class Transfers_Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private Long from_stop_id;
    private Long to_stop_id;
    private Long from_route_id;
    private Long to_route_id;
    private Integer transfer_type;
    private Integer min_transfer_time;

    public Transfers_Model() {}

    public Transfers_Model(Long from_stop_id, Long to_stop_id, Long from_route_id, Long to_route_id, Integer transfer_type, Integer min_transfer_time) {
        this.from_stop_id = from_stop_id;
        this.to_stop_id = to_stop_id;
        this.from_route_id = from_route_id;
        this.to_route_id = to_route_id;
        this.transfer_type = transfer_type;
        this.min_transfer_time = min_transfer_time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFrom_stop_id() {
        return from_stop_id;
    }

    public void setFrom_stop_id(Long from_stop_id) {
        this.from_stop_id = from_stop_id;
    }

    public Long getTo_stop_id() {
        return to_stop_id;
    }

    public void setTo_stop_id(Long to_stop_id) {
        this.to_stop_id = to_stop_id;
    }

    public Long getFrom_route_id() {
        return from_route_id;
    }

    public void setFrom_route_id(Long from_route_id) {
        this.from_route_id = from_route_id;
    }

    public Long getTo_route_id() {
        return to_route_id;
    }

    public void setTo_route_id(Long to_route_id) {
        this.to_route_id = to_route_id;
    }

    public Integer getTransfer_type() {
        return transfer_type;
    }

    public void setTransfer_type(Integer transfer_type) {
        this.transfer_type = transfer_type;
    }

    public Integer getMin_transfer_time() {
        return min_transfer_time;
    }

    public void setMin_transfer_time(Integer min_transfer_time) {
        this.min_transfer_time = min_transfer_time;
    }

}
