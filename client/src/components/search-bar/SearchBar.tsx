import React, { useState } from 'react'
import useSearch from './useSearch'

function SearchBar() {
    const [query, setQuery] = useState("")

    const keys = ['asd']

    const { search } = useSearch(query, keys)

    return (
        <input className="form-control" type="text" placeholder="Search" onChange={e => setQuery(e.target.value)} />
    )
}

export default SearchBar
