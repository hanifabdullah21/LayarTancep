package com.praktisimengajar.layartancep.activity

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.praktisimengajar.layartancep.R

class LoginActivity : AppCompatActivity() {

    //todo 8.1 : menyiapkan variabel untuk view
    lateinit var btnLogin: Button
    lateinit var edtName: EditText
    lateinit var edtPasscode: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //todo 8.2 : inisiasi variabel (sambungkan variabel dengan id view)
        btnLogin = findViewById(R.id.btn_login)
        edtName = findViewById(R.id.edt_name)
        edtPasscode = findViewById(R.id.edt_passcode)

        //todo 8.3 : berikan aksi pada tombol
        btnLogin.setOnClickListener {
            //todo 8.4 : tampilkan isi EditText pada logcat dan toast
            Log.d("LOGIN", "onCreate: ${edtName.text} ${edtPasscode.text}")
            Toast.makeText(this, "${edtName.text} ${edtPasscode.text}", Toast.LENGTH_SHORT).show()
        }
    }
}