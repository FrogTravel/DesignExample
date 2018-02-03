package nekono.inno.designexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;

/**
 * Created by ekaterina on 2/3/18.
 */

public class ButtonsActivity extends AppCompatActivity{
    TableRow tableRow;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        tableRow = (TableRow) findViewById(R.id.tableRow);
    }

    public void onAddButton(View view){
        Button button = new Button(new ContextThemeWrapper(this, R.style.ButtonStyle), null, 0);
        counter++;
        button.setText(String.valueOf(counter));
        button.setId(counter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClicked(view.getId());
            }
        });
        tableRow.addView(button);
    }

    private void buttonClicked(int id) {
        Log.d("Sometag", String.valueOf(id));
    }
}
