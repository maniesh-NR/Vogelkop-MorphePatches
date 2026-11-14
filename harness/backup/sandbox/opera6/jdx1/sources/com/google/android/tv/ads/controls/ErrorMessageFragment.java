package com.google.android.tv.ads.controls;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import defpackage.brp;
import defpackage.gqp;
import defpackage.kop;

/* loaded from: classes.dex */
public final class ErrorMessageFragment extends Fragment {
    public ConstraintLayout a;
    public ConstraintLayout b;

    public ErrorMessageFragment() {
        super(2131558881);
    }

    @Keep
    public float getBackgroundAlpha() {
        return this.a.getAlpha();
    }

    @Keep
    public float getDrawerTranslationX() {
        return this.b.getTranslationX() / this.b.getWidth();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        viewGroup.getClass();
        View viewInflate = layoutInflater.inflate(2131558881, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate.findViewById(2131362735);
        constraintLayout.getClass();
        this.a = constraintLayout;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate.findViewById(2131362738);
        constraintLayout2.getClass();
        this.b = constraintLayout2;
        this.a.setAlpha(0.0f);
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(requireContext(), 2130837504);
        animatorSet.setTarget(this);
        animatorSet.start();
        AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(requireContext(), 2130837505);
        animatorSet2.setTarget(this);
        animatorSet2.addListener(new gqp(this, (byte) 0));
        Button button = (Button) viewInflate.findViewById(2131362734);
        button.getClass();
        button.setOnClickListener(new kop(animatorSet2, (byte) 0));
        requireActivity().getOnBackPressedDispatcher().a(this, new brp(animatorSet2, (byte) 0));
        return viewInflate;
    }

    @Keep
    public void setBackgroundAlpha(float f) {
        this.a.setAlpha(f);
        this.a.invalidate();
    }

    @Keep
    public void setDrawerTranslationX(float f) {
        this.b.setTranslationX(r0.getWidth() * f);
        this.b.invalidate();
    }
}
