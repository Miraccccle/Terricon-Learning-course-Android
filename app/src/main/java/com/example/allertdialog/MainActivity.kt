package com.example.allertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import com.example.allertdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        val builder = AlertDialog.Builder(this).create()
        val view = layoutInflater.inflate(R.layout.custom_dialog, null)
        builder.setView(view)
        val dismissBtn = view.findViewById<Button>(R.id.dismissBtn)
        val allowBtn = view.findViewById<Button>(R.id.allowBtn)
        dismissBtn.setOnClickListener {
            builder.dismiss()
        }
        allowBtn.setOnClickListener {
            builder.dismiss()
        }
        builder.setCanceledOnTouchOutside(false)
        binding!!.activateModal.setOnClickListener {
            builder.show()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}