package com.samuelcba.proyectopediloahora

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerPedidos = findViewById<RecyclerView>(R.id.recyclerPedidos)
        val fabAgregarPedido = findViewById<FloatingActionButton>(R.id.fabAgregarPedido)

        val pedidos = mutableListOf(
            Pedido(1, "Pizza grande de muzzarella", "Pendiente"),
            Pedido(2, "Empanadas de carne (docena)", "Entregado"),
            Pedido(3, "Hamburguesa completa", "En camino")
        )
        val adapter = PedidoAdapter(pedidos)
        recyclerPedidos.layoutManager = LinearLayoutManager(this)
        recyclerPedidos.adapter = adapter

        fabAgregarPedido.setOnClickListener {
            val intent = Intent(this, FormularioPedidoActivity::class.java)
            startActivity(intent)
        }
    }
} 