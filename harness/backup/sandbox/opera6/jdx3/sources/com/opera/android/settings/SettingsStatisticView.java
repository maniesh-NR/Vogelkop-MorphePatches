package com.opera.android.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.custom_views.StylingTextView;
import defpackage.fan;
import defpackage.khh;
import defpackage.n1;
import defpackage.q5g;
import defpackage.w9j;
import defpackage.x9j;

/* loaded from: classes.dex */
public class SettingsStatisticView extends LinearLayout {
    public final Drawable a;
    public final Drawable b;
    public final String c;
    public final x9j d;
    public final w9j e;
    public final q5g f;

    public SettingsStatisticView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        LayoutInflater.from(context).inflate(2131559314, this);
        int i = 2131362248;
        TextView textView = (TextView) w1h.j(2131362248, this);
        if (textView != null) {
            i = 2131363171;
            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363171, this);
            if (stylingTextView != null) {
                q5g q5gVar = new q5g(this, textView, stylingTextView, (byte) 5);
                this.f = q5gVar;
                int iA = fan.a(16.0f, getResources());
                int iA2 = fan.a(12.0f, getResources());
                setPadding(iA, iA2, iA, iA2);
                setOrientation(1);
                setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                byte b = 16;
                setGravity(16);
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.F, 0, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(2, 0);
                this.a = resourceId == 0 ? null : sgb.F(resourceId, context);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                this.b = resourceId2 != 0 ? sgb.F(resourceId2, context) : null;
                this.c = typedArrayObtainStyledAttributes.getString(0);
                int color = typedArrayObtainStyledAttributes.getColor(3, 0);
                typedArrayObtainStyledAttributes.recycle();
                x9j x9jVar = new x9j(q5gVar, b);
                x9jVar.c = color;
                this.d = x9jVar;
                this.e = new w9j(q5gVar, b);
                return;
            }
        }
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View, android.widget.TextView, com.opera.android.custom_views.StylingTextView] */
    public final void a(Context context) {
        n1 n1Var = isActivated() ? this.d : this.e;
        n1Var.getClass();
        Drawable drawableX = f03.x(2130970706, context);
        Drawable drawableMutate = drawableX.getConstantState().newDrawable().mutate();
        j14.n0(drawableMutate, n1Var.N(context));
        q5g q5gVar = (q5g) n1Var.b;
        SettingsStatisticView settingsStatisticView = (SettingsStatisticView) q5gVar.b;
        ?? r4 = (StylingTextView) q5gVar.d;
        settingsStatisticView.setBackground(new RippleDrawable(f03.u(2130970279, context, 2131103629), drawableMutate, drawableX));
        r4.setTextColor(n1Var.E0(context));
        Drawable drawable = (Drawable) r4.i.c;
        if (drawable != null) {
            drawable.mutate();
            drawable.setTint(n1Var.s0(r4.getContext()));
        }
        ((TextView) q5gVar.c).setTextColor(n1Var.E0(context));
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        q5g q5gVar = this.f;
        ((TextView) q5gVar.c).setText(this.c);
        ((StylingTextView) q5gVar.d).s(isActivated() ? this.a : this.b, null);
        a(getContext());
    }

    @Override // android.view.View
    public final void setActivated(boolean z) {
        boolean zIsActivated = isActivated();
        super.setActivated(z);
        if (z != zIsActivated) {
            ((StylingTextView) this.f.d).s(z ? this.a : this.b, null);
            a(getContext());
        }
    }
}
