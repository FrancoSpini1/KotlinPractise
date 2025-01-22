package com.example.app2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


/*
* mi primer login
* titulo "login" debajo los campos y un botoncito que verifique que los valores ingresados son iguales
* a las variables pwd y user, que obvio son strings, si son iguales respectivamente, imprimen un hola mundo
* caso contrario imprimen adios mundo cruel*/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }




        var boton: Button = findViewById(R.id.botonInicioSesion)

        boton.setOnClickListener{

            val usuarioBueno:String = "FrancoSpini"  //mi github
            val pwdBuena:String = "cuca5"
            var user:EditText = findViewById(R.id.campoUsuario)
            var pwd:EditText = findViewById(R.id.campoContrasenia)
            val usuarioIngresado:String =user.text.toString().trim()
            val contraseniaIngresada:String = pwd.text.toString().trim()
            if(usuarioIngresado==usuarioBueno && contraseniaIngresada==pwdBuena){
                Toast.makeText(this, "enhorabuena!", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "error! Intente nuevamente", Toast.LENGTH_SHORT).show()
            }
        }
    }
}