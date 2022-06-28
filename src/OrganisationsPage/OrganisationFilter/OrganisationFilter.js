import "./OrgansFiltBasic.css";
import "./OrgansFiltTablet+.css";

const OrganisationFilter = () => {

    const toggleStyle = () => {
        const input = document.getElementsByClassName("Filt-Input-Org");

       input.style.backgroundColor = "blue";
    }

  return (
    <>
        <section className="Org-Filter-Bar">

            <h4>Filters:</h4>

            <form className="Org-Filter-Form">

                <div className="Name-Check-Label">
                    <input type="text" className="Filt-Input-Org" onChange={toggleStyle} />
                    <label htmlFor="Org-Name-Filt">Name</label>
                </div>
                
                <div className="Location-Check-Label">
                    <input type="text" className="Filt-Input-Org" onChange={toggleStyle} />
                    <label>Location</label>
                </div>
                

            </form>

        </section>
    
    </>
  )
}

export default OrganisationFilter