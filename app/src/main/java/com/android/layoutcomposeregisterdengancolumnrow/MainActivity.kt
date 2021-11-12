package com.android.layoutcomposeregisterdengancolumnrow

import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.android.layoutcomposeregisterdengancolumnrow.ui.theme.LayoutComposeRegisterDenganColumnRowTheme
import com.android.layoutcomposeregisterdengancolumnrow.ui.theme.Shapes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RegisterLayout()
        }
    }
}

@Composable
fun RegisterLayout() {


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.White)
            .padding(start = 25.dp, end = 25.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Register",
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.aclonica)),
                color = Color(R.color.blue),
                modifier = Modifier.padding(top = 94.dp)
            )

            OutlinedTextField(
                value = "No identitas/Nim/Nip",
                onValueChange = {},
                textStyle = TextStyle(
                    color = Color(R.color.blue),
                    fontFamily = FontFamily(Font(R.font.poppins_reguler)),
                    fontSize = 14.sp
                ),
                modifier = Modifier
                    .padding(top = 16.dp)
                    .fillMaxWidth()
            )

            OutlinedTextField(
                value = "No hp",
                onValueChange = {},
                textStyle = TextStyle(
                    color = Color(R.color.blue),
                    fontFamily = FontFamily(Font(R.font.poppins_reguler)),
                    fontSize = 14.sp
                ),
                modifier = Modifier
                    .padding(top = 16.dp)
                    .fillMaxWidth(),
                keyboardOptions = KeyboardOptions
                    .Default
                    .copy(
                        keyboardType = KeyboardType.Number
                    )
            )

            OutlinedTextField(
                value = "Alamat lengkap",
                onValueChange = {},
                textStyle = TextStyle(
                    color = Color(R.color.blue),
                    fontFamily = FontFamily(Font(R.font.poppins_reguler)),
                    fontSize = 14.sp
                ),
                modifier = Modifier
                    .padding(top = 16.dp)
                    .fillMaxWidth(),
                keyboardOptions = KeyboardOptions
                    .Default
                    .copy(
                        keyboardType = KeyboardType.Text
                    )
            )

            OutlinedTextField(
                value = "Email address",
                onValueChange = {},
                textStyle = TextStyle(
                    color = Color(R.color.blue),
                    fontFamily = FontFamily(Font(R.font.poppins_reguler)),
                    fontSize = 14.sp
                ),
                modifier = Modifier
                    .padding(top = 16.dp)
                    .fillMaxWidth(),
                keyboardOptions = KeyboardOptions
                    .Default
                    .copy(
                        keyboardType = KeyboardType.Email
                    )
            )

            OutlinedTextField(
                value = "Password",
                onValueChange = {},
                textStyle = TextStyle(
                    color = Color(R.color.blue),
                    fontFamily = FontFamily(Font(R.font.poppins_reguler)),
                    fontSize = 14.sp
                ),
                modifier = Modifier
                    .padding(top = 16.dp)
                    .fillMaxWidth(),
                keyboardOptions = KeyboardOptions
                    .Default
                    .copy(
                        keyboardType = KeyboardType.Password
                    )
            )

            OutlinedTextField(
                value = "Confirm password",
                onValueChange = {},
                textStyle = TextStyle(
                    color = Color(R.color.blue),
                    fontFamily = FontFamily(Font(R.font.poppins_reguler)),
                    fontSize = 14.sp
                ),
                modifier = Modifier
                    .padding(top = 16.dp)
                    .fillMaxWidth(),
                keyboardOptions = KeyboardOptions
                    .Default
                    .copy(
                        keyboardType = KeyboardType.Password
                    )
            )

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(top = 28.dp)
                    .width(168.dp)
                    .height(46.dp)
            ) {
                Text(text = "Register")
            }

            Row(
                modifier = Modifier.padding(top = 15.dp)
            ) {
                Text(
                    text = "Already Have an Account ?",
                    fontFamily = FontFamily(Font(R.font.poppins_reguler)),
                    fontSize = 12.sp,
                    color = Color.Black
                )

                Text(
                    text = "Sign In",
                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                    fontSize = 12.sp,
                    color = Color.Black
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewReqisterLayout() {
    RegisterLayout()
}
