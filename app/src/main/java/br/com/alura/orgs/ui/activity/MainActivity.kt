package br.com.alura.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.model.Produto
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recycleView)
        recyclerView.adapter =  ListaProdutosAdapter(
            context = this, produtos = listOf(
                Produto(
                    nome = "teste 2",
                    descricao = "Teste Desc 2",
                    valor = "19.02")
        ))
        recyclerView.layoutManager = LinearLayoutManager(this)
   }
}