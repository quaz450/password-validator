import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.jessi.password_validator.PasswordValidator;

/**
 * Created by Jessi on 2018-02-09.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ValidatorEspressoTest {

    @Rule
    public ActivityTestRule<PasswordValidator> passwordValidatorRule = new ActivityTestRule<>(PasswordValidator.class);

    @Test
    public void weakPasswordEntered(){
        onView(withId(R.id.passwordField))
                .perform(typeText("password"), closeSoftKeyboard());
        onView(withId(R.id.submitPassword))
                .perform(click());

        onView(withId(R.id.passwordStrength))
                .check(matches(withText("Very Weak")));
    }

}
