import React from 'react'
import './Home.css';

function Home() {
  return (
    <div>
        <div className='homepage-image'>
            <img src={process.env.PUBLIC_URL + '/familydog.jpeg'}/>
            <div className='centred'>Say Hello to Your New Best Friend</div>
        </div>
    </div>
  )
}

export default Home