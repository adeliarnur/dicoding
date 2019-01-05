package comm.example.asus_pc.traveltalk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class list1 extends AppCompatActivity {

    ViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list1);

        int images [] ={R.drawable.bali1, R.drawable.bali2, R.drawable.bali3};

        flipper = findViewById(R.id.flipper);

        for (int image: images){
            flipperimage(image);
        }
    }

    public void flipperimage (int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        flipper.addView(imageView);
        flipper.setFlipInterval(4000);  //4 second
        flipper.setAutoStart(true);

        //animationnya
        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);

    }
}
