import React, { PropsWithChildren } from 'react'
import { BsFacebook, BsGithub, BsTwitter } from 'react-icons/bs'

interface Props {
    label: string
}

function AuthForm({ label, children }: PropsWithChildren<Props>) {
    return (
        <>
            <form className="vstack gap-3">
                <h1 className="fw-normal">{label}</h1>

                <div className="form-floating">
                    <input className="form-control" type="email" id="floatingEmail" placeholder="name@example.com" />
                    <label htmlFor="floatingEmail">Email address</label>
                </div>

                <div className="form-floating">
                    <input className="form-control" type="password" id="floatingPassword" placeholder="Password" />
                    <label htmlFor="floatingPassword">Password</label>
                </div>

                <div>
                    <input className="me-1" type="checkbox" value="remember-me" id="remember" />
                    <label htmlFor="remember">Remember me</label>
                </div>

                {children}

                <button className="btn btn-primary w-100" type="submit">{label}</button>
            </form>

            <hr />
            <button className="w-100 py-2 mb-2 btn btn-outline-dark rounded-3" type="submit">
                <BsTwitter />
                {label} with Twitter
            </button>
            <button className="w-100 py-2 mb-2 btn btn-outline-primary rounded-3" type="submit">
                <BsFacebook />
                {label} with Facebook
                </button>
            <button className="w-100 py-2 mb-2 btn btn-outline-secondary rounded-3" type="submit">
                <BsGithub />
                {label} with GitHub
            </button>
        </>
    )
}

export default AuthForm
