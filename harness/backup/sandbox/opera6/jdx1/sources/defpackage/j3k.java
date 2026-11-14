package defpackage;

/* loaded from: classes.dex */
public final class j3k extends dbh {
    public final i3k a;

    public j3k(i3k i3kVar) {
        this.a = i3kVar;
    }

    @Override // defpackage.dbh
    public final void d() {
        i3k i3kVar = this.a;
        synchronized (i3kVar.d) {
            i3kVar.c = true;
        }
    }

    @Override // defpackage.dbh
    public final boolean g() {
        boolean z;
        i3k i3kVar = this.a;
        synchronized (i3kVar.d) {
            z = false;
            if (!i3kVar.c && i3kVar.b) {
                z = true;
            }
        }
        return z;
    }
}
