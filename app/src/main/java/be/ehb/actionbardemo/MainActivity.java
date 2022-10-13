package be.ehb.actionbardemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int selectedID = item.getItemId();
        if(selectedID == R.id.mi_test){
            Log.d("TEST", "work goddammned");
                Toast.makeText(this, "Pressed the item", Toast.LENGTH_LONG)
                        .show();
                //hier komt ge normaal niet in
        }else if(selectedID == R.id.mi_maps){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW);
            Uri data = Uri.parse("geo:30.5488,5.78946");
            mapIntent.setData(data);
            startActivity(mapIntent);
        }

        return super.onOptionsItemSelected(item);
    }
}