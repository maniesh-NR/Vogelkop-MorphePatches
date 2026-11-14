package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class wf7 implements Runnable {
    public boolean a;
    public long b;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final /* synthetic */ igi e;

    public wf7(igi igiVar) {
        this.e = igiVar;
    }

    public final void a(re7 re7Var, boolean z) {
        if (re7Var.p()) {
            if (z) {
                this.d.add(re7Var);
            } else {
                this.c.add(re7Var);
            }
            if (this.a) {
                return;
            }
            this.a = true;
            vml.d(this, (int) Math.max(0L, 1000 - (System.currentTimeMillis() - this.b)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf7.run():void");
    }
}
