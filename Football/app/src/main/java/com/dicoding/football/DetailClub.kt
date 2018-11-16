package com.dicoding.football

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Typeface
import android.view.Gravity
import android.widget.ImageView
import android.widget.TextView
import org.jetbrains.anko.*
class DetailClub : AppCompatActivity() {

    private lateinit var imageClub: ImageView

    private var name: String = ""
    private lateinit var nameTextView: TextView


    private var detail: String = ""
    private lateinit var detailClub: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout {
            padding = dip(14)
            gravity = Gravity.CENTER_HORIZONTAL

            imageClub = imageView {
                setImageResource(R.drawable.img_barca)
            }.lparams(width = 150, height = 150) {
                topMargin=dip(30)
                gravity = Gravity.CENTER
                margin = dip(10)

            }

            nameTextView = textView {
                textSize = sp(20).toFloat()
                gravity = Gravity.CENTER
                typeface = Typeface.DEFAULT_BOLD
                bottomPadding =dip (10)

            }.lparams {
                width = matchParent
            }

            detailClub = textView {
                textSize = dip(10).toFloat()
                typeface = Typeface.DEFAULT_BOLD
            }.lparams {
                width = matchParent
                bottomMargin = dip(12)
            }

        }

        val intent = intent

        //getExtra Intent

        name = intent.getStringExtra("name")
        detail = intent.getStringExtra("detail")

        //setIntent
        nameTextView.text = name
        detailClub.text = detail
        imageClub.setImageResource(intent.getIntExtra("image", R.drawable.img_barca))
    }
}

