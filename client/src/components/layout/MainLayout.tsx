import React from 'react'
import { Outlet } from 'react-router'
import Footer from '../footer/Footer'
import Navbar from '../navbar/Navbar'

function MainLayout() {
    return (
        <div>
            <Navbar />
            <div className="min-vh-100">
                <Outlet />
            </div>
            <Footer />
        </div>
    )
}

export default MainLayout
