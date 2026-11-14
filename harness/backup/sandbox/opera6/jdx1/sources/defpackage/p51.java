package defpackage;

import android.view.DragEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class p51 implements View.OnDragListener {
    public final rh7 a;
    public final t72 b;
    public final o51 c;

    public p51() {
        rh7 rh7Var = new rh7();
        rh7Var.q = 0L;
        this.a = rh7Var;
        this.b = new t72(0);
        this.c = new o51(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        d06 d06Var = new d06(dragEvent);
        int action = dragEvent.getAction();
        t72 t72Var = this.b;
        rh7 rh7Var = this.a;
        switch (action) {
            case 1:
                lqh lqhVar = new lqh();
                ph7 ph7Var = new ph7(d06Var, rh7Var, lqhVar);
                if (ph7Var.invoke(rh7Var) == t5m.a) {
                    zch.E(rh7Var, ph7Var);
                }
                boolean z = lqhVar.a;
                m72 m72Var = new m72(t72Var);
                while (m72Var.hasNext()) {
                    ((rh7) m72Var.next()).X0();
                }
                break;
            case 2:
                rh7Var.W0(d06Var);
                break;
            case 4:
                wg5 wg5Var = new wg5(d06Var, (byte) 22);
                if (wg5Var.invoke(rh7Var) == t5m.a) {
                    zch.E(rh7Var, wg5Var);
                }
                t72Var.clear();
                break;
            case 5:
                rh7Var.U0();
                break;
            case 6:
                rh7Var.V0();
                break;
        }
        return false;
    }
}
