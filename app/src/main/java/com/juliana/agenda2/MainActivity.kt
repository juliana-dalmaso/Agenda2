package com.juliana.agenda2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class MainActivity : AppCompatActivity() {

    lateinit var pesquisarDigitada: EditText

    lateinit var lupa: Button
    lateinit var exibir: Button
    lateinit var cadastrar: Button

    lateinit var lista: TextView

    //private var nomesCadastrados: MutableList<Contato> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pesquisarDigitada = findViewById(R.id.edtPesquisar)
        lupa = findViewById(R.id.btnPesquisar)
        lista = findViewById(R.id.txtResultado)
        exibir = findViewById(R.id.btnExibir)
        cadastrar = findViewById(R.id.btnCadastrar)


        var listaRecebida = intent.getStringExtra("LISTA")

        cadastrar.setOnClickListener {

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("LISTA", listaRecebida)
            startActivity(intent)

        }


//        lupa.setOnClickListener{
//            lista.text = ""
//            val pesquisar = pesquisarDigitada.text.toString()
//            val resultado = listaRecebida.find{X -> X.nome == pesquisar}
//
//            if (resultado != null) {
//                lista.text = resultado.exibir()
//
//            } else {
//                Toast.makeText(this,
//                    getString(R.string.semPesquisa),
//                    Toast.LENGTH_SHORT).show()
//            }
//
//            pesquisarDigitada.setText("")
//
//        }

        exibir.setOnClickListener{

            lista.text = listaRecebida

        }
    }

}