package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class umh extends dt1 {
    public final pde e;
    public final gnh f;
    public final ikc g;
    public final yqa h;
    public final jvk i;
    public final ro9 j;

    public umh(pde pdeVar, gnh gnhVar, ikc ikcVar, yqa yqaVar, jvk jvkVar, ro9 ro9Var) {
        this.e = pdeVar;
        this.f = gnhVar;
        this.g = ikcVar;
        this.h = yqaVar;
        this.i = jvkVar;
        this.j = ro9Var;
        final byte b = 1;
        setHasStableIds(true);
        final byte b2 = 0;
        J(zmh.class, new yjj(this) { // from class: tmh
            public final /* synthetic */ umh b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x007a A[PHI: r0
              0x007a: PHI (r0v8 int) = (r0v7 int), (r0v9 int) binds: [B:7:0x002d, B:9:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00e9 A[PHI: r2
              0x00e9: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:27:0x00c3, B:29:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00eb A[PHI: r4
              0x00eb: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:23:0x00ae, B:25:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // defpackage.yjj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.recyclerview.widget.i c(android.view.ViewGroup r15) {
                /*
                    Method dump skipped, instructions count: 286
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.tmh.c(android.view.ViewGroup):androidx.recyclerview.widget.i");
            }
        }, new j9h((byte) 5), new a3j((byte) 4));
        J(c85.class, new yjj(this) { // from class: tmh
            public final /* synthetic */ umh b;

            {
                this.b = this;
            }

            @Override // defpackage.yjj
            public final i c(ViewGroup v) {
                /*
                    Method dump skipped, instructions count: 286
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.tmh.c(android.view.ViewGroup):androidx.recyclerview.widget.i");
            }
        }, new j9h((byte) 6), new a3j((byte) 4));
        final byte b3 = 2;
        J(hj8.class, new yjj(this) { // from class: tmh
            public final /* synthetic */ umh b;

            {
                this.b = this;
            }

            @Override // defpackage.yjj
            public final i c(ViewGroup v) {
                /*
                    Method dump skipped, instructions count: 286
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.tmh.c(android.view.ViewGroup):androidx.recyclerview.widget.i");
            }
        }, new j9h((byte) 7), new a3j((byte) 4));
    }

    @Override // defpackage.dt1
    public final long getItemId(int i) {
        return ((smh) ((ArrayList) this.d).get(i)).getId();
    }
}
