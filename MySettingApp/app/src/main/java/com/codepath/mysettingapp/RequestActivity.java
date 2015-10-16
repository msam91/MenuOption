package com.codepath.mysettingapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class RequestActivity extends ActionBarActivity {

    EditText etAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);
        User user = (User) getIntent().getSerializableExtra("user");
        etAge = (EditText)findViewById(R.id.etAge);
        etAge.setText(String.valueOf(user.age));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_request, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {


        }

        return super.onOptionsItemSelected(item);
    }

    public void onSubmit(View view){
        int Age = Integer.parseInt(etAge.getText().toString());
        Intent data = new Intent();
        data.putExtra("age",Age);
        data.putExtra("code",200);
        setResult(200,data);
        finish();
    }
}
