import React, { ImgHTMLAttributes } from 'react'

interface Props {
    items: ImgHTMLAttributes<HTMLImageElement>[]
}
function Carousel({ items }: Props) {
    return (
        <div id="carouselExampleControls" className="carousel slide" data-ride="carousel">
            <div className="carousel-inner">
                {items.map(item => (
                    <Carousel.Item key={item.alt} {...item} />
                ))}
            </div>
            <a className="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                <span className="carousel-control-prev-icon" aria-hidden="true"></span>
                <span className="sr-only">Previous</span>
            </a>
            <a className="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                <span className="carousel-control-next-icon" aria-hidden="true"></span>
                <span className="sr-only">Next</span>
            </a>
        </div>
    )
}

Carousel.Item = ({ src, alt }: ImgHTMLAttributes<HTMLImageElement>) => (
    <div className="carousel-item">
        <img src={src} className="d-block" width="100%" style={{ maxHeight: "600px" }} alt={alt} />
    </div>
)

export default Carousel
