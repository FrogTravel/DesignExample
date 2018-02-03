package nekono.inno.designexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
//    TextView counterTextView;
    int counter;
    @BindView(R.id.counterTextView) TextView counterTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        counterTextView = (TextView) findViewById(R.id.counterTextView);
        ButterKnife.bind(this);
    }

    public void onCounter(View view){
        counter++;
        counterTextView.setText(String.valueOf(counter));
    }

    public void onButton(View view){
        Intent intent = new Intent(this, ButtonsActivity.class);
        startActivity(intent);
    }
}
