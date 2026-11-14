package defpackage;

import android.animation.ValueAnimator;
import android.app.PictureInPictureParams;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.util.Rational;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.mojo.system.impl.CoreImpl;

/* loaded from: classes.dex */
public abstract class a26 {
    public static ipe a;
    public static final jc1 b = new jc1();
    public static final ue5 c = new ue5(146053440, new ef5((byte) 12), false);
    public static final long[] d;
    public static final j8m e;
    public static final j8m f;
    public static final j8m g;
    public static final j8m h;
    public static final j8m i;
    public static final j8m j;
    public static final j8m k;
    public static final j8m l;
    public static final j8m m;
    public static final eko n;

    static {
        new ue5(1240295808, new cf5((byte) 22), false);
        d = new long[]{2791191049453778211L, 2791191049453778402L, 6};
        e = new j8m(new aym((byte) 13), new q0n((byte) 0));
        f = new j8m(new aym((byte) 14), new aym((byte) 15));
        g = new j8m(new aym((byte) 16), new aym((byte) 17));
        h = new j8m(new aym((byte) 18), new aym((byte) 19));
        i = new j8m(new aym((byte) 20), new aym((byte) 21));
        j = new j8m(new aym((byte) 22), new aym((byte) 23));
        k = new j8m(new aym((byte) 24), new aym((byte) 25));
        l = new j8m(new aym((byte) 26), new aym((byte) 27));
        m = new j8m(new aym((byte) 28), new aym((byte) 29));
        n = new eko((byte) 25);
    }

    public static final uh7 A(View view) {
        return new uh7(Math.max(view.getScaleX(), view.getScaleY()), view.getAlpha(), view.getTranslationZ());
    }

    public static String B(String str) {
        if (Build.VERSION.SDK_INT >= 33) {
            Charset charset = StandardCharsets.UTF_8;
            return t8.g(str);
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            rqd.p(e2);
            return null;
        }
    }

    public static String C(String str) {
        if (Build.VERSION.SDK_INT >= 33) {
            Charset charset = StandardCharsets.UTF_8;
            return t8.h(str);
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            rqd.p(e2);
            return null;
        }
    }

    public static boolean D(hjf hjfVar, Size size, Rect rect) {
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        builder.setAspectRatio(new Rational(size.getWidth(), size.getHeight()));
        if (rect != null) {
            builder.setSourceRectHint(rect);
        }
        try {
            return hjfVar.enterPictureInPictureMode(builder.build());
        } catch (IllegalArgumentException | IllegalStateException unused) {
            return false;
        }
    }

    public static final boolean E(long j2, long j3) {
        return j2 == j3;
    }

    public static final c61 F(ih5 ih5Var) {
        return new c61((Context) ((vt9) ih5Var).j(j41.b), 0);
    }

    public static String G(byte[] bArr, char c2) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < bArr.length; i2++) {
            sb.append(String.format("%02X", Byte.valueOf(bArr[i2])));
            if (i2 != bArr.length - 1) {
                sb.append(c2);
            }
        }
        return sb.toString();
    }

    public static boolean I(int i2, byte[] bArr) {
        return bArr != null && bArr.length >= 4 && (bArr[0] & 255) == 66 && (bArr[1] & 255) == 68 && (bArr[2] & 255) == ((i2 >>> 8) & 255) && (bArr[3] & 255) == 0;
    }

    public static void J(long[] jArr, long[] jArr2, long[] jArr3) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = ((j3 >>> 24) ^ (jArr[2] << 40)) & 17592186044415L;
        long j5 = ((j2 >>> 44) ^ (j3 << 20)) & 17592186044415L;
        long j6 = j2 & 17592186044415L;
        long j7 = jArr2[0];
        long j8 = jArr2[1];
        long j9 = ((j8 >>> 24) ^ (jArr2[2] << 40)) & 17592186044415L;
        long j10 = ((j7 >>> 44) ^ (j8 << 20)) & 17592186044415L;
        long j11 = j7 & 17592186044415L;
        long[] jArr4 = new long[10];
        K(jArr3, j6, j11, jArr4, 0);
        K(jArr3, j4, j9, jArr4, 2);
        long j12 = (j6 ^ j5) ^ j4;
        long j13 = (j11 ^ j10) ^ j9;
        K(jArr3, j12, j13, jArr4, 4);
        long j14 = (j5 << 1) ^ (j4 << 2);
        long j15 = (j10 << 1) ^ (j9 << 2);
        K(jArr3, j6 ^ j14, j11 ^ j15, jArr4, 6);
        K(jArr3, j12 ^ j14, j13 ^ j15, jArr4, 8);
        long j16 = jArr4[6];
        long j17 = jArr4[8] ^ j16;
        long j18 = jArr4[7];
        long j19 = j18 ^ jArr4[9];
        long j20 = (j17 << 1) ^ j16;
        long j21 = (j17 ^ (j19 << 1)) ^ j18;
        long j22 = jArr4[0];
        long j23 = jArr4[1];
        long j24 = (j23 ^ j22) ^ jArr4[4];
        long j25 = j23 ^ jArr4[5];
        long j26 = jArr4[2];
        long j27 = ((j22 ^ j20) ^ (j26 << 4)) ^ (j26 << 1);
        long j28 = jArr4[3];
        long j29 = (((j24 ^ j21) ^ (j28 << 4)) ^ (j28 << 1)) ^ (j27 >>> 44);
        long j30 = (j25 ^ j19) ^ (j29 >>> 44);
        long j31 = ((j27 & 17592186044415L) >>> 1) ^ ((j29 & 1) << 43);
        long j32 = j31 ^ (j31 << 1);
        long j33 = j32 ^ (j32 << 2);
        long j34 = j33 ^ (j33 << 4);
        long j35 = j34 ^ (j34 << 8);
        long j36 = j35 ^ (j35 << 16);
        long j37 = (j36 ^ (j36 << 32)) & 17592186044415L;
        long j38 = (((j29 & 17592186044415L) >>> 1) ^ ((j30 & 1) << 43)) ^ (j37 >>> 43);
        long j39 = j38 ^ (j38 << 1);
        long j40 = j39 ^ (j39 << 2);
        long j41 = j40 ^ (j40 << 4);
        long j42 = j41 ^ (j41 << 8);
        long j43 = j42 ^ (j42 << 16);
        long j44 = (j43 ^ (j43 << 32)) & 17592186044415L;
        long j45 = (j30 >>> 1) ^ (j44 >>> 43);
        long j46 = j45 ^ (j45 << 1);
        long j47 = j46 ^ (j46 << 2);
        long j48 = j47 ^ (j47 << 4);
        long j49 = j48 ^ (j48 << 8);
        long j50 = j49 ^ (j49 << 16);
        long j51 = j50 ^ (j50 << 32);
        jArr3[0] = j22;
        long j52 = (j24 ^ j37) ^ j26;
        jArr3[1] = j52;
        long j53 = ((j25 ^ j44) ^ j37) ^ j28;
        jArr3[2] = j53;
        long j54 = j51 ^ j44;
        jArr3[3] = j54;
        long j55 = j51 ^ jArr4[2];
        jArr3[4] = j55;
        long j56 = jArr4[3];
        jArr3[5] = j56;
        jArr3[0] = j22 ^ (j52 << 44);
        jArr3[1] = (j52 >>> 20) ^ (j53 << 24);
        jArr3[2] = ((j53 >>> 40) ^ (j54 << 4)) ^ (j55 << 48);
        jArr3[3] = ((j54 >>> 60) ^ (j56 << 28)) ^ (j55 >>> 16);
        jArr3[4] = j56 >>> 36;
        jArr3[5] = 0;
    }

    public static void K(long[] jArr, long j2, long j3, long[] jArr2, int i2) {
        jArr[1] = j3;
        long j4 = j3 << 1;
        jArr[2] = j4;
        long j5 = j4 ^ j3;
        jArr[3] = j5;
        long j6 = j3 << 2;
        jArr[4] = j6;
        jArr[5] = j6 ^ j3;
        long j7 = j5 << 1;
        jArr[6] = j7;
        jArr[7] = j7 ^ j3;
        int i3 = (int) j2;
        long j8 = (((jArr[i3 & 7] ^ (jArr[(i3 >>> 3) & 7] << 3)) ^ (jArr[(i3 >>> 6) & 7] << 6)) ^ (jArr[(i3 >>> 9) & 7] << 9)) ^ (jArr[(i3 >>> 12) & 7] << 12);
        long j9 = 0;
        int i4 = 30;
        do {
            int i5 = (int) (j2 >>> i4);
            long j10 = (((jArr[i5 & 7] ^ (jArr[(i5 >>> 3) & 7] << 3)) ^ (jArr[(i5 >>> 6) & 7] << 6)) ^ (jArr[(i5 >>> 9) & 7] << 9)) ^ (jArr[(i5 >>> 12) & 7] << 12);
            j8 ^= j10 << i4;
            j9 ^= j10 >>> (-i4);
            i4 -= 15;
        } while (i4 > 0);
        jArr2[i2] = 17592186044415L & j8;
        jArr2[i2 + 1] = (j8 >>> 44) ^ (j9 << 20);
    }

    public static void L(long[] jArr, long[] jArr2) {
        ui6.t(jArr, jArr2, 2);
        int i2 = ((int) jArr[2]) & 255;
        int i3 = (i2 | (i2 << 4)) & 3855;
        int i4 = (i3 | (i3 << 2)) & 13107;
        jArr2[4] = (i4 | (i4 << 1)) & 21845 & 4294967295L;
    }

    public static void M(List list) throws f07 {
        if (list.isEmpty()) {
            return;
        }
        int i2 = 0;
        do {
            try {
                ((g07) list.get(i2)).d();
                i2++;
            } catch (f07 e2) {
                for (int i3 = i2 - 1; i3 >= 0; i3--) {
                    ((g07) list.get(i3)).b();
                }
                throw e2;
            }
        } while (i2 < list.size());
    }

    public static boolean N(MotionEvent motionEvent, int i2) {
        return (motionEvent.getSource() & i2) == i2;
    }

    public static final zpa O(ydp ydpVar, String str, Executor executor, Function0 function0) {
        ode odeVar = new ode(zpa.i);
        l94 l94Var = new l94();
        l94Var.c = new byh();
        o94 o94Var = new o94(l94Var);
        l94Var.b = o94Var;
        l94Var.a = vep.class;
        try {
            executor.execute(new i61(ydpVar, str, function0, odeVar, l94Var, (byte) 5));
            Unit unit = Unit.a;
            if (unit != null) {
                l94Var.a = unit;
            }
        } catch (Exception e2) {
            o94Var.a(e2);
        }
        return new zpa((byte) 8);
    }

    public static final void P(View view, m3c m3cVar) {
        long jU = ((j8b) m3cVar.F.b).U(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jU >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jU & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }

    public static final c8e Q(c8e c8eVar, vtb vtbVar, y5c y5cVar, fsf fsfVar, boolean z) {
        return c8eVar.d(new b6c(vtbVar, y5cVar, fsfVar, z));
    }

    public static void R(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        J(jArr, jArr2, jArr4);
        j0(jArr4, jArr3);
    }

    public static final void S(ekc ekcVar, ikc ikcVar, f7f f7fVar) {
        lqh lqhVar = new lqh();
        lqhVar.a = ekcVar.i();
        T(ekcVar, ikcVar, new qg(lqhVar, f7fVar, (byte) 0));
    }

    public static final void T(ekc ekcVar, ikc ikcVar, f7f f7fVar) {
        ikcVar.k(new ug(new q3(new tg(f7fVar), ekcVar, (byte) 3), (byte) 0));
    }

    public static final void U(w6f w6fVar, ikc ikcVar, Object obj, Function0 function0) {
        ikcVar.k(new sg(w6fVar, obj, function0));
    }

    public static final c8e W(c8e c8eVar, xvf xvfVar) {
        return c8eVar.d(new yvf(xvfVar, new w5f((byte) 26)));
    }

    public static final c8e X(c8e c8eVar, float f2) {
        return c8eVar.d(new uvf(f2, f2, f2, f2, new w5f((byte) 23)));
    }

    public static final c8e Y(c8e c8eVar, float f2, float f3) {
        return c8eVar.d(new uvf(f2, f3, f2, f3, new w5f((byte) 24)));
    }

    public static c8e Z(c8e c8eVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return Y(c8eVar, f2, f3);
    }

    public static gwj a(byte[] bArr) {
        int length = bArr.length;
        c04 c04Var = new c04();
        c04Var.s(length, bArr);
        return new gwj(c04Var);
    }

    public static final c8e a0(c8e c8eVar, float f2, float f3, float f4, float f5) {
        return c8eVar.d(new uvf(f2, f3, f4, f5, new w5f((byte) 25)));
    }

    public static final void b(String str, c8e c8eVar, ih5 ih5Var, int i2) {
        byte b2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1337381726);
        int i3 = i2 | (vt9Var.f(str) ? 4 : 2);
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            c8e c8eVarX = X(c8eVar.d(mpj.a), 16.0f);
            db5 db5VarA = cb5.a(new x62(16.0f, true, new t40((byte) 19)), rbe.o, vt9Var, 54);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarX);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, db5VarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            hyf hyfVarA = iza.a((dl7) tk7.M.getValue(), vt9Var);
            c8e c8eVarH = mpj.h(z7e.b, 48.0f);
            hp7 hp7Var = ua5.a;
            wta.b(hyfVarA, "Empty", c8eVarH, ((sa5) vt9Var.j(hp7Var)).s, vt9Var, 440, 0);
            ijl.b(str, null, ((sa5) vt9Var.j(hp7Var)).s, 0L, null, 0L, null, new pel(3), 0L, 0, false, 0, 0, ((wam) vt9Var.j(abm.a)).k, vt9Var, i3 & 14, 0, 130042);
            vt9Var = vt9Var;
            b2 = 1;
            vt9Var.p(true);
        } else {
            b2 = 1;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new a57(str, c8eVar, i2, b2);
        }
    }

    public static c8e b0(c8e c8eVar, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return a0(c8eVar, f2, f3, f4, f5);
    }

    public static zvf c(int i2, float f2, float f3) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new zvf(f2, f3, f2, f3);
    }

    public static BigDecimal c0(String str) {
        t(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static zvf d(float f2, int i2) {
        return new zvf((i2 & 1) != 0 ? 0.0f : 16.0f, (i2 & 2) != 0 ? 0.0f : 4.0f, (i2 & 4) != 0 ? 0.0f : 16.0f, f2);
    }

    public static Uri d0(String str) {
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
    }

    public static URL e0(String str) {
        URL url;
        try {
            url = new URL(str);
        } catch (Exception unused) {
            url = null;
        }
        if (url != null) {
            return url;
        }
        try {
            return new URL(sko.j("http://", str));
        } catch (Exception unused2) {
            return null;
        }
    }

    public static final ValueAnimator f(View view, x46 x46Var) {
        r(view);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        view.setTag(2131364682, new v46(x46Var, valueAnimatorOfFloat));
        return valueAnimatorOfFloat;
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static zx2 f0(java.io.DataInputStream r28, fr r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a26.f0(java.io.DataInputStream, fr):zx2");
    }

    public static final void g(View view, long j2, uh7 uh7Var, uh7 uh7Var2, boolean z) {
        r(view);
        ValueAnimator valueAnimatorF = f(view, x46.a);
        valueAnimatorF.setDuration(j2);
        valueAnimatorF.addUpdateListener(new af1(uh7Var, uh7Var2, view, (byte) 0));
        valueAnimatorF.addListener(new cf1(z, view, uh7Var2, (byte) 0));
        valueAnimatorF.start();
    }

    public static boolean g0(DataInputStream dataInputStream) throws IOException {
        int unsignedByte = dataInputStream.readUnsignedByte();
        if (unsignedByte <= 1) {
            return unsignedByte == 1;
        }
        s49.m("invalid boolean in BDS state");
        return false;
    }

    public static final f99 h(no7 no7Var) {
        return ic4.l(f03.g(new jj4((byte) 6, (mt5) null, (Object) no7Var)), -1);
    }

    public static int h0(DataInputStream dataInputStream, int i2, String str) throws IOException {
        int i3 = dataInputStream.readInt();
        if (i3 >= 0 && i3 <= i2) {
            return i3;
        }
        s49.m(str.concat(" size out of bounds"));
        return 0;
    }

    public static final plh i(jdj jdjVar) {
        return new plh(jdjVar, null);
    }

    public static dao i0(DataInputStream dataInputStream, int i2, int i3, fr frVar) throws IOException {
        int i4 = frVar.b;
        if (i4 == 0) {
            s49.m("too many XMSS nodes in BDS state");
            return null;
        }
        frVar.b = i4 - 1;
        int i5 = dataInputStream.readInt();
        int i6 = dataInputStream.readInt();
        if (i5 < i2 || i5 > i3) {
            s49.m("XMSS node height out of bounds");
            return null;
        }
        if (i6 < 1 || i6 > 64) {
            s49.m("XMSS node value size out of bounds");
            return null;
        }
        int i7 = frVar.c;
        if (i7 == 0) {
            frVar.c = i6;
        } else if (i7 != i6) {
            s49.m("inconsistent XMSS node value sizes");
            return null;
        }
        byte[] bArr = new byte[i6];
        dataInputStream.readFully(bArr);
        return new dao(i5, bArr);
    }

    public static final rlh j(nak nakVar) {
        return new rlh(nakVar, null);
    }

    public static void j0(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = j5 ^ (j6 >>> 59);
        long j8 = j2 ^ ((j7 << 61) ^ (j7 << 63));
        long j9 = (j3 ^ ((j6 << 61) ^ (j6 << 63))) ^ ((((j7 >>> 3) ^ (j7 >>> 1)) ^ j7) ^ (j7 << 5));
        long j10 = (j4 ^ ((((j6 >>> 3) ^ (j6 >>> 1)) ^ j6) ^ (j6 << 5))) ^ (j7 >>> 59);
        long j11 = j10 >>> 3;
        jArr2[0] = (((j8 ^ j11) ^ (j11 << 2)) ^ (j11 << 3)) ^ (j11 << 8);
        jArr2[1] = j9 ^ (j10 >>> 59);
        jArr2[2] = j10 & 7;
    }

    public static final Object k(no7 no7Var, nt5 nt5Var) {
        if (no7Var.j()) {
            no7Var.s();
            return no7Var.i;
        }
        cv6 cv6Var = bb7.a;
        return na2.Z(s6d.a.e, new fg6((byte) 12, (mt5) null, no7Var), nt5Var);
    }

    public static void k0(r rVar, Size size) {
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        builder.setAspectRatio(new Rational(size.getWidth(), size.getHeight()));
        try {
            rVar.setPictureInPictureParams(builder.build());
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
    }

    public static final Object l(ListenableFuture listenableFuture, kuk kukVar) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return x6.g(listenableFuture);
            }
            nh4 nh4Var = new nh4(1, hib.b(kukVar));
            nh4Var.s();
            listenableFuture.addListener(new wr9(listenableFuture, nh4Var, (byte) 22), k97.a);
            nh4Var.u(new v91(listenableFuture, (byte) 7));
            Object objQ = nh4Var.q();
            px5 px5Var = px5.a;
            return objQ;
        } catch (ExecutionException e2) {
            throw e2.getCause();
        }
    }

    public static final plh l0(f99 f99Var, nx5 nx5Var, bej bejVar, int i2) {
        zg zgVarX = x(f99Var, i2);
        jdj jdjVarB = ipe.b(i2, zgVarX.a, (h04) zgVarX.c);
        return new plh(jdjVarB, na2.A(nx5Var, (CoroutineContext) zgVarX.d, bejVar.equals(aej.a) ? rx5.a : rx5.d, new jj4(bejVar, (f99) zgVarX.b, jdjVarB, ipe.g, null, (byte) 8)));
    }

    public static boolean m0(hjf hjfVar) throws PackageManager.NameNotFoundException {
        if (hjfVar.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
            try {
                ActivityInfo activityInfo = hjfVar.getPackageManager().getActivityInfo(hjfVar.getComponentName(), 0);
                if (((Boolean) activityInfo.getClass().getMethod("supportsPictureInPicture", null).invoke(activityInfo, null)).booleanValue() && !hjfVar.isInPictureInPictureMode() && !hjfVar.isChangingConfigurations() && !hjfVar.isFinishing()) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    public static void n0(long[] jArr, long[] jArr2, int i2) {
        long[] jArr3 = new long[5];
        L(jArr, jArr3);
        while (true) {
            j0(jArr3, jArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                L(jArr2, jArr3);
            }
        }
    }

    public static final int o(o1d o1dVar, sz0 sz0Var) {
        o1d o1dVarX0 = o1dVar.x0();
        if (o1dVarX0 == null) {
            a8b.b("Child of " + o1dVar + " cannot be null when calculating alignment line");
        }
        if (o1dVar.G0().a().containsKey(sz0Var)) {
            Integer num = (Integer) o1dVar.G0().a().get(sz0Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iW = o1dVarX0.W(sz0Var);
            if (iW != Integer.MIN_VALUE) {
                boolean z = o1dVar.n;
                boolean z2 = o1dVar.o;
                o1dVarX0.n = true;
                o1dVar.o = true;
                o1dVar.M0();
                o1dVarX0.n = z;
                o1dVar.o = z2;
                return iW + ((int) (sz0Var instanceof mga ? o1dVarX0.I0() & 4294967295L : o1dVarX0.I0() >> 32));
            }
        }
        return LinearLayoutManager.INVALID_OFFSET;
    }

    public static final rlh o0(f99 f99Var, nx5 nx5Var, bej bejVar, Object obj) {
        zg zgVarX = x(f99Var, 1);
        nak nakVarF = z4o.f(obj);
        return new rlh(nakVarF, na2.A(nx5Var, (CoroutineContext) zgVarX.d, bejVar.equals(aej.a) ? rx5.a : rx5.d, new jj4(bejVar, (f99) zgVarX.b, nakVarF, obj, null, (byte) 8)));
    }

    public static final float p(xvf xvfVar, d2c d2cVar) {
        return d2cVar == d2c.a ? xvfVar.c(d2cVar) : xvfVar.b(d2cVar);
    }

    public static String p0(long j2) {
        return E(j2, 12884901888L) ? "Rgb" : E(j2, 12884901889L) ? "Xyz" : E(j2, 12884901890L) ? "Lab" : E(j2, 17179869187L) ? "Cmyk" : "Unknown";
    }

    public static final float q(xvf xvfVar, d2c d2cVar) {
        return d2cVar == d2c.a ? xvfVar.b(d2cVar) : xvfVar.c(d2cVar);
    }

    public static void q0(DataOutputStream dataOutputStream, zx2 zx2Var) throws IOException {
        try {
            zx2Var.h();
            int i2 = zx2Var.b;
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeInt(zx2Var.d);
            dataOutputStream.writeInt(zx2Var.l);
            dataOutputStream.writeInt(zx2Var.j);
            dataOutputStream.writeByte(zx2Var.k ? 1 : 0);
            dao daoVar = zx2Var.e;
            dataOutputStream.writeByte(daoVar != null ? 1 : 0);
            if (daoVar != null) {
                r0(dataOutputStream, daoVar, i2);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = zx2Var.f;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                arrayList.add((dao) obj);
            }
            dataOutputStream.writeInt(arrayList.size());
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                r0(dataOutputStream, (dao) arrayList.get(i4), i2);
            }
            TreeMap treeMap = new TreeMap();
            treeMap.putAll(zx2Var.g);
            dataOutputStream.writeInt(treeMap.size());
            for (Integer num : treeMap.keySet()) {
                List list = (List) treeMap.get(num);
                dataOutputStream.writeInt(num.intValue());
                dataOutputStream.writeInt(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r0(dataOutputStream, (dao) it.next(), i2);
                }
            }
            Stack stack = zx2Var.h;
            dataOutputStream.writeInt(stack.size());
            Iterator it2 = stack.iterator();
            while (it2.hasNext()) {
                r0(dataOutputStream, (dao) it2.next(), i2);
            }
            ArrayList arrayList3 = zx2Var.c;
            dataOutputStream.writeInt(arrayList3.size());
            int size2 = arrayList3.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList3.get(i5);
                i5++;
                dy2 dy2Var = (dy2) obj2;
                dataOutputStream.writeInt(dy2Var.b);
                dataOutputStream.writeInt(dy2Var.c);
                dataOutputStream.writeInt(dy2Var.d);
                dataOutputStream.writeByte(dy2Var.e ? 1 : 0);
                dataOutputStream.writeByte(dy2Var.f ? 1 : 0);
                dao daoVar2 = dy2Var.a;
                dataOutputStream.writeByte(daoVar2 != null ? 1 : 0);
                if (daoVar2 != null) {
                    r0(dataOutputStream, daoVar2, i2);
                }
            }
            TreeMap treeMap2 = zx2Var.i;
            dataOutputStream.writeInt(treeMap2.size());
            for (Integer num2 : treeMap2.keySet()) {
                dataOutputStream.writeInt(num2.intValue());
                r0(dataOutputStream, (dao) treeMap2.get(num2), i2);
            }
        } catch (IllegalStateException e2) {
            throw c26.z("invalid BDS state", e2);
        }
    }

    public static final void r(View view) {
        Object tag = view.getTag(2131364682);
        if (tag == null) {
            return;
        }
        ((v46) tag).b.cancel();
        view.setTag(2131364682, null);
    }

    public static void r0(DataOutputStream dataOutputStream, dao daoVar, int i2) throws IOException {
        if (daoVar == null) {
            s49.m("null XMSS node");
            return;
        }
        byte[] bArrL = dbh.l(daoVar.b);
        int i3 = daoVar.a;
        if (i3 < 0 || i3 > i2 || bArrL.length < 1 || bArrL.length > 64) {
            s49.m("XMSS node out of bounds");
            return;
        }
        dataOutputStream.writeInt(i3);
        dataOutputStream.writeInt(bArrL.length);
        dataOutputStream.write(bArrL);
    }

    public static void s(byte[] bArr) {
        if (bArr == null || bArr.length < 8 || bArr.length > 4194304) {
            s49.m("BDS state encoding size out of bounds");
        }
    }

    public static final void s0(Image.Plane plane, int i2, int i3, byte[] bArr, int i4, int i5) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride != 0) {
            int i6 = i2 / (i3 / rowStride);
            int rowStride2 = 0;
            for (int i7 = 0; i7 < rowStride; i7++) {
                int pixelStride = rowStride2;
                for (int i8 = 0; i8 < i6; i8++) {
                    bArr[i4] = buffer.get(pixelStride);
                    i4 += i5;
                    pixelStride += plane.getPixelStride();
                }
                rowStride2 += plane.getRowStride();
            }
        }
    }

    public static void t(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    public static int u(byte[] bArr, byte[] bArr2) {
        String str;
        if (bArr.length >= 40) {
            int length = bArr.length - 32;
            qci qciVar = new qci();
            if (bArr2 != null) {
                qciVar.g(0, bArr2.length, bArr2);
            }
            qciVar.g(0, length, bArr);
            byte[] bArr3 = new byte[32];
            qciVar.e(0, bArr3);
            for (int i2 = 0; i2 != 32; i2++) {
                if (bArr3[i2] != bArr[length + i2]) {
                    str = "BDS state checksum does not match";
                }
            }
            return length;
        }
        str = "BDS state encoding size out of bounds";
        s49.m(str);
        return 0;
    }

    public static float v(float f2, float f3, float f4) {
        if (f3 <= f4) {
            f4 = f3;
            f3 = f4;
        }
        return f2 < f4 ? f4 : f2 > f3 ? f3 : f2;
    }

    public static final tsd w(ikc ikcVar, kze kzeVar) {
        pg pgVar = (pg) ikcVar.g();
        pg pgVar2 = (pg) kzeVar.g();
        og ogVar = ng.a;
        if (!Intrinsics.a(pgVar, ogVar) || !Intrinsics.a(pgVar2, ogVar)) {
            ogVar = og.a;
        }
        return xf8.B(xf8.Y(ogVar, ikcVar, kzeVar, new ve5((byte) 6)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.zg x(f99 r7, int r8) {
        /*
            nr4 r0 = or4.Qo
            r0.getClass()
            int r0 = nr4.b
            if (r8 < r0) goto La
            r0 = r8
        La:
            int r0 = r0 - r8
            boolean r1 = r7 instanceof tr4
            if (r1 == 0) goto L3b
            r1 = r7
            tr4 r1 = (tr4) r1
            h04 r2 = r1.c
            f99 r3 = r1.f()
            if (r3 == 0) goto L3b
            zg r7 = new zg
            int r4 = r1.b
            r5 = -3
            if (r4 == r5) goto L28
            r5 = -2
            if (r4 == r5) goto L28
            if (r4 == 0) goto L28
            r0 = r4
            goto L35
        L28:
            h04 r5 = h04.a
            r6 = 0
            if (r2 != r5) goto L30
            if (r4 != 0) goto L35
            goto L34
        L30:
            if (r8 != 0) goto L34
            r0 = 1
            goto L35
        L34:
            r0 = r6
        L35:
            kotlin.coroutines.CoroutineContext r8 = r1.a
            r7.<init>(r3, r0, r2, r8)
            return r7
        L3b:
            zg r8 = new zg
            h04 r1 = h04.a
            kotlin.coroutines.h r2 = kotlin.coroutines.h.a
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a26.x(f99, int):zg");
    }

    public static ByteBuffer y(x8b x8bVar) throws l3e {
        int i2;
        int i3 = x8bVar.f;
        int i4 = 0;
        if (i3 == -1) {
            Bitmap bitmapCopy = (Bitmap) Preconditions.checkNotNull(x8bVar.a);
            if (bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
                bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
            }
            Bitmap bitmap = bitmapCopy;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i5 = width * height;
            int[] iArr = new int[i5];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((((int) Math.ceil(height / 2.0d)) << 1) * ((int) Math.ceil(width / 2.0d))) + i5);
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i6 < height) {
                int i9 = i4;
                while (i9 < width) {
                    int i10 = iArr[i8];
                    int i11 = i10 >> 16;
                    int i12 = i10 >> 8;
                    int i13 = i10 & 255;
                    int i14 = i7 + 1;
                    int i15 = i11 & 255;
                    int i16 = i12 & 255;
                    byteBufferAllocateDirect.put(i7, (byte) Math.min(255, ((((i13 * 25) + ((i16 * 129) + (i15 * 66))) + NotificationCompat.FLAG_HIGH_PRIORITY) >> 8) + 16));
                    if (i6 % 2 == 0 && i8 % 2 == 0) {
                        int i17 = (((i15 * 112) - (i16 * 94)) - (i13 * 18)) + NotificationCompat.FLAG_HIGH_PRIORITY;
                        int i18 = ((((i15 * (-38)) - (i16 * 74)) + (i13 * 112)) + NotificationCompat.FLAG_HIGH_PRIORITY) >> 8;
                        int i19 = (i17 >> 8) + NotificationCompat.FLAG_HIGH_PRIORITY;
                        int i20 = i18 + NotificationCompat.FLAG_HIGH_PRIORITY;
                        int i21 = i5 + 1;
                        byteBufferAllocateDirect.put(i5, (byte) Math.min(255, i19));
                        i5 += 2;
                        byteBufferAllocateDirect.put(i21, (byte) Math.min(255, i20));
                    }
                    i8++;
                    i9++;
                    i7 = i14;
                }
                i6++;
                i4 = 0;
            }
            return byteBufferAllocateDirect;
        }
        if (i3 == 17) {
            return (ByteBuffer) Preconditions.checkNotNull((Object) null);
        }
        if (i3 != 35) {
            if (i3 != 842094169) {
                throw new l3e("Unsupported image format", 13);
            }
            ByteBuffer byteBuffer = (ByteBuffer) Preconditions.checkNotNull((Object) null);
            byteBuffer.rewind();
            int iLimit = byteBuffer.limit();
            int i22 = iLimit / 6;
            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(iLimit);
            int i23 = 0;
            while (true) {
                i2 = i22 << 2;
                if (i23 >= i2) {
                    break;
                }
                byteBufferAllocateDirect2.put(i23, byteBuffer.get(i23));
                i23++;
            }
            while (i4 < (i22 << 1)) {
                byteBufferAllocateDirect2.put(i2 + i4, byteBuffer.get((i4 / 2) + ((i4 % 2) * i22) + i2));
                i4++;
            }
            return byteBufferAllocateDirect2;
        }
        Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(x8bVar.a());
        int i24 = x8bVar.c;
        int i25 = x8bVar.d;
        int i26 = i24 * i25;
        byte[] bArr = new byte[((i26 / 4) << 1) + i26];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit2 = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit2 - 1);
        int i27 = (i26 << 1) / 4;
        boolean z = buffer2.remaining() == i27 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit2);
        if (z) {
            planeArr[0].getBuffer().get(bArr, 0, i26);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i26, 1);
            buffer3.get(bArr, i26 + 1, i27 - 1);
        } else {
            s0(planeArr[0], i24, i25, bArr, 0, 1);
            s0(planeArr[1], i24, i25, bArr, i26 + 1, 2);
            s0(planeArr[2], i24, i25, bArr, i26, 2);
        }
        return ByteBuffer.wrap(bArr);
    }

    public static ipe z(Context context, x16 x16Var) {
        ipe cyeVar;
        synchronized (a26.class) {
            if (a == null && Build.VERSION.SDK_INT >= 30) {
                if (c26.r(context).getBoolean("android.net.http.EnableTelemetry", x16Var == x16.e || x16Var == x16.c)) {
                    try {
                        a = new b26();
                    } catch (Exception unused) {
                    }
                }
            }
            cyeVar = a;
            if (cyeVar == null) {
                cyeVar = new cye();
                a = cyeVar;
            }
        }
        return cyeVar;
    }

    public abstract String H();

    public final j9i m(neb nebVar, kwd kwdVar) {
        j9i j9iVar = new j9i(kwdVar);
        s61 s61VarN = n(kwdVar.h0(), nebVar);
        j9iVar.a.e = nebVar;
        try {
            j9iVar.k(s61VarN);
            j9iVar.l();
            return j9iVar;
        } catch (e13 e2) {
            h9o.m("Bad message received while setting up primary stub. This should not be possible as the router has not been started yet", e2);
            return null;
        }
    }

    public abstract s61 n(CoreImpl coreImpl, neb nebVar);
}
