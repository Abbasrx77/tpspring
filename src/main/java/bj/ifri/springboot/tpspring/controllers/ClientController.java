package bj.ifri.springboot.tpspring.controllers;

import bj.ifri.springboot.tpspring.models.Client;
import bj.ifri.springboot.tpspring.repositories.AgenceProjection;
import bj.ifri.springboot.tpspring.repositories.AgenceRepository;
import bj.ifri.springboot.tpspring.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private AgenceRepository agenceRepository;

    @GetMapping("/list/{agenceId}")
    public String listByAgence(@PathVariable Integer agenceId, Model model) {
        model.addAttribute("clientsCourant", clientRepository.findClientsWithCompteBancaireByAgenceId(agenceId));
        model.addAttribute("clientsInteret", clientRepository.findClientsWithCompteInteretByAgenceId(agenceId));
        model.addAttribute("agenceId", agenceId); // Ajouter l'ID de l'agence au modèle
        return "clients";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        List<AgenceProjection> agences = agenceRepository.findAllProjectedBy();

        model.addAttribute("client", new Client());
        model.addAttribute("agences", agences);
        return "create_client";
    }

    @PostMapping("/save")
    public String saveClient(@ModelAttribute Client client) {
        try{
            clientRepository.save(client);
            return "redirect:/client/list/" + client.getAgence().getId();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
