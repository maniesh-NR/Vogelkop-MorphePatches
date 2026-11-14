package defpackage;

/* loaded from: classes.dex */
public final class mhb implements zy {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;
    public final /* synthetic */ bz d;

    public mhb(i16 i16Var, hhb hhbVar, hhb hhbVar2, bz bzVar) {
        this.b = hhbVar;
        this.c = hhbVar2;
        this.d = bzVar;
    }

    public mhb(yxe yxeVar, zy zyVar, az azVar) {
        this.d = yxeVar;
        this.b = zyVar;
        this.c = azVar;
    }

    @Override // defpackage.zy
    public final boolean a(yz yzVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((hhb) obj).run(yzVar);
                break;
            default:
                yxe yxeVar = (yxe) this.d;
                if (!yxeVar.b.k(yzVar, new vx(this, (byte) 26))) {
                    yxeVar.c++;
                    onFailed("Duplicate");
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    @Override // defpackage.zy
    public final void onFailed(String str) {
        switch (this.a) {
            case 0:
                ((hhb) this.c).run(this.d.b());
                break;
            default:
                ((zy) this.b).onFailed(str);
                break;
        }
    }
}
