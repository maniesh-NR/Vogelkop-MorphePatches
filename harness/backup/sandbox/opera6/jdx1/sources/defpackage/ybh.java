package defpackage;

import ads_mobile_sdk.h2;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.opera.android.suggestion.Suggestion;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class ybh {
    public static byte[] A(int i, String str, byte[] bArr) {
        if (bArr == null) {
            return new byte[i];
        }
        B(i, str, bArr);
        return bArr;
    }

    public static void B(int i, String str, byte[] bArr) {
        if (bArr.length == i) {
            return;
        }
        qp2.o(sko.k("size of ", str, " needs to be equal to size of digest"));
    }

    public static h2 a(prb prbVar) {
        try {
            int iF = prbVar.u("width").f();
            int iF2 = prbVar.u("height").f();
            pqb pqbVarU = prbVar.u("is_fluid_height");
            return new h2(iF, iF2, pqbVarU != null ? pqbVarU.c() : false);
        } catch (Exception e) {
            ArrayList arrayList = w8h.a(e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            return null;
        }
    }

    public static boolean b(Context context) {
        PowerManager powerManager;
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(KeyguardManager.class);
        if (keyguardManager == null || (powerManager = (PowerManager) context.getSystemService(PowerManager.class)) == null || (activityManager = (ActivityManager) context.getSystemService(ActivityManager.class)) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (Process.myPid() == next.pid) {
                if (!powerManager.isInteractive() || keyguardManager.isKeyguardLocked() || next.importance != 100) {
                    break;
                }
                return false;
            }
        }
        return true;
    }

    public static void c(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
    }

    public static String d(mnj mnjVar) {
        int iOrdinal = mnjVar.ordinal();
        if (iOrdinal == 0) {
            return "bookmark";
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return "item";
        }
        h9o.p();
        return null;
    }

    public static final q0i e(Throwable th) {
        return new q0i(th);
    }

    public static Object f(byte[] bArr, Class cls, byte[] bArr2) throws ClassNotFoundException, IOException {
        if (cls == ay2.class || cls == cy2.class) {
            qbe.m(bArr);
            int i = 0;
            if (bArr.length >= 4 && sfe.D(0, bArr) == 1111773952) {
                if (cls != ay2.class) {
                    s49.m("unexpected BDS state encoding");
                    return null;
                }
                qbe.m(bArr);
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr, 0, qbe.n(bArr, bArr2)));
                if (dataInputStream.readInt() != 1111773952) {
                    s49.m("unexpected BDS state magic");
                    return null;
                }
                if (dataInputStream.readInt() != 1) {
                    s49.m("unsupported BDS state version");
                    return null;
                }
                ay2 ay2VarK = qbe.K(dataInputStream, new fr((byte) 4));
                if (dataInputStream.available() == 0) {
                    return ay2VarK;
                }
                s49.m("unexpected data at end of BDS state");
                return null;
            }
            if (bArr.length >= 4 && sfe.D(0, bArr) == 1111772416) {
                if (cls != cy2.class) {
                    s49.m("unexpected BDS state map encoding");
                    return null;
                }
                qbe.m(bArr);
                DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(bArr, 0, qbe.n(bArr, bArr2)));
                if (dataInputStream2.readInt() != 1111772416) {
                    s49.m("unexpected BDS state magic");
                    return null;
                }
                if (dataInputStream2.readInt() != 1) {
                    s49.m("unsupported BDS state version");
                    return null;
                }
                long j = dataInputStream2.readLong();
                if (j < 0) {
                    s49.m("negative BDS state map maxIndex");
                    return null;
                }
                int iM = qbe.M(dataInputStream2, 64, "BDS state map");
                cy2 cy2Var = new cy2(j);
                fr frVar = new fr((byte) 4);
                int i2 = -1;
                while (i < iM) {
                    int i3 = dataInputStream2.readInt();
                    if (i3 <= i2) {
                        s49.m("invalid BDS state map layer");
                        return null;
                    }
                    cy2Var.d(i3, qbe.K(dataInputStream2, frVar));
                    i++;
                    i2 = i3;
                }
                if (dataInputStream2.available() == 0) {
                    return cy2Var;
                }
                s49.m("unexpected data at end of BDS state");
                return null;
            }
        }
        pao paoVar = new pao(cls, new ByteArrayInputStream(bArr));
        Object object = paoVar.readObject();
        if (paoVar.available() != 0) {
            s49.m("unexpected data found at end of ObjectInputStream");
            return null;
        }
        if (cls.isInstance(object)) {
            return object;
        }
        s49.m("unexpected class found in ObjectInputStream");
        return null;
    }

    public static final int g(Suggestion suggestion) {
        int i = suggestion.a;
        if (i == 0 || i == 1) {
            return 2131232250;
        }
        if (i == 2 || i == 3) {
            return 2131232005;
        }
        if (i == 9 || i == 16 || i == 17 || i == 33 || i == 34) {
            return 2131232197;
        }
        switch (i) {
            case 21:
            case 22:
                return 2131232250;
            case 23:
                return 2131232273;
            case 24:
                return 2131232270;
            default:
                return 2131232106;
        }
    }

    public static szb h(Context context) {
        String strE = wwc.e(context.getApplicationContext());
        if (TextUtils.isEmpty(strE)) {
            strE = wwc.c(wwc.d(wwc.a));
        }
        szb szbVarD = szb.d(2, strE);
        if (szbVarD != null) {
            return szbVarD;
        }
        if (strE.indexOf(45) == -1) {
            return null;
        }
        return szb.d(2, strE.substring(0, strE.indexOf(45)));
    }

    public static final sf1 i(mil milVar) {
        sf1 sf1Var = milVar.a;
        long j = milVar.b;
        sf1Var.getClass();
        return sf1Var.subSequence(xjl.f(j), xjl.e(j));
    }

    public static final sf1 j(mil milVar, int i) {
        sf1 sf1Var = milVar.a;
        sf1 sf1Var2 = milVar.a;
        long j = milVar.b;
        int iE = xjl.e(j);
        int iE2 = xjl.e(j);
        int length = iE2 + i;
        if (((iE2 ^ length) & (i ^ length)) < 0) {
            length = sf1Var2.b.length();
        }
        return sf1Var.subSequence(iE, Math.min(length, sf1Var2.b.length()));
    }

    public static final sf1 k(mil milVar, int i) {
        sf1 sf1Var = milVar.a;
        long j = milVar.b;
        int iF = xjl.f(j);
        int i2 = iF - i;
        if (((i ^ iF) & (iF ^ i2)) < 0) {
            i2 = 0;
        }
        return sf1Var.subSequence(Math.max(0, i2), xjl.f(j));
    }

    public static boolean l(wbh wbhVar, orm ormVar) {
        wbhVar.u();
        if (wbhVar.w()) {
            return false;
        }
        wbhVar.a();
        if (wbhVar.q) {
            wbhVar.v(!wbhVar.i);
        }
        i16 i16VarK = wbhVar.k();
        wub wubVarD = wub.D();
        w1f w1fVarN = wbhVar.n();
        try {
            if (w1fVarN == null) {
                wubVarD.H(i16VarK);
                return true;
            }
            sgb.S(wubVarD, i16VarK, w1fVarN);
            return true;
        } catch (RuntimeException e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            ks3.B("Bad notification", e.getClass().getSimpleName());
            return true;
        }
    }

    public static final String m(u3k u3kVar) {
        return f8a.h.a(u3kVar.a + "|" + u3kVar.b + "|com.opera.browser.beta");
    }

    public static void n(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = (j3 >>> 49) ^ (j4 << 15);
    }

    public static void o(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        n(jArr, jArr4);
        n(jArr2, jArr5);
        long[] jArr6 = new long[8];
        p(jArr6, jArr4[0], jArr5[0], jArr3, 0);
        p(jArr6, jArr4[1], jArr5[1], jArr3, 1);
        p(jArr6, jArr4[2], jArr5[2], jArr3, 2);
        p(jArr6, jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        p(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        p(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[3] ^ jArr5[1];
        p(jArr6, j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr7 = new long[3];
        p(jArr6, j, j3, jArr7, 0);
        p(jArr6, j2, j4, jArr7, 1);
        long j5 = jArr7[0];
        long j6 = jArr7[1];
        long j7 = jArr7[2];
        long j8 = jArr3[2] ^ j5;
        jArr3[2] = j8;
        long j9 = jArr3[3] ^ (j5 ^ j6);
        jArr3[3] = j9;
        long j10 = jArr3[4] ^ (j6 ^ j7);
        jArr3[4] = j10;
        long j11 = jArr3[5] ^ j7;
        jArr3[5] = j11;
        long j12 = jArr3[0];
        long j13 = jArr3[1];
        long j14 = jArr3[6];
        long j15 = jArr3[7];
        jArr3[0] = j12 ^ (j13 << 59);
        jArr3[1] = (j13 >>> 5) ^ (j8 << 54);
        jArr3[2] = (j8 >>> 10) ^ (j9 << 49);
        jArr3[3] = (j9 >>> 15) ^ (j10 << 44);
        jArr3[4] = (j10 >>> 20) ^ (j11 << 39);
        jArr3[5] = (j11 >>> 25) ^ (j14 << 34);
        jArr3[6] = (j14 >>> 30) ^ (j15 << 29);
        jArr3[7] = j15 >>> 35;
    }

    public static void p(long[] jArr, long j, long j2, long[] jArr2, int i) {
        jArr[1] = j2;
        long j3 = j2 << 1;
        jArr[2] = j3;
        long j4 = j3 ^ j2;
        jArr[3] = j4;
        long j5 = j2 << 2;
        jArr[4] = j5;
        jArr[5] = j5 ^ j2;
        long j6 = j4 << 1;
        jArr[6] = j6;
        jArr[7] = j6 ^ j2;
        int i2 = (int) j;
        long j7 = jArr[i2 & 7] ^ (jArr[(i2 >>> 3) & 7] << 3);
        long j8 = 0;
        int i3 = 54;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = jArr[i4 & 7] ^ (jArr[(i4 >>> 3) & 7] << 3);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr2[i] = jArr2[i] ^ (576460752303423487L & j7);
        int i5 = i + 1;
        jArr2[i5] = jArr2[i5] ^ ((j7 >>> 59) ^ (j8 << 5));
    }

    public static boolean q(byte b) {
        return b > -65;
    }

    public static void r(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        o(jArr, jArr2, jArr4);
        s(jArr4, jArr3);
    }

    public static void s(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j6 ^ (j8 >>> 31);
        long j10 = (j5 ^ ((j8 >>> 41) ^ (j8 << 33))) ^ (j7 >>> 31);
        long j11 = ((j4 ^ (j8 << 23)) ^ ((j7 >>> 41) ^ (j7 << 33))) ^ (j9 >>> 31);
        long j12 = j ^ (j10 << 23);
        long j13 = (j2 ^ (j9 << 23)) ^ ((j10 >>> 41) ^ (j10 << 33));
        long j14 = ((j3 ^ (j7 << 23)) ^ ((j9 >>> 41) ^ (j9 << 33))) ^ (j10 >>> 31);
        long j15 = j11 >>> 41;
        jArr2[0] = j12 ^ j15;
        jArr2[1] = j13 ^ (j15 << 10);
        jArr2[2] = j14;
        jArr2[3] = j11 & 2199023255551L;
    }

    public static byte[] t(Object obj, byte[] bArr) throws IOException {
        TreeMap treeMap;
        if (obj instanceof ay2) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(1111773952);
            dataOutputStream.writeInt(1);
            qbe.Y(dataOutputStream, (ay2) obj);
            dataOutputStream.flush();
            int size = byteArrayOutputStream.size();
            byteArrayOutputStream.write(qbe.a, 0, 32);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            qci qciVar = new qci();
            if (bArr != null) {
                qciVar.g(0, bArr.length, bArr);
            }
            qciVar.g(0, size, byteArray);
            qciVar.e(size, byteArray);
            qbe.m(byteArray);
            return byteArray;
        }
        if (!(obj instanceof cy2)) {
            throw new IllegalArgumentException("unsupported BDS state type: ".concat(obj != null ? obj.getClass().getName() : "null"));
        }
        cy2 cy2Var = (cy2) obj;
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream2);
        dataOutputStream2.writeInt(1111772416);
        dataOutputStream2.writeInt(1);
        dataOutputStream2.writeLong(cy2Var.b);
        synchronized (cy2Var) {
            treeMap = new TreeMap((Map) cy2Var.a);
        }
        if (treeMap.size() > 64) {
            s49.m("too many BDS states");
            return null;
        }
        dataOutputStream2.writeInt(treeMap.size());
        for (Integer num : treeMap.keySet()) {
            dataOutputStream2.writeInt(num.intValue());
            qbe.Y(dataOutputStream2, (ay2) treeMap.get(num));
        }
        dataOutputStream2.flush();
        int size2 = byteArrayOutputStream2.size();
        byteArrayOutputStream2.write(qbe.a, 0, 32);
        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
        qci qciVar2 = new qci();
        if (bArr != null) {
            qciVar2.g(0, bArr.length, bArr);
        }
        qciVar2.g(0, size2, byteArray2);
        qciVar2.e(size2, byteArray2);
        qbe.m(byteArray2);
        return byteArray2;
    }

    public static void u(View view, int i, int i2, int i3, int i4) {
        boolean z;
        if ((i4 & 1) != 0) {
            i = Integer.MIN_VALUE;
        }
        if ((i4 & 2) != 0) {
            i2 = Integer.MIN_VALUE;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MIN_VALUE;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            boolean z2 = true;
            if (i == Integer.MIN_VALUE || marginLayoutParams.leftMargin == i) {
                z = false;
            } else {
                marginLayoutParams.leftMargin = i;
                z = true;
            }
            if (i2 != Integer.MIN_VALUE && marginLayoutParams.topMargin != i2) {
                marginLayoutParams.topMargin = i2;
                z = true;
            }
            if (i3 == Integer.MIN_VALUE || marginLayoutParams.bottomMargin == i3) {
                z2 = z;
            } else {
                marginLayoutParams.bottomMargin = i3;
            }
            if (z2) {
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static void v(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        ui6.t(jArr, jArr3, 4);
        s(jArr3, jArr2);
    }

    public static void w(long[] jArr, long[] jArr2, int i) {
        long[] jArr3 = new long[8];
        ui6.t(jArr, jArr3, 4);
        while (true) {
            s(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                ui6.t(jArr2, jArr3, 4);
            }
        }
    }

    public static String x(mnj mnjVar) {
        int iOrdinal = mnjVar.ordinal();
        if (iOrdinal == 0) {
            return "bookmarks";
        }
        if (iOrdinal == 1) {
            return "passwords";
        }
        if (iOrdinal == 2) {
            return "speed_dials";
        }
        h9o.p();
        return null;
    }

    public static final void y(Object obj) {
        if (obj instanceof q0i) {
            throw ((q0i) obj).a;
        }
    }

    public static final void z(ViewGroup viewGroup, s15 s15Var, m57 m57Var) {
        if (s15Var.e(viewGroup)) {
            m57Var.invoke(viewGroup);
        }
        Iterator it = new g6n(viewGroup).iterator();
        while (true) {
            h6n h6nVar = (h6n) it;
            if (!h6nVar.hasNext()) {
                return;
            }
            View view = (View) h6nVar.next();
            if (view instanceof ViewGroup) {
                z((ViewGroup) view, s15Var, m57Var);
            } else if (s15Var.e(view)) {
                m57Var.invoke(view);
            }
        }
    }
}
