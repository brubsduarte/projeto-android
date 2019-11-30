package com.projeto.econonews.Home

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.google.android.material.navigation.NavigationView
import com.projeto.econonews.Home.contact.ContactActivity
import com.projeto.econonews.R
import com.projeto.econonews.post.Post
import com.projeto.econonews.post.PostAdapter
import com.projeto.econonews.post.PostSearch
import androidx.appcompat.widget.Toolbar
import com.facebook.drawee.backends.pipeline.Fresco
import com.projeto.econonews.Home.Utilitarios.InfoUrl
import java.net.URL


class HomeActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener, PostAdapter.ClickpostListener {


    var mAdapter: PostAdapter? = null

    var mLayoutManager: RecyclerView.LayoutManager? = null

    var recyclerView: RecyclerView? = null

    var postSearch: PostSearch? = null
    var listPost = ArrayList<Post>()


    var loading: Boolean? = null
    var page: Int = 1

    var swipe: SwipeRefreshLayout? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)


        Fresco.initialize(this)


        recyclerView = findViewById<RecyclerView>(R.id.mRecyclerHomePost)


        mLayoutManager = LinearLayoutManager(this)
        recyclerView!!.layoutManager = mLayoutManager

        //INICIO POST//
        var postNew = Post()
        var infoUrlNew = InfoUrl()

        infoUrlNew.desc ="Já o preço do diesel foi mantido. Alta ocorre em meio à disparada do dólar em relação ao real."
        infoUrlNew.title = "Petrobras eleva em 4% preço da gasolina nas refinarias"
        infoUrlNew.url = "https://g1.globo.com/economia/noticia/2019/11/27/petrobras-eleva-em-4percent-preco-da-gasolina-nas-refinarias.ghtml"
        infoUrlNew.urlPhoto = "bg_2"

        postNew.desc = "Teste de noticia"
        postNew.time = 10

        postNew.infoUrl = infoUrlNew
        postNew.type = "NEWS"
        listPost.add(postNew)
        //FimPost//

        //INICIO POST//
        var postNew2 = Post()
        var infoUrlNew2 = InfoUrl()

        infoUrlNew2.desc ="Na véspera, moeda dos EUA renovou recorde nominal e fechou a R$ 4,2394, mesmo após intervenções do Banco Central."
        infoUrlNew2.title = "Dólar volta a alcançar R$4,27 após recorde na véspera"
        infoUrlNew2.url = "https://g1.globo.com/economia/noticia/2019/11/27/dolar.ghtml"
        infoUrlNew2.urlPhoto = "bg_1"

        postNew2.desc = "Teste de noticia"
        postNew2.time = 10

        postNew2.infoUrl = infoUrlNew2
        postNew2.type = "NEWS"
        listPost.add(postNew2)
        //FimPost//

        //INICIO POST//
        var postNew3 = Post()
        var infoUrlNew3 = InfoUrl()

        infoUrlNew3.desc ="Segundo analistas, a possibilidade de acordo comercial com os Estados Unidos e o surto de peste suína no país explicam o resultado."
        infoUrlNew3.title = "Exportação de soja do Brasil para a China recua 42% em outubro"
        infoUrlNew3.url = "https://g1.globo.com/economia/agronegocios/noticia/2019/11/25/exportacao-de-soja-do-brasil-para-a-china-recua-42percent-em-outubro.ghtml"
        infoUrlNew3.urlPhoto = "bg_4"

        postNew3.desc = "Teste de noticia"
        postNew3.time = 10

        postNew3.infoUrl = infoUrlNew3
        postNew3.type = "NEWS"
        listPost.add(postNew3)
        //FimPost//

        //INICIO POST//
        var postNew4 = Post()
        var infoUrlNew4 = InfoUrl()

        infoUrlNew4.desc ="aaaaa"
        infoUrlNew4.title = "Governo reduz em R$ 8 estimativa do salário mínimo em 2020, para R$ 1.031"
        infoUrlNew4.url = "https://economia.uol.com.br/noticias/redacao/2019/11/26/salario-minimo-2020-estimativa-governo.htm"
        infoUrlNew4.urlPhoto = "bg_5"

        postNew4.desc = "Teste de noticia"
        postNew4.time = 10

        postNew4.infoUrl = infoUrlNew4
        postNew4.type = "NEWS"
        listPost.add(postNew4)
        //FimPost//

        //INICIO POST//
        var postNew5 = Post()
        var infoUrlNew5 = InfoUrl()

        infoUrlNew5.desc ="aaaaa"
        infoUrlNew5.title = "Quem ganha e quem perde com a alta do do dólar: o impacto do câmbio do turismo à indústria"
        infoUrlNew5.url = "https://economia.uol.com.br/noticias/bbc/2019/11/27/quem-ganha-e-quem-perde-com-a-alta-do-dolar-o-impacto-do-cambio.htm"
        infoUrlNew5.urlPhoto = "bg_3"

        postNew5.desc = "Teste de noticia"
        postNew5.time = 10

        postNew5.infoUrl = infoUrlNew5
        postNew5.type = "NEWS"
        listPost.add(postNew5)
        //FimPost//

        //INICIO POST//
        var postNew6 = Post()
        var infoUrlNew6 = InfoUrl()

        infoUrlNew6.desc ="Custo da proteção tarifária no país tem média de R\$ 181 bilhões por ano. Sobrepreço chega a 32,2% para vestuário e acessórios, 29,5% para automóveis e 10,7% para carnes, laticínios e pescados."
        infoUrlNew6.title = "Brasileiros pagam, em média, 11,4% a mais por produtos industriais para ‘proteger’ produtores, aponta Ipea"
        infoUrlNew6.url = "https://g1.globo.com/economia/noticia/2019/11/27/brasileiros-pagam-em-media-114percent-a-mais-por-produtos-industriais-para-proteger-produtores-aponta-ipea.ghtml"
        infoUrlNew6.urlPhoto = "bg_6"

        postNew6.desc = "Teste de noticia"
        postNew6.time = 10

        postNew6.infoUrl = infoUrlNew6
        postNew6.type = "NEWS"
        listPost.add(postNew6)
        //FimPost//

        //INICIO POST//
        var postNew7 = Post()
        var infoUrlNew7 = InfoUrl()

        infoUrlNew7.desc ="Na véspera, a bolsa fechou em queda de 1,26%, a 107.059 pontos."
        infoUrlNew7.title = "Bovespa tem dia de sobe e desce nesta quarta"
        infoUrlNew7.url = "https://g1.globo.com/economia/noticia/2019/11/27/bovespa.ghtml"
        infoUrlNew7.urlPhoto = "bg_7"

        postNew7.desc = "Teste de noticia"
        postNew7.time = 10

        postNew7.infoUrl = infoUrlNew7
        postNew7.type = "NEWS"
        listPost.add(postNew7)
        //FimPost//

        //INICIO POST//
        var postNew8 = Post()
        var infoUrlNew8 = InfoUrl()

        infoUrlNew8.desc ="Apesar das dúvidas quanto ao ritmo das vendas nos próximos meses, expectativa para o final de ano segue positiva, sob influência da liberação de recursos do FGTS."
        infoUrlNew8.title = "Confiança do comércio recua em novembro, aponta FGV"
        infoUrlNew8.url = "https://g1.globo.com/economia/noticia/2019/11/27/confianca-do-comercio-recua-em-novembro-aponta-fgv.ghtml"
        infoUrlNew8.urlPhoto = "bg_8"

        postNew8.desc = "Teste de noticia"
        postNew8.time = 10

        postNew8.infoUrl = infoUrlNew8
        postNew8.type = "NEWS"
        listPost.add(postNew8)
        //FimPost//

        //INICIO POST//
        var postNew9 = Post()
        var infoUrlNew9 = InfoUrl()

        infoUrlNew9.desc ="Segundo o Banco Central, taxa do crédito consignado está no menor nível em quase 25 anos e compra de veículos está perto do piso."
        infoUrlNew9.title = "Juro do cheque especial cai e do cartão de crédito sobe em outubro"
        infoUrlNew9.url = "https://g1.globo.com/economia/noticia/2019/11/27/juro-do-cheque-especial-cai-e-do-cartao-de-credito-sobe-em-outubro-ambos-superam-300percent-ao-ano.ghtml"
        infoUrlNew9.urlPhoto = "bg_9"

        postNew9.desc = "Teste de noticia"
        postNew9.time = 10

        postNew9.infoUrl = infoUrlNew9
        postNew9.type = "NEWS"

        listPost.add(postNew9)
        //FimPost//

        //INICIO POST//
        var postNew10 = Post()
        var infoUrlNew10 = InfoUrl()

        infoUrlNew10.desc ="Acionamento marca a inauguração oficial da usina, cuja construção se iniciou em 2010. Com ativação, hidrelétrica considerada a quarta maior do mundo entra em plena operação."
        infoUrlNew10.title = "Belo Monte ativa última turbina da hidrelétrica em cerimônia com a presença de Bolsonaro"
        infoUrlNew10.url = "https://g1.globo.com/politica/noticia/2019/11/27/belo-monte-ativa-ultima-turbina-da-hidreletrica-em-cerimonia-com-a-presenca-de-bolsonaro.ghtml"
        infoUrlNew10.urlPhoto = "bg_10"

        postNew10.desc = "Teste de noticia"
        postNew10.time = 10

        postNew10.infoUrl = infoUrlNew10
        postNew10.type = "NEWS"

        listPost.add(postNew10)
        //FimPost//


        mAdapter = PostAdapter(this, ArrayList<Post>())
        mAdapter!!.setClickPostListener(this)

        loadService()
        loadData()

        recyclerView!!.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {

                val visibleItemCount = (mLayoutManager as LinearLayoutManager).getChildCount()
                val totalItemCount = (mLayoutManager as LinearLayoutManager).getItemCount()
                val pastVisiblesItems = (mLayoutManager as LinearLayoutManager).findFirstVisibleItemPosition()


                if (!loading!! && visibleItemCount + pastVisiblesItems >= totalItemCount) {

                    page++
                    loadService()
                }
            }
        })



    }

    var clickSeeMore = View.OnClickListener {

        val intent = Intent(this@HomeActivity, this::class.java)
        startActivity(intent)

    }


    fun loadService() {

        loading = true

        onItemsLoadComplete()


    }

    fun onItemsLoadComplete() {
        // Atualize o adapter e notifique que os dados mudaram

        // Pare o refresh animation
//        swipe!!.isRefreshing = false
    }


    fun loadData() {

        if (listPost.count() > 0) {
            loading = false

//            lblFeedEmpty!!.visibility = View.GONE
            recyclerView!!.visibility = View.VISIBLE
            recyclerView!!.adapter = mAdapter
//
            mAdapter!!.setListItens(listPost)
            mAdapter!!.updateItems()

        } else {
//            lblFeedEmpty!!.visibility = View.VISIBLE
            recyclerView!!.visibility = View.INVISIBLE


        }
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        val id = item.itemId

        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

//        menuInflater.inflate(R.menu.home, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val intent = Intent(this@HomeActivity, ContactActivity::class.java)
        startActivity(intent)

        return true
    }


    override fun clickPost(view: View, position: Int) {
        val post = listPost!!.get(position)

        openNewTabWindow(post.infoUrl!!.url.toString(), this)

    }

    fun openNewTabWindow(urls: String, context: Context) {
        val uris = Uri.parse(urls)
        val intents = Intent(Intent.ACTION_VIEW, uris)
        val b = Bundle()
        b.putBoolean("new_window", true)
        intents.putExtras(b)
        startActivity(intents)
    }

}
