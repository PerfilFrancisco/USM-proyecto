import React from "react";
import styled from "styled-components";
import "primeicons/primeicons.css";
import { Link } from "react-router-dom";

function Navbar() {
  return (
    <>
      <Navb>
        <h2>Cens </h2>
        <Link to={"/"} className="pi pi-home"> Home</Link>
        <Link to={"/Formulario"}>Formulario</Link>
        <Link to={"/Grafico"}>Grafico</Link>
        <Link to={"/Registros"} > Registros de Empresa</Link>
        <Link to={"/Sesion"} id="sesion" className="pi pi-user"></Link>
      </Navb>
    </>
  );
}
export default Navbar;

const Navb = styled.nav`
  padding: 0.4rem;
  display: flex;
  justify-contents: space-between;

  background: #2196f3;  
  background: -webkit-linear-gradient(to right, #f44336, #2196f3);
  background: linear-gradient(to left, #f44336, #2196f3); 
  

  h2 {
    font-weight: 400;
    font-weight: bold;
    color: white;
    margin: 20px;
  }

  #sesion {
    margin-left: auto;
    padding: 1.5rem;
    display: flex;
    font-size: 2.2rem;
  }

  a {
    text-decoration: none;
    color: black;
    padding: 1rem;
    display: flex;
    align-items: center;
    border-left: 1px solid black;
    border-right: 1px solid black;
  }
`;
