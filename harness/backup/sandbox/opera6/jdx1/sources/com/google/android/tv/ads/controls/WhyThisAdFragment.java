package com.google.android.tv.ads.controls;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import com.bumptech.glide.a;
import com.google.android.gms.internal.atv_ads_framework.zzar;
import defpackage.b69;
import defpackage.bh7;
import defpackage.brp;
import defpackage.dsp;
import defpackage.gqp;
import defpackage.jh;
import defpackage.kop;
import defpackage.kwh;
import defpackage.mwh;
import defpackage.nsk;
import defpackage.qyn;
import defpackage.r16;
import defpackage.u83;
import defpackage.uvh;

/* loaded from: classes.dex */
public final class WhyThisAdFragment extends Fragment {
    public ImageView a;
    public ConstraintLayout b;
    public ConstraintLayout c;

    public WhyThisAdFragment() {
        super(2131558907);
    }

    @Keep
    public float getBackgroundAlpha() {
        return this.b.getAlpha();
    }

    @Keep
    public float getDrawerTranslationX() {
        return this.c.getTranslationX() / this.c.getWidth();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kwh kwhVar;
        viewGroup.getClass();
        View viewInflate = layoutInflater.inflate(2131558907, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate.findViewById(2131365094);
        constraintLayout.getClass();
        this.b = constraintLayout;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate.findViewById(2131365095);
        constraintLayout2.getClass();
        this.c = constraintLayout2;
        this.b.setAlpha(0.0f);
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(requireContext(), 2130837504);
        animatorSet.setTarget(this);
        animatorSet.start();
        AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(requireContext(), 2130837505);
        animatorSet2.setTarget(this);
        animatorSet2.addListener(new gqp(this, (byte) 1));
        Button button = (Button) viewInflate.findViewById(2131365093);
        button.getClass();
        button.setOnClickListener(new kop(animatorSet2, (byte) 1));
        requireActivity().getOnBackPressedDispatcher().a(this, new brp(animatorSet2, (byte) 1));
        ImageView imageView = (ImageView) viewInflate.findViewById(2131365109);
        imageView.getClass();
        this.a = imageView;
        String string = requireArguments().getString("wta_uri");
        string.getClass();
        String string2 = requireArguments().getString("wta_alt_text");
        if (!TextUtils.isEmpty(string2)) {
            this.a.setContentDescription(string2);
        }
        Context context = getContext();
        qyn.l(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        mwh mwhVar = a.b(context).f;
        qyn.l(getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            w childFragmentManager = getChildFragmentManager();
            Context context2 = getContext();
            nsk nskVarD = mwhVar.d(childFragmentManager, this, isVisible());
            kwh kwhVar2 = nskVarD.e;
            if (kwhVar2 == null) {
                a aVarB = a.b(context2);
                r16 r16Var = mwhVar.e;
                jh jhVar = nskVarD.a;
                yhe yheVar = nskVarD.b;
                r16Var.getClass();
                kwhVar = new kwh(aVarB, jhVar, yheVar, context2);
                nskVarD.e = kwhVar;
            } else {
                kwhVar = kwhVar2;
            }
        } else {
            kwhVar = mwhVar.b(getContext().getApplicationContext());
        }
        String strZza = zzar.zza(string, "zTvAdsFrameworkz");
        kwhVar.getClass();
        uvh uvhVar = new uvh(kwhVar.a, kwhVar, Drawable.class, kwhVar.b);
        uvhVar.u = strZza;
        uvhVar.v = true;
        bh7 bh7Var = bh7.b;
        u83 u83VarO = uvhVar.o(new b69());
        u83VarO.n = true;
        ((uvh) u83VarO).t(new dsp(this, this.a));
        return viewInflate;
    }

    @Keep
    public void setBackgroundAlpha(float f) {
        this.b.setAlpha(f);
        this.b.invalidate();
    }

    @Keep
    public void setDrawerTranslationX(float f) {
        this.c.setTranslationX(r0.getWidth() * f);
        this.c.invalidate();
    }
}
