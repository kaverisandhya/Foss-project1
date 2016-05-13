package contactmanager.al_quddusislamicapp;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;


public class More_queries extends ActionBarActivity {
    private static Button button_sbm9;
    private static EditText question;
    private static WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_queries);
        OnButtonClick9();
    }
    public void OnButtonClick9()
    {
        button_sbm9=(Button)findViewById(R.id.button9);
        question=(EditText)findViewById(R.id.editText);
        webView=(WebView)findViewById(R.id.webView);
        button_sbm9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    String question1=question.getText().toString();
                        String url="http://www.google.com/";
                        String two=url+question1;
                        webView.getSettings().setLoadsImagesAutomatically(true);
                        webView.getSettings().setJavaScriptEnabled(true);
                        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                        webView.loadUrl(url);

                    }
                }
        );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_more_queries, menu);
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
