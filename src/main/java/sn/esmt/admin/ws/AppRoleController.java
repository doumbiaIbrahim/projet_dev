package sn.esmt.admin.ws;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sn.esmt.admin.dao.AppRoleRepository;
import sn.esmt.admin.entities.AppRoleEntity;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
@AllArgsConstructor
@Controller
public class AppRoleController {
    private AppRoleRepository appRoleRepository;

    //Fonction qui insere dans la Base de Donee
    @PostMapping(path = "/save")//POST REQUEST
    public AppRoleEntity save(@RequestBody AppRoleEntity appRoleEntity){
        return appRoleRepository.save(appRoleEntity);
    }

    //Fonction qui retourne la liste des users
    @GetMapping(path = "/all")
    public List<AppRoleEntity> getAll(){
        return appRoleRepository.findAll();
    }
}
