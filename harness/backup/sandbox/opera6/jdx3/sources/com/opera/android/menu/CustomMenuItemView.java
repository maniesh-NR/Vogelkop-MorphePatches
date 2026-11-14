package com.opera.android.menu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import defpackage.dll;
import defpackage.hjf;
import defpackage.pc5;
import defpackage.q9n;
import defpackage.rtd;
import defpackage.u8n;
import defpackage.w53;

/* loaded from: classes.dex */
public class CustomMenuItemView extends LinearLayout implements rtd {
    public static final /* synthetic */ int f = 0;
    public StylingImageView a;
    public StylingTextView b;
    public StylingTextView c;
    public boolean d;
    public boolean e;

    public CustomMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = true;
    }

    @Override // defpackage.rtd
    public final void a() {
        this.d = true;
    }

    public final void b(Drawable drawable) {
        if (drawable == null) {
            this.b.s(null, null);
            return;
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(f03.q(getContext()));
        drawable.mutate();
        drawable.setTintList(colorStateListValueOf);
        drawable.setBounds(new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
        this.b.s(null, drawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    @Override // defpackage.rtd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(ptd r9) {
        /*
            r8 = this;
            java.lang.CharSequence r0 = r9.e
            com.opera.android.custom_views.StylingTextView r1 = r8.b
            r1.setText(r0)
            android.graphics.drawable.Drawable r0 = r9.getIcon()
            com.opera.android.custom_views.StylingImageView r1 = r8.a
            r2 = 8
            r3 = 0
            if (r0 == 0) goto L18
            boolean r4 = r8.d
            if (r4 == 0) goto L18
            r4 = r3
            goto L19
        L18:
            r4 = r2
        L19:
            r1.setVisibility(r4)
            r1 = 0
            if (r0 != 0) goto L25
            com.opera.android.custom_views.StylingImageView r0 = r8.a
            r0.setImageDrawable(r1)
            goto L3d
        L25:
            android.graphics.Rect r4 = new android.graphics.Rect
            int r5 = r0.getIntrinsicWidth()
            int r6 = r0.getIntrinsicHeight()
            r4.<init>(r3, r3, r5, r6)
            r0.setBounds(r4)
            com.opera.android.custom_views.StylingImageView r4 = r8.a
            r4.setImageDrawable(r0)
            r8.d()
        L3d:
            boolean r0 = r9.isChecked()
            if (r0 == 0) goto L52
            android.content.Context r0 = r8.getContext()
            r4 = 2131232018(0x7f080512, float:1.8080133E38)
            android.graphics.drawable.Drawable r0 = sgb.F(r4, r0)
            r8.b(r0)
            goto L55
        L52:
            r8.b(r1)
        L55:
            com.opera.android.custom_views.StylingTextView r0 = r8.c
            if (r0 == 0) goto La9
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.keyboard
            r4 = 2
            if (r0 != r4) goto L99
            jwf r0 = r9.D
            if (r0 == 0) goto L8e
            int r9 = r9.a
            qwf[] r0 = defpackage.qwf.values()
            int r4 = r0.length
            r5 = r3
        L76:
            if (r5 >= r4) goto L8e
            r6 = r0[r5]
            int r7 = r6.a
            if (r7 != r9) goto L8b
            boolean r7 = defpackage.qwf.k(r6)
            if (r7 == 0) goto L8b
            z16 r9 = defpackage.kwf.r(r6)
            int r9 = r9.e
            goto L8f
        L8b:
            int r5 = r5 + 1
            goto L76
        L8e:
            r9 = r3
        L8f:
            if (r9 == 0) goto L99
            c37 r0 = defpackage.c37.r()
            java.lang.String r1 = r0.v(r9)
        L99:
            com.opera.android.custom_views.StylingTextView r9 = r8.c
            if (r1 != 0) goto La1
            r9.setVisibility(r2)
            return
        La1:
            r9.setText(r1)
            com.opera.android.custom_views.StylingTextView r8 = r8.c
            r8.setVisibility(r3)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.menu.CustomMenuItemView.c(ptd):void");
    }

    public final void d() {
        this.a.c(this.e ? f03.v(getContext()) : null);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (StylingImageView) findViewById(2131362475);
        this.b = (StylingTextView) findViewById(2131362478);
        this.c = (StylingTextView) findViewById(2131362476);
        pc5 pc5Var = new pc5(this, (byte) 1);
        l5b l5bVar = q9n.c;
        dll dllVarV = hjf.v(getContext());
        if (dllVarV != null) {
            u8n.b(dllVarV, this, pc5Var);
        }
        setOnHoverListener(new w53(this, (byte) 1));
    }
}
