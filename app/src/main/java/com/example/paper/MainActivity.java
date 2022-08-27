package com.example.paper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void  pedra (View view){

        escolha(1);
    }
    public  void  papel (View view){

        escolha(2);
    }
    public  void  tesoura (View view){

        escolha(3);
    }
    public  void escolha (int escolhadousuario){
      int escolhaU = escolhadousuario;
      ImageView escolha1 = findViewById(R.id.escolha1);
      ImageView escolha2 = findViewById(R.id.escolha2);
      TextView textResultado = findViewById(R.id.textResultado);

      int numeroAleatorio = new Random().nextInt(3);
      int[] opcoes = {1,2,3};
      int escolhaApp = opcoes[numeroAleatorio];

      switch (escolhaApp) {
          case 1:
              escolha2.setImageResource(R.drawable.pedra);
              break;
          case 2:
              escolha2.setImageResource(R.drawable.papel);
              break;
          case 3:
              escolha2.setImageResource(R.drawable.tesoura);
              break;
      }
      switch (escolhaU) {
              case 1:
                  escolha1.setImageResource(R.drawable.pedra);
                  break;
              case 2:
                  escolha1.setImageResource(R.drawable.papel);
                  break;
              case 3:
                  escolha1.setImageResource(R.drawable.tesoura);
                  break;
      }

      if (
              (escolhaApp == 2 && escolhaU == 1 )|| (escolhaApp == 3 && escolhaU == 2) || (escolhaApp == 1 && escolhaU == 3)){

          textResultado.setText("Você Perdeu!!!");
      }else if (
              (escolhaApp == 1 && escolhaU == 2)|| (escolhaApp == 2 && escolhaU == 3) || (escolhaApp == 3 && escolhaU == 1)){

          textResultado.setText("Você Ganhou");
      }else{

          textResultado.setText("Empate");
      }

    }
}