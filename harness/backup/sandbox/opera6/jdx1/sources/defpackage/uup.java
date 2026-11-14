package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.hardware.camera2.params.OutputConfiguration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class uup {
    public static z4k a;
    public static final ue5 b = new ue5(-1131826196, new q92((byte) 19), false);
    public static final yg9 c = new yg9(28);
    public static final q9a d = new q9a((byte) 27);
    public static final u73 e = new u73();
    public static final eko f = new eko(12);
    public static volatile Locale g;

    public static Serializable A(l1b l1bVar) {
        String str = (String) l1bVar.get("c");
        if (Intrinsics.a(str, "DEFAULT")) {
            p0i p0iVar = t0i.b;
            return str;
        }
        p0i p0iVar2 = t0i.b;
        if (str == null) {
            str = "<null>";
        }
        return new q0i(new eva("Invalid campaign ".concat(str)));
    }

    public static Serializable B(l1b l1bVar) {
        String str = (String) l1bVar.get("d");
        Integer intOrNull = str != null ? StringsKt.toIntOrNull(str) : null;
        if (intOrNull != null && intOrNull.intValue() > 0) {
            p0i p0iVar = t0i.b;
            return intOrNull;
        }
        p0i p0iVar2 = t0i.b;
        if (str == null) {
            str = "<null>";
        }
        return new q0i(new eva("Invalid duration ".concat(str)));
    }

    public static void C(int[] iArr, wxd wxdVar, kam[] kamVarArr, vxd vxdVar, vxd vxdVar2, int i, int i2) {
        if (i >= i2) {
            return;
        }
        int i3 = (i + i2) >>> 1;
        if (l(iArr[i3], iArr[i], wxdVar, kamVarArr, vxdVar, vxdVar2) < 0) {
            int i4 = iArr[i];
            iArr[i] = iArr[i3];
            iArr[i3] = i4;
        }
        if (l(iArr[i2], iArr[i], wxdVar, kamVarArr, vxdVar, vxdVar2) < 0) {
            int i5 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i5;
        }
        if (l(iArr[i2], iArr[i3], wxdVar, kamVarArr, vxdVar, vxdVar2) < 0) {
            int i6 = iArr[i3];
            iArr[i3] = iArr[i2];
            iArr[i2] = i6;
        }
        int i7 = iArr[i3];
        iArr[i3] = iArr[i2];
        iArr[i2] = i7;
        int i8 = i - 1;
        for (int i9 = i; i9 < i2; i9++) {
            if (l(iArr[i9], i7, wxdVar, kamVarArr, vxdVar, vxdVar2) < 0) {
                i8++;
                int i10 = iArr[i8];
                iArr[i8] = iArr[i9];
                iArr[i9] = i10;
            }
        }
        int i11 = i8 + 1;
        int i12 = iArr[i11];
        iArr[i11] = iArr[i2];
        iArr[i2] = i12;
        C(iArr, wxdVar, kamVarArr, vxdVar, vxdVar2, i, i8);
        C(iArr, wxdVar, kamVarArr, vxdVar, vxdVar2, i8 + 2, i2);
    }

    public static Object D(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static p4j E(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        int iA = qbd.a(k95.o(linkedHashSet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : linkedHashSet) {
            linkedHashMap.put(new c8a(((tj3) obj).a()), obj);
        }
        p4j p4jVar = new p4j();
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            xj3 xj3Var = (xj3) it.next();
            tj3 tj3Var = (tj3) linkedHashMap.get(new c8a(xj3Var.a.b));
            if (tj3Var != null) {
                p4jVar.add(new l9d(new vj3(xj3Var.a.a, tj3Var), xj3Var.b));
            }
        }
        return z4j.a(p4jVar);
    }

    public static final c8e F(c8e c8eVar, kpi kpiVar, fsf fsfVar, v51 v51Var, boolean z, h89 h89Var, lde ldeVar, xs3 xs3Var) {
        fsf fsfVar2 = fsf.a;
        z7e z7eVar = z7e.b;
        return c8eVar.d(fsfVar == fsfVar2 ? x1p.j(z7eVar, rga.c) : x1p.j(z7eVar, rga.b)).d(new yoi(v51Var, xs3Var, h89Var, ldeVar, fsfVar, kpiVar, z, false));
    }

    public static boolean K(xt8 xt8Var, int i) {
        String str;
        SharedPreferences sharedPreferences = (SharedPreferences) xt8Var.a.a.get();
        String str2 = "vpn";
        if (i == 0) {
            str = "vpn";
        } else if (i == 1) {
            str = "night_mode";
        } else {
            if (i != 2) {
                qp2.o("Unknown feature");
                return false;
            }
            str = "vpn_pro";
        }
        if (!sharedPreferences.getBoolean("settings_fragment_shown_".concat(str), false)) {
            SharedPreferences sharedPreferences2 = (SharedPreferences) xt8Var.a.a.get();
            if (i != 0) {
                if (i == 1) {
                    str2 = "night_mode";
                } else {
                    if (i != 2) {
                        qp2.o("Unknown feature");
                        return false;
                    }
                    str2 = "vpn_pro";
                }
            }
            if (!sharedPreferences2.getBoolean("feature_activated_".concat(str2), false)) {
                return true;
            }
        }
        return false;
    }

    public static final c8e L(c8e c8eVar, jvg jvgVar, t78 t78Var, xhl xhlVar, qw5 qw5Var) {
        return c8eVar.d(new zfl(jvgVar, t78Var, xhlVar, qw5Var));
    }

    public static final void M(List list, d91 d91Var) {
        Path path;
        int i;
        float f2;
        int i2;
        v7g v7gVar;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        List list2 = list;
        d91 d91Var2 = d91Var;
        Path path2 = d91Var2.a;
        Path path3 = d91Var2.a;
        int i3 = path2.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
        path3.rewind();
        d91Var2.h(i3);
        v7g v7gVar2 = list2.isEmpty() ? d7g.c : (v7g) list2.get(0);
        int size = list2.size();
        float f11 = 0.0f;
        int i4 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i4 < size) {
            v7g v7gVar3 = (v7g) list2.get(i4);
            if (v7gVar3 instanceof d7g) {
                path3.close();
                path = path3;
                i = size;
                f2 = f11;
                i2 = i4;
                v7gVar = v7gVar3;
                f12 = f16;
                f14 = f12;
                f13 = f17;
                f15 = f13;
            } else {
                if (v7gVar3 instanceof p7g) {
                    p7g p7gVar = (p7g) v7gVar3;
                    float f18 = p7gVar.c;
                    f14 += f18;
                    float f19 = p7gVar.d;
                    f15 += f19;
                    path3.rMoveTo(f18, f19);
                    path = path3;
                    i = size;
                    f2 = f11;
                    i2 = i4;
                    f16 = f14;
                    f17 = f15;
                } else {
                    if (v7gVar3 instanceof h7g) {
                        h7g h7gVar = (h7g) v7gVar3;
                        float f20 = h7gVar.c;
                        float f21 = h7gVar.d;
                        path3.moveTo(f20, f21);
                        f15 = f21;
                        f17 = f15;
                        path = path3;
                        f14 = f20;
                        f16 = f14;
                    } else {
                        if (v7gVar3 instanceof o7g) {
                            o7g o7gVar = (o7g) v7gVar3;
                            float f22 = o7gVar.d;
                            float f23 = o7gVar.c;
                            path3.rLineTo(f23, f22);
                            f14 += f23;
                            f15 += f22;
                        } else if (v7gVar3 instanceof g7g) {
                            g7g g7gVar = (g7g) v7gVar3;
                            float f24 = g7gVar.d;
                            float f25 = g7gVar.c;
                            d91Var2.e(f25, f24);
                            f14 = f25;
                            path = path3;
                            f15 = f24;
                        } else if (v7gVar3 instanceof n7g) {
                            float f26 = ((n7g) v7gVar3).c;
                            path3.rLineTo(f26, f11);
                            f14 += f26;
                        } else if (v7gVar3 instanceof f7g) {
                            float f27 = ((f7g) v7gVar3).c;
                            d91Var2.e(f27, f15);
                            f14 = f27;
                        } else {
                            if (v7gVar3 instanceof t7g) {
                                f10 = ((t7g) v7gVar3).c;
                                path3.rLineTo(f11, f10);
                            } else if (v7gVar3 instanceof u7g) {
                                float f28 = ((u7g) v7gVar3).c;
                                d91Var2.e(f14, f28);
                                f15 = f28;
                            } else if (v7gVar3 instanceof m7g) {
                                m7g m7gVar = (m7g) v7gVar3;
                                path3.rCubicTo(m7gVar.c, m7gVar.d, m7gVar.e, m7gVar.f, m7gVar.g, m7gVar.h);
                                f12 = m7gVar.e + f14;
                                f13 = m7gVar.f + f15;
                                f14 += m7gVar.g;
                                f10 = m7gVar.h;
                            } else {
                                if (v7gVar3 instanceof e7g) {
                                    e7g e7gVar = (e7g) v7gVar3;
                                    path3.cubicTo(e7gVar.c, e7gVar.d, e7gVar.e, e7gVar.f, e7gVar.g, e7gVar.h);
                                    f12 = e7gVar.e;
                                    f13 = e7gVar.f;
                                    f6 = e7gVar.g;
                                    f7 = e7gVar.h;
                                } else if (v7gVar3 instanceof r7g) {
                                    if (v7gVar2.a) {
                                        f9 = f15 - f13;
                                        f8 = f14 - f12;
                                    } else {
                                        f8 = f11;
                                        f9 = f8;
                                    }
                                    r7g r7gVar = (r7g) v7gVar3;
                                    path3.rCubicTo(f8, f9, r7gVar.c, r7gVar.d, r7gVar.e, r7gVar.f);
                                    f12 = r7gVar.c + f14;
                                    f13 = r7gVar.d + f15;
                                    f14 += r7gVar.e;
                                    f10 = r7gVar.f;
                                } else if (v7gVar3 instanceof j7g) {
                                    if (v7gVar2.a) {
                                        f14 = (f14 * 2.0f) - f12;
                                        f15 = (2.0f * f15) - f13;
                                    }
                                    j7g j7gVar = (j7g) v7gVar3;
                                    path3.cubicTo(f14, f15, j7gVar.c, j7gVar.d, j7gVar.e, j7gVar.f);
                                    f12 = j7gVar.c;
                                    f13 = j7gVar.d;
                                    f6 = j7gVar.e;
                                    f7 = j7gVar.f;
                                } else if (v7gVar3 instanceof q7g) {
                                    q7g q7gVar = (q7g) v7gVar3;
                                    float f29 = q7gVar.f;
                                    float f30 = q7gVar.e;
                                    float f31 = q7gVar.d;
                                    float f32 = q7gVar.c;
                                    path3.rQuadTo(f32, f31, f30, f29);
                                    float f33 = f32 + f14;
                                    float f34 = f31 + f15;
                                    f14 += f30;
                                    f15 += f29;
                                    f12 = f33;
                                    path = path3;
                                    f13 = f34;
                                } else {
                                    if (v7gVar3 instanceof i7g) {
                                        i7g i7gVar = (i7g) v7gVar3;
                                        float f35 = i7gVar.f;
                                        float f36 = i7gVar.e;
                                        float f37 = i7gVar.d;
                                        f5 = i7gVar.c;
                                        path3.quadTo(f5, f37, f36, f35);
                                        path = path3;
                                        f15 = f35;
                                        f14 = f36;
                                        f13 = f37;
                                    } else if (v7gVar3 instanceof s7g) {
                                        if (v7gVar2.b) {
                                            f3 = f14 - f12;
                                            f4 = f15 - f13;
                                        } else {
                                            f3 = f11;
                                            f4 = f3;
                                        }
                                        s7g s7gVar = (s7g) v7gVar3;
                                        float f38 = s7gVar.d;
                                        float f39 = s7gVar.c;
                                        path3.rQuadTo(f3, f4, f39, f38);
                                        f5 = f3 + f14;
                                        float f40 = f4 + f15;
                                        f14 += f39;
                                        f15 += f38;
                                        path = path3;
                                        f13 = f40;
                                    } else if (v7gVar3 instanceof k7g) {
                                        if (v7gVar2.b) {
                                            f14 = (f14 * 2.0f) - f12;
                                            f15 = (2.0f * f15) - f13;
                                        }
                                        k7g k7gVar = (k7g) v7gVar3;
                                        float f41 = k7gVar.d;
                                        float f42 = k7gVar.c;
                                        path3.quadTo(f14, f15, f42, f41);
                                        path = path3;
                                        i = size;
                                        f2 = f11;
                                        i2 = i4;
                                        f13 = f15;
                                        v7gVar = v7gVar3;
                                        f15 = f41;
                                        f12 = f14;
                                        f14 = f42;
                                    } else if (v7gVar3 instanceof l7g) {
                                        l7g l7gVar = (l7g) v7gVar3;
                                        float f43 = l7gVar.h + f14;
                                        float f44 = l7gVar.i + f15;
                                        i = size;
                                        f2 = 0.0f;
                                        path = path3;
                                        i2 = i4;
                                        o(d91Var, f14, f15, f43, f44, l7gVar.c, l7gVar.d, l7gVar.e, l7gVar.f, l7gVar.g);
                                        f12 = f43;
                                        f14 = f12;
                                        f13 = f44;
                                        f15 = f13;
                                        v7gVar = v7gVar3;
                                    } else {
                                        path = path3;
                                        i = size;
                                        f2 = f11;
                                        i2 = i4;
                                        if (!(v7gVar3 instanceof c7g)) {
                                            h9o.p();
                                            return;
                                        }
                                        c7g c7gVar = (c7g) v7gVar3;
                                        float f45 = c7gVar.i;
                                        float f46 = c7gVar.h;
                                        v7gVar = v7gVar3;
                                        o(d91Var, f14, f15, f46, f45, c7gVar.c, c7gVar.d, c7gVar.e, c7gVar.f, c7gVar.g);
                                        f13 = f45;
                                        f15 = f13;
                                        f12 = f46;
                                        f14 = f12;
                                    }
                                    i = size;
                                    f2 = f11;
                                    i2 = i4;
                                    v7gVar = v7gVar3;
                                    f12 = f5;
                                }
                                f15 = f7;
                                path = path3;
                                f14 = f6;
                            }
                            f15 += f10;
                        }
                        path = path3;
                    }
                    i = size;
                    f2 = f11;
                    i2 = i4;
                }
                v7gVar = v7gVar3;
            }
            i4 = i2 + 1;
            list2 = list;
            d91Var2 = d91Var;
            size = i;
            path3 = path;
            v7gVar2 = v7gVar;
            f11 = f2;
        }
    }

    public static void N(Parcel parcel, Bundle bundle) {
        if (bundle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
        }
    }

    public static final void d(c8e c8eVar, td3 td3Var, ue5 ue5Var, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(380139498);
        if ((i & 6) == 0) {
            i2 = (vt9Var.f(c8eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if ((i & 3072) == 0) {
            i3 |= vt9Var.h(ue5Var) ? 2048 : 1024;
        }
        if (vt9Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            td3Var = rbe.b;
            tfd tfdVarC = nr3.c(td3Var, false);
            boolean zF = ((i3 & 7168) == 2048) | vt9Var.f(tfdVarC);
            Object objK = vt9Var.K();
            if (zF || objK == hh5.a) {
                objK = new fx0(tfdVarC, ue5Var, (byte) 10);
                vt9Var.g0(objK);
            }
            dkk.a(c8eVar, (Function2) objK, vt9Var, i3 & 14, 0);
        } else {
            vt9Var.Q();
        }
        td3 td3Var2 = td3Var;
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ga1((Object) c8eVar, (Object) td3Var2, (Object) ue5Var, i, (byte) 2);
        }
    }

    public static final void g(final g2e g2eVar, long j, final long j2, ih5 ih5Var, final int i) {
        int i2;
        final long j3 = j;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1003470440);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? vt9Var.f(g2eVar) : vt9Var.h(g2eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.e(j3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.e(j2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if (vt9Var.N(i2 & 1, (i2 & 147) != 146)) {
            gpm gpmVar = g2eVar.a().g;
            String str = gpmVar != null ? gpmVar.g : null;
            c8e c8eVarH = mpj.h(z7e.b, 40.0f);
            hp7 hp7Var = ccj.a;
            acj acjVar = (acj) vt9Var.j(hp7Var);
            hp7 hp7Var2 = bcj.b;
            paj pajVar = (paj) vt9Var.j(hp7Var2);
            if (pajVar == null) {
                pajVar = acjVar.d;
            }
            c8e c8eVarC = sfe.C(c8eVarH, j2, pajVar);
            if (str == null) {
                vt9Var.W(-1415153871);
                tfd tfdVarC = nr3.c(rbe.f, false);
                int iHashCode = Long.hashCode(vt9Var.T);
                oag oagVarL = vt9Var.l();
                c8e c8eVarP = qyn.P(vt9Var, c8eVarC);
                bh5.To.getClass();
                vt9Var.a0();
                if (vt9Var.S) {
                    vt9Var.k(m3c.S);
                } else {
                    vt9Var.j0();
                }
                y4h.o(vt9Var, tfdVarC, ujp.f);
                y4h.o(vt9Var, oagVarL, ujp.e);
                y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
                y4h.m(vt9Var);
                y4h.o(vt9Var, c8eVarP, ujp.d);
                wta.b(iza.a((dl7) tk7.n.getValue(), vt9Var), "Mission icon", null, j, vt9Var, 56 | ((i2 << 6) & 7168), 4);
                j3 = j;
                vt9Var.p(true);
                vt9Var.p(false);
            } else {
                vt9Var.W(-1414825457);
                acj acjVar2 = (acj) vt9Var.j(hp7Var);
                paj pajVar2 = (paj) vt9Var.j(hp7Var2);
                if (pajVar2 == null) {
                    pajVar2 = acjVar2.d;
                }
                c8e c8eVarJ = x1p.j(c8eVarC, pajVar2);
                yya yyaVar = new yya((Context) vt9Var.j(j41.b));
                yyaVar.c = str;
                dza.a(yyaVar);
                hn9.a(yyaVar.a(), "Mission icon", c8eVarJ, null, null, new kh3(j3, 5), vt9Var, 48, 1784);
                vt9Var.p(false);
            }
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: b2e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uup.g(g2eVar, j3, j2, (ih5) obj, aoh.m(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.tcc r5, nt5 r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof wdc
            if (r0 == 0) goto L13
            r0 = r6
            wdc r0 = (wdc) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            wdc r0 = new wdc
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.v
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            pqh r5 = r0.u
            tcc r0 = r0.t
            defpackage.ybh.y(r6)     // Catch: java.lang.Throwable -> L2b
            goto L71
        L2b:
            r6 = move-exception
            goto L82
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            r5 = 0
            return r5
        L34:
            defpackage.ybh.y(r6)
            r6 = r5
            qdc r6 = (defpackage.qdc) r6
            qcc r6 = r6.i
            qcc r2 = defpackage.qcc.d
            boolean r6 = r6.d(r2)
            if (r6 == 0) goto L47
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L47:
            pqh r6 = new pqh
            r6.<init>()
            r0.t = r5     // Catch: java.lang.Throwable -> L7d
            r0.u = r6     // Catch: java.lang.Throwable -> L7d
            r0.w = r3     // Catch: java.lang.Throwable -> L7d
            nh4 r2 = new nh4     // Catch: java.lang.Throwable -> L7d
            mt5 r0 = hib.b(r0)     // Catch: java.lang.Throwable -> L7d
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L7d
            r2.s()     // Catch: java.lang.Throwable -> L7d
            xdc r0 = new xdc     // Catch: java.lang.Throwable -> L7d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7d
            r6.a = r0     // Catch: java.lang.Throwable -> L7d
            r5.a(r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r2.q()     // Catch: java.lang.Throwable -> L7d
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r0 = r5
            r5 = r6
        L71:
            java.lang.Object r5 = r5.a
            mdc r5 = (defpackage.mdc) r5
            if (r5 == 0) goto L7a
            r0.b(r5)
        L7a:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L7d:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L82:
            java.lang.Object r5 = r5.a
            mdc r5 = (defpackage.mdc) r5
            if (r5 == 0) goto L8b
            r0.b(r5)
        L8b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uup.h(tcc, nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5 */
    public static final buf i(fd4 fd4Var, xfk xfkVar, Map map) {
        LinkedHashMap linkedHashMap;
        sya syaVar;
        cg4 cg4VarH;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        u9d u9dVar = xfkVar.e;
        LinkedHashMap linkedHashMap5 = xfkVar.d;
        Iterator it = u9dVar.entrySet().iterator();
        do {
            int i = 1;
            buf bufVar = null;
            if (!it.hasNext()) {
                ArrayList arrayList2 = xfkVar.g;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    cg4 cg4Var = (cg4) obj;
                    buf bufVar2 = bufVar;
                    ArrayList arrayList3 = cg4Var.b;
                    int i3 = cg4Var.a;
                    if (arrayList3.size() == i) {
                        Surface surface = (Surface) map.get(new yfk(i3));
                        if (surface != null) {
                            linkedHashMap3.put(new fuf(((wfk) CollectionsKt.Z(arrayList3)).a), surface);
                        }
                        bufVar = bufVar2;
                    } else {
                        int size2 = arrayList3.size();
                        int i4 = 0;
                        while (i4 < size2) {
                            Object obj2 = arrayList3.get(i4);
                            i4++;
                            ArrayList arrayList4 = arrayList2;
                            wfk wfkVar = (wfk) obj2;
                            Object obj3 = linkedHashMap5.get(wfkVar);
                            if (obj3 == null) {
                                qp2.n("Required value was null.");
                                return bufVar2;
                            }
                            LinkedHashMap linkedHashMap6 = linkedHashMap5;
                            OutputConfiguration outputConfiguration = (OutputConfiguration) linkedHashMap4.get((vfk) obj3);
                            Surface surface2 = outputConfiguration != null ? outputConfiguration.getSurface() : (Surface) map.get(new yfk(i3));
                            if (surface2 != null) {
                                linkedHashMap3.put(new fuf(wfkVar.a), surface2);
                                size = size;
                            }
                            arrayList2 = arrayList4;
                            linkedHashMap5 = linkedHashMap6;
                        }
                        bufVar = bufVar2;
                        i = 1;
                    }
                }
                buf bufVar3 = bufVar;
                Iterator it2 = xfkVar.c.iterator();
                h81 h81Var = bufVar3;
                while (it2.hasNext()) {
                    vfk vfkVar = (vfk) it2.next();
                    ArrayList arrayList5 = vfkVar.l;
                    ArrayList arrayList6 = vfkVar.l;
                    Integer num = vfkVar.e;
                    String str = vfkVar.d;
                    ArrayList arrayList7 = new ArrayList();
                    int size3 = arrayList5.size();
                    Iterator it3 = it2;
                    int i5 = 0;
                    while (i5 < size3) {
                        Object obj4 = arrayList5.get(i5);
                        int i6 = i5 + 1;
                        int i7 = ((cg4) obj4).a;
                        ArrayList arrayList8 = arrayList6;
                        Surface surface3 = (Surface) map.get(new yfk(i7));
                        if (surface3 != null) {
                            arrayList7.add(surface3);
                        }
                        arrayList6 = arrayList8;
                        i5 = i6;
                    }
                    ArrayList arrayList9 = arrayList6;
                    OutputConfiguration outputConfiguration2 = (OutputConfiguration) linkedHashMap4.get(vfkVar);
                    if (outputConfiguration2 == null) {
                        if (vfkVar.f != null) {
                            linkedHashMap = linkedHashMap4;
                            if (arrayList7.size() != arrayList5.size()) {
                                h81 h81VarS = qs7.s((Surface) null, (Integer) null, vfkVar.f, vfkVar.g, vfkVar.h, vfkVar.i, vfkVar.k, vfkVar.b, arrayList9.size() > 1, num != null ? num.intValue() : -1, !Intrinsics.a(str, fd4Var.a) ? str : bufVar3, 2);
                                if (h81VarS == null) {
                                    vfkVar.toString();
                                } else {
                                    arrayList.add(h81VarS);
                                    int size4 = arrayList5.size();
                                    int i8 = 0;
                                    while (i8 < size4) {
                                        Object obj5 = arrayList5.get(i8);
                                        i8++;
                                        linkedHashMap2.put(new yfk(((cg4) obj5).a), h81VarS);
                                    }
                                }
                            }
                        } else {
                            linkedHashMap = linkedHashMap4;
                        }
                        if (arrayList7.size() != arrayList5.size()) {
                            ArrayList arrayList10 = new ArrayList();
                            int size5 = arrayList5.size();
                            int i9 = 0;
                            while (i9 < size5) {
                                Object obj6 = arrayList5.get(i9);
                                i9++;
                                if (!map.containsKey(new yfk(((cg4) obj6).a))) {
                                    arrayList10.add(obj6);
                                }
                            }
                            throw new IllegalStateException(("Surfaces are not yet available for " + vfkVar + "! Missing surfaces for " + arrayList10 + '!').toString());
                        }
                        h81 h81VarS2 = qs7.s((Surface) CollectionsKt.K(arrayList7), (Integer) null, (qii) null, vfkVar.g, vfkVar.h, vfkVar.i, vfkVar.k, vfkVar.b, arrayList9.size() > 1, num != null ? num.intValue() : -1, !Intrinsics.a(str, fd4Var.a) ? str : bufVar3, 6);
                        if (h81VarS2 == null) {
                            vfkVar.toString();
                        } else {
                            Iterator it4 = CollectionsKt.G(arrayList7, 1).iterator();
                            while (it4.hasNext()) {
                                h81VarS2.a.addSurface((Surface) it4.next());
                            }
                            bg4 bg4Var = fd4Var.e;
                            if (bg4Var != null) {
                                cg4 cg4Var2 = (cg4) xfkVar.b.get(bg4Var);
                                if (cg4Var2 == null) {
                                    qp2.n("Postview Stream in StreamGraph cannot be null for reprocessing request");
                                    return bufVar3;
                                }
                                if (h81Var == 0 && arrayList5.contains(cg4Var2)) {
                                    h81Var = h81VarS2;
                                } else {
                                    arrayList.add(h81VarS2);
                                }
                            } else {
                                arrayList.add(h81VarS2);
                            }
                        }
                    } else {
                        if (arrayList7.size() != arrayList5.size()) {
                            ArrayList arrayList11 = new ArrayList();
                            int size6 = arrayList5.size();
                            int i10 = 0;
                            while (i10 < size6) {
                                Object obj7 = arrayList5.get(i10);
                                i10++;
                                if (!map.containsKey(new yfk(((cg4) obj7).a))) {
                                    arrayList11.add(obj7);
                                }
                            }
                            throw new IllegalStateException(("Surfaces are not yet available for " + vfkVar + "! Missing surfaces for " + arrayList11 + '!').toString());
                        }
                        arrayList.add(new h81(outputConfiguration2));
                        linkedHashMap = linkedHashMap4;
                    }
                    it2 = it3;
                    linkedHashMap4 = linkedHashMap;
                    h81Var = h81Var;
                }
                return new buf(arrayList, linkedHashMap2, h81Var, linkedHashMap3);
            }
            Map.Entry entry = (Map.Entry) it.next();
            int i11 = ((yfk) entry.getKey()).a;
            syaVar = (sya) entry.getValue();
            cg4VarH = xfkVar.h(i11);
            if (cg4VarH == null) {
                qp2.n("Required value was null.");
                return null;
            }
        } while (cg4VarH.b.size() == 1);
        if (Build.VERSION.SDK_INT < 31) {
            qp2.o("Cannot configure multiple outputs pre-S!");
            return null;
        }
        uqh.a(d81.class);
        syaVar.getClass();
        throw null;
    }

    public static final u9d j(Map map, xfk xfkVar) {
        u9d u9dVar = new u9d();
        ArrayList arrayList = xfkVar.g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            cg4 cg4Var = (cg4) obj;
            Surface surface = (Surface) map.get(new yfk(cg4Var.a));
            if (surface != null) {
                ArrayList arrayList2 = cg4Var.b;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    u9dVar.put(new fuf(((wfk) obj2).a), surface);
                }
            }
        }
        return u9dVar.g();
    }

    public static j87 k(k1g k1gVar, boolean z) {
        int[] iArr;
        int[] iArr2;
        int i;
        m87 m87Var;
        l87 l87Var;
        int i2;
        m87 m87Var2;
        m87 m87Var3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iD = k1gVar.D();
        int iC = k1gVar.C();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        l87 l87Var2 = new l87();
        int i11 = 0;
        l87Var2.a = 0;
        l87Var2.b = iD;
        l87Var2.c = 0;
        l87Var2.d = iC;
        arrayList2.add(l87Var2);
        int i12 = iD + iC;
        int i13 = 1;
        int i14 = (((i12 + 1) / 2) << 1) + 1;
        int[] iArr3 = new int[i14];
        int i15 = i14 / 2;
        int[] iArr4 = new int[i14];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            l87 l87Var3 = (l87) vep.r(i13, arrayList2);
            if (l87Var3.b() < i13 || l87Var3.a() < i13) {
                iArr = iArr4;
                iArr2 = iArr3;
                i = i15;
                m87Var = null;
            } else {
                int iA = ((l87Var3.a() + l87Var3.b()) + i13) / 2;
                int i16 = i13 + i15;
                iArr3[i16] = l87Var3.a;
                iArr4[i16] = l87Var3.b;
                int i17 = i11;
                while (i17 < iA) {
                    int i18 = Math.abs(l87Var3.b() - l87Var3.a()) % 2 == i13 ? i13 : i11;
                    int iB = l87Var3.b() - l87Var3.a();
                    int i19 = -i17;
                    int i20 = i19;
                    while (true) {
                        if (i20 > i17) {
                            iArr = iArr4;
                            iArr2 = iArr3;
                            i2 = i11;
                            i = i15;
                            m87Var2 = null;
                            break;
                        }
                        if (i20 == i19 || (i20 != i17 && iArr3[i20 + 1 + i15] > iArr3[(i20 - 1) + i15])) {
                            i7 = iArr3[i20 + 1 + i15];
                            i8 = i7;
                        } else {
                            i7 = iArr3[(i20 - 1) + i15];
                            i8 = i7 + 1;
                        }
                        iArr = iArr4;
                        int i21 = ((i8 - l87Var3.a) + l87Var3.c) - i20;
                        if (i17 == 0 || i8 != i7) {
                            i9 = i21;
                        } else {
                            i9 = i21;
                            i21--;
                        }
                        int i22 = i9;
                        iArr2 = iArr3;
                        int i23 = i8;
                        int i24 = i22;
                        i = i15;
                        while (i23 < l87Var3.b && i24 < l87Var3.d && k1gVar.i(i23, i24)) {
                            i23++;
                            i24++;
                        }
                        iArr2[i20 + i] = i23;
                        if (i18 != 0) {
                            int i25 = iB - i20;
                            i10 = i20;
                            if (i25 >= i19 + 1 && i25 <= i17 - 1 && iArr[i25 + i] <= i23) {
                                m87Var2 = new m87();
                                m87Var2.a = i7;
                                m87Var2.b = i21;
                                m87Var2.c = i23;
                                m87Var2.d = i24;
                                i2 = 0;
                                m87Var2.e = false;
                                break;
                            }
                        } else {
                            i10 = i20;
                        }
                        i20 = i10 + 2;
                        i11 = 0;
                        iArr4 = iArr;
                        iArr3 = iArr2;
                        i15 = i;
                    }
                    if (m87Var2 != null) {
                        m87Var = m87Var2;
                        break;
                    }
                    int i26 = (l87Var3.b() - l87Var3.a()) % 2 == 0 ? 1 : i2;
                    int iB2 = l87Var3.b() - l87Var3.a();
                    int i27 = i19;
                    while (true) {
                        if (i27 > i17) {
                            m87Var3 = null;
                            break;
                        }
                        if (i27 == i19 || (i27 != i17 && iArr[i27 + 1 + i] < iArr[(i27 - 1) + i])) {
                            i3 = iArr[i27 + 1 + i];
                            i4 = i3;
                        } else {
                            i3 = iArr[(i27 - 1) + i];
                            i4 = i3 - 1;
                        }
                        int i28 = l87Var3.d - ((l87Var3.b - i4) - i27);
                        int i29 = (i17 == 0 || i4 != i3) ? i28 : i28 + 1;
                        while (i4 > l87Var3.a && i28 > l87Var3.c) {
                            i5 = i26;
                            if (!k1gVar.i(i4 - 1, i28 - 1)) {
                                break;
                            }
                            i4--;
                            i28--;
                            i26 = i5;
                        }
                        i5 = i26;
                        iArr[i27 + i] = i4;
                        if (i5 != 0 && (i6 = iB2 - i27) >= i19 && i6 <= i17 && iArr2[i6 + i] >= i4) {
                            m87Var3 = new m87();
                            m87Var3.a = i4;
                            m87Var3.b = i28;
                            m87Var3.c = i3;
                            m87Var3.d = i29;
                            m87Var3.e = true;
                            break;
                        }
                        i27 += 2;
                        i26 = i5;
                    }
                    if (m87Var3 != null) {
                        m87Var = m87Var3;
                        break;
                    }
                    i17++;
                    iArr4 = iArr;
                    iArr3 = iArr2;
                    i15 = i;
                    i13 = 1;
                    i11 = 0;
                }
                iArr = iArr4;
                iArr2 = iArr3;
                i = i15;
                m87Var = null;
            }
            if (m87Var != null) {
                if (m87Var.a() > 0) {
                    int i30 = m87Var.d;
                    int i31 = m87Var.b;
                    int i32 = i30 - i31;
                    int i33 = m87Var.c;
                    int i34 = m87Var.a;
                    int i35 = i33 - i34;
                    arrayList.add(i32 != i35 ? m87Var.e ? new i87(i34, i31, m87Var.a()) : i32 > i35 ? new i87(i34, i31 + 1, m87Var.a()) : new i87(i34 + 1, i31, m87Var.a()) : new i87(i34, i31, i35));
                }
                if (arrayList3.isEmpty()) {
                    l87Var = new l87();
                    i13 = 1;
                } else {
                    i13 = 1;
                    l87Var = (l87) vep.r(1, arrayList3);
                }
                l87Var.a = l87Var3.a;
                l87Var.c = l87Var3.c;
                l87Var.b = m87Var.a;
                l87Var.d = m87Var.b;
                arrayList2.add(l87Var);
                l87Var3.b = l87Var3.b;
                l87Var3.d = l87Var3.d;
                l87Var3.a = m87Var.c;
                l87Var3.c = m87Var.d;
                arrayList2.add(l87Var3);
            } else {
                i13 = 1;
                arrayList3.add(l87Var3);
            }
            iArr4 = iArr;
            iArr3 = iArr2;
            i15 = i;
            i11 = 0;
        }
        int[] iArr5 = iArr4;
        Collections.sort(arrayList, c);
        return new j87(k1gVar, arrayList, iArr3, iArr5, z);
    }

    public static int l(int i, int i2, wxd wxdVar, kam[] kamVarArr, vxd vxdVar, vxd vxdVar2) {
        int iE;
        int iE2;
        boolean z = i < kamVarArr.length && kamVarArr[i] != null;
        boolean z2 = i2 < kamVarArr.length && kamVarArr[i2] != null;
        if (z) {
            iE = kamVarArr[i].a().e();
        } else {
            wxdVar.d(vxdVar, i);
            iE = vxdVar.e();
        }
        if (z2) {
            iE2 = kamVarArr[i2].a().e();
        } else {
            wxdVar.d(vxdVar2, i2);
            iE2 = vxdVar2.e();
        }
        int iMin = Math.min(iE, iE2);
        for (int i3 = 0; i3 < iMin; i3++) {
            int iD = z ? kamVarArr[i].a().d(i3) : vxdVar.d(i3);
            int iD2 = z2 ? kamVarArr[i2].a().d(i3) : vxdVar2.d(i3);
            if (iD != iD2) {
                return iD < iD2 ? -1 : 1;
            }
        }
        return Integer.compare(iE, iE2);
    }

    public static b7f m(Object obj) {
        return new b7f(obj, false);
    }

    public static ke6 n(String str, u2j u2jVar, a64 a64Var) {
        return new ke6(str, new yhe(u2jVar, (byte) 3), new tb6((byte) 3), a64Var);
    }

    public static final void o(d91 d91Var, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean z, boolean z2) {
        double d9;
        double d10;
        double d11 = d6;
        double d12 = (d8 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d12);
        double dSin = Math.sin(d12);
        double d13 = ((d3 * dSin) + (d2 * dCos)) / d11;
        double d14 = ((d3 * dCos) + ((-d2) * dSin)) / d7;
        double d15 = ((d5 * dSin) + (d4 * dCos)) / d11;
        double d16 = ((d5 * dCos) + ((-d4) * dSin)) / d7;
        double d17 = d13 - d15;
        double d18 = d14 - d16;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d14 + d16) / 2.0d;
        double d21 = (d18 * d18) + (d17 * d17);
        if (d21 != 0.0d) {
            double d22 = (1.0d / d21) - 0.25d;
            if (d22 < 0.0d) {
                double dSqrt = (float) (Math.sqrt(d21) / 1.99999d);
                o(d91Var, d2, d3, d4, d5, d11 * dSqrt, d7 * dSqrt, d8, z, z2);
                return;
            }
            double dSqrt2 = Math.sqrt(d22);
            double d23 = d17 * dSqrt2;
            double d24 = dSqrt2 * d18;
            if (z == z2) {
                d9 = d19 - d24;
                d10 = d20 + d23;
            } else {
                d9 = d19 + d24;
                d10 = d20 - d23;
            }
            double dAtan2 = Math.atan2(d14 - d10, d13 - d9);
            double dAtan22 = Math.atan2(d16 - d10, d15 - d9) - dAtan2;
            if (z2 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d25 = d9 * d11;
            double d26 = d10 * d7;
            double d27 = (d25 * dCos) - (d26 * dSin);
            double d28 = (d26 * dCos) + (d25 * dSin);
            int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
            double dCos2 = Math.cos(d12);
            double dSin2 = Math.sin(d12);
            double dCos3 = Math.cos(dAtan2);
            double dSin3 = Math.sin(dAtan2);
            double d29 = -d11;
            double d30 = d29 * dCos2;
            double d31 = d7 * dSin2;
            double d32 = (d30 * dSin3) - (d31 * dCos3);
            double d33 = d29 * dSin2;
            double d34 = d7 * dCos2;
            double d35 = (dCos3 * d34) + (dSin3 * d33);
            double d36 = dAtan22 / iCeil;
            double d37 = dAtan2;
            double d38 = d32;
            int i = 0;
            double d39 = d35;
            double d40 = d3;
            while (i < iCeil) {
                double d41 = d37 + d36;
                double dSin4 = Math.sin(d41);
                double dCos4 = Math.cos(d41);
                int i2 = iCeil;
                double d42 = (((d11 * dCos2) * dCos4) + d27) - (d31 * dSin4);
                double d43 = (d34 * dSin4) + (d11 * dSin2 * dCos4) + d28;
                double d44 = (d30 * dSin4) - (d31 * dCos4);
                double d45 = (dCos4 * d34) + (dSin4 * d33);
                double d46 = d41 - d37;
                double dTan = Math.tan(d46 / 2.0d);
                double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d46)) / 3.0d;
                d91Var.a.cubicTo((float) ((d38 * dSqrt3) + d2), (float) ((d39 * dSqrt3) + d40), (float) (d42 - (dSqrt3 * d44)), (float) (d43 - (dSqrt3 * d45)), (float) d42, (float) d43);
                d36 = d36;
                dSin2 = dSin2;
                d27 = d27;
                d2 = d42;
                i++;
                d33 = d33;
                d37 = d41;
                d39 = d45;
                d38 = d44;
                iCeil = i2;
                d40 = d43;
                d11 = d6;
            }
        }
    }

    public static o65 p(String str) throws lv0 {
        if (str.length() == 0 || str.equals("latest")) {
            return new o65(-1, -1, -1, "latest");
        }
        List listX = StringsKt.X(str, new char[]{'.'});
        if (listX.size() == 3) {
            return new o65(Integer.parseInt((String) listX.get(0)), Integer.parseInt((String) listX.get(1)), Integer.parseInt((String) listX.get(2)), str);
        }
        throw new lv0("Bad number of CMP config sub-versions");
    }

    public static String q(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
    }

    public static bqe r(Context context) {
        cqe cqeVar = bqe.k;
        return no7.n(context, io7.F, bqe.l);
    }

    public static final long s(KeyEvent keyEvent) {
        return c26.c(keyEvent.getKeyCode());
    }

    public static final int t(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:161:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String u(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uup.u(java.lang.String):java.lang.String");
    }

    public static final List w(List list, List list2) {
        nf8 nf8Var = new nf8((byte) 0);
        Object objInvoke = list;
        if (list == null) {
            objInvoke = list2 == null ? null : list2;
        } else if (list2 != null) {
            objInvoke = nf8Var.invoke(list, list2);
        }
        return (List) objInvoke;
    }

    public static boolean y(Context context, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(sko.j("market://details?id=", str));
        if (!TextUtils.isEmpty(str2)) {
            sb.append("&referrer=");
            sb.append(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append("&url=");
            sb.append(str3);
        }
        return z(context, Uri.parse(sb.toString()));
    }

    public static boolean z(Context context, Uri uri) {
        String string = uri.toString();
        String[] strArr = wqm.a;
        if (string.startsWith("market://")) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.setFlags(0);
                intent.addFlags(268435456);
                context.startActivity(intent);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void G(pxh pxhVar) {
    }

    public void H(boolean z) {
    }

    public void I(boolean z) {
    }

    public boolean J() {
        return false;
    }

    public void v(ViewGroup viewGroup) {
        viewGroup.setVisibility(8);
    }

    public void x() {
    }
}
