package defpackage;

import ads_mobile_sdk.bw2;
import ads_mobile_sdk.s61;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Rational;
import androidx.core.app.NotificationCompat;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class j7h {
    public static int a = 2;

    public static final void a(long j, ikl iklVar, Function2 function2, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-684938728);
        int i2 = (vt9Var.e(j) ? 4 : 2) | i | (vt9Var.f(iklVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= vt9Var.h(function2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if (vt9Var.N(i2 & 1, (i2 & 147) != 146)) {
            hp7 hp7Var = ijl.a;
            kfo.d(new k7h[]{aq5.a.a(new u95(j)), hp7Var.a(((ikl) vt9Var.j(hp7Var)).d(iklVar))}, function2, vt9Var, 8 | ((i2 >> 3) & 112));
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new i7h(j, iklVar, function2, i, (byte) 0);
        }
    }

    public static s61 b(prb prbVar, h07 h07Var) {
        wpb wpbVarE;
        prb prbVarA;
        wpb wpbVarE2;
        prb prbVarA2;
        String strA;
        prb prbVarA3;
        pqb pqbVarU = prbVar.u("ad_html");
        String strA2 = null;
        String strN = pqbVarU != null ? pqbVarU.n() : null;
        pqb pqbVarU2 = prbVar.u("ad_base_url");
        String strN2 = pqbVarU2 != null ? pqbVarU2.n() : null;
        pqb pqbVarU3 = prbVar.u("ad_json");
        prb prbVarH = pqbVarU3 != null ? pqbVarU3.h() : null;
        pqb pqbVarU4 = prbVar.u("ad_json");
        wpb wpbVarE3 = bw2.e(pqbVarU4 != null ? pqbVarU4.h() : null, "ads");
        if (wpbVarE3 != null && (prbVarA3 = bw2.a(wpbVarE3, 0)) != null) {
            strA2 = bw2.a(prbVarA3, "ad_mid", "");
        }
        pqb pqbVarU5 = prbVar.u("ad_json");
        return new s61(strN, h07Var, strN2, prbVarH, strA2, (pqbVarU5 == null || (wpbVarE = bw2.e(pqbVarU5.h(), "slots")) == null || (prbVarA = bw2.a(wpbVarE, 0)) == null || (wpbVarE2 = bw2.e(prbVarA, "ads")) == null || (prbVarA2 = bw2.a(wpbVarE2, 0)) == null || (strA = bw2.a(prbVarA2, "ad_mid", "")) == null || !(StringsKt.N(strA) ^ true)) ? false : true);
    }

    public static HashMap c(Rect rect, boolean z, Rational rational, int i, int i2, int i3, Map map) {
        boolean z2 = false;
        jpo.i("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, ((to2) entry.getValue()).a.getWidth(), ((to2) entry.getValue()).a.getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            map2.put((qrm) entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        Rational rationalE0 = sfe.e0(i, rational);
        if (i2 != 3) {
            Matrix matrix2 = new Matrix();
            RectF rectF5 = new RectF(0.0f, 0.0f, rationalE0.getNumerator(), rationalE0.getDenominator());
            if (i2 == 0) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.START);
            } else if (i2 == 1) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.CENTER);
            } else {
                if (i2 != 2) {
                    qp2.n(sko.i(i2, "Unexpected scale type: "));
                    return null;
                }
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.END);
            }
            RectF rectF6 = new RectF();
            matrix2.mapRect(rectF6, rectF5);
            boolean z3 = z ^ (i3 == 1);
            boolean z4 = i == 0 && !z3;
            boolean z5 = i == 90 && z3;
            if (z4 || z5) {
                rectF2 = rectF6;
            } else {
                boolean z6 = i == 0 && z3;
                boolean z7 = i == 270 && !z3;
                if (z6 || z7) {
                    float fCenterX = rectF2.centerX();
                    float f = fCenterX + fCenterX;
                    rectF2 = new RectF(f - rectF6.right, rectF6.top, f - rectF6.left, rectF6.bottom);
                } else {
                    boolean z8 = i == 90 && !z3;
                    boolean z9 = i == 180 && z3;
                    if (z8 || z9) {
                        float fCenterY = rectF2.centerY();
                        float f2 = fCenterY + fCenterY;
                        rectF2 = new RectF(rectF6.left, f2 - rectF6.bottom, rectF6.right, f2 - rectF6.top);
                    } else {
                        boolean z10 = i == 180 && !z3;
                        if (i == 270 && z3) {
                            z2 = true;
                        }
                        if (!z10 && !z2) {
                            throw new IllegalArgumentException("Invalid argument: mirrored " + z3 + " rotation " + i);
                        }
                        float fCenterY2 = rectF2.centerY();
                        float f3 = fCenterY2 + fCenterY2;
                        RectF rectF7 = new RectF(rectF6.left, f3 - rectF6.bottom, rectF6.right, f3 - rectF6.top);
                        float fCenterX2 = rectF2.centerX();
                        float f4 = fCenterX2 + fCenterX2;
                        rectF2 = new RectF(f4 - rectF7.right, rectF7.top, f4 - rectF7.left, rectF7.bottom);
                    }
                }
            }
        }
        HashMap map3 = new HashMap();
        RectF rectF8 = new RectF();
        Matrix matrix3 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix3);
            matrix3.mapRect(rectF8, rectF2);
            Rect rect2 = new Rect();
            rectF8.round(rect2);
            map3.put((qrm) entry2.getKey(), rect2);
        }
        return map3;
    }

    public static final kfl d(f17 f17Var) throws pxb {
        wfl wflVar;
        ifl iflVar = new ifl();
        zch.B(f17Var, mfl.a, new qfl(new qfl(iflVar, (byte) 1), new lrk(1, iflVar, ifl.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, (byte) 4)));
        dee deeVar = new dee();
        dee deeVar2 = iflVar.a;
        Object[] objArr = deeVar2.a;
        int i = deeVar2.b;
        boolean z = true;
        int i2 = 0;
        jfl jflVar = null;
        while (true) {
            wflVar = wfl.b;
            if (i2 >= i) {
                break;
            }
            jfl jflVar2 = (jfl) objArr[i2];
            if (!z || jflVar2 != wflVar) {
                if (jflVar2 == wflVar && jflVar == wflVar) {
                    z = false;
                    break;
                    break;
                }
                if (jflVar2 != wflVar) {
                    dee deeVar3 = iflVar.b;
                    Object[] objArr2 = deeVar3.a;
                    int i3 = deeVar3.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (!((Boolean) ((Function1) objArr2[i4]).invoke(jflVar2)).booleanValue()) {
                            z = false;
                            break;
                        }
                    }
                }
                deeVar.a(jflVar2);
                z = false;
                jflVar = jflVar2;
            }
            i2++;
        }
        if (((jfl) (deeVar.i() ? null : deeVar.a[deeVar.b - 1])) == wflVar) {
            deeVar.l(deeVar.b - 1);
        }
        bee beeVar = deeVar.c;
        if (beeVar == null) {
            beeVar = new bee(deeVar, (byte) 0);
            deeVar.c = beeVar;
        }
        return new kfl(beeVar);
    }

    public static final b0g e(dik dikVar) {
        e0g e0gVarH = z4o.h();
        for (String str : dikVar.names()) {
            l08 l08VarC = dikVar.c(str);
            if (l08VarC == null) {
                l08VarC = l08.a;
            }
            String strD = l75.d(0, 0, 15, str);
            List list = (Iterable) l08VarC;
            ArrayList arrayList = new ArrayList(k95.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(l75.d(0, 0, 11, (String) it.next()));
            }
            e0gVarH.e(strD, arrayList);
        }
        return new g0g(((eik) e0gVarH).b, true);
    }

    public static String i(String str) {
        String host;
        String[] strArr = wqm.a;
        Uri uriD0 = a26.d0(str);
        if (uriD0 != null && wqm.D(uriD0) && (host = uriD0.getHost()) != null) {
            if (host.length() <= 0) {
                host = null;
            }
            if (host != null) {
                String path = uriD0.getPath();
                if (path == null) {
                    path = "";
                }
                return sko.u(aik.s(aik.f(host), wqm.e), StringsKt.U(path, "/"));
            }
        }
        return null;
    }

    public static final void j(Context context) {
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            qs7 qs7VarX = qs7.x();
            String[] strArr = s4o.a;
            qs7VarX.getClass();
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            String[] strArr2 = s4o.a;
            int iA = qbd.a(strArr2.length);
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (String str : strArr2) {
                linkedHashMap.put(new File(databasePath.getPath() + str), new File(file.getPath() + str));
            }
            for (Map.Entry entry : rbd.f(linkedHashMap, new Pair(databasePath, file)).entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        qs7 qs7VarX2 = qs7.x();
                        String[] strArr3 = s4o.a;
                        file3.toString();
                        qs7VarX2.getClass();
                    }
                    if (file2.renameTo(file3)) {
                        file2.toString();
                        file3.toString();
                    } else {
                        file2.toString();
                        file3.toString();
                    }
                    qs7 qs7VarX3 = qs7.x();
                    String[] strArr4 = s4o.a;
                    qs7VarX3.getClass();
                }
            }
        }
    }

    public static final int k(int i, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, -256);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public static final ColorStateList l(int i, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        return colorStateList == null ? ColorStateList.valueOf(-256) : colorStateList;
    }

    public static final c8e m(ih5 ih5Var, c8e c8eVar) {
        pij pijVar;
        unf unfVar = pof.a;
        spf spfVar = (spf) ((vt9) ih5Var).j(tpf.a);
        qij qijVar = wxe.g;
        if (spfVar.c && spfVar.b == l2n.a) {
            pijVar = qijVar.d;
        } else {
            int iOrdinal = spfVar.a.ordinal();
            if (iOrdinal == 0) {
                pijVar = qijVar.a;
            } else if (iOrdinal == 1) {
                pijVar = qijVar.b;
            } else {
                if (iOrdinal != 2) {
                    h9o.p();
                    return null;
                }
                pijVar = qijVar.c;
            }
        }
        return yi4.F(c8eVar, new oij(pijVar.a, pijVar.b, (byte) 0));
    }

    public static final c8e n(ih5 ih5Var, c8e c8eVar) {
        unf unfVar = pof.a;
        spf spfVar = (spf) ((vt9) ih5Var).j(tpf.a);
        return (!(spfVar.c && spfVar.b == l2n.a) && spfVar.a == uga.a) ? c8eVar : a26.Z(c8eVar, 16.0f, 0.0f, 2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    public static final void o(k0j k0jVar, int i, xm6 xm6Var) throws pxb {
        k0j k0jVar2;
        dfe dfeVar = new dfe(new k0j[16]);
        List listI = k0jVar.i(false, false);
        while (true) {
            dfeVar.e(dfeVar.c, listI);
            while (true) {
                int i2 = dfeVar.c;
                if (i2 == 0) {
                    return;
                }
                k0jVar2 = (k0j) dfeVar.l(i2 - 1);
                boolean zP = x7d.p(k0jVar2);
                f0j f0jVar = k0jVar2.d;
                see seeVar = f0jVar.a;
                if (!zP && !seeVar.c(n0j.j)) {
                    wye wyeVarD = k0jVar2.d();
                    if (wyeVarD == null) {
                        throw vep.q("Expected semantics node to have a coordinator.");
                    }
                    ccb ccbVarF0 = f03.f0(rm5.j(wyeVarD, true));
                    if (ccbVarF0.a < ccbVarF0.c && ccbVarF0.b < ccbVarF0.d) {
                        Object objG = f0jVar.a.g(e0j.e);
                        if (objG == null) {
                            objG = null;
                        }
                        Function2 function2 = (Function2) objG;
                        Object objG2 = seeVar.g(n0j.w);
                        eoi eoiVar = (eoi) (objG2 != null ? objG2 : null);
                        if (function2 == null || eoiVar == null || ((Number) eoiVar.b.invoke()).floatValue() <= 0.0f) {
                            break;
                        }
                        int i3 = 1 + i;
                        xm6Var.invoke(new joi(k0jVar2, i3, ccbVarF0, wyeVarD));
                        o(k0jVar2, i3, xm6Var);
                    }
                }
            }
            listI = k0jVar2.i(false, false);
        }
    }

    public b8h f() {
        return null;
    }

    public boolean g() {
        return false;
    }

    public ixh h() {
        return yxj.d;
    }
}
