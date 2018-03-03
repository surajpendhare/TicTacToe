package com.suraj.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String s1,s2,s3,s4,s5,s6,s7,s8,s9;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,again;
    static int flag = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        again = (Button) findViewById(R.id.again);
    }

    public void getData()
    {
        int check=1;

        s1 = b1.getText().toString();
        s2 = b2.getText().toString();
        s3 = b3.getText().toString();
        s4 = b4.getText().toString();
        s5 = b5.getText().toString();
        s6 = b6.getText().toString();
        s7 = b7.getText().toString();
        s8 = b8.getText().toString();
        s9 = b9.getText().toString();

        if (s1.equals(s2)&& s1.equals(s3)&&s3.equals("X")||s1.equals(s2)&& s1.equals(s3)&&s3.equals("O"))
        {
            Toast.makeText(MainActivity.this,s1+" win",Toast.LENGTH_LONG).show();
            check++;
        }
        if (s4.equals(s5)&& s5.equals(s6)&&s6.equals("X")||s4.equals(s5)&& s5.equals(s6)&&s6.equals("O"))
        {
            Toast.makeText(MainActivity.this,s4+" win",Toast.LENGTH_LONG).show();
            check++;
        }
         if (s7.equals(s8)&& s8.equals(s9)&&s9.equals("X")||s7.equals(s8)&& s8.equals(s9)&&s9.equals("O"))
        {
           Toast.makeText(MainActivity.this,s7+" win",Toast.LENGTH_LONG).show();
            check++;
        }
         if (s1.equals(s4)&& s4.equals(s7)&&s7.equals("X")||s1.equals(s4)&& s4.equals(s7)&&s7.equals("O"))
        {
            Toast.makeText(MainActivity.this,s1+" win",Toast.LENGTH_LONG).show();
            check++;
        }
         if (s2.equals(s5)&& s5.equals(s8)&&s8.equals("X")||s2.equals(s5)&& s5.equals(s8)&&s8.equals("O"))
        {
            Toast.makeText(MainActivity.this,s2+" win",Toast.LENGTH_LONG).show();
            check++;
        }
         if (s3.equals(s6)&& s6.equals(s9)&&s9.equals("X")||s3.equals(s6)&& s6.equals(s9)&&s9.equals("O"))
        {
            Toast.makeText(MainActivity.this,s3+" win",Toast.LENGTH_LONG).show();
            check++;
        }
         if (s1.equals(s5)&& s5.equals(s9)&&s9.equals("X")||s1.equals(s5)&& s5.equals(s9)&&s9.equals("O"))
        {
            Toast.makeText(MainActivity.this,s1+" win",Toast.LENGTH_LONG).show();
            check++;
        }
         if (s3.equals(s5)&& s5.equals(s7)&&s7.equals("X")||s3.equals(s5)&& s5.equals(s7)&&s7.equals("O"))
        {
            Toast.makeText(MainActivity.this,s3+" win",Toast.LENGTH_LONG).show();
            check++;
        }

        if(check!=1)
        {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            flag=1;
        }

        if(!s1.equals("") && !s2.equals("") &&! s3.equals("") && !s4.equals("") &&
                !s5.equals("") && !s6.equals("") && !s7.equals("") && !s8.equals("") && !s9.equals(""))
        {
            Toast.makeText(this,"Game Draw! Play Again",Toast.LENGTH_LONG).show();

                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);


        }
    }


    public void b1(View v)
    {
        if(b1.getText().toString().equals("")) {
            if (flag == 1) {
                b1.setText("X");
                flag = 2;
            } else {
                b1.setText("O");
                flag = 1;
            }
            getData();
        }
    }

    public void b2(View v)
    {
        if(b2.getText().toString().equals("")) {
            if (flag == 1) {
                b2.setText("X");
                flag = 2;
            } else {
                b2.setText("O");
                flag = 1;
            }
            getData();
         }
    }
    public void b3(View v) {
        if (b3.getText().toString().equals("")) {
            if (flag == 1) {
                b3.setText("X");
                flag = 2;
            } else {
                b3.setText("O");
                flag = 1;
            }
            getData();
          }
    }
    public void b4(View v)
    {
        if(b4.getText().toString().equals("")) {
            if(flag == 1)
        {
            b4.setText("X");
            flag=2;
        }
        else {
            b4.setText("O");
            flag=1;
        }
        getData();
      }
    }
    public void b5(View v) {
        if (b5.getText().toString().equals("")) {
            if (flag == 1) {
                b5.setText("X");
                flag = 2;
            } else {
                b5.setText("O");
                flag = 1;
            }
            getData();
        }
    }
    public void b6(View v) {
        if (b6.getText().toString().equals("")) {
            if (flag == 1) {
                b6.setText("X");
                flag = 2;
            } else {
                b6.setText("O");
                flag = 1;
            }
            getData();
        }
    }
    public void b7(View v) {
        if (b7.getText().toString().equals("")) {
            if (flag == 1) {
                b7.setText("X");
                flag = 2;
            } else {
                b7.setText("O");
                flag = 1;
            }
            getData();

        }
    }
    public void b8(View v) {
        if (b8.getText().toString().equals("")) {
            if (flag == 1) {
                b8.setText("X");
                flag = 2;
            } else {
                b8.setText("O");
                flag = 1;
            }
            getData();

        }
    }

    public void b9(View v) {
        if (b9.getText().toString().equals("")) {
            if (flag == 1) {
                b9.setText("X");
                flag = 2;
            } else {
                b9.setText("O");
                flag = 1;
            }
            getData();

        }
    }

    public void again(View v)
    {

        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");

        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
    }
}
