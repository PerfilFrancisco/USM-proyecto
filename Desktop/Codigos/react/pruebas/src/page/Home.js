import React from "react";
import { useState } from "react";
import { Card, Button } from "react-bootstrap";
import Navbar from "../components/Navbar";

function Home() {
  const [alterador, setAlterador] = useState(false);
  const [alterador2, setAlterador2] = useState(false);
  const [alterador3, setAlterador3] = useState(false);

  const aspecto1 = () => setAlterador(!alterador);
  const aspecto2 = () => setAlterador2(!alterador2);
  const aspecto3 = () => setAlterador3(!alterador3);

  return (
    <>
      <Navbar />
      <div className="d-flex flex-row">
        <Card
          className="mx-auto my-4"
          onMouseEnter={aspecto1}
          onMouseLeave={aspecto1}
        >
          <Card.Body>
            <Card.Title>Sello Calidad: Telemedicina</Card.Title>
            {alterador && (
              <div className="mt-2">
                <Card.Text>Texto de la tarjeta.</Card.Text>
                <Button variant="secondary" className="mx-2">
                  Acción 2
                </Button>
              </div>
            )}
          </Card.Body>
        </Card>

        <Card
          className="mx-auto my-4"
          onMouseEnter={aspecto2}
          onMouseLeave={aspecto2}
        >
          <Card.Body>
            <Card.Title>Sello Calidad: Programas Formativos en Salud Digital</Card.Title>
            {alterador2 && (
              <div className="mt-2">
                <Card.Text>Texto de la tarjeta.</Card.Text>
                <Button variant="secondary" className="mx-2">
                  Acción 2
                </Button>
              </div>
            )}
          </Card.Body>
        </Card>

        <Card
          className="mx-auto my-4"
          onMouseEnter={aspecto3}
          onMouseLeave={aspecto3}
        >
          <Card.Body>
            <Card.Title>Sello Calidad: Software en Salud</Card.Title>
            {alterador3 && (
              <div className="mt-2">
                <Card.Text>Texto de la tarjeta.</Card.Text>
                <Button variant="secondary" className="mx-2">
                  Acción 2
                </Button>
              </div>
            )}
          </Card.Body>
        </Card>
      </div>
    </>
  );
}

export default Home;
