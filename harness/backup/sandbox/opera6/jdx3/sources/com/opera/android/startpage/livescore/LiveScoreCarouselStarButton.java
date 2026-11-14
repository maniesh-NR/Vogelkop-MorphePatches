package com.opera.android.startpage.livescore;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.al2;
import defpackage.dll;
import defpackage.e73;
import defpackage.kf;
import defpackage.nlc;
import defpackage.q9n;
import defpackage.u8n;
import defpackage.vg4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/opera/android/startpage/livescore/LiveScoreCarouselStarButton;", "Landroid/widget/FrameLayout;", "nlc", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LiveScoreCarouselStarButton extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final zyk a;
    public final zyk b;
    public final zyk c;
    public final kf d;
    public nlc e;

    public LiveScoreCarouselStarButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.a = z4c.b(new vg4(context, (byte) 9));
        this.b = z4c.b(new vg4(context, (byte) 10));
        this.c = z4c.b(new vg4(context, (byte) 11));
        LayoutInflater.from(context).inflate(2131558974, this);
        ImageView imageView = (ImageView) w1h.j(2131362850, this);
        if (imageView == null) {
            t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(2131362850)));
            throw null;
        }
        kf kfVar = new kf((byte) 17, (View) this, (Object) imageView);
        e73 e73Var = new e73(kfVar, context, (byte) 8);
        dll dllVarS = q9n.s(imageView);
        if (dllVarS != null) {
            u8n.b(dllVarS, imageView, e73Var);
        }
        this.d = kfVar;
        nlc nlcVar = nlc.b;
        a(nlcVar, true);
        this.e = nlcVar;
    }

    public final void a(nlc nlcVar, boolean z) {
        Drawable drawableC;
        int i;
        if (this.e != nlcVar || z) {
            this.e = nlcVar;
            int iOrdinal = nlcVar.ordinal();
            if (iOrdinal == 0) {
                setActivated(true);
            } else if (iOrdinal == 1) {
                setActivated(false);
            } else if (iOrdinal != 2) {
                h9o.p();
                return;
            }
            ImageView imageView = (ImageView) this.d.c;
            int iOrdinal2 = nlcVar.ordinal();
            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                drawableC = (Drawable) this.a.getValue();
            } else {
                if (iOrdinal2 != 2) {
                    h9o.p();
                    return;
                }
                x05 x05Var = new x05(getContext());
                x05Var.d(1);
                float fFloatValue = ((Number) this.b.getValue()).floatValue();
                u05 u05Var = x05Var.a;
                u05Var.q = fFloatValue;
                x05Var.invalidateSelf();
                float fFloatValue2 = ((Number) this.c.getValue()).floatValue();
                u05Var.h = fFloatValue2;
                u05Var.b.setStrokeWidth(fFloatValue2);
                x05Var.invalidateSelf();
                x05Var.b(new int[]{f03.t(2130969303, getContext(), 2131101243)});
                drawableC = al2.c(x05Var);
            }
            imageView.setImageDrawable(drawableC);
            int iOrdinal3 = nlcVar.ordinal();
            if (iOrdinal3 == 0) {
                i = 2132019512;
            } else if (iOrdinal3 == 1) {
                i = 2132019542;
            } else {
                if (iOrdinal3 != 2) {
                    h9o.p();
                    return;
                }
                i = 0;
            }
            n1h.n(this, i, 0);
        }
    }
}
