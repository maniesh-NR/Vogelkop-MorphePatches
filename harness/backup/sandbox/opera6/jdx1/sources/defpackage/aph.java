package defpackage;

/* loaded from: classes.dex */
public final class aph implements vq5 {
    public final /* synthetic */ byte a = 1;
    public final String b;
    public final ed1 c;
    public final boolean d;
    public final kd1 e;
    public final Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public aph(String str, ed1 ed1Var, ed1 ed1Var2, id1 id1Var, boolean z) {
        this.b = str;
        this.c = ed1Var;
        this.e = ed1Var2;
        this.f = id1Var;
        this.d = z;
    }

    public aph(String str, kd1 kd1Var, dd1 dd1Var, ed1 ed1Var, boolean z) {
        this.b = str;
        this.e = kd1Var;
        this.f = dd1Var;
        this.c = ed1Var;
        this.d = z;
    }

    @Override // defpackage.vq5
    public final wp5 a(f3d f3dVar, p2d p2dVar, c73 c73Var) {
        switch (this.a) {
            case 0:
                return new zoh(f3dVar, c73Var, this);
            default:
                return new tuh(f3dVar, c73Var, this);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "RectangleShape{position=" + this.e + ", size=" + ((dd1) this.f) + '}';
            default:
                return super.toString();
        }
    }
}
