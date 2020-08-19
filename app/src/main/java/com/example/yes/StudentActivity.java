package com.example.yes;

import android.os.Bundle;

import com.example.yes.slides.studentGuideSliders.StudentSliderFour;
import com.example.yes.slides.studentGuideSliders.StudentSliderOne;
import com.example.yes.slides.studentGuideSliders.StudentSliderThree;
import com.example.yes.slides.studentGuideSliders.StudentSliderTwo;
import com.github.appintro.AppIntro;
import com.github.appintro.AppIntroPageTransformerType;

public class StudentActivity extends AppIntro {

    StudentSliderOne studentSliderOne;
    StudentSliderTwo studentSliderTwo;
    StudentSliderThree studentSliderThree;
    StudentSliderFour studentSliderFour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        studentSliderOne = new StudentSliderOne();
        studentSliderTwo = new StudentSliderTwo();
        studentSliderThree = new StudentSliderThree();
        studentSliderFour = new StudentSliderFour();

        addSlide(studentSliderOne);
        addSlide(studentSliderTwo);
        addSlide(studentSliderThree);
        addSlide(studentSliderFour);

        setTransformer(AppIntroPageTransformerType.Flow.INSTANCE);

    }
}