package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class lz9 extends yee {
    @Override // defpackage.yee
    public final yee C(Function1 function1, Function1 function12) {
        return (yee) ((ttj) ytj.b(new ra(new m91((Object) function1, (Object) function12, (byte) 6), (byte) 15)));
    }

    @Override // defpackage.yee, defpackage.ttj
    public final void c() {
        synchronized (ytj.c) {
            o();
        }
    }

    @Override // defpackage.yee, defpackage.ttj
    public final void k() {
        gyg.Y();
        throw null;
    }

    @Override // defpackage.yee, defpackage.ttj
    public final void l() {
        gyg.Y();
        throw null;
    }

    @Override // defpackage.yee, defpackage.ttj
    public final void m() {
        ytj.c();
    }

    @Override // defpackage.yee, defpackage.ttj
    public final ttj u(Function1 function1) {
        return (qlh) ((ttj) ytj.b(new ra(new kz9(function1, (byte) 0), (byte) 15)));
    }

    @Override // defpackage.yee
    public final zwg w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
