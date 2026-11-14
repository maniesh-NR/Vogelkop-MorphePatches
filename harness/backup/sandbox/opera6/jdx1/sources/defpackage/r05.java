package defpackage;

import ads_mobile_sdk.bj1;
import ads_mobile_sdk.cs3;
import ads_mobile_sdk.g;
import ads_mobile_sdk.ku0;
import ads_mobile_sdk.qb1;
import ads_mobile_sdk.ul0;
import ads_mobile_sdk.wm1;
import ads_mobile_sdk.yb1;
import ads_mobile_sdk.zl2;
import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r05 {
    public final /* synthetic */ byte a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public r05() {
        this.a = (byte) 0;
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.d = iHighestOneBit - 1;
        this.e = new int[iHighestOneBit];
    }

    public /* synthetic */ r05(byte b) {
        this.a = b;
    }

    public /* synthetic */ r05(byte b, int i, int i2, int i3, Object obj) {
        this.a = b;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = obj;
    }

    public r05(int i) {
        this.a = (byte) 4;
        this.b = i;
    }

    public /* synthetic */ r05(Object obj, byte b) {
        this.a = b;
        this.e = obj;
    }

    public r05(n75 n75Var) {
        this.a = (byte) 1;
        this.d = 0;
        hfb.a(n75Var, "input");
        this.e = n75Var;
        n75Var.c = this;
    }

    public r05(pde pdeVar, ebl eblVar, pde pdeVar2) {
        this.a = (byte) 10;
        this.e = eblVar;
        this.b = eblVar.a.getResources().getDimensionPixelSize(2131167669);
        ViewGroup.LayoutParams layoutParams = eblVar.b.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        this.c = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = eblVar.A.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        this.d = marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0;
        a26.T(pdeVar2, pdeVar, new g9l(this, (byte) 1));
    }

    public r05(s75 s75Var) {
        this.a = (byte) 2;
        this.d = 0;
        Charset charset = jfb.a;
        this.e = s75Var;
        s75Var.c = this;
    }

    public r05(v9g v9gVar) {
        this.a = (byte) 12;
        this.d = 0;
        byte[] bArr = yb1.a;
        this.e = v9gVar;
        v9gVar.c = this;
    }

    public r05(z63 z63Var) {
        this.a = (byte) 6;
        Context context = (Context) z63Var.b;
        float f = z63Var.a;
        this.e = context;
        ActivityManager activityManager = (ActivityManager) z63Var.c;
        int i = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.d = i;
        int iRound = Math.round((activityManager.getMemoryClass() << 20) * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) ((qfb) z63Var.d).b;
        float f2 = (displayMetrics.widthPixels * displayMetrics.heightPixels) << 2;
        int iRound2 = Math.round(f2 * f);
        int iRound3 = Math.round(f2 * 2.0f);
        int i2 = iRound - i;
        if (iRound3 + iRound2 <= i2) {
            this.c = iRound3;
            this.b = iRound2;
        } else {
            float f3 = i2 / (f + 2.0f);
            int iRound4 = Math.round(2.0f * f3);
            this.c = iRound4;
            int iRound5 = Math.round(f3 * f);
            this.b = iRound5;
            iRound2 = iRound5;
            iRound3 = iRound4;
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context, iRound3);
            Formatter.formatFileSize(context, iRound2);
            Formatter.formatFileSize(context, i);
            Formatter.formatFileSize(context, iRound);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
    }

    public static void c(int i) throws bj1 {
        if ((i & 3) == 0) {
            return;
        }
        t3p.j("Failed to parse the message.");
    }

    public static void d(int i) throws bj1 {
        if ((i & 7) == 0) {
            return;
        }
        t3p.j("Failed to parse the message.");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.r05 u(orb r9) throws org.json.JSONException {
        /*
            org.json.JSONObject r0 = r9.a
            java.lang.String r1 = "total_shared_count"
            int r4 = r0.getInt(r1)
            java.lang.String r1 = "total_like_count"
            r2 = 0
            int r5 = r0.optInt(r1, r2)
            java.lang.String r1 = "total_dislike_count"
            int r6 = r0.optInt(r1, r2)
            java.lang.String r0 = "total_emotions"
            vpb r9 = r9.h(r0)
            if (r9 == 0) goto L50
            org.json.JSONArray r0 = r9.a
            int r1 = r0.length()
            if (r1 <= 0) goto L50
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r0.length()
            r1.<init>(r3)
        L2e:
            int r3 = r0.length()
            if (r2 >= r3) goto L4e
            orb r3 = r9.e(r2)
            if (r3 == 0) goto L4b
            java.lang.String r7 = "name"
            java.lang.String r8 = ""
            java.lang.String r3 = r3.m(r7, r8)
            lsh r3 = lsh.d(r3)
            if (r3 == 0) goto L4b
            r1.add(r3)
        L4b:
            int r2 = r2 + 1
            goto L2e
        L4e:
            r7 = r1
            goto L52
        L50:
            r1 = 0
            goto L4e
        L52:
            r05 r2 = new r05
            r3 = 9
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r05.u(orb):r05");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajb */
    public static void u0(int i) throws ajb {
        if ((i & 3) != 0) {
            throw ajb.i();
        }
    }

    public static void v0(int i) throws cjb {
        if ((i & 3) != 0) {
            throw new cjb("Failed to parse the message.");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajb */
    public static void w0(int i) throws ajb {
        if ((i & 7) != 0) {
            throw ajb.i();
        }
    }

    public static void x0(int i) throws cjb {
        if ((i & 7) != 0) {
            throw new cjb("Failed to parse the message.");
        }
    }

    public final void A(Object obj, bni bniVar, zk8 zk8Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            bniVar.a(obj, this, zk8Var);
            if (this.b == this.c) {
            } else {
                throw new cjb("Failed to parse the message.");
            }
        } finally {
            this.c = i;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajb */
    public final void B(Object obj, zmi zmiVar, xk8 xk8Var) throws ajb {
        n75 n75Var = (n75) this.e;
        int i = n75Var.i();
        if (n75Var.a + 0 >= n75Var.b) {
            throw new ajb("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iE = n75Var.e(i);
        n75Var.a++;
        zmiVar.d(obj, this, xk8Var);
        if (n75Var.i != 0) {
            throw new ajb("Protocol message end-group tag did not match expected tag.");
        }
        n75Var.a--;
        n75Var.j = iE;
        n75Var.m();
    }

    public final void C(Object obj, bni bniVar, zk8 zk8Var) throws cjb {
        s75 s75Var = (s75) this.e;
        int iD = s75Var.D();
        if (s75Var.b >= 100) {
            throw new cjb("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iM = s75Var.m(iD);
        s75Var.b++;
        bniVar.a(obj, this, zk8Var);
        s75Var.a(0);
        s75Var.b--;
        s75Var.l(iM);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yib */
    public final void D(efb efbVar) throws yib, ajb, cjb {
        int iL;
        int iL2;
        n75 n75Var = (n75) this.e;
        boolean z = efbVar instanceof kn3;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    efbVar.add(Boolean.valueOf(n75Var.f()));
                    if (n75Var.d()) {
                        return;
                    } else {
                        iL = n75Var.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw ajb.g();
            }
            int iC = n75Var.c() + n75Var.i();
            do {
                efbVar.add(Boolean.valueOf(n75Var.f()));
            } while (n75Var.c() < iC);
            p0(iC);
            return;
        }
        kn3 kn3Var = (kn3) efbVar;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                kn3Var.addBoolean(n75Var.f());
                if (n75Var.d()) {
                    return;
                } else {
                    iL2 = n75Var.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i3 != 2) {
            throw ajb.g();
        }
        int iC2 = n75Var.c() + n75Var.i();
        do {
            kn3Var.addBoolean(n75Var.f());
        } while (n75Var.c() < iC2);
        p0(iC2);
    }

    public final void E(gfb gfbVar) throws ajb, cjb {
        int iC;
        s75 s75Var = (s75) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                gfbVar.add(Boolean.valueOf(s75Var.n()));
                if (s75Var.g()) {
                    return;
                } else {
                    iC = s75Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw cjb.g();
        }
        int iF = s75Var.f() + s75Var.D();
        do {
            gfbVar.add(Boolean.valueOf(s75Var.n()));
        } while (s75Var.f() < iF);
        p0(iF);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajb */
    public final c54 F() throws zib, yib, ajb {
        byte[] bArrCopyOfRange;
        q0(2);
        n75 n75Var = (n75) this.e;
        byte[] bArr = n75Var.d;
        int i = n75Var.i();
        if (i > 0) {
            int i2 = n75Var.e;
            int i3 = n75Var.g;
            if (i <= i2 - i3) {
                c54 c54VarH = e54.h(i3, i, bArr);
                n75Var.g += i;
                return c54VarH;
            }
        }
        if (i == 0) {
            return e54.b;
        }
        if (i > 0) {
            int i4 = n75Var.e;
            int i5 = n75Var.g;
            if (i > i4 - i5) {
                throw ajb.j();
            }
            int i6 = i + i5;
            n75Var.g = i6;
            bArrCopyOfRange = Arrays.copyOfRange(bArr, i5, i6);
        } else {
            if (i != 0) {
                throw ajb.h();
            }
            bArrCopyOfRange = hfb.b;
        }
        c54 c54Var = e54.b;
        return new c54(bArrCopyOfRange);
    }

    public final d54 G() throws zib, yib {
        q0(2);
        return ((s75) this.e).o();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yib */
    public final void H(efb efbVar) throws yib {
        int iL;
        n75 n75Var = (n75) this.e;
        if ((this.b & 7) != 2) {
            throw ajb.g();
        }
        do {
            efbVar.add(F());
            if (n75Var.d()) {
                return;
            } else {
                iL = n75Var.l();
            }
        } while (iL == this.b);
        this.d = iL;
    }

    public final void I(gfb gfbVar) throws zib {
        int iC;
        s75 s75Var = (s75) this.e;
        if ((this.b & 7) != 2) {
            throw cjb.g();
        }
        do {
            gfbVar.add(G());
            if (s75Var.g()) {
                return;
            } else {
                iC = s75Var.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yib */
    public final void J(efb efbVar) throws yib, ajb {
        int iL;
        int iL2;
        n75 n75Var = (n75) this.e;
        boolean z = efbVar instanceof de7;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    efbVar.add(Double.valueOf(Double.longBitsToDouble(n75Var.h())));
                    if (n75Var.d()) {
                        return;
                    } else {
                        iL = n75Var.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw ajb.g();
            }
            int i3 = n75Var.i();
            w0(i3);
            int iC = n75Var.c() + i3;
            do {
                efbVar.add(Double.valueOf(Double.longBitsToDouble(n75Var.h())));
            } while (n75Var.c() < iC);
            return;
        }
        de7 de7Var = (de7) efbVar;
        int i4 = i & 7;
        if (i4 == 1) {
            do {
                de7Var.addDouble(Double.longBitsToDouble(n75Var.h()));
                if (n75Var.d()) {
                    return;
                } else {
                    iL2 = n75Var.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i4 != 2) {
            throw ajb.g();
        }
        int i5 = n75Var.i();
        w0(i5);
        int iC2 = n75Var.c() + i5;
        do {
            de7Var.addDouble(Double.longBitsToDouble(n75Var.h()));
        } while (n75Var.c() < iC2);
    }

    public final void K(gfb gfbVar) throws cjb {
        int iC;
        s75 s75Var = (s75) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                gfbVar.add(Double.valueOf(s75Var.p()));
                if (s75Var.g()) {
                    return;
                } else {
                    iC = s75Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw cjb.g();
        }
        int iD = s75Var.D();
        x0(iD);
        int iF = s75Var.f() + iD;
        do {
            gfbVar.add(Double.valueOf(s75Var.p()));
        } while (s75Var.f() < iF);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yib */
    public final void L(efb efbVar) throws yib, ajb, cjb {
        int iL;
        int iL2;
        n75 n75Var = (n75) this.e;
        boolean z = efbVar instanceof mbb;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    efbVar.add(Integer.valueOf(n75Var.i()));
                    if (n75Var.d()) {
                        return;
                    } else {
                        iL = n75Var.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw ajb.g();
            }
            int iC = n75Var.c() + n75Var.i();
            do {
                efbVar.add(Integer.valueOf(n75Var.i()));
            } while (n75Var.c() < iC);
            p0(iC);
            return;
        }
        mbb mbbVar = (mbb) efbVar;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                mbbVar.addInt(n75Var.i());
                if (n75Var.d()) {
                    return;
                } else {
                    iL2 = n75Var.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i3 != 2) {
            throw ajb.g();
        }
        int iC2 = n75Var.c() + n75Var.i();
        do {
            mbbVar.addInt(n75Var.i());
        } while (n75Var.c() < iC2);
        p0(iC2);
    }

    public final void M(gfb gfbVar) throws ajb, cjb {
        int iC;
        s75 s75Var = (s75) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                gfbVar.add(Integer.valueOf(s75Var.q()));
                if (s75Var.g()) {
                    return;
                } else {
                    iC = s75Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw cjb.g();
        }
        int iF = s75Var.f() + s75Var.D();
        do {
            gfbVar.add(Integer.valueOf(s75Var.q()));
        } while (s75Var.f() < iF);
        p0(iF);
    }

    public final Object N(k4o k4oVar, Class cls, zk8 zk8Var) throws yib, cjb {
        s75 s75Var = (s75) this.e;
        switch (k4oVar.ordinal()) {
            case 0:
                q0(1);
                return Double.valueOf(s75Var.p());
            case 1:
                q0(5);
                return Float.valueOf(s75Var.t());
            case 2:
                q0(0);
                return Long.valueOf(s75Var.v());
            case 3:
                q0(0);
                return Long.valueOf(s75Var.E());
            case 4:
                q0(0);
                return Integer.valueOf(s75Var.u());
            case 5:
                q0(1);
                return Long.valueOf(s75Var.s());
            case 6:
                q0(5);
                return Integer.valueOf(s75Var.r());
            case 7:
                q0(0);
                return Boolean.valueOf(s75Var.n());
            case 8:
                q0(2);
                return s75Var.B();
            case 9:
            default:
                qp2.o("unsupported field type.");
                return null;
            case 10:
                q0(2);
                bni bniVarA = y6h.c.a(cls);
                hv9 hv9VarNewInstance = bniVarA.newInstance();
                C(hv9VarNewInstance, bniVarA, zk8Var);
                bniVarA.makeImmutable(hv9VarNewInstance);
                return hv9VarNewInstance;
            case 11:
                return G();
            case 12:
                q0(0);
                return Integer.valueOf(s75Var.D());
            case 13:
                q0(0);
                return Integer.valueOf(s75Var.q());
            case 14:
                q0(5);
                return Integer.valueOf(s75Var.w());
            case 15:
                q0(1);
                return Long.valueOf(s75Var.x());
            case 16:
                q0(0);
                return Integer.valueOf(s75Var.y());
            case 17:
                q0(0);
                return Long.valueOf(s75Var.z());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yib */
    public final void O(efb efbVar) throws yib, ajb {
        int iL;
        int iL2;
        n75 n75Var = (n75) this.e;
        boolean z = efbVar instanceof mbb;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int i3 = n75Var.i();
                u0(i3);
                int iC = n75Var.c() + i3;
                do {
                    efbVar.add(Integer.valueOf(n75Var.g()));
                } while (n75Var.c() < iC);
                return;
            }
            if (i2 != 5) {
                throw ajb.g();
            }
            do {
                efbVar.add(Integer.valueOf(n75Var.g()));
                if (n75Var.d()) {
                    return;
                } else {
                    iL = n75Var.l();
                }
            } while (iL == this.b);
            this.d = iL;
            return;
        }
        mbb mbbVar = (mbb) efbVar;
        int i4 = i & 7;
        if (i4 == 2) {
            int i5 = n75Var.i();
            u0(i5);
            int iC2 = n75Var.c() + i5;
            do {
                mbbVar.addInt(n75Var.g());
            } while (n75Var.c() < iC2);
            return;
        }
        if (i4 != 5) {
            throw ajb.g();
        }
        do {
            mbbVar.addInt(n75Var.g());
            if (n75Var.d()) {
                return;
            } else {
                iL2 = n75Var.l();
            }
        } while (iL2 == this.b);
        this.d = iL2;
    }

    public final void P(gfb gfbVar) throws cjb {
        int iC;
        s75 s75Var = (s75) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iD = s75Var.D();
            v0(iD);
            int iF = s75Var.f() + iD;
            do {
                gfbVar.add(Integer.valueOf(s75Var.r()));
            } while (s75Var.f() < iF);
            return;
        }
        if (i != 5) {
            throw cjb.g();
        }
        do {
            gfbVar.add(Integer.valueOf(s75Var.r()));
            if (s75Var.g()) {
                return;
            } else {
                iC = s75Var.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yib */
    public final void Q(efb efbVar) throws yib, ajb {
        int iL;
        int iL2;
        n75 n75Var = (n75) this.e;
        boolean z = efbVar instanceof l0d;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    efbVar.add(Long.valueOf(n75Var.h()));
                    if (n75Var.d()) {
                        return;
                    } else {
                        iL = n75Var.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw ajb.g();
            }
            int i3 = n75Var.i();
            w0(i3);
            int iC = n75Var.c() + i3;
            do {
                efbVar.add(Long.valueOf(n75Var.h()));
            } while (n75Var.c() < iC);
            return;
        }
        l0d l0dVar = (l0d) efbVar;
        int i4 = i & 7;
        if (i4 == 1) {
            do {
                l0dVar.addLong(n75Var.h());
                if (n75Var.d()) {
                    return;
                } else {
                    iL2 = n75Var.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i4 != 2) {
            throw ajb.g();
        }
        int i5 = n75Var.i();
        w0(i5);
        int iC2 = n75Var.c() + i5;
        do {
            l0dVar.addLong(n75Var.h());
        } while (n75Var.c() < iC2);
    }

    public final void R(gfb gfbVar) throws cjb {
        int iC;
        s75 s75Var = (s75) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                gfbVar.add(Long.valueOf(s75Var.s()));
                if (s75Var.g()) {
                    return;
                } else {
                    iC = s75Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw cjb.g();
        }
        int iD = s75Var.D();
        x0(iD);
        int iF = s75Var.f() + iD;
        do {
            gfbVar.add(Long.valueOf(s75Var.s()));
        } while (s75Var.f() < iF);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yib */
    public final void S(efb efbVar) throws yib, ajb {
        int iL;
        int iL2;
        n75 n75Var = (n75) this.e;
        boolean z = efbVar instanceof p89;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int i3 = n75Var.i();
                u0(i3);
                int iC = n75Var.c() + i3;
                do {
                    efbVar.add(Float.valueOf(Float.intBitsToFloat(n75Var.g())));
                } while (n75Var.c() < iC);
                return;
            }
            if (i2 != 5) {
                throw ajb.g();
            }
            do {
                efbVar.add(Float.valueOf(Float.intBitsToFloat(n75Var.g())));
                if (n75Var.d()) {
                    return;
                } else {
                    iL = n75Var.l();
                }
            } while (iL == this.b);
            this.d = iL;
            return;
        }
        p89 p89Var = (p89) efbVar;
        int i4 = i & 7;
        if (i4 == 2) {
            int i5 = n75Var.i();
            u0(i5);
            int iC2 = n75Var.c() + i5;
            do {
                p89Var.addFloat(Float.intBitsToFloat(n75Var.g()));
            } while (n75Var.c() < iC2);
            return;
        }
        if (i4 != 5) {
            throw ajb.g();
        }
        do {
            p89Var.addFloat(Float.intBitsToFloat(n75Var.g()));
            if (n75Var.d()) {
                return;
            } else {
                iL2 = n75Var.l();
            }
        } while (iL2 == this.b);
        this.d = iL2;
    }

    public final void T(gfb gfbVar) throws cjb {
        int iC;
        s75 s75Var = (s75) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iD = s75Var.D();
            v0(iD);
            int iF = s75Var.f() + iD;
            do {
                gfbVar.add(Float.valueOf(s75Var.t()));
            } while (s75Var.f() < iF);
            return;
        }
        if (i != 5) {
            throw cjb.g();
        }
        do {
            gfbVar.add(Float.valueOf(s75Var.t()));
            if (s75Var.g()) {
                return;
            } else {
                iC = s75Var.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yib */
    public final void U(efb efbVar) throws yib, ajb, cjb {
        int iL;
        int iL2;
        n75 n75Var = (n75) this.e;
        boolean z = efbVar instanceof mbb;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    efbVar.add(Integer.valueOf(n75Var.i()));
                    if (n75Var.d()) {
                        return;
                    } else {
                        iL = n75Var.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw ajb.g();
            }
            int iC = n75Var.c() + n75Var.i();
            do {
                efbVar.add(Integer.valueOf(n75Var.i()));
            } while (n75Var.c() < iC);
            p0(iC);
            return;
        }
        mbb mbbVar = (mbb) efbVar;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                mbbVar.addInt(n75Var.i());
                if (n75Var.d()) {
                    return;
                } else {
                    iL2 = n75Var.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i3 != 2) {
            throw ajb.g();
        }
        int iC2 = n75Var.c() + n75Var.i();
        do {
            mbbVar.addInt(n75Var.i());
        } while (n75Var.c() < iC2);
        p0(iC2);
    }

    public final void V(gfb gfbVar) throws ajb, cjb {
        int iC;
        s75 s75Var = (s75) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                gfbVar.add(Integer.valueOf(s75Var.u()));
                if (s75Var.g()) {
                    return;
                } else {
                    iC = s75Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw cjb.g();
        }
        int iF = s75Var.f() + s75Var.D();
        do {
            gfbVar.add(Integer.valueOf(s75Var.u()));
        } while (s75Var.f() < iF);
        p0(iF);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yib */
    public final void W(efb efbVar) throws yib, ajb, cjb {
        int iL;
        int iL2;
        n75 n75Var = (n75) this.e;
        boolean z = efbVar instanceof l0d;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    efbVar.add(Long.valueOf(n75Var.j()));
                    if (n75Var.d()) {
                        return;
                    } else {
                        iL = n75Var.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw ajb.g();
            }
            int iC = n75Var.c() + n75Var.i();
            do {
                efbVar.add(Long.valueOf(n75Var.j()));
            } while (n75Var.c() < iC);
            p0(iC);
            return;
        }
        l0d l0dVar = (l0d) efbVar;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                l0dVar.addLong(n75Var.j());
                if (n75Var.d()) {
                    return;
                } else {
                    iL2 = n75Var.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i3 != 2) {
            throw ajb.g();
        }
        int iC2 = n75Var.c() + n75Var.i();
        do {
            l0dVar.addLong(n75Var.j());
        } while (n75Var.c() < iC2);
        p0(iC2);
    }

    public final void X(gfb gfbVar) throws ajb, cjb {
        int iC;
        s75 s75Var = (s75) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                gfbVar.add(Long.valueOf(s75Var.v()));
                if (s75Var.g()) {
                    return;
                } else {
                    iC = s75Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw cjb.g();
        }
        int iF = s75Var.f() + s75Var.D();
        do {
            gfbVar.add(Long.valueOf(s75Var.v()));
        } while (s75Var.f() < iF);
        p0(iF);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yib */
    public final void Y(efb efbVar) throws yib, ajb {
        int iL;
        int iL2;
        n75 n75Var = (n75) this.e;
        boolean z = efbVar instanceof mbb;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int i3 = n75Var.i();
                u0(i3);
                int iC = n75Var.c() + i3;
                do {
                    efbVar.add(Integer.valueOf(n75Var.g()));
                } while (n75Var.c() < iC);
                return;
            }
            if (i2 != 5) {
                throw ajb.g();
            }
            do {
                efbVar.add(Integer.valueOf(n75Var.g()));
                if (n75Var.d()) {
                    return;
                } else {
                    iL = n75Var.l();
                }
            } while (iL == this.b);
            this.d = iL;
            return;
        }
        mbb mbbVar = (mbb) efbVar;
        int i4 = i & 7;
        if (i4 == 2) {
            int i5 = n75Var.i();
            u0(i5);
            int iC2 = n75Var.c() + i5;
            do {
                mbbVar.addInt(n75Var.g());
            } while (n75Var.c() < iC2);
            return;
        }
        if (i4 != 5) {
            throw ajb.g();
        }
        do {
            mbbVar.addInt(n75Var.g());
            if (n75Var.d()) {
                return;
            } else {
                iL2 = n75Var.l();
            }
        } while (iL2 == this.b);
        this.d = iL2;
    }

    public final void Z(gfb gfbVar) throws cjb {
        int iC;
        s75 s75Var = (s75) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iD = s75Var.D();
            v0(iD);
            int iF = s75Var.f() + iD;
            do {
                gfbVar.add(Integer.valueOf(s75Var.w()));
            } while (s75Var.f() < iF);
            return;
        }
        if (i != 5) {
            throw cjb.g();
        }
        do {
            gfbVar.add(Integer.valueOf(s75Var.w()));
            if (s75Var.g()) {
                return;
            } else {
                iC = s75Var.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    public final int a() {
        int iR = this.d;
        if (iR != 0) {
            this.b = iR;
            this.d = 0;
        } else {
            iR = ((v9g) this.e).r();
            this.b = iR;
        }
        if (iR == 0 || iR == this.c) {
            return Integer.MAX_VALUE;
        }
        return iR >>> 3;
    }

    public final Object a(cs3 cs3Var, Class cls, ul0 ul0Var) throws bj1 {
        v9g v9gVar = (v9g) this.e;
        switch (cs3Var.ordinal()) {
            case 0:
                b(1);
                return Double.valueOf(v9gVar.e());
            case 1:
                b(5);
                return Float.valueOf(v9gVar.i());
            case 2:
                b(0);
                return Long.valueOf(v9gVar.k());
            case 3:
                b(0);
                return Long.valueOf(v9gVar.t());
            case 4:
                b(0);
                return Integer.valueOf(v9gVar.j());
            case 5:
                b(1);
                return Long.valueOf(v9gVar.h());
            case 6:
                b(5);
                return Integer.valueOf(v9gVar.g());
            case 7:
                b(0);
                return Boolean.valueOf(v9gVar.c());
            case 8:
                b(2);
                return v9gVar.q();
            case 9:
            default:
                qp2.o("unsupported field type.");
                return null;
            case 10:
                b(2);
                pio pioVarA = zl2.c.a(cls);
                ku0 ku0VarA = pioVarA.a();
                b(ku0VarA, pioVarA, ul0Var);
                pioVarA.c(ku0VarA);
                return ku0VarA;
            case 11:
                b(2);
                return v9gVar.d();
            case 12:
                b(0);
                return Integer.valueOf(v9gVar.s());
            case 13:
                b(0);
                return Integer.valueOf(v9gVar.f());
            case 14:
                b(5);
                return Integer.valueOf(v9gVar.l());
            case 15:
                b(1);
                return Long.valueOf(v9gVar.m());
            case 16:
                b(0);
                return Integer.valueOf(v9gVar.n());
            case 17:
                b(0);
                return Long.valueOf(v9gVar.o());
        }
    }

    public final void a(int i) throws bj1 {
        if (((v9g) this.e).a() == i) {
            return;
        }
        t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void a(g gVar, pio pioVar, ul0 ul0Var) throws bj1 {
        v9g v9gVar = (v9g) this.e;
        int i = v9gVar.a;
        int i2 = v9gVar.b;
        if (i + i2 >= 100) {
            t3p.j("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return;
        }
        int i3 = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        v9gVar.b = i2 + 1;
        try {
            pioVar.a(gVar, this, ul0Var);
            if (this.b == this.c) {
            } else {
                throw new bj1("Failed to parse the message.");
            }
        } finally {
            v9gVar.b--;
            this.c = i3;
        }
    }

    public final void a(flp flpVar) throws bj1 {
        int iR;
        v9g v9gVar = (v9g) this.e;
        if (flpVar instanceof fop) {
            h9o.t();
            return;
        }
        int i = this.b & 7;
        if (i == 0) {
            do {
                flpVar.add(Boolean.valueOf(v9gVar.c()));
                if (v9gVar.b()) {
                    return;
                } else {
                    iR = v9gVar.r();
                }
            } while (iR == this.b);
            this.d = iR;
            return;
        }
        if (i != 2) {
            t3p.c();
            return;
        }
        int iA = v9gVar.a() + v9gVar.s();
        do {
            flpVar.add(Boolean.valueOf(v9gVar.c()));
        } while (v9gVar.a() < iA);
        a(iA);
    }

    public final void a(flp flpVar, boolean z) throws elo {
        String strP;
        int iR;
        v9g v9gVar = (v9g) this.e;
        if ((this.b & 7) != 2) {
            t3p.c();
            return;
        }
        do {
            if (z) {
                b(2);
                strP = v9gVar.q();
            } else {
                b(2);
                strP = v9gVar.p();
            }
            flpVar.add(strP);
            if (v9gVar.b()) {
                return;
            } else {
                iR = v9gVar.r();
            }
        } while (iR == this.b);
        this.d = iR;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yib */
    public final void a0(efb efbVar) throws yib, ajb {
        int iL;
        int iL2;
        n75 n75Var = (n75) this.e;
        boolean z = efbVar instanceof l0d;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    efbVar.add(Long.valueOf(n75Var.h()));
                    if (n75Var.d()) {
                        return;
                    } else {
                        iL = n75Var.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw ajb.g();
            }
            int i3 = n75Var.i();
            w0(i3);
            int iC = n75Var.c() + i3;
            do {
                efbVar.add(Long.valueOf(n75Var.h()));
            } while (n75Var.c() < iC);
            return;
        }
        l0d l0dVar = (l0d) efbVar;
        int i4 = i & 7;
        if (i4 == 1) {
            do {
                l0dVar.addLong(n75Var.h());
                if (n75Var.d()) {
                    return;
                } else {
                    iL2 = n75Var.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i4 != 2) {
            throw ajb.g();
        }
        int i5 = n75Var.i();
        w0(i5);
        int iC2 = n75Var.c() + i5;
        do {
            l0dVar.addLong(n75Var.h());
        } while (n75Var.c() < iC2);
    }

    public final void b(int i) throws elo {
        if ((this.b & 7) == i) {
            return;
        }
        t3p.c();
    }

    public final void b(g gVar, pio pioVar, ul0 ul0Var) throws bj1 {
        v9g v9gVar = (v9g) this.e;
        int iS = v9gVar.s();
        if (v9gVar.a + v9gVar.b >= 100) {
            t3p.j("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return;
        }
        int iD = v9gVar.d(iS);
        v9gVar.a++;
        pioVar.a(gVar, this, ul0Var);
        v9gVar.a(0);
        v9gVar.a--;
        v9gVar.c(iD);
    }

    public final void b(flp flpVar) throws elo {
        int iR;
        v9g v9gVar = (v9g) this.e;
        if ((this.b & 7) != 2) {
            t3p.c();
            return;
        }
        do {
            b(2);
            flpVar.add(v9gVar.d());
            if (v9gVar.b()) {
                return;
            } else {
                iR = v9gVar.r();
            }
        } while (iR == this.b);
        this.d = iR;
    }

    public final void b0(gfb gfbVar) throws cjb {
        int iC;
        s75 s75Var = (s75) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                gfbVar.add(Long.valueOf(s75Var.x()));
                if (s75Var.g()) {
                    return;
                } else {
                    iC = s75Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw cjb.g();
        }
        int iD = s75Var.D();
        x0(iD);
        int iF = s75Var.f() + iD;
        do {
            gfbVar.add(Long.valueOf(s75Var.x()));
        } while (s75Var.f() < iF);
    }

    public final void c(flp flpVar) throws bj1 {
        int iR;
        v9g v9gVar = (v9g) this.e;
        if (flpVar instanceof kbp) {
            h9o.t();
            return;
        }
        int i = this.b & 7;
        if (i == 1) {
            do {
                flpVar.add(Double.valueOf(v9gVar.e()));
                if (v9gVar.b()) {
                    return;
                } else {
                    iR = v9gVar.r();
                }
            } while (iR == this.b);
            this.d = iR;
            return;
        }
        if (i != 2) {
            t3p.c();
            return;
        }
        int iS = v9gVar.s();
        d(iS);
        int iA = v9gVar.a() + iS;
        do {
            flpVar.add(Double.valueOf(v9gVar.e()));
        } while (v9gVar.a() < iA);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yib */
    public final void c0(efb efbVar) throws yib, ajb, cjb {
        int iL;
        int iL2;
        n75 n75Var = (n75) this.e;
        boolean z = efbVar instanceof mbb;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    efbVar.add(Integer.valueOf(n75.a(n75Var.i())));
                    if (n75Var.d()) {
                        return;
                    } else {
                        iL = n75Var.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw ajb.g();
            }
            int iC = n75Var.c() + n75Var.i();
            do {
                efbVar.add(Integer.valueOf(n75.a(n75Var.i())));
            } while (n75Var.c() < iC);
            p0(iC);
            return;
        }
        mbb mbbVar = (mbb) efbVar;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                mbbVar.addInt(n75.a(n75Var.i()));
                if (n75Var.d()) {
                    return;
                } else {
                    iL2 = n75Var.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i3 != 2) {
            throw ajb.g();
        }
        int iC2 = n75Var.c() + n75Var.i();
        do {
            mbbVar.addInt(n75.a(n75Var.i()));
        } while (n75Var.c() < iC2);
        p0(iC2);
    }

    public final void d(flp flpVar) throws bj1 {
        int iR;
        int iR2;
        v9g v9gVar = (v9g) this.e;
        boolean z = flpVar instanceof qb1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    flpVar.add(Integer.valueOf(v9gVar.f()));
                    if (v9gVar.b()) {
                        return;
                    } else {
                        iR = v9gVar.r();
                    }
                } while (iR == this.b);
                this.d = iR;
                return;
            }
            if (i2 != 2) {
                t3p.c();
                return;
            }
            int iA = v9gVar.a() + v9gVar.s();
            do {
                flpVar.add(Integer.valueOf(v9gVar.f()));
            } while (v9gVar.a() < iA);
            a(iA);
            return;
        }
        qb1 qb1Var = (qb1) flpVar;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                qb1Var.b(v9gVar.f());
                if (v9gVar.b()) {
                    return;
                } else {
                    iR2 = v9gVar.r();
                }
            } while (iR2 == this.b);
            this.d = iR2;
            return;
        }
        if (i3 != 2) {
            t3p.c();
            return;
        }
        int iA2 = v9gVar.a() + v9gVar.s();
        do {
            qb1Var.b(v9gVar.f());
        } while (v9gVar.a() < iA2);
        a(iA2);
    }

    public final void d0(gfb gfbVar) throws ajb, cjb {
        int iC;
        s75 s75Var = (s75) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                gfbVar.add(Integer.valueOf(s75Var.y()));
                if (s75Var.g()) {
                    return;
                } else {
                    iC = s75Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw cjb.g();
        }
        int iF = s75Var.f() + s75Var.D();
        do {
            gfbVar.add(Integer.valueOf(s75Var.y()));
        } while (s75Var.f() < iF);
        p0(iF);
    }

    public final void e(flp flpVar) throws bj1 {
        int iR;
        int iR2;
        v9g v9gVar = (v9g) this.e;
        boolean z = flpVar instanceof qb1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iS = v9gVar.s();
                c(iS);
                int iA = v9gVar.a() + iS;
                do {
                    flpVar.add(Integer.valueOf(v9gVar.g()));
                } while (v9gVar.a() < iA);
                return;
            }
            if (i2 != 5) {
                t3p.c();
                return;
            }
            do {
                flpVar.add(Integer.valueOf(v9gVar.g()));
                if (v9gVar.b()) {
                    return;
                } else {
                    iR = v9gVar.r();
                }
            } while (iR == this.b);
            this.d = iR;
            return;
        }
        qb1 qb1Var = (qb1) flpVar;
        int i3 = i & 7;
        if (i3 == 2) {
            int iS2 = v9gVar.s();
            c(iS2);
            int iA2 = v9gVar.a() + iS2;
            do {
                qb1Var.b(v9gVar.g());
            } while (v9gVar.a() < iA2);
            return;
        }
        if (i3 != 5) {
            t3p.c();
            return;
        }
        do {
            qb1Var.b(v9gVar.g());
            if (v9gVar.b()) {
                return;
            } else {
                iR2 = v9gVar.r();
            }
        } while (iR2 == this.b);
        this.d = iR2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yib */
    public final void e0(efb efbVar) throws yib, ajb, cjb {
        int iL;
        int iL2;
        n75 n75Var = (n75) this.e;
        boolean z = efbVar instanceof l0d;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    efbVar.add(Long.valueOf(n75.b(n75Var.j())));
                    if (n75Var.d()) {
                        return;
                    } else {
                        iL = n75Var.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw ajb.g();
            }
            int iC = n75Var.c() + n75Var.i();
            do {
                efbVar.add(Long.valueOf(n75.b(n75Var.j())));
            } while (n75Var.c() < iC);
            p0(iC);
            return;
        }
        l0d l0dVar = (l0d) efbVar;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                l0dVar.addLong(n75.b(n75Var.j()));
                if (n75Var.d()) {
                    return;
                } else {
                    iL2 = n75Var.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i3 != 2) {
            throw ajb.g();
        }
        int iC2 = n75Var.c() + n75Var.i();
        do {
            l0dVar.addLong(n75.b(n75Var.j()));
        } while (n75Var.c() < iC2);
        p0(iC2);
    }

    public final void f(flp flpVar) throws bj1 {
        int iR;
        int iR2;
        v9g v9gVar = (v9g) this.e;
        boolean z = flpVar instanceof wm1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    flpVar.add(Long.valueOf(v9gVar.h()));
                    if (v9gVar.b()) {
                        return;
                    } else {
                        iR = v9gVar.r();
                    }
                } while (iR == this.b);
                this.d = iR;
                return;
            }
            if (i2 != 2) {
                t3p.c();
                return;
            }
            int iS = v9gVar.s();
            d(iS);
            int iA = v9gVar.a() + iS;
            do {
                flpVar.add(Long.valueOf(v9gVar.h()));
            } while (v9gVar.a() < iA);
            return;
        }
        wm1 wm1Var = (wm1) flpVar;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                wm1Var.a(v9gVar.h());
                if (v9gVar.b()) {
                    return;
                } else {
                    iR2 = v9gVar.r();
                }
            } while (iR2 == this.b);
            this.d = iR2;
            return;
        }
        if (i3 != 2) {
            t3p.c();
            return;
        }
        int iS2 = v9gVar.s();
        d(iS2);
        int iA2 = v9gVar.a() + iS2;
        do {
            wm1Var.a(v9gVar.h());
        } while (v9gVar.a() < iA2);
    }

    public final void f0(gfb gfbVar) throws ajb, cjb {
        int iC;
        s75 s75Var = (s75) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                gfbVar.add(Long.valueOf(s75Var.z()));
                if (s75Var.g()) {
                    return;
                } else {
                    iC = s75Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw cjb.g();
        }
        int iF = s75Var.f() + s75Var.D();
        do {
            gfbVar.add(Long.valueOf(s75Var.z()));
        } while (s75Var.f() < iF);
        p0(iF);
    }

    public final void g(flp flpVar) throws bj1 {
        int iR;
        v9g v9gVar = (v9g) this.e;
        if (flpVar instanceof tkp) {
            h9o.t();
            return;
        }
        int i = this.b & 7;
        if (i == 2) {
            int iS = v9gVar.s();
            c(iS);
            int iA = v9gVar.a() + iS;
            do {
                flpVar.add(Float.valueOf(v9gVar.i()));
            } while (v9gVar.a() < iA);
            return;
        }
        if (i != 5) {
            t3p.c();
            return;
        }
        do {
            flpVar.add(Float.valueOf(v9gVar.i()));
            if (v9gVar.b()) {
                return;
            } else {
                iR = v9gVar.r();
            }
        } while (iR == this.b);
        this.d = iR;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajb */
    public final String g0() throws zib, yib, ajb {
        q0(2);
        n75 n75Var = (n75) this.e;
        int i = n75Var.i();
        if (i > 0) {
            int i2 = n75Var.e;
            int i3 = n75Var.g;
            if (i <= i2 - i3) {
                String str = new String(n75Var.d, i3, i, hfb.a);
                n75Var.g += i;
                return str;
            }
        }
        if (i == 0) {
            return "";
        }
        if (i < 0) {
            throw ajb.h();
        }
        throw ajb.j();
    }

    public final void h(flp flpVar) throws bj1 {
        int iR;
        int iR2;
        v9g v9gVar = (v9g) this.e;
        boolean z = flpVar instanceof qb1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    flpVar.add(Integer.valueOf(v9gVar.j()));
                    if (v9gVar.b()) {
                        return;
                    } else {
                        iR = v9gVar.r();
                    }
                } while (iR == this.b);
                this.d = iR;
                return;
            }
            if (i2 != 2) {
                t3p.c();
                return;
            }
            int iA = v9gVar.a() + v9gVar.s();
            do {
                flpVar.add(Integer.valueOf(v9gVar.j()));
            } while (v9gVar.a() < iA);
            a(iA);
            return;
        }
        qb1 qb1Var = (qb1) flpVar;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                qb1Var.b(v9gVar.j());
                if (v9gVar.b()) {
                    return;
                } else {
                    iR2 = v9gVar.r();
                }
            } while (iR2 == this.b);
            this.d = iR2;
            return;
        }
        if (i3 != 2) {
            t3p.c();
            return;
        }
        int iA2 = v9gVar.a() + v9gVar.s();
        do {
            qb1Var.b(v9gVar.j());
        } while (v9gVar.a() < iA2);
        a(iA2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yib */
    public final void h0(efb efbVar, boolean z) throws yib {
        int iL;
        n75 n75Var = (n75) this.e;
        if ((this.b & 7) != 2) {
            throw ajb.g();
        }
        do {
            efbVar.add(z ? j0() : g0());
            if (n75Var.d()) {
                return;
            } else {
                iL = n75Var.l();
            }
        } while (iL == this.b);
        this.d = iL;
    }

    public final void i(flp flpVar) throws bj1 {
        int iR;
        int iR2;
        v9g v9gVar = (v9g) this.e;
        boolean z = flpVar instanceof wm1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    flpVar.add(Long.valueOf(v9gVar.k()));
                    if (v9gVar.b()) {
                        return;
                    } else {
                        iR = v9gVar.r();
                    }
                } while (iR == this.b);
                this.d = iR;
                return;
            }
            if (i2 != 2) {
                t3p.c();
                return;
            }
            int iA = v9gVar.a() + v9gVar.s();
            do {
                flpVar.add(Long.valueOf(v9gVar.k()));
            } while (v9gVar.a() < iA);
            a(iA);
            return;
        }
        wm1 wm1Var = (wm1) flpVar;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                wm1Var.a(v9gVar.k());
                if (v9gVar.b()) {
                    return;
                } else {
                    iR2 = v9gVar.r();
                }
            } while (iR2 == this.b);
            this.d = iR2;
            return;
        }
        if (i3 != 2) {
            t3p.c();
            return;
        }
        int iA2 = v9gVar.a() + v9gVar.s();
        do {
            wm1Var.a(v9gVar.k());
        } while (v9gVar.a() < iA2);
        a(iA2);
    }

    public final void i0(gfb gfbVar, boolean z) throws zib, yib {
        String strA;
        int iC;
        s75 s75Var = (s75) this.e;
        if ((this.b & 7) != 2) {
            throw cjb.g();
        }
        do {
            if (z) {
                q0(2);
                strA = s75Var.B();
            } else {
                q0(2);
                strA = s75Var.A();
            }
            gfbVar.add(strA);
            if (s75Var.g()) {
                return;
            } else {
                iC = s75Var.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    public final void j(flp flpVar) throws bj1 {
        int iR;
        int iR2;
        v9g v9gVar = (v9g) this.e;
        boolean z = flpVar instanceof qb1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iS = v9gVar.s();
                c(iS);
                int iA = v9gVar.a() + iS;
                do {
                    flpVar.add(Integer.valueOf(v9gVar.l()));
                } while (v9gVar.a() < iA);
                return;
            }
            if (i2 != 5) {
                t3p.c();
                return;
            }
            do {
                flpVar.add(Integer.valueOf(v9gVar.l()));
                if (v9gVar.b()) {
                    return;
                } else {
                    iR = v9gVar.r();
                }
            } while (iR == this.b);
            this.d = iR;
            return;
        }
        qb1 qb1Var = (qb1) flpVar;
        int i3 = i & 7;
        if (i3 == 2) {
            int iS2 = v9gVar.s();
            c(iS2);
            int iA2 = v9gVar.a() + iS2;
            do {
                qb1Var.b(v9gVar.l());
            } while (v9gVar.a() < iA2);
            return;
        }
        if (i3 != 5) {
            t3p.c();
            return;
        }
        do {
            qb1Var.b(v9gVar.l());
            if (v9gVar.b()) {
                return;
            } else {
                iR2 = v9gVar.r();
            }
        } while (iR2 == this.b);
        this.d = iR2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajb */
    public final String j0() throws zib, yib, ajb {
        q0(2);
        n75 n75Var = (n75) this.e;
        int i = n75Var.i();
        if (i > 0) {
            int i2 = n75Var.e;
            int i3 = n75Var.g;
            if (i <= i2 - i3) {
                String strI = mym.a.i(n75Var.d, i3, i);
                n75Var.g += i;
                return strI;
            }
        }
        if (i == 0) {
            return "";
        }
        if (i <= 0) {
            throw ajb.h();
        }
        throw ajb.j();
    }

    public final void k(flp flpVar) throws bj1 {
        int iR;
        int iR2;
        v9g v9gVar = (v9g) this.e;
        boolean z = flpVar instanceof wm1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    flpVar.add(Long.valueOf(v9gVar.m()));
                    if (v9gVar.b()) {
                        return;
                    } else {
                        iR = v9gVar.r();
                    }
                } while (iR == this.b);
                this.d = iR;
                return;
            }
            if (i2 != 2) {
                t3p.c();
                return;
            }
            int iS = v9gVar.s();
            d(iS);
            int iA = v9gVar.a() + iS;
            do {
                flpVar.add(Long.valueOf(v9gVar.m()));
            } while (v9gVar.a() < iA);
            return;
        }
        wm1 wm1Var = (wm1) flpVar;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                wm1Var.a(v9gVar.m());
                if (v9gVar.b()) {
                    return;
                } else {
                    iR2 = v9gVar.r();
                }
            } while (iR2 == this.b);
            this.d = iR2;
            return;
        }
        if (i3 != 2) {
            t3p.c();
            return;
        }
        int iS2 = v9gVar.s();
        d(iS2);
        int iA2 = v9gVar.a() + iS2;
        do {
            wm1Var.a(v9gVar.m());
        } while (v9gVar.a() < iA2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yib */
    public final void k0(efb efbVar) throws yib, ajb, cjb {
        int iL;
        int iL2;
        n75 n75Var = (n75) this.e;
        boolean z = efbVar instanceof mbb;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    efbVar.add(Integer.valueOf(n75Var.i()));
                    if (n75Var.d()) {
                        return;
                    } else {
                        iL = n75Var.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw ajb.g();
            }
            int iC = n75Var.c() + n75Var.i();
            do {
                efbVar.add(Integer.valueOf(n75Var.i()));
            } while (n75Var.c() < iC);
            p0(iC);
            return;
        }
        mbb mbbVar = (mbb) efbVar;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                mbbVar.addInt(n75Var.i());
                if (n75Var.d()) {
                    return;
                } else {
                    iL2 = n75Var.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i3 != 2) {
            throw ajb.g();
        }
        int iC2 = n75Var.c() + n75Var.i();
        do {
            mbbVar.addInt(n75Var.i());
        } while (n75Var.c() < iC2);
        p0(iC2);
    }

    public final void l(flp flpVar) throws bj1 {
        int iR;
        int iR2;
        v9g v9gVar = (v9g) this.e;
        boolean z = flpVar instanceof qb1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    flpVar.add(Integer.valueOf(v9gVar.n()));
                    if (v9gVar.b()) {
                        return;
                    } else {
                        iR = v9gVar.r();
                    }
                } while (iR == this.b);
                this.d = iR;
                return;
            }
            if (i2 != 2) {
                t3p.c();
                return;
            }
            int iA = v9gVar.a() + v9gVar.s();
            do {
                flpVar.add(Integer.valueOf(v9gVar.n()));
            } while (v9gVar.a() < iA);
            a(iA);
            return;
        }
        qb1 qb1Var = (qb1) flpVar;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                qb1Var.b(v9gVar.n());
                if (v9gVar.b()) {
                    return;
                } else {
                    iR2 = v9gVar.r();
                }
            } while (iR2 == this.b);
            this.d = iR2;
            return;
        }
        if (i3 != 2) {
            t3p.c();
            return;
        }
        int iA2 = v9gVar.a() + v9gVar.s();
        do {
            qb1Var.b(v9gVar.n());
        } while (v9gVar.a() < iA2);
        a(iA2);
    }

    public final void l0(gfb gfbVar) throws ajb, cjb {
        int iC;
        s75 s75Var = (s75) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                gfbVar.add(Integer.valueOf(s75Var.D()));
                if (s75Var.g()) {
                    return;
                } else {
                    iC = s75Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw cjb.g();
        }
        int iF = s75Var.f() + s75Var.D();
        do {
            gfbVar.add(Integer.valueOf(s75Var.D()));
        } while (s75Var.f() < iF);
        p0(iF);
    }

    public final void m(flp flpVar) throws bj1 {
        int iR;
        int iR2;
        v9g v9gVar = (v9g) this.e;
        boolean z = flpVar instanceof wm1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    flpVar.add(Long.valueOf(v9gVar.o()));
                    if (v9gVar.b()) {
                        return;
                    } else {
                        iR = v9gVar.r();
                    }
                } while (iR == this.b);
                this.d = iR;
                return;
            }
            if (i2 != 2) {
                t3p.c();
                return;
            }
            int iA = v9gVar.a() + v9gVar.s();
            do {
                flpVar.add(Long.valueOf(v9gVar.o()));
            } while (v9gVar.a() < iA);
            a(iA);
            return;
        }
        wm1 wm1Var = (wm1) flpVar;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                wm1Var.a(v9gVar.o());
                if (v9gVar.b()) {
                    return;
                } else {
                    iR2 = v9gVar.r();
                }
            } while (iR2 == this.b);
            this.d = iR2;
            return;
        }
        if (i3 != 2) {
            t3p.c();
            return;
        }
        int iA2 = v9gVar.a() + v9gVar.s();
        do {
            wm1Var.a(v9gVar.o());
        } while (v9gVar.a() < iA2);
        a(iA2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yib */
    public final void m0(efb efbVar) throws yib, ajb, cjb {
        int iL;
        int iL2;
        n75 n75Var = (n75) this.e;
        boolean z = efbVar instanceof l0d;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    efbVar.add(Long.valueOf(n75Var.j()));
                    if (n75Var.d()) {
                        return;
                    } else {
                        iL = n75Var.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw ajb.g();
            }
            int iC = n75Var.c() + n75Var.i();
            do {
                efbVar.add(Long.valueOf(n75Var.j()));
            } while (n75Var.c() < iC);
            p0(iC);
            return;
        }
        l0d l0dVar = (l0d) efbVar;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                l0dVar.addLong(n75Var.j());
                if (n75Var.d()) {
                    return;
                } else {
                    iL2 = n75Var.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i3 != 2) {
            throw ajb.g();
        }
        int iC2 = n75Var.c() + n75Var.i();
        do {
            l0dVar.addLong(n75Var.j());
        } while (n75Var.c() < iC2);
        p0(iC2);
    }

    public final void n(flp flpVar) throws bj1 {
        int iR;
        int iR2;
        v9g v9gVar = (v9g) this.e;
        boolean z = flpVar instanceof qb1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    flpVar.add(Integer.valueOf(v9gVar.s()));
                    if (v9gVar.b()) {
                        return;
                    } else {
                        iR = v9gVar.r();
                    }
                } while (iR == this.b);
                this.d = iR;
                return;
            }
            if (i2 != 2) {
                t3p.c();
                return;
            }
            int iA = v9gVar.a() + v9gVar.s();
            do {
                flpVar.add(Integer.valueOf(v9gVar.s()));
            } while (v9gVar.a() < iA);
            a(iA);
            return;
        }
        qb1 qb1Var = (qb1) flpVar;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                qb1Var.b(v9gVar.s());
                if (v9gVar.b()) {
                    return;
                } else {
                    iR2 = v9gVar.r();
                }
            } while (iR2 == this.b);
            this.d = iR2;
            return;
        }
        if (i3 != 2) {
            t3p.c();
            return;
        }
        int iA2 = v9gVar.a() + v9gVar.s();
        do {
            qb1Var.b(v9gVar.s());
        } while (v9gVar.a() < iA2);
        a(iA2);
    }

    public final void n0(gfb gfbVar) throws ajb, cjb {
        int iC;
        s75 s75Var = (s75) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                gfbVar.add(Long.valueOf(s75Var.E()));
                if (s75Var.g()) {
                    return;
                } else {
                    iC = s75Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw cjb.g();
        }
        int iF = s75Var.f() + s75Var.D();
        do {
            gfbVar.add(Long.valueOf(s75Var.E()));
        } while (s75Var.f() < iF);
        p0(iF);
    }

    public final void o(flp flpVar) throws bj1 {
        int iR;
        int iR2;
        v9g v9gVar = (v9g) this.e;
        boolean z = flpVar instanceof wm1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    flpVar.add(Long.valueOf(v9gVar.t()));
                    if (v9gVar.b()) {
                        return;
                    } else {
                        iR = v9gVar.r();
                    }
                } while (iR == this.b);
                this.d = iR;
                return;
            }
            if (i2 != 2) {
                t3p.c();
                return;
            }
            int iA = v9gVar.a() + v9gVar.s();
            do {
                flpVar.add(Long.valueOf(v9gVar.t()));
            } while (v9gVar.a() < iA);
            a(iA);
            return;
        }
        wm1 wm1Var = (wm1) flpVar;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                wm1Var.a(v9gVar.t());
                if (v9gVar.b()) {
                    return;
                } else {
                    iR2 = v9gVar.r();
                }
            } while (iR2 == this.b);
            this.d = iR2;
            return;
        }
        if (i3 != 2) {
            t3p.c();
            return;
        }
        int iA2 = v9gVar.a() + v9gVar.s();
        do {
            wm1Var.a(v9gVar.t());
        } while (v9gVar.a() < iA2);
        a(iA2);
    }

    public final synchronized void o0(tr3 tr3Var) {
        while (tr3Var != null) {
            h01[] h01VarArr = (h01[]) this.e;
            int i = this.d;
            this.d = i + 1;
            h01 h01Var = (h01) tr3Var.c;
            h01Var.getClass();
            h01VarArr[i] = h01Var;
            this.c--;
            tr3Var = (tr3) tr3Var.d;
            if (tr3Var == null || ((h01) tr3Var.c) == null) {
                tr3Var = null;
            }
        }
        notifyAll();
    }

    public final void p(int i) {
        int[] iArr = (int[]) this.e;
        int i2 = this.c;
        iArr[i2] = i;
        int i3 = (i2 + 1) & this.d;
        this.c = i3;
        int i4 = this.b;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            if (i6 < 0) {
                h9o.r("Max array capacity exceeded");
                return;
            }
            int[] iArr2 = new int[i6];
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy((int[]) this.e, 0, iArr2, i5, this.b);
            this.e = iArr2;
            this.b = 0;
            this.c = length;
            this.d = i6 - 1;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajb */
    public final void p0(int i) throws ajb, cjb {
        switch (this.a) {
            case 1:
                if (((n75) this.e).c() != i) {
                    throw ajb.j();
                }
                return;
            default:
                if (((s75) this.e).f() != i) {
                    throw cjb.j();
                }
                return;
        }
    }

    public final synchronized h01 q() {
        h01 h01Var;
        int i = this.c + 1;
        this.c = i;
        int i2 = this.d;
        if (i2 > 0) {
            h01[] h01VarArr = (h01[]) this.e;
            int i3 = i2 - 1;
            this.d = i3;
            h01Var = h01VarArr[i3];
            h01Var.getClass();
            ((h01[]) this.e)[this.d] = null;
        } else {
            h01 h01Var2 = new h01(new byte[65536], 0);
            h01[] h01VarArr2 = (h01[]) this.e;
            if (i > h01VarArr2.length) {
                this.e = (h01[]) Arrays.copyOf(h01VarArr2, h01VarArr2.length << 1);
            }
            h01Var = h01Var2;
        }
        return h01Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yib */
    public final void q0(int i) throws zib, yib {
        switch (this.a) {
            case 1:
                if ((this.b & 7) != i) {
                    throw ajb.g();
                }
                return;
            default:
                if ((this.b & 7) != i) {
                    throw cjb.g();
                }
                return;
        }
    }

    public final nyi r(int i) {
        return new nyi(i, xgh.n((njl) this.e, i));
    }

    public final synchronized void r0(int i) {
        boolean z = i < this.b;
        this.b = i;
        if (z) {
            t0();
        }
    }

    public final void s() {
        View view = (View) this.e;
        int top = this.d - (view.getTop() - this.b);
        WeakHashMap weakHashMap = r5n.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.c));
    }

    public final boolean s0() {
        int i;
        s75 s75Var = (s75) this.e;
        if (s75Var.g() || (i = this.b) == this.c) {
            return false;
        }
        return s75Var.F(i);
    }

    public final u67 t() {
        z4o.w(this.c <= this.d);
        return new u67(this);
    }

    public final synchronized void t0() {
        int iMax = Math.max(0, tym.g(this.b, 65536) - this.c);
        int i = this.d;
        if (iMax >= i) {
            return;
        }
        Arrays.fill((h01[]) this.e, iMax, i, (Object) null);
        this.d = iMax;
    }

    public final String toString() {
        switch (this.a) {
            case 5:
                return "";
            case 8:
                int i = this.b;
                njl njlVar = (njl) this.e;
                hyh hyhVarN = xgh.n(njlVar, i);
                int i2 = this.c;
                hyh hyhVarN2 = xgh.n(njlVar, i2);
                int i3 = this.d;
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                sb.append(i);
                sb.append("-");
                sb.append(hyhVarN);
                sb.append(",");
                sb.append(i2);
                sb.append("-");
                sb.append(hyhVarN2);
                sb.append("), prevOffset=");
                return p3p.k(i3, ")", sb);
            default:
                return super.toString();
        }
    }

    public final int v() {
        return this.d - this.c;
    }

    public final int w() {
        switch (this.a) {
            case 1:
                int iL = this.d;
                if (iL != 0) {
                    this.b = iL;
                    this.d = 0;
                } else {
                    iL = ((n75) this.e).l();
                    this.b = iL;
                }
                if (iL == 0 || iL == this.c) {
                    return Integer.MAX_VALUE;
                }
                return iL >>> 3;
            default:
                int iC = this.d;
                if (iC != 0) {
                    this.b = iC;
                    this.d = 0;
                } else {
                    iC = ((s75) this.e).C();
                    this.b = iC;
                }
                if (iC == 0 || iC == this.c) {
                    return Integer.MAX_VALUE;
                }
                return iC >>> 3;
        }
    }

    public final int x(int i) {
        return ((erf) this.e).k[this.c + i];
    }

    public final Object y(int i) {
        return ((erf) this.e).m[this.d + i];
    }

    public final void z(Object obj, zmi zmiVar, xk8 xk8Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            zmiVar.d(obj, this, xk8Var);
            if (this.b == this.c) {
            } else {
                throw ajb.i();
            }
        } finally {
            this.c = i;
        }
    }
}
