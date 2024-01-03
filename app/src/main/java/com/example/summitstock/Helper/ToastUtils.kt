package com.example.summitstock.Helper

import android.content.Context
import android.widget.Toast

class ToastUtils {
    companion object {
        fun showToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}