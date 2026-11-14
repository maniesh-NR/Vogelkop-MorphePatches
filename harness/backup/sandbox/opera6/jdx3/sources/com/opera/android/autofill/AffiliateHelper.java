package com.opera.android.autofill;

import J.N;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import androidx.annotation.NonNull;
import defpackage.nml;
import defpackage.umi;
import defpackage.vml;
import defpackage.x40;
import defpackage.xj;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class AffiliateHelper {
    public static final x40 a = new x40(null, "");

    public static GURL a(Drawable drawable) {
        Bitmap bitmapX = z5i.x(drawable, 64, 64);
        if (bitmapX == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmapX.compress(Bitmap.CompressFormat.WEBP, 50, byteArrayOutputStream);
            byteArrayOutputStream.flush();
            return new GURL("data:image/webp;base64," + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
        } catch (IOException unused) {
            return null;
        }
    }

    public static void lookup(final long j, final long j2, @NonNull String str, @NonNull String str2) {
        umi umiVar = vml.d;
        nml nmlVarE = umiVar.e(new xj(str, str2, (byte) 5));
        nmlVarE.b(umiVar.f(new n5o() { // from class: w40
            public final Object g(Object obj) {
                x40 x40Var = (x40) obj;
                N.M3HME06W(j, j2, x40Var.a, x40Var.b);
                return null;
            }
        }));
        nmlVarE.a(null);
    }
}
