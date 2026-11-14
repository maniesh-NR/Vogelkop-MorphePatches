package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.NetworkRequest;
import android.util.TypedValue;
import android.view.View;
import com.opera.android.OperaApplication;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Vector;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.c;
import org.chromium.base.CommandLine;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class fsp {
    public static final ue5 a = new ue5(-1756432312, new q92((byte) 14), false);
    public static final ue5 b = new ue5(-1956797010, new ve5((byte) 0), false);
    public static final ue5 c;
    public static final ue5 d;
    public static final yg9 e;
    public static final xm5 f;
    public static final xm5 g;
    public static final short[] h;
    public static final int[] i;
    public static final eko j;
    public static yza k;
    public static boolean l;
    public static boolean m;

    static {
        new ue5(201943220, new q92((byte) 15), false);
        new ue5(1001517749, new ve5((byte) 1), false);
        c = new ue5(2129735553, new bf5((byte) 4), false);
        d = new ue5(-1032848470, new bf5((byte) 5), false);
        new ue5(1440958558, new bf5((byte) 6), false);
        e = new yg9((byte) 27);
        Boolean bool = Boolean.FALSE;
        f = new xm5(bool);
        g = new xm5(bool);
        h = new short[]{2285, 2571, 2970, 1812, 1493, 1422, 287, 202, 3158, 622, 1577, 182, 962, 2127, 1855, 1468, 573, 2004, 264, 383, 2500, 1458, 1727, 3199, 2648, 1017, 732, 608, 1787, 411, 3124, 1758, 1223, 652, 2777, 1015, 2036, 1491, 3047, 1785, 516, 3321, 3009, 2663, 1711, 2167, 126, 1469, 2476, 3239, 3058, 830, 107, 1908, 3082, 2378, 2931, 961, 1821, 2604, 448, 2264, 677, 2054, 2226, 430, 555, 843, 2078, 871, 1550, 105, 422, 587, 177, 3094, 3038, 2869, 1574, 1653, 3083, 778, 1159, 3182, 2552, 1483, 2727, 1119, 1739, 644, 2457, 349, 418, 329, 3173, 3254, 817, 1097, 603, 610, 1322, 2044, 1864, 384, 2114, 3193, 1218, 1994, 2455, 220, 2142, 1670, 2144, 1799, 2051, 794, 1819, 2475, 2459, 478, 3221, 3021, 996, 991, 958, 1869, 1522, 1628};
        i = new int[]{1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
        j = new eko((byte) 10);
    }

    public static boolean E(bih bihVar, bih bihVar2) {
        if (bihVar.a.a.length != bihVar2.a.a.length) {
            return false;
        }
        lf2[] lf2VarArrJ = bihVar.j();
        lf2[] lf2VarArrJ2 = bihVar2.j();
        if (lf2VarArrJ.length != lf2VarArrJ2.length) {
            return false;
        }
        for (int i2 = 0; i2 != lf2VarArrJ.length; i2++) {
            lf2 lf2Var = lf2VarArrJ[i2];
            lf2 lf2Var2 = lf2VarArrJ2[i2];
            if (lf2Var != lf2Var2 && (lf2Var == null || lf2Var2 == null || !lf2Var.a.p(lf2Var2.a) || !k(lf2Var.b).equals(k(lf2Var2.b)))) {
                return false;
            }
        }
        return true;
    }

    public static String F(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = new byte[72];
        for (int i2 = 0; i2 < 72; i2++) {
            int i3 = bufferedInputStream.read();
            if (i3 == -1 || i3 < -128 || i3 > 127) {
                return null;
            }
            byte b2 = (byte) i3;
            bArr[i2] = b2;
            if (b2 == 10) {
                if (i2 + 1 >= 5 && bArr[0] == 45 && bArr[1] == 45 && bArr[i2 - 1] == 13) {
                    return new String(bArr, 2, i2 - 3);
                }
                return null;
            }
        }
        return null;
    }

    public static bpd G(g1g g1gVar) {
        g1gVar.O(1);
        int iD = g1gVar.D();
        long j2 = g1gVar.b + iD;
        int i2 = iD / 18;
        long[] jArrCopyOf = new long[i2];
        long[] jArrCopyOf2 = new long[i2];
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            long jU = g1gVar.u();
            if (jU == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                break;
            }
            jArrCopyOf[i3] = jU;
            jArrCopyOf2[i3] = g1gVar.u();
            g1gVar.O(2);
            i3++;
        }
        g1gVar.O((int) (j2 - g1gVar.b));
        return new bpd(jArrCopyOf, jArrCopyOf2, (byte) 17);
    }

    public static final c8e H(whl whlVar) {
        return new nfl(whlVar);
    }

    public static String I(String str) {
        int i2;
        if (str.length() == 0) {
            return str;
        }
        if (str.indexOf(92) < 0 && str.indexOf(34) < 0) {
            return str.trim();
        }
        StringBuilder sb = new StringBuilder(str.length());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z = true;
        int[] iArr = {-1};
        if (str.charAt(0) == '\\' && str.charAt(1) == '#') {
            sb.append("\\#");
            i2 = 2;
        } else {
            i2 = 0;
        }
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = -1;
        while (true) {
            boolean z5 = z;
            if (i2 != str.length()) {
                char cCharAt = str.charAt(i2);
                if (cCharAt != ' ') {
                    z4 = z5;
                }
                if (cCharAt == '\"') {
                    if (z2) {
                        if (i3 >= 0) {
                            qp2.o("invalid hex escape in directory string");
                            return null;
                        }
                        t(sb, byteArrayOutputStream, iArr);
                        sb.append(cCharAt);
                        z2 = false;
                    } else {
                        z3 = !z3;
                    }
                } else if (cCharAt == '\\' && !z2 && !z3) {
                    iArr[0] = sb.length();
                    z2 = z5;
                } else if (cCharAt != ' ' || z2 || z4) {
                    if (!z2 || (('0' > cCharAt || cCharAt > '9') && (('a' > cCharAt || cCharAt > 'f') && ('A' > cCharAt || cCharAt > 'F')))) {
                        if (i3 >= 0) {
                            break;
                        }
                        t(sb, byteArrayOutputStream, iArr);
                        sb.append(cCharAt);
                        z2 = false;
                    } else {
                        int iN = n(cCharAt);
                        if (i3 < 0) {
                            i3 = iN;
                        } else {
                            byteArrayOutputStream.write((i3 << 4) + iN);
                            z2 = false;
                            i3 = -1;
                        }
                    }
                }
                i2++;
                z = z5;
            } else if (i3 < 0) {
                t(sb, byteArrayOutputStream, iArr);
                if (sb.length() > 0) {
                    while (sb.charAt(sb.length() - 1) == ' ' && iArr[0] < sb.length() - 1) {
                        sb.setLength(sb.length() - 1);
                    }
                }
                return sb.toString();
            }
        }
        qp2.o("invalid hex escape in directory string");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String J(x r10) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r10 instanceof k1
            r2 = 35
            r3 = 92
            r4 = 0
            if (r1 == 0) goto L2b
            boolean r1 = r10 instanceof d96
            if (r1 != 0) goto L2b
            k1 r10 = (k1) r10
            java.lang.String r10 = r10.b()
            int r1 = r10.length()
            if (r1 <= 0) goto L27
            char r1 = r10.charAt(r4)
            if (r1 != r2) goto L27
            r0.append(r3)
        L27:
            r0.append(r10)
            goto L44
        L2b:
            r0.append(r2)     // Catch: java.io.IOException -> Lb1
            z0 r10 = r10.e()     // Catch: java.io.IOException -> Lb1
            byte[] r10 = r10.h()     // Catch: java.io.IOException -> Lb1
            maa r1 = jaa.a     // Catch: java.io.IOException -> Lb1
            int r1 = r10.length     // Catch: java.io.IOException -> Lb1
            byte[] r10 = jaa.b(r1, r10)     // Catch: java.io.IOException -> Lb1
            java.lang.String r10 = hik.a(r10)     // Catch: java.io.IOException -> Lb1
            r0.append(r10)     // Catch: java.io.IOException -> Lb1
        L44:
            int r10 = r0.length()
            r1 = 2
            if (r10 < r1) goto L58
            char r5 = r0.charAt(r4)
            if (r5 != r3) goto L58
            r5 = 1
            char r6 = r0.charAt(r5)
            if (r6 == r2) goto L59
        L58:
            r5 = r4
        L59:
            r2 = r4
        L5a:
            r6 = 32
            if (r2 >= r10) goto L67
            char r7 = r0.charAt(r2)
            if (r7 != r6) goto L67
            int r2 = r2 + 1
            goto L5a
        L67:
            int r7 = r10 + (-1)
        L69:
            if (r7 < 0) goto L74
            char r8 = r0.charAt(r7)
            if (r8 != r6) goto L74
            int r7 = r7 + (-1)
            goto L69
        L74:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r9 = r10 + 16
            r8.<init>(r9)
            if (r5 == 0) goto L83
            java.lang.String r4 = "\\#"
            r8.append(r4)
            r4 = r1
        L83:
            if (r4 >= r10) goto Lac
            char r1 = r0.charAt(r4)
            if (r1 == r6) goto L9d
            r9 = 34
            if (r1 == r9) goto La3
            if (r1 == r3) goto La3
            r9 = 43
            if (r1 == r9) goto La3
            r9 = 44
            if (r1 == r9) goto La3
            switch(r1) {
                case 59: goto La3;
                case 60: goto La3;
                case 61: goto La3;
                case 62: goto La3;
                default: goto L9c;
            }
        L9c:
            goto La6
        L9d:
            if (r5 != 0) goto La1
            if (r4 < r2) goto La3
        La1:
            if (r4 <= r7) goto La6
        La3:
            r8.append(r3)
        La6:
            r8.append(r1)
            int r4 = r4 + 1
            goto L83
        Lac:
            java.lang.String r10 = r8.toString()
            return r10
        Lb1:
            java.lang.String r10 = "Other value has no encoded form"
            defpackage.qp2.o(r10)
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsp.J(x):java.lang.String");
    }

    public static void K(BufferedOutputStream bufferedOutputStream, HashMap map, String str) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            bufferedOutputStream.write(str.getBytes());
            bufferedOutputStream.write(String.format(Locale.US, "Content-Disposition: form-data; name=\"%s\"\r\n\r\n%s\r\n", entry.getKey(), entry.getValue()).getBytes());
        }
    }

    public static final s27 a(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        di9 di9VarA = ei9.a(f2);
        if (di9VarA == null) {
            di9VarA = new uec(f2);
        }
        return new s27(f3, f2, di9VarA);
    }

    public static final long b(float f2, float f3) {
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
    }

    public static void c(n9h n9hVar, String str) {
        String strSubstring;
        sx2 sx2Var = (sx2) n9hVar.b;
        int i2 = str.length() < 1 ? 0 : -1;
        int length = str.length();
        if (i2 >= length) {
            strSubstring = null;
        } else {
            int i3 = i2 + 1;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                i2++;
                if (i2 < length) {
                    char cCharAt = str.charAt(i2);
                    if (z) {
                        z = false;
                    } else if (cCharAt == '\"') {
                        z2 = !z2;
                    } else if (z2) {
                        continue;
                    } else if (cCharAt == '\\') {
                        z = true;
                    } else if (cCharAt == '=') {
                        break;
                    }
                } else if (z || z2) {
                    qp2.o("badly formatted directory string");
                    return;
                }
            }
            strSubstring = str.substring(i3, i2);
        }
        if (strSubstring == null || i2 >= str.length()) {
            qp2.o("badly formatted directory string");
            return;
        }
        int length2 = str.length();
        String strSubstring2 = i2 < length2 ? str.substring(i2 + 1, length2) : null;
        q0 q0VarK0 = sx2Var.k0(strSubstring.trim());
        String strI = I(strSubstring2);
        sx2Var.getClass();
        z0 z0VarC0 = fr3.c0(q0VarK0, strI);
        Vector vector = (Vector) n9hVar.c;
        lf2 lf2Var = new lf2(q0VarK0, z0VarC0);
        bih bihVar = new bih();
        x86 x86Var = new x86(lf2Var);
        x86Var.e = -1;
        bihVar.a = x86Var;
        vector.addElement(bihVar);
    }

    public static final void d(StringBuilder sb, File file, int i2, boolean z) {
        File[] fileArrListFiles;
        String strN = c.n(i2, "  ");
        if (!file.isDirectory()) {
            sb.append(strN + file.getName() + " (" + file.length() + " bytes)\n");
            return;
        }
        sb.append(strN + file.getName() + "/ (" + r(file) + " bytes, " + s(file) + " files)" + (z ? " [summary only, contents not listed]" : "") + "\n");
        if (z || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        boolean zM = c.m(file.getName(), "cache", true);
        for (File file2 : fileArrListFiles) {
            d(sb, file2, i2 + 1, zM);
        }
    }

    public static void e(StringBuilder sb, lf2 lf2Var, Hashtable hashtable) {
        String strW = (String) hashtable.get(lf2Var.a);
        if (strW == null) {
            strW = lf2Var.a.w();
        }
        sb.append(strW);
        sb.append('=');
        sb.append(J(lf2Var.b));
    }

    public static void f(short[] sArr, int i2, short s, short s2, short s3, short s4, short s5) {
        sArr[i2] = (short) (uyg.m(s * s3) + uyg.m(uyg.m(s2 * s4) * s5));
        int i3 = i2 + 1;
        sArr[i3] = (short) (uyg.m(s2 * s3) + uyg.m(s * s4));
    }

    public static void g(Context context, CommandLine commandLine) {
        if (l) {
            return;
        }
        Resources resources = context.getApplicationContext().getResources();
        TypedValue typedValue = new TypedValue();
        String[] strArr = OperaApplication.K;
        resources.getValue(((OperaApplication) context.getApplicationContext()).J().Z() ? 2131165276 : 2131165275, typedValue, true);
        float f2 = typedValue.getFloat();
        commandLine.a("top-controls-hide-threshold", String.valueOf(f2));
        commandLine.a("top-controls-show-threshold", String.valueOf(f2));
        ej9.b.get();
        l = true;
    }

    public static ulp h(List list, Function1 function1, Function2 function2) {
        Object next;
        List list2 = list;
        Iterator it = list2.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) function1.invoke(next);
                do {
                    Object next2 = it.next();
                    Comparable comparable2 = (Comparable) function1.invoke(next2);
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        if (next == null) {
            h9o.h("Unable to build char tree from an empty list");
            return null;
        }
        ((Number) function1.invoke(next)).intValue();
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((Number) function1.invoke(it2.next())).intValue() == 0) {
                    qp2.o("There should be no empty entries");
                    return null;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        i(arrayList, list, 0, function1, function2);
        arrayList.trimToSize();
        new r92((char) 0, l08.a, arrayList);
        return new ulp((byte) 22);
    }

    public static void i(ArrayList arrayList, List list, int i2, Function1 function1, Function2 function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Character ch = (Character) function2.invoke(obj, Integer.valueOf(i2));
            ch.getClass();
            Object arrayList2 = linkedHashMap.get(ch);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(ch, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            char cCharValue = ((Character) entry.getKey()).charValue();
            List list2 = (List) entry.getValue();
            int i3 = i2 + 1;
            ArrayList arrayList3 = new ArrayList();
            List list3 = list2;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list3) {
                if (((Number) function1.invoke(obj2)).intValue() > i3) {
                    arrayList4.add(obj2);
                }
            }
            i(arrayList3, arrayList4, i3, function1, function2);
            arrayList3.trimToSize();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : list3) {
                if (((Number) function1.invoke(obj3)).intValue() == i3) {
                    arrayList5.add(obj3);
                }
            }
            arrayList.add(new r92(cCharValue, arrayList5, arrayList3));
        }
    }

    public static void j(View view) {
        view.animate().cancel();
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: x0 */
    public static String k(x xVar) throws x0 {
        String strJ = J(xVar);
        if (strJ.length() > 0 && strJ.charAt(0) == '#') {
            try {
                try {
                    k1 k1VarQ = z0.q(jaa.a.a(1, strJ.length() - 1, strJ));
                    if (k1VarQ instanceof k1) {
                        strJ = k1VarQ.b();
                    }
                } catch (Exception e2) {
                    throw new x0("exception decoding Hex string: " + e2.getMessage(), e2, (byte) 1);
                }
            } catch (IOException e3) {
                throw c26.w("unknown encoding in name", e3);
            }
        }
        String strD = hik.d(strJ);
        int length = strD.length();
        if (length < 2) {
            return strD;
        }
        int i2 = length - 1;
        int i3 = 0;
        while (i3 < i2 && strD.charAt(i3) == '\\' && strD.charAt(i3 + 1) == ' ') {
            i3 += 2;
        }
        int i4 = i3 + 1;
        int i5 = i2;
        while (i5 > i4 && strD.charAt(i5 - 1) == '\\' && strD.charAt(i5) == ' ') {
            i5 -= 2;
        }
        if (i3 > 0 || i5 < i2) {
            strD = strD.substring(i3, i5 + 1);
        }
        if (strD.indexOf("  ") < 0) {
            return strD;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = strD.charAt(0);
        sb.append(cCharAt);
        for (int i6 = 1; i6 < strD.length(); i6++) {
            char cCharAt2 = strD.charAt(i6);
            if (cCharAt != ' ' || cCharAt2 != ' ') {
                sb.append(cCharAt2);
                cCharAt = cCharAt2;
            }
        }
        return sb.toString();
    }

    public static kp3 l(no3 no3Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = (z && z2 && z6 && z3 && !z7 && !z9 && z5) || (z && !z2 && z6 && z3 && z8 && !z9 && z5);
        boolean z15 = !z9;
        boolean z16 = (z9 || (z && !z4)) && !z8;
        return new kp3(new no3(no3Var.a && !z16, no3Var.b && !z16, no3Var.c && !z16), z14, z10, z11, (!z12 || z13 || z11 || z9) ? false : true, z15);
    }

    public static final pde m(View view) {
        l5b l5bVar = q9n.c;
        xd5 xd5VarP = view == null ? null : q9n.p(view.getContext());
        return xd5VarP != null ? (pde) new ole(xd5VarP).a : new sw0(view);
    }

    public static int n(char c2) {
        return ('0' > c2 || c2 > '9') ? ('a' > c2 || c2 > 'f') ? c2 - '7' : c2 - 'W' : c2 - '0';
    }

    public static c98 o(orb orbVar) throws JSONException {
        y98 y98Var;
        String strE = orbVar.e("iso3");
        JSONObject jSONObject = orbVar.a;
        double d2 = jSONObject.getDouble("dataAmount");
        long j2 = jSONObject.getLong("duration");
        String strE2 = orbVar.e("status");
        y98[] y98VarArrValues = y98.values();
        int length = y98VarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                y98Var = y98VarArrValues[i2];
                if (y98Var != y98.b && strE2.equals(y98Var.a)) {
                    break;
                }
                i2++;
            } else {
                y98Var = y98.b;
                break;
            }
        }
        y98 y98Var2 = y98Var;
        Long l2 = orbVar.l("activationTime");
        double dOptDouble = jSONObject.optDouble("usedDataAmount", Double.NaN);
        return new c98(strE, d2, j2, y98Var2, l2, Double.isNaN(dOptDouble) ? null : Double.valueOf(dOptDouble), orbVar.k("isFreePlan"), orbVar.m("externalId", null));
    }

    public static koe p(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i2 : iArr) {
            try {
                builder.addCapability(i2);
            } catch (IllegalArgumentException unused) {
                qs7 qs7VarX = qs7.x();
                int i3 = koe.b;
                int i4 = koe.b;
                qs7VarX.getClass();
            }
        }
        int[] iArr3 = x1p.j;
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr3[i5];
            if (e82.t(i6, iArr) < 0) {
                try {
                    builder.removeCapability(i6);
                } catch (IllegalArgumentException unused2) {
                    qs7 qs7VarX2 = qs7.x();
                    int i7 = koe.b;
                    int i8 = koe.b;
                    qs7VarX2.getClass();
                }
            }
        }
        for (int i9 : iArr2) {
            builder.addTransportType(i9);
        }
        return new koe(builder.build());
    }

    public static l7n q(Class cls) throws NoSuchMethodException, SecurityException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                return (l7n) declaredConstructor.newInstance(null);
            } catch (IllegalAccessException e2) {
                pza.l("Cannot create an instance of ", cls, e2);
                return null;
            } catch (InstantiationException e3) {
                pza.l("Cannot create an instance of ", cls, e3);
                return null;
            }
        } catch (NoSuchMethodException e4) {
            pza.l("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    public static final long r(File file) {
        File[] fileArrListFiles = file.listFiles();
        long jR = 0;
        if (fileArrListFiles == null) {
            return 0L;
        }
        for (File file2 : fileArrListFiles) {
            jR += file2.isDirectory() ? r(file2) : file2.length();
        }
        return jR;
    }

    public static final int s(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return 0;
        }
        int iS = 0;
        for (File file2 : fileArrListFiles) {
            iS += file2.isDirectory() ? s(file2) : 1;
        }
        return iS;
    }

    public static void t(StringBuilder sb, ByteArrayOutputStream byteArrayOutputStream, int[] iArr) {
        if (byteArrayOutputStream.size() == 0) {
            return;
        }
        String strB = hik.b(byteArrayOutputStream.toByteArray());
        byteArrayOutputStream.reset();
        sb.append(strB);
        iArr[0] = sb.length() - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0520  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void u(android.app.Activity r20, defpackage.xi5 r21) {
        /*
            Method dump skipped, instructions count: 1623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsp.u(android.app.Activity, xi5):void");
    }

    public static String v() {
        Random random;
        ehc ehcVarB = a.b();
        ehcVarB.add(d4g.a);
        ehcVarB.add(f4g.a);
        ehcVarB.add(c4g.a);
        ehcVarB.add(e4g.a);
        ehc ehcVarA = a.a(ehcVarB);
        if (ehcVarA.isEmpty()) {
            return "";
        }
        try {
            random = new SecureRandom();
        } catch (Exception unused) {
            random = new Random();
        }
        StringBuilder sb = new StringBuilder();
        do {
            sb.append(((g4g) ehcVarA.get(random.nextInt(ehcVarA.d()))).a(Math.abs(random.nextInt())));
        } while (sb.length() < 24 - ehcVarA.d());
        mea meaVarListIterator = ehcVarA.listIterator(0);
        while (true) {
            mea meaVar = meaVarListIterator;
            if (!meaVar.hasNext()) {
                return sb.toString();
            }
            sb.insert(random.nextInt(sb.length()), ((g4g) meaVar.next()).a(Math.abs(random.nextInt())));
        }
    }

    public static String w() {
        return "--" + "--------------------------".concat(String.format(Locale.US, "%016x", new BigInteger(64, new Random()))) + "\r\n";
    }

    public static String x(File file) throws Throwable {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                String strF = F(bufferedInputStream2);
                xvg.l(bufferedInputStream2);
                return strF;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                xvg.l(bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final ddc y(ndc ndcVar) {
        return cqp.V(ndcVar.getLifecycle());
    }

    public static final nh4 z(mt5 mt5Var) {
        if (!(mt5Var instanceof ia7)) {
            return new nh4(1, mt5Var);
        }
        nh4 nh4VarK = ((ia7) mt5Var).k();
        if (nh4VarK != null) {
            if (!nh4VarK.D()) {
                nh4VarK = null;
            }
            if (nh4VarK != null) {
                return nh4VarK;
            }
        }
        return new nh4(2, mt5Var);
    }

    public abstract int A();

    public abstract nq7 B(int i2);

    public abstract nq7 C(int i2);

    public abstract cqp D(int i2, byte[] bArr);
}
