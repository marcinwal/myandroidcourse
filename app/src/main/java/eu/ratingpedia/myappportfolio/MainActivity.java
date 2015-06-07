package eu.ratingpedia.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    public void displayToast(View view){
        Button button = (Button) view;
        String buttonText = (String) button.getText();

        Context context = getApplicationContext();
        CharSequence text = getString(R.string.app_name) + buttonText;

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,text,duration);
        toast.show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Button spotifyButton = (Button) findViewById(R.id.spotify);
//        Button ownButton = (Button) findViewById(R.id.own);
//        Button libraryButton = (Button) findViewById(R.id.library);
//        Button scoresButton = (Button) findViewById(R.id.scores);
//        Button biggerButton = (Button) findViewById(R.id.bigger);
//        Button xyzButton = (Button) findViewById(R.id.xyz);

//        spotifyButton.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                Toast toast = Toast.makeText(getApplicationContext(),"you pressed spotify",Toast.LENGTH_SHORT);
//                toast.show();
//            }
//        });
//
//        ownButton.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                Toast toast = Toast.makeText(getApplicationContext(),"you pressed ownApp",Toast.LENGTH_SHORT);
//                toast.show();
//            }
//        });
//
//        libraryButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Toast toast = Toast.makeText(getApplicationContext(),"you pressed Library",Toast.LENGTH_SHORT);
//                toast.show();
//            }
//        });
//
//        scoresButton.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                Toast toast = Toast.makeText(getApplicationContext(),"you pressed scores",Toast.LENGTH_SHORT);
//                toast.show();
//            }
//        });
//
//        xyzButton.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                Toast toast = Toast.makeText(getApplicationContext(),"you pressed xyzButton",Toast.LENGTH_SHORT);
//                toast.show();
//            }
//        });
//
//        biggerButton.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                Toast toast = Toast.makeText(getApplicationContext(),"you pressed biggerButton",Toast.LENGTH_SHORT);
//                toast.show();
//            }
//        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
