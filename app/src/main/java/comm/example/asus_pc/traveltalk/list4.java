package comm.example.asus_pc.traveltalk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class list4 extends AppCompatActivity {

    ViewFlipper flipper4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list4);

        int images[] = {R.drawable.malang1, R.drawable.malang2, R.drawable.malang3};

        flipper4 = findViewById(R.id.flipper);

        for (int image : images) {
            flipperimage(image);
        }
    }

        public void flipperimage (int image) {
            ImageView imageView = new ImageView(this);
            imageView.setBackgroundResource(image);

            flipper4.addView(imageView);
            flipper4.setFlipInterval(4000);  //4 second
            flipper4.setAutoStart(true);

            //animationnya
            flipper4.setInAnimation(this, android.R.anim.slide_in_left);
            flipper4.setOutAnimation(this, android.R.anim.slide_out_right);

        }
}
