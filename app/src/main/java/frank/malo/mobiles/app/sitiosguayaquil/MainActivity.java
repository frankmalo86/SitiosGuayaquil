package frank.malo.mobiles.app.sitiosguayaquil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import frank.malo.mobiles.app.sitiosguayaquil.herramientas.ImageAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                //Toast.makeText(MainActivity.this, v.getId() + "", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, Mapa.class);
                intent.putExtra("indice", position);
                startActivity(intent);

            }
        });
    }


    public void IrASitio(View view){
        Intent intent = new Intent(this, Mapa.class);
        startActivity(intent);
    }





}
