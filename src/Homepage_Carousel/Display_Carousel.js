import Homepage_Carousel, {CarouselItem} from "./Homepage_Carousel"

const Display_Carousel = () => {
    return (
      <>
        <Homepage_Carousel>
        <CarouselItem>
          <table text-align="center">
            <tr>
              <td><img src={require("./images/Daisy.jpeg")}  alt="Daisy" width="90%" justify-content="center"/></td>
              <td><img src={require("./images/Kallie.jpeg")}  alt="Kallie" width="90%" justify-content="center"/></td>
              <td><img src={require("./images/Xander.jpeg")}  alt="Xander" width="90%" justify-content="center"/></td>
            </tr>
          
          </table>
          </CarouselItem>
          <CarouselItem>
          <table>
            <tr>
              <td><img src={require("./images/Elody.jpeg")}  alt="Elody" width="90%"/></td>
              <td><img src={require("./images/Kenan.jpeg")}  alt="Kenan" width="90%"/></td>
              <td><img src={require("./images/Graham.jpeg")}  alt="Graham" width="90%"/></td>
            </tr>
          
          </table>
          </CarouselItem>
          <CarouselItem>
          <table>
            <tr>
              <td><img src={require("./images/Kel.jpeg")}  alt="Kel" width="90%"/></td>
              <td><img src={require("./images/Lola.jpeg")}  alt="Lola" width="90%"/></td>
              <td><img src={require("./images/Max.jpeg")}  alt="Max" width="90%"/></td>
            </tr>
          </table>
          </CarouselItem>
          <CarouselItem>
          <table>
            <tr>
              <td><img src={require("./images/Penny.jpeg")}  alt="Penny" width="90%"/></td>
              <td><img src={require("./images/Simon.jpeg")}  alt="Simon" width="90%"/></td>
              <td><img src={require("./images/Tango.jpeg")}  alt="Tango" width="90%"/></td>
            </tr>
          
          </table>
          </CarouselItem>
      </Homepage_Carousel>
      </>

    );

    }

export default Display_Carousel