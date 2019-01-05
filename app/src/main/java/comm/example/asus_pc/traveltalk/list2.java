package comm.example.asus_pc.traveltalk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class list2 extends AppCompatActivity {

    ViewFlipper flipper2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);

        int images [] ={R.drawable.jogja, R.drawable.jogja1, R.drawable.jogja2};

        flipper2 = findViewById(R.id.flipper2);

        for (int image: images){
            flipperimage(image);
        }
    }

    public void flipperimage (int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        flipper2.addView(imageView);
        flipper2.setFlipInterval(4000);  //4 second
        flipper2.setAutoStart(true);

        //animationnya
        flipper2.setInAnimation(this, android.R.anim.slide_in_left);
        flipper2.setOutAnimation(this, android.R.anim.slide_out_right);

    }
}
