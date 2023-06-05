package com.example.prototipo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prototipo.model.Empresa;
import com.example.prototipo.model.Evaluacion;
import com.example.prototipo.model.Fiabilidad;
import com.example.prototipo.model.ProcesoClinico;
import com.example.prototipo.model.Seguridad;
import com.example.prototipo.model.Usabilidad;
import com.example.prototipo.model.Administrador;
import com.example.prototipo.model.Compatibilidad;
import com.example.prototipo.service.CompatibilidadService;
import com.example.prototipo.service.EmpresaService;
import com.example.prototipo.service.EvaluacionService;
import com.example.prototipo.service.FiabilidadService;
import com.example.prototipo.service.ProcesoClinicoService;
import com.example.prototipo.service.SeguridadService;
import com.example.prototipo.service.UsabilidadService;
import com.example.prototipo.service.UsuarioService;


@RestController
@RequestMapping("/api/empresa")
@CrossOrigin(maxAge = 3600)
public class Controladores {

      
      //######################
      // zona de empresas | variables
      //######################
      @Autowired
      private EmpresaService empresaService;

      @Autowired
      private ProcesoClinicoService procesoClinicoService;

      @Autowired
      private CompatibilidadService compatibilidadService;

      @Autowired
      private UsabilidadService usabilidadService;

      @Autowired
      private FiabilidadService fiabilidadService;

      @Autowired
      private SeguridadService seguridadService;

      @Autowired
      private EvaluacionService evaluacionService;

      ////////////////////////////////////////////////////////////////////////////////////////////////

      //######################
      // zona de busqueda y creacion de empresas | gets
      //######################

      @GetMapping("/")
      public String index() {
            return "index";
      }

      @GetMapping("/obtenerEmpresas")
      public ResponseEntity<List<Empresa>> findAll(){
            List<Empresa> empresas = empresaService.buscarTodos();
            return ResponseEntity.ok(empresas);
      }

      @GetMapping("/buscarCorreo/{email}")
      public ResponseEntity<Empresa> findByEmail(@PathVariable String email){
            Empresa empresa = empresaService.buscarPorCorreo(email);
            if (empresa != null) {
                  return ResponseEntity.ok(empresa);
            }
            else{
                  return ResponseEntity.notFound().build();
            }
      }      

      //######################
      // zona de busqueda y creacion de empresas | posts
      //######################

      @PostMapping("/crearEvaluacion/{rutempresa}")
      public ResponseEntity<String> crearEvaluacion(@PathVariable String rutempresa, @RequestBody Evaluacion evaluacion){

            // primero buscar la empresa a traves de su rut y luego guardar evaluacion en la base de datos
            evaluacion.setEmpresa(empresaService.buscarPorRutEmpresa(rutempresa));
            System.out.println(evaluacion.getEmpresa().getrutempresa());
            evaluacionService.crearEvaluacion(evaluacion);
            /////////////////////////////////////////////////


            // proceso clinico

            ProcesoClinico formproc = evaluacion.getFormproce();            
            formproc.setEvaluacion(evaluacion);
            
            // guardar proceso clinico en la base de datos
            procesoClinicoService.crearProcesoClinico(formproc);            

            int Eficiencia_eficacia = formproc.getEficiencia_eficacia();
            int seguridad_asistencial = formproc.getSeguridad_asistencial();
            int centro_paciente = formproc.getCentro_paciente();
            int registro_clinico = formproc.getRegistro_clinico();

            System.out.println(Eficiencia_eficacia);
            System.out.println(seguridad_asistencial);
            /////////////////////////////////////////////////////////


            // compatibilidad

            Compatibilidad formcomp = evaluacion.getFormcompa();
            formcomp.setEvaluacion(evaluacion);

            // guardar compatibilidad en la base de datos
            compatibilidadService.crearCompatibilidad(formcomp);

            int interoperabilidad = formcomp.getInteroperabilidad();
            /////////////////////////////////////////////////////////

      
            // usabilidad

            Usabilidad formusa = evaluacion.getFormusa();
            formusa.setEvaluacion(evaluacion);

            // guardar usabilidad en la base de datos
            usabilidadService.crearUsabilidad(formusa);

            int prueba_usuario = formusa.getPruebas_usuario();
            int errores_usuario = formusa.getErrores_usuario();
            int capacidad_aprendizaje = formusa.getCapacidad_aprendizaje();
            int accesibilidad = formusa.getAccesibilidad();
            /////////////////////////////////////////////////////////


            // fiabilidad

            Fiabilidad formfia = evaluacion.getFormfia();
            formfia.setEvaluacion(evaluacion);

            // guardar fiabilidad en la base de datos
            fiabilidadService.crearFiabilidad(formfia);

            int eficienciaDesempeno = formfia.getEficiencia_desempeno();
            int toleranciaFallos = formfia.getTolerancia_fallos();
            int capacidadRecuperacion = formfia.getCapacidad_recuperacion();
            int arquitectura = formfia.getArquitectura();
            int otrosAspectos = formfia.getOtros_aspectos();            
            /////////////////////////////////////////////////////////


            // seguridad

            Seguridad formseg = evaluacion.getFormsegu();
            formseg.setEvaluacion(evaluacion);

            // guardar seguridad en la base de datos
            seguridadService.crearSeguridad(formseg);

            int autenticacion = formseg.getAutenticacion();
            int autorizacion = formseg.getAutorizacion();
            int criptografia = formseg.getCriptografia();
            int gestion_contrasenas = formseg.getGestion_contrasenas();
            int integridad = formseg.getIntegridad();
            int autenticidad = formseg.getAutenticidad();
            int gestion_riesgo = formseg.getGestion_riesgo();
            int documentacion = formseg.getDocumentacion();
            /////////////////////////////////////////////////

            return ResponseEntity.status(HttpStatus.CREATED).body("Evaluación creada exitosamente");
      }

      @PostMapping("/crearEmpresa")
      Empresa crearEmpresa(@RequestBody Empresa empresa) {
            //i want to see if the empresa is not in the database            
            Empresa validacion = empresaService.buscarPorCorreo(empresa.getEmail());
            System.out.println(empresa.getEmail());
            if(validacion != empresa){
                  empresa.setempresaevaluada(false);
                  return empresaService.crearEmpresa(empresa);
            }
            else {
                  // i want to say the empresa is already created                  
                  return null;
            }
      }


      //######################
      // zona de usuario | variables
      //######################
      @Autowired
      private UsuarioService usuarioService;

      //######################
      // zona de busqueda y creacion de usuarios | gets
      //######################

      //i want to see if the user is in the database
      @GetMapping("/buscarUsuario")
      public ResponseEntity<List<Administrador>> findAllUsers(){
            List<Administrador> usuarios = usuarioService.buscarTodos(); 
            return ResponseEntity.ok(usuarios);            
      }

      //######################
      // zona de busqueda y creacion de usuarios | posts
      //######################
            
      //i want to create a user
      @PostMapping("/crearUsuario")
      Administrador crearUsuario(@RequestBody Administrador usuario) {
            return usuarioService.guardar(usuario);
      }

      //i want to start a sesion
      @PostMapping("/login")
      public ResponseEntity<?> iniciarSesion(@RequestBody Administrador usuario){
            Administrador user = usuarioService.buscarPorNombreYContrasena(usuario.getNombre(), usuario.getContrasena());
            
            if (user != null){
                  return ResponseEntity.ok(user);
            }
            else{
                  return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuario no encontrado");
            }
      }



}

