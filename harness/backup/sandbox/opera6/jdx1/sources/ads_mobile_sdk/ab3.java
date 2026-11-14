package ads_mobile_sdk;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.n17;
import defpackage.oko;
import defpackage.pko;
import defpackage.yjp;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class ab3 implements yjp {
    public final yk2 a;
    public final ExecutorService b;
    public final th3 c;

    public ab3(yk2 yk2Var, ExecutorService executorService, th3 th3Var) {
        this.a = yk2Var;
        this.b = executorService;
        this.c = th3Var;
    }

    @Override // defpackage.yjp
    public final ListenableFuture a(jl2 jl2Var, byte[] bArr) {
        fl0 fl0Var = fl0.EVENT_ID_DG_STORAGE_UPDATE_PROGRAM_BYTECODE;
        ef9 ef9VarE = yr9.e(new n17(this, jl2Var, bArr, (byte) 2), this.b);
        this.c.a(fl0Var, ef9VarE);
        return ef9VarE;
    }

    @Override // defpackage.yjp
    public final ListenableFuture a(jl2 jl2Var, byte[] bArr, byte[] bArr2) {
        fl0 fl0Var = fl0.EVENT_ID_DG_STORAGE_UPDATE_VM_AND_PROGRAM_BYTECODE;
        ef9 ef9VarE = yr9.e(new pko(this, jl2Var, bArr, bArr2), this.b);
        this.c.a(fl0Var, ef9VarE);
        return ef9VarE;
    }

    @Override // defpackage.yjp
    public final m7m a() {
        fl0 fl0Var = fl0.EVENT_ID_DG_STORAGE_GET_METADATA;
        ef9 ef9VarE = yr9.e(new oko(this, (byte) 1), this.b);
        this.c.a(fl0Var, ef9VarE);
        return ef9VarE;
    }

    @Override // defpackage.yjp
    public final r0b b() {
        return yr9.c(Boolean.TRUE);
    }
}
