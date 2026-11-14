package defpackage;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class jpd extends Handler {
    public boolean a;
    public boolean b;
    public final /* synthetic */ npd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpd(npd npdVar, Looper looper) {
        super(looper);
        this.c = npdVar;
        this.a = true;
        this.b = true;
    }

    public final void a(boolean z, boolean z2) {
        boolean z3 = false;
        this.a = this.a && z;
        if (this.b && z2) {
            z3 = true;
        }
        this.b = z3;
        if (hasMessages(1)) {
            return;
        }
        sendEmptyMessage(1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        nod nodVar;
        int iJ;
        mod modVar;
        npd npdVar = this.c;
        xqd xqdVar = npdVar.g;
        if (message.what != 1) {
            odf.h(message.what, "Invalid message what=");
            return;
        }
        ijg ijgVarL = npdVar.s.l(npdVar.t.x0(), npdVar.t.v0(), npdVar.s.k);
        npdVar.s = ijgVarL;
        boolean z = this.a;
        boolean z2 = this.b;
        ijg ijgVarR0 = xqdVar.R0(ijgVarL);
        vzk vzkVar = xqdVar.b;
        h1b h1bVarH = vzkVar.H();
        for (int i = 0; i < h1bVarH.size(); i++) {
            nod nodVar2 = (nod) h1bVarH.get(i);
            try {
                m59 m59VarO = vzkVar.O(nodVar2);
                if (m59VarO != null) {
                    iJ = m59VarO.j();
                } else if (!npdVar.g(nodVar2)) {
                    break;
                } else {
                    iJ = 0;
                }
                ijg ijgVarN = vzkVar.N(nodVar2);
                if (ijgVarN == null) {
                    vzkVar.M(nodVar2);
                    cig cigVarV = z5i.V(vzkVar.G(nodVar2), npdVar.t.P());
                    try {
                        modVar = nodVar2.d;
                        modVar.getClass();
                        nodVar = nodVar2;
                    } catch (DeadObjectException unused) {
                        nodVar = nodVar2;
                    } catch (RemoteException e) {
                        e = e;
                        nodVar = nodVar2;
                    }
                    try {
                        modVar.l(iJ, ijgVarN == null ? ijgVarR0 : ijgVarN, cigVarV, z, z2);
                    } catch (DeadObjectException unused2) {
                        xqdVar.b.Z(nodVar);
                    } catch (RemoteException e2) {
                        e = e2;
                        w7d.L("Exception in " + nodVar, e);
                    }
                }
            } catch (DeadObjectException unused3) {
                nodVar = nodVar2;
            } catch (RemoteException e3) {
                e = e3;
                nodVar = nodVar2;
            }
        }
        this.a = true;
        this.b = true;
    }
}
