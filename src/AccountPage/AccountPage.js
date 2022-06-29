import "./AccountPageBasic.css";

const AccountPage = () => {
  return (
    <>
        <main id="Account-Main-Page">
            <section className="Animal-Image-Account">
                <img src="" alt="" />
            </section>

            <section className="LogIn-Section">
                <form>
                    <input type="text" placeholder="Email Address" />
                    <input type="text" placeholder="Password" />
                    <button type="submit">Log In</button>
                </form>

                <span className="Forgot-Password-Acc">Forgot your password?</span>

                <button className="New-Acc-BTN" type="button">Create New Account</button>
            </section>
        </main>
    </>
  )
}

export default AccountPage