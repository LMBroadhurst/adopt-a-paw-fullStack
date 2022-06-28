import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faBars } from "@fortawesome/free-solid-svg-icons";
import PawLogo from "./Images/white-paw-print-transparent-background-17.png";

import "./Header_Stylesheets/HeaderBasics.css";
import "./Header_Stylesheets/HeaderTablet+.css";

const Header = () => {

  const toggleMenuDisplay = () => {

    const menu = document.querySelector(".ScrollDown-Menu");

    if (menu.style.display === "none") {
      menu.classList.add("Header-Navbar-Transition")
      menu.style.display = "flex";
    } else {
      menu.style.display = "none";
    }

  }

  return (
    <>
        <header className="Header-Mobile">
           
            <img src={PawLogo} alt="Adopt A Paw Logo" className="Logo-Header"/>
            
            <h1 className="AAP-Header-Title">Adopt A Paw</h1>

            <nav className="Expanded-Navbar-Header">
              <ul>
                <li>Adopt</li>
                <li>Animals</li>
                <li>Organisations</li>
                <li>Success Stories</li>
                <li>News</li>
              </ul>
            </nav>

            <span className="DropDown-Button-Header"><FontAwesomeIcon icon={faBars} /></span>

            <span className="Account-Link">Account</span>

            <h1>This is a test</h1>

            <p>Hello World</p>

            <p>Another change</p>

        </header>
    </>
  )
}

export default Header