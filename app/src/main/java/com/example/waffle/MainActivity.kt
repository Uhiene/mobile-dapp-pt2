package com.example.waffle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.waffle.composables.WalletConnectButton
import com.example.waffle.ui.theme.WaffleTheme
import dagger.hilt.android.AndroidEntryPoint
import android.net.Uri
import android.os.Build
import androidx.annotation.RequiresApi
import com.example.waffle.composables.WaffleCard
import com.solana.mobilewalletadapter.clientlib.ActivityResultSender

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
      
       setContent {
           WaffleTheme {
           
                   modifier = Modifier.fillMaxSize()
               ) {
                   Column(
                       modifier = Modifier.padding(16.dp),
                   ) {
                       ...


                       WaffleCard(modifier = Modifier.fillMaxSize())
                   }
               }
           }
       }
   }
}
