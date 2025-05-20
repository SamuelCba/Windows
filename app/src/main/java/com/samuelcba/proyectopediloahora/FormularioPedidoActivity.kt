package com.samuelcba.proyectopediloahora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.samuelcba.proyectopediloahora.R

class FormularioPedidoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_pedido)

        val editDescripcion = findViewById<EditText>(R.id.editDescripcion)
        val editEstado = findViewById<EditText>(R.id.editEstado)
        val btnGuardar = findViewById<Button>(R.id.btnGuardar)

        btnGuardar.setOnClickListener {
            // Aquí iría la lógica para guardar el pedido (ejemplo: enviar a un repositorio o base de datos)
            finish()
        }
    }
} 