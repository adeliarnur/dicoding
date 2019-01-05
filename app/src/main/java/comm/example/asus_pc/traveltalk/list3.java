package comm.example.asus_pc.traveltalk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class list3 extends AppCompatActivity{

    ViewFlipper flipper3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list3);

        int images [] ={R.drawable.lmg1, R.drawable.lmg2, R.drawable.lmg3};

        flipper3 = findViewById(R.id.flipper2);

        for (int image: images){
        flipperimage(image);
        }
    }
public void flipperimage (int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        flipper3.addView(imageView);
        flipper3.setFlipInterval(4000);  //4 second
        flipper3.setAutoStart(true);

        //animationnya
        flipper3.setInAnimation(this, android.R.anim.slide_in_left);
        flipper3.setOutAnimation(this, android.R.anim.slide_out_right);

        }
}
