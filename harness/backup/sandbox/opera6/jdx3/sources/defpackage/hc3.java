package defpackage;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class hc3 implements neb {
    public final tn a;
    public n61 b;
    public nc3 c;
    public boolean d = false;
    public boolean e = true;

    public hc3(tn tnVar) {
        this.a = tnVar;
    }

    public final void close() {
        k();
    }

    public final void h(k8e k8eVar) {
        k();
    }

    public final void k() {
        if (this.e) {
            tn tnVar = this.a;
            HashSet hashSet = (HashSet) tnVar.c;
            hashSet.remove(this);
            if (hashSet.isEmpty()) {
                pc3 pc3Var = (pc3) tnVar.b;
                pc3Var.getClass();
                boolean zF = i8.h.f("BatteryStatusManagerBroadcastReceiverInBackground");
                boolean z = pc3Var.e;
                if (zF) {
                    if (z) {
                        pc3.f.r(new oc3(pc3Var, (byte) 1));
                        pc3Var.e = false;
                    }
                } else if (z) {
                    t8.a.unregisterReceiver(pc3Var.c);
                    pc3Var.e = false;
                }
                tnVar.a = false;
            }
            this.e = false;
        }
    }
}
