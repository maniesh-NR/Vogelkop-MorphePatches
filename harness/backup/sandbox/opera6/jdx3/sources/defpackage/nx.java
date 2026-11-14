package defpackage;

import ads_mobile_sdk.bu1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class nx implements wv8, fua, w7e {
    public final Context a;

    public /* synthetic */ nx(Context context) {
        this.a = context;
    }

    @Override // defpackage.wv8
    public final String a(yz yzVar) {
        Uri uri;
        yqa yqaVar = ((io) yzVar).w.m;
        return (yqaVar == null || (uri = (Uri) yqaVar.c) == null) ? "" : uri.toString();
    }

    @Override // defpackage.wv8
    public final double b(yz yzVar) {
        Double d = ((io) yzVar).w.j;
        if (d == null || d.doubleValue() < 0.0d || d.doubleValue() > 5.0d) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    @Override // defpackage.wv8
    public final String c(yz yzVar) {
        bu1 bu1Var = ((io) yzVar).w;
        String str = bu1Var.j != null ? bu1Var.k : "";
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = bu1Var.h;
        String[] strArr = aik.a;
        return str2 == null ? "" : str2;
    }

    @Override // defpackage.wv8
    public final CharSequence e(yz yzVar) {
        String str = ((io) yzVar).w.g;
        String[] strArr = aik.a;
        return str == null ? "" : str;
    }

    @Override // defpackage.wv8
    public final CharSequence f(yz yzVar) {
        String str = ((io) yzVar).w.f;
        String[] strArr = aik.a;
        return str == null ? "" : str;
    }

    @Override // defpackage.wv8
    public final CharSequence g(yz yzVar) {
        return ((io) yzVar).w.d;
    }

    @Override // defpackage.fua
    public final Drawable i() {
        Context context = this.a;
        Drawable drawableF = sgb.F(2131232224, context);
        if (drawableF == null) {
            qp2.n("Required value was null.");
            return null;
        }
        int iT = f03.t(2130969273, context, 2131101243);
        ShapeDrawable shapeDrawableD = j14.D(fan.a(48.0f, context.getResources()), f03.t(2130969303, context, 2131099815));
        j14.n0(drawableF, iT);
        return j14.p(shapeDrawableD, drawableF);
    }

    @Override // defpackage.wv8
    public final String j(yz yzVar) {
        return this.a.getString(2132017386);
    }

    public final v7e w(d5o d5oVar) {
        return new bsd(this.a, (byte) 0);
    }
}
