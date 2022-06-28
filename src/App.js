import "./App.css"
import Footer from "./Footer/Footer";
import Header from "./Header/Header";
import Homepage_Carousel, {CarouselItem} from "./Homepage_Carousel/Homepage_Carousel"
import Display_Carousel from "./Homepage_Carousel/Display_Carousel";

function App() {
  return (
    <>
      <Header />
      <Display_Carousel />
      <Footer />
    </>
  );
}

export default App;

