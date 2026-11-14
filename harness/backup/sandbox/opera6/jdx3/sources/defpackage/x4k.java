package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x4k extends gph implements e8n {
    public final wt3 a;
    public ow8 b;
    public boolean c = true;
    public boolean d;
    public final /* synthetic */ c5k e;

    public x4k(c5k c5kVar, wt3 wt3Var) {
        this.e = c5kVar;
        this.a = wt3Var;
        c5kVar.B.addOnPageChangeListener(this);
    }

    public final void b() {
        j();
    }

    public final void j() {
        c5k c5kVar;
        xw8 xw8VarB;
        if (!this.c || (xw8VarB = (c5kVar = this.e).b()) == null) {
            return;
        }
        ow8 ow8Var = xw8VarB.h;
        if (this.d && ((lue) c5kVar.k.getVisibility().g()).d()) {
            ArrayList arrayList = ow8Var.a;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i = -1;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                ja2 ja2Var = (ja2) obj;
                if ((ja2Var instanceof j82) || (ja2Var instanceof mq)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                ow8 ow8Var2 = this.b;
                if (ow8Var2 != ow8Var) {
                    if (ow8Var2 != null) {
                        ow8Var2.unregisterAdapterDataObserver(this);
                    }
                    this.b = ow8Var;
                    ow8Var.registerAdapterDataObserver(this);
                    return;
                }
                return;
            }
            wjh wjhVar = (wjh) this.a.get();
            o59 o59Var = (o59) wjhVar.f;
            if (o59Var != null && o59Var.j <= -1) {
                o59Var.j = SystemClock.uptimeMillis() - ((o59) wjhVar.f).b;
                wjhVar.p();
            }
            ow8 ow8Var3 = this.b;
            if (ow8Var3 != null) {
                ow8Var3.unregisterAdapterDataObserver(this);
                this.b = null;
            }
            if (this.c) {
                vml.c(new mni(this, (byte) 22));
                this.c = false;
            }
        }
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
        j();
    }

    public final void onPageSelected(int i) {
        j();
    }
}
