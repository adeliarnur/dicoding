package comm.example.asus_pc.traveltalk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class listMenu extends AppCompatActivity {

    ImageButton gunung, kasur, kereta, resto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);

        gunung = (ImageButton) findViewById(R.id.gunung);
        kasur = (ImageButton) findViewById(R.id.kasur);
        kereta = (ImageButton) findViewById(R.id.kereta);
        resto = (ImageButton) findViewById(R.id.resto);

        gunung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(listMenu.this, kota.class);
                listMenu.this.startActivity(intent);
                listMenu.this.finish();
            }
        });
    }
}
