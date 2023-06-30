package com.example.prototipo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.prototipo.model.Empresa;
import com.example.prototipo.model.Evaluacion;
import com.example.prototipo.model.Fiabilidad;
import com.example.prototipo.model.Pc;
import com.example.prototipo.model.ProcesoClinico;
import com.example.prototipo.model.Ps;
import com.example.prototipo.model.Ra;
import com.example.prototipo.model.Rte;
import com.example.prototipo.model.Sc;
import com.example.prototipo.model.Seguridad;
import com.example.prototipo.model.Ua;
import com.example.prototipo.model.Usabilidad;
import com.example.prototipo.pdf.DetallePdf;
import com.example.prototipo.model.Ac;
import com.example.prototipo.model.Administrador;
import com.example.prototipo.model.Compatibilidad;
import com.example.prototipo.service.AcService;
import com.example.prototipo.service.CompatibilidadService;
import com.example.prototipo.service.EmpresaService;
import com.example.prototipo.service.EvaluacionService;
import com.example.prototipo.service.FiabilidadService;
import com.example.prototipo.service.PcService;
import com.example.prototipo.service.ProcesoClinicoService;
import com.example.prototipo.service.PsService;
import com.example.prototipo.service.RaService;
import com.example.prototipo.service.RteService;
import com.example.prototipo.service.ScService;
import com.example.prototipo.service.SeguridadService;
import com.example.prototipo.service.UaService;
import com.example.prototipo.service.UsabilidadService;
import com.example.prototipo.service.UsuarioService;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;

import jakarta.servlet.http.HttpServletResponse;


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

      @Autowired
      private AcService acService;

      @Autowired
      private PcService pcService;

      @Autowired
      private PsService psService;

      @Autowired
      private RaService raService;

      @Autowired
      private RteService rteService;

      @Autowired
      private ScService scService;

      @Autowired
      private UaService uaService;   
      
      @Autowired
      private DetallePdf detallePdf;

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
      public Evaluacion obtenerEvaluacion(@PathVariable String email) {                         
            Evaluacion evaluacion = evaluacionService.getEvaluacionPorEmail(email);
            System.out.println(evaluacion.getEmpresa().getEmail());
            return evaluacion;

      }
      @GetMapping("/graficos")
      public ResponseEntity<List<Evaluacion>> graficos(){
            List<Evaluacion> evaluaciones = evaluacionService.getEvaluaciones();
            return ResponseEntity.ok(evaluaciones);
      }

      //######################
      // zona de busqueda y creacion de empresas | posts y puts
      //######################

      @PutMapping("/Edicion/{email}")
      public ResponseEntity<String> actualizarEmpresa(@PathVariable String email, @RequestBody Empresa empresa){

            // luego buscar la empresa existente
            Empresa empresaExistente = empresaService.buscarPorCorreo(email);

            // luego actualizar los campos de la empresa existente con los valores de la empresa actualizada
            empresaExistente.setnombre(empresa.getnombre());
            empresaExistente.setEmail(empresa.getEmail());
            empresaExistente.setTelefono(empresa.getTelefono());
            empresaExistente.setEtapa_sello(empresa.getEtapa_sello());
            empresaExistente.setNombre_contraparte(empresa.getNombre_contraparte());
            empresaExistente.setFecha_ingreso(empresa.getFecha_ingreso());
            empresaExistente.setRut_dni(empresa.getRut_dni());
            empresaExistente.setRazon_social(empresa.getRazon_social());
            empresaExistente.setTipo_sello(empresa.getTipo_sello());
            empresaExistente.setrutempresa(empresa.getrutempresa());
            return ResponseEntity.status(HttpStatus.OK).body("Evaluación actualizada exitosamente");
      }
      

      @PutMapping("/actualizarEvaluacionClinica/{email}")
      public ResponseEntity<String> actualizarEvaluacion(@PathVariable String email, @RequestBody Evaluacion evaluacionActualizada){            
                              
            // luego buscar la evaluación existente asociada a la empresa
            Evaluacion evaluacionExistente = evaluacionService.getEvaluacionPorEmail(email);                        
            if (evaluacionExistente == null) {
                  return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Evaluación no encontrada");
            }
            
            // luego actualizar los campos de la evaluación existente con los valores de la evaluación actualizada
            evaluacionExistente.setFormproce(evaluacionActualizada.getFormproce());
            evaluacionExistente.setFormcompa(evaluacionActualizada.getFormcompa());
            evaluacionExistente.setFormusa(evaluacionActualizada.getFormusa());
            evaluacionExistente.setFormfia(evaluacionActualizada.getFormfia());
            evaluacionExistente.setFormsegu(evaluacionActualizada.getFormsegu());         
            
            // // // luego evitar que se sobreescriban las tablas asociadas a la evaluacion
            procesoClinicoService.actualizarProcesoClinico(evaluacionExistente.getFormproce());
            compatibilidadService.actualizarCompatibilidad(evaluacionExistente.getFormcompa());
            usabilidadService.actualizarUsabilidad(evaluacionExistente.getFormusa());
            fiabilidadService.actualizarFiabilidad(evaluacionExistente.getFormfia());
            seguridadService.actualizarSeguridad(evaluacionExistente.getFormsegu());
            
            // guardar la evaluación actualizada en la base de datos
            evaluacionService.saveEvaluacion(evaluacionExistente);

            return ResponseEntity.status(HttpStatus.OK).body("Evaluación Clinica actualizada exitosamente");
      }

      /*
       * actualizar evaluacion tecnica con sus entidades correspondientes, en repository modificar las clases que no 
       * esten completas y tambien en el service, ya que no todos tienen esa comunicacion que mencione con el JPA
       */

      @PutMapping("/actualizarEvaluacionTecnica/{email}")
      public ResponseEntity<String> actualizarEvaluacionTecnica(@PathVariable String email, @RequestBody Evaluacion evaluacionTecnica){            
            
            // luego buscar la evaluación existente asociada a la empresa
            Evaluacion evaluacionExistente = evaluacionService.getEvaluacionPorEmail(email);                                               
            if (evaluacionExistente == null && evaluacionTecnica == null) {
                  return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Evaluación no encontrada");
            }                
            
            // luego actualizar los campos de la evaluación existente con los valores de la evaluación actualizada
            evaluacionExistente.setAc(evaluacionTecnica.getAc());
            evaluacionExistente.setPc(evaluacionTecnica.getPc());
            evaluacionExistente.setRa(evaluacionTecnica.getRa());
            evaluacionExistente.setRte(evaluacionTecnica.getRte());
            evaluacionExistente.setSc(evaluacionTecnica.getSc());
            evaluacionExistente.setUa(evaluacionTecnica.getUa());
            evaluacionExistente.setPs(evaluacionTecnica.getPs());
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println(evaluacionExistente.getRa().getRa_2());
            System.out.println(evaluacionExistente.getAc().getAc_1());
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            // acService.actualizarAc(evaluacionExistente);
            // pcService.actualizarPc(evaluacionExistente);
            // raService.actualizarRa(evaluacionExistente);
            // rteService.actualizarRte(evaluacionExistente);
            // scService.actualizarSc(evaluacionExistente);
            // uaService.actualizarUa(evaluacionExistente);
            // psService.actualizarPs(evaluacionExistente);
            
            // guardar la evaluación actualizada en la base de datos
            evaluacionService.saveEvaluacion(evaluacionExistente);

            return ResponseEntity.status(HttpStatus.OK).body("Evaluación Tecnica actualizada exitosamente");
      }

      @PostMapping("/crearEmpresa")
      Empresa crearEmpresa(@RequestBody Empresa empresa) {
            //i want to see if the empresa is not in the database            
            Empresa validacion = empresaService.buscarPorCorreo(empresa.getEmail());                   
            if(validacion != empresa){       
                  Evaluacion evaluacion = new Evaluacion();                
                  Fiabilidad fiabilidad = new Fiabilidad();
                  ProcesoClinico procesoClinico = new ProcesoClinico();
                  Compatibilidad compatibilidad = new Compatibilidad();
                  Usabilidad usabilidad = new Usabilidad();
                  Seguridad seguridad = new Seguridad();  
                  Ac ac = new Ac();
                  Pc pc = new Pc();
                  Ra ra = new Ra();
                  Rte rte = new Rte();
                  Sc sc = new Sc();
                  Ua ua = new Ua();
                  Ps ps = new Ps();
                    

                  empresa.setempresaevaluada(false);

                  
                  evaluacion.setEmpresa(empresa);
                  evaluacion.setFormfia(fiabilidad);
                  evaluacion.setFormcompa(compatibilidad);
                  evaluacion.setFormproce(procesoClinico);
                  evaluacion.setFormsegu(seguridad);
                  evaluacion.setFormusa(usabilidad);
                  evaluacion.setAc(ac);
                  evaluacion.setPc(pc);
                  evaluacion.setRa(ra);
                  evaluacion.setRte(rte);
                  evaluacion.setSc(sc);
                  evaluacion.setUa(ua);
                  evaluacion.setPs(ps);


                  fiabilidad.setEvaluacion(evaluacion);
                  procesoClinico.setEvaluacion(evaluacion);
                  compatibilidad.setEvaluacion(evaluacion);
                  usabilidad.setEvaluacion(evaluacion);
                  seguridad.setEvaluacion(evaluacion);
                  ac.setEvaluacion(evaluacion);
                  pc.setEvaluacion(evaluacion);
                  ra.setEvaluacion(evaluacion);
                  rte.setEvaluacion(evaluacion);
                  sc.setEvaluacion(evaluacion);
                  ua.setEvaluacion(evaluacion);
                  ps.setEvaluacion(evaluacion);


                  evaluacionService.saveEvaluacion(evaluacion);

                  return empresaService.crearEmpresa(empresa);
            }
            else {
                  // i want to say the empresa is already created                  
                  return null;
            }
      }

      // i want to delete una empresa
      @DeleteMapping("/eliminarEmpresa/{email}")
      public ResponseEntity<String> eliminarEmpresa(@PathVariable String email) {
            // i want to see if the empresa is in the database
            Empresa empresa = empresaService.buscarPorCorreo(email);
            if (empresa == null) {
                  return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Empresa no encontrada");
            }
            // i want to delete the empresa
            empresaService.eliminarEmpresa(empresa);
            return ResponseEntity.status(HttpStatus.OK).body("Empresa eliminada exitosamente");
      }


      //##################################################################
      // zona de usuario | variables
      //##################################################################
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

      //######################
      // zona de creacion de pdf de detalle
      //######################



      @GetMapping("/crearPdf")
      public ResponseEntity<?> crearPdf(@RequestParam String email) throws DocumentException {            
            // i want to create a pdf    
            System.out.println("pre pdf");                                
            byte[] pdfData = detallePdf.crearPdf(email);
            System.out.println("post pdf");
            System.out.println(pdfData);
            if (pdfData == null){
                  System.out.println("Error al crear el pdf");
                  System.out.println("\n");
                  System.out.println("\n");
                  System.out.println("\n");
                  System.out.println("\n");
            }
            System.out.println("pre httpheaders");
            HttpHeaders headers = new HttpHeaders();
            System.out.println("pre media type");
            headers.setContentType(MediaType.APPLICATION_PDF);
            System.out.println("pre filename");
            // Aquí puedes definir el nombre del archivo que se descargará.
            String filename = "output.pdf";
            System.out.println("pre content disposition");
            headers.setContentDispositionFormData(filename, filename);
            System.out.println("pre response entity");
            ResponseEntity<byte[]> response = new ResponseEntity<>(pdfData, headers, HttpStatus.OK);
            System.out.println("pre return");
            return response;

      }

}

