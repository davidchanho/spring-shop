import React from 'react'
import FeaturedCategories from './components/featured-categories/FeaturedCategories'
import FeaturedProducts from './components/featured-products/FeaturedProducts'
import TwoSection from './components/two-section/TwoSection'

function HomePage() {
    return (
        <div>
            <FeaturedCategories />
            <FeaturedProducts />
            <TwoSection />
        </div>
    )
}

export default HomePage
