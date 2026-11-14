package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class kvc implements due {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kvc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.due
    public final void b(cue cueVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((lvc) obj).b(cueVar);
                break;
            default:
                wte wteVar = (wte) obj;
                boolean z = cueVar.a == 2;
                if (wteVar.s != z) {
                    wteVar.s = z;
                    wteVar.b();
                    break;
                }
                break;
        }
    }
}
