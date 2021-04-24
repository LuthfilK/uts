package com.luthfil.catatanpenjualan.activity.login

import com.luthfil.catatanpenjualan.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}