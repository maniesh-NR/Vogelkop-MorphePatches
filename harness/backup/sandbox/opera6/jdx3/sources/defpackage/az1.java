package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class az1 extends nt5 {
    public final /* synthetic */ dz1 A;
    public int B;
    public String t;
    public File u;
    public String v;
    public esd w;
    public boolean x;
    public long y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az1(dz1 dz1Var, nt5 nt5Var) {
        super(nt5Var);
        this.A = dz1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.c(null, null, null, this);
    }
}
