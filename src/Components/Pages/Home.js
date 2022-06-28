import React from 'react'
import './Home.css';
import Display_Carousel from '../../Homepage_Carousel/Display_Carousel';

function Home() {
  return (
    <div>
        <div className='homepage-image'>
            <img src={process.env.PUBLIC_URL + '/familydog.jpeg'}/>
            <div className='centred'>Say Hello to Your New Best Friend</div>
        </div>
        <div>
        <Display_Carousel />
        </div>
    </div>
  )
}

export default Home