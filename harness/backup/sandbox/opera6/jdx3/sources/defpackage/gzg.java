package defpackage;

/* loaded from: classes.dex */
public final class gzg implements tdn {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gzg(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
    }

    private final void b() {
    }

    @Override // defpackage.tdn
    public final void s() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((hzg) obj).g();
                break;
            case 1:
                ((daj) obj).g();
                break;
            case 2:
                ((y4g) obj).R();
                break;
            case 3:
                ((cdn) obj).S();
                break;
            default:
                ken kenVar = (ken) obj;
                ydn ydnVar = kenVar.c;
                if (!ydnVar.c.isEnabled() || ydnVar.d.a) {
                    kenVar.b(hjm.b, 3);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.tdn
    public final void t() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 1:
                break;
            case 2:
                ((y4g) obj).R();
                break;
            case 3:
                ((cdn) obj).S();
                break;
            default:
                ken kenVar = (ken) obj;
                ydn ydnVar = kenVar.c;
                if (!ydnVar.c.isEnabled() || ydnVar.d.a) {
                    kenVar.b(hjm.b, 3);
                    break;
                }
                break;
        }
    }
}
