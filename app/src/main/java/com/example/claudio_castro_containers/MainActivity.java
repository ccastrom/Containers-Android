package com.example.claudio_castro_containers;

import androidx.appcompat.app.AppCompatActivity;
import Class.Cliente;
import Class.Producto;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private Spinner clientes,productos;
    private TextView texto1,texto2,texto3,texto4,texto5,resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clientes=(Spinner)findViewById(R.id.spnClientes);
        productos=(Spinner)findViewById(R.id.spnProductos);
        texto1=(TextView)findViewById(R.id.tv1);
        texto2=(TextView)findViewById(R.id.tv2);
        texto3=(TextView)findViewById(R.id.tv3);
        texto4=(TextView)findViewById(R.id.tv4);
        texto5=(TextView)findViewById(R.id.tv5);
        resultado=(TextView)findViewById(R.id.resultado);

       Cliente cli= new Cliente();
       String[] ListaClientes=cli.getClientes();
        ArrayAdapter adapt= new ArrayAdapter(this, android.R.layout.simple_list_item_1,ListaClientes    );
        clientes.setAdapter(adapt);
        Producto pro= new Producto();
        String[] ListaProductos=pro.getProductos();
        ArrayAdapter adapt2= new ArrayAdapter(this, android.R.layout.simple_list_item_1,pro.getProductos());
        productos.setAdapter(adapt2);
        texto1.setText(""+pro.getProductos()[0]+" 6500");
        texto2.setText(""+pro.getProductos()[1]+" 2500");
        texto3.setText(""+pro.getProductos()[2]+" 2500");
        texto4.setText(""+pro.getProductos()[3]+" 1300");
        texto5.setText(""+pro.getProductos()[4]+" 6000");


    }
    public void calcular(View view){

        Cliente cli = new Cliente();

        if(clientes.getSelectedItem().toString().equals("Pedro") && productos.getSelectedItem().toString().equals("Cereales")){
            resultado.setText("Si compre cereales el resultado final es: "+cli.calcularPedro(12000,6500));
        }else{
            resultado.setText("Por favor seleccione una opción valida");
        }


    }
}