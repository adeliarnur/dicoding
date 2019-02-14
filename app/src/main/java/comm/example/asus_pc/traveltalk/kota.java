package comm.example.asus_pc.traveltalk;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class kota extends AppCompatActivity {

    ImageButton mlg,yog,bali,lmg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kota);

        mlg = (ImageButton) findViewById(R.id.mlg);
        mlg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (kota.this, list4.class);
                kota.this.startActivity(intent);
                kota.this.finish();
            }
        });

        bali = (ImageButton) findViewById(R.id.bali);
        bali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (kota.this, list1.class);
                kota.this.startActivity(intent);
                kota.this.finish();
            }
        });

        yog = (ImageButton) findViewById(R.id.yog);
        yog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (kota.this , list2.class);
                kota.this.startActivity(intent);
                kota.this.finish();
            }
        });

        lmg = (ImageButton) findViewById(R.id.lmg);
        lmg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (kota.this, list3.class);
                kota.this.startActivity(intent);
                kota.this.finish();
            }
        });
    }
}
