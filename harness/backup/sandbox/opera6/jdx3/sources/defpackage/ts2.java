package defpackage;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.browser.chromium.ChromiumContent;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ts2 implements qu2 {
    public final ChromiumContent a;
    public final int b;
    public final iz9 c;
    public final i7f d = new i7f();
    public final zyk e = z4c.b(new oc2(this, 3));
    public final ss2 f = new ss2(this);
    public ArrayList g;

    public ts2(ChromiumContent chromiumContent, int i, iz9 iz9Var) {
        this.a = chromiumContent;
        this.b = i;
        this.c = iz9Var;
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.d.b((pu2) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.d.c((pu2) obj);
    }

    @Override // defpackage.qu2
    public final void d() {
        this.g = null;
        zyk zykVar = this.e;
        bt2 bt2Var = (bt2) zykVar.getValue();
        if (bt2Var != null) {
            bt2Var.g.c(this.f);
        }
        bt2 bt2Var2 = (bt2) zykVar.getValue();
        if (bt2Var2 != null) {
            bt2Var2.b.postDelayed(bt2Var2.i, 100L);
        }
    }

    @Override // defpackage.qu2
    public final void show() {
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            zyk zykVar = this.e;
            bt2 bt2Var = (bt2) zykVar.getValue();
            if (bt2Var != null) {
                bt2Var.g.b(this.f);
            }
            final bt2 bt2Var2 = (bt2) zykVar.getValue();
            if (bt2Var2 != null) {
                ViewGroup viewGroup = bt2Var2.b;
                viewGroup.removeCallbacks(bt2Var2.i);
                hp2 hp2Var = bt2Var2.e;
                hp2Var.getClass();
                hp2Var.b = SystemClock.elapsedRealtime();
                ov0 ov0Var = bt2Var2.h;
                if (ov0Var == null) {
                    View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131558531, viewGroup, false);
                    viewGroup.addView(viewInflate);
                    int i = 2131362708;
                    ImageView imageView = (ImageView) w1h.j(2131362708, viewInflate);
                    if (imageView != null) {
                        i = 2131364032;
                        RecyclerView recyclerViewJ = w1h.j(2131364032, viewInflate);
                        if (recyclerViewJ != null) {
                            ov0 ov0Var2 = new ov0(viewInflate, (Object) imageView, (Object) recyclerViewJ, (byte) 4);
                            ou1 ou1Var = new ou1((byte) 2, 0);
                            int iA = fan.a(4.0f, viewGroup.getResources());
                            if (iA != ou1Var.b) {
                                ou1Var.b = iA;
                            }
                            recyclerViewJ.m(ou1Var);
                            recyclerViewJ.n(new at2());
                            bt2Var2.h = ov0Var2;
                            ov0Var = ov0Var2;
                        }
                    }
                    t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                    return;
                }
                ImageView imageView2 = (ImageView) ov0Var.c;
                RecyclerView recyclerView = (RecyclerView) ov0Var.d;
                ChromiumContent chromiumContent = this.a;
                final int i2 = this.b;
                ws2 ws2Var = new ws2(bt2Var2, chromiumContent, i2);
                ws2Var.K(arrayList);
                recyclerView.y0(ws2Var);
                final iz9 iz9Var = this.c;
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: vs2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        bt2 bt2Var3 = bt2Var2;
                        if (bt2Var3.e.a()) {
                            return;
                        }
                        j14.a0(i2, bt2Var3.a, iz9Var);
                    }
                });
                imageView2.setImageDrawable(((LinearLayout) ov0Var.b).getContext().getDrawable(i2 != 1 ? i2 != 3 ? i2 != 5 ? 2131231649 : 2131232172 : 2131232177 : 2131232127));
                nak nakVar = bt2Var2.c;
                Boolean bool = Boolean.TRUE;
                nakVar.getClass();
                nakVar.k((Object) null, bool);
            }
        }
    }

    @Override // defpackage.qu2
    public final void w(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ru2 ru2VarG = j14.G((ru2) obj);
            if (ru2VarG != null) {
                arrayList2.add(ru2VarG);
            }
        }
        this.g = arrayList2;
        if (arrayList2.isEmpty()) {
            d();
            return;
        }
        bt2 bt2Var = (bt2) this.e.getValue();
        if (bt2Var != null) {
            ov0 ov0Var = bt2Var.h;
            ws2 ws2Var = (ws2) (ov0Var != null ? ((RecyclerView) ov0Var.d).m : null);
            if (ws2Var != null) {
                ws2Var.K(arrayList2);
            }
        }
    }
}
