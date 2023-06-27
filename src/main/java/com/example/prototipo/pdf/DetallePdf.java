package com.example.prototipo.pdf;

import java.io.ByteArrayOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prototipo.model.Evaluacion;
import com.example.prototipo.repository.EvaluacionRepository;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


@Service
public class DetallePdf {

    @Autowired
    private EvaluacionRepository evaluacionRepository;          

    public byte[] crearPdf(String email) throws DocumentException {
        System.out.println("Creando PDF");
    // Fetch your specific Evaluacion from the database
        Evaluacion evaluacionOpt = evaluacionRepository.findByEmpresaEmail(email);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        if (evaluacionOpt == null) {
            // handle the case where there is no Evaluacion with the provided id
            throw new RuntimeException("Evaluacion not found");
        }            
        System.out.println("1. Creando el Documento");
        Document document = new Document();

        System.out.println("2. Creando el PdfWriter");
        PdfWriter.getInstance(document, out);

        System.out.println("3. Abriendo el Documento");
        document.open();

        System.out.println("4. Añadiendo contenido al Documento");
        // Agrega contenido al documento aquí.
        Paragraph title = new Paragraph("Información de " + evaluacionOpt.getEmpresa().getnombre());

        // Centra el título
        title.setAlignment(Element.ALIGN_CENTER);

        // Agrega el título al documento
        document.add(title);
        document.add(new Paragraph("\n"));
        // Crea una tabla con tres columnas
        PdfPTable table = new PdfPTable(3);

        // Informacion
        table.addCell("Email: " + evaluacionOpt.getEmpresa().getEmail());
        table.addCell("Rut Empresa: " + evaluacionOpt.getEmpresa().getrutempresa());
        table.addCell("Razón Social: " + evaluacionOpt.getEmpresa().getRazon_social());

        table.addCell("Nombre Empresa: " + evaluacionOpt.getEmpresa().getnombre());
        table.addCell("Nombre Contraparte: " + evaluacionOpt.getEmpresa().getNombre_contraparte());
        table.addCell("Teléfono Contraparte: " + evaluacionOpt.getEmpresa().getTelefono());

        table.addCell("Rut Dni: " + evaluacionOpt.getEmpresa().getRut_dni());
        table.addCell("Tipo Sello: " + evaluacionOpt.getEmpresa().getTipo_sello());
        table.addCell("Etapa del Sello: " + evaluacionOpt.getEmpresa().getEtapa_sello());         
        document.add(table);               

        // fechas
        Paragraph title2 = new Paragraph("Fechas");

        // Centra el título
        title2.setAlignment(Element.ALIGN_CENTER);

        // Agrega el título al documento
        document.add(title2);
        document.add(new Paragraph("\n"));
        PdfPTable table2 = new PdfPTable(3);
        table2.addCell("Fecha Ingreso: "+ evaluacionOpt.getEmpresa().getFecha_ingreso());
        table2.addCell("Fecha nda: "+evaluacionOpt.getEmpresa().getFecha_nda());
        table2.addCell("Fecha Acceso Herramienta: "+evaluacionOpt.getEmpresa().getfAcceso_herramienta());
        table2.addCell("Fecha Creacion Formulario: "+evaluacionOpt.getEmpresa().getfCreacion_formulario());
        table2.addCell("Fecha Envio Formulario: "+evaluacionOpt.getEmpresa().getfEnvio_formulario());
        table2.addCell("Fecha Demostracion: "+evaluacionOpt.getEmpresa().getFecha_demostracion());
        table2.addCell("Fecha Entrega Informacion Evaluadores: "+evaluacionOpt.getEmpresa().getfEntrega_inf_evaluadores());
        table2.addCell("Fecha Entrega Informe: "+ evaluacionOpt.getEmpresa().getfEntrega_informe());
        table2.addCell("Fecha Entrega Evidencia Final: "+ evaluacionOpt.getEmpresa().getfEntrega_evidencia_final());
        table2.addCell("Fecha Integracion Fonasa: "+evaluacionOpt.getEmpresa().getfIntegracion_fonasa());
        table2.addCell("Fecha Otorgamiento: "+ evaluacionOpt.getEmpresa().getFecha_otorgamiento());               
        document.add(table2);

        // evaluacion del sello
        Paragraph title3 = new Paragraph("Evaluacion del Sello");

        // Centra el título
        title3.setAlignment(Element.ALIGN_CENTER);

        // Agrega el título al documento
        document.add(title3);
        document.add(new Paragraph("\n"));
        PdfPTable table3 = new PdfPTable(3);
        table3.addCell("Eficiencia Eficacia: "+ evaluacionOpt.getFormproce().getEficiencia_eficacia());
        table3.addCell("Seguridad Asistencial: "+evaluacionOpt.getFormproce().getSeguridad_asistencial());
        table3.addCell("Centro Paciente: "+evaluacionOpt.getFormproce().getCentro_paciente());
        table3.addCell("Registro Clinico: "+evaluacionOpt.getFormproce().getRegistro_clinico());
        table3.addCell("Interoperabilidad: "+evaluacionOpt.getFormcompa().getInteroperabilidad());
        table3.addCell("Pruebas Usuario: "+evaluacionOpt.getFormusa().getPruebas_usuario());
        table3.addCell("Errores Usuario: "+evaluacionOpt.getFormusa().getErrores_usuario());
        table3.addCell("Capacidad Aprendizaje: "+evaluacionOpt.getFormusa().getCapacidad_aprendizaje());
        table3.addCell("Accesibilidad: "+evaluacionOpt.getFormusa().getAccesibilidad());
        table3.addCell("Eficiencia Desempeno: "+evaluacionOpt.getFormfia().getEficiencia_desempeno());
        table3.addCell("Tolerancia Fallos: "+evaluacionOpt.getFormfia().getTolerancia_fallos());
        table3.addCell("Capacidad Recuperacion: "+evaluacionOpt.getFormfia().getCapacidad_recuperacion());
        table3.addCell("Arquitectura: "+evaluacionOpt.getFormfia().getArquitectura());
        table3.addCell("Otros Aspectos: "+evaluacionOpt.getFormfia().getOtros_aspectos());
        table3.addCell("Autenticacion: "+evaluacionOpt.getFormsegu().getAutenticacion());
        table3.addCell("Autorizacion: "+evaluacionOpt.getFormsegu().getAutorizacion());
        table3.addCell("Criptografia: "+evaluacionOpt.getFormsegu().getCriptografia());
        table3.addCell("Gestion Contrasenas: "+evaluacionOpt.getFormsegu().getGestion_contrasenas());
        table3.addCell("Integridad: "+evaluacionOpt.getFormsegu().getIntegridad());
        table3.addCell("Autenticidad: "+evaluacionOpt.getFormsegu().getAutenticidad());
        table3.addCell("Gestion Riesgo: "+evaluacionOpt.getFormsegu().getGestion_riesgo());        
        table3.addCell("Documentacion: "+evaluacionOpt.getFormsegu().getDocumentacion());
        document.add(table3);

        // anexo tecnico
        document.newPage();
        Paragraph title4 = new Paragraph("Anexo Tecnico");

        // Centra el título
        title4.setAlignment(Element.ALIGN_CENTER);

        // Agrega el título al documento
        document.add(title4);
        document.add(new Paragraph("\n"));
        PdfPTable table4 = new PdfPTable(3); 
        table4.addCell("Manual de usuario (beneficiario/prestador): "+ evaluacionOpt.getUa().getUa_1()); 
        table4.addCell("Uso y resolución de problemas: "+ evaluacionOpt.getUa().getUa_2());
        table4.addCell("Mecanismos de accesibilidad: "+evaluacionOpt.getUa().getUa_3());
        table4.addCell("Mesa de Ayuda: "+evaluacionOpt.getUa().getUa_4());
        table4.addCell("Matriz de roles: "+evaluacionOpt.getSc().getSc_1());
        table4.addCell("Control de accesos: "+evaluacionOpt.getSc().getSc_2());
        table4.addCell("Identificación de usuario: "+evaluacionOpt.getSc().getSc_3());
        table4.addCell("Autenticación de dos factores: "+evaluacionOpt.getSc().getSc_4());
        table4.addCell("Identificación visual: "+evaluacionOpt.getSc().getSc_5());
        table4.addCell("Identificador de sesión: "+evaluacionOpt.getSc().getSc_6());
        table4.addCell("Identificadores de sesión (A&RA): "+evaluacionOpt.getSc().getSc_7());
        table4.addCell("Ambiente de pruebas: "+evaluacionOpt.getAc().getAc_1());
        table4.addCell("Casos de Prueba: "+evaluacionOpt.getAc().getAc_2());
        table4.addCell("Datos de prueba: "+evaluacionOpt.getAc().getAc_3());
        table4.addCell("Flujos: "+evaluacionOpt.getAc().getAc_4());
        table4.addCell("Pruebas de seguridad y validación: "+evaluacionOpt.getPs().getPs_1());
        table4.addCell("Pruebas de carga y stress: "+evaluacionOpt.getPs().getPs_2());
        table4.addCell("Registro de eventos: "+evaluacionOpt.getRa().getRa_1());
        table4.addCell("Cantidad de atenciones: "+evaluacionOpt.getRa().getRa_2());
        table4.addCell("Actualización de versiones: "+evaluacionOpt.getRa().getRa_3());
        table4.addCell("Diseño técnico de la aplicación: "+evaluacionOpt.getRte().getRte_1());
        table4.addCell("Datos referidos a la interoperabilidad: "+evaluacionOpt.getRte().getRte_2());
        table4.addCell("Métodos de integración: "+evaluacionOpt.getRte().getRte_3());
        table4.addCell("Integración con FONASA: "+evaluacionOpt.getRte().getRte_4());
        table4.addCell("Consentimiento informado: "+evaluacionOpt.getPc().getPc_1());       
        document.add(table4);                                    
        document.close();
        return out.toByteArray();
    }

}

