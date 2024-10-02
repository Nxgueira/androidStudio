package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
@Composable
fun MainGui(meuViewmodel: MainGuiViewModel){
    //val x:int = meuViewmodel.contador.observeAsState(0)
     val x: Int by meuViewmodel.contador.observeAsState(0)
    var txtfieldValue by remember{
            mutableStateOf("")
    }

   Column {
       Text(text="contador1")
       Text(text="ContaClique")
       TextField(value = x.toString(), onValueChange = {

       })
       Button(onClick ={
           meuViewmodel.IncrementaContador()
       }){
           Text(text = "Run Clicks =" + x.toString())
       }

   }
}