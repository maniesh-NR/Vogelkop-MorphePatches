package defpackage;

import ads_mobile_sdk.eq2;
import ads_mobile_sdk.kh3;
import ads_mobile_sdk.tv0;
import ads_mobile_sdk.vv0;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.opera.android.firebase.OperaFirebaseMessagingService;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KTypeProjection;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class rih {
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r24, kotlin.jvm.functions.Function0 r25, defpackage.c8e r26, boolean r27, defpackage.qih r28, defpackage.ih5 r29, int r30) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rih.b(boolean, kotlin.jvm.functions.Function0, c8e, boolean, qih, ih5, int):void");
    }

    public static final void c(vv0 vv0Var, kh3 kh3Var) {
        String str = kh3Var.a.a;
        ffp ffpVar = vv0Var.a;
        ffpVar.b$1();
        ((tv0) ffpVar.b).s(str);
        eq2 eq2Var = kh3Var.a;
        String str2 = eq2Var.b;
        ffpVar.b$1();
        ((tv0) ffpVar.b).c(str2);
        String str3 = eq2Var.g;
        ffpVar.b$1();
        ((tv0) ffpVar.b).r(str3);
        String str4 = kh3Var.b.b;
        ffpVar.b$1();
        ((tv0) ffpVar.b).l(str4);
        String str5 = kh3Var.c.d;
        ffpVar.b$1();
        ((tv0) ffpVar.b).m(str5);
        String str6 = kh3Var.c.e;
        ffpVar.b$1();
        ((tv0) ffpVar.b).n(str6);
        int i = kh3Var.b.e;
        ffpVar.b$1();
        ((tv0) ffpVar.b).mediationChainLength_ = i;
        String str7 = kh3Var.d.c;
        ffpVar.b$1();
        ((tv0) ffpVar.b).h(str7);
        String str8 = kh3Var.d.b;
        ffpVar.b$1();
        ((tv0) ffpVar.b).b(str8);
        int iB = exg.b(eq2Var.c);
        ffpVar.b$1();
        tv0 tv0Var = (tv0) ffpVar.b;
        tv0Var.getClass();
        tv0Var.format_ = p3p._getNumber$4(iB);
    }

    public static void d(OperaFirebaseMessagingService operaFirebaseMessagingService, String str) throws Throwable {
        FileOutputStream fileOutputStreamOpenFileOutput;
        DataOutputStream dataOutputStream = null;
        try {
            fileOutputStreamOpenFileOutput = operaFirebaseMessagingService.openFileOutput(".syncpush", 32768);
            try {
                if (TextUtils.isEmpty(str)) {
                    fileOutputStreamOpenFileOutput.write(0);
                } else {
                    fileOutputStreamOpenFileOutput.write(1);
                    DataOutputStream dataOutputStream2 = new DataOutputStream(fileOutputStreamOpenFileOutput);
                    try {
                        dataOutputStream2.writeUTF(str);
                        dataOutputStream = dataOutputStream2;
                    } catch (FileNotFoundException | IOException unused) {
                        dataOutputStream = dataOutputStream2;
                        xvg.l(dataOutputStream);
                        xvg.l(fileOutputStreamOpenFileOutput);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        dataOutputStream = dataOutputStream2;
                        xvg.l(dataOutputStream);
                        xvg.l(fileOutputStreamOpenFileOutput);
                        throw th;
                    }
                }
                xvg.l(dataOutputStream);
                xvg.l(fileOutputStreamOpenFileOutput);
            } catch (FileNotFoundException | IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException | IOException unused3) {
            fileOutputStreamOpenFileOutput = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStreamOpenFileOutput = null;
        }
    }

    public static String e(rrj rrjVar, float f, float f2) {
        float f3 = rrjVar.f;
        float f4 = rrjVar.g;
        if (f3 <= 0.0f) {
            return "";
        }
        String strN = n(f4);
        String strN2 = n(f4);
        return sko.n(z1m.n("a ", strN, " ", strN2, " 0 0 1 "), n(f * f3), " ", n(f2 * f3), " ");
    }

    public static float f(float f, float f2, float f3, float f4, float f5) {
        float f6 = f2 + f;
        float f7 = f3 + f;
        return Math.min(f6 <= 0.0f ? f4 / 2.0f : (f4 * f) / f6, f7 <= 0.0f ? f5 / 2.0f : (f5 * f) / f7);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00e3 A[PHI: r6
      0x00e3: PHI (r6v32 int) = (r6v5 int), (r6v21 int), (r6v21 int), (r6v24 int), (r6v31 int), (r6v39 int), (r6v40 int) binds: [B:87:0x014e, B:60:0x00d8, B:62:0x00de, B:49:0x00b6, B:36:0x0082, B:27:0x0059, B:26:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String g(int r16, int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rih.g(int, int, byte[]):java.lang.String");
    }

    public static rrj h(float f, float f2, float f3) {
        float f4;
        if (f <= 0.0f || f2 <= 0.0f) {
            return rrj.h;
        }
        float fMin = Math.min(f, f2);
        float f5 = (f3 + 1.0f) * fMin;
        if (f5 > f2) {
            f3 = (f2 / fMin) - 1.0f;
            f4 = f2;
        } else {
            f4 = f5;
        }
        float f6 = (1.0f - f3) * 90.0f;
        float fSin = ((float) Math.sin(((f6 / 2.0f) * 3.1415927f) / 180.0f)) * fMin * 1.4142135f;
        double d = ((f3 * 45.0f) * 3.1415927f) / 180.0f;
        float fTan = ((float) Math.tan(((((90.0f - f6) / 2.0f) / 2.0f) * 3.1415927f) / 180.0f)) * fMin * ((float) Math.cos(d));
        float fTan2 = fTan * ((float) Math.tan(d));
        float f7 = (((f4 - fSin) - fTan) - fTan2) / 3.0f;
        return new rrj(f7 * 2.0f, f7, fTan, fTan2, f4, fSin, fMin);
    }

    public static s9m i(String str, x9m x9mVar) {
        List list;
        String string;
        String strE0 = StringsKt.e0(str, "<", str);
        int iO = StringsKt.O(6, strE0, ">");
        int i = 0;
        if (iO != -1) {
            strE0 = strE0.substring(0, iO);
        }
        List listY = StringsKt.Y(strE0, new String[]{","}, 0, 6);
        cam camVar = x9mVar.b;
        ArrayList arrayList = null;
        if (camVar != null && (list = camVar.b) != null) {
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(k95.o(list2, 10));
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    j95.n();
                    throw null;
                }
                KTypeProjection kTypeProjection = (KTypeProjection) obj;
                String str2 = (String) CollectionsKt.M(i, listY);
                if (str2 == null || (string = StringsKt.l0(str2).toString()) == null) {
                    string = "";
                }
                cam camVar2 = kTypeProjection.b;
                ktb ktbVar = camVar2 != null ? camVar2.a : null;
                itb itbVar = ktbVar instanceof itb ? (itb) ktbVar : null;
                arrayList2.add(itbVar == null ? null : i(string, new x9m(itbVar, camVar2)));
                i = i2;
            }
            arrayList = new ArrayList();
            CollectionsKt.I(arrayList2, arrayList);
        }
        if (arrayList == null) {
            arrayList = l08.a;
        }
        return new s9m(StringsKt.h0(str, "<"), arrayList, x9mVar);
    }

    public static byte[] j(Object obj) {
        if (obj == null) {
            return new byte[]{Byte.MIN_VALUE};
        }
        if (obj instanceof String) {
            return k(((String) obj).getBytes(Charsets.UTF_8));
        }
        if (obj instanceof List) {
            byte[] bArrK = new byte[0];
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                bArrK = b82.k(bArrK, j(it.next()));
            }
            ro9 ro9Var = new ro9((byte) 8);
            ro9Var.d(m(bArrK.length, 192));
            ro9Var.d(bArrK);
            return ro9Var.b0();
        }
        if (obj instanceof BigInteger) {
            return l((BigInteger) obj);
        }
        if (obj instanceof Integer) {
            return l(mkh.D(((Number) obj).intValue()));
        }
        if (obj instanceof Long) {
            return l(new BigInteger(String.valueOf(((Number) obj).longValue())));
        }
        if (obj instanceof Byte) {
            return k(new byte[]{((Number) obj).byteValue()});
        }
        if (obj instanceof byte[]) {
            return k((byte[]) obj);
        }
        j9h.s("Unexpected type for ", obj, ", type: ", uqh.a(obj.getClass()));
        return null;
    }

    public static byte[] k(byte[] bArr) {
        byte b;
        if (bArr.length == 1 && (b = bArr[0]) >= 0 && b < 128) {
            return new byte[]{b};
        }
        ro9 ro9Var = new ro9((byte) 8);
        ro9Var.d(m(bArr.length, NotificationCompat.FLAG_HIGH_PRIORITY));
        ro9Var.d(bArr);
        return ro9Var.b0();
    }

    public static byte[] l(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return k(rm5.W(bigInteger.toByteArray()));
        }
        qp2.o("Rlp only supports encoding positive integers.");
        return null;
    }

    public static byte[] m(int i, int i2) {
        if (i < 0) {
            qp2.o("Length can't be negative");
            return null;
        }
        if (i <= 55) {
            return new byte[]{(byte) (i2 + i)};
        }
        byte[] bArrW = rm5.W(mkh.D(i).toByteArray());
        ro9 ro9Var = new ro9((byte) 8);
        byte length = (byte) (i2 + 55 + bArrW.length);
        byte[] bArr = (byte[]) ro9Var.d;
        int i3 = ro9Var.b;
        ro9Var.b = i3 + 1;
        bArr[i3] = length;
        ro9Var.d(bArrW);
        return ro9Var.b0();
    }

    public static String n(float f) {
        return String.format(Locale.US, "%.4f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
    }

    public static final long o(double d) {
        return s(4294967296L, (float) d);
    }

    public static final long p(int i) {
        return s(4294967296L, i);
    }

    public static final String q(Context context) {
        c3j c3jVarC = ((d3j) e3j.t(context).i()).c(5);
        if (c3jVarC == null) {
            return null;
        }
        return ((Uri) c3jVarC.d).toString();
    }

    public static final boolean r(Throwable th) {
        if (th == null) {
            return false;
        }
        String message = th.getMessage();
        if (message == null || !StringsKt.E(message, "No space left on device", false)) {
            return r(th.getCause());
        }
        return true;
    }

    public static final long s(long j, float f) {
        long jFloatToRawIntBits = j | (Float.floatToRawIntBits(f) & 4294967295L);
        skl[] sklVarArr = rkl.b;
        return jFloatToRawIntBits;
    }

    public static final sdk t(sdk sdkVar, Throwable th) {
        String str;
        if (exg.v(th)) {
            return ynh.i((shk) ahk.G0.getValue());
        }
        if (!(th instanceof ooa)) {
            return sdkVar;
        }
        ooa ooaVar = (ooa) th;
        int i = ooaVar.a;
        if (400 > i || i >= 500) {
            return (500 > i || i >= 600) ? sdkVar : ynh.i((shk) dhk.l.getValue());
        }
        ji1 ji1Var = ooaVar.c;
        if ((ji1Var == null || (str = ji1Var.a) == null) && (str = ooaVar.b) == null) {
            str = ooaVar.d;
        }
        return ynh.j(str);
    }

    public static final voh u(b2c b2cVar) {
        voh vohVarJ = rm5.j(b2cVar, true);
        long jL = b2cVar.l(vohVarJ.d());
        float f = vohVarJ.c;
        float f2 = vohVarJ.d;
        long jL2 = b2cVar.l((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        return new voh(Float.intBitsToFloat((int) (jL >> 32)), Float.intBitsToFloat((int) (jL & 4294967295L)), Float.intBitsToFloat((int) (jL2 >> 32)), Float.intBitsToFloat((int) (jL2 & 4294967295L)));
    }
}
