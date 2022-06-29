import React from 'react'
import AnimalCards from '../AnimalCards/AnimalCards'
import './AdoptPage.css'

function AdoptPage() {
  return (
    <>
      <h1 className='adoptTitle'>
        Adopt
      </h1>
      <div>
        <AnimalCards />
      </div>
    </>
  )
}

export default AdoptPage