package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class tdj {
    public final udj a;
    public final km4 b;
    public final Context c;
    public final String d;
    public final zyk e;
    public final LinkedHashSet f;

    public tdj(Context context, String str, Set set, udj udjVar, km4 km4Var) {
        s4f s4fVar = new s4f(context, str, (byte) 22);
        this.a = udjVar;
        this.b = km4Var;
        this.c = context;
        this.d = str;
        this.e = z4c.b(s4fVar);
        this.f = set == wdj.a ? null : CollectionsKt.m0(set);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r5, nt5 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.sdj
            if (r0 == 0) goto L13
            r0 = r6
            sdj r0 = (defpackage.sdj) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            sdj r0 = new sdj
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.ybh.y(r6)
            goto L3c
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.ybh.y(r6)
            r0.v = r3
            udj r6 = r4.a
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L3c
            return r1
        L3c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 != 0) goto L47
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L47:
            r5 = 0
            java.util.LinkedHashSet r6 = r4.f
            zyk r4 = r4.e
            if (r6 != 0) goto L5f
            java.lang.Object r4 = r4.getValue()
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.util.Map r4 = r4.getAll()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L82
            goto L83
        L5f:
            java.lang.Object r4 = r4.getValue()
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L82
            java.util.Iterator r6 = r6.iterator()
        L6f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L6f
            goto L83
        L82:
            r3 = r5
        L83:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tdj.a(java.lang.Object, nt5):java.lang.Object");
    }
}
