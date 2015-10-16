package com.codepath.mysettingapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //gets called when menu item gets created.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //You can add click listener

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.mnuAdd) {
            Intent i = new Intent(MainActivity.this,RequestActivity.class);
            i.putExtra("user",new User("Bob",26));
            startActivityForResult(i, 200);
         }
        return super.onOptionsItemSelected(item);
    }

    public void onAdd(MenuItem item ){
        Toast.makeText(this,"CLicked!",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(resultCode==200 && requestCode==200){

            int age =data.getIntExtra("age",0);
            String message;
            if(age>21){
                message = "DRINK UP";
            }
            else{
                message = "BIG NO FOR YOU";
            }
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

        }
    }
}
