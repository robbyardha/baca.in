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
                "This is a demo of the AppIntro library, using the second layout.",
                R.drawable.back_slide1,
                R.font.lato,
                R.font.lato
        ));
//        addSlide(AppIntroFragment.newInstance(SliderPage(
//                "Gradients!",
//                "This text is written on a gradient background",
//                backgroundDrawable = R.drawable.back_slide2,
//                titleTypeface = "OpenSans-Light.ttf",
//                descriptionTypeface = "OpenSans-Light.ttf"
//        )));
//
//        addSlide(AppIntroFragment.newInstance(
//                "Simple, yet Customizable",
//                "The library offers a lot of customization, while keeping it simple for those that like simple.",
//                imageDrawable = R.drawable.ic_slide3,
//                backgroundDrawable = R.drawable.back_slide3,
//                titleTypefaceFontRes = R.font.opensans_regular,
//                descriptionTypefaceFontRes = R.font.opensans_regular
//        ));
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