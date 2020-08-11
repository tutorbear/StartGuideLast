package com.example.yes.slides;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.example.yes.R;
import com.github.appintro.SlideBackgroundColorHolder;

public class TeacherOrStudentSlide extends Fragment implements SlideBackgroundColorHolder {

    private static final String ARG_COLOR_INT = "COLOR_INT";
    private int originalColor = 0;
    private ConstraintLayout background = null;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        originalColor = getArguments().getInt(ARG_COLOR_INT);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.teacher_or_student_slide_layout, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @androidx.annotation.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        background = view.findViewById(R.id.teacher_or_student_slide_constraint_layout);
    }

    public static TeacherOrStudentSlide newInstance(@ColorInt int originalColor) {
        TeacherOrStudentSlide newFragment = new TeacherOrStudentSlide();
        Bundle args = new Bundle();
        args.putInt(ARG_COLOR_INT, originalColor);
        newFragment.setArguments(args);
        return newFragment;
    }

    @Override
    public int getDefaultBackgroundColor() {
        return originalColor;
    }

    @Override
    public void setBackgroundColor(int backgroundColor) {
        background.setBackgroundColor(backgroundColor);
    }


}