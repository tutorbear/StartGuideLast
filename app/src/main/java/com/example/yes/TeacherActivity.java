package com.example.yes;

import android.os.Bundle;

import com.example.yes.slides.teacherGuideSliders.TeacherSliderFour;
import com.example.yes.slides.teacherGuideSliders.TeacherSliderOne;
import com.example.yes.slides.teacherGuideSliders.TeacherSliderThree;
import com.example.yes.slides.teacherGuideSliders.TeacherSliderTwo;
import com.github.appintro.AppIntro;
import com.github.appintro.AppIntroPageTransformerType;

public class TeacherActivity extends AppIntro {

    TeacherSliderOne teacherSliderOne;
    TeacherSliderTwo teacherSliderTwo;
    TeacherSliderThree teacherSliderThree;
    TeacherSliderFour teacherSliderFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        teacherSliderOne = new TeacherSliderOne();
        teacherSliderTwo = new TeacherSliderTwo();
        teacherSliderThree = new TeacherSliderThree();
        teacherSliderFour = new TeacherSliderFour();

        addSlide(teacherSliderOne);
        addSlide(teacherSliderTwo);
        addSlide(teacherSliderThree);
        addSlide(teacherSliderFour);

        setTransformer(AppIntroPageTransformerType.Flow.INSTANCE);

    }
}