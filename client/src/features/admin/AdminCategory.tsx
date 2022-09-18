import React, { ChangeEvent, FormEvent, useEffect, useState } from 'react'
import { useAppDispatch, useAppSelector } from '../../app/hooks'
import { createCategory, deleteCategory, getCategories, selectCategory } from '../../app/slices/categories'
import { ICategory } from '../../types/category.types'

const initCategory = {
    name: '',
    description: '',
}

function AdminCategory() {
    const dispatch = useAppDispatch()
    const [category, setCategory] = useState<ICategory>(initCategory)
    const { categories, status } = useAppSelector(selectCategory)
    const [notDisabled, setNotDisabled] = useState<boolean>(false)

    useEffect(() => {
        dispatch(getCategories())
    }, [dispatch])

    const onSubmit = (e: FormEvent<HTMLFormElement>) => {
        e.preventDefault()
        if (notDisabled === true) {
            dispatch(createCategory(category))
            setCategory(initCategory)
        }
    }

    const onChange = (e: ChangeEvent<HTMLInputElement>) => {
        const { name, value } = e.target
        if (category.name.length > 1 && category.description.length > 1) {
            setNotDisabled(true)
        }
        setCategory({
            ...category,
            [name]: value
        })
    }

    const renderCategories = (
        status === "loading" ? <div>Loading</div> : categories?.length === 0 ? <div>Empty</div> : categories?.map((category) =>
            <tr key={category.id}>
                <td className="text-capitalize">{category.id}</td>
                <td className="text-capitalize">{category.name}</td>
                <td className="text-capitalize">{category.description}</td>
                <td className="text-capitalize">{category!.products?.length ?? 0}</td>
                <td>
                    <button className="btn btn-danger" onClick={() => dispatch(deleteCategory(category!.id as number))}>Delete</button>
                </td>
            </tr>
        )
    )

    return (
        <div className="d-flex row">
            <div className="col">
                <table className="table">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                            <th>Description</th>
                            <th>Number of Products</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        {renderCategories}
                    </tbody>
                </table>
            </div>
            <div className="col">
                <form className="vstack gap-3 form" onSubmit={onSubmit}>
                    <div className="form-group">
                        <label className="form-label" htmlFor="name">Name</label>
                        <input className="form-control" type="text" name="name" id="name" value={category.name} onChange={onChange} />
                    </div>
                    <div className="form-group">
                        <label className="form-label" htmlFor="description">Description</label>
                        <input className="form-control" type="text" name="description" id="description" value={category.description} onChange={onChange} />
                    </div>

                    <button className="btn btn-primary" type="submit" disabled={!notDisabled}>Submit</button>
                </form>
            </div>
        </div>
    )
}

export default AdminCategory
