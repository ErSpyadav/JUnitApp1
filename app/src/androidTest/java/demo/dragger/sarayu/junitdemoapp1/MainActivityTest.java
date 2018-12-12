package demo.dragger.sarayu.junitdemoapp1;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule=new ActivityTestRule<MainActivity>(MainActivity.class);
    MainActivity mainActivity=null;


    @Before
    public void setUp() throws Exception {
        mainActivity=activityTestRule.getActivity();
    }

    @Test
    public void testView()
    {
        View view=mainActivity.findViewById(R.id.txtId);
        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        mainActivity=null;
    }
}