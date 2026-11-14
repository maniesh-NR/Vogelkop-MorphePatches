package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Rational;
import android.util.TypedValue;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import okhttp3.internal._HeadersCommonKt;
import org.chromium.base.ThreadUtils;

/* loaded from: classes.dex */
public abstract class wxe {
    public static final ue5 a = new ue5(-117337559, new gf5((byte) 12), false);
    public static final ue5 b = new ue5(926906056, new gf5((byte) 13), false);
    public static final ue5 c = new ue5(718620610, new ef5((byte) 27), false);
    public static final int[] d = {R.attr.theme, 2130971106};
    public static final int[] e = {2130970292};
    public static final SerialDescriptor[] f = new SerialDescriptor[0];
    public static final qij g = new qij(new pij(2.1474836E9f, 0.0f), new pij(648.0f, 40.0f), new pij(752.0f, 96.0f), new pij(2.1474836E9f, 16.0f));
    public static final q0n h = new q0n((byte) 17);
    public static final q0n i = new q0n((byte) 18);
    public static final q0n j = new q0n((byte) 19);
    public static final iip k = new iip(7);
    public static Boolean l;

    public static int A(int[] iArr) {
        return iArr[0] & 1;
    }

    public static int B(Context context) throws Resources.NotFoundException {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean z = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(z ? 2131166738 : 2131166737, typedValue, true);
        int i2 = typedValue.type;
        if (i2 == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else {
            if (i2 != 6) {
                return -2;
            }
            int i3 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction(i3, i3);
        }
        return (int) fraction;
    }

    public static ArrayList C(boolean z) {
        qwf qwfVar = qwf.h;
        qwf qwfVar2 = qwf.x;
        qwf qwfVar3 = qwf.s;
        qwf qwfVar4 = qwf.w;
        qwf qwfVar5 = qwf.c;
        qwf qwfVar6 = qwf.d;
        qwf qwfVar7 = qwf.l;
        qwf qwfVar8 = qwf.k;
        qwf qwfVar9 = qwf.m;
        qwf qwfVar10 = qwf.n;
        qwf qwfVar11 = qwf.v;
        qwf qwfVar12 = qwf.z;
        qwf qwfVar13 = qwf.o;
        qwf qwfVar14 = qwf.j;
        qwf qwfVar15 = qwf.t;
        qwf qwfVar16 = qwf.A;
        qwf qwfVar17 = qwf.y;
        qwf qwfVar18 = qwf.u;
        qwf qwfVar19 = qwf.e;
        qwf qwfVar20 = qwf.f;
        qwf qwfVar21 = qwf.g;
        qwf qwfVar22 = qwf.r;
        qwf qwfVar23 = qwf.q;
        qwf qwfVar24 = qwf.i;
        ArrayList arrayListJ = j95.j(new qwf[]{qwfVar2, qwfVar3, qwfVar4, qwfVar5, qwfVar6, qwfVar7, qwfVar8, qwfVar9, qwfVar10, qwfVar11, qwfVar12, qwfVar13, qwfVar14, qwfVar15, qwfVar16, qwfVar17, qwfVar18, qwfVar19, qwfVar20, qwfVar21, qwfVar22, qwfVar23, qwfVar24, qwfVar});
        qwf qwfVar25 = qwf.p;
        if (z) {
            arrayListJ.add(arrayListJ.indexOf(qwfVar6) + 1, qwfVar25);
            return arrayListJ;
        }
        arrayListJ.add(arrayListJ.indexOf(qwfVar24) + 1, qwfVar25);
        return arrayListJ;
    }

    public static Throwable D(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    public static boolean E(int[] iArr, int[] iArr2) {
        for (int i2 = 6; i2 >= 0; i2--) {
            int i3 = iArr[i2] + LinearLayoutManager.INVALID_OFFSET;
            int i4 = iArr2[i2] + LinearLayoutManager.INVALID_OFFSET;
            if (i3 < i4) {
                return false;
            }
            if (i3 > i4) {
                return true;
            }
        }
        return true;
    }

    public static final c8e F(c8e c8eVar) {
        return c8eVar.d(new wzk(uup.d, i));
    }

    public static boolean H(int[] iArr) {
        if (iArr[0] == 1) {
            for (int i2 = 1; i2 < 7; i2++) {
                if (iArr[i2] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean I(lmg lmgVar, long j2, long j3) {
        int i2 = lmgVar.i == 1 ? 1 : 0;
        long j4 = lmgVar.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L));
        float f2 = i2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32)) * f2;
        float f3 = ((int) (j2 >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * f2;
        return (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat > f3) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((float) ((int) (j2 & 4294967295L))) + fIntBitsToFloat4);
    }

    public static boolean J(Context context) {
        Boolean boolValueOf = l;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0).size() > 0);
            l = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean K(int[] iArr) {
        for (int i2 = 0; i2 < 7; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static final itb L(ytb ytbVar) {
        itb itbVarG = ytbVar.g();
        if (itbVarG instanceof itb) {
            return itbVarG;
        }
        if (!(itbVarG instanceof aam)) {
            s49.l(itbVarG, "Only KClass supported as classifier, got ");
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + itbVarG + " from generic non-reified function. Such functionality cannot be supported because " + itbVarG + " is erased, either specify serializer explicitly or make calling function inline with reified " + itbVarG + '.');
    }

    public static String M(hra hraVar) throws NoSuchAlgorithmException {
        byte[] bytes = hraVar.h.getBytes(Charsets.UTF_8);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(bytes, 0, bytes.length);
        return new g54(messageDigest.digest()).i();
    }

    public static List N(List list, int i2, Rect rect, Rational rational, int i3, hyd hydVar) {
        PointF pointF;
        if (list.isEmpty() || i2 == 0) {
            return l08.a;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gyd gydVar = (gyd) it.next();
            if (arrayList.size() >= i2) {
                break;
            }
            float f2 = gydVar.a;
            if (f2 >= 0.0f && f2 <= 1.0f) {
                float f3 = gydVar.b;
                if (f3 >= 0.0f && f3 <= 1.0f) {
                    Rational rational3 = gydVar.d;
                    if (rational3 == null) {
                        rational3 = rational;
                    }
                    PointF pointFH = hydVar.h(gydVar, i3);
                    if (rational3.equals(rational2)) {
                        pointF = new PointF(pointFH.x, pointFH.y);
                    } else if (rational3.compareTo(rational2) > 0) {
                        pointF = new PointF(pointFH.x, pointFH.y);
                        float fDoubleValue = (float) (rational3.doubleValue() / rational2.doubleValue());
                        pointF.y = (1.0f / fDoubleValue) * (((float) ((fDoubleValue - 1.0d) / 2.0d)) + pointF.y);
                    } else {
                        pointF = new PointF(pointFH.x, pointFH.y);
                        float fDoubleValue2 = (float) (rational2.doubleValue() / rational3.doubleValue());
                        pointF.x = (1.0f / fDoubleValue2) * (((float) ((fDoubleValue2 - 1.0d) / 2.0d)) + pointF.x);
                    }
                    float f4 = gydVar.c;
                    int iWidth = (int) ((pointF.x * rect.width()) + rect.left);
                    int iHeight = (int) ((pointF.y * rect.height()) + rect.top);
                    int iWidth2 = ((int) (rect.width() * f4)) / 2;
                    int iHeight2 = ((int) (f4 * rect.height())) / 2;
                    Rect rect2 = new Rect(iWidth - iWidth2, iHeight - iHeight2, iWidth + iWidth2, iHeight + iHeight2);
                    rect2.left = djh.c(rect2.left, rect.left, rect.right);
                    rect2.right = djh.c(rect2.right, rect.left, rect.right);
                    rect2.top = djh.c(rect2.top, rect.top, rect.bottom);
                    rect2.bottom = djh.c(rect2.bottom, rect.top, rect.bottom);
                    arrayList.add(new MeteringRectangle(rect2, 1000));
                }
            }
        }
        return arrayList;
    }

    public static void O(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = iArr2[0] & 4294967295L;
        long j3 = iArr2[1] & 4294967295L;
        long j4 = iArr2[2] & 4294967295L;
        long j5 = iArr2[3] & 4294967295L;
        long j6 = iArr2[4] & 4294967295L;
        long j7 = iArr2[5] & 4294967295L;
        long j8 = iArr2[6] & 4294967295L;
        long j9 = iArr[0] & 4294967295L;
        long j10 = j9 * j2;
        iArr3[0] = (int) j10;
        char c2 = ' ';
        long j11 = (j9 * j3) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (j9 * j4) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (j9 * j5) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (j9 * j6) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (j9 * j7) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (j9 * j8) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        iArr3[7] = (int) (j16 >>> 32);
        int i2 = 1;
        for (int i3 = 7; i2 < i3; i3 = 7) {
            long j17 = iArr[i2] & 4294967295L;
            char c3 = c2;
            long j18 = j8;
            long j19 = (j17 * j2) + (iArr3[i2] & 4294967295L);
            iArr3[i2] = (int) j19;
            long j20 = j17 * j3;
            int i4 = i2 + 1;
            long j21 = j20 + (iArr3[i4] & 4294967295L) + (j19 >>> c3);
            iArr3[i4] = (int) j21;
            long j22 = (j17 * j4) + (iArr3[r8] & 4294967295L) + (j21 >>> c3);
            iArr3[i2 + 2] = (int) j22;
            long j23 = (j17 * j5) + (iArr3[r8] & 4294967295L) + (j22 >>> c3);
            iArr3[i2 + 3] = (int) j23;
            long j24 = (j17 * j6) + (iArr3[r8] & 4294967295L) + (j23 >>> c3);
            iArr3[i2 + 4] = (int) j24;
            long j25 = (j17 * j7) + (iArr3[r8] & 4294967295L) + (j24 >>> c3);
            iArr3[i2 + 5] = (int) j25;
            long j26 = (j17 * j18) + (iArr3[r8] & 4294967295L) + (j25 >>> c3);
            iArr3[i2 + 6] = (int) j26;
            iArr3[i2 + 7] = (int) (j26 >>> c3);
            c2 = c3;
            i2 = i4;
            j8 = j18;
        }
    }

    public static int P(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = iArr2[0] & 4294967295L;
        long j3 = iArr2[1] & 4294967295L;
        long j4 = iArr2[2] & 4294967295L;
        long j5 = iArr2[3] & 4294967295L;
        long j6 = iArr2[4] & 4294967295L;
        long j7 = iArr2[5] & 4294967295L;
        long j8 = iArr2[6] & 4294967295L;
        long j9 = 0;
        int i2 = 0;
        while (i2 < 7) {
            long j10 = j8;
            long j11 = iArr[i2] & 4294967295L;
            long j12 = (iArr3[i2] & 4294967295L) + (j11 * j2);
            iArr3[i2] = (int) j12;
            int i3 = i2 + 1;
            long j13 = (j11 * j3) + (iArr3[i3] & 4294967295L) + (j12 >>> 32);
            iArr3[i3] = (int) j13;
            long j14 = (j11 * j4) + (iArr3[r15] & 4294967295L) + (j13 >>> 32);
            int i4 = i2;
            iArr3[i2 + 2] = (int) j14;
            long j15 = (j11 * j5) + (iArr3[r2] & 4294967295L) + (j14 >>> 32);
            iArr3[i4 + 3] = (int) j15;
            long j16 = (j11 * j6) + (iArr3[r2] & 4294967295L) + (j15 >>> 32);
            iArr3[i4 + 4] = (int) j16;
            long j17 = (j11 * j7) + (iArr3[r2] & 4294967295L) + (j16 >>> 32);
            iArr3[i4 + 5] = (int) j17;
            long j18 = (j11 * j10) + (iArr3[r2] & 4294967295L) + (j17 >>> 32);
            iArr3[i4 + 6] = (int) j18;
            long j19 = (j18 >>> 32) + (iArr3[r2] & 4294967295L) + j9;
            iArr3[i4 + 7] = (int) j19;
            j9 = j19 >>> 32;
            i2 = i3;
            j8 = j10;
        }
        return (int) j9;
    }

    public static final c8e Q(c8e c8eVar) {
        return c8eVar.d(new wzk(uup.d, j));
    }

    public static final long T(lmg lmgVar, boolean z) {
        long jD = y8f.d(lmgVar.c, lmgVar.g);
        if (z || !lmgVar.c()) {
            return jD;
        }
        return 0L;
    }

    public static int U(tlh tlhVar) throws IOException {
        try {
            long jL = tlhVar.l();
            String strM = tlhVar.M(Long.MAX_VALUE);
            if (jL >= 0 && jL <= 2147483647L && strM.length() <= 0) {
                return (int) jL;
            }
            throw new IOException("expected an int but was \"" + jL + strM + '\"');
        } catch (NumberFormatException e2) {
            s49.m(e2.getMessage());
            return 0;
        }
    }

    public static void V(int i2) {
        ioh.y(i2, 8, "Android.UIDialogShown");
    }

    public static final c8e W(c8e c8eVar) {
        return c8eVar.d(new wzk(uup.d, h));
    }

    public static final Object X(vg9 vg9Var, int i2, Function1 function1) throws pxb {
        int i3;
        Object objInvoke;
        b8e b8eVarU;
        e5c e5cVarX0;
        tah tahVar;
        if (!vg9Var.a.n) {
            a8b.b("visitAncestors called on an unattached node");
        }
        b8e b8eVar = vg9Var.a.e;
        m3c m3cVarE0 = ui6.e0(vg9Var);
        loop0: while (true) {
            i3 = 0;
            objInvoke = null;
            if (m3cVarE0 == null) {
                b8eVarU = null;
                break;
            }
            if ((((b8e) m3cVarE0.F.g).d & 1024) != 0) {
                while (b8eVar != null) {
                    if ((b8eVar.c & 1024) != 0) {
                        b8eVarU = b8eVar;
                        dfe dfeVar = null;
                        while (b8eVarU != null) {
                            if (b8eVarU instanceof vg9) {
                                break loop0;
                            }
                            if ((b8eVarU.c & 1024) != 0 && (b8eVarU instanceof i17)) {
                                int i4 = 0;
                                for (b8e b8eVar2 = ((i17) b8eVarU).p; b8eVar2 != null; b8eVar2 = b8eVar2.f) {
                                    if ((b8eVar2.c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            b8eVarU = b8eVar2;
                                        } else {
                                            if (dfeVar == null) {
                                                dfeVar = new dfe(new b8e[16]);
                                            }
                                            if (b8eVarU != null) {
                                                dfeVar.c(b8eVarU);
                                                b8eVarU = null;
                                            }
                                            dfeVar.c(b8eVar2);
                                        }
                                    }
                                }
                                if (i4 != 1) {
                                }
                            }
                            b8eVarU = ui6.U(dfeVar);
                        }
                    }
                    b8eVar = b8eVar.e;
                }
            }
            m3cVarE0 = m3cVarE0.u();
            b8eVar = (m3cVarE0 == null || (tahVar = m3cVarE0.F) == null) ? null : (lbl) tahVar.f;
        }
        vg9 vg9Var2 = (vg9) b8eVarU;
        if ((vg9Var2 == null || !Intrinsics.a(vg9Var2.X0(), vg9Var.X0())) && (e5cVarX0 = vg9Var.X0()) != null) {
            int i5 = 5;
            if (i2 != 5) {
                i5 = 6;
                if (i2 != 6) {
                    i5 = 3;
                    if (i2 != 3) {
                        i5 = 4;
                        if (i2 != 4) {
                            i5 = 2;
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    i5 = 1;
                                } else {
                                    qp2.n("Unsupported direction for beyond bounds layout");
                                }
                            }
                        }
                    }
                }
            }
            if (e5cVarX0.o.getItemCount() <= 0 || !e5cVarX0.o.b() || !e5cVarX0.n) {
                return function1.invoke(e5c.r);
            }
            boolean zU0 = e5cVarX0.U0(i5);
            f5c f5cVar = e5cVarX0.o;
            int iD = zU0 ? f5cVar.d() : f5cVar.c();
            pqh pqhVar = new pqh();
            nv6 nv6Var = e5cVarX0.p;
            nv6Var.getClass();
            a5c a5cVar = new a5c(iD, iD);
            ((dfe) nv6Var.a).c(a5cVar);
            pqhVar.a = a5cVar;
            int iA = e5cVarX0.o.a() << 1;
            int itemCount = e5cVarX0.o.getItemCount();
            if (iA > itemCount) {
                iA = itemCount;
            }
            while (objInvoke == null && e5cVarX0.T0((a5c) pqhVar.a, i5) && i3 < iA) {
                a5c a5cVar2 = (a5c) pqhVar.a;
                int i6 = a5cVar2.a;
                int i7 = a5cVar2.b;
                if (e5cVarX0.U0(i5)) {
                    i7++;
                } else {
                    i6--;
                }
                nv6 nv6Var2 = e5cVarX0.p;
                nv6Var2.getClass();
                a5c a5cVar3 = new a5c(i6, i7);
                ((dfe) nv6Var2.a).c(a5cVar3);
                ((dfe) e5cVarX0.p.a).k((a5c) pqhVar.a);
                pqhVar.a = a5cVar3;
                i3++;
                ui6.e0(e5cVarX0).k();
                objInvoke = function1.invoke(new d5c(e5cVarX0, pqhVar, i5));
            }
            ((dfe) e5cVarX0.p.a).k((a5c) pqhVar.a);
            ui6.e0(e5cVarX0).k();
            return objInvoke;
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o2j */
    public static final void Y(itb itbVar) throws o2j {
        String strC = ((s15) itbVar).c();
        if (strC == null) {
            strC = "<local class name not available>";
        }
        throw new o2j(sko.k("Serializer for class '", strC, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static void Z(int[] iArr, int[] iArr2) {
        long j2 = iArr[0] & 4294967295L;
        int i2 = 14;
        int i3 = 0;
        int i4 = 6;
        while (true) {
            int i5 = i4 - 1;
            long j3 = iArr[i4] & 4294967295L;
            long j4 = j3 * j3;
            iArr2[i2 - 1] = (i3 << 31) | ((int) (j4 >>> 33));
            i2 -= 2;
            iArr2[i2] = (int) (j4 >>> 1);
            i3 = (int) j4;
            if (i5 <= 0) {
                long j5 = j2 * j2;
                long j6 = ((i3 << 31) & 4294967295L) | (j5 >>> 33);
                iArr2[0] = (int) j5;
                int i6 = ((int) (j5 >>> 32)) & 1;
                long j7 = iArr[1] & 4294967295L;
                long j8 = (j7 * j2) + j6;
                int i7 = (int) j8;
                iArr2[1] = (i7 << 1) | i6;
                long j9 = (iArr2[2] & 4294967295L) + (j8 >>> 32);
                long j10 = iArr[2] & 4294967295L;
                long j11 = j9 + (j10 * j2);
                int i8 = (int) j11;
                iArr2[2] = (i8 << 1) | (i7 >>> 31);
                long jD = osp.d(j10, j7, j11 >>> 32, iArr2[3] & 4294967295L);
                long j12 = (iArr2[4] & 4294967295L) + (jD >>> 32);
                long j13 = iArr[3] & 4294967295L;
                long j14 = (iArr2[5] & 4294967295L) + (j12 >>> 32);
                long j15 = (iArr2[6] & 4294967295L) + (j14 >>> 32);
                long j16 = j14 & 4294967295L;
                long j17 = (j13 * j2) + (jD & 4294967295L);
                int i9 = (int) j17;
                iArr2[3] = (i9 << 1) | (i8 >>> 31);
                long jD2 = osp.d(j13, j7, j17 >>> 32, j12 & 4294967295L);
                long jD3 = osp.d(j13, j10, jD2 >>> 32, j16);
                long j18 = j15 + (jD3 >>> 32);
                long j19 = jD3 & 4294967295L;
                long j20 = iArr[4] & 4294967295L;
                long j21 = (iArr2[7] & 4294967295L) + (j18 >>> 32);
                long j22 = j18 & 4294967295L;
                long j23 = (iArr2[8] & 4294967295L) + (j21 >>> 32);
                long j24 = (jD2 & 4294967295L) + (j20 * j2);
                int i10 = (int) j24;
                iArr2[4] = (i10 << 1) | (i9 >>> 31);
                long jD4 = osp.d(j20, j7, j24 >>> 32, j19);
                long jD5 = osp.d(j20, j10, jD4 >>> 32, j22);
                long jD6 = osp.d(j20, j13, jD5 >>> 32, j21 & 4294967295L);
                long j25 = jD5 & 4294967295L;
                long j26 = j23 + (jD6 >>> 32);
                long j27 = iArr[5] & 4294967295L;
                long j28 = (iArr2[9] & 4294967295L) + (j26 >>> 32);
                long j29 = (iArr2[10] & 4294967295L) + (j28 >>> 32);
                long j30 = j28 & 4294967295L;
                long j31 = (j27 * j2) + (jD4 & 4294967295L);
                int i11 = (int) j31;
                iArr2[5] = (i11 << 1) | (i10 >>> 31);
                long jD7 = osp.d(j27, j7, j31 >>> 32, j25);
                long jD8 = osp.d(j27, j10, jD7 >>> 32, jD6 & 4294967295L);
                long jD9 = osp.d(j27, j13, jD8 >>> 32, j26 & 4294967295L);
                long j32 = jD8 & 4294967295L;
                long jD10 = osp.d(j27, j20, jD9 >>> 32, j30);
                long j33 = jD9 & 4294967295L;
                long j34 = j29 + (jD10 >>> 32);
                long j35 = iArr[6] & 4294967295L;
                long j36 = (iArr2[11] & 4294967295L) + (j34 >>> 32);
                long j37 = (jD7 & 4294967295L) + (j35 * j2);
                int i12 = (int) j37;
                iArr2[6] = (i12 << 1) | (i11 >>> 31);
                long jD11 = osp.d(j35, j7, j37 >>> 32, j32);
                long jD12 = osp.d(j35, j10, jD11 >>> 32, j33);
                long jD13 = osp.d(j35, j13, jD12 >>> 32, jD10 & 4294967295L);
                long jD14 = osp.d(j35, j20, jD13 >>> 32, j34 & 4294967295L);
                long jD15 = osp.d(j35, j27, jD14 >>> 32, j36 & 4294967295L);
                long j38 = (iArr2[12] & 4294967295L) + (j36 >>> 32) + (jD15 >>> 32);
                int i13 = (int) jD11;
                iArr2[7] = (i13 << 1) | (i12 >>> 31);
                int i14 = (int) jD12;
                iArr2[8] = (i14 << 1) | (i13 >>> 31);
                int i15 = (int) jD13;
                iArr2[9] = (i15 << 1) | (i14 >>> 31);
                int i16 = (int) jD14;
                iArr2[10] = (i16 << 1) | (i15 >>> 31);
                int i17 = (int) jD15;
                iArr2[11] = (i17 << 1) | (i16 >>> 31);
                int i18 = (int) j38;
                iArr2[12] = (i18 << 1) | (i17 >>> 31);
                iArr2[13] = ((iArr2[13] + ((int) (j38 >>> 32))) << 1) | (i18 >>> 31);
                return;
            }
            i4 = i5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(j23 j23Var, Function2 function2, c8e c8eVar, ih5 ih5Var, int i2) {
        c8e c8eVar2;
        Object next;
        long j2;
        long j3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-874084667);
        int i3 = i2 | (vt9Var.f(j23Var) ? 4 : 2) | (vt9Var.h(function2) ? 32 : 16);
        byte b2 = 0;
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            n13 n13Var = j23Var.e;
            String str = j23Var.d;
            jk8 jk8Var = jk8.a;
            Iterator it = jk8.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.a(((jk8) next).name(), str)) {
                        break;
                    }
                }
            }
            jk8 jk8Var2 = (jk8) next;
            if (jk8Var2 != null) {
                jk8Var = jk8Var2;
            }
            mk8 mk8VarA = ((kk8) vt9Var.j(lk8.a)).a(jk8Var);
            long j4 = mk8VarA.c;
            boolean zF = vt9Var.f(n13Var) | vt9Var.f(mk8VarA);
            Object objK = vt9Var.K();
            if (zF || objK == hh5.a) {
                if (n13Var != null) {
                    List list = n13Var.a;
                    ArrayList arrayList = new ArrayList(k95.o(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new u95(cs5.d(Long.parseLong(StringsKt.T((String) it2.next(), "#"), CharsKt.checkRadix(16)) | 4278190080L)));
                    }
                    vec vecVarW = arrayList.size() == 1 ? zpa.W(Arrays.asList(arrayList.get(0), arrayList.get(0))) : zpa.W(arrayList);
                    if (cs5.f0(((u95) CollectionsKt.K(arrayList)).a) < 0.5d) {
                        j2 = u95.c;
                        j3 = u95.b;
                    } else {
                        j2 = u95.b;
                        j3 = u95.c;
                    }
                    long j5 = j3;
                    long j6 = j2;
                    objK = new dyh(vecVarW, j6, j6, j5);
                } else {
                    objK = new dyh(new vec(Arrays.asList(new u95(j4), new u95(j4)), null, 0L, 2139095040L, 0), mk8VarA.d, mk8VarA.a, mk8VarA.b);
                }
                vt9Var.g0(objK);
            }
            c8eVar2 = c8eVar;
            c26.a(mpj.e(c8eVar2.d(mpj.a), 138.0f, 2), ((acj) vt9Var.j(ccj.a)).d, i41.j(u95.f, vt9Var, 24582), null, gyg.P(1647089555, new f23((dyh) objK, j23Var, function2, b2), vt9Var), vt9Var, 196608, 24);
        } else {
            c8eVar2 = c8eVar;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new g9(j23Var, function2, c8eVar2, i2, (byte) 4);
        }
    }

    public static String a0(int i2) {
        switch (i2) {
            case 0:
                return "NOT_STARTED";
            case 1:
                return "STARTED";
            case 2:
                return "REDIRECT_RECEIVED";
            case 3:
                return "AWAITING_FOLLOW_REDIRECT";
            case 4:
                return "AWAITING_READ";
            case 5:
                return "READING";
            case 6:
                return "ERROR";
            case 7:
                return "COMPLETE";
            case 8:
                return "CANCELLED";
            default:
                qp2.o(sko.i(i2, "Unknown state "));
                return null;
        }
    }

    public static final void b(gpm gpmVar, o13 o13Var, c8e c8eVar, ih5 ih5Var, int i2) {
        vt9 vt9Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(986337312);
        int i3 = i2 | (vt9Var2.h(gpmVar) ? 4 : 2) | (vt9Var2.d(o13Var == null ? -1 : o13Var.ordinal()) ? 32 : 16);
        if (vt9Var2.N(i3 & 1, (i3 & 147) != 146)) {
            int i4 = o13Var != null ? i23.a[o13Var.ordinal()] : -1;
            td3 td3Var = i4 != 1 ? i4 != 2 ? rbe.f : rbe.i : rbe.c;
            if (((Boolean) vt9Var2.j(cab.a)).booleanValue()) {
                vt9Var2.W(2103971623);
                vt9Var = vt9Var2;
                xf8.j(iza.a((dl7) tk7.u.getValue(), vt9Var2), null, c8eVar, td3Var, null, 0.0f, null, vt9Var, 440, 112);
                vt9Var.p(false);
            } else {
                vt9Var2.W(2104179943);
                hn9.a(gpmVar.g, null, c8eVar, td3Var, jr5.c, null, vt9Var2, 1573296, 1944);
                vt9Var = vt9Var2;
                vt9Var.p(false);
            }
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new g9(gpmVar, o13Var, c8eVar, i2, (byte) 5);
        }
    }

    public static int b0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j2 >> 32);
        iArr3[1] = (int) j3;
        long j4 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j3 >> 32);
        iArr3[2] = (int) j4;
        long j5 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j4 >> 32);
        iArr3[3] = (int) j5;
        long j6 = ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L)) + (j5 >> 32);
        iArr3[4] = (int) j6;
        long j7 = ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L)) + (j6 >> 32);
        iArr3[5] = (int) j7;
        long j8 = ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L)) + (j7 >> 32);
        iArr3[6] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static final void c(String str, Function0 function0, u8i u8iVar, c8e c8eVar, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-191829354);
        int i3 = (vt9Var.f(str) ? 4 : 2) | i2 | (vt9Var.h(function0) ? 32 : 16) | (vt9Var.f(u8iVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.f(c8eVar) ? 2048 : 1024);
        if (vt9Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            x62 x62Var = new x62(4.0f, true, new t40((byte) 19));
            c8e c8eVarQ = jpo.q(a26.Y(sfe.C(c8eVar, u95.b(u95.b, 0.5f), u8iVar), 8.0f, 4.0f), false, (String) null, function0, 15);
            o9i o9iVarA = m9i.a(x62Var, rbe.k, vt9Var, 6);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarQ);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            kfo.c(aq5.a.a(new u95(u95.c)), gyg.P(1685209842, new lx0(str, (byte) 5), vt9Var), vt9Var, 56);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new px0(str, function0, u8iVar, c8eVar, i2, (byte) 2);
        }
    }

    public static BigInteger c0(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i2 = 0; i2 < 7; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                sfe.h0(i3, (6 - i2) << 2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static final void d(Object obj, int i2, r5c r5cVar, ue5 ue5Var, ih5 ih5Var, int i3) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(872548579);
        int i4 = (vt9Var.h(obj) ? 4 : 2) | i3 | (vt9Var.d(i2) ? 32 : 16) | (vt9Var.h(r5cVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        if (vt9Var.N(i4 & 1, (i4 & 1171) != 1170)) {
            boolean zF = vt9Var.f(obj) | vt9Var.f(r5cVar);
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (zF || objK == zpaVar) {
                objK = new q5c(obj, r5cVar);
                vt9Var.g0(objK);
            }
            q5c q5cVar = (q5c) objK;
            q5cVar.c = i2;
            t0g t0gVar = q5cVar.g;
            hp7 hp7Var = yeg.a;
            q5c q5cVar2 = (q5c) vt9Var.j(hp7Var);
            ttj ttjVarT = bwg.t();
            Function1 function1E = ttjVarT != null ? ttjVarT.e() : null;
            ttj ttjVarX = bwg.x(ttjVarT);
            try {
                if (q5cVar2 != ((q5c) t0gVar.getValue())) {
                    t0gVar.setValue(q5cVar2);
                    if (q5cVar.d > 0) {
                        q5c q5cVar3 = q5cVar.e;
                        if (q5cVar3 != null) {
                            q5cVar3.b();
                        }
                        if (q5cVar2 != null) {
                            q5cVar2.a();
                        } else {
                            q5cVar2 = null;
                        }
                        q5cVar.e = q5cVar2;
                    }
                }
                bwg.A(ttjVarT, ttjVarX, function1E);
                boolean zF2 = vt9Var.f(q5cVar);
                Object objK2 = vt9Var.K();
                if (zF2 || objK2 == zpaVar) {
                    objK2 = new nna((Object) q5cVar, (byte) 15);
                    vt9Var.g0(objK2);
                }
                rm5.b(q5cVar, (Function1) objK2, vt9Var);
                kfo.c(hp7Var.a(q5cVar), ue5Var, vt9Var, 56);
            } catch (Throwable th) {
                bwg.A(ttjVarT, ttjVarX, function1E);
                throw th;
            }
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ga1(obj, i2, r5cVar, ue5Var, i3, (byte) 8);
        }
    }

    public static void d0(String str, Object... objArr) {
        x(str, D(objArr), objArr);
    }

    public static int e(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j2 >>> 32);
        iArr3[1] = (int) j3;
        long j4 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j3 >>> 32);
        iArr3[2] = (int) j4;
        long j5 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j4 >>> 32);
        iArr3[3] = (int) j5;
        long j6 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j5 >>> 32);
        iArr3[4] = (int) j6;
        long j7 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j6 >>> 32);
        iArr3[5] = (int) j7;
        long j8 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (j7 >>> 32);
        iArr3[6] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static Set e0(e9a e9aVar) {
        int size = e9aVar.size();
        TreeSet treeSet = null;
        for (int i2 = 0; i2 < size; i2++) {
            if ("Vary".equalsIgnoreCase(_HeadersCommonKt.commonName(e9aVar, i2))) {
                String strCommonValue = _HeadersCommonKt.commonValue(e9aVar, i2);
                if (treeSet == null) {
                    treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                Iterator it = StringsKt.X(strCommonValue, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(StringsKt.l0((String) it.next()).toString());
                }
            }
        }
        return treeSet == null ? v08.a : treeSet;
    }

    public static int f(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j2 >>> 32);
        iArr3[1] = (int) j3;
        long j4 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j3 >>> 32);
        iArr3[2] = (int) j4;
        long j5 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j4 >>> 32);
        iArr3[3] = (int) j5;
        long j6 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L) + (j5 >>> 32);
        iArr3[4] = (int) j6;
        long j7 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L) + (j6 >>> 32);
        iArr3[5] = (int) j7;
        long j8 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L) + (j7 >>> 32);
        iArr3[6] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static Context f0(int i2, int i3, Context context, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e, i2, i3);
        int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
        typedArrayObtainStyledAttributes.recycle();
        int i4 = iArr2[0];
        boolean z = (context instanceof ft5) && ((ft5) context).a == i4;
        if (i4 == 0 || z) {
            return context;
        }
        ft5 ft5Var = new ft5(context, i4);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i5 = 0; i5 < iArr.length; i5++) {
                iArr3[i5] = typedArrayObtainStyledAttributes2.getResourceId(i5, 0);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = iArr3[i6];
            if (i7 != 0) {
                ft5Var.getTheme().applyStyle(i7, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, d);
        int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, 0);
        typedArrayObtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            ft5Var.getTheme().applyStyle(resourceId, true);
        }
        return ft5Var;
    }

    public static Context g0(Context context, AttributeSet attributeSet, int i2, int i3) {
        return f0(i2, i3, context, attributeSet, new int[0]);
    }

    public static final Set h(SerialDescriptor serialDescriptor) {
        if (serialDescriptor instanceof a84) {
            return ((a84) serialDescriptor).a();
        }
        HashSet hashSet = new HashSet(serialDescriptor.e());
        int iE = serialDescriptor.e();
        for (int i2 = 0; i2 < iE; i2++) {
            hashSet.add(serialDescriptor.f(i2));
        }
        return hashSet;
    }

    public static final boolean j(lmg lmgVar) {
        return (lmgVar.c() || lmgVar.h || !lmgVar.d) ? false : true;
    }

    public static final boolean k(lmg lmgVar) {
        return !lmgVar.h && lmgVar.d;
    }

    public static final boolean l(lmg lmgVar) {
        return (lmgVar.c() || !lmgVar.h || lmgVar.d) ? false : true;
    }

    public static final boolean m(lmg lmgVar) {
        return lmgVar.h && !lmgVar.d;
    }

    public static void n() {
        if (ThreadUtils.e()) {
            return;
        }
        qp2.g("Should be on UI thread.");
    }

    public static final void o(long j2, fsf fsfVar) {
        if (fsfVar == fsf.a) {
            if (yo5.g(j2) == Integer.MAX_VALUE) {
                d8b.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else {
            if (yo5.h(j2) != Integer.MAX_VALUE) {
                return;
            }
            d8b.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static cn6 p(ae5 ae5Var, String str) {
        bn6 bn6VarB = ae5Var.b();
        rcc lifecycle = ae5Var.getLifecycle();
        kw6 kw6VarC = ae5Var.c();
        if (kw6VarC.b.containsKey(str)) {
            t14.c(sko.k("The key \"", str, "\" is already in use."));
            return null;
        }
        i2j i2jVar = k2j.Companion;
        kw6 kw6Var = new kw6((k2j) kw6VarC.a(str, i2jVar.serializer()));
        kw6VarC.b(str, i2jVar.serializer(), new q2(0, kw6Var, kw6.class, "save", "save()Lcom/arkivanov/essenty/statekeeper/SerializableContainer;", 0, (byte) 21));
        nrl nrlVarA = ae5Var.a();
        aw4 aw4Var = (bbb) ((HashMap) nrlVarA.b).get(str);
        if (aw4Var == null) {
            aw4Var = new aw4();
            nrlVarA.J(str, aw4Var);
        }
        nrl nrlVar = aw4Var.a;
        zm6 zm6VarM = gyg.m(ae5Var.d(), 0);
        bn6VarB.getClass();
        return new cn6(lifecycle, kw6Var, nrlVar, zm6VarM);
    }

    public static final SerialDescriptor[] q(List list) {
        SerialDescriptor[] serialDescriptorArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? f : serialDescriptorArr;
    }

    public static void r(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static void s(int[] iArr, int[] iArr2, int i2) {
        iArr2[i2] = iArr[0];
        iArr2[i2 + 1] = iArr[1];
        iArr2[i2 + 2] = iArr[2];
        iArr2[i2 + 3] = iArr[3];
        iArr2[i2 + 4] = iArr[4];
        iArr2[i2 + 5] = iArr[5];
        iArr2[i2 + 6] = iArr[6];
    }

    public static void t(String str, Object... objArr) {
        x(str, D(objArr), objArr);
    }

    public static byte[] u(String str) {
        if (str.length() % 2 != 0) {
            qp2.o("Expected a string of even length");
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 << 1;
            int iDigit = Character.digit(str.charAt(i3), 16);
            int iDigit2 = Character.digit(str.charAt(i3 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                qp2.o("input is not hexadecimal");
                return null;
            }
            bArr[i2] = (byte) ((iDigit << 4) + iDigit2);
        }
        return bArr;
    }

    public static boolean v(int[] iArr, int[] iArr2) {
        for (int i2 = 6; i2 >= 0; i2--) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static final c8e w(c8e c8eVar, kg9 kg9Var) {
        return c8eVar.d(new lg9(kg9Var));
    }

    public static void x(String str, Throwable th, Object[] objArr) {
        if ((th != null || objArr.length <= 0) && objArr.length <= 1) {
            return;
        }
        String.format(Locale.US, str, objArr);
    }

    public static int[] y(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            hai.d();
            return null;
        }
        int[] iArr = new int[7];
        for (int i2 = 0; i2 < 7; i2++) {
            iArr[i2] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArr;
    }

    public static y10 z(int i2) {
        Object next;
        Iterator it = y10.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((y10) next).a == i2) {
                break;
            }
        }
        return (y10) next;
    }

    public boolean G() {
        return false;
    }

    public void R() {
    }

    public abstract void S();

    public abstract int g(int i2, int i3, d2c d2cVar, ifg ifgVar, int i4);

    public Integer i(ifg ifgVar) {
        return null;
    }
}
