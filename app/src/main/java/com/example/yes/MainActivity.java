package com.example.yes;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.appintro.AppIntro;

public class MainActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        FirstSlide firstSlide = FirstSlide.newInstance(ColorEx.WHITE);
        SecondSlide secondSlide = SecondSlide.newInstance(ColorEx.TUTOR_BEAR_BLUE);
        ThirdSlide thirdSlide = ThirdSlide.newInstance(ColorEx.TUTOR_BEAR_DARK_BLUE);


        firstSlide.setBackgroundColor(ColorEx.BLUE);

        addSlide(firstSlide);
        addSlide(secondSlide);
        addSlide(thirdSlide);

        setColorTransitionsEnabled(true);
    }
}