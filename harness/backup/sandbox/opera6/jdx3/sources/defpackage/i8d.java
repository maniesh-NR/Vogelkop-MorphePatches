package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Li8d;", "Lk24;", "<init>", "()V", "Lv8d;", "uiState", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i8d extends k24 {
    public final zyk f = z4c.b(new t2(this, 27));

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    @Override // defpackage.k24
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View n0(android.view.LayoutInflater r5, android.view.ViewGroup r6) {
        /*
            r4 = this;
            android.os.Bundle r5 = r4.getArguments()
            r6 = 0
            if (r5 == 0) goto L42
            java.lang.String r0 = "compose_highlight_target_key"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L42
            int r1 = r5.getInt(r0)
            java.lang.String r2 = "compose_highlight_scroll_behavior"
            java.lang.String r3 = r5.getString(r2)
            r5.remove(r0)
            r5.remove(r2)
            if (r3 == 0) goto L3a
            p0i r5 = t0i.b     // Catch: java.lang.Throwable -> L28
            cg5 r5 = defpackage.cg5.valueOf(r3)     // Catch: java.lang.Throwable -> L28
            goto L31
        L28:
            r5 = move-exception
            p0i r0 = t0i.b
            q0i r0 = new q0i
            r0.<init>(r5)
            r5 = r0
        L31:
            boolean r0 = r5 instanceof q0i
            if (r0 != 0) goto L36
            r6 = r5
        L36:
            cg5 r6 = (defpackage.cg5) r6
            if (r6 != 0) goto L3c
        L3a:
            cg5 r6 = defpackage.cg5.a
        L3c:
            dg5 r5 = new dg5
            r5.<init>(r1, r6)
            r6 = r5
        L42:
            rn9 r5 = new rn9
            r0 = 12
            r5.<init>(r4, r0)
            r5.d = r6
            r6 = 1
            r5.b = r6
            a7b r0 = new a7b
            r1 = 9
            r0.<init>(r4, r1)
            ue5 r4 = new ue5
            r1 = 682621171(0x28aff8f3, float:1.9536867E-14)
            r4.<init>(r1, r0, r6)
            ch5 r4 = r5.j(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8d.n0(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public final a9d o0() {
        return (a9d) this.f.getValue();
    }

    public final void onStart() {
        super.onStart();
        o0().f();
    }
}
