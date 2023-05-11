import './App.css';
import Formulario from './page/formulario';
import { createBrowserRouter , RouterProvider } from 'react-router-dom';
import Home from './page/Home';
import Sesion from './page/Sesion';
import Grafico from './page/Grafico';
import Registros from './page/Registros';

const router = createBrowserRouter([
  {
    path: "/",
    element: <Home/>
  },
  {
    path: "/Formulario",
    element: <Formulario/>
  },
  {
    path: "/Sesion",
    element: <Sesion/>
  },
  {
    path: "/Grafico",
    element: <Grafico/>
  },
  {
    path: "/Registros",
    element: <Registros/>
  },


])


function App() {
  return (
    <div className="App">
      
      <RouterProvider router={router}/> 

    </div>
  );
}

export default App;
