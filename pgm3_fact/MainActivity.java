package com.example.pgm3_fact;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener
{
    EditText n,fact;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n = (EditText) findViewById(R.id.num);
        fact = (EditText) findViewById(R.id.fact);
        btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        if (view.getId()==R.id.btn)
        {
            int a = Integer.parseInt(n.getText().toString());
            int f=1;
            for(int i=a;i>=1;i--)
                f=f*i;
            fact.setText(String.valueOf(f));
        }
    }

}