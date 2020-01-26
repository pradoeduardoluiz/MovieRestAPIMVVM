package br.com.pradoeduardoluiz.movierestapimvvm

import android.os.Bundle
import android.view.View
import android.widget.Button
import br.com.pradoeduardoluiz.movierestapimvvm.BaseActivity
import br.com.pradoeduardoluiz.movierestapimvvm.R

class RecipeListActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_list)

        findViewById<Button>(R.id.button_test).setOnClickListener {
            if (mProgressBar.visibility == View.VISIBLE) {
                showProgressBar(false)
            } else {
                showProgressBar(true)
            }
        }
    }
}
