package project.tpi.oroa.bhie.Kids;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import project.tpi.oroa.bhie.R;

public class CreateSuperHeroActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_super_hero);
        getActionBar().hide();
    }
}
