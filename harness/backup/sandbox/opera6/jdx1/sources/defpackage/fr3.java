package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.app.NotificationCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.ui.modelutil.PropertyModel;

/* loaded from: classes.dex */
public abstract class fr3 {
    public static final ue5 a = new ue5(-1060089350, new cf5((byte) 0), false);
    public static final ue5 b = new ue5(-2043201667, new cf5((byte) 1), false);
    public static final ue5 c = new ue5(68977548, new cf5((byte) 2), false);
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final eko h;
    public static String i;

    static {
        new ue5(1827093419, new cf5((byte) 3), false);
        d = new int[]{-2147483604, -2147483588, LinearLayoutManager.INVALID_OFFSET, 0, 0};
        e = new int[]{-1, -1, -2, -1, -1, -1};
        f = new int[]{1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
        g = new int[]{-1, -1, -3, -1, -2, -1, 1, 0, 2};
        h = new eko((byte) 18);
    }

    public static IconCompat A(Icon icon) {
        icon.getClass();
        int type = icon.getType();
        if (type == 2) {
            return IconCompat.d(null, icon.getResPackage(), icon.getResId());
        }
        if (type == 4) {
            Uri uri = icon.getUri();
            PorterDuff.Mode mode = IconCompat.k;
            uri.getClass();
            String string = uri.toString();
            string.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.b = string;
            return iconCompat;
        }
        if (type != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.b = icon;
            return iconCompat2;
        }
        Uri uri2 = icon.getUri();
        PorterDuff.Mode mode2 = IconCompat.k;
        uri2.getClass();
        String string2 = uri2.toString();
        string2.getClass();
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.b = string2;
        return iconCompat3;
    }

    public static final avb B(String str) {
        BigInteger bigInteger;
        int[] iArr;
        int i2;
        int i3;
        BigInteger bigInteger2 = null;
        if (str == null || str.trim().isEmpty()) {
            qp2.o("Mnemonic is required to generate a seed");
            return null;
        }
        j6a j6aVar = new j6a(new tci());
        int i4 = j6aVar.b;
        byte[] bArr = new byte[i4];
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        byte[] bytes2 = "mnemonic".getBytes(charset);
        int i5 = (i4 + 63) / i4;
        int i6 = 4;
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[i5 * i4];
        j6aVar.b(new qe6(bytes));
        int i7 = 1;
        int i8 = 0;
        while (i7 <= i5) {
            int i9 = 3;
            while (true) {
                byte b2 = (byte) (bArr2[i9] + 1);
                bArr2[i9] = b2;
                if (b2 != 0) {
                    break;
                }
                i9--;
            }
            if (bytes2 != null) {
                j6aVar.c(bytes2.length, bytes2);
            }
            j6aVar.c(i6, bArr2);
            j6aVar.a(bArr);
            System.arraycopy(bArr, 0, bArr3, i8, i4);
            for (int i10 = 1; i10 < 2048; i10++) {
                j6aVar.c(i4, bArr);
                j6aVar.a(bArr);
                for (int i11 = 0; i11 != i4; i11++) {
                    int i12 = i8 + i11;
                    bArr3[i12] = (byte) (bArr3[i12] ^ bArr[i11]);
                }
            }
            i8 += i4;
            i7++;
            i6 = 4;
        }
        int i13 = 64;
        byte[] bArr4 = new byte[64];
        System.arraycopy(bArr3, 0, bArr4, 0, 64);
        byte[] bArrX = aib.x("Bitcoin seed".getBytes(), bArr4);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrX, 0, 32);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrX, 32, 64);
        Arrays.fill(bArrX, (byte) 0);
        BigInteger bigInteger3 = new BigInteger(1, bArrCopyOfRange);
        byte[] bArrF = xij.a(bigInteger3).f(false);
        ag3 ag3Var = new ag3(bigInteger3, new BigInteger(1, Arrays.copyOfRange(bArrF, 1, bArrF.length)), bArrCopyOfRange2, null);
        Arrays.fill(bArrCopyOfRange, (byte) 0);
        Arrays.fill(bArrCopyOfRange2, (byte) 0);
        int[] iArr2 = d;
        int length = iArr2.length;
        int i14 = 0;
        while (true) {
            BigInteger bigInteger4 = ((kq7) ag3Var).a;
            if (i14 >= length) {
                return new avb(bigInteger4, ((kq7) ag3Var).b);
            }
            int i15 = iArr2[i14];
            byte[] bArr5 = ag3Var.e;
            if (bigInteger4 != null || ag3Var.c) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(37);
                if ((Integer.MIN_VALUE & i15) != 0) {
                    byte[] bArr6 = new byte[33];
                    byte[] byteArray = bigInteger4.toByteArray();
                    byte[] bArr7 = new byte[32];
                    if (byteArray[0] == 0) {
                        bigInteger = bigInteger2;
                        i3 = 1;
                    } else {
                        bigInteger = bigInteger2;
                        i3 = 0;
                    }
                    int length2 = byteArray.length;
                    if (i3 != 0) {
                        length2--;
                    }
                    iArr = iArr2;
                    System.arraycopy(byteArray, i3, bArr7, 32 - length2, length2);
                    System.arraycopy(bArr7, 0, bArr6, 1, 32);
                    byteBufferAllocate.put(bArr6);
                } else {
                    bigInteger = bigInteger2;
                    iArr = iArr2;
                    nq7 nq7VarA = ag3Var.f;
                    if (nq7VarA == null) {
                        nq7VarA = xij.a(bigInteger4);
                        ag3Var.f = nq7VarA;
                    }
                    byteBufferAllocate.put(nq7VarA.f(true));
                }
                byteBufferAllocate.putInt(i15);
                byte[] bArrX2 = aib.x(bArr5, byteBufferAllocate.array());
                byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArrX2, 0, 32);
                i2 = 64;
                byte[] bArrCopyOfRange4 = Arrays.copyOfRange(bArrX2, 32, 64);
                Arrays.fill(bArrX2, (byte) 0);
                BigInteger bigInteger5 = new BigInteger(1, bArrCopyOfRange3);
                Arrays.fill(bArrCopyOfRange3, (byte) 0);
                BigInteger bigIntegerMod = bigInteger4.add(bigInteger5).mod(xij.a.i);
                byte[] bArrF2 = xij.a(bigIntegerMod).f(false);
                ag3Var = new ag3(bigIntegerMod, new BigInteger(1, Arrays.copyOfRange(bArrF2, 1, bArrF2.length)), bArrCopyOfRange4, ag3Var);
            } else {
                nq7 nq7VarA2 = ag3Var.f;
                if (nq7VarA2 == null) {
                    nq7VarA2 = xij.a(bigInteger4);
                    ag3Var.f = nq7VarA2;
                }
                byte[] bArrF3 = nq7VarA2.f(true);
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(37);
                byteBufferAllocate2.put(bArrF3);
                byteBufferAllocate2.putInt(i15);
                byte[] bArrX3 = aib.x(bArr5, byteBufferAllocate2.array());
                byte[] bArrCopyOfRange5 = Arrays.copyOfRange(bArrX3, 0, 32);
                byte[] bArrCopyOfRange6 = Arrays.copyOfRange(bArrX3, 32, i13);
                Arrays.fill(bArrX3, (byte) 0);
                BigInteger bigInteger6 = new BigInteger(1, bArrCopyOfRange5);
                Arrays.fill(bArrCopyOfRange5, (byte) 0);
                nq7 nq7VarA3 = xij.a(bigInteger6);
                nq7 nq7VarA4 = ag3Var.f;
                if (nq7VarA4 == null) {
                    nq7VarA4 = xij.a(bigInteger4);
                    ag3Var.f = nq7VarA4;
                }
                byte[] bArrF4 = nq7VarA3.a(nq7VarA4).f(true);
                bigInteger = bigInteger2;
                iArr = iArr2;
                ag3Var = new ag3(bigInteger2, new BigInteger(1, Arrays.copyOfRange(bArrF4, 1, bArrF4.length)), bArrCopyOfRange6, ag3Var);
                i2 = i13;
            }
            i14++;
            i13 = i2;
            bigInteger2 = bigInteger;
            iArr2 = iArr;
        }
    }

    public static Drawable C(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        return drawable;
    }

    public static final c8e D(c8e c8eVar, Function1 function1) {
        return c8eVar.d(new ik7(function1));
    }

    public static final c8e E(c8e c8eVar, Function1 function1) {
        return c8eVar.d(new ok7(function1));
    }

    public static final c8e F(c8e c8eVar, Function1 function1) {
        return c8eVar.d(new pk7(function1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (r2.emit(r10, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #0 {all -> 0x008c, blocks: (B:13:0x002f, B:23:0x0050, B:26:0x0064, B:28:0x006c, B:18:0x0041, B:22:0x004c), top: B:44:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007e -> B:31:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(l99 r7, or4 r8, boolean r9, mt5 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.u99
            if (r0 == 0) goto L13
            r0 = r10
            u99 r0 = (defpackage.u99) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            u99 r0 = new u99
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.x
            px5 r1 = px5.a
            int r2 = r0.y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L33
            boolean r9 = r0.w
            k04 r7 = r0.v
            or4 r8 = r0.u
            l99 r2 = r0.t
            defpackage.ybh.y(r10)     // Catch: java.lang.Throwable -> L8c
            goto L81
        L33:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r5
        L39:
            boolean r9 = r0.w
            k04 r7 = r0.v
            or4 r8 = r0.u
            l99 r2 = r0.t
            defpackage.ybh.y(r10)     // Catch: java.lang.Throwable -> L8c
            goto L64
        L45:
            defpackage.ybh.y(r10)
            boolean r10 = r7 instanceof lnl
            if (r10 != 0) goto L95
            k04 r10 = r8.iterator()     // Catch: java.lang.Throwable -> L8c
        L50:
            r0.t = r7     // Catch: java.lang.Throwable -> L8c
            r0.u = r8     // Catch: java.lang.Throwable -> L8c
            r0.v = r10     // Catch: java.lang.Throwable -> L8c
            r0.w = r9     // Catch: java.lang.Throwable -> L8c
            r0.y = r4     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r2 = r10.b(r0)     // Catch: java.lang.Throwable -> L8c
            if (r2 == r1) goto L80
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L64:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L8c
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L8c
            if (r10 == 0) goto L84
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L8c
            r0.t = r2     // Catch: java.lang.Throwable -> L8c
            r0.u = r8     // Catch: java.lang.Throwable -> L8c
            r0.v = r7     // Catch: java.lang.Throwable -> L8c
            r0.w = r9     // Catch: java.lang.Throwable -> L8c
            r0.y = r3     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L8c
            if (r10 != r1) goto L81
        L80:
            return r1
        L81:
            r10 = r7
            r7 = r2
            goto L50
        L84:
            if (r9 == 0) goto L89
            r8.k(r5)
        L89:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L8c:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L8e
        L8e:
            r10 = move-exception
            if (r9 == 0) goto L94
            defpackage.aib.n(r8, r7)
        L94:
            throw r10
        L95:
            lnl r7 = (lnl) r7
            java.lang.Throwable r7 = r7.a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr3.G(l99, or4, boolean, mt5):java.lang.Object");
    }

    public static boolean H(int i2, KeyEvent keyEvent) {
        int i3 = (keyEvent.isAltPressed() && (keyEvent.getMetaState() & 32) == 0) ? 1 : 0;
        if (keyEvent.isCtrlPressed()) {
            i3 |= 2;
        }
        if (keyEvent.isShiftPressed()) {
            i3 |= 4;
        }
        return i3 == i2;
    }

    public static final dx5 I(Executor executor) {
        dx5 dx5Var;
        va7 va7Var = executor instanceof va7 ? (va7) executor : null;
        return (va7Var == null || (dx5Var = va7Var.a) == null) ? new jg8(executor) : dx5Var;
    }

    public static int[] J(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 == 16842912) {
                return iArr;
            }
            if (i3 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i2] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    public static int K(Context context, int i2, String str) {
        return X(context, f03.e0(context, i2, str));
    }

    public static Integer L(int i2, Context context) {
        TypedValue typedValueZ = f03.Z(context.getTheme(), i2);
        if (typedValueZ != null) {
            return Integer.valueOf(X(context, typedValueZ));
        }
        return null;
    }

    public static ColorStateList M(int i2, Context context) {
        TypedValue typedValueZ = f03.Z(context.getTheme(), i2);
        if (typedValueZ == null) {
            return null;
        }
        int i3 = typedValueZ.resourceId;
        if (i3 != 0) {
            return ResourcesCompat.a(context.getResources(), i3, context.getTheme());
        }
        int i4 = typedValueZ.data;
        if (i4 != 0) {
            return ColorStateList.valueOf(i4);
        }
        return null;
    }

    public static ColorStateList N(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (drawable instanceof ColorStateListDrawable) {
            return ((ColorStateListDrawable) drawable).getColorStateList();
        }
        return null;
    }

    public static boolean O(int i2) {
        return i2 != 0 && ab5.f(i2) > 0.5d;
    }

    public static boolean P(String str) throws qy9 {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        q("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        q("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        p();
        String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static boolean Q(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    public static int R(float f2, int i2, int i3) {
        return ab5.h(ab5.l(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    public static final float S(m6c m6cVar, n6c n6cVar, float f2) {
        return ((f2 / 2.0f) + n6cVar.l) - ((m6cVar.m + m6cVar.n) / 2.0f);
    }

    public static void T(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        ipe.Q(iArr, iArr2, iArr4);
        U(iArr4, iArr3);
    }

    public static void U(int[] iArr, int[] iArr2) {
        long j = iArr[6] & 4294967295L;
        long j2 = iArr[7] & 4294967295L;
        long j3 = (iArr[10] & 4294967295L) + j;
        long j4 = (iArr[11] & 4294967295L) + j2;
        long j5 = (iArr[0] & 4294967295L) + j3;
        int i2 = (int) j5;
        long j6 = (iArr[1] & 4294967295L) + j4 + (j5 >> 32);
        int i3 = (int) j6;
        iArr2[1] = i3;
        long j7 = j3 + (iArr[8] & 4294967295L);
        long j8 = j4 + (iArr[9] & 4294967295L);
        long j9 = (iArr[2] & 4294967295L) + j7 + (j6 >> 32);
        long j10 = (iArr[3] & 4294967295L) + j8 + (j9 >> 32);
        iArr2[3] = (int) j10;
        long j11 = (iArr[4] & 4294967295L) + (j7 - j) + (j10 >> 32);
        iArr2[4] = (int) j11;
        long j12 = (iArr[5] & 4294967295L) + (j8 - j2) + (j11 >> 32);
        iArr2[5] = (int) j12;
        long j13 = j12 >> 32;
        long j14 = (j9 & 4294967295L) + j13;
        long j15 = j13 + (i2 & 4294967295L);
        iArr2[0] = (int) j15;
        long j16 = j15 >> 32;
        if (j16 != 0) {
            long j17 = j16 + (i3 & 4294967295L);
            iArr2[1] = (int) j17;
            j14 += j17 >> 32;
        }
        iArr2[2] = (int) j14;
        if (((j14 >> 32) == 0 || z5i.T(6, 3, iArr2) == 0) && !(iArr2[5] == -1 && ipe.F(iArr2, e))) {
            return;
        }
        f(iArr2);
    }

    public static void V(int i2, int[] iArr) {
        long j;
        if (i2 != 0) {
            long j2 = i2 & 4294967295L;
            long j3 = (iArr[0] & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = (iArr[2] & 4294967295L) + j2 + j4;
            iArr[2] = (int) j6;
            j = j6 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || z5i.T(6, 3, iArr) == 0) && !(iArr[5] == -1 && ipe.F(iArr, e))) {
            return;
        }
        f(iArr);
    }

    public static final ejc W(int i2, ih5 ih5Var, int i3) {
        boolean z = (i3 & 4) != 0;
        vt9 vt9Var = (vt9) ih5Var;
        AccessibilityManager accessibilityManager = (AccessibilityManager) ((Context) vt9Var.j(j41.b)).getSystemService("accessibility");
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && vt9Var.g(true)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && vt9Var.g(true)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && vt9Var.g(z)) || (i2 & 384) == 256);
        Object objK = vt9Var.K();
        zpa zpaVar = hh5.a;
        if (z2 || objK == zpaVar) {
            objK = new ejc(true, true, z);
            vt9Var.g0(objK);
        }
        ejc ejcVar = (ejc) objK;
        ndc ndcVar = (ndc) vt9Var.j(tuc.a);
        boolean zF = vt9Var.f(ejcVar) | vt9Var.h(accessibilityManager);
        Object objK2 = vt9Var.K();
        if (zF || objK2 == zpaVar) {
            objK2 = new q3(ejcVar, accessibilityManager, (byte) 1);
            vt9Var.g0(objK2);
        }
        Function1 function1 = (Function1) objK2;
        boolean zF2 = vt9Var.f(ejcVar) | vt9Var.h(accessibilityManager);
        Object objK3 = vt9Var.K();
        if (zF2 || objK3 == zpaVar) {
            objK3 = new x2(ejcVar, accessibilityManager, (byte) 1);
            vt9Var.g0(objK3);
        }
        b(ndcVar, function1, (Function0) objK3, vt9Var, 0);
        return ejcVar;
    }

    public static int X(Context context, TypedValue typedValue) {
        int i2 = typedValue.resourceId;
        return i2 != 0 ? context.getColor(i2) : typedValue.data;
    }

    public static final void Y(k0j k0jVar, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Object objG = k0jVar.k().a.g(n0j.g);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            h9o.t();
            return;
        }
        k0j k0jVarL = k0jVar.l();
        if (k0jVarL != null) {
            Object objG2 = k0jVarL.k().a.g(n0j.e);
            if (objG2 == null) {
                objG2 = null;
            }
            if (objG2 != null) {
                Object objG3 = k0jVarL.k().a.g(n0j.f);
                c95 c95Var = (c95) (objG3 != null ? objG3 : null);
                if (c95Var == null || (c95Var.a >= 0 && c95Var.b >= 0)) {
                    if (k0jVar.k().a.c(n0j.K)) {
                        ArrayList arrayList = new ArrayList();
                        List listJ = k0j.j(4, k0jVarL);
                        int size = listJ.size();
                        int i2 = 0;
                        for (int i3 = 0; i3 < size; i3++) {
                            k0j k0jVar2 = (k0j) listJ.get(i3);
                            if (k0jVar2.k().a.c(n0j.K)) {
                                arrayList.add(k0jVar2);
                                if (k0jVar2.c.v() < k0jVar.c.v()) {
                                    i2++;
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        boolean zL = l(arrayList);
                        int i4 = zL ? 0 : i2;
                        int i5 = zL ? i2 : 0;
                        Object objG4 = k0jVar.k().a.g(n0j.K);
                        if (objG4 == null) {
                            objG4 = Boolean.FALSE;
                        }
                        accessibilityNodeInfoCompat.w(tw2.r(i4, 1, i5, 1, false, ((Boolean) objG4).booleanValue()));
                    }
                }
            }
        }
    }

    public static final void a(g1b g1bVar, c8e c8eVar, ih5 ih5Var, int i2) {
        int i3;
        c8e c8eVar2;
        Function2 function2 = ujp.d;
        ah5 ah5Var = ujp.g;
        ah5 ah5Var2 = ujp.e;
        ah5 ah5Var3 = ujp.f;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1784932919);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.f(g1bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i5 = i3 | 48;
        if (vt9Var.N(i5 & 1, (i5 & 19) != 18)) {
            float fO = ((n27) vt9Var.j(mi5.h)).o(rih.o(20.0d));
            z7e z7eVar = z7e.b;
            c8e c8eVarB0 = a26.b0(z7eVar, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            z7e z7eVar2 = z7eVar;
            float f2 = 8.0f;
            db5 db5VarA = cb5.a(b72.c, rbe.n, vt9Var, 0);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarB0);
            bh5.To.getClass();
            vt9Var.a0();
            boolean z = vt9Var.S;
            Function0 function0 = m3c.S;
            if (z) {
                vt9Var.k(function0);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, db5VarA, ah5Var3);
            y4h.o(vt9Var, oagVarL, ah5Var2);
            u35.j(iHashCode, vt9Var, ah5Var, vt9Var);
            y4h.o(vt9Var, c8eVarP, function2);
            vt9Var.W(1348879077);
            Iterator it = g1bVar.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                c8e c8eVarE = mpj.e(z7eVar2, fO, i4);
                o9i o9iVarA = m9i.a(new x62(f2, true, new t40((byte) 19)), rbe.l, vt9Var, 54);
                int iHashCode2 = Long.hashCode(vt9Var.T);
                oag oagVarL2 = vt9Var.l();
                c8e c8eVarP2 = qyn.P(vt9Var, c8eVarE);
                bh5.To.getClass();
                vt9Var.a0();
                if (vt9Var.S) {
                    vt9Var.k(function0);
                } else {
                    vt9Var.j0();
                }
                y4h.o(vt9Var, o9iVarA, ah5Var3);
                y4h.o(vt9Var, oagVarL2, ah5Var2);
                u35.j(iHashCode2, vt9Var, ah5Var, vt9Var);
                y4h.o(vt9Var, c8eVarP2, function2);
                hp7 hp7Var = abm.a;
                vt9 vt9Var2 = vt9Var;
                ijl.b("•", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).k, vt9Var2, 6, 0, 131070);
                ijl.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var2.j(hp7Var)).k, vt9Var2, 0, 0, 131070);
                vt9Var = vt9Var2;
                vt9Var.p(true);
                function2 = function2;
                z7eVar2 = z7eVar2;
                ah5Var = ah5Var;
                fO = fO;
                f2 = 8.0f;
                function0 = function0;
                i4 = 2;
            }
            vt9Var.p(false);
            vt9Var.p(true);
            c8eVar2 = z7eVar2;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new kx0(g1bVar, c8eVar2, i2, (byte) 2);
        }
    }

    public static void a0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        ipe.a0(iArr, iArr3);
        U(iArr3, iArr2);
    }

    public static final void b(ndc ndcVar, Function1 function1, Function0 function0, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1868327245);
        int i3 = (vt9Var.h(ndcVar) ? 4 : 2) | i2 | (vt9Var.h(function1) ? 32 : 16) | (vt9Var.h(function0) ? 256 : NotificationCompat.FLAG_HIGH_PRIORITY);
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            boolean zH = ((i3 & 112) == 32) | vt9Var.h(ndcVar) | ((i3 & 896) == 256);
            Object objK = vt9Var.K();
            if (zH || objK == hh5.a) {
                objK = new f9(ndcVar, function1, function0, (byte) 0);
                vt9Var.g0(objK);
            }
            rm5.b(ndcVar, (Function1) objK, vt9Var);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new g9(ndcVar, function1, function0, i2, (byte) 0);
        }
    }

    public static void b0(int[] iArr, int[] iArr2, int i2) {
        int[] iArr3 = new int[12];
        ipe.a0(iArr, iArr3);
        while (true) {
            U(iArr3, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                ipe.a0(iArr2, iArr3);
            }
        }
    }

    public static final void c(final Function1 function1, final Function1 function12, final String str, final List list, final agm agmVar, final fsf fsfVar, final fef fefVar, ih5 ih5Var, int i2) {
        int i3;
        c8e c8eVarL;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1893117736);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.h(function1) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.h(function12) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.f(str) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? vt9Var.f(list) : vt9Var.h(list) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= vt9Var.h(agmVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= vt9Var.d(fsfVar.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= vt9Var.d(fefVar == null ? -1 : fefVar.ordinal()) ? 1048576 : 524288;
        }
        if (vt9Var.N(i3 & 1, (599187 & i3) != 599186)) {
            int iOrdinal = fsfVar.ordinal();
            if (iOrdinal == 0) {
                c8eVarL = mpj.l(mpj.b, kh7.b(fefVar.d));
            } else {
                if (iOrdinal != 1) {
                    h9o.p();
                    return;
                }
                c8eVarL = mpj.c(mpj.a, kh7.a(fefVar.d));
            }
            uup.d(c8eVarL, null, gyg.P(545498386, new cr9() { // from class: lef
                /* JADX INFO: Thrown type has an unknown type hierarchy: oye */
                public final Object invoke(Object obj, Object obj2, Object obj3) throws oye {
                    float fB;
                    float fB2;
                    int i4;
                    List list2;
                    Object r71Var;
                    afe afeVar;
                    ndf ndfVar;
                    fsf fsfVar2;
                    Object hefVar;
                    float f2;
                    bs3 bs3Var = (bs3) obj;
                    ih5 ih5Var2 = (ih5) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((vt9) ih5Var2).f(bs3Var) ? 4 : 2;
                    }
                    vt9 vt9Var2 = (vt9) ih5Var2;
                    if (vt9Var2.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                        Object objK = vt9Var2.K();
                        Object obj4 = hh5.a;
                        if (objK == obj4) {
                            objK = rm5.p(h.a, vt9Var2);
                            vt9Var2.g0(objK);
                        }
                        nx5 nx5Var = (nx5) objK;
                        Object objK2 = vt9Var2.K();
                        if (objK2 == obj4) {
                            objK2 = new LinkedHashMap();
                            vt9Var2.g0(objK2);
                        }
                        Map map = (Map) objK2;
                        n27 n27Var = (n27) vt9Var2.j(mi5.h);
                        fsf fsfVar3 = fsf.a;
                        fsf fsfVar4 = fsfVar;
                        boolean z = fsfVar4 == fsfVar3;
                        float fJ0 = Float.POSITIVE_INFINITY;
                        if (z) {
                            ikk ikkVar = bs3Var.a;
                            long j = bs3Var.b;
                            if (yo5.c(j)) {
                                fJ0 = ikkVar.j0(yo5.g(j));
                            }
                        } else {
                            ikk ikkVar2 = bs3Var.a;
                            long j2 = bs3Var.b;
                            if (yo5.d(j2)) {
                                fJ0 = ikkVar2.j0(yo5.h(j2));
                            }
                        }
                        fef fefVar2 = fefVar;
                        long j3 = fefVar2.d;
                        if (z) {
                            fB = kh7.a(j3);
                            fB2 = kh7.a(fefVar2.e);
                        } else {
                            fB = kh7.b(j3);
                            fB2 = kh7.b(fefVar2.e);
                        }
                        float f3 = fB;
                        long jM = (n27Var.M(kh7.b(fefVar2.d)) << 32) | (n27Var.M(kh7.a(fefVar2.d)) & 4294967295L);
                        float f4 = fB2 + 16.0f;
                        int iFloor = (int) Math.floor((fJ0 + 16.0f) / f4);
                        int i5 = iFloor < 1 ? 1 : iFloor;
                        gh7 gh7Var = new gh7((fJ0 - f3) / 2.0f);
                        gh7 gh7Var2 = new gh7(0.0f);
                        if (gh7Var.compareTo(gh7Var2) < 0) {
                            gh7Var = gh7Var2;
                        }
                        float fO0 = n27Var.o0(f4);
                        float fO02 = n27Var.o0(f3);
                        float fO03 = n27Var.o0(fB2);
                        float fO04 = n27Var.o0(125.0f);
                        float f5 = gh7Var.a;
                        ndf ndfVar2 = new ndf(jM, i5, f5, fO0, fO02, fO03, fO04);
                        int i6 = i5;
                        List list3 = list;
                        boolean z2 = list3.size() > i6;
                        Iterator it = list3.iterator();
                        int i7 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i4 = -1;
                                break;
                            }
                            if (Intrinsics.a(((eef) it.next()).a.getId(), str)) {
                                i4 = i7;
                                break;
                            }
                            i7++;
                        }
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        int size = z2 ? Integer.MAX_VALUE : list3.size();
                        int size2 = list3.size();
                        if (z2) {
                            i4 += 1073741823 - (1073741823 % size2);
                        }
                        u6c u6cVarA = x6c.a(i4, vt9Var2, 2);
                        Object objK3 = vt9Var2.K();
                        mt5 mt5Var = null;
                        if (objK3 == obj4) {
                            objK3 = hyg.k((Object) null);
                            vt9Var2.g0(objK3);
                        }
                        afe afeVar2 = (afe) objK3;
                        boolean zF = vt9Var2.f(u6cVarA);
                        Object objK4 = vt9Var2.K();
                        if (zF || objK4 == obj4) {
                            objK4 = new qmb((Object) u6cVarA, (Object) afeVar2, mt5Var, (byte) 21);
                            vt9Var2.g0(objK4);
                        }
                        rm5.e(vt9Var2, u6cVarA, (Function2) objK4);
                        boolean zF2 = vt9Var2.f(u6cVarA);
                        Object obj5 = function12;
                        boolean zF3 = zF2 | vt9Var2.f(obj5) | vt9Var2.h(list3);
                        Object objK5 = vt9Var2.K();
                        if (zF3 || objK5 == obj4) {
                            Object mz9Var = new mz9(u6cVarA, obj5, list3, (mt5) null, (byte) 13);
                            list2 = list3;
                            vt9Var2.g0(mz9Var);
                            objK5 = mz9Var;
                        } else {
                            list2 = list3;
                        }
                        rm5.f(u6cVarA, list2, (Function2) objK5, vt9Var2);
                        Object objValueOf = Float.valueOf(ndfVar2.d);
                        boolean zF4 = vt9Var2.f(u6cVarA) | vt9Var2.f(ndfVar2);
                        Object obj6 = function1;
                        boolean zF5 = zF4 | vt9Var2.f(obj6) | vt9Var2.h(list2);
                        Object objK6 = vt9Var2.K();
                        if (zF5 || objK6 == obj4) {
                            afeVar = afeVar2;
                            r71Var = new r71(u6cVarA, ndfVar2, afeVar, obj6, list2, null, (byte) 7);
                            ndfVar = ndfVar2;
                            vt9Var2.g0(r71Var);
                        } else {
                            r71Var = objK6;
                            ndfVar = ndfVar2;
                            afeVar = afeVar2;
                        }
                        Function2 function2 = (Function2) r71Var;
                        CoroutineContext coroutineContext = vt9Var2.R;
                        boolean zF6 = vt9Var2.f(u6cVarA) | vt9Var2.f(list2) | vt9Var2.f(objValueOf);
                        Object objK7 = vt9Var2.K();
                        if (zF6 || objK7 == obj4) {
                            objK7 = new s1c(coroutineContext, function2);
                            vt9Var2.g0(objK7);
                        }
                        boolean zF7 = vt9Var2.f(u6cVarA) | vt9Var2.c(ndfVar.e) | vt9Var2.c(ndfVar.f) | vt9Var2.c(ndfVar.g);
                        Object objK8 = vt9Var2.K();
                        if (zF7 || objK8 == obj4) {
                            objK8 = new xef(u6cVarA, ndfVar);
                            vt9Var2.g0(objK8);
                        }
                        xef xefVar = (xef) objK8;
                        boolean zD = vt9Var2.d(size) | vt9Var2.h(list2) | vt9Var2.f(ndfVar) | vt9Var2.f(u6cVarA) | vt9Var2.h(nx5Var);
                        agm agmVar2 = agmVar;
                        boolean zH = zD | vt9Var2.h(agmVar2) | vt9Var2.h(map) | vt9Var2.d(fefVar2.ordinal());
                        Object objK9 = vt9Var2.K();
                        if (zH || objK9 == obj4) {
                            fsfVar2 = fsfVar4;
                            f2 = 0.0f;
                            hefVar = new hef(size, list2, nx5Var, u6cVarA, ndfVar, agmVar2, map, fefVar2, afeVar);
                            vt9Var2.g0(hefVar);
                        } else {
                            hefVar = objK9;
                            fsfVar2 = fsfVar4;
                            f2 = 0.0f;
                        }
                        Function1 function13 = (Function1) hefVar;
                        int iOrdinal2 = fsfVar2.ordinal();
                        if (iOrdinal2 == 0) {
                            vt9Var2.W(-1207244755);
                            sgb.c(mpj.c, u6cVarA, a26.c(1, f2, f5), new x62(16.0f, true, new t40((byte) 19)), rbe.o, xvg.r(xefVar, vt9Var2), false, null, function13, vt9Var2, 100859910, 136);
                            vt9Var2.p(false);
                        } else {
                            if (iOrdinal2 != 1) {
                                throw fki.m(vt9Var2, 238150143, false);
                            }
                            vt9Var2.W(-1206631792);
                            sgb.d(mpj.c, u6cVarA, a26.c(2, f5, f2), new x62(16.0f, true, new t40((byte) 19)), rbe.l, xvg.r(xefVar, vt9Var2), false, null, function13, vt9Var2, 100859910);
                            vt9Var2.p(false);
                        }
                    } else {
                        vt9Var2.Q();
                    }
                    return Unit.a;
                }
            }, vt9Var), vt9Var, 3072);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new xl4(function1, function12, str, list, agmVar, fsfVar, fefVar, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: x0 */
    public static z0 c0(q0 q0Var, String str) throws x0 {
        if (str.length() != 0 && str.charAt(0) == '#') {
            try {
                int length = (str.length() - 1) / 2;
                byte[] bArr = new byte[length];
                for (int i2 = 0; i2 != length; i2++) {
                    int i3 = i2 << 1;
                    bArr[i2] = (byte) ((fsp.n(str.charAt(i3 + 1)) << 4) | fsp.n(str.charAt(i3 + 2)));
                }
                return z0.q(bArr);
            } catch (IOException unused) {
                throw new x0("can't recode value for oid ".concat(q0Var.w()), (byte) 0);
            }
        }
        if (str.length() != 0 && str.charAt(0) == '\\') {
            str = str.substring(1);
        }
        q0 q0Var2 = sx2.u;
        if (q0Var.p(sx2.s) || q0Var.p(sx2.t)) {
            return new j86(str);
        }
        if (q0Var.p(sx2.q)) {
            return new f0(str);
        }
        q0 q0Var3 = sx2.l;
        if (q0Var.p(q0Var3) || q0Var.p(sx2.n) || q0Var.p(sx2.p) || q0Var.p(sx2.r) || q0Var.p(q0Var2)) {
            if ((!q0Var.p(q0Var3) && !q0Var.p(q0Var2)) || str.length() == 2) {
                return new t86(str);
            }
            StringBuilder sb = new StringBuilder("country code attribute ");
            sb.append(q0Var.w());
            sb.append(" must be exactly 2 characters per ISO 3166-1 / X.520, got ");
            sb.append(str.length());
            sb.append(": '");
            qp2.o(z1m.l(sb, str, "'"));
            return null;
        }
        if (q0Var.p(sx2.m) && str.length() > 64) {
            throw new IllegalArgumentException("commonName length " + str.length() + " exceeds RFC 5280 ub-common-name (64): '" + str + "'");
        }
        String str2 = hik.a;
        char[] charArray = str.toCharArray();
        int length2 = charArray.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            hik.e(charArray, length2, byteArrayOutputStream);
            return new b96(byteArrayOutputStream.toByteArray());
        } catch (IOException e2) {
            throw c26.w("cannot encode string to byte array!", e2);
        }
    }

    public static final void d(Function0 function0, eef eefVar, float f2, agm agmVar, long j, Map map, fef fefVar, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1410915552);
        int i3 = i2 | (vt9Var.h(function0) ? 4 : 2) | (vt9Var.h(eefVar) ? 32 : 16) | (vt9Var.c(f2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.h(agmVar) ? 2048 : 1024) | (vt9Var.e(j) ? 16384 : 8192) | (vt9Var.f(map) ? 131072 : 65536) | (vt9Var.d(fefVar.ordinal()) ? 1048576 : 524288);
        if (vt9Var.N(i3 & 1, (599187 & i3) != 599186)) {
            e(eefVar.b, gyg.P(592434302, new kef(fefVar, f2, eefVar, agmVar, j, map, function0), vt9Var), vt9Var, 48);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new kef(function0, eefVar, f2, agmVar, j, map, fefVar, i2);
        }
    }

    public static void d0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ipe.b0(iArr, iArr2, iArr3) != 0) {
            long j = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j3;
                j2 = j3 >> 32;
            }
            long j4 = ((iArr3[2] & 4294967295L) - 1) + j2;
            iArr3[2] = (int) j4;
            if ((j4 >> 32) != 0) {
                z5i.v(6, 3, iArr3);
            }
        }
    }

    public static final void e(g7j g7jVar, ue5 ue5Var, ih5 ih5Var, int i2) {
        nof nofVar;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-2061018375);
        int i3 = (vt9Var.d(g7jVar.ordinal()) ? 4 : 2) | i2;
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) vt9Var.j(j41.b);
            unf unfVar = pof.a;
            boolean zBooleanValue = ((Boolean) vt9Var.j(rof.b)).booleanValue();
            boolean zF = vt9Var.f(context) | vt9Var.g(zBooleanValue) | ((i3 & 14) == 4);
            Object objK = vt9Var.K();
            if (zF || objK == hh5.a) {
                objK = new dkf(context, qbe.z(g7jVar, zBooleanValue, (12 & 4) == 0, false));
                vt9Var.g0(objK);
            }
            dkf dkfVar = (dkf) objK;
            switch (g7jVar.ordinal()) {
                case 0:
                    nofVar = nof.f;
                    break;
                case 1:
                    nofVar = nof.g;
                    break;
                case 2:
                    nofVar = nof.i;
                    break;
                case 3:
                    nofVar = nof.h;
                    break;
                case 4:
                    nofVar = nof.c;
                    break;
                case 5:
                    nofVar = nof.b;
                    break;
                case 6:
                    nofVar = nof.a;
                    break;
                case 7:
                    nofVar = nof.d;
                    break;
                case 8:
                    nofVar = nof.e;
                    break;
                default:
                    throw new RuntimeException(null, null);
            }
            rof.c(nofVar, zBooleanValue, gyg.P(-410527340, new hda(dkfVar, ue5Var, (byte) 15), vt9Var), vt9Var, 384, 0);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new hda(g7jVar, ue5Var, i2, (byte) 16);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o2j */
    public static final void e0(int i2) throws o2j {
        throw new o2j(sko.i(i2, "An unknown field for index "));
    }

    public static void f(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = (iArr[2] & 4294967295L) + 1 + j2;
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            z5i.T(6, 3, iArr);
        }
    }

    public static Icon f0(IconCompat iconCompat, Context context) {
        Icon iconCreateWithBitmap;
        switch (iconCompat.a) {
            case -1:
                return (Icon) iconCompat.b;
            case 0:
            default:
                qp2.o("Unknown type");
                return null;
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.b);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(iconCompat.f(), iconCompat.e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.b, iconCompat.e, iconCompat.f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.b);
                break;
            case 5:
                iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) iconCompat.b);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = r9n.e(iconCompat.h());
                    break;
                } else {
                    if (context == null) {
                        t3p.i(iconCompat.h(), "Context is required to resolve the file uri of the icon: ");
                        return null;
                    }
                    InputStream inputStreamI = iconCompat.i(context);
                    if (inputStreamI == null) {
                        j9h.u(iconCompat.h(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStreamI));
                    break;
                }
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.h;
        if (mode != IconCompat.k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public static final ArrayList g(List list, List list2) {
        l01 l01Var;
        Object next;
        Boolean q0iVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            n01 n01Var = (n01) it.next();
            Iterator it2 = list.iterator();
            while (true) {
                l01Var = null;
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((om4) next).a == n01Var.a) {
                    break;
                }
            }
            om4 om4Var = (om4) next;
            if (om4Var != null) {
                n01 n01Var2 = om4Var.b;
                if (n01Var.a == n01Var2.a) {
                    try {
                        p0i p0iVar = t0i.b;
                        q0iVar = Boolean.valueOf(new BigInteger(n01Var.b).compareTo(new BigInteger(n01Var2.b)) >= 0);
                    } catch (Throwable th) {
                        p0i p0iVar2 = t0i.b;
                        q0iVar = new q0i(th);
                    }
                    Boolean bool = Boolean.FALSE;
                    if (q0iVar instanceof q0i) {
                        q0iVar = bool;
                    }
                    zBooleanValue = q0iVar.booleanValue();
                }
                if (zBooleanValue) {
                    l01Var = n01Var.a;
                }
            }
            if (l01Var != null) {
                arrayList.add(l01Var);
            }
        }
        return arrayList;
    }

    public static final long g0(long j) {
        return (Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L);
    }

    public static void h(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append(" + ");
        }
        sb.append(str);
    }

    public static final c8e h0(boolean z, lde ldeVar, q5i q5iVar, Function1 function1) {
        return r0e.b.d(new yrl(z, ldeVar, false, q5iVar, function1));
    }

    public static boolean i(j8o j8oVar, j8o j8oVar2) {
        bih[] bihVarArr = j8oVar.d;
        if (bihVarArr.length == j8oVar2.d.length) {
            bih[] bihVarArr2 = (bih[]) bihVarArr.clone();
            bih[] bihVarArr3 = (bih[]) j8oVar2.d.clone();
            boolean z = (bihVarArr2[0].i() == null || bihVarArr3[0].i() == null) ? false : !r0.a.p(r1.a);
            for (int i2 = 0; i2 != bihVarArr2.length; i2++) {
                bih bihVar = bihVarArr2[i2];
                if (z) {
                    for (int length = bihVarArr3.length - 1; length >= 0; length--) {
                        bih bihVar2 = bihVarArr3[length];
                        if (bihVar2 != null && fsp.E(bihVar, bihVar2)) {
                            bihVarArr3[length] = null;
                        }
                    }
                } else {
                    for (int i3 = 0; i3 != bihVarArr3.length; i3++) {
                        bih bihVar3 = bihVarArr3[i3];
                        if (bihVar3 != null && fsp.E(bihVar, bihVar3)) {
                            bihVarArr3[i3] = null;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static c8e i0(c8e c8eVar, boolean z, q5i q5iVar, Function1 function1) {
        return c8eVar.d(new yrl(z, null, true, q5iVar, function1));
    }

    public static final ljj j(wij wijVar) {
        return new ljj(new n54(wijVar.a), new n54(wijVar.b), new n54(wijVar.c));
    }

    public static final c8e j0(p5i p5iVar, q5i q5iVar, bsl bslVar, Function0 function0, boolean z) {
        if (p5iVar != null) {
            return new p6m(bslVar, null, p5iVar, z, q5iVar, function0);
        }
        if (p5iVar == null) {
            return new p6m(bslVar, null, null, z, q5iVar, function0);
        }
        return qyn.q(z7e.b, new zrl(p5iVar, q5iVar, bslVar, function0, z));
    }

    public static void k(int i2, int i3) throws qy9 {
        GLES20.glBindTexture(i2, i3);
        p();
        GLES20.glTexParameteri(i2, 10240, 9729);
        p();
        GLES20.glTexParameteri(i2, 10241, 9729);
        p();
        GLES20.glTexParameteri(i2, 10242, 33071);
        p();
        GLES20.glTexParameteri(i2, 10243, 33071);
        p();
    }

    public static final boolean l(ArrayList arrayList) {
        l08 l08Var;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                l08Var = l08.a;
            } else {
                l08 arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    k0j k0jVar = (k0j) obj2;
                    k0j k0jVar2 = (k0j) obj;
                    float fAbs = Math.abs(Float.intBitsToFloat((int) (k0jVar2.g().b() >> 32)) - Float.intBitsToFloat((int) (k0jVar.g().b() >> 32)));
                    float fAbs2 = Math.abs(Float.intBitsToFloat((int) (k0jVar2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (k0jVar.g().b() & 4294967295L)));
                    arrayList2.add(new y8f((Float.floatToRawIntBits(fAbs) << 32) | (Float.floatToRawIntBits(fAbs2) & 4294967295L)));
                    obj = obj2;
                }
                l08Var = arrayList2;
            }
            if (((Collection) l08Var).size() == 1) {
                j = ((y8f) CollectionsKt.K(l08Var)).a;
            } else {
                if (l08Var.isEmpty()) {
                    tic.c("Empty collection can't be reduced.");
                }
                Object objK = CollectionsKt.K(l08Var);
                int size2 = l08Var.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        objK = new y8f(y8f.e(((y8f) objK).a, ((y8f) l08Var.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j = ((y8f) objK).a;
            }
            if (Float.intBitsToFloat((int) (j & 4294967295L)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static Object m(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(fr3.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static final int n(u6c u6cVar) {
        Object obj;
        m6c m6cVarJ = u6cVar.j();
        float f2 = (m6cVarJ.m + m6cVarJ.n) / 2.0f;
        Iterator it = u6cVar.j().l.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                n6c n6cVar = (n6c) next;
                float fAbs = Math.abs(((n6cVar.m / 2.0f) + n6cVar.l) - f2);
                do {
                    Object next2 = it.next();
                    n6c n6cVar2 = (n6c) next2;
                    float fAbs2 = Math.abs(((n6cVar2.m / 2.0f) + n6cVar2.l) - f2);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        n6c n6cVar3 = (n6c) obj;
        if (n6cVar3 != null) {
            return n6cVar3.a;
        }
        return -1;
    }

    public static final void o(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            h9o.u(sko.h(i2, i3, "index: ", ", size: "));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: qy9 */
    public static void p() throws qy9 {
        StringBuilder sb = new StringBuilder();
        scd.q(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        boolean z = false;
        int i2 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            Integer numValueOf = Integer.valueOf(iGlGetError);
            int i3 = i2 + 1;
            int iB = w0b.b(objArrCopyOf.length, i3);
            if (iB > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
            }
            objArrCopyOf[i2] = numValueOf;
            z = true;
            i2 = i3;
        }
        if (z) {
            throw new qy9(sb.toString(), h1b.o(i2, objArrCopyOf));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: qy9 */
    public static void q(String str, boolean z) throws qy9 {
        if (z) {
            return;
        }
        a1b a1bVar = h1b.b;
        throw new qy9(str, csh.e);
    }

    public static final void r(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            h9o.u(sko.h(i2, i3, "index: ", ", size: "));
        }
    }

    public static final void s(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            h9o.g(i4, sko.o(i2, i3, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i2 <= i3) {
                return;
            }
            qp2.o(sko.h(i2, i3, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final void t(AutoCloseable autoCloseable, Throwable th) {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    z1m.w(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    wf8.a(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                } else {
                    hai.d();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static int u(int i2, int i3) {
        return ab5.l(i2, (Color.alpha(i2) * i3) / 255);
    }

    public static Drawable v(Drawable drawable, Drawable drawable2, int i2, int i3) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i2 == -1 && (i2 = drawable2.getIntrinsicWidth()) == -1) {
            i2 = drawable.getIntrinsicWidth();
        }
        if (i3 == -1 && (i3 = drawable2.getIntrinsicHeight()) == -1) {
            i3 = drawable.getIntrinsicHeight();
        }
        if (i2 > drawable.getIntrinsicWidth() || i3 > drawable.getIntrinsicHeight()) {
            float f2 = i2 / i3;
            if (f2 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i3 = (int) (intrinsicWidth / f2);
                i2 = intrinsicWidth;
            } else {
                i3 = drawable.getIntrinsicHeight();
                i2 = (int) (f2 * i3);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i2, i3);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static z48 w(v3f v3fVar) {
        if (v3fVar == null) {
            l08 l08Var = l08.a;
            return new z48(l08Var, l08Var);
        }
        m3f m3fVar = v3fVar.e;
        List list = m3fVar.a.a;
        ArrayList arrayList = new ArrayList(k95.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(x((p3f) it.next()));
        }
        List list2 = m3fVar.b.a;
        ArrayList arrayList2 = new ArrayList(k95.o(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(x((p3f) it2.next()));
        }
        return new z48(arrayList, arrayList2);
    }

    public static b58 x(p3f p3fVar) {
        int i2 = p3fVar.a;
        Integer num = p3fVar.b;
        String str = p3fVar.c;
        Uri uri = Uri.parse(p3fVar.d);
        Uri uri2 = Uri.parse(p3fVar.e);
        List list = p3fVar.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((zyl) obj).a == ld8.a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            arrayList2.add(((zyl) obj2).b);
        }
        ArrayList arrayListP = k95.p(arrayList2);
        ArrayList arrayList3 = new ArrayList(k95.o(arrayListP, 10));
        int size2 = arrayListP.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj3 = arrayListP.get(i5);
            i5++;
            arrayList3.add(Uri.parse((String) obj3));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list) {
            if (((zyl) obj4).a == ld8.b) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList(k95.o(arrayList4, 10));
        int size3 = arrayList4.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj5 = arrayList4.get(i6);
            i6++;
            arrayList5.add(((zyl) obj5).b);
        }
        ArrayList arrayListP2 = k95.p(arrayList5);
        ArrayList arrayList6 = new ArrayList(k95.o(arrayListP2, 10));
        int size4 = arrayListP2.size();
        while (i3 < size4) {
            Object obj6 = arrayListP2.get(i3);
            i3++;
            arrayList6.add(Uri.parse((String) obj6));
        }
        return new b58(i2, num, str, uri, uri2, arrayList3, arrayList6);
    }

    public static fs5 y(orb orbVar) {
        hs5 hs5Var;
        gs5 gs5Var;
        String strE = orbVar.e("type");
        hs5[] hs5VarArrValues = hs5.values();
        int length = hs5VarArrValues.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                hs5Var = hs5VarArrValues[i3];
                if (hs5Var != hs5.b && strE.equals(hs5Var.a)) {
                    break;
                }
                i3++;
            } else {
                hs5Var = hs5.b;
                break;
            }
        }
        orb orbVarC = orbVar.c("rpcRequest");
        String strE2 = orbVar.e("icon");
        gs5[] gs5VarArrValues = gs5.values();
        int length2 = gs5VarArrValues.length;
        while (true) {
            if (i2 < length2) {
                gs5Var = gs5VarArrValues[i2];
                if (gs5Var != gs5.b && strE2.equals(gs5Var.a)) {
                    break;
                }
                i2++;
            } else {
                gs5Var = gs5.b;
                break;
            }
        }
        return new fs5(hs5Var, orbVarC, gs5Var, orbVar.e("title"));
    }

    public static FloatBuffer z(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public abstract void Z(PropertyModel propertyModel, o7e o7eVar, o7e o7eVar2, o7e o7eVar3);
}
