import React from 'react'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import MainLayout from './components/layout/MainLayout'
import AdminPage from './features/admin/AdminPage'
import AuthPage from './features/auth/AuthPage'
import CatalogPage from './features/catalog/CatalogPage'
import CheckoutPage from './features/checkout/CheckoutPage'
import HomePage from './features/home/HomePage'
import ProductDetailPage from './features/product-detail/ProductDetailPage'

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route element={<MainLayout />}>
          <Route path="/" element={<HomePage />} />
          <Route path="/catalog" element={<CatalogPage />} />
          <Route path="/products" element={<ProductDetailPage />} />
          <Route path="/auth" element={<AuthPage />} />
          <Route path="/admin" element={<AdminPage />} />
          <Route path="/checkout" element={<CheckoutPage />} />
        </Route>
      </Routes>
    </BrowserRouter>
  )
}

export default App
