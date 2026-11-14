package defpackage;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final /* synthetic */ class axe implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ axe(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    @Override // android.view.MenuItem.OnMenuItemClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onMenuItemClick(android.view.MenuItem r4) throws android.app.PendingIntent.CanceledException {
        /*
            r3 = this;
            byte r0 = r3.a
            r1 = 3
            r2 = 1
            java.lang.Object r3 = r3.b
            switch(r0) {
                case 0: goto L5b;
                case 1: goto L45;
                case 2: goto L3b;
                case 3: goto L25;
                case 4: goto L11;
                default: goto L9;
            }
        L9:
            z3m r3 = (defpackage.z3m) r3
            k4m r3 = r3.n
            r3.run()
            return r2
        L11:
            android.app.RemoteAction r3 = (android.app.RemoteAction) r3
            android.app.PendingIntent r3 = r3.getActionIntent()
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r4 < r0) goto L21
            g8.K(r3)
            goto L24
        L21:
            r3.send()
        L24:
            return r2
        L25:
            com.opera.android.settings.SettingsManager r3 = (com.opera.android.settings.SettingsManager) r3
            int[] r0 = vep.B(r1)
            int r4 = r4.getItemId()
            r4 = r0[r4]
            java.lang.String r0 = "startup_mode"
            int r4 = vep.A(r4)
            r3.V(r4, r0)
            return r2
        L3b:
            blj r3 = (defpackage.blj) r3
            int r4 = r4.getItemId()
            r3.m0(r4)
            return r2
        L45:
            alj r3 = (defpackage.alj) r3
            zkj r3 = r3.i
            java.util.List r0 = r3.c()
            int r4 = r4.getItemId()
            java.lang.Object r4 = r0.get(r4)
            lrf r4 = (defpackage.lrf) r4
            r3.o(r4)
            return r2
        L5b:
            bxe r3 = (defpackage.bxe) r3
            int[] r0 = vep.B(r1)
            int r4 = r4.getItemId()
            r4 = r0[r4]
            int r0 = r3.i
            if (r4 == r0) goto L98
            int r4 = vep.A(r4)
            r0 = 2
            if (r4 == 0) goto L78
            if (r4 == r2) goto L85
            if (r4 != r0) goto L84
            r1 = 4
            goto L85
        L78:
            owe r4 = defpackage.owe.c
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.a
            boolean r4 = r4.get()
            if (r4 == 0) goto L84
            r1 = r2
            goto L85
        L84:
            r1 = r0
        L85:
            androidx.fragment.app.r r3 = r3.getActivity()
            java.lang.String[] r4 = com.opera.android.OperaApplication.K
            android.app.Application r3 = r3.getApplication()
            com.opera.android.OperaApplication r3 = (com.opera.android.OperaApplication) r3
            com.opera.android.settings.SettingsManager r3 = r3.J()
            r3.X(r1)
        L98:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axe.onMenuItemClick(android.view.MenuItem):boolean");
    }
}
