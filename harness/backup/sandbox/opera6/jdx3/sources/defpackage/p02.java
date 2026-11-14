package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class p02 implements Function1 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ wth b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ p02(Function1 function1, wth wthVar, long j, ArrayList arrayList, int i, int i2) {
        this.a = function1;
        this.b = wthVar;
        this.c = j;
        this.d = arrayList;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r19) throws org.json.JSONException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            tw7 r1 = (defpackage.tw7) r1
            boolean r2 = r1 instanceof defpackage.rw7
            r3 = 0
            kotlin.jvm.functions.Function1 r5 = r0.a
            if (r2 == 0) goto L18
            rw7 r1 = (defpackage.rw7) r1
            java.lang.Object r0 = r1.a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r5.invoke(r3)
            goto Lae
        L18:
            boolean r2 = r1 instanceof defpackage.sw7
            if (r2 == 0) goto Lb1
            sw7 r1 = (defpackage.sw7) r1
            java.lang.Object r1 = r1.a
            tfb r1 = (defpackage.tfb) r1
            if (r1 == 0) goto L80
            boolean r2 = r1 instanceof defpackage.qgb
            if (r2 == 0) goto L31
            qgb r1 = (defpackage.qgb) r1
            java.lang.String r0 = r1.b
            r5.invoke(r0)
            goto Lae
        L31:
            boolean r2 = r1 instanceof defpackage.pfb
            if (r2 == 0) goto L80
            pfb r1 = (defpackage.pfb) r1     // Catch: org.json.JSONException -> L80
            java.lang.String r1 = r1.b     // Catch: org.json.JSONException -> L80
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L80
            r2.<init>(r1)     // Catch: org.json.JSONException -> L80
            java.lang.String r1 = "type"
            java.lang.Object r1 = r2.get(r1)     // Catch: org.json.JSONException -> L80
            java.lang.Object r1 = defpackage.orb.u(r1)     // Catch: org.json.JSONException -> L80
            if (r1 == 0) goto L78
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: org.json.JSONException -> L80
            java.lang.String r4 = "user-chat-item"
            boolean r1 = r1.equals(r4)     // Catch: org.json.JSONException -> L80
            if (r1 == 0) goto L80
            java.lang.String r1 = "data"
            org.json.JSONObject r1 = r2.getJSONObject(r1)     // Catch: org.json.JSONException -> L80
            java.lang.String r2 = "message"
            java.lang.Object r1 = r1.get(r2)     // Catch: org.json.JSONException -> L80
            java.lang.Object r1 = defpackage.orb.u(r1)     // Catch: org.json.JSONException -> L80
            if (r1 == 0) goto L70
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: org.json.JSONException -> L80
            r5.invoke(r1)     // Catch: org.json.JSONException -> L80
            goto Lae
        L70:
            org.json.JSONException r1 = new org.json.JSONException     // Catch: org.json.JSONException -> L80
            java.lang.String r2 = "message is null"
            r1.<init>(r2)     // Catch: org.json.JSONException -> L80
            throw r1     // Catch: org.json.JSONException -> L80
        L78:
            org.json.JSONException r1 = new org.json.JSONException     // Catch: org.json.JSONException -> L80
            java.lang.String r2 = "type is null"
            r1.<init>(r2)     // Catch: org.json.JSONException -> L80
            throw r1     // Catch: org.json.JSONException -> L80
        L80:
            int r1 = r0.e
            int r11 = r0.f
            int r10 = r1 + r11
            if (r10 < 0) goto Lab
            java.util.ArrayList r9 = r0.d
            int r1 = r9.size()
            if (r10 >= r1) goto Lab
            java.lang.Object r1 = r9.get(r10)
            java.lang.Number r1 = (java.lang.Number) r1
            long r15 = r1.longValue()
            p02 r17 = new p02
            wth r6 = r0.b
            long r7 = r0.c
            r4 = r17
            r4.<init>(r5, r6, r7, r9, r10, r11)
            r12 = r6
            r13 = r7
            r12.z(r13, r15, r17)
            goto Lae
        Lab:
            r5.invoke(r3)
        Lae:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        Lb1:
            h9o.p()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p02.invoke(java.lang.Object):java.lang.Object");
    }
}
