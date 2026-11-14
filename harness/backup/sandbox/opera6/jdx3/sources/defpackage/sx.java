package defpackage;

/* loaded from: classes.dex */
public final class sx implements zy {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ sx(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.zy
    public final boolean a(yz yzVar) {
        switch (this.a) {
            case 0:
                ((ux) this.b).l = null;
                vml.c(new c4(this, (byte) 12));
                return false;
            case 1:
                zy zyVar = (zy) this.b;
                if (zyVar == null) {
                    return false;
                }
                boolean zA = zyVar.a(yzVar);
                this.b = null;
                return zA;
            default:
                ((gtg) this.b).a = false;
                return false;
        }
    }

    @Override // defpackage.zy
    public final void onFailed(String str) {
        switch (this.a) {
            case 0:
                ux uxVar = (ux) this.b;
                uxVar.l = str;
                uxVar.k = (byte) 0;
                break;
            case 1:
                zy zyVar = (zy) this.b;
                if (zyVar != null) {
                    zyVar.onFailed(str);
                    this.b = null;
                    break;
                }
                break;
            default:
                ((gtg) this.b).a = false;
                break;
        }
    }
}
