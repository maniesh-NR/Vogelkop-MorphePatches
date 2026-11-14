package ads_mobile_sdk;

import android.webkit.WebView;
import defpackage.rkp;
import defpackage.tso;
import defpackage.yko;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class o6 implements rkp {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object f;
    public Object g;
    public Object h;

    public o6(ji jiVar, WebView webView, String str, String str2, p6 p6Var) {
        this.c = new ArrayList();
        this.d = new HashMap();
        this.a = jiVar;
        this.b = webView;
        this.h = p6Var;
        this.g = str;
        this.f = str2;
    }

    public o6(sb0 sb0Var) {
        this.a = sb0Var;
    }

    public o6(nx5 nx5Var, nx5 nx5Var2, qr0 qr0Var, oo3 oo3Var, ux2 ux2Var, tso tsoVar, yko ykoVar) {
        this.a = nx5Var;
        this.b = nx5Var2;
        this.c = qr0Var;
        this.d = oo3Var;
        this.f = ux2Var;
        this.g = tsoVar;
        this.h = ykoVar;
    }

    public static o6 a(ji jiVar, WebView webView, String str, String str2) {
        if (jiVar == null) {
            qp2.o("Partner is null");
            return null;
        }
        if (webView == null) {
            qp2.o("WebView is null");
            return null;
        }
        if (str2 == null || str2.length() <= 256) {
            return new o6(jiVar, webView, str, str2, p6.b);
        }
        qp2.o("CustomReferenceData is greater than 256 characters");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9 A[Catch: all -> 0x0132, TryCatch #0 {all -> 0x0132, blocks: (B:14:0x0039, B:51:0x00f3, B:53:0x00f9, B:54:0x010e), top: B:85:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010e A[Catch: all -> 0x0132, TRY_LEAVE, TryCatch #0 {all -> 0x0132, blocks: (B:14:0x0039, B:51:0x00f3, B:53:0x00f9, B:54:0x010e), top: B:85:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0140 A[Catch: all -> 0x0167, TryCatch #3 {all -> 0x0167, blocks: (B:63:0x0139, B:65:0x0140, B:67:0x0147, B:69:0x014b, B:71:0x014f, B:72:0x0150, B:73:0x0155, B:74:0x0156, B:75:0x015d, B:76:0x015e, B:77:0x0165, B:78:0x0166), top: B:90:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0166 A[Catch: all -> 0x0167, TRY_LEAVE, TryCatch #3 {all -> 0x0167, blocks: (B:63:0x0139, B:65:0x0140, B:67:0x0147, B:69:0x014b, B:71:0x014f, B:72:0x0150, B:73:0x0155, B:74:0x0156, B:75:0x015d, B:76:0x015e, B:77:0x0165, B:78:0x0166), top: B:90:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v0, types: [ads_mobile_sdk.a2] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r1v14, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v7, types: [ads_mobile_sdk.rg3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.o6 r17, ads_mobile_sdk.a2 r18, nt5 r19) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.o6.a(ads_mobile_sdk.o6, ads_mobile_sdk.a2, nt5):java.lang.Object");
    }

    public static o6 b(ji jiVar, WebView webView, String str, String str2) {
        if (jiVar == null) {
            qp2.o("Partner is null");
            return null;
        }
        if (webView == null) {
            qp2.o("WebView is null");
            return null;
        }
        if (str2 == null || str2.length() <= 256) {
            return new o6(jiVar, webView, str, str2, p6.c);
        }
        qp2.o("CustomReferenceData is greater than 256 characters");
        return null;
    }

    @Override // defpackage.rkp
    public final Object a() {
        throw null;
    }

    @Override // defpackage.rkp
    public final Object a(defpackage.hp hpVar) {
        throw null;
    }

    @Override // defpackage.rkp
    public final Object a(defpackage.r83 r83Var) {
        throw null;
    }

    @Override // defpackage.rkp
    public final Object a$1() {
        throw null;
    }

    @Override // defpackage.rkp
    public final Object b(boolean z) {
        throw null;
    }
}
