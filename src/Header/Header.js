import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faBars } from "@fortawesome/free-solid-svg-icons";
import PawLogo from "./Images/white-paw-print-transparent-background-17.png";

import "./Header_Stylesheets/HeaderBasics.css";

const Header = () => {
  return (
    <>
        <header className="Header-Mobile">
            <img src={PawLogo} alt="Adopt A Paw Logo" className="Logo-Header"/>

            <h1 className="AAP-Header-Title">Adopt A Paw</h1>

            <span className="DropDown-Button-Header"><FontAwesomeIcon icon={faBars} /></span>
        </header>
    </>
  )
}

export default Header