package com.example.yes;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.github.appintro.AppIntro;
import com.github.appintro.AppIntroPageTransformerType;

public class MainActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        FirstSlide firstSlide = FirstSlide.newInstance(ColorEx.WHITE);
        SecondSlide secondSlide = SecondSlide.newInstance(ColorEx.TUTOR_BEAR_BLUE);
        ThirdSlide thirdSlide = ThirdSlide.newInstance(ColorEx.TUTOR_BEAR_DARK_BLUE);



        addSlide(firstSlide);
        addSlide(secondSlide);
        addSlide(thirdSlide);

        setColorTransitionsEnabled(true);


    }

    public void getStarted(View view) {
        goToNextSlide(false);
    }

    public void iAmStudent(View view) {
        goToNextSlide(false);
    }

    public void iAmTeacher(View view) {
        goToNextSlide(false);
    }
}