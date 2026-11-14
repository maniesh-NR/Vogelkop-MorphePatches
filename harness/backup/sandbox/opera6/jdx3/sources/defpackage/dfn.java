package defpackage;

import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class dfn implements as6 {
    public static final List g;
    public final ru9 a;
    public final z77 b;
    public final x5f c;
    public final kze d;
    public final qt3 e;
    public final x53 f;

    static {
        on7 on7Var = pn7.b;
        pn7 pn7Var = new pn7(cs5.x0(24, un7.g));
        un7 un7Var = un7.h;
        g = Arrays.asList(pn7Var, new pn7(cs5.x0(3, un7Var)), new pn7(cs5.x0(7, un7Var)));
    }

    public dfn(ndc ndcVar, ru9 ru9Var, z77 z77Var, x5f x5fVar, kze kzeVar, qt3 qt3Var) {
        this.a = ru9Var;
        this.b = z77Var;
        this.c = x5fVar;
        this.d = kzeVar;
        this.e = qt3Var;
        x53 x53Var = new x53(this);
        this.f = x53Var;
        ndcVar.getLifecycle().a(this);
        ru9Var.a(x53Var);
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        this.a.d(this.f);
        ndcVar.getLifecycle().b(this);
    }

    @Override // defpackage.as6
    public final void onStart(ndc ndcVar) {
        int i = ((wvg) this.d.g()).e;
        if (i == 4 || i == 5 || i == 6) {
            return;
        }
        SharedPreferences sharedPreferences = this.a.a;
        if (sharedPreferences.getBoolean("vpn_pro.kill_switch.on", false)) {
            long j = sharedPreferences.getLong("vpn_pro.kill_switch.activated_timestamp", -1L);
            if (j != -1) {
                int i2 = sharedPreferences.getInt("vpn_pro.reminder.show_count", 0);
                List list = g;
                if (i2 >= list.size() || System.currentTimeMillis() - j < pn7.f(((pn7) list.get(i2)).a)) {
                    return;
                }
                int i3 = 0;
                int i4 = 0;
                Class<dfn> cls = dfn.class;
                cfn cfnVar = new cfn(i4, this, cls, "onClosed", "onClosed()V", i3, (byte) 0);
                cfn cfnVar2 = new cfn(i4, this, cls, "onDismissed", "onDismissed()V", i3, (byte) 1);
                pf5 pf5Var = new pf5(new cfn(i4, this, cls, "onConfirm", "onConfirm()V", i3, (byte) 2), cfnVar, cfnVar2, 2132021722, 2132021721, 2132020043, new cfn(i4, this, cls, "onShown", "onShown()V", i3, (byte) 3));
                z77 z77Var = this.b;
                z77Var.getClass();
                z77Var.b(pf5Var, ijm.b);
            }
        }
    }
}
