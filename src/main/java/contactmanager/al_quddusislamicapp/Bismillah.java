package contactmanager.al_quddusislamicapp;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.internal.view.menu.MenuView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RemoteViews;


public class Bismillah extends ActionBarActivity {
    private static Button button_stm1;
    private static Button button_sbm7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bismillah);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        android.support.v7.app.ActionBar ab=getSupportActionBar();
        ab.setLogo(R.mipmap.mainjpg);
        ab.setDisplayUseLogoEnabled(true);
        ab.setDisplayShowHomeEnabled(true);
        OnButtonClick1();
        OnAlertButtonClick();
       // OnNotifyButton();

    }

    public void OnButtonClick1()
    {
        button_stm1=(Button)findViewById(R.id.button);
        button_stm1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("contactmanager.al_quddusislamicapp.SelectOption");
                        startActivity(intent);
                    }
                }
        );
    }
        public void OnAlertButtonClick()
        {
            button_sbm7=(Button)findViewById(R.id.button7);
            button_sbm7.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            AlertDialog.Builder a_builder =new AlertDialog.Builder(Bismillah.this);
                            a_builder.setMessage("Do you want to close this App?").setCancelable(false).setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                }

                            }).setNegativeButton("No",new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                            AlertDialog alert = a_builder.create();
                            alert.setTitle("Alhamdulillah");
                            alert.show();
                        }
                    }
            );

           }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.activity_bismillah_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.notify_id:
            {
                Intent intent = new Intent();
                PendingIntent pendingIntent = PendingIntent.getActivity(Bismillah.this, 0, intent, 0);
                Notification notification = new Notification.Builder(Bismillah.this).setTicker("TickerTitle")
                        .setContentTitle("Al-Quddus Islamic App")
                        .setContentText("Earn Rewards")
                        .setSmallIcon(R.mipmap.main)
                        .setContentIntent(pendingIntent).getNotification();

                notification.flags = Notification.FLAG_FOREGROUND_SERVICE;
                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                notificationManager.notify(0, notification);
            }
            case R.id.about_id:
            {
                AlertDialog.Builder a_build= new AlertDialog.Builder(this);
                a_build.setMessage("            Al-Quddus Islamic App" +
                        "\n                Version 1.0.1" +
                        "\n   Developed by Al-Quddus Edito" +
                        "\n (fb.com/alquddusedito)" +
                        "\n \n :>This app aims to impart islamic knowledge and is a small step taken to guide Muslims. " +
                        "\n \n :>Several supplications are included in the intention of making people reap the daily rewards." +
                        "\n \n :>The month of Ramadhan which is a blessing upon every Muslim has numerous rewarding good deeds, some of which are discussed here" +
                        "\n \n :>Prayer takes us closer to the Almighty and its virtues lead us in the right path." +
                        "\n \n :>If you find anything incorrect, please e-mail us at irffu96@gmail.com" +
                        "\n \n :>Feel free to contact us at 9791062003" +
                        "\n \n :>We will verify and correct any issues reported " +
                        "\n             JazakhAllah Khairan").setCancelable(false).setPositiveButton("Ok",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();

                    }
                });
                AlertDialog alert=a_build.create();
                alert.setTitle("About App");
                alert.show();

            }
            default:
                    return super.onOptionsItemSelected(item);
        }

    }
}
