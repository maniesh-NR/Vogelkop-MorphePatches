package defpackage;

import android.net.Uri;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d1a extends h6e {
    public final /* synthetic */ f1a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1a(f1a f1aVar, pqk pqkVar) {
        super(pqkVar, 1);
        this.d = f1aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0097 A[Catch: IllegalArgumentException | JSONException -> 0x00a7, IllegalArgumentException | JSONException -> 0x00a7, TryCatch #0 {IllegalArgumentException | JSONException -> 0x00a7, blocks: (B:11:0x002b, B:13:0x006b, B:16:0x0075, B:16:0x0075, B:19:0x0087, B:19:0x0087, B:21:0x008d, B:21:0x008d, B:25:0x0097, B:25:0x0097, B:26:0x009b, B:26:0x009b), top: B:32:0x002b }] */
    @Override // defpackage.h6e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dri g(defpackage.vpb r13, int r14, boolean r15) throws org.json.JSONException {
        /*
            r12 = this;
            java.lang.String r0 = ""
            org.json.JSONArray r13 = r13.a
            org.json.JSONArray r13 = r13.getJSONArray(r14)
            r14 = 2
            org.json.JSONArray r14 = r13.optJSONArray(r14)
            r1 = 0
            if (r14 != 0) goto L12
            r2 = r1
            goto L17
        L12:
            vpb r2 = new vpb
            r2.<init>(r14)
        L17:
            if (r2 == 0) goto La7
            org.json.JSONArray r14 = r2.a
            int r2 = r14.length()
            r3 = 0
            r4 = r3
        L21:
            if (r4 >= r2) goto La7
            int r5 = r14.optInt(r4, r3)
            r6 = 47
            if (r5 != r6) goto La3
            orb r14 = new orb     // Catch: java.lang.Throwable -> La7
            r2 = 3
            org.json.JSONObject r13 = r13.getJSONObject(r2)     // Catch: java.lang.Throwable -> La7
            r14.<init>(r13)     // Catch: java.lang.Throwable -> La7
            java.lang.String r13 = "c"
            java.lang.String r5 = r14.e(r13)     // Catch: java.lang.Throwable -> La7
            java.lang.String r13 = "h"
            java.lang.String r13 = r14.e(r13)     // Catch: java.lang.Throwable -> La7
            java.lang.String[] r2 = defpackage.aik.a     // Catch: java.lang.Throwable -> La7
            android.text.Spanned r13 = android.text.Html.fromHtml(r13, r3)     // Catch: java.lang.Throwable -> La7
            java.lang.String r6 = r13.toString()     // Catch: java.lang.Throwable -> La7
            java.lang.String r13 = "b"
            java.lang.String r13 = r14.m(r13, r0)     // Catch: java.lang.Throwable -> La7
            android.text.Spanned r13 = android.text.Html.fromHtml(r13, r3)     // Catch: java.lang.Throwable -> La7
            java.lang.String r7 = r13.toString()     // Catch: java.lang.Throwable -> La7
            java.lang.String r13 = "f"
            java.lang.String r11 = r14.m(r13, r0)     // Catch: java.lang.Throwable -> La7
            java.lang.String r13 = "j"
            java.lang.String r13 = r14.m(r13, r0)     // Catch: java.lang.Throwable -> La7
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> La7
            if (r0 != 0) goto L74
            int r13 = android.graphics.Color.parseColor(r13)     // Catch: java.lang.IllegalArgumentException -> L74 java.lang.Throwable -> La7
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.IllegalArgumentException -> L74 java.lang.Throwable -> La7
            goto L75
        L74:
            r13 = r1
        L75:
            java.lang.String r0 = "zp"
            orb r14 = r14.c(r0)     // Catch: java.lang.Throwable -> La7 java.lang.Throwable -> La7
            java.lang.String r8 = r12.h(r5, r14, r15)     // Catch: java.lang.Throwable -> La7 java.lang.Throwable -> La7
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> La7 java.lang.Throwable -> La7
            if (r12 != 0) goto L87
            if (r13 == 0) goto La7
        L87:
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> La7 java.lang.Throwable -> La7
            if (r12 == 0) goto L93
            boolean r12 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> La7 java.lang.Throwable -> La7
            if (r12 != 0) goto La7
        L93:
            if (r8 == 0) goto La7
            if (r13 == 0) goto L9b
            int r3 = r13.intValue()     // Catch: java.lang.Throwable -> La7 java.lang.Throwable -> La7
        L9b:
            r10 = r3
            dri r4 = new dri     // Catch: java.lang.Throwable -> La7 java.lang.Throwable -> La7
            r9 = 1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> La7 java.lang.Throwable -> La7
            return r4
        La3:
            int r4 = r4 + 1
            goto L21
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d1a.g(vpb, int, boolean):dri");
    }

    public final String h(String str, orb orbVar, boolean z) {
        Uri.Builder builderBuildUpon = Uri.parse(this.d.a(5, z ? p6l.b : p6l.a, str)).buildUpon();
        Iterator<String> itKeys = orbVar.a.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            builderBuildUpon.appendQueryParameter(a26.B(next), a26.B(orbVar.e(next)));
        }
        return builderBuildUpon.build().toString();
    }
}
