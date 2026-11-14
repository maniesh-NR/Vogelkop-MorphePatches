package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class tk implements sni {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.sni
    public final void Y(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wk) obj).H0();
                break;
            case 1:
                ha2 ha2Var = (ha2) obj;
                bmb it = sfe.R((i7f) ha2Var.d.a, bu8.class).iterator();
                while (true) {
                    bmb bmbVar = it;
                    if (!bmbVar.hasNext()) {
                        break;
                    } else {
                        int adapterPosition = ((ab2) bmbVar.next()).getAdapterPosition();
                        if (adapterPosition != -1) {
                            ha2Var.notifyItemChanged(adapterPosition);
                        }
                    }
                }
            case 2:
                ((vcj) obj).Y(z);
                break;
            default:
                ((wyl) obj).H0();
                break;
        }
    }
}
