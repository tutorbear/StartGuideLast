package com.example.yes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import androidx.fragment.app.Fragment;

import com.example.yes.libs.ColorEx;
import com.example.yes.slides.CreateMyAccountSlide;
import com.example.yes.slides.LoginSlide;
import com.example.yes.slides.TeacherOrStudentSlide;
import com.example.yes.slides.WelcomeSlide;
import com.github.appintro.AppIntro;
import com.github.appintro.SlideSelectionListener;

public class MainActivity extends AppIntro {
    //STATIC FLAGS
    public static Boolean IS_TEACHER = Boolean.valueOf(Boolean.FALSE);
    public static Boolean IS_STUDENT = Boolean.valueOf(Boolean.FALSE);
    //---------

    WelcomeSlide welcomeSlide;
    LoginSlide loginSlide;
    TeacherOrStudentSlide teacherOrStudentSlide;
    CreateMyAccountSlide createMyAccountSlide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        welcomeSlide = WelcomeSlide.newInstance(ColorEx.WHITE);
        loginSlide = LoginSlide.newInstance(ColorEx.WHITE);
        teacherOrStudentSlide = TeacherOrStudentSlide.newInstance(ColorEx.TUTOR_BEAR_DARK_BLUE);
        createMyAccountSlide = CreateMyAccountSlide.newInstance(ColorEx.TUTOR_BEAR_DARK_BLUE);


        addSlide(welcomeSlide);
        addSlide(loginSlide);
        addSlide(teacherOrStudentSlide);
        addSlide(createMyAccountSlide);

        setColorTransitionsEnabled(true);

        setWizardMode(true);

        setSkipButtonEnabled(false);

        setDoneText("");

        changeIndicatorColor("Dark Blue");


    }

    @Override
    protected void onSlideChanged(Fragment oldFragment, Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        if (newFragment == loginSlide) {
            changeIndicatorColor("Dark Blue");
        }

        if (newFragment == teacherOrStudentSlide) {
            setNextPageSwipeLock(true);
            changeIndicatorColor("White");
        }

    }

    public void getStarted(View view) {
        goToNextSlide(false);
    }

    public void iAmStudent(View view) {

        goToNextSlide(false);
        IS_STUDENT = Boolean.TRUE;
        IS_TEACHER = Boolean.FALSE;

    }

    public void iAmTeacher(View view) {

        goToNextSlide(false);
        IS_STUDENT = Boolean.FALSE;
        IS_TEACHER = Boolean.TRUE;
    }

    public void createMyAccount(View view) {
        if (IS_TEACHER) {
            startActivity(new Intent(this , TeacherActivity.class));
            finish();
        } else if (IS_STUDENT) {
            startActivity(new Intent(this, StudentActivity.class));
            finish();
        }
    }



    public void login(View view) {
        Toast.makeText(this, "Logging in!", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }

    public void signUp(View view) {
        goToNextSlide(false);

    }

    private void changeIndicatorColor(String colorLabel) {
        if (colorLabel.equals("Dark Blue")) {
            setIndicatorColor(ColorEx.TUTOR_BEAR_DARK_BLUE, ColorEx.TUTOR_BEAR_DARK_BLUE);
            setNextArrowColor(ColorEx.TUTOR_BEAR_DARK_BLUE);
        } else {
            setIndicatorColor(ColorEx.WHITE, ColorEx.WHITE);
            setNextArrowColor(ColorEx.WHITE);
        }

    }


}