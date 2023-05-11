import React from "react";
import Navbar from "../components/Navbar";
import "bootstrap/dist/css/bootstrap.min.css";

function Sesion() {
  return (
    <>
      <Navbar />
      <form className="form-signin w-100 m-auto ">
        <div  style={{ width: '15rem' }} className="bg-info position-absolute top-50 start-50 translate-middle border border-black p-3 rounded-3   ">
          <h2 className="h3 mb-3 fw-normal">Iniciar sesión</h2>
          <div className="form-center p-1" >
            <label for="floatingInput" className="p-1">Usuario </label>
            <input type="email"  className="form-control" required pattern="@"/>
          </div>
          <div className="form-center p-1">
            <label for="floatingPassword" className="center p-1">Contraseña </label>
            <input   className="form-control" type="password" />
          </div>

          <button className="w-100 btn btn-lg btn-secondary m-1" type="submit">Iniciar sesión</button>
        </div>
      </form>
    </>
  );
}

export default Sesion;
