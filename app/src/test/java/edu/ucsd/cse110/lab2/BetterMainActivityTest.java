package edu.ucsd.cse110.lab2;

import static org.junit.Assert.assertEquals;

import android.view.View;
import android.widget.TextView;

import androidx.lifecycle.Lifecycle;
import androidx.test.core.app.ActivityScenario;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class BetterMainActivityTest {
    @Test
    public void test_one_plus_one_equals_two(){
        var scenario = ActivityScenario.launch(MainActivity.class);
        scenario.moveToState(Lifecycle.State.CREATED);
        scenario.moveToState(Lifecycle.State.STARTED);
        scenario.onActivity(activity -> {

            TextView one = (TextView) activity.findViewById(R.id.btn_one);
            TextView plus = (TextView) activity.findViewById(R.id.btn_plus);
            TextView equals = (TextView) activity.findViewById(R.id.btn_equals);
            TextView result = (TextView) activity.findViewById(R.id.display);
            one.performClick();
            plus.performClick();
            one.performClick();
            equals.performClick();

            //assertEquals(View.INVISIBLE, name_view.getVisibility());
            //assertEquals("Jae Won Kim", name_view.getText());
            assertEquals("2", result.getText());
        });
    }


}
