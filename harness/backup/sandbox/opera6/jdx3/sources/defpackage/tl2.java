package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class tl2 {
    public static final long e;
    public final p12 a;
    public final dg2 b;
    public final q02 c = new q02(this, (byte) 19);
    public boolean d;

    static {
        on7 on7Var = pn7.b;
        e = cs5.x0(10, un7.e);
    }

    public tl2(kze kzeVar, p12 p12Var, dg2 dg2Var) {
        this.a = p12Var;
        this.b = dg2Var;
        final byte b = 0;
        a26.T((kze) p12Var.g, kzeVar, new f7f(this) { // from class: sl2
            public final /* synthetic */ tl2 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                tl2 tl2Var = this.b;
                boolean z = true;
                switch (b2) {
                    case 0:
                        q02 q02Var = tl2Var.c;
                        vml.a(q02Var);
                        int iOrdinal = ((ag2) obj).ordinal();
                        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                h9o.p();
                                break;
                            } else {
                                vml.d(q02Var, pn7.f(tl2.e));
                                break;
                            }
                        }
                        break;
                    default:
                        Bundle bundle = ((vjd) ((kze) tl2Var.a.b).g()).I;
                        boolean z2 = (bundle != null ? bundle.getString("com.opera.android.media.AI_POD_ID", null) : null) != null;
                        if (!z2 && tl2Var.d) {
                            tl2Var.b.invoke();
                        }
                        if (!tl2Var.d && !z2) {
                            z = false;
                        }
                        tl2Var.d = z;
                        break;
                }
            }
        });
        final byte b2 = 1;
        a26.T((kze) p12Var.b, kzeVar, new f7f(this) { // from class: sl2
            public final /* synthetic */ tl2 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                tl2 tl2Var = this.b;
                boolean z = true;
                switch (b22) {
                    case 0:
                        q02 q02Var = tl2Var.c;
                        vml.a(q02Var);
                        int iOrdinal = ((ag2) obj).ordinal();
                        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                h9o.p();
                                break;
                            } else {
                                vml.d(q02Var, pn7.f(tl2.e));
                                break;
                            }
                        }
                        break;
                    default:
                        Bundle bundle = ((vjd) ((kze) tl2Var.a.b).g()).I;
                        boolean z2 = (bundle != null ? bundle.getString("com.opera.android.media.AI_POD_ID", null) : null) != null;
                        if (!z2 && tl2Var.d) {
                            tl2Var.b.invoke();
                        }
                        if (!tl2Var.d && !z2) {
                            z = false;
                        }
                        tl2Var.d = z;
                        break;
                }
            }
        });
    }
}
