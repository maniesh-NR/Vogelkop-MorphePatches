package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import io.sentry.Breadcrumb;
import java.io.File;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class i41 {
    public static mra i;
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final ue5 b = new ue5(-1554737461, new bf5((byte) 8), false);
    public static final cb3 c = new cb3();
    public static final int[] d = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    public static final int[] e = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] f = {3, 6};
    public static final int[] g = {1, 2, 4, 5, 7, 8};
    public static final Object h = new Object();
    public static final o91 j = new o91(1022);
    public static final eko k = new eko(13);

    public static final int B(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    public static void E(int i2, uo5 uo5Var, n5h n5hVar, boolean z) {
        eo5 eo5Var;
        eo5 eo5Var2;
        boolean z2;
        eo5 eo5Var3;
        eo5 eo5Var4;
        if (uo5Var.l) {
            return;
        }
        if (!(uo5Var instanceof vo5) && uo5Var.w() && h(uo5Var)) {
            vo5.Q(uo5Var, n5hVar, new cb3());
        }
        eo5 eo5VarI = uo5Var.i(2);
        eo5 eo5VarI2 = uo5Var.i(4);
        int iD = eo5VarI.d();
        int iD2 = eo5VarI2.d();
        HashSet hashSet = eo5VarI.a;
        if (hashSet != null && eo5VarI.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                eo5 eo5Var5 = (eo5) it.next();
                uo5 uo5Var2 = eo5Var5.d;
                int i3 = i2 + 1;
                boolean zH = h(uo5Var2);
                eo5 eo5Var6 = uo5Var2.H;
                eo5 eo5Var7 = uo5Var2.J;
                if (uo5Var2.w() && zH) {
                    z2 = true;
                    vo5.Q(uo5Var2, n5hVar, new cb3());
                } else {
                    z2 = true;
                }
                boolean z3 = ((eo5Var5 == eo5Var6 && (eo5Var4 = eo5Var7.f) != null && eo5Var4.c) || (eo5Var5 == eo5Var7 && (eo5Var3 = eo5Var6.f) != null && eo5Var3.c)) ? z2 : false;
                int i4 = uo5Var2.o0[0];
                if (i4 != 3 || zH) {
                    if (!uo5Var2.w()) {
                        if (eo5Var5 == eo5Var6 && eo5Var7.f == null) {
                            int iE = eo5Var6.e() + iD;
                            uo5Var2.E(iE, uo5Var2.n() + iE);
                            E(i3, uo5Var2, n5hVar, z);
                        } else if (eo5Var5 == eo5Var7 && eo5Var6.f == null) {
                            int iE2 = iD - eo5Var7.e();
                            uo5Var2.E(iE2 - uo5Var2.n(), iE2);
                            E(i3, uo5Var2, n5hVar, z);
                        } else if (z3 && !uo5Var2.u()) {
                            k0(i3, uo5Var2, n5hVar, z);
                        }
                    }
                } else if (i4 == 3 && uo5Var2.u >= 0 && uo5Var2.t >= 0 && (uo5Var2.f0 == 8 || (uo5Var2.q == 0 && uo5Var2.V == 0.0f))) {
                    if (!uo5Var2.u() && !uo5Var2.E && z3 && !uo5Var2.u()) {
                        l0(i3, uo5Var, n5hVar, uo5Var2, z);
                    }
                }
            }
        }
        if (uo5Var instanceof r5a) {
            return;
        }
        HashSet hashSet2 = eo5VarI2.a;
        if (hashSet2 != null && eo5VarI2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                eo5 eo5Var8 = (eo5) it2.next();
                uo5 uo5Var3 = eo5Var8.d;
                int i5 = i2 + 1;
                boolean zH2 = h(uo5Var3);
                eo5 eo5Var9 = uo5Var3.H;
                eo5 eo5Var10 = uo5Var3.J;
                if (uo5Var3.w() && zH2) {
                    vo5.Q(uo5Var3, n5hVar, new cb3());
                }
                boolean z4 = (eo5Var8 == eo5Var9 && (eo5Var2 = eo5Var10.f) != null && eo5Var2.c) || (eo5Var8 == eo5Var10 && (eo5Var = eo5Var9.f) != null && eo5Var.c);
                int i6 = uo5Var3.o0[0];
                if (i6 != 3 || zH2) {
                    if (!uo5Var3.w()) {
                        if (eo5Var8 == eo5Var9 && eo5Var10.f == null) {
                            int iE3 = eo5Var9.e() + iD2;
                            uo5Var3.E(iE3, uo5Var3.n() + iE3);
                            E(i5, uo5Var3, n5hVar, z);
                        } else if (eo5Var8 == eo5Var10 && eo5Var9.f == null) {
                            int iE4 = iD2 - eo5Var10.e();
                            uo5Var3.E(iE4 - uo5Var3.n(), iE4);
                            E(i5, uo5Var3, n5hVar, z);
                        } else if (z4 && !uo5Var3.u()) {
                            k0(i5, uo5Var3, n5hVar, z);
                        }
                    }
                } else if (i6 == 3 && uo5Var3.u >= 0 && uo5Var3.t >= 0 && (uo5Var3.f0 == 8 || (uo5Var3.q == 0 && uo5Var3.V == 0.0f))) {
                    if (!uo5Var3.u() && !uo5Var3.E && z4 && !uo5Var3.u()) {
                        l0(i5, uo5Var, n5hVar, uo5Var3, z);
                    }
                }
            }
        }
        uo5Var.l = true;
    }

    public static final boolean G(fmg fmgVar, long j2) {
        Object obj;
        List list = fmgVar.a;
        int size = list.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (k1g.s(((lmg) obj).a, j2)) {
                break;
            }
            i2++;
        }
        lmg lmgVar = (lmg) obj;
        if (lmgVar != null && lmgVar.d) {
            z = true;
        }
        return !z;
    }

    public static final Path H(float f2) {
        float f3 = f2 / 10.0f;
        Path pathS = oup.S("M0 5C0 2.64298 0 1.46447 0.732233 0.732233C1.46447 0 2.64298 0 5 0C7.35702 0 8.53553 0 9.26777 0.732233C10 1.46447 10 2.64298 10 5C10 7.35702 10 8.53553 9.26777 9.26777C8.53553 10 7.35702 10 5 10C2.64298 10 1.46447 10 0.732233 9.26777C0 8.53553 0 7.35702 0 5Z");
        Matrix matrix = new Matrix();
        matrix.setScale(f3, f3);
        pathS.transform(matrix);
        return pathS;
    }

    public static final Path I(float f2) {
        float f3 = f2 / 10.0f;
        Path pathS = oup.S("M5,0C1,0 0,1 0,5s1,5 5,5s5-1 5-5S9,0 5,0L5,0z");
        Matrix matrix = new Matrix();
        matrix.setScale(f3, f3);
        pathS.transform(matrix);
        return pathS;
    }

    public static void J(float[] fArr, float[] fArr2) {
        float f2 = fArr2[20];
        float f3 = fArr2[19];
        float f4 = fArr2[21];
        float f5 = fArr2[22];
        fArr[13] = f2;
        fArr[12] = f3;
        fArr[14] = f4;
        fArr[15] = f5;
    }

    public static void K(float[] fArr, float[] fArr2) {
        float f2 = fArr2[108];
        float f3 = fArr2[109];
        float f4 = fArr2[110];
        fArr[9] = f2;
        fArr[8] = f3;
        fArr[16] = f4;
    }

    public static void L(float[] fArr, float[] fArr2) {
        float f2 = fArr2[106];
        float f3 = fArr2[107];
        fArr[10] = f2;
        fArr[11] = f3;
    }

    public static void M(float[] fArr, float[] fArr2) {
        float f2 = fArr2[96];
        float f3 = fArr2[97];
        float f4 = fArr2[99];
        float f5 = fArr2[100];
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
    }

    public static void N(float[] fArr, float[] fArr2) {
        float f2 = fArr2[15];
        float f3 = fArr2[16];
        fArr[14] = f2 < -0.5f ? 1.0f : 0.0f;
        fArr[15] = f2 > 0.5f ? 1.0f : 0.0f;
        fArr[12] = f3 < -0.5f ? 1.0f : 0.0f;
        fArr[13] = f3 > 0.5f ? 1.0f : 0.0f;
    }

    public static void O(float[] fArr, float[] fArr2) {
        float f2 = fArr2[23];
        float f3 = fArr2[22];
        fArr[6] = f2;
        fArr[7] = f3;
    }

    public static void Q(float[] fArr, float[] fArr2) {
        float f2 = fArr2[102];
        float f3 = fArr2[103];
        fArr[4] = f2;
        fArr[5] = f3;
    }

    public static void R(float[] fArr, float[] fArr2) {
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
    }

    public static void S(float[] fArr, float[] fArr2) {
        fArr[2] = fArr2[11];
        fArr[3] = fArr2[14];
    }

    public static final void T(h6c h6cVar, ad2 ad2Var, Function1 function1, Function1 function12, Function1 function13, Function2 function2, Function1 function14) {
        if (ad2Var instanceof yc2) {
            g3e g3eVar = (g3e) ((yc2) ad2Var).a;
            g1b g1bVar = g3eVar.a;
            g1b g1bVar2 = g3eVar.b;
            g1b g1bVar3 = g3eVar.c;
            if (!g1bVar.isEmpty()) {
                h6c.O(h6cVar, "banners", new ue5(1931026015, new f23(g3eVar, function2, function14), true), 2);
            }
            if (g1bVar2.isEmpty() && g1bVar3.isEmpty()) {
                h6c.O(h6cVar, "empty", c09.b, 2);
                return;
            }
            h58 h58Var = jk8.c;
            h6cVar.P(g1bVar2.size(), new oda(new nf8((byte) 16), g1bVar2, (byte) 3), new oda(g1bVar2, (byte) 4), new ue5(2039820996, new t2e(g1bVar2, h58Var, function1, function12, function13, (byte) 0), true));
            if (g1bVar3.isEmpty()) {
                return;
            }
            h6c.O(h6cVar, "completed-header", c09.c, 2);
            h6cVar.P(g1bVar3.size(), new oda(new nf8((byte) 17), g1bVar3, (byte) 5), new oda(g1bVar3, (byte) 6), new ue5(2039820996, new t2e(g1bVar3, h58Var, function1, function12, function13, (byte) 1), true));
        }
    }

    public static final c8e U(c8e c8eVar, float f2, float f3) {
        return c8eVar.d(new a9f(f2, f3, new w5f((byte) 3)));
    }

    public static c8e V(c8e c8eVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return U(c8eVar, f2, f3);
    }

    public static final k5o X(CharSequence charSequence, String str, int i2, Function1 function1) {
        char cCharAt = charSequence.charAt(i2);
        if (((Boolean) function1.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return Y(charSequence, "Expected " + str + ", but got '" + cCharAt + "' at position " + i2);
    }

    public static final k5o Y(CharSequence charSequence, String str) {
        StringBuilder sbR = p3p.r(str, " when parsing an Instant from \"");
        sbR.append(q0(64, charSequence));
        sbR.append('\"');
        return new k5o(sbR.toString(), charSequence, (byte) 19);
    }

    public static final int Z(int i2, CharSequence charSequence) {
        return (charSequence.charAt(i2 + 1) - '0') + ((charSequence.charAt(i2) - '0') * 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final sd2 sd2Var, final String str, final c8e c8eVar, final td3 td3Var, final kr5 kr5Var, final kh3 kh3Var, ih5 ih5Var, final int i2, final int i3) throws Throwable {
        int i4;
        kh3 kh3Var2;
        int i5;
        Throwable th;
        bza bzaVar;
        rd2 rd2Var;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1236588022);
        if ((i2 & 6) == 0) {
            i4 = (vt9Var.f(sd2Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= vt9Var.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= vt9Var.f(c8eVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i4 |= vt9Var.h(od2.u) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= vt9Var.h(null) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= vt9Var.f(td3Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= vt9Var.f(kr5Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= vt9Var.c(1.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            kh3Var2 = kh3Var;
            i4 |= vt9Var.f(kh3Var2) ? 67108864 : 33554432;
        } else {
            kh3Var2 = kh3Var;
        }
        if ((805306368 & i2) == 0) {
            i4 |= vt9Var.d(1) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (vt9Var.g(true) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if (vt9Var.N(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            Object obj = sd2Var.a;
            int i6 = kzm.b;
            vt9Var.W(-329318062);
            boolean z = obj instanceof bza;
            Object obj2 = hh5.a;
            if (z) {
                vt9Var.W(-1008942344);
                bzaVar = (bza) obj;
                if (bzaVar.p.d != null) {
                    vt9Var.W(-1008902292);
                    vt9Var.p(false);
                    vt9Var.p(false);
                } else {
                    vt9Var.W(-1008854118);
                    opj opjVarA = kzm.a(kr5Var, vt9Var);
                    boolean zF = vt9Var.f(obj) | vt9Var.f(opjVarA);
                    Object objK = vt9Var.K();
                    if (zF || objK == obj2) {
                        yya yyaVarA = bza.a(bzaVar);
                        yyaVarA.i = opjVarA;
                        objK = yyaVarA.a();
                        vt9Var.g0(objK);
                    }
                    bzaVar = (bza) objK;
                    vt9Var.p(false);
                    vt9Var.p(false);
                }
                vt9Var.p(false);
                th = null;
            } else {
                vt9Var.W(-1008595950);
                Context context = (Context) vt9Var.j(j41.b);
                opj opjVarA2 = kzm.a(kr5Var, vt9Var);
                boolean zF2 = vt9Var.f(context) | vt9Var.f(obj) | vt9Var.f(opjVarA2);
                th = null;
                Object objK2 = vt9Var.K();
                if (zF2 || objK2 == obj2) {
                    yya yyaVar = new yya(context);
                    yyaVar.c = obj;
                    yyaVar.i = opjVarA2;
                    objK2 = yyaVar.a();
                    vt9Var.g0(objK2);
                }
                bzaVar = (bza) objK2;
                vt9Var.p(false);
                vt9Var.p(false);
            }
            Object obj3 = bzaVar.b;
            if (obj3 instanceof yya) {
                qp2.o("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
                return;
            }
            if (obj3 instanceof j71) {
                kzm.c("ImageBitmap");
                throw th;
            }
            if (obj3 instanceof yza) {
                kzm.c("ImageVector");
                throw th;
            }
            if (obj3 instanceof hyf) {
                kzm.c("Painter");
                throw th;
            }
            if (bzaVar.c != null) {
                qp2.o("request.target must be null.");
                return;
            }
            if (((tcc) xf8.J(bzaVar, eza.e)) != null) {
                qp2.o("request.lifecycle must be null.");
                return;
            }
            xxa xxaVar = sd2Var.c;
            hd2 hd2Var = sd2Var.b;
            if (((Boolean) vt9Var.j(cab.a)).booleanValue()) {
                vt9Var.W(2019030948);
                rd2 rd2Var2 = (rd2) vt9Var.j(otc.a);
                vt9Var.p(false);
                rd2Var = rd2Var2;
            } else {
                vt9Var.W(2019088453);
                vt9Var.p(false);
                rd2Var = th;
            }
            c8e c8eVarD = c8eVar.d(new fr5(bzaVar, xxaVar, hd2Var, td3Var, kr5Var, kh3Var2, rd2Var, str));
            m51 m51Var = m51.k;
            int iHashCode = Long.hashCode(vt9Var.T);
            c8e c8eVarP = qyn.P(vt9Var, c8eVarD);
            oag oagVarL = vt9Var.l();
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, m51Var, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: gd2
                public final Object invoke(Object obj4, Object obj5) throws Throwable {
                    ((Integer) obj5).getClass();
                    i41.a(sd2Var, str, c8eVar, td3Var, kr5Var, kh3Var, (ih5) obj4, aoh.m(i2 | 1), aoh.m(i3));
                    return Unit.a;
                }
            };
        }
    }

    public static final ebb a0(ebb ebbVar, long j2, ci6 ci6Var) {
        long j3;
        try {
            j3 = j2;
        } catch (ArithmeticException unused) {
            j3 = j2;
        } catch (IllegalArgumentException unused2) {
            j3 = j2;
        }
        try {
            rr3 rr3VarR0 = o0g.r0(j3, ci6Var.d, 1000000000L);
            long j4 = rr3VarR0.b;
            long j5 = rr3VarR0.c;
            on7 on7Var = pn7.b;
            return ebbVar.h(cs5.y0(j4, un7.e)).h(cs5.y0(j5, un7.b));
        } catch (ArithmeticException unused3) {
            ebb ebbVar2 = ebb.c;
            return j06.n(j3 > 0 ? Long.MAX_VALUE : Long.MIN_VALUE, 0L);
        } catch (IllegalArgumentException unused4) {
            ebb ebbVar3 = ebb.c;
            return j06.n(j3 > 0 ? Long.MAX_VALUE : Long.MIN_VALUE, 0L);
        }
    }

    public static final void b(i2e i2eVar, ih5 ih5Var, int i2) {
        i2e i2eVar2;
        vt9 vt9Var;
        byte b2;
        zpa zpaVar;
        c2e c2eVar;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-1645112465);
        int i3 = i2 | (vt9Var2.f(i2eVar) ? 4 : 2);
        if (vt9Var2.N(i3 & 1, (i3 & 3) != 2)) {
            q2e q2eVar = (q2e) i2eVar;
            c2e c2eVar2 = (c2e) dyg.h(q2eVar.k, vt9Var2).getValue();
            zpa zpaVar2 = hh5.a;
            if (c2eVar2 == null) {
                vt9Var2.W(326526423);
                vt9Var2.p(false);
                zpaVar = zpaVar2;
                b2 = 14;
            } else {
                vt9Var2.W(326526424);
                boolean z = (i3 & 14) == 4;
                Object objK = vt9Var2.K();
                if (z || objK == zpaVar2) {
                    zpaVar = zpaVar2;
                    c2eVar = c2eVar2;
                    b2 = 14;
                    obc obcVar = new obc(0, i2eVar, i2e.class, "onMissionInfoDismissed", "onMissionInfoDismissed()V", 0, (byte) 27);
                    vt9Var2.g0(obcVar);
                    objK = obcVar;
                } else {
                    c2eVar = c2eVar2;
                    zpaVar = zpaVar2;
                    b2 = 14;
                }
                mkh.c(c2eVar, (mtb) objK, vt9Var2, 0);
                vt9Var2.p(false);
            }
            sek sekVar = (sek) dyg.h(q2eVar.m, vt9Var2).getValue();
            if (sekVar == null) {
                vt9Var2.W(326782111);
                vt9Var2.p(false);
                i2eVar2 = i2eVar;
                vt9Var = vt9Var2;
            } else {
                vt9Var2.W(326782112);
                int i4 = i3 & 14;
                boolean z2 = i4 == 4;
                Object objK2 = vt9Var2.K();
                if (z2 || objK2 == zpaVar) {
                    obc obcVar2 = new obc(0, i2eVar, i2e.class, "onStreakClaimDismissed", "onStreakClaimDismissed()V", 0, (byte) 28);
                    vt9Var2.g0(obcVar2);
                    objK2 = obcVar2;
                }
                Function0 function0 = (mtb) objK2;
                boolean z3 = i4 == 4;
                Object objK3 = vt9Var2.K();
                if (z3 || objK3 == zpaVar) {
                    obc obcVar3 = new obc(0, i2eVar, i2e.class, "onStreakClaimRetry", "onStreakClaimRetry()V", 0, (byte) 29);
                    i2eVar2 = i2eVar;
                    vt9Var2.g0(obcVar3);
                    objK3 = obcVar3;
                } else {
                    i2eVar2 = i2eVar;
                }
                vt9Var = vt9Var2;
                kfo.p(sekVar, function0, (mtb) objK3, vt9Var, 0, 0);
                vt9Var.p(false);
            }
        } else {
            i2eVar2 = i2eVar;
            vt9Var = vt9Var2;
            b2 = 14;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new a7b(i2eVar2, i2, b2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: oye */
    public static final ebb b0(ebb ebbVar, long j2, di6 di6Var, ypl yplVar) throws oye {
        try {
            if (di6Var instanceof wh6) {
                wxm wxmVarL = hyg.l(ebbVar, yplVar);
                ztc ztcVarO0 = o0(ebbVar, wxmVarL);
                Instant instant = ZonedDateTime.ofLocal(new ztc(vtc.a(ztcVarO0.d(), j2, (wh6) di6Var), new rvc(ztcVarO0.a.toLocalTime())).a, yplVar.a, wxmVarL.a).toInstant();
                ebb ebbVar2 = ebb.c;
                return j06.n(instant.getEpochSecond(), instant.getNano());
            }
            if (!(di6Var instanceof ci6)) {
                throw new oye();
            }
            o0(ebbVar, hyg.l(ebbVar, yplVar));
            ebb ebbVarA0 = a0(ebbVar, j2, (ci6) di6Var);
            o0(ebbVarA0, hyg.l(ebbVarA0, yplVar));
            return ebbVarA0;
        } catch (ArithmeticException e2) {
            throw new e22("Arithmetic overflow when adding to an Instant", e2);
        } catch (IllegalArgumentException e3) {
            throw new e22("Boundaries of Instant exceeded when adding a value", e3);
        }
    }

    public static void c(String str) {
        mra mraVar;
        synchronized (h) {
            mraVar = i;
        }
        if (mraVar == null) {
            return;
        }
        Breadcrumb breadcrumb = new Breadcrumb();
        Set set = c9e.a;
        breadcrumb.setMessage(pik.D(4096, str.replace('\n', ' ')));
        breadcrumb.setCategory("ui.event");
        mraVar.addBreadcrumb(breadcrumb);
    }

    public static final float c0(u5n u5nVar, int i2) {
        return i2 == 2 ? u5nVar.f() * 0.0069444445f : u5nVar.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00be, code lost:
    
        if (defpackage.y8f.b(defpackage.wxe.T(r11, true), 0) == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005c -> B:21:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.uuk r17, long r18, nt5 r20) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i41.d(uuk, long, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x067a, code lost:
    
        if (defpackage.y8f.c(defpackage.wxe.T(r5, true)) == 0.0f) goto L185;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:133:0x050b, B:120:0x04de], limit reached: 226 */
    /* JADX WARN: Path cross not found for [B:133:0x050b, B:122:0x04e4], limit reached: 226 */
    /* JADX WARN: Path cross not found for [B:183:0x066e, B:174:0x064a], limit reached: 226 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0637 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0416 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x059f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0420  */
    /* JADX WARN: Type inference failed for: r12v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v3, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x044b -> B:151:0x05a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0455 -> B:108:0x046c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x0584 -> B:146:0x058a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x059f -> B:151:0x05a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x0604 -> B:162:0x0607). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x022e -> B:30:0x022f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x02f5 -> B:30:0x022f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0321 -> B:71:0x0387). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0373 -> B:68:0x037c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x040e -> B:84:0x03be). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d0(defpackage.uuk r26, defpackage.lmg r27, ki5 r28, j04 r29, a7b r30, defpackage.a1d r31, wg5 r32, z53 r33) {
        /*
            Method dump skipped, instructions count: 1750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i41.d0(uuk, lmg, ki5, j04, a7b, a1d, wg5, z53):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [pqh] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.uuk r9, long r10, nt5 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.dj7
            if (r0 == 0) goto L13
            r0 = r12
            dj7 r0 = (defpackage.dj7) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            dj7 r0 = new dj7
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.w
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            lqh r9 = r0.v
            pqh r10 = r0.u
            lmg r11 = r0.t
            defpackage.ybh.y(r12)     // Catch: defpackage.hmg -> La4
            goto L97
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r9)
            return r4
        L34:
            defpackage.ybh.y(r12)
            vuk r12 = r9.f
            fmg r12 = r12.s
            boolean r12 = G(r12, r10)
            if (r12 != 0) goto La3
            vuk r12 = r9.f
            fmg r12 = r12.s
            java.util.List r12 = r12.a
            r2 = r12
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r5 = 0
        L4f:
            if (r5 >= r2) goto L63
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            lmg r7 = (defpackage.lmg) r7
            long r7 = r7.a
            boolean r7 = defpackage.k1g.s(r7, r10)
            if (r7 != 0) goto L64
            int r5 = r5 + 1
            goto L4f
        L63:
            r6 = r4
        L64:
            r11 = r6
            lmg r11 = (defpackage.lmg) r11
            if (r11 == 0) goto La3
            pqh r10 = new pqh
            r10.<init>()
            pqh r12 = new pqh
            r12.<init>()
            r12.a = r11
            u5n r2 = r9.f()
            long r5 = r2.b()
            lqh r2 = new lqh     // Catch: defpackage.hmg -> La4
            r2.<init>()     // Catch: defpackage.hmg -> La4
            ej7 r7 = new ej7     // Catch: defpackage.hmg -> La4
            r7.<init>(r2, r12, r10, r4)     // Catch: defpackage.hmg -> La4
            r0.t = r11     // Catch: defpackage.hmg -> La4
            r0.u = r10     // Catch: defpackage.hmg -> La4
            r0.v = r2     // Catch: defpackage.hmg -> La4
            r0.x = r3     // Catch: defpackage.hmg -> La4
            java.lang.Object r9 = r9.h(r5, r7, r0)     // Catch: defpackage.hmg -> La4
            if (r9 != r1) goto L96
            return r1
        L96:
            r9 = r2
        L97:
            boolean r9 = r9.a     // Catch: defpackage.hmg -> La4
            if (r9 == 0) goto La3
            java.lang.Object r9 = r10.a     // Catch: defpackage.hmg -> La4
            lmg r9 = (defpackage.lmg) r9     // Catch: defpackage.hmg -> La4
            if (r9 != 0) goto La2
            return r11
        La2:
            return r9
        La3:
            return r4
        La4:
            java.lang.Object r9 = r10.a
            lmg r9 = (defpackage.lmg) r9
            if (r9 == 0) goto Lab
            r11 = r9
        Lab:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i41.e(uuk, long, nt5):java.lang.Object");
    }

    public static Object e0(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0153 -> B:57:0x0159). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.uuk r18, long r19, nqi r21, z53 r22) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i41.f(uuk, long, nqi, z53):java.lang.Object");
    }

    public static final void f0(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final Object g(f17 f17Var, Function0 function0, nt5 nt5Var) throws pxb {
        Object obj;
        wye wyeVarD0;
        Object objD0;
        tah tahVar;
        if (!((b8e) f17Var).a.n) {
            return Unit.a;
        }
        b8e b8eVar = (b8e) f17Var;
        if (!b8eVar.a.n) {
            a8b.b("visitAncestors called on an unattached node");
        }
        b8e b8eVar2 = b8eVar.a.e;
        m3c m3cVarE0 = ui6.e0(f17Var);
        loop0: while (true) {
            obj = null;
            if (m3cVarE0 == null) {
                break;
            }
            if ((((b8e) m3cVarE0.F.g).d & 524288) != 0) {
                while (b8eVar2 != null) {
                    if ((b8eVar2.c & 524288) != 0) {
                        b8e b8eVarU = b8eVar2;
                        dfe dfeVar = null;
                        while (b8eVarU != null) {
                            if (b8eVarU instanceof ms3) {
                                obj = b8eVarU;
                                break loop0;
                            }
                            if ((b8eVarU.c & 524288) != 0 && (b8eVarU instanceof i17)) {
                                int i2 = 0;
                                for (b8e b8eVar3 = ((i17) b8eVarU).p; b8eVar3 != null; b8eVar3 = b8eVar3.f) {
                                    if ((b8eVar3.c & 524288) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            b8eVarU = b8eVar3;
                                        } else {
                                            if (dfeVar == null) {
                                                dfeVar = new dfe(new b8e[16]);
                                            }
                                            if (b8eVarU != null) {
                                                dfeVar.c(b8eVarU);
                                                b8eVarU = null;
                                            }
                                            dfeVar.c(b8eVar3);
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            b8eVarU = ui6.U(dfeVar);
                        }
                    }
                    b8eVar2 = b8eVar2.e;
                }
            }
            m3cVarE0 = m3cVarE0.u();
            b8eVar2 = (m3cVarE0 == null || (tahVar = m3cVarE0.F) == null) ? null : (lbl) tahVar.f;
        }
        ms3 ms3Var = (ms3) obj;
        return (ms3Var != null && (objD0 = ms3Var.d0((wyeVarD0 = ui6.d0(f17Var)), new gb3(function0, wyeVarD0, (byte) 4), nt5Var)) == px5.a) ? objD0 : Unit.a;
    }

    public static boolean h(uo5 uo5Var) {
        int[] iArr = uo5Var.o0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        vo5 vo5Var = uo5Var.S;
        if (vo5Var == null) {
            vo5Var = null;
        }
        if (vo5Var != null) {
            int[] iArr2 = vo5Var.o0;
            int i4 = iArr2[0];
            int i5 = iArr2[1];
        }
        boolean z = i2 == 1 || uo5Var.x() || i2 == 2 || (i2 == 3 && uo5Var.q == 0 && uo5Var.V == 0.0f && uo5Var.q(0)) || (i2 == 3 && uo5Var.q == 1 && uo5Var.r(0, uo5Var.n()));
        boolean z2 = i3 == 1 || uo5Var.y() || i3 == 2 || (i3 == 3 && uo5Var.r == 0 && uo5Var.V == 0.0f && uo5Var.q(1)) || (i3 == 3 && uo5Var.r == 1 && uo5Var.r(1, uo5Var.k()));
        return (uo5Var.V > 0.0f && (z || z2)) || (z && z2);
    }

    public static void h0(String str) {
        mra mraVar;
        synchronized (h) {
            mraVar = i;
        }
        if (mraVar == null) {
            return;
        }
        Set set = c9e.a;
        pik.D(c9e.a.contains("settings_id".toLowerCase(Locale.ROOT)) ? 16384 : 2048, str);
        mraVar.configureScope(new hai((byte) 20));
    }

    public static void i(Throwable th, Map map) {
        mra mraVar;
        synchronized (h) {
            mraVar = i;
        }
        if (mraVar == null) {
            return;
        }
        Set set = c9e.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(qbd.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Set set2 = c9e.a;
            linkedHashMap.put(key, pik.D(c9e.a.contains(str.toLowerCase(Locale.ROOT)) ? 16384 : 2048, str2));
        }
        if (linkedHashMap.isEmpty()) {
            mraVar.captureException(th);
        } else {
            mraVar.captureException(th, new hai((byte) 20));
        }
    }

    public static gk4 j(long j2, ih5 ih5Var, int i2) {
        long jB = ua5.b(j2, ih5Var);
        return z((sa5) ((vt9) ih5Var).j(ua5.a)).a(j2, jB, u95.g, u95.b(jB, 0.38f));
    }

    public static boolean j0(ru9 ru9Var) {
        long j2 = ru9Var.a.getLong("cmp_consent_response_timestamp", -1L);
        return j2 == -1 || System.currentTimeMillis() - j2 > r65.w;
    }

    public static final byte k(char c2) {
        if (c2 < '~') {
            return mt4.b[c2];
        }
        return (byte) 0;
    }

    public static void k0(int i2, uo5 uo5Var, n5h n5hVar, boolean z) {
        float f2 = uo5Var.c0;
        eo5 eo5Var = uo5Var.H;
        int iD = eo5Var.f.d();
        eo5 eo5Var2 = uo5Var.J;
        int iD2 = eo5Var2.f.d();
        int iE = eo5Var.e() + iD;
        int iE2 = iD2 - eo5Var2.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iN = uo5Var.n();
        int i3 = (iD2 - iD) - iN;
        if (iD > iD2) {
            i3 = (iD - iD2) - iN;
        }
        int i4 = ((int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3)) + iD;
        int i5 = i4 + iN;
        if (iD > iD2) {
            i5 = i4 - iN;
        }
        uo5Var.E(i4, i5);
        E(i2 + 1, uo5Var, n5hVar, z);
    }

    public static final void l(int i2) {
        if (i2 >= 1) {
            return;
        }
        bxl.d(sko.i(i2, "Expected positive parallelism level, but got "));
    }

    public static void l0(int i2, uo5 uo5Var, n5h n5hVar, uo5 uo5Var2, boolean z) {
        float f2 = uo5Var2.c0;
        eo5 eo5Var = uo5Var2.H;
        int iE = eo5Var.e() + eo5Var.f.d();
        eo5 eo5Var2 = uo5Var2.J;
        int iD = eo5Var2.f.d() - eo5Var2.e();
        if (iD >= iE) {
            int iN = uo5Var2.n();
            if (uo5Var2.f0 != 8) {
                int i3 = uo5Var2.q;
                if (i3 == 2) {
                    iN = (int) (uo5Var2.c0 * 0.5f * (uo5Var instanceof vo5 ? uo5Var.n() : uo5Var.S.n()));
                } else if (i3 == 0) {
                    iN = iD - iE;
                }
                iN = Math.max(uo5Var2.t, iN);
                int i4 = uo5Var2.u;
                if (i4 > 0) {
                    iN = Math.min(i4, iN);
                }
            }
            int i5 = iE + ((int) ((f2 * ((iD - iE) - iN)) + 0.5f));
            uo5Var2.E(i5, iN + i5);
            E(i2 + 1, uo5Var2, n5hVar, z);
        }
    }

    public static void m() {
        synchronized (h) {
            mra mraVar = i;
            if (mraVar != null) {
                mraVar.close();
            }
            i = null;
        }
    }

    public static void m0(int i2, uo5 uo5Var, n5h n5hVar) {
        float f2 = uo5Var.d0;
        eo5 eo5Var = uo5Var.I;
        int iD = eo5Var.f.d();
        eo5 eo5Var2 = uo5Var.K;
        int iD2 = eo5Var2.f.d();
        int iE = eo5Var.e() + iD;
        int iE2 = iD2 - eo5Var2.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = uo5Var.k();
        int i3 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i3 = (iD - iD2) - iK;
        }
        int i4 = (int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3);
        int i5 = iD + i4;
        int i6 = i5 + iK;
        if (iD > iD2) {
            i5 = iD - i4;
            i6 = i5 - iK;
        }
        uo5Var.F(i5, i6);
        s0(i2 + 1, uo5Var, n5hVar);
    }

    public static final float n(long j2, long j3) {
        return Math.min(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static void n0(int i2, uo5 uo5Var, n5h n5hVar, uo5 uo5Var2) {
        float f2 = uo5Var2.d0;
        eo5 eo5Var = uo5Var2.I;
        int iE = eo5Var.e() + eo5Var.f.d();
        eo5 eo5Var2 = uo5Var2.K;
        int iD = eo5Var2.f.d() - eo5Var2.e();
        if (iD >= iE) {
            int iK = uo5Var2.k();
            if (uo5Var2.f0 != 8) {
                int i3 = uo5Var2.r;
                if (i3 == 2) {
                    iK = (int) (f2 * 0.5f * (uo5Var instanceof vo5 ? uo5Var.k() : uo5Var.S.k()));
                } else if (i3 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(uo5Var2.w, iK);
                int i4 = uo5Var2.x;
                if (i4 > 0) {
                    iK = Math.min(i4, iK);
                }
            }
            int i5 = iE + ((int) ((f2 * ((iD - iE) - iK)) + 0.5f));
            uo5Var2.F(i5, iK + i5);
            s0(i2 + 1, uo5Var2, n5hVar);
        }
    }

    public static final boolean o(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final ztc o0(ebb ebbVar, wxm wxmVar) {
        try {
            return dyg.q(ebbVar, wxmVar);
        } catch (IllegalArgumentException e2) {
            throw new e22("Can not convert instant " + ebbVar + " to LocalDateTime to perform computations", e2);
        }
    }

    public static final boolean p(Map map, Map.Entry entry) {
        Object obj = map.get(entry.getKey());
        return obj != null ? obj.equals(entry.getValue()) : entry.getValue() == null && map.containsKey(entry.getKey());
    }

    public static final String p0(byte b2) {
        return b2 == 1 ? "quotation mark '\"'" : b2 == 2 ? "string escape sequence '\\'" : b2 == 4 ? "comma ','" : b2 == 5 ? "colon ':'" : b2 == 6 ? "start of the object '{'" : b2 == 7 ? "end of the object '}'" : b2 == 8 ? "start of the array '['" : b2 == 9 ? "end of the array ']'" : b2 == 10 ? "end of the input" : b2 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }

    public static final File q(Context context, String str) {
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public static final String q0(int i2, CharSequence charSequence) {
        if (charSequence.length() <= i2) {
            return charSequence.toString();
        }
        return charSequence.subSequence(0, i2).toString() + "...";
    }

    public static final int r(ebb ebbVar, ebb ebbVar2, ypl yplVar) {
        di6.Companion.getClass();
        yh6 yh6Var = di6.c;
        int i2 = 0;
        if (yh6Var == null) {
            h9o.p();
            return 0;
        }
        ztc ztcVarO0 = o0(ebbVar, hyg.l(ebbVar, yplVar));
        ztc ztcVarO02 = o0(ebbVar2, hyg.l(ebbVar2, yplVar));
        Instant instant = ZonedDateTime.ofLocal(new ztc(ztcVarO02.d(), new rvc(ztcVarO0.a.toLocalTime())).a, yplVar.a, hyg.l(ebbVar, yplVar).a).toInstant();
        ebb ebbVar3 = ebb.c;
        ebb ebbVarN = j06.n(instant.getEpochSecond(), instant.getNano());
        if (ebbVar2.compareTo(ebbVar) > 0 && ebbVarN.compareTo(ebbVar2) > 0) {
            i2 = -1;
        } else if (ebbVar2.compareTo(ebbVar) < 0 && ebbVarN.compareTo(ebbVar2) < 0) {
            i2 = 1;
        }
        long jUntil = ztcVarO0.d().a.until(vtc.a(ztcVarO02.d(), i2, yh6Var).a, ChronoUnit.DAYS) / yh6Var.d;
        if (jUntil > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return jUntil < -2147483648L ? LinearLayoutManager.INVALID_OFFSET : (int) jUntil;
    }

    public static final Throwable r0(Throwable th) {
        Throwable cause = th;
        while (true) {
            if (!(cause instanceof CancellationException)) {
                if (cause == null) {
                    break;
                }
                return cause;
            }
            CancellationException cancellationException = (CancellationException) cause;
            if (cause.equals(cancellationException.getCause())) {
                break;
            }
            cause = cancellationException.getCause();
        }
        return th;
    }

    public static final float s(int i2, int i3, float[] fArr, float[] fArr2) {
        int i4 = i2 << 2;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static void s0(int i2, uo5 uo5Var, n5h n5hVar) {
        boolean z;
        eo5 eo5Var;
        eo5 eo5Var2;
        eo5 eo5Var3;
        eo5 eo5Var4;
        if (uo5Var.m) {
            return;
        }
        if (!(uo5Var instanceof vo5) && uo5Var.w() && h(uo5Var)) {
            vo5.Q(uo5Var, n5hVar, new cb3());
        }
        eo5 eo5VarI = uo5Var.i(3);
        eo5 eo5VarI2 = uo5Var.i(5);
        int iD = eo5VarI.d();
        int iD2 = eo5VarI2.d();
        HashSet hashSet = eo5VarI.a;
        if (hashSet != null && eo5VarI.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                eo5 eo5Var5 = (eo5) it.next();
                uo5 uo5Var2 = eo5Var5.d;
                int i3 = i2 + 1;
                boolean zH = h(uo5Var2);
                eo5 eo5Var6 = uo5Var2.I;
                eo5 eo5Var7 = uo5Var2.K;
                if (uo5Var2.w() && zH) {
                    vo5.Q(uo5Var2, n5hVar, new cb3());
                }
                boolean z2 = (eo5Var5 == eo5Var6 && (eo5Var4 = eo5Var7.f) != null && eo5Var4.c) || (eo5Var5 == eo5Var7 && (eo5Var3 = eo5Var6.f) != null && eo5Var3.c);
                int i4 = uo5Var2.o0[1];
                if (i4 != 3 || zH) {
                    if (!uo5Var2.w()) {
                        if (eo5Var5 == eo5Var6 && eo5Var7.f == null) {
                            int iE = eo5Var6.e() + iD;
                            uo5Var2.F(iE, uo5Var2.k() + iE);
                            s0(i3, uo5Var2, n5hVar);
                        } else if (eo5Var5 == eo5Var7 && eo5Var6.f == null) {
                            int iE2 = iD - eo5Var7.e();
                            uo5Var2.F(iE2 - uo5Var2.k(), iE2);
                            s0(i3, uo5Var2, n5hVar);
                        } else if (z2 && !uo5Var2.v()) {
                            m0(i3, uo5Var2, n5hVar);
                        }
                    }
                } else if (i4 == 3 && uo5Var2.x >= 0 && uo5Var2.w >= 0 && (uo5Var2.f0 == 8 || (uo5Var2.r == 0 && uo5Var2.V == 0.0f))) {
                    if (!uo5Var2.v() && !uo5Var2.E && z2 && !uo5Var2.v()) {
                        n0(i3, uo5Var, n5hVar, uo5Var2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (uo5Var instanceof r5a) {
            return;
        }
        HashSet hashSet2 = eo5VarI2.a;
        if (hashSet2 != null && eo5VarI2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                eo5 eo5Var8 = (eo5) it2.next();
                uo5 uo5Var3 = eo5Var8.d;
                int i5 = i2 + 1;
                boolean zH2 = h(uo5Var3);
                eo5 eo5Var9 = uo5Var3.I;
                eo5 eo5Var10 = uo5Var3.K;
                if (uo5Var3.w() && zH2) {
                    vo5.Q(uo5Var3, n5hVar, new cb3());
                }
                boolean z4 = (eo5Var8 == eo5Var9 && (eo5Var2 = eo5Var10.f) != null && eo5Var2.c) || (eo5Var8 == eo5Var10 && (eo5Var = eo5Var9.f) != null && eo5Var.c);
                int i6 = uo5Var3.o0[1];
                if (i6 != 3 || zH2) {
                    if (!uo5Var3.w()) {
                        if (eo5Var8 == eo5Var9 && eo5Var10.f == null) {
                            int iE3 = eo5Var9.e() + iD2;
                            uo5Var3.F(iE3, uo5Var3.k() + iE3);
                            s0(i5, uo5Var3, n5hVar);
                        } else if (eo5Var8 == eo5Var10 && eo5Var9.f == null) {
                            int iE4 = iD2 - eo5Var10.e();
                            uo5Var3.F(iE4 - uo5Var3.k(), iE4);
                            s0(i5, uo5Var3, n5hVar);
                        } else if (z4 && !uo5Var3.v()) {
                            m0(i5, uo5Var3, n5hVar);
                        }
                    }
                } else if (i6 == 3 && uo5Var3.x >= 0 && uo5Var3.w >= 0 && (uo5Var3.f0 == 8 || (uo5Var3.r == 0 && uo5Var3.V == 0.0f))) {
                    if (!uo5Var3.v() && !uo5Var3.E && z4 && !uo5Var3.v()) {
                        n0(i5, uo5Var, n5hVar, uo5Var3);
                    }
                }
            }
        }
        eo5 eo5VarI3 = uo5Var.i(6);
        if (eo5VarI3.a != null && eo5VarI3.c) {
            int iD3 = eo5VarI3.d();
            Iterator it3 = eo5VarI3.a.iterator();
            while (it3.hasNext()) {
                eo5 eo5Var11 = (eo5) it3.next();
                uo5 uo5Var4 = eo5Var11.d;
                int i7 = i2 + 1;
                boolean zH3 = h(uo5Var4);
                eo5 eo5Var12 = uo5Var4.L;
                if (uo5Var4.w() && zH3) {
                    vo5.Q(uo5Var4, n5hVar, new cb3());
                }
                if (uo5Var4.o0[z3 ? 1 : 0] != 3 || zH3) {
                    if (!uo5Var4.w()) {
                        if (eo5Var11 == eo5Var12) {
                            int iE5 = eo5Var11.e() + iD3;
                            if (uo5Var4.D) {
                                int i8 = iE5 - uo5Var4.Z;
                                int i9 = uo5Var4.U + i8;
                                uo5Var4.Y = i8;
                                uo5Var4.I.l(i8);
                                uo5Var4.K.l(i9);
                                eo5Var12.l(iE5);
                                z = z3 ? 1 : 0;
                                uo5Var4.k = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            s0(i7, uo5Var4, n5hVar);
                        }
                        z3 = z;
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        uo5Var.m = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0046 -> B:18:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.uuk r4, long r5, kotlin.jvm.functions.Function1 r7, nt5 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.hj7
            if (r0 == 0) goto L13
            r0 = r8
            hj7 r0 = (defpackage.hj7) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            hj7 r0 = new hj7
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.v
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            kotlin.jvm.functions.Function1 r4 = r0.u
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            uuk r5 = r0.t
            defpackage.ybh.y(r8)
            r7 = r4
            r4 = r5
            goto L49
        L2f:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L36:
            defpackage.ybh.y(r8)
        L39:
            r0.t = r4
            r8 = r7
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r0.u = r8
            r0.w = r3
            java.lang.Object r8 = d(r4, r5, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            lmg r8 = (defpackage.lmg) r8
            if (r8 != 0) goto L50
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L50:
            boolean r5 = defpackage.wxe.m(r8)
            if (r5 == 0) goto L59
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L59:
            r7.invoke(r8)
            long r5 = r8.a
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i41.t(uuk, long, kotlin.jvm.functions.Function1, nt5):java.lang.Object");
    }

    public static String u(ebb ebbVar, hh6 hh6Var) {
        wxm.Companion.getClass();
        ry7 ry7Var = new ry7(ebbVar, wxm.b, (byte) 21);
        fh6 fh6Var = jh6.a;
        eh6 eh6Var = new eh6(new fh6());
        ry7Var.invoke(eh6Var);
        return hh6Var.a(eh6Var);
    }

    public static final void v(StringBuilder sb, StringBuilder sb2, int i2) {
        if (i2 < 10) {
            sb.append('0');
        }
        sb2.append(i2);
    }

    public static ArrayList y(Collection collection, boolean z) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            yqe yqeVar = (yqe) it.next();
            if (!yqeVar.a.equalsIgnoreCase("fof") && (!yqeVar.a() || z)) {
                arrayList.add(yqeVar);
            }
        }
        return arrayList;
    }

    public static gk4 z(sa5 sa5Var) {
        gk4 gk4Var = sa5Var.Z;
        if (gk4Var != null) {
            return gk4Var;
        }
        ta5 ta5Var = p39.a;
        gk4 gk4Var2 = new gk4(ua5.c(sa5Var, ta5Var), ua5.a(sa5Var, ua5.c(sa5Var, ta5Var)), cs5.q(u95.b(ua5.c(sa5Var, p39.c), p39.d), ua5.c(sa5Var, ta5Var)), u95.b(ua5.a(sa5Var, ua5.c(sa5Var, ta5Var)), 0.38f));
        sa5Var.Z = gk4Var2;
        return gk4Var2;
    }

    public int A() {
        return 0;
    }

    public abstract float C(Object obj);

    public View D() {
        return null;
    }

    public void F(ViewGroup viewGroup) {
        viewGroup.setVisibility(0);
    }

    public abstract void P(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4);

    public void W() {
    }

    public void g0() {
        View viewD = D();
        if (viewD != null) {
            viewD.setImportantForAccessibility(2);
        }
    }

    public abstract void i0(Object obj, float f2);

    public int w() {
        return 4;
    }

    public int x() {
        return 17;
    }
}
