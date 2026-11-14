package defpackage;

/* loaded from: classes.dex */
public final class k3k extends dbh {
    public final bqo a;

    public k3k(bqo bqoVar) {
        bqoVar.getClass();
        this.a = bqoVar;
    }

    public final void d() {
        bqo bqoVar = this.a;
        if (bqoVar != null) {
            synchronized (bqoVar.d) {
                bqoVar.c = true;
            }
        }
    }

    public final boolean g() {
        boolean z;
        bqo bqoVar = this.a;
        if (bqoVar == null) {
            return false;
        }
        synchronized (bqoVar.d) {
            z = !bqoVar.c;
        }
        return z;
    }
}
