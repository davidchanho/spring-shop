import React, { useState } from 'react'
import Breadcrumbs from './components/breadcrumbs/Breadcrumbs'
import FeaturesAccordion from './components/features-accordion/FeaturesAccordion'

function ProductDetailPage() {
    const [product] = useState({ name: "product", features: [{ label: "", body: "" }] })

    return (
        <div>
            <Breadcrumbs />
            <FeaturesAccordion product={product} />
        </div>
    )
}

export default ProductDetailPage
