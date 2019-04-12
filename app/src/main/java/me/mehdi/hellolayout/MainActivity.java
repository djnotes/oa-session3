package me.mehdi.hellolayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mButton;
    TextView mWelcomeText;
    EditText mName;
    ImageView mImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.sayHello);
        mWelcomeText = findViewById(R.id.welcomeMessage);
        mName = findViewById(R.id.name);
        mImage = findViewById(R.id.yourPicture);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mName.getText().toString();
                String message = "Welcome " + name;
                mWelcomeText.setText(message);
                mImage.setImageResource(R.drawable.girl);
            }
        });
    }
}
