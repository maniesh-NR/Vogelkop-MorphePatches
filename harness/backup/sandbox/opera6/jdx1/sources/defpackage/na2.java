package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.content.res.ResourcesCompat;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class na2 {
    public static final qd3 a = new qd3(-1.0f);
    public static final qd3 b = new qd3(1.0f);
    public static final pd3 c = new pd3(-1.0f);
    public static final pd3 d = new pd3(1.0f);
    public static final ue5 e = new ue5(-1489377867, new q92((byte) 26), false);
    public static final ue5 f = new ue5(185690900, new q92((byte) 27), false);
    public static final Class[] g = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final int[] h = {Integer.MAX_VALUE, -1, -1, -1, -1};
    public static final int[] i = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};
    public static final int[] j = {-1, -1073741826, -1, -1, -1, 1, 1};
    public static final Object k = new Object();
    public static final eko l = new eko(15);
    public static volatile boolean m = true;
    public static yza n;

    public static final d3k A(nx5 nx5Var, CoroutineContext coroutineContext, rx5 rx5Var, Function2 function2) {
        CoroutineContext coroutineContextB = cx5.b(nx5Var, coroutineContext);
        rx5Var.getClass();
        g4 b7cVar = rx5Var == rx5.b ? new b7c(coroutineContextB, function2) : new d3k(coroutineContextB, true);
        b7cVar.D0(rx5Var, b7cVar, function2);
        return b7cVar;
    }

    public static d3k B(nx5 nx5Var, CoroutineContext coroutineContext, rx5 rx5Var, Function2 function2, int i2) {
        if ((i2 & 1) != 0) {
            coroutineContext = h.a;
        }
        if ((i2 & 2) != 0) {
            rx5Var = rx5.a;
        }
        return A(nx5Var, coroutineContext, rx5Var, function2);
    }

    public static int C(int i2) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i2 <= 0) {
            qp2.o(p3p.i(i2, "x (", ") must be > 0"));
            return 0;
        }
        switch (wbb.a[roundingMode.ordinal()]) {
            case 1:
                zi4.p((i2 > 0) & (((i2 + (-1)) & i2) == 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i2 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i2))) >>> 31);
            default:
                t40.h();
                return 0;
        }
        return 31 - Integer.numberOfLeadingZeros(i2);
    }

    public static int D(int i2, int i3) {
        if (i2 == 1) {
            if (i3 == 1) {
                return 10;
            }
            if (i3 == 2) {
                return 9;
            }
            switch (i3) {
                case 4:
                    return 11;
                case 8:
                    return 12;
                case 16:
                    return 13;
                case 32:
                    return 20;
                case 64:
                    return 21;
                case NotificationCompat.FLAG_HIGH_PRIORITY /* 128 */:
                    return 22;
                case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
                    return 30;
                case NotificationCompat.FLAG_GROUP_SUMMARY /* 512 */:
                    return 31;
                case 1024:
                    return 32;
                case 2048:
                    return 40;
                case 4096:
                    return 41;
                case 8192:
                    return 42;
                case 16384:
                    return 50;
                case 32768:
                    return 51;
                case 65536:
                    return 52;
                case 131072:
                    return 60;
                case 262144:
                    return 61;
                case 524288:
                    return 62;
                default:
                    throw new i75();
            }
        }
        switch (i2) {
            case 6:
                if (i3 == 1) {
                    return 0;
                }
                if (i3 == 2) {
                    return 1;
                }
                if (i3 == 4) {
                    return 2;
                }
                if (i3 == 8) {
                    return 3;
                }
                throw new i75();
            case 7:
                if (i3 == 1) {
                    return 10;
                }
                if (i3 == 2) {
                    return 11;
                }
                switch (i3) {
                    case 4:
                        return 20;
                    case 8:
                        return 21;
                    case 16:
                        return 30;
                    case 32:
                        return 31;
                    case 64:
                        return 40;
                    case NotificationCompat.FLAG_HIGH_PRIORITY /* 128 */:
                        return 41;
                    case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
                        return 50;
                    case NotificationCompat.FLAG_GROUP_SUMMARY /* 512 */:
                        return 51;
                    case 1024:
                        return 52;
                    case 2048:
                        return 60;
                    case 4096:
                        return 61;
                    case 8192:
                        return 62;
                    default:
                        throw new i75();
                }
            case 8:
                if (i3 == 1 || i3 == 2) {
                    return 30;
                }
                switch (i3) {
                    case 4:
                    case 8:
                        return 60;
                    case 16:
                    case 32:
                        return 63;
                    case 64:
                    case NotificationCompat.FLAG_HIGH_PRIORITY /* 128 */:
                        return 90;
                    case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
                    case NotificationCompat.FLAG_GROUP_SUMMARY /* 512 */:
                        return 93;
                    case 1024:
                    case 2048:
                        return 120;
                    case 4096:
                    case 8192:
                        return 123;
                    case 16384:
                    case 32768:
                        return 150;
                    case 65536:
                    case 131072:
                        return 153;
                    case 262144:
                    case 524288:
                        return 156;
                    case 1048576:
                    case 2097152:
                        return 180;
                    case 4194304:
                    case 8388608:
                        return 183;
                    case 16777216:
                    case 33554432:
                        return 186;
                    default:
                        throw new i75();
                }
            case 9:
                if (i3 == 1) {
                    return 1;
                }
                if (i3 == 2) {
                    return 2;
                }
                if (i3 == 4) {
                    return 3;
                }
                if (i3 == 8) {
                    return 4;
                }
                if (i3 == 16) {
                    return 5;
                }
                if (i3 == 32) {
                    return 6;
                }
                if (i3 == 64) {
                    return 7;
                }
                if (i3 == 128) {
                    return 8;
                }
                if (i3 == 256) {
                    return 9;
                }
                throw new i75();
            case 10:
                if (i3 == 1) {
                    return 20;
                }
                if (i3 == 2) {
                    return 21;
                }
                switch (i3) {
                    case 4:
                        return 22;
                    case 8:
                        return 23;
                    case 16:
                        return 30;
                    case 32:
                        return 31;
                    case 64:
                        return 32;
                    case NotificationCompat.FLAG_HIGH_PRIORITY /* 128 */:
                        return 33;
                    case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
                        return 40;
                    case NotificationCompat.FLAG_GROUP_SUMMARY /* 512 */:
                        return 41;
                    case 1024:
                        return 42;
                    case 2048:
                        return 43;
                    case 4096:
                        return 50;
                    case 8192:
                        return 51;
                    case 16384:
                        return 52;
                    case 32768:
                        return 53;
                    case 65536:
                        return 60;
                    case 131072:
                        return 61;
                    case 262144:
                        return 62;
                    case 524288:
                        return 63;
                    case 1048576:
                        return 70;
                    case 2097152:
                        return 71;
                    case 4194304:
                        return 72;
                    case 8388608:
                        return 73;
                    default:
                        throw new i75();
                }
            default:
                throw new i75();
        }
    }

    public static int E(int i2, int i3) {
        if (i2 == 1) {
            if (i3 == 1) {
                return 0;
            }
            if (i3 == 2) {
                return 1;
            }
            if (i3 == 4) {
                return 2;
            }
            if (i3 == 8) {
                return 3;
            }
            if (i3 == 16) {
                return 4;
            }
            if (i3 == 32) {
                return 5;
            }
            if (i3 == 64) {
                return 6;
            }
            if (i3 == 65536) {
                return 0;
            }
            if (i3 != 524288) {
                throw new i75();
            }
            return 3;
        }
        switch (i2) {
            case 6:
                if (i3 == 1) {
                    return 11;
                }
                throw new i75();
            case 7:
                if (i3 == 1) {
                    return 12;
                }
                if (i3 == 2) {
                    return 13;
                }
                if (i3 == 4) {
                    return 14;
                }
                if (i3 == 8) {
                    return 15;
                }
                if (i3 == 4096) {
                    return 14;
                }
                if (i3 == 8192) {
                    return 15;
                }
                if (i3 != 16384) {
                    throw new i75();
                }
                return 14;
            case 8:
                if (i3 == 1) {
                    return 16;
                }
                if (i3 == 2) {
                    return 17;
                }
                if (i3 == 4) {
                    return 18;
                }
                if (i3 == 4096 || i3 == 8192) {
                    return 17;
                }
                throw new i75();
            case 9:
                if (i3 == 32) {
                    return 21;
                }
                if (i3 == 128) {
                    return 22;
                }
                if (i3 == 256) {
                    return 27;
                }
                if (i3 == 512) {
                    return 28;
                }
                throw new i75();
            case 10:
                if (i3 == 1 || i3 == 2 || i3 == 4096 || i3 == 8192) {
                    return 24;
                }
                throw new i75();
            default:
                throw new i75();
        }
    }

    public static void F(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        sfe.x0(iArr, iArr2, iArr4);
        P(iArr4, iArr3);
    }

    public static StaticLayout G(TextView textView, int i2, int i3) {
        CharSequence text = textView.getText();
        if ((i3 & 2) != 0) {
            i2 = textView.getMaxLines();
        }
        return StaticLayout.Builder.obtain(text, 0, text.length(), textView.getPaint(), (textView.getWidth() - textView.getCompoundPaddingStart()) - textView.getCompoundPaddingEnd()).setUseLineSpacingFromFallbacks(textView.isFallbackLineSpacing()).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setEllipsize(textView.getEllipsize()).setMaxLines(i2).build();
    }

    public static final c8e H(c8e c8eVar, Function1 function1) {
        return c8eVar.d(new scf(function1));
    }

    public static tr5 I(String str) throws lv0 {
        if (StringsKt.N(str)) {
            return tr5.e;
        }
        x8a x8aVar = (x8a) CollectionsKt.Q(y9m.Z(str));
        String str2 = x8aVar.a;
        List list = x8aVar.b;
        int iK = StringsKt.K(str2, '/', 0, 6);
        if (iK == -1) {
            if (Intrinsics.a(StringsKt.l0(str2).toString(), "*")) {
                return tr5.e;
            }
            throw new lv0(str, (byte) 2);
        }
        String string = StringsKt.l0(pik.D(iK, str2)).toString();
        if (string.length() == 0) {
            throw new lv0(str, (byte) 2);
        }
        String string2 = StringsKt.l0(str2.substring(iK + 1)).toString();
        if (StringsKt.F(string, ' ') || StringsKt.F(string2, ' ')) {
            throw new lv0(str, (byte) 2);
        }
        if (string2.length() == 0 || StringsKt.F(string2, '/')) {
            throw new lv0(str, (byte) 2);
        }
        return new tr5(string, string2, list);
    }

    public static void L(InputStream inputStream, byte[] bArr) throws IOException {
        int i2 = 0;
        while (i2 < bArr.length) {
            int i3 = inputStream.read(bArr, i2, bArr.length - i2);
            if (i3 == -1) {
                qp2.c();
                return;
            }
            i2 += i3;
        }
    }

    public static int M(CipherInputStream cipherInputStream) throws IOException {
        byte[] bArr = new byte[4];
        L(cipherInputStream, bArr);
        return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
    }

    public static Object N(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static String O(CipherInputStream cipherInputStream) throws IOException {
        int iM = M(cipherInputStream);
        if (iM < 0) {
            s49.m(sko.i(iM, "Invalid length: "));
            return null;
        }
        byte[] bArr = new byte[iM];
        L(cipherInputStream, bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static void P(int[] iArr, int[] iArr2) {
        long j2 = iArr[5] & 4294967295L;
        long j3 = iArr[6] & 4294967295L;
        long j4 = iArr[7] & 4294967295L;
        long j5 = iArr[8] & 4294967295L;
        long j6 = iArr[9] & 4294967295L;
        long j7 = (iArr[0] & 4294967295L) + j2 + (j2 << 31);
        iArr2[0] = (int) j7;
        long j8 = (iArr[1] & 4294967295L) + j3 + (j3 << 31) + (j7 >>> 32);
        iArr2[1] = (int) j8;
        long j9 = (iArr[2] & 4294967295L) + j4 + (j4 << 31) + (j8 >>> 32);
        iArr2[2] = (int) j9;
        long j10 = (iArr[3] & 4294967295L) + j5 + (j5 << 31) + (j9 >>> 32);
        iArr2[3] = (int) j10;
        long j11 = (iArr[4] & 4294967295L) + j6 + (j6 << 31) + (j10 >>> 32);
        iArr2[4] = (int) j11;
        Q((int) (j11 >>> 32), iArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Q(int r9, int[] r10) {
        /*
            r0 = 5
            if (r9 == 0) goto L33
            long r1 = (long) r9
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 2147483649(0x80000001, double:1.060997896E-314)
            long r1 = r1 * r5
            r9 = 0
            r5 = r10[r9]
            long r5 = (long) r5
            long r5 = r5 & r3
            long r1 = r1 + r5
            int r5 = (int) r1
            r10[r9] = r5
            r5 = 32
            long r1 = r1 >>> r5
            r6 = 1
            r7 = r10[r6]
            long r7 = (long) r7
            long r7 = r7 & r3
            long r1 = r1 + r7
            int r3 = (int) r1
            r10[r6] = r3
            long r1 = r1 >>> r5
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L31
            r9 = 2
            int r9 = defpackage.z5i.U(r0, r9, r10)
        L31:
            if (r9 != 0) goto L41
        L33:
            r9 = 4
            r9 = r10[r9]
            r1 = -1
            if (r9 != r1) goto L47
            int[] r9 = defpackage.na2.h
            boolean r9 = defpackage.sfe.f0(r10, r9)
            if (r9 == 0) goto L47
        L41:
            r9 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            defpackage.z5i.m(r0, r9, r10)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na2.Q(int, int[]):void");
    }

    public static final void R(TextView textView, cgh cghVar, edf edfVar) {
        String str;
        if (cghVar instanceof ckl) {
            str = ((ckl) cghVar).a;
        } else {
            if (!(cghVar instanceof dkl)) {
                h9o.p();
                return;
            }
            str = ((dkl) cghVar).a;
        }
        textView.setText(str);
        p37.C(textView, k, null, new xkl(textView, cghVar, edfVar));
    }

    public static void S(TextView textView, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
    }

    public static void T(Context context) {
        if (i0l.g()) {
            new cd9().w0(context);
        } else {
            new ed9().w0(context);
        }
    }

    public static void U(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        sfe.H0(iArr, iArr3);
        P(iArr3, iArr2);
    }

    public static void V(int[] iArr, int[] iArr2, int i2) {
        int[] iArr3 = new int[10];
        sfe.H0(iArr, iArr3);
        while (true) {
            P(iArr3, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                sfe.H0(iArr2, iArr3);
            }
        }
    }

    public static void W(int[] iArr, int[] iArr2, int[] iArr3) {
        if (sfe.I0(iArr, iArr2, iArr3) != 0) {
            long j2 = (iArr3[0] & 4294967295L) - 2147483649L;
            iArr3[0] = (int) j2;
            if ((j2 >> 32) != 0) {
                z5i.v(5, 1, iArr3);
            }
        }
    }

    public static String X(Map map) {
        int size = map.size();
        scd.q(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size << 3, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static final c8e Y(c8e c8eVar) {
        uhb uhbVar = uhb.a;
        return c8eVar.d(new whb(uup.d));
    }

    public static final Object Z(CoroutineContext coroutineContext, Function2 function2, mt5 mt5Var) {
        Object objP0;
        CoroutineContext context = mt5Var.getContext();
        CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(Boolean.FALSE, new ah5((byte) 21))).booleanValue() ? context.plus(coroutineContext) : cx5.a(context, coroutineContext, false);
        o0g.H(coroutineContextPlus);
        if (coroutineContextPlus == context) {
            jni jniVar = new jni(mt5Var, coroutineContextPlus);
            objP0 = ocp.q(jniVar, true, jniVar, function2);
        } else {
            ot5 ot5Var = d.Hq;
            if (Intrinsics.a(coroutineContextPlus.get(ot5Var), context.get(ot5Var))) {
                ikm ikmVar = new ikm(mt5Var, coroutineContextPlus);
                CoroutineContext coroutineContext2 = ((g4) ikmVar).d;
                Object objB = eml.b(coroutineContext2, (Object) null);
                try {
                    Object objQ = ocp.q(ikmVar, true, ikmVar, function2);
                    eml.a(coroutineContext2, objB);
                    objP0 = objQ;
                } catch (Throwable th) {
                    eml.a(coroutineContext2, objB);
                    throw th;
                }
            } else {
                ja7 ja7Var = new ja7(mt5Var, coroutineContextPlus);
                vtp.Y(function2, ja7Var, ja7Var);
                if (ja7Var.G0()) {
                    objP0 = px5.a;
                } else {
                    objP0 = scd.p0(ja7Var.c0());
                    if (objP0 instanceof fd5) {
                        throw ((fd5) objP0).a;
                    }
                }
            }
        }
        px5 px5Var = px5.a;
        return objP0;
    }

    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static void a0(CipherOutputStream cipherOutputStream, int i2) throws IOException {
        cipherOutputStream.write(new byte[]{(byte) ((i2 >> 24) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 8) & 255), (byte) (i2 & 255)});
    }

    public static final void b(final String str, c8e c8eVar, long j2, final ikl iklVar, rwj rwjVar, final Function1 function1, ih5 ih5Var, final int i2) {
        final c8e c8eVar2;
        final long j3;
        final rwj rwjVar2;
        c8e c8eVar3;
        long j4;
        int i3;
        rwj rwjVar3;
        c8e c8eVar4;
        boolean z;
        long j5;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(978182020);
        int i4 = i2 | (vt9Var.f(str) ? 4 : 2) | 432 | (vt9Var.f(iklVar) ? 2048 : 1024) | 8192 | (vt9Var.h(function1) ? 131072 : 65536);
        int i5 = 0;
        if (vt9Var.N(i4 & 1, (74899 & i4) != 74898)) {
            vt9Var.S();
            if ((i2 & 1) == 0 || vt9Var.x()) {
                long j6 = u95.g;
                rwj rwjVar4 = new rwj(((sa5) vt9Var.j(ua5.a)).a, 0L, (ki9) null, (gi9) null, (hi9) null, (lh9) null, (String) null, 0L, (ua3) null, (vil) null, (awc) null, 0L, bgl.c, (jaj) null, 61438);
                c8eVar3 = z7e.b;
                j4 = j6;
                i3 = i4 & (-57345);
                rwjVar3 = rwjVar4;
            } else {
                vt9Var.Q();
                c8eVar3 = c8eVar;
                j4 = j2;
                i3 = i4 & (-57345);
                rwjVar3 = rwjVar;
            }
            vt9Var.q();
            boolean z2 = (i3 & 14) == 4;
            Object objK = vt9Var.K();
            Object obj = hh5.a;
            if (z2 || objK == obj) {
                StringBuilder sb = new StringBuilder(16);
                ArrayList arrayList = new ArrayList();
                sb.append(str);
                p4j p4jVar = new p4j();
                SpannableString spannableString = new SpannableString(str);
                Linkify.addLinks(spannableString, 1);
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
                int length = uRLSpanArr.length;
                while (i5 < length) {
                    URLSpan uRLSpan = uRLSpanArr[i5];
                    p4jVar.add(new dgc(spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan), uRLSpan.getURL()));
                    i5++;
                    sb = sb;
                    c8eVar3 = c8eVar3;
                    uRLSpanArr = uRLSpanArr;
                }
                StringBuilder sb2 = sb;
                c8eVar4 = c8eVar3;
                r9d it = z4j.a(p4jVar).iterator();
                while (((t9d) it).hasNext()) {
                    dgc dgcVar = (dgc) it.next();
                    int i6 = dgcVar.a;
                    int i7 = dgcVar.b;
                    arrayList.add(new pf1(rwjVar3, i6, i7, 8));
                    arrayList.add(new pf1("url", dgcVar.a, i7, new ehk(dgcVar.c)));
                }
                String string = sb2.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i8 = 0; i8 < size; i8++) {
                    arrayList2.add(((pf1) arrayList.get(i8)).a(sb2.length()));
                }
                objK = new sf1(string, arrayList2);
                vt9Var.g0(objK);
            } else {
                c8eVar4 = c8eVar3;
            }
            sf1 sf1Var = (sf1) objK;
            vt9Var.W(-564895641);
            if (j4 != 16) {
                j5 = j4;
                z = false;
            } else {
                vt9Var.W(-564894624);
                long jB = iklVar.b();
                if (jB == 16) {
                    jB = ((u95) vt9Var.j(aq5.a)).a;
                }
                z = false;
                vt9Var.p(false);
                j5 = jB;
            }
            vt9Var.p(z);
            ikl iklVarD = iklVar.d(new ikl(j5, 0L, null, null, 0L, 0, 0L, null, null, null, 16777214));
            boolean zF = vt9Var.f(sf1Var);
            if ((i3 & 458752) == 131072) {
                z = true;
            }
            boolean z3 = zF | z;
            Object objK2 = vt9Var.K();
            if (z3 || objK2 == obj) {
                objK2 = new ry7(sf1Var, function1, (byte) 26);
                vt9Var.g0(objK2);
            }
            c8e c8eVar5 = c8eVar4;
            jpo.f(sf1Var, c8eVar5, iklVarD, (pel) null, (Function1) objK2, vt9Var, 48, 8);
            j3 = j4;
            c8eVar2 = c8eVar5;
            rwjVar2 = rwjVar3;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
            j3 = j2;
            rwjVar2 = rwjVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2(str, c8eVar2, j3, iklVar, rwjVar2, function1, i2) { // from class: tgc
                public final /* synthetic */ String a;
                public final /* synthetic */ c8e b;
                public final /* synthetic */ long c;
                public final /* synthetic */ ikl d;
                public final /* synthetic */ rwj e;
                public final /* synthetic */ Function1 f;

                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM = aoh.m(1);
                    na2.b(this.a, this.b, this.c, this.d, this.e, this.f, (ih5) obj2, iM);
                    return Unit.a;
                }
            };
        }
    }

    public static void b0(CipherOutputStream cipherOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        a0(cipherOutputStream, bytes.length);
        cipherOutputStream.write(bytes);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.ue5 r17, defpackage.ue5 r18, defpackage.c8e r19, defpackage.ue5 r20, defpackage.ih5 r21, int r22, int r23) {
        /*
            r5 = r22
            r14 = r21
            vt9 r14 = (defpackage.vt9) r14
            r0 = -992411081(0xffffffffc4d90237, float:-1736.0692)
            r14.Y(r0)
            r0 = r5 | 384(0x180, float:5.38E-43)
            r1 = r23 & 8
            if (r1 == 0) goto L17
            r0 = r5 | 3456(0xd80, float:4.843E-42)
        L14:
            r2 = r20
            goto L29
        L17:
            r2 = r5 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L14
            r2 = r20
            boolean r3 = r14.h(r2)
            if (r3 == 0) goto L26
            r3 = 2048(0x800, float:2.87E-42)
            goto L28
        L26:
            r3 = 1024(0x400, float:1.435E-42)
        L28:
            r0 = r0 | r3
        L29:
            r3 = r0 & 1171(0x493, float:1.641E-42)
            r4 = 1170(0x492, float:1.64E-42)
            if (r3 == r4) goto L31
            r3 = 1
            goto L32
        L31:
            r3 = 0
        L32:
            r4 = r0 & 1
            boolean r3 = r14.N(r4, r3)
            if (r3 == 0) goto L65
            if (r1 == 0) goto L40
            ue5 r1 = defpackage.sgb.b
            r9 = r1
            goto L41
        L40:
            r9 = r2
        L41:
            bg5 r1 = new bg5
            r2 = 5
            r3 = r17
            r1.<init>(r3, r2)
            r2 = 317494779(0x12ec95fb, float:1.4930667E-27)
            ue5 r6 = defpackage.gyg.P(r2, r1, r14)
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = 438(0x1b6, float:6.14E-43)
            r15 = r1 | r0
            r16 = 240(0xf0, float:3.36E-43)
            z7e r7 = defpackage.z7e.b
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r8 = r18
            defpackage.so1.e(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4 = r9
            goto L6d
        L65:
            r3 = r17
            r14.Q()
            r7 = r19
            r4 = r2
        L6d:
            znh r8 = r14.r()
            if (r8 == 0) goto L80
            eed r0 = new eed
            r2 = r18
            r6 = r23
            r1 = r3
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.d = r0
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na2.c(ue5, ue5, c8e, ue5, ih5, int, int):void");
    }

    public static final zg d() {
        return new zg(new Paint(7));
    }

    public static final qt9 e(qt9 qt9Var) throws pxb {
        if (qt9Var == null) {
            qt9Var = null;
        }
        if (qt9Var != null) {
            return qt9Var;
        }
        mh5.b("Inconsistent composition");
        t3p.v();
        return null;
    }

    public static final i07 f(nx5 nx5Var, CoroutineContext coroutineContext, rx5 rx5Var, Function2 function2) {
        CoroutineContext coroutineContextB = cx5.b(nx5Var, coroutineContext);
        g4 p4cVar = rx5Var == rx5.b ? new p4c(coroutineContextB, function2) : new i07(coroutineContextB, true);
        p4cVar.D0(rx5Var, p4cVar, function2);
        return p4cVar;
    }

    public static i07 g(nx5 nx5Var, CoroutineContext coroutineContext, rx5 rx5Var, Function2 function2, int i2) {
        if ((i2 & 1) != 0) {
            coroutineContext = h.a;
        }
        if ((i2 & 2) != 0) {
            rx5Var = rx5.a;
        }
        return f(nx5Var, coroutineContext, rx5Var, function2);
    }

    public static go3 h(smf smfVar, boolean z, ih5 ih5Var) {
        int iOrdinal = smfVar.ordinal();
        if (iOrdinal == 2) {
            if (z) {
                vt9 vt9Var = (vt9) ih5Var;
                vt9Var.W(-1491109730);
                unf unfVar = pof.a;
                go3 go3VarG = cqp.G(pof.a(vt9Var).a.M(), 1.0f);
                vt9Var.p(false);
                return go3VarG;
            }
            vt9 vt9Var2 = (vt9) ih5Var;
            vt9Var2.W(-1491030339);
            unf unfVar2 = pof.a;
            go3 go3VarG2 = cqp.G(pof.a(vt9Var2).a.o(), 1.0f);
            vt9Var2.p(false);
            return go3VarG2;
        }
        if (iOrdinal != 3) {
            return null;
        }
        if (z) {
            vt9 vt9Var3 = (vt9) ih5Var;
            vt9Var3.W(-1490910121);
            unf unfVar3 = pof.a;
            go3 go3VarG3 = cqp.G(pof.a(vt9Var3).a.P(), 1.0f);
            vt9Var3.p(false);
            return go3VarG3;
        }
        vt9 vt9Var4 = (vt9) ih5Var;
        vt9Var4.W(-1490824003);
        unf unfVar4 = pof.a;
        go3 go3VarG4 = cqp.G(pof.a(vt9Var4).a.o(), 1.0f);
        vt9Var4.p(false);
        return go3VarG4;
    }

    public static final boolean i(Object obj) {
        if (obj instanceof guj) {
            guj gujVar = (guj) obj;
            if (gujVar.e() == qs7.g || gujVar.e() == zpa.k || gujVar.e() == ujp.n) {
                Object value = gujVar.getValue();
                if (value != null) {
                    return i(value);
                }
                return true;
            }
        } else if (!(obj instanceof br9) || !(obj instanceof Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (g[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int j(int i2) {
        if (i2 < 3) {
            scd.q(i2, "expectedSize");
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) Math.ceil(i2 / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static int n(Context context, String str, int i2, int i3, String str2) {
        int iNoteProxyOpNoThrow;
        if (context.checkPermission(str, i2, i3) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (str2 == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(i3);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        str2 = packagesForUid[0];
                    }
                }
                int iMyUid = Process.myUid();
                String packageName = context.getPackageName();
                if (iMyUid == i3 && Objects.equals(packageName, str2)) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), str2);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, i3, context.getOpPackageName()) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, str2);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static int o(Context context, String str) {
        return n(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static z14 p(smf smfVar, ih5 ih5Var) {
        int iOrdinal = smfVar.ordinal();
        if (iOrdinal == 0) {
            vt9 vt9Var = (vt9) ih5Var;
            vt9Var.W(-1740977551);
            unf unfVar = pof.a;
            akf akfVarA = pof.a(vt9Var);
            z14 z14Var = akfVarA.d;
            s7 s7Var = akfVarA.a;
            if (z14Var == null) {
                z14 z14Var2 = new z14(s7Var.j(), s7Var.r(), s7Var.o(), s7Var.d());
                akfVarA.d = z14Var2;
                z14Var = z14Var2;
            }
            vt9Var.p(false);
            return z14Var;
        }
        if (iOrdinal == 1) {
            vt9 vt9Var2 = (vt9) ih5Var;
            vt9Var2.W(-1740975082);
            unf unfVar2 = pof.a;
            akf akfVarA2 = pof.a(vt9Var2);
            z14 z14Var3 = akfVarA2.e;
            s7 s7Var2 = akfVarA2.a;
            if (z14Var3 == null) {
                z14 z14Var4 = new z14(s7Var2.x(), s7Var2.n(), s7Var2.o(), s7Var2.d());
                akfVarA2.e = z14Var4;
                z14Var3 = z14Var4;
            }
            vt9Var2.p(false);
            return z14Var3;
        }
        if (iOrdinal == 2) {
            vt9 vt9Var3 = (vt9) ih5Var;
            vt9Var3.W(-1740972557);
            unf unfVar3 = pof.a;
            akf akfVarA3 = pof.a(vt9Var3);
            z14 z14Var5 = akfVarA3.f;
            s7 s7Var3 = akfVarA3.a;
            if (z14Var5 == null) {
                long j2 = u95.f;
                z14 z14Var6 = new z14(j2, s7Var3.j(), j2, s7Var3.d());
                akfVarA3.f = z14Var6;
                z14Var5 = z14Var6;
            }
            vt9Var3.p(false);
            return z14Var5;
        }
        if (iOrdinal == 3) {
            vt9 vt9Var4 = (vt9) ih5Var;
            vt9Var4.W(-1740969894);
            unf unfVar4 = pof.a;
            akf akfVarA4 = pof.a(vt9Var4);
            z14 z14Var7 = akfVarA4.g;
            s7 s7Var4 = akfVarA4.a;
            if (z14Var7 == null) {
                long j3 = u95.f;
                z14 z14Var8 = new z14(j3, s7Var4.w(), j3, s7Var4.d());
                akfVarA4.g = z14Var8;
                z14Var7 = z14Var8;
            }
            vt9Var4.p(false);
            return z14Var7;
        }
        if (iOrdinal == 4) {
            vt9 vt9Var5 = (vt9) ih5Var;
            vt9Var5.W(-1740967377);
            unf unfVar5 = pof.a;
            akf akfVarA5 = pof.a(vt9Var5);
            z14 z14Var9 = akfVarA5.h;
            s7 s7Var5 = akfVarA5.a;
            if (z14Var9 == null) {
                long j4 = u95.f;
                z14 z14Var10 = new z14(j4, s7Var5.j(), j4, s7Var5.d());
                akfVarA5.h = z14Var10;
                z14Var9 = z14Var10;
            }
            vt9Var5.p(false);
            return z14Var9;
        }
        if (iOrdinal != 5) {
            throw fki.m((vt9) ih5Var, -1740979013, false);
        }
        vt9 vt9Var6 = (vt9) ih5Var;
        vt9Var6.W(-1740965069);
        unf unfVar6 = pof.a;
        akf akfVarA6 = pof.a(vt9Var6);
        z14 z14Var11 = akfVarA6.i;
        s7 s7Var6 = akfVarA6.a;
        if (z14Var11 == null) {
            z14 z14Var12 = new z14(s7Var6.E(), s7Var6.j(), s7Var6.o(), s7Var6.d());
            akfVarA6.i = z14Var12;
            z14Var11 = z14Var12;
        }
        vt9Var6.p(false);
        return z14Var11;
    }

    public static int q(int i2, int i3) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i3 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i4 = i2 / i3;
        int i5 = i2 - (i3 * i4);
        if (i5 == 0) {
            return i4;
        }
        int i6 = ((i2 ^ i3) >> 31) | 1;
        switch (wbb.a[roundingMode.ordinal()]) {
            case 1:
                zi4.p(i5 == 0);
                return i4;
            case 2:
                return i4;
            case 3:
                if (i6 >= 0) {
                    return i4;
                }
                break;
            case 4:
                break;
            case 5:
                if (i6 <= 0) {
                    return i4;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i5);
                int iAbs2 = iAbs - (Math.abs(i3) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i4;
                }
                if (iAbs2 <= 0) {
                    return i4;
                }
                break;
            default:
                t40.h();
                return 0;
        }
        return i4 + i6;
    }

    public static final void r(TextView textView) {
        int i2;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null || (i2 = layoutParams.height) <= 0) {
            return;
        }
        int paddingTop = ((i2 - textView.getPaddingTop()) - textView.getPaddingBottom()) / textView.getLineHeight();
        if (paddingTop < 1) {
            paddingTop = 1;
        }
        textView.setMaxLines(paddingTop);
        textView.setEllipsize(TextUtils.TruncateAt.END);
    }

    public static boolean s(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static int t(String str) {
        if (str.endsWith("vp9")) {
            return 7;
        }
        if (str.endsWith("vp8")) {
            return 6;
        }
        if (str.endsWith("av01")) {
            return 10;
        }
        if (str.endsWith("avc")) {
            return 1;
        }
        if (str.endsWith("hevc")) {
            return 8;
        }
        if (str.endsWith("dolby-vision")) {
            return 9;
        }
        throw new i75();
    }

    public static int u(int i2, Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return -1;
    }

    public static Drawable v(Context context, Context context2, int i2, Resources.Theme theme) {
        Context context3;
        try {
            if (m) {
                if (theme != null) {
                    ft5 ft5Var = new ft5(context2);
                    ft5Var.b = theme;
                    context3 = ft5Var;
                } else {
                    context3 = context2;
                }
                return sgb.F(i2, context3);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e2) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e2;
            }
            return context2.getDrawable(i2);
        } catch (NoClassDefFoundError unused2) {
            m = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = ResourcesCompat.a;
        return resources.getDrawable(i2, theme);
    }

    public static hte w(Context context) {
        return no7.n(context, hte.l, hte.m);
    }

    public static final yza x() {
        yza yzaVar = n;
        if (yzaVar != null) {
            return yzaVar;
        }
        xza xzaVar = new xza("Filled.KeyboardArrowDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        l08 l08Var = u0n.a;
        nvj nvjVar = new nvj(u95.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new h7g(7.41f, 8.59f));
        arrayList.add(new g7g(12.0f, 13.17f));
        arrayList.add(new o7g(4.59f, -4.58f));
        arrayList.add(new g7g(18.0f, 10.0f));
        arrayList.add(new o7g(-6.0f, 6.0f));
        arrayList.add(new o7g(-6.0f, -6.0f));
        arrayList.add(new o7g(1.41f, -1.41f));
        arrayList.add(d7g.c);
        xza.d(xzaVar, arrayList, nvjVar);
        yza yzaVarE = xzaVar.e();
        n = yzaVarE;
        return yzaVarE;
    }

    public static final Paint y(zg zgVar) {
        if (zgVar == null) {
            z7b.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + uqh.a(zgVar.getClass()).b());
        }
        return (Paint) zgVar.b;
    }

    public static final c8e z(c8e c8eVar) {
        uhb uhbVar = uhb.a;
        return c8eVar.d(new qhb(uup.d));
    }

    public void J(w6 w6Var, w6 w6Var2) {
        w6Var.b = w6Var2;
    }

    public void K(w6 w6Var, Thread thread) {
        w6Var.a = thread;
    }

    public boolean k(x6 x6Var, s6 s6Var, s6 s6Var2) {
        synchronized (x6Var) {
            if (x6Var.b != s6Var) {
                return false;
            }
            x6Var.b = s6Var2;
            return true;
        }
    }

    public boolean l(x6 x6Var, Object obj, Object obj2) {
        synchronized (x6Var) {
            if (x6Var.a != obj) {
                return false;
            }
            x6Var.a = obj2;
            return true;
        }
    }

    public boolean m(x6 x6Var, w6 w6Var, w6 w6Var2) {
        synchronized (x6Var) {
            if (x6Var.c != w6Var) {
                return false;
            }
            x6Var.c = w6Var2;
            return true;
        }
    }
}
