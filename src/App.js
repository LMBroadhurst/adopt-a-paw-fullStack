import "./App.css"
import Footer from "./Footer/Footer";
import Header from "./Header/Header";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Home from "./Components/Pages/Home";
import Homepage_Carousel, {CarouselItem} from "./Homepage_Carousel/Homepage_Carousel"
import Display_Carousel from "./Homepage_Carousel/Display_Carousel";

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
      <Header />
      <Display_Carousel />
      <Footer />
    </>
  );
}

export default App;

