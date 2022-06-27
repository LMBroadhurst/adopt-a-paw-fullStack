import "./Footer.css";

const Footer = () => {
  return (
    <>
        <footer className="generic-footer">

            <section className="Newsletter-Footer">
                <h3>Newsletter</h3>
                <p>Sign up to be informed about our work and how you can help, such as fundraising, campaigning and events. You can unsubscribe at any time.</p>
                
                <form className="subscribe-footer-form">
                    <input type="email" placeholder="Enter your email here"></input>
                    <button type="submit">Subscribe</button>
                </form>
            </section>

            <section className="SocialMedia-Footer">
                <h3>Social Media</h3>
                <ul>
                    <li>Twitter</li>
                    <li>Instagram</li>
                    <li>Facebook</li>
                    <li>Snapchat</li>
                    <li>TikTok</li>
                </ul>
            </section>

            <section className="Legal-Footer">
                <h3>Legal</h3>
                <ul>
                    <li>Terms and Conditions</li>
                    <li>Cookies</li>
                    <li>Privacy Notice</li>
                </ul>
            </section>

        </footer>
        
    </>
  )
}

export default Footer