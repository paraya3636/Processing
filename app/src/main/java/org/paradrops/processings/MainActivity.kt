package org.paradrops.processings

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = Sketch2()
        fragmentManager.beginTransaction().replace(R.id.container, fragment).commit()
    }
}
