package com.example.app.viewModel

import androidx.lifecycle.ViewModel
import com.example.app.module.Database
import java.util.*

class MainViewModel : ViewModel() {
    private val database : Database = Database()
    private var rand = Random()
    var nowNum = -1

    companion object{
        var MaxNum = 101
    }
}