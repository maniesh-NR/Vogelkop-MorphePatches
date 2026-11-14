package defpackage;

/* loaded from: classes.dex */
public final class pni implements cwa {
    public final cwa a;
    public final Object b = new Object();
    public boolean c;
    public dwa d;

    public pni(cwa cwaVar) {
        this.a = cwaVar;
    }

    @Override // defpackage.cwa
    public final void a(long j, dwa dwaVar) {
        synchronized (this.b) {
            this.c = true;
            this.d = dwaVar;
        }
        cwa cwaVar = this.a;
        if (cwaVar != null) {
            cwaVar.a(j, new r9g(this, (byte) 27));
        } else {
            c();
        }
    }

    public final void b() {
        cwa cwaVar;
        synchronized (this.b) {
            if (this.c && (cwaVar = this.a) != null) {
                cwaVar.clear();
            }
            this.c = false;
        }
    }

    public final void c() {
        synchronized (this.b) {
            dwa dwaVar = this.d;
            if (dwaVar != null) {
                dwaVar.d();
            }
            this.d = null;
        }
    }

    @Override // defpackage.cwa
    public final void clear() {
        b();
    }
}
