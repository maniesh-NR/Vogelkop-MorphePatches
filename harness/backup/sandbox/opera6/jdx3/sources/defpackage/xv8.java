package defpackage;

import android.content.Context;
import android.icu.util.ULocale;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.i;
import com.opera.android.ads.AdStarRatingView;
import com.opera.android.custom_views.CardView;
import com.opera.android.widget.AspectRatioFrameLayout;
import com.opera.android.widget.ClickAwareCardView;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class xv8 extends bu8 {
    public final ClickAwareCardView A;
    public final wv8 B;
    public int C;
    public final ViewGroup i;
    public final FrameLayout j;
    public final ga6 k;
    public final TextView l;
    public final TextView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final View q;
    public final ImageView r;
    public final ga6 s;
    public final TextView t;
    public final AdStarRatingView u;
    public final View v;
    public final ImageView w;
    public final TextView x;
    public View y;
    public boolean z;

    public xv8(View view, wv8 wv8Var, ize izeVar) {
        super(view);
        this.C = 2;
        WeakHashMap weakHashMap = r5n.a;
        FrameLayout frameLayout = (FrameLayout) ((View) m5n.f(view, 2131362870));
        this.j = frameLayout;
        this.k = gu8.i0(frameLayout, view);
        this.l = (TextView) ((View) m5n.f(view, 2131362860));
        this.i = (ViewGroup) ((View) m5n.f(view, 2131362868));
        this.m = (TextView) ((View) m5n.f(view, 2131362877));
        this.n = (TextView) ((View) m5n.f(view, 2131362881));
        this.o = (TextView) ((View) m5n.f(view, 2131362880));
        this.p = (TextView) ((View) m5n.f(view, 2131362882));
        this.q = (View) m5n.f(view, 2131362874);
        ImageView imageView = (ImageView) ((View) m5n.f(view, 2131362875));
        this.r = imageView;
        this.s = ga6.m(imageView, view);
        this.t = (TextView) ((View) m5n.f(view, 2131362873));
        this.u = (AdStarRatingView) ((View) m5n.f(view, 2131362878));
        this.v = (View) m5n.f(view, 2131362862);
        this.w = (ImageView) ((View) m5n.f(view, 2131362865));
        this.x = (TextView) ((View) m5n.f(view, 2131362861));
        this.B = wv8Var;
        ClickAwareCardView clickAwareCardView = (ClickAwareCardView) ((View) m5n.f(view, 2131362863));
        this.A = clickAwareCardView;
        xf8.j0(izeVar, clickAwareCardView, new ks6(this, (byte) 11));
        pc5 pc5Var = new pc5((Object) this, (byte) 19);
        q9n.e(clickAwareCardView, pc5Var);
        pc5Var.a(clickAwareCardView);
    }

    @Override // defpackage.o43, defpackage.ab2
    public void V(ja2 ja2Var, boolean z) {
        super.V(ja2Var, z);
        if (z) {
            return;
        }
        Locale localeB = cqp.c0(((i) this).itemView.getResources().getConfiguration()).b(0);
        this.C = ULocale.forLocale(localeB).isRightToLeft() != TextUtils.getLayoutDirectionFromLocale(localeB) ? l2c.a(((i) this).itemView.getContext()) : 2;
        yz yzVarF0 = f0();
        yz yzVarF02 = f0();
        wv8 wv8Var = this.B;
        String strJ = wv8Var.j(yzVarF02);
        boolean zIsEmpty = TextUtils.isEmpty(strJ);
        TextView textView = this.m;
        if (zIsEmpty) {
            textView.setText(2132017307);
        } else {
            textView.setText(strJ);
        }
        j0(this.l, "");
        CharSequence charSequenceG = wv8Var.g(yzVarF0);
        TextView textView2 = this.n;
        j0(textView2, charSequenceG);
        CharSequence charSequenceF = wv8Var.f(yzVarF0);
        TextView textView3 = this.o;
        j0(textView3, charSequenceF);
        CharSequence charSequenceH = wv8Var.h(yzVarF0);
        TextView textView4 = this.p;
        j0(textView4, charSequenceH);
        i0();
        yz yzVarF03 = f0();
        this.v.setVisibility(yzVarF03.i() == null && yzVarF03.k().isEmpty() ? 8 : 0);
        CharSequence charSequenceE = wv8Var.e(yzVarF0);
        TextView textView5 = this.x;
        j0(textView5, charSequenceE);
        if (((i) this).itemView.getLayoutParams().height >= 0) {
            boolean z2 = textView4.getVisibility() == 0;
            View view = this.q;
            if (z2) {
                view.setVisibility(8);
            }
            boolean z3 = textView3.getVisibility() == 0;
            boolean z4 = view.getVisibility() == 0;
            boolean z5 = textView5.getVisibility() == 0;
            if (!z3) {
                textView2.setMaxLines(2);
            } else if ((z4 || z2) && z5) {
                textView2.setMaxLines(1);
                textView3.setMaxLines(1);
            } else if (z4 || z2 || z5) {
                textView2.setMaxLines(1);
                textView3.setMaxLines(2);
            } else {
                textView2.setMaxLines(2);
                textView3.setMaxLines(2);
            }
        }
        ((CardView) ((i) this).itemView).a.d(this.C);
    }

    @Override // defpackage.bu8
    public boolean g0(View view) {
        return view == null || this.w == view;
    }

    public final void h0(View view) {
        this.y = view;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        View view2 = this.y;
        FrameLayout frameLayout = this.j;
        frameLayout.addView(view2);
        if (frameLayout instanceof AspectRatioFrameLayout) {
            AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) frameLayout;
            boolean z = layoutParams == null || (layoutParams.width == -1 && layoutParams.height == -1);
            rn9 rn9Var = aspectRatioFrameLayout.c;
            if (rn9Var.b == z) {
                return;
            }
            rn9Var.b = z;
            aspectRatioFrameLayout.requestLayout();
        }
    }

    public final void i0() {
        yz yzVarF0 = f0();
        wv8 wv8Var = this.B;
        String strC = wv8Var.c(yzVarF0);
        double dB = wv8Var.b(yzVarF0);
        if (dB <= 0.0d || dB > 5.0d) {
            dB = 0.0d;
        }
        boolean zIsEmpty = TextUtils.isEmpty(strC);
        boolean z = !zIsEmpty;
        boolean zD = wv8Var.d(yzVarF0);
        boolean z2 = dB > 0.0d;
        Boolean[] boolArr = {Boolean.valueOf(z), Boolean.valueOf(zD), Boolean.valueOf(z2)};
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            if (boolArr[i2].booleanValue()) {
                i++;
            }
        }
        boolean z3 = i < 2;
        this.q.setVisibility(z3 ? 8 : 0);
        TextView textView = this.x;
        if ("resized_in_code".equals(textView.getTag())) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = !z3 ? -2 : -1;
            textView.setLayoutParams(layoutParams);
        }
        if (z3) {
            return;
        }
        j0(this.t, strC);
        int i3 = zD ? 0 : 8;
        ImageView imageView = this.r;
        imageView.setVisibility(i3);
        if (zD) {
            String strA = wv8Var.a(yzVarF0);
            if (!TextUtils.isEmpty(strA)) {
                gu8.h0(strA, imageView, this.s, false, new nv6(imageView));
            }
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            int iA = fan.a((zIsEmpty || !z2) ? 16.0f : 24.0f, imageView.getResources());
            layoutParams2.width = iA;
            layoutParams2.height = iA;
            imageView.setLayoutParams(layoutParams2);
        }
        int i4 = z2 ? 0 : 8;
        AdStarRatingView adStarRatingView = this.u;
        adStarRatingView.setVisibility(i4);
        if (dB < 0.0d || dB > 5.0d) {
            return;
        }
        adStarRatingView.f = dB;
        adStarRatingView.invalidate();
    }

    public final void j0(TextView textView, CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        textView.setVisibility(!zIsEmpty ? 0 : 8);
        if (zIsEmpty) {
            return;
        }
        textView.setText(charSequence);
        if (this.C != 1) {
            int iJ = cs5.J(charSequence);
            if (iJ == 0 || iJ == 1) {
                this.C = iJ;
            }
        }
    }

    @Override // defpackage.bu8, android.view.View.OnClickListener
    public void onClick(View view) {
        mq mqVarE0 = e0();
        if (mqVarE0 == null) {
            return;
        }
        if (view != this.v) {
            super.onClick(view);
            return;
        }
        yz yzVarF0 = f0();
        vz vzVarI = yzVarF0.i();
        ijm ijmVar = ijm.b;
        if (vzVarI == null) {
            Context context = view.getContext();
            List listK = yzVarF0.k();
            nej nejVarF = a4h.f(context);
            cp cpVar = new cp(mqVarE0, 2132017288, listK);
            nejVarF.getClass();
            nejVarF.b(cpVar, ijmVar);
            return;
        }
        Context context2 = view.getContext();
        String str = vzVarI.a;
        String str2 = vzVarI.b;
        String strA = this.B.a(yzVarF0);
        List listK2 = yzVarF0.k();
        nej nejVarF2 = a4h.f(context2);
        cq cqVar = new cq(mqVarE0, str, str2, strA, listK2);
        nejVarF2.getClass();
        nejVarF2.b(cqVar, ijmVar);
    }
}
