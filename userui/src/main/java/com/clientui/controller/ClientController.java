package com.clientui.controller;


import com.clientui.beans.ProductBean;
import com.clientui.proxies.MicroserviceProduitsProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClientController {

    @Autowired
    private MicroserviceProduitsProxy produitsProxy;

    @RequestMapping("/")
    public String accueil(Model model){

        List<ProductBean> produits =  produitsProxy.listeDesProduits();

        model.addAttribute("produits", produits);

        return "Accueil";
    }

}