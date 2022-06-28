import "./App.css"
import Footer from "./Footer/Footer";
import Header from "./Header/Header";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Home from "./Components/Pages/Home";

function App() {
  return (
    <>
      <Router>
        <Header />

          <Routes>
            <Route path ='/' exact element={<Home />}/>
          </Routes>
          
        <Footer />
      </Router>
    </>
  );
}

export default App;

