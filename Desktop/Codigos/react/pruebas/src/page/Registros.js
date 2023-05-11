import React, { useState } from "react";
import { DataTable } from "primereact/datatable";
import { Column } from "primereact/column";
import Navbar from "../components/Navbar";
import "bootstrap/dist/css/bootstrap.min.css";

const Registros = () => {
  const [data ] = useState([
    { nombre: "empresa1", RUT: "21177541-6", correo: "empresa1@gamil.com" },
    { nombre: "empresa2", RUT: "45455123-5", correo: "empresa2@gmail.com" },
    { nombre: "empresa3", RUT: "21323555-9", correo: "empresa4@gmail.com" },
    { nombre: "empresa4", RUT: "12457889-9", correo: "empresa3@gmail.com" },
  ]);

  return (
  <div>
    <Navbar />
      <div className="card col-lg-9 ">
        <DataTable value={data} className="showGridlines"   tableStyle={{ minWidth: '50rem' }}>
          <Column field="nombre" header="Nombre" />
          <Column field="RUT" header="R.U.T." />
          <Column field="correo" header="Correo" />
        </DataTable>
      </div>
  </div>
  );
};

export default Registros;
