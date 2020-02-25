package com.ketechsoft.belediyemyanimda.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ketechsoft.belediyemyanimda.R
import com.ketechsoft.belediyemyanimda.util.extStartActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnRegister.setOnClickListener {
            this.extStartActivity(RegisterActivity::class.java)
        }
        btnLogin.setOnClickListener {
            this.extStartActivity(MainActivity::class.java)
        }
    }
}
