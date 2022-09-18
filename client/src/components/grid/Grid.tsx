import React, { PropsWithChildren } from 'react'

function Grid({ children }: PropsWithChildren<{}>) {
    return (
        <div className="container">
            <div className="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
                {children}
            </div>
        </div>
    )
}

export default Grid
