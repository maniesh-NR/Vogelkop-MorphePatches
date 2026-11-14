package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class y2p extends voo {
    public final zyk A;
    public final zyk B;
    public final zyk C;
    public final zyk D;
    public final zyk E;
    public final zyk F;
    public final c4p z;

    public y2p(pro proVar, String str, String str2, String str3, String str4, gzo gzoVar, oho ohoVar, c4p c4pVar) {
        super(null, ohoVar, proVar, str, str2, str3, str4, gzoVar);
        this.z = c4pVar;
        this.A = z4c.b(new c2p(this, (byte) 2));
        this.B = z4c.b(new c2p(this, (byte) 1));
        this.C = z4c.b(new c2p(this, (byte) 0));
        this.D = z4c.b(new c2p(this, (byte) 4));
        this.E = z4c.b(new c2p(this, (byte) 3));
        this.F = z4c.b(new m53(this, ohoVar, (byte) 28));
    }

    @Override // defpackage.voo
    public final List b() {
        return (List) this.C.getValue();
    }

    @Override // defpackage.voo
    public final List c() {
        return (List) this.B.getValue();
    }

    @Override // defpackage.voo
    public final List d() {
        return (List) this.A.getValue();
    }
}
