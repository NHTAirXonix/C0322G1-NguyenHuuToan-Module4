package com.codegym.ss7_c0222g1.model.contract;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity(name = "contract_detail")
public class ContractDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_detail_id", columnDefinition = "INT")
    private Integer contractDetailId;

    @ManyToOne
    @JoinColumn(name = "attach_service_id", columnDefinition = "INT", referencedColumnName = "attach_service_id")
    private AttachService attachService;

    @ManyToOne
    @JoinColumn(name = "contract_id", columnDefinition = "INT", referencedColumnName = "contract_id")
    @JsonBackReference("contract")
    private Contract contract;

    @Column
    private Integer quantity;

    public ContractDetail() {
    }

    public ContractDetail(AttachService attachService, Contract contract, Integer quantity) {
        this.attachService = attachService;
        this.contract = contract;
        this.quantity = quantity;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
