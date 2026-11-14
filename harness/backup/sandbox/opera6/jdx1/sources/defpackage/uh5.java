package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class uh5 implements n1j {
    public final n1j a;
    public final h1b b;

    public uh5(n1j n1jVar, List list) {
        this.a = n1jVar;
        this.b = h1b.s(list);
    }

    @Override // defpackage.n1j
    public final boolean g(gtc gtcVar) {
        return this.a.g(gtcVar);
    }

    @Override // defpackage.n1j
    public final long getBufferedPositionUs() {
        return this.a.getBufferedPositionUs();
    }

    @Override // defpackage.n1j
    public final long getNextLoadPositionUs() {
        return this.a.getNextLoadPositionUs();
    }

    @Override // defpackage.n1j
    public final boolean isLoading() {
        return this.a.isLoading();
    }

    @Override // defpackage.n1j
    public final void reevaluateBuffer(long j) {
        this.a.reevaluateBuffer(j);
    }
}
