package defpackage;

import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class sm8 {
    public byte a;
    public boolean b;
    public tm8 c;
    public GURL d;

    public static sm8 a(tm8 tm8Var, boolean z) {
        sm8 sm8Var = new sm8();
        sm8Var.a = (byte) 1;
        sm8Var.b = z;
        sm8Var.c = tm8Var;
        return sm8Var;
    }

    public static sm8 b(GURL gurl, tm8 tm8Var) {
        sm8 sm8Var = new sm8();
        sm8Var.a = (byte) 2;
        sm8Var.d = gurl;
        sm8Var.c = tm8Var;
        return sm8Var;
    }

    public static sm8 c() {
        sm8 sm8Var = new sm8();
        sm8Var.a = (byte) 0;
        return sm8Var;
    }
}
