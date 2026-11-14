package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ll2 implements dh4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ll2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onCancel() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ql2) obj).c = false;
                break;
            default:
                z43 z43Var = (z43) obj;
                z43Var.a = true;
                ((gbf) z43Var.i).j.F = true;
                break;
        }
    }
}
