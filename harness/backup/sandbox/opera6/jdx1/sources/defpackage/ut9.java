package defpackage;

/* loaded from: classes.dex */
public final class ut9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ut9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                vt9 vt9Var = (vt9) obj;
                vt9Var.A--;
                break;
            default:
                suj sujVar = (suj) obj;
                sujVar.k--;
                break;
        }
    }

    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((vt9) obj).A++;
                break;
            default:
                ((suj) obj).k++;
                break;
        }
    }
}
