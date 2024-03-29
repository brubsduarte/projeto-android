package com.projeto.econonews.post

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.facebook.drawee.view.SimpleDraweeView
import com.projeto.econonews.R
import kotlinx.android.synthetic.main.card_post.view.*
import java.text.SimpleDateFormat


class PostAdapter(private val context: Context, private var listItens: ArrayList<Post>?) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var clickPostListener: ClickpostListener? = null

    private var tamanhoAntigoLista = 0

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val item = listItens!![position]

        (holder as? PostAdapter.PostHolder)?.bindView(item)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        var ph: RecyclerView.ViewHolder? = null


        val v = LayoutInflater.from(context).inflate(R.layout.card_post, parent, false)
        ph = PostHolder(v)
        configClicks(v, ph)

        return ph
    }


    private fun configClicks(view: View, holder: PostHolder) {


        holder.imgPost.setOnClickListener { v -> clickPostListener!!.clickPost(v, holder.adapterPosition) }
        holder.txtSeeMore.setOnClickListener { v -> clickPostListener!!.clickPost(v, holder.adapterPosition) }
    }


    override fun getItemViewType(position: Int): Int {


        return 1
    }


    override fun getItemCount(): Int {

        return listItens!!.size
    }


    class PostHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        internal var cv: CardView
        internal var imgPost: SimpleDraweeView
        internal var lblPost: TextView
        internal var lblCreationDate: TextView
        internal var txtSeeMore: TextView

        var post: Post? = null


        init {
            cv = itemView.findViewById(R.id.cvPost)
            imgPost = itemView.findViewById(R.id.imgPost)
            lblPost = itemView.findViewById(R.id.lblPost)
            txtSeeMore = itemView.findViewById(R.id.txtSeeMore)
            lblCreationDate = itemView.findViewById(R.id.lblCreationDate)


        }


        fun bindView(post: Post) {

            this.post = post


//            val formatter = SimpleDateFormat("MM/yy")


//            lblCreationDate.text = formatter.format(post.creationDate)

            val infoUrl = post.infoUrl

            if (infoUrl != null) {
                lblPost.text = infoUrl.title
//                imgPost.setImageURI(infoUrl.urlPhoto)

                var image = infoUrl.urlPhoto

                if(image == "bg_1"){
                    imgPost.setActualImageResource(R.drawable.bg_1)
                }

            }
            if (infoUrl != null) {
                lblPost.text = infoUrl.title
//                imgPost.setImageURI(infoUrl.urlPhoto)

                var image = infoUrl.urlPhoto

                if(image == "bg_2"){
                    imgPost.setActualImageResource(R.drawable.bg_2)
                }

            }
            if (infoUrl != null) {
                lblPost.text = infoUrl.title
//                imgPost.setImageURI(infoUrl.urlPhoto)

                var image = infoUrl.urlPhoto

                if(image == "bg_4"){
                    imgPost.setActualImageResource(R.drawable.bg_4)
                }

            }
            if (infoUrl != null) {
                lblPost.text = infoUrl.title
//                imgPost.setImageURI(infoUrl.urlPhoto)

                var image = infoUrl.urlPhoto

                if(image == "bg_5"){
                    imgPost.setActualImageResource(R.drawable.bg_5)
                }

            }
            if (infoUrl != null) {
                lblPost.text = infoUrl.title
//                imgPost.setImageURI(infoUrl.urlPhoto)

                var image = infoUrl.urlPhoto

                if(image == "bg_3"){
                    imgPost.setActualImageResource(R.drawable.bg_3)
                }

            }
            if (infoUrl != null) {
                lblPost.text = infoUrl.title
//                imgPost.setImageURI(infoUrl.urlPhoto)

                var image = infoUrl.urlPhoto

                if(image == "bg_6"){
                    imgPost.setActualImageResource(R.drawable.bg_6)
                }

            }
            if (infoUrl != null) {
                lblPost.text = infoUrl.title
//                imgPost.setImageURI(infoUrl.urlPhoto)

                var image = infoUrl.urlPhoto

                if(image == "bg_7"){
                    imgPost.setActualImageResource(R.drawable.bg_7)
                }

            }
            if (infoUrl != null) {
                lblPost.text = infoUrl.title
//                imgPost.setImageURI(infoUrl.urlPhoto)

                var image = infoUrl.urlPhoto

                if(image == "bg_8"){
                    imgPost.setActualImageResource(R.drawable.bg_8)
                }

            }
            if (infoUrl != null) {
                lblPost.text = infoUrl.title
//                imgPost.setImageURI(infoUrl.urlPhoto)

                var image = infoUrl.urlPhoto

                if(image == "bg_9"){
                    imgPost.setActualImageResource(R.drawable.bg_9)
                }

            }
            if (infoUrl != null) {
                lblPost.text = infoUrl.title
//                imgPost.setImageURI(infoUrl.urlPhoto)

                var image = infoUrl.urlPhoto

                if(image == "bg_10"){
                    imgPost.setActualImageResource(R.drawable.bg_10)
                }

            }

        }
    }


    fun setListItens(listItens: ArrayList<Post>) {

        if (this.listItens != null) {
            tamanhoAntigoLista = this.listItens!!.size
        }

        this.listItens = listItens
    }


    fun animateTo(models: List<Post>) {
        applyAndAnimateRemovals(models)
        applyAndAnimateAdditions(models)
        applyAndAnimateMovedItems(models)
    }


    fun removeItem(position: Int): Post {
        val model = listItens!!.removeAt(position)
        notifyItemRemoved(position)
        return model
    }

    fun addItem(position: Int, model: Post) {
        listItens!!.add(position, model)
        notifyItemInserted(position)
    }

    fun moveItem(fromPosition: Int, toPosition: Int) {
        val model = listItens!!.removeAt(fromPosition)
        listItens!!.add(toPosition, model)
        notifyItemMoved(fromPosition, toPosition)
    }


    private fun applyAndAnimateRemovals(newModels: List<Post>) {
        for (i in listItens!!.indices.reversed()) {
            val model = listItens!![i]
            if (!newModels.contains(model)) {
                removeItem(i)
            }
        }
    }


    private fun applyAndAnimateAdditions(newModels: List<Post>) {
        var i = 0
        val count = newModels.size
        while (i < count) {
            val model = newModels[i]
            if (!listItens!!.contains(model)) {
                addItem(i, model)
            }
            i++
        }
    }

    private fun applyAndAnimateMovedItems(newModels: List<Post>) {
        for (toPosition in newModels.indices.reversed()) {
            val model = newModels[toPosition]
            val fromPosition = listItens!!.indexOf(model)
            if (fromPosition >= 0 && fromPosition != toPosition) {
                moveItem(fromPosition, toPosition)
            }
        }
    }


    fun updateItems() {

        notifyItemRangeInserted(tamanhoAntigoLista, listItens!!.size)
    }


    interface ClickpostListener {

        fun clickPost(view: View, position: Int)

    }

    fun setClickPostListener(clickPostListener: ClickpostListener) {

        this.clickPostListener = clickPostListener
    }

}
