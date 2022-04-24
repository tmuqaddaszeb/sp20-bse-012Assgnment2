package com.example.sp20_bse_012_assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView num;
    private Button b0;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button open;
    private Button back;
    private String keyNum = "2001";
    int count =0;

    @Override
    protected void onStart() {
        super.onStart();
        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        open=findViewById(R.id.bopen);
        back=findViewById(R.id.bback);
        num=findViewById(R.id.num);

    }
    private void setNum(int X){
        String savedNum = num.getText().toString();
        if(savedNum.length()>3)
        {
            return;
        }
        num.setText(savedNum + X);
    }

    @Override
    protected void onResume() {
        super.onResume();
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNum(0);

            }


        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               setNum(1);
            }


        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              setNum(2);
            }


        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             setNum(3);
            }


        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             setNum(4);
            }


        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            setNum(5);
            }


        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            setNum(6);
            }


        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            setNum(7);
            }


        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            setNum(8);
            }


        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             setNum(9);
            }


        });

        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String savedNum = num.getText().toString();
                if(savedNum.equals(keyNum))
                {
                    Intent intent=new Intent(MainActivity.this,savedActivity2.class);
                    startActivity(intent);
                }
                else
                {
                    count++;
                    if(count>3)
                    {
                        finish();
                    }
                    Toast.makeText(MainActivity.this,"wrong key : (" ,Toast.LENGTH_SHORT).show();
                }

            }


        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String savedNum = num.getText().toString();
                if(savedNum.length()>0)
                {
                    num.setText(savedNum.substring(0, savedNum.length()-1));

                }


            }


        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}