package defpackage;

/* loaded from: classes.dex */
public final class xg5 implements btj {
    public o93 b;
    public mim c;
    public boolean d;
    public final lld a = new lld((byte) 10);
    public final jl4 e = new jl4((Object) this, (byte) 15);

    @Override // defpackage.btj
    public final void I() {
        o93 o93Var = this.b;
        if (o93Var == null) {
            return;
        }
        this.d = true;
        try {
            o93Var.b(hjm.b, 3);
        } finally {
            this.d = false;
        }
    }

    @Override // defpackage.btj
    public final int z(o93 o93Var, mim mimVar) {
        glj gljVar = o93Var instanceof glj ? (glj) o93Var : null;
        if (gljVar == null) {
            return 3;
        }
        this.c = mimVar;
        if (this.b != null) {
            return 2;
        }
        this.b = o93Var;
        o93Var.b = this.e;
        ((t0g) this.a.b).setValue(new aof(gljVar.g(), new wg5(o93Var, (byte) 0)));
        return 1;
    }
}
