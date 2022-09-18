import cn from 'classnames'
import React, { useState } from 'react'
import AuthForm from '../../components/auth-form/AuthForm'
import styles from './AuthPage.module.scss'

function AuthPage() {
    const [isRegister, setIsRegister] = useState(false)

    return (
        <div className={cn("p-5 w-100 m-auto", styles.auth)}>
            {isRegister ?
                <AuthForm label="Sign in" /> :
                <>
                    <AuthForm label="Sign up" >

                    </AuthForm>
                </>}
        </div>
    )
}

export default AuthPage
