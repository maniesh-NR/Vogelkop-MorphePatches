package defpackage;

/* loaded from: classes.dex */
public final class jwj implements oza {
    public final g29 a;
    public final x7d b;
    public final Object c = new Object();
    public boolean d;
    public v04 e;

    public jwj(v04 v04Var, g29 g29Var, x7d x7dVar) {
        this.a = g29Var;
        this.b = x7dVar;
        this.e = v04Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            this.d = true;
            v04 v04Var = this.e;
            if (v04Var != null) {
                try {
                    v04Var.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // defpackage.oza
    public final g29 getFileSystem() {
        return this.a;
    }

    @Override // defpackage.oza
    public final x7d getMetadata() {
        return this.b;
    }

    @Override // defpackage.oza
    public final w6g n1() {
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // defpackage.oza
    public final v04 source() {
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("closed");
            }
            v04 v04Var = this.e;
            if (v04Var != null) {
                return v04Var;
            }
            tlh tlhVar = new tlh(this.a.source((w6g) null));
            this.e = tlhVar;
            return tlhVar;
        }
    }
}
