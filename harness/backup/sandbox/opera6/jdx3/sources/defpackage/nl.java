package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class nl implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sl b;

    public /* synthetic */ nl(sl slVar, byte b) {
        this.a = b;
        this.b = slVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        sl slVar = this.b;
        orb orbVar = (orb) obj;
        switch (b) {
            case 0:
                slVar.c(orbVar);
                break;
            default:
                slVar.c(orbVar);
                slVar.q();
                break;
        }
    }
}
