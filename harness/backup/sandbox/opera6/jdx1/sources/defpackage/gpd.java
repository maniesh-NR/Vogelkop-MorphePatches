package defpackage;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class gpd implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ npd b;

    public /* synthetic */ gpd(npd npdVar, byte b) {
        this.a = b;
        this.b = npdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        npd npdVar = this.b;
        switch (b) {
            case 0:
                lpd lpdVar = npdVar.u;
                if (lpdVar != null) {
                    npdVar.t.g0(lpdVar);
                    return;
                }
                return;
            case 1:
                npdVar.getClass();
                return;
            case 2:
                synchronized (npdVar.a) {
                    if (npdVar.v) {
                        return;
                    }
                    c4j c4jVarV0 = npdVar.t.v0();
                    if (!npdVar.c.hasMessages(1) && z5i.n(c4jVarV0, npdVar.s.c)) {
                        vzk vzkVar = npdVar.g.b;
                        h1b h1bVarH = vzkVar.H();
                        for (int i = 0; i < h1bVarH.size(); i++) {
                            nod nodVar = (nod) h1bVarH.get(i);
                            vzkVar.M(nodVar);
                            npdVar.b(nodVar, new oid(c4jVarV0, vzkVar.T(nodVar, 16), vzkVar.T(nodVar, 17), nodVar));
                        }
                        try {
                            npdVar.h.h.h(0, c4jVarV0, true, true, 0);
                        } catch (RemoteException e) {
                            w7d.r("Exception in using media1 API", e);
                        }
                    }
                    npdVar.s();
                    return;
                }
            default:
                npdVar.s();
                return;
        }
    }
}
