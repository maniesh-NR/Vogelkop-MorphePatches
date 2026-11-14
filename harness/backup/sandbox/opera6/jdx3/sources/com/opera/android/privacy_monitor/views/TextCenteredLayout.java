package com.opera.android.privacy_monitor.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.privacy_monitor.views.TextCenteredLayout;
import defpackage.dll;
import defpackage.khh;
import defpackage.q5g;
import defpackage.q9n;
import defpackage.r8n;
import defpackage.svk;
import defpackage.u8n;

/* loaded from: classes.dex */
public class TextCenteredLayout extends LinearLayout {
    public static final /* synthetic */ int b = 0;
    public final q5g a;

    public TextCenteredLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        LayoutInflater.from(context).inflate(2131559432, this);
        int i = 2131362594;
        ImageView imageView = (ImageView) w1h.j(2131362594, this);
        if (imageView != null) {
            i = 2131363485;
            TextView textView = (TextView) w1h.j(2131363485, this);
            if (textView != null) {
                this.a = new q5g(this, imageView, textView, (byte) 11);
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.R, 0, 0);
                boolean z = typedArrayObtainStyledAttributes.getBoolean(2, false);
                boolean z2 = typedArrayObtainStyledAttributes.getBoolean(1, false);
                String string = typedArrayObtainStyledAttributes.getString(0);
                typedArrayObtainStyledAttributes.recycle();
                if (!z) {
                    final Drawable drawableF = sgb.F(2131232190, getContext());
                    final int i2 = 2130969119;
                    final int i3 = 2131102430;
                    r8n r8nVar = new r8n() { // from class: efl
                        @Override // defpackage.r8n
                        public final void a(View view) {
                            int i4 = TextCenteredLayout.b;
                            TextCenteredLayout textCenteredLayout = this.a;
                            ImageView imageView2 = (ImageView) textCenteredLayout.a.c;
                            int iT = f03.t(i2, textCenteredLayout.getContext(), i3);
                            Drawable drawable = drawableF;
                            j14.n0(drawable, iT);
                            imageView2.setImageDrawable(drawable);
                        }
                    };
                    dll dllVarS = q9n.s(this);
                    if (dllVarS != null) {
                        u8n.b(dllVarS, this, r8nVar);
                    }
                    r8nVar.a(this);
                } else if (z2) {
                    svk svkVar = new svk(this, (byte) 5);
                    dll dllVarS2 = q9n.s(this);
                    if (dllVarS2 != null) {
                        u8n.b(dllVarS2, this, svkVar);
                    }
                    svkVar.a(this);
                } else {
                    final Drawable drawableF2 = sgb.F(2131232192, getContext());
                    final int i4 = 2130969323;
                    final int i5 = 2131102475;
                    r8n r8nVar2 = new r8n() { // from class: efl
                        @Override // defpackage.r8n
                        public final void a(View view) {
                            int i42 = TextCenteredLayout.b;
                            TextCenteredLayout textCenteredLayout = this.a;
                            ImageView imageView2 = (ImageView) textCenteredLayout.a.c;
                            int iT = f03.t(i4, textCenteredLayout.getContext(), i5);
                            Drawable drawable = drawableF2;
                            j14.n0(drawable, iT);
                            imageView2.setImageDrawable(drawable);
                        }
                    };
                    dll dllVarS3 = q9n.s(this);
                    if (dllVarS3 != null) {
                        u8n.b(dllVarS3, this, r8nVar2);
                    }
                    r8nVar2.a(this);
                }
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                if (z2) {
                    a(phj.y(string));
                    return;
                } else {
                    a(string);
                    return;
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void a(CharSequence charSequence) {
        phj.u0((TextView) this.a.d, charSequence);
    }
}
