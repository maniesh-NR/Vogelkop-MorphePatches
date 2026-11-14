package defpackage;

/* loaded from: classes.dex */
public final class sk3 implements cn8 {
    public final /* synthetic */ byte a;
    public final bmj b;

    public sk3(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new bmj(35152, 2, "image/png");
                break;
            default:
                this.b = new bmj(16973, 2, "image/bmp");
                break;
        }
    }

    private final void e() {
    }

    private final void f() {
    }

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        byte b = this.a;
        bmj bmjVar = this.b;
        switch (b) {
        }
        return bmjVar.a(dn8Var);
    }

    @Override // defpackage.cn8
    public final int b(dn8 dn8Var, hp2 hp2Var) {
        byte b = this.a;
        bmj bmjVar = this.b;
        switch (b) {
        }
        return bmjVar.b(dn8Var, hp2Var);
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        byte b = this.a;
        bmj bmjVar = this.b;
        switch (b) {
            case 0:
                bmjVar.d(en8Var);
                break;
            default:
                bmjVar.d(en8Var);
                break;
        }
    }

    @Override // defpackage.cn8
    public final void release() {
        byte b = this.a;
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        byte b = this.a;
        bmj bmjVar = this.b;
        switch (b) {
            case 0:
                bmjVar.seek(j, j2);
                break;
            default:
                bmjVar.seek(j, j2);
                break;
        }
    }
}
