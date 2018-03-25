package financas.com.financaskotlin.ui.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

/**
 * Created by jvgou on 25/03/2018.
 */
class ListaTransacoesAdapter(transacoes: List<String>) : BaseAdapter() {

    private val transacoes = transacoes;

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItem(posicao: Int): String {
        return transacoes[posicao]
    }

    override fun getItemId(p0: Int): Long {

    }

    override fun getCount(): Int {
        return transacoes.size
    }
}