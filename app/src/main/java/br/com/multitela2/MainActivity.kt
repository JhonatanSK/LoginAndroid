package br.com.multitela2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_verificar.setOnClickListener {
            var nome = edt_nome.text.toString().trim()
            var senha =edt_senha.text.toString().trim()
            if(edt_nome.text.isNotEmpty() && edt_senha.text.isNotEmpty()){
                val intent = Intent (this, Tela2 ::class.java)
                intent.putExtra("Nome", nome)
                intent.putExtra("senha", senha)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Login ou Senha inválidos!", Toast.LENGTH_LONG).show()
            }

        }
    }
}
