package br.com.etecia.foodfasts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
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
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.MFav:
                Toast.makeText(getApplicationContext(), "Cliquei no favoritos", Toast.LENGTH_SHORT).show();
                break;

            case R.id.MBuscar:
                Toast.makeText(getApplicationContext(), "Cliquei no Buscar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.MConfig:
                Toast.makeText(getApplicationContext(), "Cliquei no Configurações", Toast.LENGTH_SHORT).show();
                break;
            case R.id.MHistory:
                Toast.makeText(getApplicationContext(), "Cliquei no Historico", Toast.LENGTH_SHORT).show();
                break;
            case R.id.MSobre:
                Toast.makeText(getApplicationContext(), "Cliquei no Sobre", Toast.LENGTH_SHORT).show();
                break;
            case R.id.MShare:
                Toast.makeText(getApplicationContext(), "Cliquei no Compartilhar", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}