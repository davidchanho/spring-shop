import { createSlice, PayloadAction } from '@reduxjs/toolkit'
import axios from 'axios'
import { Dispatch } from 'react'
import { ICategory } from '../../types/category.types'
import { RootState } from '../store'

interface IState {
    categories: ICategory[]
    status: 'idle' | 'loading' | 'error'
}

const initialState = {
    categories: [],
    status: 'idle'
} as IState

const categorySlice = createSlice({
    name: "category",
    initialState,
    reducers: {
        create(state, action: PayloadAction<ICategory>) {
            state.status = 'idle'
            state.categories = [...state.categories, action.payload]
        },
        get(state, action: PayloadAction<ICategory[]>) {
            state.status = 'idle'
            state.categories = action.payload
        },
        remove(state, action: PayloadAction<number>) {
            state.status = 'idle'
            state.categories = state.categories.filter(category => category.id !== action.payload)
        },
        loading(state) {
            state.status = 'loading'
        },
        error(state) {
            state.status = "error"
        }
    }
})

export const { create, get, remove, loading, error } = categorySlice.actions

export default categorySlice.reducer

export const selectCategory = (state: RootState) => state.categories

export const getCategories = () => async (dispatch: Dispatch<any>) => {
    dispatch(loading())
    try {
        const { data: categories } = await axios.get('/categories/all')
        dispatch(get(categories))
    } catch (error: any) {
        dispatch(error())
    }
}

export const createCategory = (category: ICategory) => async (dispatch: Dispatch<any>) => {
    dispatch(loading())
    try {
        const { data } = await axios.post('/categories', category)
        dispatch(create(data))
    } catch (error: any) {
        dispatch(error())
    }
}

export const deleteCategory = (categoryId: number) => async (dispatch: Dispatch<any>) => {
    try {
        await axios.delete(`/categories/${categoryId}`, { data: { categoryId } })
        dispatch(remove(categoryId))
    } catch (error: any) {
        dispatch(error())
    }
}