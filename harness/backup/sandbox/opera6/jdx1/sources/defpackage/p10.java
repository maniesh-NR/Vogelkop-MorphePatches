package defpackage;

/* loaded from: classes.dex */
public abstract class p10 {
    public final /* synthetic */ byte a;
    public final int b;
    public final int c;

    public /* synthetic */ p10(int i, int i2, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p10(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (byte) 2);
        this.a = (byte) 2;
    }

    public void a(r05 r05Var, kw1 kw1Var, lqj lqjVar, j1c j1cVar, drf drfVar) {
        lqjVar.a(r05Var.x(0));
    }

    public qt9 b(r05 r05Var) {
        return null;
    }

    public boolean c() {
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                String strC = uqh.a(getClass()).c();
                return strC == null ? "" : strC;
            default:
                return super.toString();
        }
    }
}
