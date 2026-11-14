package defpackage;

/* loaded from: classes.dex */
public final class j19 implements oza {
    public final w6g a;
    public final g29 b;
    public final String c;
    public final AutoCloseable d;
    public final Object e = new Object();
    public boolean f;
    public tlh g;

    public j19(w6g w6gVar, g29 g29Var, String str, AutoCloseable autoCloseable) {
        this.a = w6gVar;
        this.b = g29Var;
        this.c = str;
        this.d = autoCloseable;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.e
            monitor-enter(r0)
            r1 = 1
            r2.f = r1     // Catch: java.lang.Throwable -> L1e
            tlh r1 = r2.g     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L10
            r1.close()     // Catch: java.lang.RuntimeException -> Le java.lang.Exception -> L10 java.lang.Throwable -> L1e
            goto L10
        Le:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L1e
        L10:
            java.lang.AutoCloseable r2 = r2.d     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L1c
            java.lang.AutoCloseable r2 = (java.lang.AutoCloseable) r2     // Catch: java.lang.RuntimeException -> L1a java.lang.Exception -> L1c java.lang.Throwable -> L1e
            defpackage.z1m.r(r2)     // Catch: java.lang.RuntimeException -> L1a java.lang.Exception -> L1c java.lang.Throwable -> L1e
            goto L1c
        L1a:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L1e
        L1c:
            monitor-exit(r0)
            return
        L1e:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j19.close():void");
    }

    @Override // defpackage.oza
    public final g29 getFileSystem() {
        return this.b;
    }

    @Override // defpackage.oza
    public final x7d getMetadata() {
        return null;
    }

    @Override // defpackage.oza
    public final w6g n1() {
        w6g w6gVar;
        synchronized (this.e) {
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            w6gVar = this.a;
        }
        return w6gVar;
    }

    @Override // defpackage.oza
    public final v04 source() {
        synchronized (this.e) {
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            tlh tlhVar = this.g;
            if (tlhVar != null) {
                return tlhVar;
            }
            tlh tlhVar2 = new tlh(this.b.source(this.a));
            this.g = tlhVar2;
            return tlhVar2;
        }
    }
}
