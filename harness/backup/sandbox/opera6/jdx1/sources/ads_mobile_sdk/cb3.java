package ads_mobile_sdk;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ce2;
import defpackage.fso;
import defpackage.kap;
import defpackage.yjp;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class cb3 implements yjp {
    public final mm0 a;
    public final mm0 b;
    public final kap c;
    public final th3 d;
    public final ExecutorService e;

    public cb3(mm0 mm0Var, mm0 mm0Var2, kap kapVar, ExecutorService executorService, th3 th3Var) {
        this.a = mm0Var;
        this.b = mm0Var2;
        this.c = kapVar;
        this.d = th3Var;
        this.e = executorService;
    }

    @Override // defpackage.yjp
    public final ListenableFuture a(jl2 jl2Var, byte[] bArr) {
        fl0 fl0Var = fl0.EVENT_ID_ORCAS_STORAGE_UPDATE_PROGRAM_BYTECODE;
        ef9 ef9VarA = this.b.a(bArr);
        this.d.a(fl0Var, ef9VarA);
        return g7.j(ef9.h(ef9VarA), new fso(this, jl2Var, (byte) 1), m97.a);
    }

    @Override // defpackage.yjp
    public final ListenableFuture a(jl2 jl2Var, byte[] bArr, byte[] bArr2) {
        fl0 fl0Var = fl0.EVENT_ID_ORCAS_STORAGE_UPDATE_VM;
        ListenableFuture listenableFutureA = ((mm0) this.c.get()).a(bArr);
        th3 th3Var = this.d;
        th3Var.a(fl0Var, (ef9) listenableFutureA);
        fl0 fl0Var2 = fl0.EVENT_ID_ORCAS_STORAGE_UPDATE_PROGRAM_BYTECODE;
        ListenableFuture listenableFutureA2 = this.b.a(bArr2);
        th3Var.a(fl0Var2, (ef9) listenableFutureA2);
        return g7.j(ef9.h(new a95(h1b.t(new ListenableFuture[]{listenableFutureA, listenableFutureA2}))), new fso(this, jl2Var, (byte) 0), m97.a);
    }

    @Override // defpackage.yjp
    public final m7m a() {
        fl0 fl0Var = fl0.EVENT_ID_ORCAS_STORAGE_GET_METADATA;
        mm0 mm0Var = this.a;
        mm0Var.getClass();
        ef9 ef9VarE = yr9.e(new ce2(mm0Var, (byte) 12), mm0Var.b);
        this.d.a(fl0Var, ef9VarE);
        return ef9VarE;
    }

    @Override // defpackage.yjp
    public final r0b b() {
        return yr9.c(Boolean.TRUE);
    }
}
