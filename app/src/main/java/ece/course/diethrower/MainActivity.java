package ece.course.diethrower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.tv);
        ImageView imageView = (ImageView) findViewById(R.id.di);
        Random random =new Random();
        int a = random.nextInt(6);
        switch(a)
        {
            case 0:textView.setText("Result:"+(a+1));imageView.setImageResource(R.drawable.one);break;
            case 1:textView.setText("Result:"+(a+1));imageView.setImageResource(R.drawable.two);break;
            case 2:textView.setText("Result:"+(a+1));imageView.setImageResource(R.drawable.three);break;
            case 3:textView.setText("Result:"+(a+1));imageView.setImageResource(R.drawable.four);break;
            case 4:textView.setText("Result:"+(a+1));imageView.setImageResource(R.drawable.five);break;
            case 5:textView.setText("Result:"+(a+1));imageView.setImageResource(R.drawable.six);
        }

    }

    public void cp(View view)
    {

        TextView textView = (TextView) findViewById(R.id.tv);
        ImageView imageView = (ImageView) findViewById(R.id.di);
        Random random =new Random();
        int a = random.nextInt(6);
        switch(a)
        {
            case 0:textView.setText("Result:"+(a+1));imageView.setImageResource(R.drawable.one);break;
            case 1:textView.setText("Result:"+(a+1));imageView.setImageResource(R.drawable.two);break;
            case 2:textView.setText("Result:"+(a+1));imageView.setImageResource(R.drawable.three);break;
            case 3:textView.setText("Result:"+(a+1));imageView.setImageResource(R.drawable.four);break;
            case 4:textView.setText("Result:"+(a+1));imageView.setImageResource(R.drawable.five);break;
            case 5:textView.setText("Result:"+(a+1));imageView.setImageResource(R.drawable.six);
        }

    }
}
