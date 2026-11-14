package defpackage;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class dwl extends a4h {
    public final TopicsManager b;

    public dwl(TopicsManager topicsManager) {
        this.b = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object x(defpackage.dwl r4, defpackage.hx9 r5, mt5<? super defpackage.ix9> r6) {
        /*
            boolean r0 = r6 instanceof defpackage.cwl
            if (r0 == 0) goto L13
            r0 = r6
            cwl r0 = (defpackage.cwl) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            cwl r0 = new cwl
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            dwl r4 = r0.t
            defpackage.ybh.y(r6)
            goto L5e
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.ybh.y(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.v(r5)
            r0.t = r4
            r0.w = r3
            nh4 r6 = new nh4
            mt5 r0 = hib.b(r0)
            r6.<init>(r3, r0)
            r6.s()
            android.adservices.topics.TopicsManager r0 = r4.b
            bx1 r2 = new bx1
            r3 = 2
            r2.<init>(r3)
            pt5 r3 = new pt5
            r3.<init>(r6)
            r0.getTopics(r5, r2, r3)
            java.lang.Object r6 = r6.q()
            if (r6 != r1) goto L5e
            return r1
        L5e:
            android.adservices.topics.GetTopicsResponse r6 = (android.adservices.topics.GetTopicsResponse) r6
            ix9 r4 = r4.w(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwl.x(dwl, hx9, mt5):java.lang.Object");
    }

    @Override // defpackage.a4h
    public Object h(@NotNull hx9 hx9Var, @NotNull mt5<? super ix9> mt5Var) {
        return x(this, hx9Var, mt5Var);
    }

    public GetTopicsRequest v(hx9 hx9Var) {
        return g8.d(hx9Var);
    }

    public ix9 w(GetTopicsResponse getTopicsResponse) {
        return kg1.a(getTopicsResponse);
    }
}
