import React from "react";
import Navbar from "../components/Navbar";
import "bootstrap/dist/css/bootstrap.min.css";
import {Bar, BarChart, CartesianGrid, Legend, ResponsiveContainer, Tooltip, XAxis, YAxis} from "recharts"

function Grafico() {
const data = [
    {name: "Proceso Clinico",edad: "19", promedio: "2.9",},
    {name: "Interoperabilidad",edad: "20", promedio: "1.2",},
    {name: "Usabilidad",edad: "16", promedio: "0.8",},
    {name: "Fiabilidad",edad: "30", promedio: "2.6",},
    {name: "Seguridad",edad: "10", promedio: "1.5",},
  ];

  return (
    <>
      <Navbar />

      <ResponsiveContainer width="50%" aspect={2}>
        <BarChart data={data} width={70} height={70}   >
            <CartesianGrid strokeDasharray="4" />
            <XAxis dataKey="name"/>
            <YAxis/>
            <Tooltip/>
            <Legend/>
            <Bar dataKey="promedio" fill="#6b48ff"/>

        </BarChart>
      </ResponsiveContainer>

    </>
  );
}

export default Grafico;
