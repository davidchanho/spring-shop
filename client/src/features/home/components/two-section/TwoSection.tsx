import cn from 'classnames'
import React from 'react'

interface Props {
    reverse?: boolean
}

function TwoSection({ reverse = false }: Props) {
    return (
        <section className="container my-5">
            <div className="row">
                <div className={cn("col-md-7", reverse ? "order-md-1" : "order-md-2")}>
                    <h2 className="fw-normal lh-1">Oh yeah, it’s that good. <span className="text-muted">See for yourself.</span></h2>
                    <p className="lead">Another featurette? Of course. More placeholder content here to give you an idea of how this layout would work with some actual real-world content in place.</p>
                </div>
                <div className={cn("col-md-5 order-md-2", reverse ? "order-md-2" : "order-md-1")}>
                    <svg className="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto" width="500" height="500" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: 500x500" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#eee"></rect><text x="50%" y="50%" fill="#aaa" dy=".3em">500x500</text></svg>
                </div>
            </div>
        </section>
    )
}

export default TwoSection
