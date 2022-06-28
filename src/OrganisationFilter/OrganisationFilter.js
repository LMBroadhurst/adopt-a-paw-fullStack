import "./OrgansFiltBasic.css";
import "./OrgansFiltTablet+.css";

const OrganisationFilter = () => {
  return (
    <>
        <section className="Org-Filter-Bar">

            <h4>Filters:</h4>

            <form className="Org-Filter-Form">

                <div className="Name-Check-Label">
                    <input type="checkbox" className="Filt-Checkbox-Org"/>
                    <label htmlFor="Org-Name-Filt">Name</label>
                </div>
                
                <div className="Location-Check-Label">
                    <input type="checkbox" className="Filt-Checkbox-Org"/>
                    <label>Location</label>
                </div>
                

            </form>

        </section>
    
    </>
  )
}

export default OrganisationFilter