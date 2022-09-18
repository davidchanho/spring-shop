function useSearch(query: string, keys: string[]) {
    const search = (data: any) => {
        return data.filter((item: any) => {
            keys.some((key) => item[key].toLowerCase().includes(query))
        })
    }

    return { search }
}

export default useSearch
