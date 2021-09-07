package com.bacain.app;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.github.appintro.AppIntro2;
import com.github.appintro.AppIntroFragment;
import com.github.appintro.AppIntroPageTransformerType;
import com.pspdfkit.app.R;

public class AppIntro extends AppIntro2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addSlide(AppIntroFragment.newInstance(
                "Welcome!",
                "Selamat datang di “baca.in”. aplikasi ini dapat membantumu untuk mendengarkan audiobook dari file PDF.",
                R.drawable.ic_back_slide1,
                R.drawable.ic_frame,
                R.font.lato,
                R.font.lato
        ));
        addSlide(AppIntroFragment.newInstance(
                "Set Your Fav PDF!",
                "Pilih file PDF favoritmu “baca.in” akan mengkonversi text pdf menjadi suara yang bisa didengarkan kapanpun dan dimanapun",
                R.drawable.ic_back_slide2,
                R.drawable.ic_frame,
                R.font.lato,
                R.font.lato
        ));

        addSlide(AppIntroFragment.newInstance(
                "Yuk gali ilmu dengan audio",
                "Kini dengan “baca.in” kamu bisa menggali ilmu dan menambah wawasan, tanpa harus membaca hingga beratus-ratus halaman",
                R.drawable.ic_back_slide3,
                R.drawable.ic_frame,
                R.font.lato,
                R.font.lato
        ));
//
//        addSlide(AppIntroFragment.newInstance(
//                "Explore",
//                "Feel free to explore the rest of the library demo!",
//                imageDrawable = R.drawable.ic_slide4,
//                backgroundDrawable = R.drawable.back_slide4
//        ));
//
//        addSlide(AppIntroFragment.newInstance(
//                ":)",
//                "...gradients are awesome!",
//                imageDrawable = R.mipmap.ic_launcher,
//                backgroundDrawable = R.drawable.back_slide5
//        ));
        setTransformer(new AppIntroPageTransformerType.Parallax());
    }

    @Override
    protected void onSkipPressed(@Nullable Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        startActivity(new Intent(AppIntro.this, MainActivity.class));
        finish();
    }

    @Override
    protected void onDonePressed(@Nullable Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        startActivity(new Intent(AppIntro.this, MainActivity.class));
        finish();
    }
}