package com.codegym.ss7_c0222g1.controller;

import com.codegym.ss7_c0222g1.model.contract.AttachService;
import com.codegym.ss7_c0222g1.model.contract.Contract;
import com.codegym.ss7_c0222g1.model.contract.ContractDetail;
import com.codegym.ss7_c0222g1.service.contract.AttachServiceService;
import com.codegym.ss7_c0222g1.service.contract.ContractDetailService;
import com.codegym.ss7_c0222g1.service.contract.ContractService;
import com.codegym.ss7_c0222g1.service.customer.CustomerTypeService;
import com.codegym.ss7_c0222g1.service.service.RentTypeService;
import com.codegym.ss7_c0222g1.service.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/contract")
public class ContractController {

    @Autowired
    private AttachServiceService attachServiceService;

    @Autowired
    private ContractDetailService contractDetailService;

    @Autowired
    private ServiceTypeService serviceTypeService;

    @Autowired
    private ContractService contractService;

    @GetMapping("/list")
    public String showList(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        Sort sort = Sort.by("contract_id");
        Page<Contract> contractList = contractService.findAllContract(PageRequest.of(page, 5, sort));
        model.addAttribute("contractList", contractList);
        model.addAttribute("contractDetail", new ContractDetail());
        model.addAttribute("attachServiceList", attachServiceService.findAllAttachService());
        model.addAttribute("totalPay", contractService.getTotalPay());
        return "/contract/ContractList";
    }

    @PostMapping("/createContractDetail")
    public String contracDetail(@RequestParam(name = "allAttachService", required = false) String[] allAttachService,
                                @RequestParam(name = "unitOfAttachService", required = false) String[] unitOfAttachService,
                                @RequestParam(name = "idContract", required = false) String idContract,
                                Model model) {
        int contractID = Integer.parseInt(idContract);
        for (int i = 0; i < allAttachService.length; i++) {
            for (int j = 0; j < unitOfAttachService.length; j++) {
                if (Integer.parseInt(allAttachService[i])==(j+1)) {
                    Contract contract = contractService.findById(contractID);
                    AttachService attachService = attachServiceService.findById(Integer.parseInt(allAttachService[i]));
                    ContractDetail contractDetail = new ContractDetail();
                    contractDetail.setAttachService(attachService);
                    contractDetail.setContract(contract);
                    contractDetail.setQuantity(Integer.parseInt(unitOfAttachService[j]));
                    contractDetailService.Save(contractDetail);
                }
            }
        }
        return "redirect:/contract/list";
    }
}
