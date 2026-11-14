package defpackage;

import J.N;
import ads_mobile_sdk.pd;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.chromium.JavaScriptDialogManagerDelegate;
import com.opera.android.browser.chromium.PermissionDialogDelegate;
import com.opera.android.browser.dialog.DialogDelegate;
import com.opera.android.custom_views.CheckBox;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.media.CaptureDevicesDialogDelegate;
import com.opera.api.Callback;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class phj implements DialogDelegate {
    public static volatile ohj b;
    public static volatile ArrayList d;
    public static final ue5 f = new ue5(641200809, new gf5((byte) 25), false);
    public static final Type[] g = new Type[0];
    public static final String[] h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] i = {44100, 48000, 32000};
    public static final int[] j = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] k = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] l = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] m = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] o = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final byte[] p = {112, 114, 111, 0};
    public static final byte[] q = {112, 114, 109, 0};
    public static final qmo r = new qmo((byte) 0);
    public static boolean s;

    public static BigInteger A(BigInteger bigInteger, BigInteger bigInteger2, int i2) {
        boolean z = bigInteger2.signum() < 0;
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger2.abs());
        boolean zTestBit = bigIntegerMultiply.testBit(i2 - 1);
        BigInteger bigIntegerShiftRight = bigIntegerMultiply.shiftRight(i2);
        if (zTestBit) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(vp7.b);
        }
        return z ? bigIntegerShiftRight.negate() : bigIntegerShiftRight;
    }

    public static final boolean A0(Throwable th, Function0 function0) {
        j77 j77Var;
        List listB = aib.i.b(th);
        int size = listB.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (((Throwable) listB.get(i2)) instanceof j77) {
                return false;
            }
        }
        try {
            yg5 yg5Var = (yg5) function0.invoke();
            if (yg5Var != null) {
                List list = yg5Var.a;
                if (yg5Var.b) {
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((zg5) list.get(i3)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            j77Var = z ? new j77(yg5Var) : null;
        } catch (Throwable th2) {
            j77Var = th2;
        }
        if (j77Var != null) {
            wf8.a(th, j77Var);
        }
        return z;
    }

    public static void B(jjm jjmVar) {
        jjmVar.setRequestDismisser(new n57((byte) 5));
        jjmVar.finish(hjm.b);
    }

    public static String B0(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type C(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new n5a(C(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new o5a(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new n5a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new p5a(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static boolean C0(ContextWrapper contextWrapper, List list) {
        List listR0 = r0(list);
        if (Build.VERSION.SDK_INT <= 29) {
            G(contextWrapper, listR0);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listR0.iterator();
        while (it.hasNext()) {
            arrayList.add(((nhj) it.next()).a());
        }
        if (!((ShortcutManager) contextWrapper.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList)) {
            return false;
        }
        W(contextWrapper).getClass();
        Iterator it2 = ((ArrayList) V(contextWrapper)).iterator();
        if (it2.hasNext()) {
            throw p3p.g(it2);
        }
        return true;
    }

    public static void D(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            qp2.o("Primitive type is not allowed");
        }
    }

    public static String D0(String str) {
        return sko.k("<link>", str, "</link>");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long E(tlh r18, g54 r19, int r20, long r21) {
        /*
            r0 = r18
            r2 = r19
            byte[] r1 = r2.a
            int r1 = r1.length
            long r3 = (long) r1
            r1 = r20
            long r7 = (long) r1
            r5 = 0
            defpackage.qyn.m(r3, r5, r7)
            r8 = r7
            boolean r3 = r0.c
            d04 r1 = r0.b
            r4 = 0
            if (r3 != 0) goto L78
        L19:
            r7 = r20
            r3 = r4
            r5 = r21
            long r10 = b.a(r1, r2, r3, r5, r7)
            r4 = r3
            r6 = -1
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 == 0) goto L2a
            return r10
        L2a:
            long r10 = r1.b
            long r12 = r10 - r8
            r14 = 1
            long r12 = r12 + r14
            int r3 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r3 >= 0) goto L75
            int r3 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r3 >= 0) goto L3c
            r16 = r6
            goto L5d
        L3c:
            long r10 = r10 - r21
            long r10 = r10 + r14
            long r10 = java.lang.Math.max(r14, r10)
            int r3 = (int) r10
            long r10 = r1.b
            long r10 = r10 - r4
            long r10 = r10 + r14
            long r10 = java.lang.Math.min(r8, r10)
            int r10 = (int) r10
            int r10 = r10 + (-1)
            if (r3 > r10) goto L75
        L51:
            long r14 = r1.b
            r16 = r6
            long r6 = (long) r10
            long r14 = r14 - r6
            boolean r6 = r1.q(r10, r2, r14)
            if (r6 == 0) goto L6e
        L5d:
            ewj r3 = r0.a
            r6 = 8192(0x2000, double:4.0474E-320)
            long r6 = r3.read(r1, r6)
            int r3 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r3 == 0) goto L77
            long r4 = java.lang.Math.max(r4, r12)
            goto L19
        L6e:
            if (r10 == r3) goto L77
            int r10 = r10 + (-1)
            r6 = r16
            goto L51
        L75:
            r16 = r6
        L77:
            return r16
        L78:
            java.lang.String r0 = "closed"
            qp2.n(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phj.E(tlh, g54, int, long):long");
    }

    public static void E0(ByteArrayOutputStream byteArrayOutputStream, i77 i77Var) throws IOException {
        H0(byteArrayOutputStream, i77Var);
        int i2 = i77Var.g;
        int[] iArr = i77Var.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            wyh.b0(i5 - i4, byteArrayOutputStream);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 << 1) + 7) & (-8)) / 8];
        for (Map.Entry entry : i77Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i6 = iIntValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i7 = iIntValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) (bArr[i8] | (1 << (i7 % 8)));
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final boolean F(voh vohVar, float f2, float f3) {
        float f4 = vohVar.a;
        if (f2 > vohVar.c || f4 > f2) {
            return false;
        }
        return f3 <= vohVar.d && vohVar.b <= f3;
    }

    public static void F0(ByteArrayOutputStream byteArrayOutputStream, i77 i77Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        wyh.b0(str.getBytes(charset).length, byteArrayOutputStream);
        wyh.b0(i77Var.e, byteArrayOutputStream);
        wyh.a0(byteArrayOutputStream, i77Var.f, 4);
        wyh.a0(byteArrayOutputStream, i77Var.c, 4);
        wyh.a0(byteArrayOutputStream, i77Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void G(Context context, List list) {
        Bitmap bitmapDecodeStream;
        IconCompat iconCompatB;
        ArrayList arrayList = new ArrayList(list);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            nhj nhjVar = (nhj) obj;
            IconCompat iconCompat = nhjVar.h;
            if (iconCompat != null) {
                int i3 = iconCompat.a;
                if (i3 == 6 || i3 == 4) {
                    InputStream inputStreamI = iconCompat.i(context);
                    if (inputStreamI != null && (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamI)) != null) {
                        if (i3 == 6) {
                            iconCompatB = new IconCompat(5);
                            iconCompatB.b = bitmapDecodeStream;
                        } else {
                            iconCompatB = IconCompat.b(bitmapDecodeStream);
                        }
                        nhjVar.h = iconCompatB;
                    }
                }
            }
            list.remove(nhjVar);
        }
    }

    public static void G0(ByteArrayOutputStream byteArrayOutputStream, int i2, i77 i77Var) throws IOException {
        int i3 = i77Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : i77Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & iIntValue2) == i5) {
                        int i6 = (i4 * i3) + iIntValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) (bArr[i7] | (1 << (i6 % 8)));
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static byte[] H(i77[] i77VarArr, byte[] bArr) throws IOException {
        int i2 = 0;
        int length = 0;
        for (i77 i77Var : i77VarArr) {
            length += ((((i77Var.g << 1) + 7) & (-8)) / 8) + R(i77Var.a, bArr, i77Var.b).getBytes(StandardCharsets.UTF_8).length + 16 + (i77Var.e << 1) + i77Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, y9m.i)) {
            int length2 = i77VarArr.length;
            while (i2 < length2) {
                i77 i77Var2 = i77VarArr[i2];
                F0(byteArrayOutputStream, i77Var2, R(i77Var2.a, bArr, i77Var2.b));
                E0(byteArrayOutputStream, i77Var2);
                i2++;
            }
        } else {
            for (i77 i77Var3 : i77VarArr) {
                F0(byteArrayOutputStream, i77Var3, R(i77Var3.a, bArr, i77Var3.b));
            }
            int length3 = i77VarArr.length;
            while (i2 < length3) {
                E0(byteArrayOutputStream, i77VarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static void H0(ByteArrayOutputStream byteArrayOutputStream, i77 i77Var) {
        int i2 = 0;
        for (Map.Entry entry : i77Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                wyh.b0(iIntValue - i2, byteArrayOutputStream);
                wyh.b0(0, byteArrayOutputStream);
                i2 = iIntValue;
            }
        }
    }

    public static FrameLayout I(Context context, int i2, boolean z, av4 av4Var) {
        kf kfVarA = kf.a(LayoutInflater.from(context).inflate(2131558483, (ViewGroup) null, false));
        CheckBox checkBox = (CheckBox) kfVarA.c;
        checkBox.setText(i2);
        checkBox.setChecked(z);
        if (av4Var != null) {
            checkBox.m = av4Var;
        }
        return (FrameLayout) kfVarA.b;
    }

    public static StylingTextView J(Context context) {
        StylingTextView stylingTextViewInflate = LayoutInflater.from(context).inflate(2131558485, (ViewGroup) null, false);
        if (stylingTextViewInflate != null) {
            return stylingTextViewInflate;
        }
        t3p.q("rootView");
        return null;
    }

    public static void K(g29 g29Var, w6g w6gVar) throws IOException {
        if (g29Var.exists(w6gVar)) {
            return;
        }
        try {
            g29Var.sink(w6gVar).close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void L(g29 g29Var, w6g w6gVar) throws IOException {
        try {
            IOException iOException = null;
            for (w6g w6gVar2 : g29Var.list(w6gVar)) {
                try {
                    if (g29Var.metadata(w6gVar2).b) {
                        L(g29Var, w6gVar2);
                    }
                    g29Var.delete(w6gVar2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static boolean M() {
        Context context;
        SharedPreferences sharedPreferences;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            r49.e();
            r49 r49VarE = r49.e();
            r49VarE.a();
            context = r49VarE.a;
            sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains("export_to_big_query")) {
            return sharedPreferences.getBoolean("export_to_big_query", false);
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), NotificationCompat.FLAG_HIGH_PRIORITY)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        return false;
    }

    public static void N(BrowserActivity browserActivity, List list) {
        ((ShortcutManager) browserActivity.getSystemService(ShortcutManager.class)).disableShortcuts(list, null);
        W(browserActivity).getClass();
        Iterator it = ((ArrayList) V(browserActivity)).iterator();
        if (it.hasNext()) {
            throw p3p.g(it);
        }
    }

    public static void O(Context context, List list) {
        List listR0 = r0(list);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = listR0.iterator();
        while (it.hasNext()) {
            arrayList.add(((nhj) it.next()).b);
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).enableShortcuts(arrayList);
        W(context).getClass();
        Iterator it2 = ((ArrayList) V(context)).iterator();
        if (it2.hasNext()) {
            throw p3p.g(it2);
        }
    }

    public static boolean P(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return P(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static void Q(bz0 bz0Var, boolean z) {
        Button buttonF = bz0Var.f(-1);
        Button buttonF2 = bz0Var.f(-2);
        fwi fwiVar = new fwi(z, new jv(bz0Var, (byte) 1));
        buttonF.setOnTouchListener(fwiVar);
        buttonF2.setOnTouchListener(fwiVar);
    }

    public static String R(String str, byte[] bArr, String str2) {
        byte[] bArr2 = y9m.j;
        byte[] bArr3 = y9m.k;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return z1m.l(new StringBuilder(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static int S(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = i[i6];
        if (i3 == 2) {
            i7 /= 2;
        } else if (i3 == 0) {
            i7 /= 4;
        }
        int i8 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return v0g.h(i3 == 3 ? j[i5 - 1] : k[i5 - 1], 12, i7, i8) << 2;
        }
        int i9 = i3 == 3 ? i4 == 2 ? l[i5 - 1] : m[i5 - 1] : o[i5 - 1];
        if (i3 == 3) {
            return v0g.h(i9, 144, i7, i8);
        }
        return v0g.h(i4 == 1 ? 72 : 144, i9, i7, i8);
    }

    public static Type T(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return T(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return T(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Class U(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) U(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return U(((WildcardType) type).getUpperBounds()[0]);
        }
        kp5.d("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    public static List V(Context context) {
        Bundle bundle;
        String string;
        if (d == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, NotificationCompat.FLAG_HIGH_PRIORITY).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        if (Class.forName(string, false, phj.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context) != null) {
                            throw new ClassCastException();
                        }
                        arrayList.add(null);
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
            if (d == null) {
                d = arrayList;
            }
        }
        return d;
    }

    public static ohj W(Context context) {
        if (b == null) {
            try {
                b = (ohj) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, phj.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (b == null) {
                b = new ohj();
            }
        }
        return b;
    }

    public static SpannableStringBuilder X(Context context, int i2, CharSequence... charSequenceArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(i2));
        int i3 = 0;
        while (i3 < charSequenceArr.length) {
            Locale locale = Locale.US;
            int i4 = i3 + 1;
            String strI = p3p.i(i4, "%", "$s");
            int iIndexOf = spannableStringBuilder.toString().indexOf(strI);
            if (iIndexOf != -1) {
                spannableStringBuilder.replace(iIndexOf, strI.length() + iIndexOf, charSequenceArr[i3]);
            }
            i3 = i4;
        }
        return spannableStringBuilder;
    }

    public static Type Y(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if (cls2.isAssignableFrom(cls)) {
            return s0(type, cls, T(type, cls, cls2), new HashMap());
        }
        throw new IllegalArgumentException(cls + " is not the same as or a subtype of " + cls2);
    }

    public static void Z(TextView textView) {
        u8n u8nVar;
        dll dllVarS = q9n.s(textView);
        if (dllVarS != null && (u8nVar = (u8n) textView.getTag(2131365014)) != null && u8nVar.b == textView && u8nVar.a == dllVarS) {
            ArrayList arrayList = u8nVar.f;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (wwj.class.isAssignableFrom(((r8n) obj).getClass())) {
                    return;
                }
            }
        }
        wwj wwjVar = new wwj(textView);
        dll dllVarV = hjf.v(textView.getContext());
        if (dllVarV == null) {
            return;
        }
        u8n.b(dllVarV, textView, wwjVar);
    }

    public static boolean a0(y42 y42Var) {
        int i2 = y42Var == null ? -1 : q62.a[y42Var.ordinal()];
        if (i2 != -1) {
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    if (i2 != 4) {
                        h9o.p();
                        return false;
                    }
                    qp2.o("");
                }
            }
            return false;
        }
        return true;
    }

    public static void b0(TextView textView, String str, Callback callback) {
        textView.setText(n1h.d(str, new owj("<link>", "</link>", new twj(textView.getContext(), callback))));
        vwj.a(textView);
    }

    public static void c0(TextView textView, String str, String str2, String str3, agc agcVar) {
        int iLastIndexOf = str.lastIndexOf(str2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.replace(str2, str3));
        spannableStringBuilder.setSpan(agcVar, iLastIndexOf, str3.length() + iLastIndexOf, 17);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        vwj.a(textView);
    }

    public static final void d0(Context context, String str, fie fieVar) {
        wjo wjoVar = wjo.b;
        if (fcp.a(fieVar) == null || fcp.c(fieVar, str) == null) {
            return;
        }
        ejo ejoVar = fko.a;
        fko.a(context);
        bie bieVar = new bie(context.getApplicationContext(), str);
        o7p o7pVarB = bieVar.b();
        c5o c5oVar = new c5o(fieVar, bieVar);
        o7pVarB.getClass();
        ((pxo) o7pVarB).c = new uuj(c5oVar);
        bieVar.b().c();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2 A[PHI: r6
      0x00c2: PHI (r6v20 java.lang.String) = (r6v19 java.lang.String), (r6v33 java.lang.String) binds: [B:38:0x00ac, B:41:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e0(android.content.Intent r22) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phj.e0(android.content.Intent):void");
    }

    public static void f0(Bundle bundle, String str) {
        try {
            r49.e();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException unused) {
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException unused2) {
                }
            }
            String str2 = isd.B(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            z01 z01Var = (y01) r49.e().b(y01.class);
            if (z01Var != null) {
                z01Var.a(bundle2, str);
            }
        } catch (IllegalStateException unused3) {
        }
    }

    public static float g0(float f2, float[] fArr, float[] fArr2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float fAbs = Math.abs(f2);
        float fSignum = Math.signum(f2);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i2 = -(iBinarySearch + 1);
        int i3 = i2 - 1;
        if (i3 >= fArr.length - 1) {
            float f7 = fArr[fArr.length - 1];
            float f8 = fArr2[fArr.length - 1];
            if (f7 == 0.0f) {
                return 0.0f;
            }
            return (f8 / f7) * f2;
        }
        if (i3 == -1) {
            float f9 = fArr[0];
            f5 = fArr2[0];
            f6 = f9;
            f4 = 0.0f;
            f3 = 0.0f;
        } else {
            float f10 = fArr[i3];
            float f11 = fArr[i2];
            f3 = fArr2[i3];
            f4 = f10;
            f5 = fArr2[i2];
            f6 = f11;
        }
        return (((f5 - f3) * Math.max(0.0f, Math.min(1.0f, f4 == f6 ? 0.0f : (fAbs - f4) / (f6 - f4)))) + f3) * fSignum;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:60:0x0195
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e0 A[PHI: r6
      0x01e0: PHI (r6v12 int) = (r6v8 int), (r6v8 int), (r6v8 int), (r6v18 int) binds: [B:81:0x01f5, B:67:0x01b8, B:69:0x01c2, B:77:0x01d9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.hyf h0(defpackage.ih5 r46, int r47) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phj.h0(ih5, int):hyf");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x028a A[PHI: r14 r15
      0x028a: PHI (r14v4 java.util.List) = (r14v3 java.util.List), (r14v5 java.util.List) binds: [B:100:0x0241, B:113:0x0288] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r15v6 int) = (r15v5 int), (r15v7 int) binds: [B:100:0x0241, B:113:0x0288] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0416  */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i0(android.view.ViewStructure r42, defpackage.m3c r43, android.view.autofill.AutofillId r44, java.lang.String r45, defpackage.yoh r46) {
        /*
            Method dump skipped, instructions count: 1079
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phj.i0(android.view.ViewStructure, m3c, android.view.autofill.AutofillId, java.lang.String, yoh):void");
    }

    public static int[] j0(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iT = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iT += (int) wyh.T(byteArrayInputStream, 2);
            iArr[i3] = iT;
        }
        return iArr;
    }

    public static i77[] k0(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, i77[] i77VarArr) throws IOException {
        byte[] bArr3 = y9m.l;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, y9m.m)) {
                qp2.n("Unsupported meta version");
                return null;
            }
            int iT = (int) wyh.T(fileInputStream, 2);
            byte[] bArrS = wyh.S(fileInputStream, (int) wyh.T(fileInputStream, 4), (int) wyh.T(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                qp2.n("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrS);
            try {
                i77[] i77VarArrM0 = m0(byteArrayInputStream, bArr2, iT, i77VarArr);
                byteArrayInputStream.close();
                return i77VarArrM0;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(y9m.g, bArr2)) {
            qp2.n("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            qp2.n("Unsupported meta version");
            return null;
        }
        int iT2 = (int) wyh.T(fileInputStream, 1);
        byte[] bArrS2 = wyh.S(fileInputStream, (int) wyh.T(fileInputStream, 4), (int) wyh.T(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            qp2.n("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrS2);
        try {
            i77[] i77VarArrL0 = l0(byteArrayInputStream2, iT2, i77VarArr);
            byteArrayInputStream2.close();
            return i77VarArrL0;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static i77[] l0(ByteArrayInputStream byteArrayInputStream, int i2, i77[] i77VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new i77[0];
        }
        if (i2 != i77VarArr.length) {
            qp2.n("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iT = (int) wyh.T(byteArrayInputStream, 2);
            iArr[i3] = (int) wyh.T(byteArrayInputStream, 2);
            strArr[i3] = new String(wyh.R(byteArrayInputStream, iT), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            i77 i77Var = i77VarArr[i4];
            if (!i77Var.b.equals(strArr[i4])) {
                qp2.n("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            i77Var.e = i5;
            i77Var.h = j0(byteArrayInputStream, i5);
        }
        return i77VarArr;
    }

    public static i77[] m0(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, i77[] i77VarArr) {
        i77 i77Var;
        if (byteArrayInputStream.available() == 0) {
            return new i77[0];
        }
        if (i2 != i77VarArr.length) {
            qp2.n("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            wyh.T(byteArrayInputStream, 2);
            String str = new String(wyh.R(byteArrayInputStream, (int) wyh.T(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jT = wyh.T(byteArrayInputStream, 4);
            int iT = (int) wyh.T(byteArrayInputStream, 2);
            if (i77VarArr.length <= 0) {
                i77Var = null;
            } else {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i4 = 0; i4 < i77VarArr.length; i4++) {
                    if (i77VarArr[i4].b.equals(strSubstring)) {
                        i77Var = i77VarArr[i4];
                        break;
                    }
                }
                i77Var = null;
            }
            if (i77Var == null) {
                qp2.n("Missing profile key: ".concat(str));
                return null;
            }
            i77Var.d = jT;
            int[] iArrJ0 = j0(byteArrayInputStream, iT);
            if (Arrays.equals(bArr, y9m.k)) {
                i77Var.e = iT;
                i77Var.h = iArrJ0;
            }
        }
        return i77VarArr;
    }

    public static final void n(yg3 yg3Var, boolean z, c8e c8eVar, ih5 ih5Var, int i2) {
        int i3;
        yg3 yg3Var2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(930948038);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? vt9Var.f(yg3Var) : vt9Var.h(yg3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.f(null) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= vt9Var.f(c8eVar) ? 2048 : 1024;
        }
        byte b2 = 1;
        if (vt9Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 14;
            boolean z2 = i4 == 4 || ((i3 & 8) != 0 && vt9Var.f(yg3Var));
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (z2 || objK == zpaVar) {
                objK = ui6.a(z ? 0.0f : 1.0f);
                vt9Var.g0(objK);
            }
            cd1 cd1Var = (cd1) objK;
            boolean zH = ((i3 & 112) == 32) | vt9Var.h(cd1Var);
            Object objK2 = vt9Var.K();
            if (zH || objK2 == zpaVar) {
                objK2 = new tx6(z, cd1Var, null);
                vt9Var.g0(objK2);
            }
            rm5.e(vt9Var, yg3Var, (Function2) objK2);
            boolean zH2 = vt9Var.h(cd1Var);
            Object objK3 = vt9Var.K();
            if (zH2 || objK3 == zpaVar) {
                objK3 = new f7e(cd1Var, b2);
                vt9Var.g0(objK3);
            }
            yg3Var2 = yg3Var;
            xf8.j(yg3Var2, null, z5i.N(c8eVar, (Function1) objK3), null, jr5.a, 0.0f, null, vt9Var, 24584 | i4 | ((i3 >> 3) & 112), pd.V0);
        } else {
            yg3Var2 = yg3Var;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new zef(yg3Var2, z, c8eVar, i2);
        }
    }

    public static i77[] n0(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, y9m.h)) {
            qp2.n("Unsupported version");
            return null;
        }
        int iT = (int) wyh.T(fileInputStream, 1);
        byte[] bArrS = wyh.S(fileInputStream, (int) wyh.T(fileInputStream, 4), (int) wyh.T(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            qp2.n("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrS);
        try {
            i77[] i77VarArrO0 = o0(byteArrayInputStream, str, iT);
            byteArrayInputStream.close();
            return i77VarArrO0;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final crb o(rpb rpbVar, Function1 function1) {
        aqb aqbVar = new aqb();
        gqb gqbVar = rpbVar.a;
        aqbVar.a = gqbVar.a;
        aqbVar.b = gqbVar.f;
        aqbVar.c = gqbVar.b;
        aqbVar.d = gqbVar.c;
        aqbVar.e = gqbVar.e;
        String str = gqbVar.g;
        aqbVar.f = str;
        aqbVar.g = gqbVar.h;
        aqbVar.h = gqbVar.i;
        aqbVar.i = gqbVar.l;
        aqbVar.j = gqbVar.k;
        aqbVar.k = gqbVar.j;
        aqbVar.l = gqbVar.d;
        aqbVar.m = rpbVar.b;
        aqbVar.n = gqbVar.m;
        aqbVar.o = gqbVar.n;
        function1.invoke(aqbVar);
        if (aqbVar.e) {
            if (!Intrinsics.a(str, "    ")) {
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        bxl.d("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str));
                        return null;
                    }
                }
            }
        } else if (!Intrinsics.a(str, "    ")) {
            qp2.o("Indent should not be specified when default printing mode is used");
            return null;
        }
        gqb gqbVar2 = new gqb(aqbVar.a, aqbVar.c, aqbVar.d, aqbVar.l, aqbVar.e, aqbVar.b, aqbVar.f, aqbVar.g, aqbVar.h, aqbVar.k, aqbVar.j, aqbVar.i, aqbVar.n, aqbVar.o);
        x79 x79Var = aqbVar.m;
        crb crbVar = new crb(gqbVar2, x79Var);
        if (Intrinsics.a(x79Var, y2j.a)) {
            return crbVar;
        }
        o15 o15Var = o15.a;
        ((n08) x79Var.a).getClass();
        v08 v08Var = v08.a;
        v08Var.getClass();
        k08 k08Var = k08.a;
        k08Var.getClass();
        ((n08) x79Var.b).getClass();
        v08Var.getClass();
        k08Var.getClass();
        ((n08) x79Var.c).getClass();
        v08Var.getClass();
        k08Var.getClass();
        ((n08) x79Var.e).getClass();
        v08Var.getClass();
        k08Var.getClass();
        return crbVar;
    }

    public static i77[] o0(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new i77[0];
        }
        i77[] i77VarArr = new i77[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int iT = (int) wyh.T(byteArrayInputStream, 2);
            int iT2 = (int) wyh.T(byteArrayInputStream, 2);
            i77VarArr[i4] = new i77(str, new String(wyh.R(byteArrayInputStream, iT), StandardCharsets.UTF_8), wyh.T(byteArrayInputStream, 4), iT2, (int) wyh.T(byteArrayInputStream, 4), (int) wyh.T(byteArrayInputStream, 4), new int[iT2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            i77 i77Var = i77VarArr[i5];
            int iAvailable = byteArrayInputStream.available();
            int i6 = i77Var.f;
            int i7 = i77Var.g;
            TreeMap treeMap = i77Var.i;
            int i8 = iAvailable - i6;
            int iT3 = i3;
            while (byteArrayInputStream.available() > i8) {
                iT3 += (int) wyh.T(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iT3), 1);
                int iT4 = (int) wyh.T(byteArrayInputStream, 2);
                while (iT4 > 0) {
                    wyh.T(byteArrayInputStream, 2);
                    int iT5 = (int) wyh.T(byteArrayInputStream, 1);
                    if (iT5 != 6 && iT5 != 7) {
                        while (iT5 > 0) {
                            wyh.T(byteArrayInputStream, 1);
                            int i9 = i3;
                            int i10 = i5;
                            for (int iT6 = (int) wyh.T(byteArrayInputStream, 1); iT6 > 0; iT6--) {
                                wyh.T(byteArrayInputStream, 2);
                            }
                            iT5--;
                            i3 = i9;
                            i5 = i10;
                        }
                    }
                    iT4--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i11 = i3;
            int i12 = i5;
            if (byteArrayInputStream.available() != i8) {
                qp2.n("Read too much data during profile line parse");
                return null;
            }
            i77Var.h = j0(byteArrayInputStream, i77Var.e);
            BitSet bitSetValueOf = BitSet.valueOf(wyh.R(byteArrayInputStream, (((i7 << 1) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i7; i13++) {
                int i14 = bitSetValueOf.get(i13) ? 2 : i11;
                if (bitSetValueOf.get(i13 + i7)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(numValueOf.intValue() | i14));
                }
            }
            i5 = i12 + 1;
            i3 = i11;
        }
        return i77VarArr;
    }

    public static final void p(final long j2, c8e c8eVar, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1756918109);
        int i3 = (vt9Var.e(j2) ? 4 : 2) | i2 | (vt9Var.f(c8eVar) ? 32 : 16);
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            d7b d7bVarP0 = p0(vt9Var, 0);
            e8m e8mVarX = rm5.X(900, 2, wq7.c);
            puh puhVar = puh.a;
            final b7b b7bVarV = v(d7bVarP0, 0.0f, 1.0f, rm5.C(e8mVarX, 0L, 4), vt9Var, 29112, 0);
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (z || objK == zpaVar) {
                u95 u95Var = new u95(cs5.e0(j2, u95.c, 0.18f));
                vt9Var.g0(u95Var);
                objK = u95Var;
            }
            final long j3 = ((u95) objK).a;
            boolean zE = (i4 == 4) | vt9Var.e(j3) | vt9Var.f(b7bVarV);
            Object objK2 = vt9Var.K();
            if (zE || objK2 == zpaVar) {
                objK2 = new Function1() { // from class: yef
                    public final Object invoke(Object obj) {
                        mk7.z0((mk7) obj, cs5.e0(j2, j3, ((Number) b7bVarV.c.getValue()).floatValue()), 0L, 0.0f, 126);
                        return Unit.a;
                    }
                };
                vt9Var.g0(objK2);
            }
            ocp.c(vt9Var, fr3.D(c8eVar, (Function1) objK2));
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new u41(j2, c8eVar, i2);
        }
    }

    public static final d7b p0(ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        Object objK = vt9Var.K();
        if (objK == hh5.a) {
            objK = new d7b();
            vt9Var.g0(objK);
        }
        d7b d7bVar = (d7b) objK;
        d7bVar.a(vt9Var, 0);
        return d7bVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: oye */
    public static final void q(fff fffVar, c8e c8eVar, ih5 ih5Var, int i2) throws oye {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1311142587);
        int i3 = (vt9Var.f(fffVar) ? 4 : 2) | i2 | (vt9Var.f(c8eVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        byte b2 = 17;
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            long jA = fffVar.a();
            if (jA == 16) {
                jA = u95.f;
            }
            tfd tfdVarC = nr3.c(rbe.b, false);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVar);
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
            as3 as3Var = as3.a;
            c8e c8eVarB = as3Var.b();
            boolean zE = vt9Var.e(jA);
            Object objK = vt9Var.K();
            if (zE || objK == hh5.a) {
                objK = new x41(jA, (byte) 17);
                vt9Var.g0(objK);
            }
            ocp.c(vt9Var, fr3.D(c8eVarB, (Function1) objK));
            if (fffVar instanceof eff) {
                vt9Var.W(-2120316209);
                p(jA, as3Var.b(), vt9Var, 0);
                vt9Var.p(false);
            } else if (fffVar instanceof dff) {
                vt9Var.W(-2120312702);
                dff dffVar = (dff) fffVar;
                n(dffVar.a, dffVar.c, as3Var.b(), vt9Var, 392);
                vt9Var.p(false);
            } else if (fffVar instanceof bff) {
                vt9Var.W(-1304886503);
                Integer num = ((bff) fffVar).b;
                if (num == null) {
                    vt9Var.W(-1304886504);
                    vt9Var.p(false);
                } else {
                    vt9Var.W(-1304886503);
                    r(num.intValue(), 0, vt9Var, as3Var.b());
                    vt9Var.p(false);
                }
                vt9Var.p(false);
            } else {
                if (!(fffVar instanceof cff)) {
                    throw fki.m(vt9Var, -2120317875, false);
                }
                vt9Var.W(-2120298045);
                vt9Var.p(false);
            }
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new hda(fffVar, c8eVar, i2, b2);
        }
    }

    public static void q0(BrowserActivity browserActivity, List list) {
        ((ShortcutManager) browserActivity.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        W(browserActivity).getClass();
        Iterator it = ((ArrayList) V(browserActivity)).iterator();
        if (it.hasNext()) {
            throw p3p.g(it);
        }
    }

    public static final void r(int i2, int i3, ih5 ih5Var, c8e c8eVar) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1451206397);
        byte b2 = 4;
        int i4 = (vt9Var.d(i2) ? 4 : 2) | i3 | (vt9Var.f(c8eVar) ? 32 : 16);
        if (vt9Var.N(i4 & 1, (i4 & 19) != 18)) {
            hyf hyfVarH0 = h0(vt9Var, i2);
            td3 td3Var = rbe.c;
            Object objK = vt9Var.K();
            if (objK == hh5.a) {
                objK = new w5f((byte) 7);
                vt9Var.g0(objK);
            }
            xf8.j(hyfVarH0, null, z5i.N(c8eVar, (Function1) objK), td3Var, jr5.a, 0.0f, null, vt9Var, 27704, 96);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ul4(i2, c8eVar, i3, b2);
        }
    }

    public static List r0(List list) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 32) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((nhj) it.next()).getClass();
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fb A[LOOP:0: B:100:0x01f9->B:101:0x01fb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x025c A[Catch: JSONException -> 0x03b4, TryCatch #2 {JSONException -> 0x03b4, blocks: (B:103:0x0247, B:105:0x025c, B:107:0x0268, B:108:0x0274, B:109:0x0279, B:111:0x02c5, B:112:0x02cc, B:114:0x02d0, B:115:0x02d7, B:117:0x034d, B:118:0x0356, B:120:0x035c, B:121:0x0366, B:122:0x036b, B:124:0x0371, B:125:0x037a, B:127:0x0380, B:128:0x038c, B:129:0x0391, B:131:0x0397, B:132:0x03a0), top: B:153:0x0247 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c5 A[Catch: JSONException -> 0x03b4, TryCatch #2 {JSONException -> 0x03b4, blocks: (B:103:0x0247, B:105:0x025c, B:107:0x0268, B:108:0x0274, B:109:0x0279, B:111:0x02c5, B:112:0x02cc, B:114:0x02d0, B:115:0x02d7, B:117:0x034d, B:118:0x0356, B:120:0x035c, B:121:0x0366, B:122:0x036b, B:124:0x0371, B:125:0x037a, B:127:0x0380, B:128:0x038c, B:129:0x0391, B:131:0x0397, B:132:0x03a0), top: B:153:0x0247 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d0 A[Catch: JSONException -> 0x03b4, TryCatch #2 {JSONException -> 0x03b4, blocks: (B:103:0x0247, B:105:0x025c, B:107:0x0268, B:108:0x0274, B:109:0x0279, B:111:0x02c5, B:112:0x02cc, B:114:0x02d0, B:115:0x02d7, B:117:0x034d, B:118:0x0356, B:120:0x035c, B:121:0x0366, B:122:0x036b, B:124:0x0371, B:125:0x037a, B:127:0x0380, B:128:0x038c, B:129:0x0391, B:131:0x0397, B:132:0x03a0), top: B:153:0x0247 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x034d A[Catch: JSONException -> 0x03b4, TryCatch #2 {JSONException -> 0x03b4, blocks: (B:103:0x0247, B:105:0x025c, B:107:0x0268, B:108:0x0274, B:109:0x0279, B:111:0x02c5, B:112:0x02cc, B:114:0x02d0, B:115:0x02d7, B:117:0x034d, B:118:0x0356, B:120:0x035c, B:121:0x0366, B:122:0x036b, B:124:0x0371, B:125:0x037a, B:127:0x0380, B:128:0x038c, B:129:0x0391, B:131:0x0397, B:132:0x03a0), top: B:153:0x0247 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0371 A[Catch: JSONException -> 0x03b4, TryCatch #2 {JSONException -> 0x03b4, blocks: (B:103:0x0247, B:105:0x025c, B:107:0x0268, B:108:0x0274, B:109:0x0279, B:111:0x02c5, B:112:0x02cc, B:114:0x02d0, B:115:0x02d7, B:117:0x034d, B:118:0x0356, B:120:0x035c, B:121:0x0366, B:122:0x036b, B:124:0x0371, B:125:0x037a, B:127:0x0380, B:128:0x038c, B:129:0x0391, B:131:0x0397, B:132:0x03a0), top: B:153:0x0247 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0397 A[Catch: JSONException -> 0x03b4, TryCatch #2 {JSONException -> 0x03b4, blocks: (B:103:0x0247, B:105:0x025c, B:107:0x0268, B:108:0x0274, B:109:0x0279, B:111:0x02c5, B:112:0x02cc, B:114:0x02d0, B:115:0x02d7, B:117:0x034d, B:118:0x0356, B:120:0x035c, B:121:0x0366, B:122:0x036b, B:124:0x0371, B:125:0x037a, B:127:0x0380, B:128:0x038c, B:129:0x0391, B:131:0x0397, B:132:0x03a0), top: B:153:0x0247 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0194 A[Catch: all -> 0x019a, TRY_LEAVE, TryCatch #8 {all -> 0x019a, blocks: (B:80:0x0186, B:82:0x0194), top: B:165:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void s(android.content.Context r39, pqo r40, ejo r41) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phj.s(android.content.Context, pqo, ejo):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [p5a] */
    /* JADX WARN: Type inference failed for: r12v4, types: [p5a] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type s0(java.lang.reflect.Type r10, java.lang.Class r11, java.lang.reflect.Type r12, java.util.HashMap r13) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phj.s0(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashMap):java.lang.reflect.Type");
    }

    public static void t(String str, int i2) {
        cm cmVar = new cm(i2, str, (byte) 10);
        if (URLUtil.isNetworkUrl(str)) {
            hyg.c(new jro(str, cmVar, 3, 3));
        } else {
            hyg.b(cmVar);
        }
    }

    public static void t0(Context context, String str) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(str, str));
        }
    }

    public static void u(Context context, List list) {
        List listR0 = r0(list);
        if (Build.VERSION.SDK_INT <= 29) {
            G(context, listR0);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listR0.iterator();
        while (it.hasNext()) {
            arrayList.add(((nhj) it.next()).a());
        }
        if (((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList)) {
            W(context).getClass();
            Iterator it2 = ((ArrayList) V(context)).iterator();
            if (it2.hasNext()) {
                throw p3p.g(it2);
            }
        }
    }

    public static void u0(TextView textView, CharSequence charSequence) {
        if (!(charSequence instanceof Spannable)) {
            textView.setText(charSequence);
        } else {
            textView.setText(charSequence, TextView.BufferType.SPANNABLE);
            vwj.a(textView);
        }
    }

    public static final b7b v(d7b d7bVar, float f2, float f3, y6b y6bVar, ih5 ih5Var, int i2, int i3) {
        b7b b7bVar;
        Float fValueOf = Float.valueOf(f2);
        Float fValueOf2 = Float.valueOf(f3);
        vt9 vt9Var = (vt9) ih5Var;
        Object objK = vt9Var.K();
        zpa zpaVar = hh5.a;
        if (objK == zpaVar) {
            objK = new b7b(d7bVar, fValueOf, fValueOf2, y6bVar);
            vt9Var.g0(objK);
        }
        b7b b7bVar2 = (b7b) objK;
        boolean zH = vt9Var.h(y6bVar);
        Object objK2 = vt9Var.K();
        if (zH || objK2 == zpaVar) {
            b7bVar = b7bVar2;
            i51 i51Var = new i51((Object) fValueOf, (Object) b7bVar, (Object) fValueOf2, (Object) y6bVar, (byte) 9);
            vt9Var.g0(i51Var);
            objK2 = i51Var;
        } else {
            b7bVar = b7bVar2;
        }
        rm5.L(vt9Var, (Function0) objK2);
        boolean zH2 = vt9Var.h(d7bVar);
        Object objK3 = vt9Var.K();
        if (zH2 || objK3 == zpaVar) {
            objK3 = new ry7(d7bVar, b7bVar, (byte) 20);
            vt9Var.g0(objK3);
        }
        rm5.b(b7bVar, (Function1) objK3, vt9Var);
        return b7bVar;
    }

    public static boolean v0(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static int w(int i2, int i3, int i4) {
        int i5 = ((i2 >>> i4) ^ i2) & i3;
        return (i5 ^ (i5 << i4)) ^ i2;
    }

    public static void w0(bz0 bz0Var, Drawable drawable, ImageView.ScaleType scaleType, ColorStateList colorStateList, int i2, ColorStateList colorStateList2) {
        ViewGroup viewGroup = (ViewGroup) bz0Var.findViewById(2131362013);
        StylingImageView stylingImageViewFindViewById = bz0Var.findViewById(2131362012);
        if (viewGroup == null || stylingImageViewFindViewById == null) {
            return;
        }
        viewGroup.setVisibility(drawable != null ? 0 : 8);
        stylingImageViewFindViewById.setImageDrawable(drawable);
        stylingImageViewFindViewById.setScaleType(scaleType);
        stylingImageViewFindViewById.c(colorStateList);
        stylingImageViewFindViewById.setBackgroundResource(i2);
        stylingImageViewFindViewById.e.M(colorStateList2);
    }

    public static long x(int i2, long j2, long j3) {
        long j4 = ((j2 >>> i2) ^ j2) & j3;
        return (j4 ^ (j4 << i2)) ^ j2;
    }

    public static final moa x0(pzh pzhVar) {
        if (!pzhVar.q) {
            return new moa(pzhVar.d, pzhVar.c);
        }
        qp2.o("Failed requirement.");
        return null;
    }

    public static SpannableString y(String str) {
        return n1h.d(str, new owj("<bold>", "</bold>", new StyleSpan(1)));
    }

    public static String y0(int i2) {
        return fki.r("OperatingMode(mode=", i2, ')');
    }

    public static final c8e z(c8e c8eVar, qs3 qs3Var) {
        return c8eVar.d(new os3(qs3Var));
    }

    public static boolean z0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, i77[] i77VarArr) throws IOException {
        int i2;
        int length;
        byte[] bArr2 = y9m.k;
        byte[] bArr3 = y9m.j;
        byte[] bArr4 = y9m.g;
        int i3 = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                wyh.b0(i77VarArr.length, byteArrayOutputStream2);
                int i4 = 2;
                for (i77 i77Var : i77VarArr) {
                    wyh.a0(byteArrayOutputStream2, i77Var.c, 4);
                    wyh.a0(byteArrayOutputStream2, i77Var.d, 4);
                    wyh.a0(byteArrayOutputStream2, i77Var.g, 4);
                    String strR = R(i77Var.a, bArr4, i77Var.b);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = strR.getBytes(charset).length;
                    wyh.b0(length2, byteArrayOutputStream2);
                    i4 = i4 + 14 + length2;
                    byteArrayOutputStream2.write(strR.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i4 != byteArray.length) {
                    throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray.length);
                }
                b8o b8oVar = new b8o(byteArray, 1, false);
                byteArrayOutputStream2.close();
                arrayList.add(b8oVar);
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i5 = 0;
                int i6 = 0;
                while (i5 < i77VarArr.length) {
                    try {
                        i77 i77Var2 = i77VarArr[i5];
                        wyh.b0(i5, byteArrayOutputStream3);
                        wyh.b0(i77Var2.e, byteArrayOutputStream3);
                        i6 = i6 + 4 + (i77Var2.e << 1);
                        int[] iArr = i77Var2.h;
                        int length3 = iArr.length;
                        int i7 = i3;
                        while (i3 < length3) {
                            int i8 = iArr[i3];
                            wyh.b0(i8 - i7, byteArrayOutputStream3);
                            i3++;
                            i7 = i8;
                        }
                        i5++;
                        i3 = 0;
                    } finally {
                    }
                }
                int i9 = 2;
                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                if (i6 != byteArray2.length) {
                    throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray2.length);
                }
                b8o b8oVar2 = new b8o(byteArray2, 3, true);
                byteArrayOutputStream3.close();
                arrayList.add(b8oVar2);
                byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i10 = 0;
                int i11 = 0;
                while (i10 < i77VarArr.length) {
                    try {
                        i77 i77Var3 = i77VarArr[i10];
                        Iterator it = i77Var3.i.entrySet().iterator();
                        int iIntValue = 0;
                        while (it.hasNext()) {
                            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                        }
                        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            G0(byteArrayOutputStream4, iIntValue, i77Var3);
                            byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            byteArrayOutputStream4 = new ByteArrayOutputStream();
                            try {
                                H0(byteArrayOutputStream4, i77Var3);
                                byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                wyh.b0(i10, byteArrayOutputStream3);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i12 = i11 + 6;
                                int i13 = i10;
                                wyh.a0(byteArrayOutputStream3, length4, 4);
                                wyh.b0(iIntValue, byteArrayOutputStream3);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i11 = i12 + length4;
                                i10 = i13 + 1;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                }
                byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                if (i11 != byteArray5.length) {
                    throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
                }
                b8o b8oVar3 = new b8o(byteArray5, 4, true);
                byteArrayOutputStream3.close();
                arrayList.add(b8oVar3);
                long size = 12 + (arrayList.size() << 4);
                wyh.a0(byteArrayOutputStream, arrayList.size(), 4);
                int i14 = 0;
                while (i14 < arrayList.size()) {
                    b8o b8oVar4 = (b8o) arrayList.get(i14);
                    int i15 = b8oVar4.a;
                    byte[] bArr5 = b8oVar4.b;
                    if (i15 == 1) {
                        i2 = 0;
                    } else if (i15 == i9) {
                        i2 = 1;
                    } else if (i15 == 3) {
                        i2 = 2;
                    } else if (i15 == 4) {
                        i2 = 3;
                    } else {
                        if (i15 != 5) {
                            throw null;
                        }
                        i2 = 4;
                    }
                    wyh.a0(byteArrayOutputStream, i2, 4);
                    wyh.a0(byteArrayOutputStream, size, 4);
                    if (b8oVar4.c) {
                        long length5 = bArr5.length;
                        byte[] bArrN = wyh.n(bArr5);
                        arrayList2.add(bArrN);
                        wyh.a0(byteArrayOutputStream, bArrN.length, 4);
                        wyh.a0(byteArrayOutputStream, length5, 4);
                        length = bArrN.length;
                    } else {
                        arrayList2.add(bArr5);
                        wyh.a0(byteArrayOutputStream, bArr5.length, 4);
                        wyh.a0(byteArrayOutputStream, 0L, 4);
                        length = bArr5.length;
                    }
                    size += length;
                    i14++;
                    i9 = 2;
                }
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    byteArrayOutputStream.write((byte[]) arrayList2.get(i16));
                }
            } finally {
                try {
                    byteArrayOutputStream2.close();
                    throw th;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } else {
            byte[] bArr6 = y9m.h;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrH = H(i77VarArr, bArr6);
                wyh.a0(byteArrayOutputStream, i77VarArr.length, 1);
                wyh.a0(byteArrayOutputStream, bArrH.length, 4);
                byte[] bArrN2 = wyh.n(bArrH);
                wyh.a0(byteArrayOutputStream, bArrN2.length, 4);
                byteArrayOutputStream.write(bArrN2);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                wyh.a0(byteArrayOutputStream, i77VarArr.length, 1);
                for (i77 i77Var4 : i77VarArr) {
                    int size2 = i77Var4.i.size() << 2;
                    String strR2 = R(i77Var4.a, bArr3, i77Var4.b);
                    Charset charset2 = StandardCharsets.UTF_8;
                    wyh.b0(strR2.getBytes(charset2).length, byteArrayOutputStream);
                    wyh.b0(i77Var4.h.length, byteArrayOutputStream);
                    wyh.a0(byteArrayOutputStream, size2, 4);
                    wyh.a0(byteArrayOutputStream, i77Var4.c, 4);
                    byteArrayOutputStream.write(strR2.getBytes(charset2));
                    Iterator it2 = i77Var4.i.keySet().iterator();
                    while (it2.hasNext()) {
                        wyh.b0(((Integer) it2.next()).intValue(), byteArrayOutputStream);
                        wyh.b0(0, byteArrayOutputStream);
                    }
                    for (int i17 : i77Var4.h) {
                        wyh.b0(i17, byteArrayOutputStream);
                    }
                }
            } else {
                byte[] bArr7 = y9m.i;
                if (Arrays.equals(bArr, bArr7)) {
                    byte[] bArrH2 = H(i77VarArr, bArr7);
                    wyh.a0(byteArrayOutputStream, i77VarArr.length, 1);
                    wyh.a0(byteArrayOutputStream, bArrH2.length, 4);
                    byte[] bArrN3 = wyh.n(bArrH2);
                    wyh.a0(byteArrayOutputStream, bArrN3.length, 4);
                    byteArrayOutputStream.write(bArrN3);
                    return true;
                }
                if (!Arrays.equals(bArr, bArr2)) {
                    return false;
                }
                wyh.b0(i77VarArr.length, byteArrayOutputStream);
                for (i77 i77Var5 : i77VarArr) {
                    String str = i77Var5.a;
                    TreeMap treeMap = i77Var5.i;
                    String strR3 = R(str, bArr2, i77Var5.b);
                    Charset charset3 = StandardCharsets.UTF_8;
                    wyh.b0(strR3.getBytes(charset3).length, byteArrayOutputStream);
                    wyh.b0(treeMap.size(), byteArrayOutputStream);
                    wyh.b0(i77Var5.h.length, byteArrayOutputStream);
                    wyh.a0(byteArrayOutputStream, i77Var5.c, 4);
                    byteArrayOutputStream.write(strR3.getBytes(charset3));
                    Iterator it3 = treeMap.keySet().iterator();
                    while (it3.hasNext()) {
                        wyh.b0(((Integer) it3.next()).intValue(), byteArrayOutputStream);
                    }
                    for (int i18 : i77Var5.h) {
                        wyh.b0(i18, byteArrayOutputStream);
                    }
                }
            }
        }
        return true;
    }

    public void a(nz0 nz0Var) {
        B(nz0Var);
    }

    public final void b(qq6 qq6Var, boolean z, String str, String str2, String str3) {
        N.MLhEAOiz(((JavaScriptDialogManagerDelegate) qq6Var.b).a.b);
    }

    public final void c(List list, List list2, u59 u59Var) {
        N.Mhlly_d7(((CaptureDevicesDialogDelegate) u59Var.b).a, (Object) null, (Object) null, false);
    }

    public final void d(cej cejVar) {
        B(cejVar);
    }

    public final void e(o93 o93Var) {
        B(o93Var);
    }

    public final void f(qq6 qq6Var, boolean z) {
        N.MLhEAOiz(((JavaScriptDialogManagerDelegate) qq6Var.b).a.b);
    }

    public final void g(qq6 qq6Var, boolean z, String str, String str2) {
        N.MLhEAOiz(((JavaScriptDialogManagerDelegate) qq6Var.b).a.b);
    }

    public final void h(int i2, String str, ole oleVar) {
        N.MLtgcrys(((PermissionDialogDelegate) oleVar.a).a);
    }

    public final void j(s2f s2fVar) {
        B(s2fVar);
    }

    public final void k(qq6 qq6Var, boolean z, String str, String str2) {
        N.MLhEAOiz(((JavaScriptDialogManagerDelegate) qq6Var.b).a.b);
    }

    public final void l(b87 b87Var) {
        b87Var.finish(hjm.b);
    }

    public final void m() {
    }
}
