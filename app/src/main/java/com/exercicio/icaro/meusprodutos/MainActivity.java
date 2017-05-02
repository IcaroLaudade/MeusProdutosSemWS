package com.exercicio.icaro.meusprodutos;

import android.content.Intent;
 import android.support.v7.app.AppCompatActivity;
 import android.os.Bundle;
import android.view.Menu;
 import android.view.MenuItem;
 import android.view.View;
 import android.widget.ListView;
 import android.widget.TextView;
 import java.util.ArrayList;
 import java.util.List;

 public class MainActivity extends AppCompatActivity {
 private List<Produto> produtos = new ArrayList();
 private ProdutoArrayAdapter adapter;

 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);

 produtos.add(new Produto("Brigadeiro", R.drawable.brigadeiros, 0.90));
produtos.add(new Produto("Cupcake", R.drawable.cupcake, 2.50));
 produtos.add(new Produto("Mousse", R.drawable.mousse_maracuja, 1.50));

adapter = new ProdutoArrayAdapter(this, 0, produtos);
 ((ListView) findViewById(R.id.produtos)).setAdapter(adapter);
 ((TextView) findViewById(R.id.valorTotal)).setText("R$0.0");
}
 }
