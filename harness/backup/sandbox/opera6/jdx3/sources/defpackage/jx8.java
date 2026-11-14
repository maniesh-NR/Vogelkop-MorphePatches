package defpackage;

import android.os.SystemClock;
import androidx.media3.ui.PlayerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class jx8 implements eig {
    public final dg7 a;
    public final x5f b;
    public long c = -1;
    public int d;
    public boolean e;

    public jx8(dg7 dg7Var, x5f x5fVar) {
        this.a = dg7Var;
        this.b = x5fVar;
    }

    public final void F(rhg rhgVar) {
    }

    public final void K(gql gqlVar, int i) {
    }

    public final void M(thg thgVar) {
    }

    public final void d(boolean z) {
        hf0 hf0Var;
        boolean z2 = this.c != -1;
        if (z2 == z) {
            return;
        }
        PlayerView playerView = ((kx8) this.a.b).s;
        if (playerView != null) {
            playerView.setKeepScreenOn(z);
        }
        if (z2) {
            long jUptimeMillis = SystemClock.uptimeMillis() - this.c;
            x5f x5fVar = this.b;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                uc0 uc0VarA = x56VarF.A(zpaVar);
                List list = (List) uc0VarA.n(4);
                if (list == null || list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    uc0VarA.q(4, -1, arrayList);
                    hf0Var = new hf0(uc0VarA, 4, arrayList);
                } else {
                    hf0Var = new hf0(uc0VarA, 4, list);
                }
                hf0Var.add(Long.valueOf(jUptimeMillis));
                x5fVar.U0(x56VarF);
            }
        }
        this.c = z ? SystemClock.uptimeMillis() : -1L;
    }

    public final void h(int i) {
        if (this.d == i) {
            return;
        }
        this.d = i;
        d(i == 3 && this.e);
    }

    public final void onRepeatModeChanged(int i) {
    }

    public final void onShuffleModeEnabledChanged(boolean z) {
    }

    public final void z(int i, boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        d(this.d == 3 && z);
    }
}
