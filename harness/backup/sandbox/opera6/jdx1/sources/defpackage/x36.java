package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x36 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;
    public final int r;

    static {
        new x36("", null, null, null, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, LinearLayoutManager.INVALID_OFFSET, 0.0f, 0);
        String str = tym.a;
        s = "0";
        t = "h";
        u = "1";
        v = "2";
        w = "3";
        x = "i";
        y = "4";
        z = "5";
        A = "6";
        B = "7";
        C = "8";
        D = "9";
        E = "a";
        F = "b";
        G = "c";
        H = "d";
        I = "e";
        J = "f";
        K = "g";
        L = "j";
    }

    public x36(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6, int i7) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            z4o.w(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = f2;
        this.i = i3;
        this.j = f4;
        this.k = f5;
        this.l = z2;
        this.m = i5;
        this.n = i4;
        this.o = f3;
        this.p = i6;
        this.q = f6;
        this.r = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v31, types: [android.text.Spannable, android.text.SpannableString] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.x36 b(android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x36.b(android.os.Bundle):x36");
    }

    public final w36 a() {
        w36 w36Var = new w36();
        w36Var.a = this.a;
        w36Var.b = this.d;
        w36Var.c = this.b;
        w36Var.d = this.c;
        w36Var.e = this.e;
        w36Var.f = this.f;
        w36Var.g = this.g;
        w36Var.h = this.h;
        w36Var.i = this.i;
        w36Var.j = this.n;
        w36Var.k = this.o;
        w36Var.l = this.j;
        w36Var.m = this.k;
        w36Var.n = this.l;
        w36Var.o = this.m;
        w36Var.p = this.p;
        w36Var.q = this.q;
        w36Var.r = this.r;
        return w36Var;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = r66.a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (obi obiVar : (obi[]) spanned.getSpans(0, spanned.length(), obi.class)) {
                    obiVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(obi.c, obiVar.a);
                    bundle2.putInt(obi.d, obiVar.b);
                    arrayList.add(r66.a(spanned, obiVar, 1, bundle2));
                }
                for (rgl rglVar : (rgl[]) spanned.getSpans(0, spanned.length(), rgl.class)) {
                    rglVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(rgl.d, rglVar.a);
                    bundle3.putInt(rgl.e, rglVar.b);
                    bundle3.putInt(rgl.f, rglVar.c);
                    arrayList.add(r66.a(spanned, rglVar, 2, bundle3));
                }
                for (sga sgaVar : (sga[]) spanned.getSpans(0, spanned.length(), sga.class)) {
                    arrayList.add(r66.a(spanned, sgaVar, 3, null));
                }
                for (dcn dcnVar : (dcn[]) spanned.getSpans(0, spanned.length(), dcn.class)) {
                    dcnVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(dcn.b, dcnVar.a);
                    arrayList.add(r66.a(spanned, dcnVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(t, arrayList);
                }
            }
        }
        bundle.putSerializable(u, this.b);
        bundle.putSerializable(v, this.c);
        bundle.putFloat(y, this.e);
        bundle.putInt(z, this.f);
        bundle.putInt(A, this.g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.i);
        bundle.putInt(D, this.n);
        bundle.putFloat(E, this.o);
        bundle.putFloat(F, this.j);
        bundle.putFloat(G, this.k);
        bundle.putBoolean(I, this.l);
        bundle.putInt(H, this.m);
        bundle.putInt(J, this.p);
        bundle.putFloat(K, this.q);
        bundle.putInt(L, this.r);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x36.class != obj.getClass()) {
            return false;
        }
        x36 x36Var = (x36) obj;
        if (!TextUtils.equals(this.a, x36Var.a) || this.b != x36Var.b || this.c != x36Var.c) {
            return false;
        }
        Bitmap bitmap = x36Var.d;
        Bitmap bitmap2 = this.d;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.e == x36Var.e && this.f == x36Var.f && this.g == x36Var.g && this.h == x36Var.h && this.i == x36Var.i && this.j == x36Var.j && this.k == x36Var.k && this.l == x36Var.l && this.m == x36Var.m && this.n == x36Var.n && this.o == x36Var.o && this.p == x36Var.p && this.q == x36Var.q && this.r == x36Var.r;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Float.valueOf(this.o), Integer.valueOf(this.p), Float.valueOf(this.q), Integer.valueOf(this.r));
    }
}
