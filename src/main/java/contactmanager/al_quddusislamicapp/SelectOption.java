package contactmanager.al_quddusislamicapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class SelectOption extends ActionBarActivity {
    private static Button button_sbm2;
    private static Button button_sbm4;
    private static Button button_sbm5;
    private static Button button_sbm6;
    private static Button button_sbm8;
    private static WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_option);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        OnUrlButton();
        OnButtonClick4();
        OnButtonClick5();
        OnButtonClick6();
        OnButtonClick7();
    }
    public void OnUrlButton()
    {
        button_sbm2=(Button)findViewById(R.id.button2);
        webView1=(WebView)findViewById(R.id.webView2);
        button_sbm2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String url="http://facebook.com/alquddusedito";
                        webView1.getSettings().setLoadsImagesAutomatically(true);
                        webView1.getSettings().setJavaScriptEnabled(true);
                        webView1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                        webView1.loadUrl(url);
                    }
                }
        );
          }

    public void OnButtonClick4()
    {
        button_sbm4=(Button)findViewById(R.id.button4);
        button_sbm4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("contactmanager.al_quddusislamicapp.Forty_Rewarding_Good_Deeds");
                        startActivity(intent);
                    }
                }
        );
    }
    public void OnButtonClick5()
    {
        button_sbm5=(Button)findViewById(R.id.button5);
        button_sbm5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("contactmanager.al_quddusislamicapp.Virtues_of_prayer");
                        startActivity(intent);
                    }
                }
        );
    }
    public void OnButtonClick6()
    {
        button_sbm6=(Button)findViewById(R.id.button6);
        button_sbm6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("contactmanager.al_quddusislamicapp.Supplication");
                        startActivity(intent);
                    }
                }
        );
    }

    public void OnButtonClick7()
    {
        button_sbm8=(Button)findViewById(R.id.button8);
        button_sbm8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("contactmanager.al_quddusislamicapp.More_queries");
                        startActivity(intent);
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_select_option, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
