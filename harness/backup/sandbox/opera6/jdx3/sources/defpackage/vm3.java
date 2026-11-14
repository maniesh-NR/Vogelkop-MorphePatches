package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class vm3 extends oph {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public vm3(int i, mrk mrkVar) {
        this.a = (byte) 4;
        this.b = i;
        this.c = mrkVar;
    }

    public /* synthetic */ vm3(cve cveVar, byte b) {
        this.a = b;
        this.c = cveVar;
    }

    public vm3(gn3 gn3Var) {
        this.a = (byte) 0;
        Objects.requireNonNull(gn3Var);
        this.c = gn3Var;
    }

    public vm3(qtj qtjVar) {
        this.a = (byte) 3;
        this.c = qtjVar;
        this.b = false;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                this.b = i == 0;
                ym3 ym3VarB = ((gn3) obj).b();
                if (ym3VarB != null) {
                    recyclerView.saveHierarchyState(ym3VarB.b);
                    break;
                }
                break;
            case 1:
                if (!this.b && i == 0 && !exg.t(recyclerView)) {
                    jve jveVar = (jve) obj;
                    nb8 nb8Var = jveVar.m;
                    if (nb8Var != null) {
                        x5f x5fVar = jveVar.i;
                        String str = nb8Var.i;
                        if (x5fVar.h) {
                            zpa zpaVar = x5fVar.d;
                            x56 x56VarF = zpa.F();
                            new ck0(zpaVar, x56VarF).j(new j5f(str, od0.b, 3));
                            x5fVar.U0(x56VarF);
                        }
                    }
                    this.b = true;
                    break;
                }
                break;
            case 2:
                if (!this.b && i == 0 && !exg.t(recyclerView)) {
                    x5f x5fVar2 = ((kve) obj).h;
                    if (x5fVar2.h) {
                        zpa zpaVar2 = x5fVar2.d;
                        x56 x56VarF2 = zpa.F();
                        x56VarF2.E(zpaVar2).z(zpaVar2).e(7);
                        x5fVar2.U0(x56VarF2);
                    }
                    this.b = true;
                    break;
                }
                break;
            case 3:
                if (i == 0 && this.b) {
                    this.b = false;
                    ((qtj) obj).snapToTargetExistingView();
                    break;
                }
                break;
            default:
                if (!this.b || recyclerView.canScrollVertically(-1) || recyclerView.canScrollVertically(1)) {
                    ((mrk) obj).c.a.t.y().h();
                    break;
                }
                break;
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ym3 ym3VarB;
        switch (this.a) {
            case 0:
                if (this.b && (ym3VarB = ((gn3) this.c).b()) != null) {
                    recyclerView.saveHierarchyState(ym3VarB.b);
                    break;
                }
                break;
            case 3:
                if (i != 0 || i2 != 0) {
                    this.b = true;
                    break;
                }
        }
    }
}
