export interface IProduct {
    name: string
    features: { label: string, body: string }[]
}

export interface ProductProps {
    product: IProduct
}

export interface ProductsProps {
    products: IProduct[]
}