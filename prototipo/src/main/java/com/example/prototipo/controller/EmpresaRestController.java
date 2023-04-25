package com.example.prototipo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.prototipo.model.Empresa;
import com.example.prototipo.service.EmpresaService;


@RestController("/api/empresa")
@CrossOrigin(maxAge = 3600)
public class EmpresaRestController {

      @Autowired
      private EmpresaService empresaService;
 
      public EmpresaRestController(EmpresaService empresaService) {
            this.empresaService = empresaService;
      }

      @GetMapping("/hola")
      public String hola() {
            return "Hola Mundo";
      }
      @GetMapping("/hola2")
      public @ResponseBody String addNewUser () {
            // @ResponseBody means the returned String is the response, not a view name
            // @RequestParam means it is a parameter from the GET or POST request

            Empresa empresa1 = new Empresa("correo", "primer_nombre", "segundo_nombre", 123456789, "rut_empresa");
            empresaService.crearEmpresa(empresa1);
            return "Saved";
      }      
      @GetMapping("/buscar")
      public ResponseEntity<List<Empresa>> findAll(){
            List<Empresa> empresas = empresaService.buscarTodos();
            return ResponseEntity.ok(empresas);
      }

      @PostMapping("/crear")
      public Empresa crearEmpresa(@RequestBody Empresa empresa) {
            return empresaService.crearEmpresa(empresa);
      }

}

