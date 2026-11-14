package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes.dex */
public abstract class rab {
    public static final qab a = qab.a;

    public static final Bitmap a(Context context, String str) throws PackageManager.NameNotFoundException {
        try {
            Drawable applicationIcon = context.getPackageManager().getApplicationIcon(e(str));
            if (applicationIcon instanceof BitmapDrawable) {
                return ((BitmapDrawable) applicationIcon).getBitmap();
            }
            int iK = new ixh(24.0f).k(context);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iK, iK, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            applicationIcon.setBounds(0, 0, iK, iK);
            applicationIcon.draw(canvas);
            return bitmapCreateBitmap;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static HashSet b(PackageManager packageManager, String str, String str2, qab qabVar) throws PackageManager.NameNotFoundException, IOException {
        String strEncodeToString;
        SigningInfo signingInfo;
        PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
        Signature[] apkContentsSigners = (packageInfo == null || (signingInfo = packageInfo.signingInfo) == null) ? null : signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
        if (apkContentsSigners == null) {
            apkContentsSigners = new Signature[0];
        }
        ArrayList arrayList = new ArrayList();
        for (Signature signature : apkContentsSigners) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(signature.toByteArray());
                try {
                    byte[] bArrDigest = MessageDigest.getInstance(str2).digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(byteArrayInputStream)).getEncoded());
                    int iOrdinal = qabVar.ordinal();
                    if (iOrdinal == 0) {
                        strEncodeToString = Base64.encodeToString(bArrDigest, 10);
                    } else if (iOrdinal == 1) {
                        strEncodeToString = e82.w(bArrDigest, ":", new q9a((byte) 28), 30);
                    } else {
                        if (iOrdinal != 2) {
                            throw new oye();
                        }
                        strEncodeToString = e82.w(bArrDigest, "", new q9a((byte) 29), 30);
                    }
                    byteArrayInputStream.close();
                } finally {
                }
            } catch (Exception e) {
                e.getMessage();
                strEncodeToString = null;
            }
            if (strEncodeToString != null) {
                arrayList.add(strEncodeToString);
            }
        }
        return CollectionsKt.i0(arrayList);
    }

    public static final String c(PackageManager packageManager, String str) {
        String str2 = (String) CollectionsKt.L(b(packageManager, str, "SHA-512", a));
        String strW = str2 != null ? p3p.w("android://", str2, "@", str) : null;
        return strW == null ? "" : strW;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(android.content.pm.PackageManager r8, java.lang.String r9, java.util.Set r10, defpackage.qab r11) {
        /*
            boolean r0 = r10.isEmpty()
            r1 = 0
            if (r0 != 0) goto L63
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r0 = kotlin.collections.CollectionsKt.J(r10)
            java.lang.String r0 = (java.lang.String) r0
            int r2 = r11.ordinal()
            r3 = 1
            java.lang.String r4 = "SHA-256"
            java.lang.String r5 = "SHA-512"
            r6 = 0
            if (r2 == 0) goto L3e
            if (r2 == r3) goto L31
            r7 = 2
            if (r2 != r7) goto L2d
            int r0 = r0.length()
            r2 = 64
            if (r0 == r2) goto L4d
            r2 = 128(0x80, float:1.8E-43)
            if (r0 == r2) goto L4c
            goto L4a
        L2d:
            h9o.p()
            return r1
        L31:
            int r0 = r0.length()
            r2 = 95
            if (r0 == r2) goto L4d
            r2 = 191(0xbf, float:2.68E-43)
            if (r0 == r2) goto L4c
            goto L4a
        L3e:
            int r0 = r0.length()
            r2 = 88
            if (r0 == r2) goto L4d
            r2 = 172(0xac, float:2.41E-43)
            if (r0 == r2) goto L4c
        L4a:
            r4 = r6
            goto L4d
        L4c:
            r4 = r5
        L4d:
            if (r4 == 0) goto L63
            int r0 = r4.length()
            if (r0 == 0) goto L63
            java.util.HashSet r8 = b(r8, r9, r4, r11)
            java.util.LinkedHashSet r8 = kotlin.collections.CollectionsKt.N(r10, r8)
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r3
            return r8
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rab.d(android.content.pm.PackageManager, java.lang.String, java.util.Set, qab):boolean");
    }

    public static final String e(String str) {
        return c.q(str, "android", false) ? (String) CollectionsKt.Q(StringsKt.Y(str, new String[]{"@"}, 0, 6)) : str;
    }
}
