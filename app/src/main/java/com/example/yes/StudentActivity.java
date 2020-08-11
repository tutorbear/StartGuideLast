package com.example.yes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.yes.slides.studentsliders.StudentSliderFour;
import com.example.yes.slides.studentsliders.StudentSliderOne;
import com.example.yes.slides.studentsliders.StudentSliderThree;
import com.example.yes.slides.studentsliders.StudentSliderTwo;
import com.example.yes.slides.teachersliders.TeacherSliderFour;
import com.example.yes.slides.teachersliders.TeacherSliderOne;
import com.example.yes.slides.teachersliders.TeacherSliderThree;
import com.example.yes.slides.teachersliders.TeacherSliderTwo;
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