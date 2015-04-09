package pl.mg6.bob.livecode;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MyActivity extends ActionBarActivity {

    @InjectView(R.id.text_view)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout);
        ButterKnife.inject(this);

        View view = null;
        view.setOnClickListener(this::onButtonClick);
    }

    @OnClick(R.id.my_button)
    void onButtonClick(View view) {
        textView.setText(
                "Worked"
        );
    }
}
