package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Base64;
import android.util.Size;
import android.view.View;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Map;
import kotlin.text.CharsKt;
import kotlinx.serialization.json.b;

/* loaded from: classes.dex */
public final class j06 implements k06, csg, u38, lo7, c2c, isa, f94, lkm, sth, f06 {
    public static j06 b;
    public final /* synthetic */ byte a;

    public /* synthetic */ j06(byte b2) {
        this.a = b2;
    }

    public static void h(OperaIconedMessage operaIconedMessage, TypedArray typedArray) {
        for (Map.Entry entry : xkf.d.entrySet()) {
            if (typedArray.hasValue(((Number) entry.getKey()).intValue())) {
                ((cr9) entry.getValue()).invoke(operaIconedMessage, typedArray, entry.getKey());
            }
        }
        typedArray.recycle();
    }

    public static s1e i(String str) {
        h58 h58Var = s1e.f;
        w4 w4VarE = sko.e(h58Var, h58Var);
        while (w4VarE.hasNext()) {
            s1e s1eVar = (s1e) w4VarE.next();
            if (s1eVar.a.equals(str)) {
                return s1eVar;
            }
        }
        h9o.h("Collection contains no element matching the predicate.");
        return null;
    }

    public static ByteArrayInputStream j(String str) {
        if (!str.startsWith("data:image")) {
            qp2.o("Not a valid image data URL.");
            return null;
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            qp2.o("Missing comma in data URL.");
            return null;
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        qp2.o("Not a base64 image data URL.");
        return null;
    }

    public static gt6 l(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new gt6(httpURLConnection, (byte) 0);
    }

    public static ebb m(long j) {
        long j2 = j / 1000;
        if ((j ^ 1000) < 0 && j2 * 1000 != j) {
            j2--;
        }
        long j3 = j % 1000;
        return j2 < -31557014167219200L ? ebb.c : j2 > 31556889864403199L ? ebb.d : n(j2, (int) ((j3 + ((((j3 ^ 1000) & ((-j3) | j3)) >> 63) & 1000)) * 1000000));
    }

    public static ebb n(long j, long j2) {
        long j3 = j2 / 1000000000;
        if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
            j3--;
        }
        long j4 = j + j3;
        if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
            return j > 0 ? ebb.d : ebb.c;
        }
        if (j4 < -31557014167219200L) {
            return ebb.c;
        }
        if (j4 > 31556889864403199L) {
            return ebb.d;
        }
        long j5 = j2 % 1000000000;
        return new ebb(j4, (int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)));
    }

    private final void o(v84 v84Var, IOException iOException) {
    }

    private final void p(v84 v84Var, IOException iOException) {
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0465  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ebb q(java.lang.CharSequence r24) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j06.q(java.lang.CharSequence):ebb");
    }

    @Override // defpackage.lkm
    public final void R(ArrayList arrayList) {
    }

    public final kzc a(String str) {
        return lge.a;
    }

    public final int b(View view) {
        return cs5.L(view);
    }

    @Override // defpackage.u38
    public final Object d(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }

    @Override // defpackage.csg
    public final CharSequence e(Preference preference) {
        return ((EditTextPreference) preference).a.getString(2132020045);
    }

    public final h06 f() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: gwa */
    public final Object g(Object obj) throws gwa {
        rg8 rg8Var;
        jo2 jo2Var = (jo2) obj;
        qya qyaVar = jo2Var.b;
        s1h s1hVar = jo2Var.a;
        if (sfe.m0(qyaVar.getFormat())) {
            try {
                f30 f30Var = rg8.b;
                ByteBuffer byteBufferU = qyaVar.A0()[0].u();
                byteBufferU.rewind();
                byte[] bArr = new byte[byteBufferU.capacity()];
                byteBufferU.get(bArr);
                rg8Var = new rg8(new gh8(new ByteArrayInputStream(bArr)));
                qyaVar.A0()[0].u().rewind();
            } catch (IOException e) {
                throw new gwa(1, "Failed to extract EXIF data.", e);
            }
        } else {
            rg8Var = null;
        }
        byte b2 = 27;
        if (((ImageCaptureRotationOptionQuirk) a77.a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
            an2 an2Var = ai4.f;
        } else if (sfe.m0(qyaVar.getFormat())) {
            jpo.m(rg8Var, "JPEG image must have exif.");
            Size size = new Size(qyaVar.getWidth(), qyaVar.getHeight());
            int iA = s1hVar.c - rg8Var.a();
            Size size2 = d2m.c(d2m.j(iA)) ? new Size(size.getHeight(), size.getWidth()) : size;
            Matrix matrixA = d2m.a(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), iA, false);
            RectF rectF = new RectF(s1hVar.b);
            matrixA.mapRect(rectF);
            rectF.sort();
            Size size3 = size2;
            Rect rect = new Rect();
            rectF.round(rect);
            int iA2 = rg8Var.a();
            Matrix matrix = new Matrix(s1hVar.e);
            matrix.postConcat(matrixA);
            yb4 ulpVar = qyaVar.h1() instanceof zb4 ? ((zb4) qyaVar.h1()).a : new ulp(b2);
            qyaVar.getFormat();
            return new eo2(qyaVar, rg8Var, qyaVar.getFormat(), size3, rect, iA2, matrix, ulpVar);
        }
        Rect rect2 = s1hVar.b;
        int i = s1hVar.c;
        Matrix matrix2 = s1hVar.e;
        yb4 ulpVar2 = qyaVar.h1() instanceof zb4 ? ((zb4) qyaVar.h1()).a : new ulp(b2);
        Size size4 = new Size(qyaVar.getWidth(), qyaVar.getHeight());
        if (sfe.m0(qyaVar.getFormat())) {
            jpo.m(rg8Var, "JPEG image must have Exif.");
        }
        return new eo2(qyaVar, rg8Var, qyaVar.getFormat(), size4, rect2, i, matrix2, ulpVar2);
    }

    public final b k() {
        return qqb.a(Boolean.FALSE);
    }

    public final void onFailure(v84 v84Var, IOException iOException) {
        byte b2 = this.a;
    }

    public final void onResponse(v84 v84Var, pzh pzhVar) {
        switch (this.a) {
            case 21:
                pzhVar.close();
                break;
            default:
                vtp.v(pzhVar, null);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(zum r8, nt5 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.du9
            if (r0 == 0) goto L13
            r0 = r9
            du9 r0 = (defpackage.du9) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            du9 r0 = new du9
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r7 = r0.u
            px5 r9 = px5.a
            int r1 = r0.w
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L36
            if (r1 == r3) goto L30
            if (r1 != r2) goto L2a
            zum r8 = r0.t
            goto L36
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r4
        L30:
            zum r8 = r0.t
            defpackage.ybh.y(r7)     // Catch: defpackage.ooa -> L44
            return r7
        L36:
            defpackage.ybh.y(r7)
        L39:
            r0.t = r8     // Catch: defpackage.ooa -> L44
            r0.w = r3     // Catch: defpackage.ooa -> L44
            java.lang.Object r7 = r8.invoke(r0)     // Catch: defpackage.ooa -> L44
            if (r7 == r9) goto L98
            return r7
        L44:
            r7 = move-exception
            r1 = 409(0x199, float:5.73E-43)
            int r5 = r7.a
            if (r5 != r1) goto L7f
            ji1 r1 = r7.c
            if (r1 == 0) goto L52
            java.lang.String r5 = r1.b
            goto L53
        L52:
            r5 = r4
        L53:
            java.lang.String r6 = "crypto_token_claim_gas_fee_pending"
            boolean r5 = kotlin.jvm.internal.Intrinsics.a(r5, r6)
            if (r5 == 0) goto L7f
            kotlinx.serialization.json.c r1 = r1.c
            if (r1 == 0) goto L7f
            java.lang.String r5 = "retryAfterSeconds"
            java.lang.Object r1 = r1.get(r5)
            kotlinx.serialization.json.b r1 = (kotlinx.serialization.json.b) r1
            if (r1 == 0) goto L7f
            kotlinx.serialization.json.d r1 = qqb.i(r1)
            long r5 = qqb.j(r1)     // Catch: oqb -> L76
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            goto L80
        L76:
            r7 = move-exception
            java.lang.NumberFormatException r8 = new java.lang.NumberFormatException
            java.lang.String r7 = r7.a
            r8.<init>(r7)
            throw r8
        L7f:
            r1 = r4
        L80:
            if (r1 == 0) goto L99
            long r5 = r1.longValue()
            on7 r7 = pn7.b
            un7 r7 = un7.e
            long r5 = defpackage.cs5.y0(r5, r7)
            r0.t = r8
            r0.w = r2
            java.lang.Object r7 = defpackage.nb6.q(r5, r0)
            if (r7 != r9) goto L39
        L98:
            return r9
        L99:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j06.r(zum, nt5):java.lang.Object");
    }

    public final String toString() {
        switch (this.a) {
            case 28:
                return sko.l("CreationExtras.Key@", Integer.toString(hashCode(), CharsKt.checkRadix(16)), "<", uqh.a(Bundle.class).c(), ">");
            default:
                return super.toString();
        }
    }

    public final no7 x(Context context) {
        return new dj9(context, 17, "fyi");
    }
}
