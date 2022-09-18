import { IProduct } from "./product.types"

export interface ICategory {
    id?: number
    name: string
    description: string
    products?: IProduct[]
}
