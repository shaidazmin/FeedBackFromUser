package com.example.nz.feedbackfromuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText1, editText2;
    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText1 = (EditText) findViewById(R.id.emailEditText);
        editText2 = (EditText) findViewById(R.id.feedbackEditText);


        button1 = (Button) findViewById(R.id.sendButton);
        button2 = (Button) findViewById(R.id.clearButton);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String email = editText1.getText().toString();
        String message = editText2.getText().toString();

        if(v.getId() == R.id.sendButton)
        {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.setType("text/email");
            intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"nahidul98@gmail.com", "shaidazmin@gmail.com"});
            intent.putExtra(Intent.EXTRA_TEXT,"Email : "+email+"\nMessage : "+message);
            startActivity(intent);

        }
        if(v.getId() == R.id.clearButton)
        {
            editText1.setText("");
            editText2.setText("");
        }

    }
}
