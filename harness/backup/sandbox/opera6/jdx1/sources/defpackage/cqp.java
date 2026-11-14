package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.opera.api.Callback;
import com.usercentrics.sdk.ui.color.UsercentricsShadedColor;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public abstract class cqp implements Decoder, oh5 {
    public static u7k a;
    public static final String[] b = {"Speakerphone", "Wired headset", "Headset earpiece", "Bluetooth headset", "USB audio"};
    public static final int[] c = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    public static final int[] d = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};
    public static final o5h e = new o5h("image-destination");
    public static final o5h f = new o5h("image-replacement-text-is-link");
    public static final o5h g = new o5h("image-size");
    public static final int[] h = {0, 25847, -2608894, -518909, 237124, -777960, -876248, 466468, 1826347, 2353451, -359251, -2091905, 3119733, -2884855, 3111497, 2680103, 2725464, 1024112, -1079900, 3585928, -549488, -1119584, 2619752, -2108549, -2118186, -3859737, -1399561, -3277672, 1757237, -19422, 4010497, 280005, 2706023, 95776, 3077325, 3530437, -1661693, -3592148, -2537516, 3915439, -3861115, -3043716, 3574422, -2867647, 3539968, -300467, 2348700, -539299, -1699267, -1643818, 3505694, -3821735, 3507263, -2140649, -1600420, 3699596, 811944, 531354, 954230, 3881043, 3900724, -2556880, 2071892, -2797779, -3930395, -1528703, -3677745, -3041255, -1452451, 3475950, 2176455, -1585221, -1257611, 1939314, -4083598, -1000202, -3190144, -3157330, -3632928, 126922, 3412210, -983419, 2147896, 2715295, -2967645, -3693493, -411027, -2477047, -671102, -1228525, -22981, -1308169, -381987, 1349076, 1852771, -1430430, -3343383, 264944, 508951, 3097992, 44288, -1100098, 904516, 3958618, -3724342, -8578, 1653064, -3249728, 2389356, -210977, 759969, -1316856, 189548, -3553272, 3159746, -1851402, -2409325, -177440, 1315589, 1341330, 1285669, -1584928, -812732, -1439742, -3019102, -3881060, -3628969, 3839961, 2091667, 3407706, 2316500, 3817976, -3342478, 2244091, -2446433, -3562462, 266997, 2434439, -1235728, 3513181, -3520352, -3759364, -1197226, -3193378, 900702, 1859098, 909542, 819034, 495491, -1613174, -43260, -522500, -655327, -3122442, 2031748, 3207046, -3556995, -525098, -768622, -3595838, 342297, 286988, -2437823, 4108315, 3437287, -3342277, 1735879, 203044, 2842341, 2691481, -2590150, 1265009, 4055324, 1247620, 2486353, 1595974, -3767016, 1250494, 2635921, -3548272, -2994039, 1869119, 1903435, -1050970, -1333058, 1237275, -3318210, -1430225, -451100, 1312455, 3306115, -1962642, -1279661, 1917081, -2546312, -1374803, 1500165, 777191, 2235880, 3406031, -542412, -2831860, -1671176, -1846953, -2584293, -3724270, 594136, -3776993, -2013608, 2432395, 2454455, -164721, 1957272, 3369112, 185531, -1207385, -3183426, 162844, 1616392, 3014001, 810149, 1652634, -3694233, -1799107, -3038916, 3523897, 3866901, 269760, 2213111, -975884, 1717735, 472078, -426683, 1723600, -1803090, 1910376, -1667432, -1104333, -260646, -3833893, -2939036, -2235985, -420899, -2286327, 183443, -976891, 1612842, -3545687, -554416, 3919660, -48306, -1362209, 3937738, 1400424, -846154, 1976782};
    public static final int[] i = {-1, -1, 0, -1, -1, -1, -1, -2};
    public static final int[] j = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};
    public static final bvk k = new bvk((byte) 9);
    public static final eko l = new eko(9);
    public static Context m;
    public static ii n;

    public cqp(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        cr4.a(bArr);
    }

    public static void A0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        o0g.D0(iArr, iArr3);
        u0(iArr3, iArr2);
    }

    public static void B0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        o0g.D0(iArr, iArr3);
        v0(iArr3, iArr2);
    }

    public static void C0(int[] iArr, int[] iArr2, int i2) {
        int[] iArr3 = new int[16];
        o0g.D0(iArr, iArr3);
        while (true) {
            u0(iArr3, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                o0g.D0(iArr2, iArr3);
            }
        }
    }

    public static void D0(int[] iArr, int[] iArr2, int i2) {
        int[] iArr3 = new int[16];
        o0g.D0(iArr, iArr3);
        while (true) {
            v0(iArr3, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                o0g.D0(iArr2, iArr3);
            }
        }
    }

    public static void E0(int[] iArr) {
        long j2 = (iArr[0] & 4294967295L) + 19;
        iArr[0] = (int) j2;
        long jT = j2 >> 32;
        if (jT != 0) {
            jT = z5i.T(7, 1, iArr);
        }
        iArr[7] = (int) (((iArr[7] & 4294967295L) - 2147483648L) + jT);
    }

    public static void F0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (o0g.F0(iArr, iArr2, iArr3) != 0) {
            long j2 = (iArr3[0] & 4294967295L) - 19;
            iArr3[0] = (int) j2;
            long jV = j2 >> 32;
            if (jV != 0) {
                jV = z5i.v(7, 1, iArr3);
            }
            iArr3[7] = (int) ((iArr3[7] & 4294967295L) + 2147483648L + jV);
        }
    }

    public static final go3 G(long j2, float f2) {
        return new go3(f2, new nvj(j2));
    }

    public static void G0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (o0g.F0(iArr, iArr2, iArr3) != 0) {
            long j2 = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j4;
                j3 = j4 >> 32;
            }
            long j5 = (iArr3[2] & 4294967295L) + 1 + j3;
            iArr3[2] = (int) j5;
            long j6 = ((iArr3[3] & 4294967295L) - 1) + (j5 >> 32);
            iArr3[3] = (int) j6;
            long j7 = j6 >> 32;
            if (j7 != 0) {
                long j8 = j7 + (iArr3[4] & 4294967295L);
                iArr3[4] = (int) j8;
                long j9 = (j8 >> 32) + (iArr3[5] & 4294967295L);
                iArr3[5] = (int) j9;
                long j10 = (j9 >> 32) + (iArr3[6] & 4294967295L);
                iArr3[6] = (int) j10;
                j7 = j10 >> 32;
            }
            iArr3[7] = (int) (((iArr3[7] & 4294967295L) - 1) + j7);
        }
    }

    public static void H(int[] iArr, int[] iArr2, int[] iArr3) {
        if (o0g.g(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= Integer.MAX_VALUE && o0g.a0(iArr3, i))) {
            I(iArr3);
        }
    }

    public static byte[] H0(ib6 ib6Var) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(ib6Var.a.size());
                for (Map.Entry entry : ib6Var.a.entrySet()) {
                    I0(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (IOException unused) {
            int i2 = se6.a;
            qs7.x().getClass();
            return new byte[0];
        }
    }

    public static void I(int[] iArr) {
        long j2 = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = ((iArr[2] & 4294967295L) - 1) + j3;
        iArr[2] = (int) j5;
        long j6 = (iArr[3] & 4294967295L) + 1 + (j5 >> 32);
        iArr[3] = (int) j6;
        long j7 = j6 >> 32;
        if (j7 != 0) {
            long j8 = j7 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j8;
            long j9 = (j8 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j9;
            long j10 = (j9 >> 32) + (iArr[6] & 4294967295L);
            iArr[6] = (int) j10;
            j7 = j10 >> 32;
        }
        iArr[7] = (int) ((iArr[7] & 4294967295L) + 1 + j7);
    }

    public static final void I0(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        int i2;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                t3p.i(uqh.a(obj.getClass()).c(), "Unsupported value type ");
                return;
            }
            Object[] objArr = (Object[]) obj;
            s15 s15VarA = uqh.a(objArr.getClass());
            if (s15VarA.equals(uqh.a(Boolean[].class))) {
                i2 = 8;
            } else if (s15VarA.equals(uqh.a(Byte[].class))) {
                i2 = 9;
            } else if (s15VarA.equals(uqh.a(Integer[].class))) {
                i2 = 10;
            } else if (s15VarA.equals(uqh.a(Long[].class))) {
                i2 = 11;
            } else if (s15VarA.equals(uqh.a(Float[].class))) {
                i2 = 12;
            } else if (s15VarA.equals(uqh.a(Double[].class))) {
                i2 = 13;
            } else {
                if (!s15VarA.equals(uqh.a(String[].class))) {
                    t3p.i(uqh.a(objArr.getClass()).b(), "Unsupported value type ");
                    return;
                }
                i2 = 14;
            }
            dataOutputStream.writeByte(i2);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i2 == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i2 == 9) {
                    Byte b2 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b2 != null ? b2.byteValue() : (byte) 0);
                } else if (i2 == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i2 == 11) {
                    Long l2 = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l2 != null ? l2.longValue() : 0L);
                } else if (i2 == 12) {
                    Float f2 = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f2 != null ? f2.floatValue() : 0.0f);
                } else if (i2 == 13) {
                    Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d2 != null ? d2.doubleValue() : 0.0d);
                } else if (i2 == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static final void J(x4o x4oVar, String str) {
        z5o z5oVarB;
        WorkDatabase workDatabase = x4oVar.c;
        i5o i5oVarC = workDatabase.C();
        c37 c37VarX = workDatabase.x();
        ArrayList arrayListJ = j95.j(new String[]{str});
        while (!arrayListJ.isEmpty()) {
            String str2 = (String) o95.x(arrayListJ);
            int iF = i5oVarC.f(str2);
            if (iF != 3 && iF != 4) {
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) i5oVarC.a;
                workDatabase_Impl.b();
                uzk uzkVar = (uzk) i5oVarC.e;
                ap9 ap9VarF = uzkVar.f();
                ap9VarF.w(1, str2);
                try {
                    workDatabase_Impl.c();
                    try {
                        ap9VarF.h();
                        workDatabase_Impl.v();
                    } finally {
                    }
                } finally {
                    uzkVar.m(ap9VarF);
                }
            }
            arrayListJ.addAll(c37VarX.p(str2));
        }
        t1h t1hVar = x4oVar.f;
        synchronized (t1hVar.k) {
            qs7.x().getClass();
            t1hVar.i.add(str);
            z5oVarB = t1hVar.b(str);
        }
        t1h.d(z5oVarB, 1);
        Iterator it = x4oVar.e.iterator();
        while (it.hasNext()) {
            ((vmi) it.next()).b(str);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final defpackage.d55 J0(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public static boolean K(g1g g1gVar, u69 u69Var, int i2, hp2 hp2Var) {
        long jC = g1gVar.C();
        long j2 = jC >>> 16;
        if (j2 != i2) {
            return false;
        }
        boolean z = (j2 & 1) == 1;
        int i3 = (int) ((jC >> 12) & 15);
        int i4 = (int) ((jC >> 8) & 15);
        int i5 = (int) ((jC >> 4) & 15);
        int i6 = (int) ((jC >> 1) & 7);
        boolean z2 = (jC & 1) == 1;
        if (i5 <= 7) {
            if (i5 != u69Var.g - 1) {
                return false;
            }
        } else if (i5 > 10 || u69Var.g != 2) {
            return false;
        }
        if ((i6 != 0 && i6 != u69Var.i) || z2) {
            return false;
        }
        try {
            long jI = g1gVar.I();
            if (!z) {
                jI *= u69Var.b;
            }
            long j3 = u69Var.j;
            if (j3 != 0 && jI > j3) {
                return false;
            }
            hp2Var.b = jI;
            int iS0 = s0(i3, g1gVar);
            long j4 = u69Var.j;
            boolean z3 = j4 == 0 || jI + ((long) iS0) >= j4;
            if (iS0 == -1) {
                return false;
            }
            if ((!z3 && iS0 < u69Var.a) || iS0 > u69Var.b) {
                return false;
            }
            int i7 = u69Var.e;
            if (i4 != 0) {
                if (i4 <= 11) {
                    if (i4 != u69Var.f) {
                        return false;
                    }
                } else if (i4 != 12) {
                    if (i4 > 14) {
                        return false;
                    }
                    int iH = g1gVar.H();
                    if (i4 == 14) {
                        iH *= 10;
                    }
                    if (iH != i7) {
                        return false;
                    }
                } else if (g1gVar.A() * 1000 != i7) {
                    return false;
                }
            }
            int iA = g1gVar.A();
            int i8 = g1gVar.b;
            byte[] bArr = g1gVar.a;
            int i9 = i8 - 1;
            int i10 = 0;
            for (int i11 = g1gVar.b; i11 < i9; i11++) {
                i10 = tym.l[i10 ^ (bArr[i11] & 255)];
            }
            String str = tym.a;
            if (iA != i10) {
                return false;
            }
            if (g1gVar.a() != 0) {
                int iJ = g1gVar.j();
                if ((iJ & NotificationCompat.FLAG_HIGH_PRIORITY) != 0) {
                    return false;
                }
                int i12 = (iJ & 126) >> 1;
                if ((i12 >= 2 && i12 <= 7) || (i12 >= 13 && i12 <= 31)) {
                    w7d.G("Ignoring frame where first subframe has a reserved type: " + i12);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static String K0(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (m0(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (m0(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static final Object L(rpb rpbVar, KSerializer kSerializer, InputStream inputStream) {
        bxk bxkVar = new bxk(inputStream);
        eu4 eu4Var = (eu4) bxkVar.b;
        try {
            s04 s04Var = new s04(bxkVar, hrb.c.d(16384), rpbVar.a);
            try {
                Object objQ = new lgk(rpbVar, ubc.c, s04Var, kSerializer.getDescriptor(), (c30) null).q(kSerializer);
                s04Var.q();
                s04Var.G();
                return objQ;
            } catch (Throwable th) {
                s04Var.G();
                throw th;
            }
        } finally {
            w24.c.a(eu4Var.c.array());
        }
    }

    public static String L0(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static void M0(int[] iArr, int[] iArr2) {
        z5i.o0(8, 0, iArr, iArr2);
        if (o0g.a0(iArr2, c)) {
            E0(iArr2);
        }
    }

    public static final boolean N(k0j k0jVar) {
        f0j f0jVarK = k0jVar.k();
        return !f0jVarK.a.c(n0j.j);
    }

    public static final void O(rpb rpbVar, KSerializer kSerializer, Object obj, OutputStream outputStream) throws IOException {
        zg zgVar = new zg();
        zgVar.b = outputStream;
        zgVar.c = x24.c.c(NotificationCompat.FLAG_GROUP_SUMMARY);
        zgVar.d = dt4.c.d(NotificationCompat.FLAG_HIGH_PRIORITY);
        byte[] bArr = (byte[]) zgVar.c;
        try {
            alo.E(rpbVar, zgVar, kSerializer, obj);
        } finally {
            zgVar.q();
            dt4.c.b((char[]) zgVar.d);
            x24.c.a(bArr);
        }
    }

    public static boolean P(String str, String str2) {
        char c2;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) == str2.charAt(i2) || ((c2 = (char) ((r3 | ' ') - 97)) < 26 && c2 == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static Object Q(View view, float f2, float f3, Function1 function1) {
        if (f2 < 0.0f || f3 < 0.0f || f2 >= view.getWidth() || f3 >= view.getHeight() || view.getVisibility() != 0) {
            return null;
        }
        Object objInvoke = function1.invoke(view);
        if (view instanceof ViewGroup) {
            Iterator it = new g6n((ViewGroup) view).iterator();
            while (true) {
                h6n h6nVar = (h6n) it;
                if (!h6nVar.hasNext()) {
                    break;
                }
                View view2 = (View) h6nVar.next();
                Object objQ = Q(view2, (f2 - view2.getLeft()) - view2.getTranslationX(), (f3 - view2.getTop()) - view2.getTranslationY(), function1);
                if (objQ != null) {
                    objInvoke = objQ;
                }
            }
        }
        return objInvoke;
    }

    public static void R(Context context, Callback callback) {
        try {
            Iterator it = Arrays.asList(f0(context), h0(context), j0(context)).iterator();
            while (it.hasNext()) {
                callback.run((pne) it.next());
            }
            c3j c3jVarD = ((d3j) e3j.t(context).i()).d(32, false);
            for (pne pneVar : Arrays.asList(c3jVarD == null ? null : new pne((String) c3jVarD.d, (String) ((qsh) c3jVarD).b, (h1b) ((qsh) c3jVarD).c))) {
                if (pneVar != null) {
                    callback.run(pneVar);
                }
            }
        } catch (InterruptedException e2) {
            rqd.p(e2);
        }
    }

    public static final void S(DataInputStream dataInputStream) throws IOException {
        short s = dataInputStream.readShort();
        if (s != -21521) {
            t14.c(sko.i(s, "Magic number doesn't match: "));
            return;
        }
        short s2 = dataInputStream.readShort();
        if (s2 == 1) {
            return;
        }
        t14.c(sko.i(s2, "Unsupported version number: "));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable T(DataInputStream dataInputStream, byte b2) throws IOException {
        if (b2 == 0) {
            return null;
        }
        if (b2 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b2 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b2 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b2 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b2 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b2 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b2 == 7) {
            return dataInputStream.readUTF();
        }
        int i2 = 0;
        if (b2 == 8) {
            int i3 = dataInputStream.readInt();
            ?? r0 = new Boolean[i3];
            while (i2 < i3) {
                r0[i2] = Boolean.valueOf(dataInputStream.readBoolean());
                i2++;
            }
            return r0;
        }
        if (b2 == 9) {
            int i4 = dataInputStream.readInt();
            ?? r02 = new Byte[i4];
            while (i2 < i4) {
                r02[i2] = Byte.valueOf(dataInputStream.readByte());
                i2++;
            }
            return r02;
        }
        if (b2 == 10) {
            int i5 = dataInputStream.readInt();
            ?? r03 = new Integer[i5];
            while (i2 < i5) {
                r03[i2] = Integer.valueOf(dataInputStream.readInt());
                i2++;
            }
            return r03;
        }
        if (b2 == 11) {
            int i6 = dataInputStream.readInt();
            ?? r04 = new Long[i6];
            while (i2 < i6) {
                r04[i2] = Long.valueOf(dataInputStream.readLong());
                i2++;
            }
            return r04;
        }
        if (b2 == 12) {
            int i7 = dataInputStream.readInt();
            ?? r05 = new Float[i7];
            while (i2 < i7) {
                r05[i2] = Float.valueOf(dataInputStream.readFloat());
                i2++;
            }
            return r05;
        }
        if (b2 == 13) {
            int i8 = dataInputStream.readInt();
            ?? r06 = new Double[i8];
            while (i2 < i8) {
                r06[i2] = Double.valueOf(dataInputStream.readDouble());
                i2++;
            }
            return r06;
        }
        if (b2 != 14) {
            qp2.n(sko.i(b2, "Unsupported type "));
            return null;
        }
        int i9 = dataInputStream.readInt();
        ?? r1 = new String[i9];
        while (i2 < i9) {
            String utf = dataInputStream.readUTF();
            if (Intrinsics.a(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            r1[i2] = utf;
            i2++;
        }
        return r1;
    }

    public static UsercentricsShadedColor U(String str) {
        s95 s95Var = t95.Companion;
        s95Var.getClass();
        t95 t95VarA = s95.a(str);
        int i2 = t95VarA.a;
        s95Var.getClass();
        return new UsercentricsShadedColor(p3p.w("#", s95.b(i2), s95.b(t95VarA.c), s95.b(t95VarA.b)), z0(t95VarA, 0.8d), z0(t95VarA, 0.16d), z0(t95VarA, 0.02d));
    }

    public static final ddc V(tcc tccVar) {
        while (true) {
            ddc ddcVar = (ddc) ((AtomicReference) tccVar.a.b).get();
            if (ddcVar != null) {
                return ddcVar;
            }
            csk cskVarA = zch.a();
            cv6 cv6Var = bb7.a;
            ddc ddcVar2 = new ddc(tccVar, e.a(cskVarA, s6d.a.e));
            AtomicReference atomicReference = (AtomicReference) tccVar.a.b;
            while (!atomicReference.compareAndSet(null, ddcVar2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            cv6 cv6Var2 = bb7.a;
            na2.B(ddcVar2, s6d.a.e, null, new fb9((byte) 8, (mt5) null, ddcVar2), 2);
            return ddcVar2;
        }
    }

    public static final String W(w3g w3gVar) {
        return (w3gVar.h || w3gVar.i) ? w3gVar.c : w3gVar.d;
    }

    public static final rxh X(n98 n98Var) {
        int iOrdinal = n98Var.ordinal();
        if (iOrdinal == 0) {
            return new rxh(2132018890);
        }
        if (iOrdinal == 1) {
            return new rxh(2132018892);
        }
        h9o.p();
        return null;
    }

    public static final pxh Y(n98 n98Var) {
        int iOrdinal = n98Var.ordinal();
        if (iOrdinal == 0) {
            return new txh(new Object[]{3, 3}, 2131886131, 3);
        }
        if (iOrdinal == 1) {
            return new rxh(2132018894);
        }
        h9o.p();
        return null;
    }

    public static final boolean Z(k0j k0jVar) {
        Object objG = k0jVar.d.a.g(n0j.L);
        if (objG == null) {
            objG = null;
        }
        bsl bslVar = (bsl) objG;
        see seeVar = k0jVar.d.a;
        Object objG2 = seeVar.g(n0j.z);
        if (objG2 == null) {
            objG2 = null;
        }
        q5i q5iVar = (q5i) objG2;
        boolean z = bslVar != null;
        Object objG3 = seeVar.g(n0j.K);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (q5iVar != null && q5iVar.a == 4)) {
            return z;
        }
        return true;
    }

    public static final String a0(k0j k0jVar, Resources resources) throws Resources.NotFoundException {
        Float fValueOf = Float.valueOf(0.0f);
        f0j f0jVar = k0jVar.d;
        f0j f0jVar2 = k0jVar.d;
        Object objG = f0jVar.a.g(n0j.b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        see seeVar = f0jVar2.a;
        Object objG2 = seeVar.g(n0j.L);
        if (objG2 == null) {
            objG2 = null;
        }
        bsl bslVar = (bsl) objG2;
        Object objG3 = seeVar.g(n0j.z);
        if (objG3 == null) {
            objG3 = null;
        }
        q5i q5iVar = (q5i) objG3;
        if (bslVar != null) {
            int iOrdinal = bslVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        h9o.p();
                        return null;
                    }
                    if (objG == null) {
                        objG = resources.getString(2132019329);
                    }
                } else if (q5iVar != null && q5iVar.a == 2 && objG == null) {
                    objG = resources.getString(2132021641);
                }
            } else if (q5iVar != null && q5iVar.a == 2 && objG == null) {
                objG = resources.getString(2132021642);
            }
        }
        Object objG4 = seeVar.g(n0j.K);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((q5iVar == null || q5iVar.a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(2132021033) : resources.getString(2132020044);
            }
        }
        Object objG5 = seeVar.g(n0j.c);
        if (objG5 == null) {
            objG5 = null;
        }
        o4h o4hVar = (o4h) objG5;
        if (o4hVar != null) {
            if (o4hVar != o4h.c) {
                if (objG == null) {
                    float f2 = o4hVar.b.a;
                    float fFloatValue = Float.valueOf(f2).floatValue() - fValueOf.floatValue() == 0.0f ? 0.0f : (o4hVar.a - fValueOf.floatValue()) / (Float.valueOf(f2).floatValue() - fValueOf.floatValue());
                    if (fFloatValue < 0.0f) {
                        fFloatValue = 0.0f;
                    }
                    if (fFloatValue > 1.0f) {
                        fFloatValue = 1.0f;
                    }
                    objG = resources.getString(2132021866, Integer.valueOf(fFloatValue == 0.0f ? 0 : fFloatValue == 1.0f ? 100 : djh.c(Math.round(fFloatValue * 100.0f), 1, 99)));
                }
            } else if (objG == null) {
                objG = resources.getString(2132019325);
            }
        }
        p0j p0jVar = n0j.G;
        if (seeVar.c(p0jVar)) {
            see seeVar2 = new k0j(k0jVar.a, true, k0jVar.c, f0jVar2).k().a;
            Object objG6 = seeVar2.g(n0j.a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = seeVar2.g(n0j.C);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = seeVar2.g(p0jVar);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(2132021640);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final sf1 b0(k0j k0jVar) {
        Object objG = k0jVar.d.a.g(n0j.G);
        if (objG == null) {
            objG = null;
        }
        sf1 sf1Var = (sf1) objG;
        Object objG2 = k0jVar.d.a.g(n0j.C);
        if (objG2 == null) {
            objG2 = null;
        }
        List list = (List) objG2;
        return sf1Var == null ? list != null ? (sf1) CollectionsKt.firstOrNull(list) : null : sf1Var;
    }

    public static bwc c0(Configuration configuration) {
        return new bwc(new cwc(configuration.getLocales()));
    }

    public static int d0(w wVar) {
        Fragment fragmentF = wVar.F("MainMenuFragment");
        if (fragmentF == null) {
            return 0;
        }
        List listF = wVar.c.f();
        return (!listF.isEmpty() && ((Fragment) am2.l(1, listF)) == fragmentF) ? 2 : 1;
    }

    public static pne e0(Context context) {
        h1b h1bVar;
        c3j c3jVarD = ((d3j) e3j.t(context).i()).d(31, true);
        String strB = "ISNE66RmhVDNLjJQnwlgn2jMgt6wqrkb";
        String strB2 = "mcp.opera-api.com";
        if (c3jVarD != null) {
            strB2 = aik.b((String) c3jVarD.d, "mcp.opera-api.com");
            strB = aik.b((String) ((qsh) c3jVarD).b, "ISNE66RmhVDNLjJQnwlgn2jMgt6wqrkb");
            h1bVar = (h1b) ((qsh) c3jVarD).c;
        } else {
            h1bVar = Collections.EMPTY_LIST;
        }
        return new pne(strB2, strB, h1bVar);
    }

    public static pne f0(Context context) {
        try {
            return g0(context);
        } catch (InterruptedException e2) {
            rqd.p(e2);
            return null;
        }
    }

    public static pne g0(Context context) {
        h1b h1bVar;
        String str;
        e3j e3jVarT = e3j.t(context);
        e3jVarT.s();
        c3j c3jVarD = ((d3j) ((no7) e3jVarT).i).d(1, true);
        String strB = "siteicon.operacdn.com";
        if (c3jVarD != null) {
            strB = aik.b((String) c3jVarD.d, "siteicon.operacdn.com");
            str = (String) ((qsh) c3jVarD).b;
            h1bVar = (h1b) ((qsh) c3jVarD).c;
        } else {
            h1bVar = Collections.EMPTY_LIST;
            str = "";
        }
        return new pne(strB, str, h1bVar);
    }

    public static pne h0(Context context) {
        h1b h1bVar;
        String str;
        e3j e3jVarT = e3j.t(context);
        e3jVarT.s();
        c3j c3jVarD = ((d3j) ((no7) e3jVarT).i).d(5, true);
        String strB = "sitesuggestion.opera-api.com";
        if (c3jVarD != null) {
            strB = aik.b((String) c3jVarD.d, "sitesuggestion.opera-api.com");
            str = (String) ((qsh) c3jVarD).b;
            h1bVar = (h1b) ((qsh) c3jVarD).c;
        } else {
            vok vokVar = (vok) wok.t(context).i();
            String str2 = vokVar.c;
            h1bVar = vokVar.d;
            str = str2;
        }
        return new pne(strB, str, h1bVar);
    }

    public static String i0() {
        return (String) n.get();
    }

    public static pne j0(Context context) {
        String str;
        String str2;
        ArrayList arrayList;
        c3j c3jVarD = ((d3j) e3j.t(context).i()).d(19, false);
        if (c3jVarD == null) {
            arrayList = new ArrayList();
            str = "wallpaperapi.sofa.opera-api.com";
            str2 = "W3LlGPDXvJVB40SmRyProMgv6QRpzC8Q";
        } else {
            str = (String) c3jVarD.d;
            str2 = (String) ((qsh) c3jVarD).b;
            arrayList = (h1b) ((qsh) c3jVarD).c;
        }
        return new pne(str, str2, arrayList);
    }

    public static final boolean k0(k0j k0jVar, Resources resources) {
        if (x7d.p(k0jVar)) {
            return false;
        }
        f0j f0jVar = k0jVar.d;
        if (f0jVar.c) {
            return true;
        }
        Object objG = f0jVar.a.g(n0j.a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !((list != null ? (String) CollectionsKt.firstOrNull(list) : null) == null && b0(k0jVar) == null && a0(k0jVar, resources) == null && !Z(k0jVar)) && l0(k0jVar);
    }

    public static final boolean l0(k0j k0jVar) {
        if (!k0jVar.o()) {
            List listJ = k0j.j(4, k0jVar);
            int size = listJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (ioh.r((k0j) listJ.get(i2))) {
                }
            }
            m3c m3cVarU = k0jVar.c.u();
            while (true) {
                if (m3cVarU == null) {
                    m3cVarU = null;
                    break;
                }
                f0j f0jVarW = m3cVarU.w();
                if (f0jVarW != null && f0jVarW.c) {
                    break;
                }
                m3cVarU = m3cVarU.u();
            }
            return !(m3cVarU != null);
        }
        return false;
    }

    public static boolean m0(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public static void n0(dx3 dx3Var, x5f x5fVar, Callback callback) {
        sz4 sz4Var = ((hjf) dx3Var).h;
        if (sz4Var == null) {
            callback.run(Boolean.FALSE);
            return;
        }
        qq6 qq6Var = new qq6(dx3Var);
        ru9 ru9Var = (ru9) qq6Var.b;
        if (!yi4.T(sz4Var) || ru9Var.a.getInt("download_notification_permission_rationale.shown.count", 0) >= 2 || System.currentTimeMillis() - ru9Var.a.getLong("download_notification_permission_rationale.last_shown.timestamp", 0L) < 604800000) {
            callback.run(Boolean.valueOf(yi4.y(sz4Var)));
            return;
        }
        z77 z77Var = (z77) dx3Var.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE");
        tf7 tf7Var = new tf7(x5fVar, new n32(callback, (byte) 3), new gl6(dx3Var, sz4Var, callback, (byte) 8), new bl6(qq6Var, (byte) 21));
        z77Var.getClass();
        z77Var.b(tf7Var, ijm.b);
    }

    public static void o0(Callback callback) {
        zne zneVar = zne.c;
        ArrayList arrayList = zneVar.a;
        arrayList.add(callback);
        if (arrayList.size() == 1) {
            wok.t(m).g(zneVar);
            e3j.t(m).g(zneVar);
        } else {
            Iterator it = zneVar.b.values().iterator();
            while (it.hasNext()) {
                callback.run((pne) it.next());
            }
        }
    }

    public static void p0(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        o0g.p0(iArr, iArr2, iArr4);
        u0(iArr4, iArr3);
    }

    public static void q0(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        o0g.p0(iArr, iArr2, iArr4);
        v0(iArr4, iArr3);
    }

    public static final void r0(ua7 ua7Var, Object obj) {
        ((gjm) ua7Var.c).h(ua7Var.p().getClass(), obj);
    }

    public static int s0(int i2, g1g g1gVar) {
        int i3;
        int i4;
        int iA;
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                i3 = i2 - 2;
                i4 = 576;
                return i4 << i3;
            case 6:
                iA = g1gVar.A();
                return iA + 1;
            case 7:
                iA = g1gVar.H();
                return iA + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i3 = i2 - 8;
                i4 = NotificationCompat.FLAG_LOCAL_ONLY;
                return i4 << i3;
            default:
                return -1;
        }
    }

    public static Object t0(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void u0(int[] iArr, int[] iArr2) {
        int i2 = iArr[7];
        int i3 = i2;
        int i4 = 0;
        while (i4 < 8) {
            int i5 = iArr[8 + i4];
            iArr2[i4] = (i5 << 1) | (i3 >>> 31);
            i4++;
            i3 = i5;
        }
        long j2 = ((iArr2[0] & 4294967295L) * 19) + (iArr[0] & 4294967295L);
        iArr2[0] = (int) j2;
        long j3 = ((iArr2[1] & 4294967295L) * 19) + (iArr[1] & 4294967295L) + (j2 >>> 32);
        iArr2[1] = (int) j3;
        long j4 = ((iArr2[2] & 4294967295L) * 19) + (iArr[2] & 4294967295L) + (j3 >>> 32);
        iArr2[2] = (int) j4;
        long j5 = ((iArr2[3] & 4294967295L) * 19) + (iArr[3] & 4294967295L) + (j4 >>> 32);
        iArr2[3] = (int) j5;
        long j6 = ((iArr2[4] & 4294967295L) * 19) + (iArr[4] & 4294967295L) + (j5 >>> 32);
        iArr2[4] = (int) j6;
        long j7 = ((iArr2[5] & 4294967295L) * 19) + (iArr[5] & 4294967295L) + (j6 >>> 32);
        iArr2[5] = (int) j7;
        long j8 = ((iArr2[6] & 4294967295L) * 19) + (iArr[6] & 4294967295L) + (j7 >>> 32);
        iArr2[6] = (int) j8;
        long j9 = (19 * (iArr2[7] & 4294967295L)) + (iArr[7] & 4294967295L) + (j8 >>> 32);
        int i6 = (int) j9;
        iArr2[7] = i6;
        iArr2[7] = z5i.m(7, (((i6 >>> 31) - (i2 >>> 31)) + (((int) (j9 >>> 32)) << 1)) * 19, iArr2) + (i6 & Integer.MAX_VALUE);
        if (o0g.a0(iArr2, c)) {
            E0(iArr2);
        }
    }

    public static void v0(int[] iArr, int[] iArr2) {
        long j2 = iArr[8] & 4294967295L;
        long j3 = iArr[9] & 4294967295L;
        long j4 = iArr[10] & 4294967295L;
        long j5 = iArr[11] & 4294967295L;
        long j6 = iArr[12] & 4294967295L;
        long j7 = iArr[13] & 4294967295L;
        long j8 = iArr[14] & 4294967295L;
        long j9 = iArr[15] & 4294967295L;
        long j10 = j4 + j5;
        long j11 = j7 + j8;
        long j12 = j11 + (j9 << 1);
        long j13 = j2 + j3 + j11;
        long j14 = j10 + j6 + j9 + j13;
        long j15 = (iArr[0] & 4294967295L) + j14 + j7 + j8 + j9;
        iArr2[0] = (int) j15;
        long j16 = (((iArr[1] & 4294967295L) + j14) - j2) + j8 + j9 + (j15 >> 32);
        iArr2[1] = (int) j16;
        long j17 = ((iArr[2] & 4294967295L) - j13) + (j16 >> 32);
        iArr2[2] = (int) j17;
        long j18 = ((((iArr[3] & 4294967295L) + j14) - j3) - j4) + j7 + (j17 >> 32);
        iArr2[3] = (int) j18;
        long j19 = ((((iArr[4] & 4294967295L) + j14) - j10) - j2) + j8 + (j18 >> 32);
        iArr2[4] = (int) j19;
        long j20 = (iArr[5] & 4294967295L) + j12 + j4 + (j19 >> 32);
        iArr2[5] = (int) j20;
        long j21 = (iArr[6] & 4294967295L) + j5 + j8 + j9 + (j20 >> 32);
        iArr2[6] = (int) j21;
        long j22 = (iArr[7] & 4294967295L) + j14 + j12 + j6 + (j21 >> 32);
        iArr2[7] = (int) j22;
        x0((int) (j22 >> 32), iArr2);
    }

    public static void w0(int i2, int[] iArr) {
        int i3 = iArr[7];
        iArr[7] = z5i.m(7, ((i2 << 1) | (i3 >>> 31)) * 19, iArr) + (i3 & Integer.MAX_VALUE);
        if (o0g.a0(iArr, c)) {
            E0(iArr);
        }
    }

    public static void x0(int i2, int[] iArr) {
        long j2;
        if (i2 != 0) {
            long j3 = i2 & 4294967295L;
            long j4 = (iArr[0] & 4294967295L) + j3;
            iArr[0] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j6;
                j5 = j6 >> 32;
            }
            long j7 = ((iArr[2] & 4294967295L) - j3) + j5;
            iArr[2] = (int) j7;
            long j8 = (iArr[3] & 4294967295L) + j3 + (j7 >> 32);
            iArr[3] = (int) j8;
            long j9 = j8 >> 32;
            if (j9 != 0) {
                long j10 = j9 + (iArr[4] & 4294967295L);
                iArr[4] = (int) j10;
                long j11 = (j10 >> 32) + (iArr[5] & 4294967295L);
                iArr[5] = (int) j11;
                long j12 = (j11 >> 32) + (iArr[6] & 4294967295L);
                iArr[6] = (int) j12;
                j9 = j12 >> 32;
            }
            long j13 = (iArr[7] & 4294967295L) + j3 + j9;
            iArr[7] = (int) j13;
            j2 = j13 >> 32;
        } else {
            j2 = 0;
        }
        if (j2 != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && o0g.a0(iArr, i))) {
            I(iArr);
        }
    }

    public static String y0(String str) {
        if (str == null || !str.endsWith("/")) {
            return str;
        }
        int length = str.length();
        while (length > 0 && str.charAt(length - 1) == '/') {
            length--;
        }
        return str.substring(0, length);
    }

    public static String z0(t95 t95Var, double d2) {
        double d3 = (((d2 * 2.0d) - 1.0d) + 1.0d) / 2.0d;
        double d4 = 255.0d * (1.0d - d3);
        double dFloor = Math.floor((t95Var.a * d3) + d4);
        double dFloor2 = Math.floor((t95Var.c * d3) + d4);
        int i2 = (int) dFloor;
        int iFloor = (int) Math.floor((t95Var.b * d3) + d4);
        t95.Companion.getClass();
        return p3p.w("#", s95.b(i2), s95.b((int) dFloor2), s95.b(iFloor));
    }

    public final short A(txg txgVar, int i2) {
        return s();
    }

    public String B() throws o2j {
        M();
        throw null;
    }

    public final boolean C(SerialDescriptor serialDescriptor, int i2) {
        return x();
    }

    public boolean D() {
        return true;
    }

    public final double E(SerialDescriptor serialDescriptor, int i2) {
        return v();
    }

    public abstract byte F();

    /* JADX INFO: Thrown type has an unknown type hierarchy: o2j */
    public final void M() throws o2j {
        throw new o2j(uqh.a(getClass()) + " can't retrieve untyped values");
    }

    public oh5 b(SerialDescriptor serialDescriptor) {
        return this;
    }

    public void c(SerialDescriptor serialDescriptor) {
    }

    public final Decoder e(txg txgVar, int i2) {
        return r(txgVar.h(i2));
    }

    public int f(SerialDescriptor serialDescriptor) throws o2j {
        M();
        throw null;
    }

    public final long g(SerialDescriptor serialDescriptor, int i2) {
        return n();
    }

    public final char h(txg txgVar, int i2) {
        return y();
    }

    public final byte j(txg txgVar, int i2) {
        return F();
    }

    public abstract int k();

    public final int l(SerialDescriptor serialDescriptor, int i2) {
        return k();
    }

    public final Object m(SerialDescriptor serialDescriptor, int i2, KSerializer kSerializer) {
        if (kSerializer.getDescriptor().b() || D()) {
            return q(kSerializer);
        }
        return null;
    }

    public abstract long n();

    public final String o(SerialDescriptor serialDescriptor, int i2) {
        return B();
    }

    public Decoder r(SerialDescriptor serialDescriptor) {
        return this;
    }

    public abstract short s();

    public float t() throws o2j {
        M();
        throw null;
    }

    public final float u(SerialDescriptor serialDescriptor, int i2) {
        return t();
    }

    public double v() throws o2j {
        M();
        throw null;
    }

    public boolean x() throws o2j {
        M();
        throw null;
    }

    public char y() throws o2j {
        M();
        throw null;
    }

    public Object z(SerialDescriptor serialDescriptor, int i2, KSerializer kSerializer) {
        return q(kSerializer);
    }
}
