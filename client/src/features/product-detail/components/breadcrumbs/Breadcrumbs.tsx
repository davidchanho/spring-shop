import React from 'react'
import { useLocation } from 'react-router'
import { Link } from 'react-router-dom'

function Breadcrumbs() {
    const location = useLocation()
    const p = location.pathname.split('/')
    const length = p.length - 1

    return (
        <nav aria-label="breadcrumb">
            <ol className="breadcrumb">
                {p.slice(0, length).map((path) => (
                    <li key={path} className="breadcrumb-item">
                        <Link to={`/${path}`}>{path}</Link>
                    </li>
                ))}
                <li className="breadcrumb-item active" aria-current="page">{p.slice(length)}</li>
            </ol>
        </nav>
    )
}

export default Breadcrumbs
