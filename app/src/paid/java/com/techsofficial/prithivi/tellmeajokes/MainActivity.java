package com.techsofficial.prithivi.tellmeajokes;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.techsofficial.prithivi.jokedisplay.Displayactivity;

public class MainActivity  extends AppCompatActivity implements GCEAsync.Callback  {

    Button Tellajoke;
    private ProgressDialog pDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Progress dialog
        pDialog = new ProgressDialog(this);
        pDialog.setCancelable(false);


        Tellajoke = (Button) findViewById(R.id.button_joke);
        Tellajoke.setOnClickListener(new View.OnClickListener() {
                                         public void onClick(View view) {
                                             pDialog.setMessage("Loading");
                                             showDialog();
                                             getFetchJoke();
                                         }
                                     }
        );

    }

    private void getFetchJoke(){

        new GCEAsync(this).execute();
    }

    private void showDialog() {
        if (!pDialog.isShowing())
            pDialog.show();
    }

    private void hideDialog() {
        if (pDialog.isShowing())
            pDialog.dismiss();
    }


    @Override
    public void onFinished(String result) {
        hideDialog();
        Intent intent = new Intent(MainActivity.this, Displayactivity.class);
        intent.putExtra("Joke", result);
        String product = "Paid";
        intent.putExtra("Product", product);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.rate) {

            try {


                Uri uril = Uri.parse("market://details?id=" + getPackageName());

                Intent intent1 = new Intent(Intent.ACTION_VIEW, uril);

                startActivity(intent1);
            } catch (ActivityNotFoundException e) {
                // TODO: handle exception
                Uri uril = Uri
                        .parse("http://paly.google.com/store/apps/details?id="
                                + getPackageName());

                Intent intent1 = new Intent(Intent.ACTION_VIEW, uril);

                startActivity(intent1);
            }

        }
        if (id == R.id.share) {

            Intent i=new Intent(android.content.Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(android.content.Intent.EXTRA_SUBJECT,"share");
            i.putExtra(android.content.Intent.EXTRA_TEXT, " Tell Me a Joke  is an Android app loads jokes from Google Cloud Endpoint and uses a separate java library to display the jokes. The app is divided into two Flavours Paid and the Free Version! Download App   http://paly.google.com/store/apps/details?id="
                    + getPackageName());
            startActivity(Intent.createChooser(i,"Share via"));


        }
        if (id == R.id.about) {



            Intent i=new Intent(this, Activity_about.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}
