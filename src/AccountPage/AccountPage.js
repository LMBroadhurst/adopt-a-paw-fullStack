import "./AccountPageBasic.css";

const AccountPage = () => {
  return (
    <>
        <main>
            <section className="Animal-Image-Account">
                <img src="" alt="" />
            </section>

            <section className="LogIn-Section">
                <form>
                    <input type="text" placeholder="Email Address" />
                    <input type="text" placeholder="Password" />
                    <button type="submit">Log In</button>
                </form>

                <button type="button">Forgot your password?</button>

                <button type="button">Create New Account</button>
            </section>
        </main>
    </>
  )
}

export default AccountPage