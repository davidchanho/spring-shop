import React from 'react'
import { ProductProps } from '../../../../types/product.types'

function FeaturesAccordion({ product }: ProductProps) {
    return (
        <div className="accordion accordion-flush" id="accordionFlushExample">
            {product?.features?.map(({ label, body }) => (
                <div key={label} className="accordion-item">
                    <h2 className="accordion-header" id={`flush-heading-${label}`}>
                        <button className="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target={`#flush-collapse-${label}`} aria-expanded="false" aria-controls={`flush-collapse-${label}`}>{label}</button>
                    </h2>
                    <div className="accordion-collapse collapse" id={`flush-collapse-${label}`} aria-labelledby={`flush-heading-${label}`} data-bs-parent={`#accordion-flush-${product.name}`}>
                        <div className="accordion-body">{body}</div>
                    </div>
                </div>
            ))}
        </div>
    )
}

export default FeaturesAccordion


