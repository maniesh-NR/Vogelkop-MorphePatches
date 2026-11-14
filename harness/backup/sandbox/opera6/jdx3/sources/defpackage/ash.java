package defpackage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public class ash extends n82 {
    public final int k;
    public final String l;
    public final boolean m;

    public ash(Context context, ywh ywhVar, qre qreVar, int i, z05 z05Var, uy8 uy8Var, boolean z) {
        super(context, ywhVar, qreVar, z05Var, uy8Var, i < 0, z);
        this.k = i;
        bre breVar = z05Var.i;
        this.l = breVar != null ? breVar.a : null;
        this.m = z05Var.k;
    }

    @Override // defpackage.n82
    public void Q(Uri.Builder builder) {
        builder.appendQueryParameter("exclude", "summary");
        V(builder);
        int i = this.k;
        if (i < 0) {
            builder.appendQueryParameter("action", "refresh");
        } else {
            builder.appendQueryParameter("action", "load_more");
            builder.appendQueryParameter("load_more_count", Integer.toString(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // defpackage.n82
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List T(d5o r5, java.lang.String r6) {
        /*
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            l45 r2 = r4.g
            r3 = 0
            java.util.ArrayList r0 = r2.R(r5, r3, r0)
            java.lang.Object r1 = r5.a
            java.lang.String r1 = (java.lang.String) r1
            uy8 r2 = r4.f
            r2.b(r0)
            java.lang.Object r5 = r5.b
            java.util.Map r5 = (java.util.Map) r5
            if (r5 == 0) goto L26
            boolean r3 = r5.isEmpty()
            if (r3 != 0) goto L26
            r2.m = r5
            goto L32
        L26:
            java.util.Map r5 = r2.m
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L35
            java.util.Map r5 = java.util.Collections.EMPTY_MAP
            r2.m = r5
        L32:
            r2.n()
        L35:
            int r4 = r4.k
            r5 = 0
            if (r4 >= 0) goto L45
            hy8 r4 = new hy8
            java.lang.String r3 = "refresh"
            r4.<init>(r3, r1, r6, r5)
            r2.c(r4)
            return r0
        L45:
            hy8 r4 = new hy8
            java.lang.String r3 = "load_more"
            r4.<init>(r3, r1, r6, r5)
            r2.c(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ash.T(d5o, java.lang.String):java.util.List");
    }

    public void V(Uri.Builder builder) {
        qre qreVar = this.j;
        yqe yqeVar = qreVar.b;
        yqe yqeVar2 = qreVar.b;
        String str = this.l;
        if (yqeVar == null) {
            builder.appendEncodedPath("v1/news/main");
            if (!this.m || str == null) {
                return;
            }
            builder.appendQueryParameter("ip_city", str);
            return;
        }
        builder.appendEncodedPath("v1/news/category");
        if (yqeVar2 == null || !yqeVar2.a()) {
            builder.appendEncodedPath(yqeVar2.a);
        } else {
            builder.appendEncodedPath(str);
        }
    }
}
