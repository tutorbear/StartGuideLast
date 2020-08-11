package com.example.yes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Slide;

import com.example.yes.slides.teachersliders.TeacherSliderFour;
import com.example.yes.slides.teachersliders.TeacherSliderOne;
import com.example.yes.slides.teachersliders.TeacherSliderThree;
import com.example.yes.slides.teachersliders.TeacherSliderTwo;
import com.github.appintro.AppIntro;
import com.github.appintro.AppIntroPageTransformerType;
import com.github.appintro.model.SliderPage;

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