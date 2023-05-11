import React, { useState } from "react";
import Navbar from "../components/Navbar";
import axios from "axios";
import "bootstrap/dist/css/bootstrap.min.css";
import "./css/formu.css";

function Formulario() {
  /* const [nombre, setNombre] = useState("");
  const [apellido, setApellido] = useState("");
  const [email, setEmail] = useState("");
  const [telefono, setTelefono] = useState("");
  const [rut, setRut] = useState("");
  const [empresa, setEmpresa] = useState("");
  const [join, setJoin] = useState("");
  const [run, setRun] = useState("");
  const [razon, setRazon ] = useState("");
  */

  const [formData, setFormData] = useState({
    correo: "",
    primer_nombre: "",
    rut_empresa: "",
    segundo_nombre: "",
    telefono: "",
  });

  const handleChange = (event) => {
    setFormData({
      ...formData,
      [event.target.name]: event.target.value,
    });
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    // Realizar solicitud HTTP utilizando Axios
    axios
      .post('http://localhost:8080/api/empresa/crear', formData)
      .then((response) => {
        console.log(response.data);
        // Hacer algo con la respuesta
      })
      .catch((error) => {
        console.error(error);
        // Manejar errores
      });
  };

  /* const handleSubmit = (e) => {
    e.preventDefault();
    console.log({ nombre, apellido, email, telefono, rut });
  };*/

  return (
    <>
      <Navbar />
      <div id="back" className="w-100 vh-100">
        <div
          style={{ width: "50rem" }}
          className=" col-lg-12 p-3 bg-light shadow-lg h-auto position-absolute translate-middle start-50 top-50 rounded-5  "
        >
          <h2 className=" text-lg-center "> Registro </h2>
          <form id="formulario" className="row g-4 justify-content-md-center" onSubmit={handleSubmit}>
            <label className="form-label col-sm-4">
              Nombre (representante)
              <input
                className="form-control shadow-sm"
                type="text"
                name="primer_nombre"
                value={formData.primer_nombre}
                onChange={handleChange}
              />
            </label>

            <label className="form-label col-sm-4">
              Apellido (representante)
              <input
                className="form-control shadow-sm"
                type="text"
                name="segundo_nombre"
                value={formData.segundo_nombre}
                onChange={handleChange}
              />
            </label>
            
  {/*      <label className="form-label col-sm-4">
              Nombre Empresa
              <input
                className="shadow-sm form-control"
                type="text"
                name="empresa"
                value={empresa}
                onChange={(e) => setEmpresa(e.target.value)}
                required
              />
            </label>
  */}

            <label className="form-label col-sm-6">
              Email
              <input
                className="form-control shadow-sm"
                type="email"
                name="correo"
                value={formData.correo}
                onChange={handleChange}
                required
              />
            </label>

            <label className="form-label col-sm-6">
              Razon Social
              <input
                className="form-control shadow-sm"
                type="text"
                name="rut_empresa"
                value={formData.rut_empresa}
                onChange={handleChange}
              />
            </label>

            <label className="form-label col-sm-3">
              Teléfono
              <input
                className="form-control shadow-sm"
                type="number"
                name="telefono"
                value={formData.telefono}
                onChange={handleChange}
              />
            </label>
{/*
            <label className="form-label col-sm-3">
              R.U.T. Empresa
              <input
                className="form-control shadow-sm"
                type="number"
                value={rut}
                onChange={(e) => setRut(e.target.value)}
              />
            </label>

            <label className="form-label col-sm-3">
              R.U.N. (representante)
              <input
                className="form-control shadow-sm"
                type="number"
                value={run}
                onChange={(e) => setRun(e.target.value)}
              />
            </label>

            <label className="form-label col-sm-3">
              Fecha de Ingreso
              <input
                className="form-control shadow-sm"
                type="number"
                value={join}
                onChange={(e) => setJoin(e.target.value)}
              />
            </label>
*/}
            <button className="btn btn-lg col-lg-4 btn-primary m-3  " type="submit" >
              Guardar
            </button>
          </form>
        </div>
      </div>
    </>
  );
}

export default Formulario;
