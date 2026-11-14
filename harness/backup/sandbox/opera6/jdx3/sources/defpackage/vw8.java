package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class vw8 extends oph implements p5j {
    public boolean a;
    public boolean b;
    public final /* synthetic */ xw8 c;

    public vw8(xw8 xw8Var) {
        this.c = xw8Var;
        a();
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("speed_dial.enabled".equals(str)) {
            a();
        }
    }

    public final void a() {
        xw8 xw8Var = this.c;
        boolean z = xw8Var.D;
        RecyclerView recyclerView = xw8Var.g;
        SettingsManager settingsManager = xw8Var.r;
        boolean z2 = z && xw8Var.C && !settingsManager.i("speed_dial.enabled") && settingsManager.i("enable_newsfeed");
        if (z2 == this.a) {
            return;
        }
        this.a = z2;
        if (!z2) {
            settingsManager.H(this);
            recyclerView.t0(this);
        } else {
            settingsManager.F(this);
            recyclerView.o(this);
            i iVarM = recyclerView.M(0);
            this.b = (iVarM == null || iVarM.itemView.getTop() != 0) ? recyclerView.canScrollVertically(-1) : false;
        }
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            i iVarM = recyclerView.M(0);
            boolean zCanScrollVertically = (iVarM == null || iVarM.itemView.getTop() != 0) ? recyclerView.canScrollVertically(-1) : false;
            if (!this.b && zCanScrollVertically) {
                this.c.q.a();
            }
            this.b = zCanScrollVertically;
        }
    }
}
