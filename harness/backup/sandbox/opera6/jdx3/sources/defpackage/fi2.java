package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class fi2 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s14 b;

    public /* synthetic */ fi2(s14 s14Var, byte b) {
        this.a = b;
        this.b = s14Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[Catch: JSONException -> 0x004b, TRY_LEAVE, TryCatch #0 {JSONException -> 0x004b, blocks: (B:6:0x0014, B:8:0x0022, B:10:0x0026, B:12:0x002c, B:13:0x0032, B:14:0x0045), top: B:24:0x0014 }] */
    @Override // com.opera.api.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(java.lang.Object r5) {
        /*
            r4 = this;
            byte r0 = r4.a
            r1 = 0
            s14 r4 = r4.b
            switch(r0) {
                case 0: goto L51;
                default: goto L8;
            }
        L8:
            orb r5 = (defpackage.orb) r5
            java.lang.Object r0 = r4.d
            mgh r0 = (mgh) r0
            java.lang.Object r2 = r0.c
            com.opera.api.Callback r2 = (com.opera.api.Callback) r2
            if (r2 == 0) goto L50
            java.lang.String r2 = "2fa_error"
            java.lang.String r3 = "error"
            java.lang.String r3 = r5.e(r3)     // Catch: org.json.JSONException -> L4b
            boolean r2 = r2.equals(r3)     // Catch: org.json.JSONException -> L4b
            if (r2 == 0) goto L45
            boolean r2 = r4.b     // Catch: org.json.JSONException -> L4b
            if (r2 == 0) goto L32
            java.lang.Object r2 = r4.e     // Catch: org.json.JSONException -> L4b
            iyk r2 = (defpackage.iyk) r2     // Catch: org.json.JSONException -> L4b
            if (r2 == 0) goto L45
            r4.e = r1     // Catch: org.json.JSONException -> L4b
            r2.run(r5)     // Catch: org.json.JSONException -> L4b
            goto L50
        L32:
            r1 = 1
            r4.b = r1     // Catch: org.json.JSONException -> L4b
            java.lang.Object r1 = r4.f     // Catch: org.json.JSONException -> L4b
            hi2 r1 = (defpackage.hi2) r1     // Catch: org.json.JSONException -> L4b
            gi2 r1 = r1.b     // Catch: org.json.JSONException -> L4b
            java.lang.String r2 = "url"
            java.lang.String r5 = r5.e(r2)     // Catch: org.json.JSONException -> L4b
            r1.p(r5, r4)     // Catch: org.json.JSONException -> L4b
            goto L50
        L45:
            java.lang.String r4 = "Unexpected 2fa error"
            r0.e(r4)     // Catch: org.json.JSONException -> L4b
            goto L50
        L4b:
            java.lang.String r4 = "Bad json"
            r0.e(r4)
        L50:
            return
        L51:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r4.e
            iyk r0 = (defpackage.iyk) r0
            if (r0 == 0) goto L5e
            r4.e = r1
            r0.run(r1)
        L5e:
            java.lang.Object r4 = r4.c
            com.opera.api.Callback r4 = (com.opera.api.Callback) r4
            r4.run(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi2.run(java.lang.Object):void");
    }
}
