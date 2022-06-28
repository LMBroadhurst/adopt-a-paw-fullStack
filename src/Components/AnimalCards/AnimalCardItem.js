import React from 'react'
import { Link } from 'react-router-dom'
import './AnimalCardItem.css';

function AnimalCardItem(props) {
  return (
    <>
        <li className='animalcards_item'>
            <div className='animalcards_item_link'>
                <div className='cardleft'>
                        <img
                        className='animalcards_item_img'
                        src={props.src}
                        />
                </div>
                <div className='cardright'>
                    <h5 className='animalcards_item_text'>
                        <p>Hi, my name is:</p>
                        <p>Species:</p>
                        <p>Breed:</p>
                        <p>Age:</p>
                        <p>Location:</p>
                    </h5>
                </div>
            </div>
        </li>
    </>
  )
}

export default AnimalCardItem