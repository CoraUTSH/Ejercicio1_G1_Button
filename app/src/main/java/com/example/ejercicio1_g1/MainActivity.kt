package com.example.ejercicio1_g1
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Pantalla()
        }
    }
}
@Composable
fun Pantalla(){
    Column(
        modifier = Modifier
            .background(colorResource(id = R.color.Morado))
    ) {
        Mensaje("Juan")
        Mensaje("Patricia")
        Mensaje("Dayron")
        Row(
            modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .size(80.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Boton("Dar Clic")
            Spacer(modifier=Modifier.width(25.dp))
            Boton("Dar otro clic")
        }
        Mi_imagen()

    }
}
@Composable
fun Boton(texto:String){
    Button(onClick = { /*TODO*/
    })
    {
        Text(text = texto)
    }
}
@Composable
fun Mensaje(texto:String){
    Text(
        text = "Bienvenid@ $texto ",
        color= Color.Blue,
        fontSize = 25.sp)
}
@Composable
fun Mi_imagen(){
    Image(painter = painterResource(id = R.drawable.gtomalo2),
        contentDescription ="Es un gato malo",
        modifier=Modifier
            .height(200.dp)


    )
}

@Preview(showSystemUi = true)
@Composable
fun AppView(){
    Pantalla()
}
