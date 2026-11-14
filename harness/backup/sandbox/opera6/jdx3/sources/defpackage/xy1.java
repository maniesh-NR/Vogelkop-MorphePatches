package defpackage;

import java.io.File;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public final class xy1 extends nt5 {
    public final /* synthetic */ dz1 A;
    public int B;
    public String t;
    public File u;
    public esd v;
    public bfj w;
    public RealCall x;
    public long y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy1(dz1 dz1Var, nt5 nt5Var) {
        super(nt5Var);
        this.A = dz1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(null, null, 0L, null, null, this);
    }
}
