package com.ouail.anwarkamel.echotoast

import android.content.Context
import android.widget.Toast

object EchoToast {
    fun show(context: Context) {
        Toast.makeText(context, "Hi Anwar this is Echo Toast", Toast.LENGTH_SHORT).show()
    }
}