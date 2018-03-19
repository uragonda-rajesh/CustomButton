package custombtn.rajesh.apps.my.custombutton;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CustomLoadingButton customButtonLoading;
    public boolean isLoading = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customButtonLoading = findViewById(R.id.button);
        customButtonLoading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customButtonLoading.setLoading(true);
                makeApCall();

            }
        });
    }

    public void makeApCall() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                customButtonLoading.setLoading(false);
            }
        }, 5000);
    }
}
