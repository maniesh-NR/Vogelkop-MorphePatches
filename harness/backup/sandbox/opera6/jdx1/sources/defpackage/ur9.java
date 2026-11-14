package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public final /* synthetic */ class ur9 implements m94, ed2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ListenableFuture b;

    public /* synthetic */ ur9(ListenableFuture listenableFuture, byte b) {
        this.a = b;
        this.b = listenableFuture;
    }

    @Override // defpackage.ed2
    public final ListenableFuture apply(Object obj) {
        byte b = this.a;
        ListenableFuture listenableFuture = this.b;
        switch (b) {
            case 1:
                return ((xb4) listenableFuture.get()).a();
            default:
                return ((xb4) listenableFuture.get()).b();
        }
    }

    @Override // defpackage.m94
    public final Object attachCompleter(l94 l94Var) {
        n97 n97VarA = n97.a();
        ListenableFuture listenableFuture = this.b;
        k1g.Z(false, listenableFuture, l94Var, n97VarA);
        return "nonCancellationPropagating[" + listenableFuture + "]";
    }
}
