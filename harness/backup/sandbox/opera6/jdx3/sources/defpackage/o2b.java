package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lo2b;", "Llj;", "<init>", "()V", "s9i", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o2b extends lj {
    public ViewGroup r;
    public s9i s;
    public final zyk t;
    public int u;

    /* JADX WARN: Illegal instructions before constructor call */
    public o2b() {
        u7k u7kVarF = u7k.f(fki.a);
        u7kVarF.s(2132019306);
        super((itl) u7kVarF.a);
        this.t = z4c.b(new t2(this, (byte) 25));
    }

    public final void G0(LayoutInflater layoutInflater, boolean z) throws Resources.NotFoundException {
        s9i s9iVar;
        ViewGroup viewGroup = this.r;
        if (viewGroup == null) {
            viewGroup = null;
        }
        viewGroup.removeAllViews();
        ViewGroup viewGroup2 = this.r;
        int i = 2131363951;
        final byte b = 0;
        if (z) {
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131558935, viewGroup2, false);
            viewGroup2.addView(constraintLayoutInflate);
            OperaListItem operaListItem = (OperaListItem) w1h.j(2131362170, constraintLayoutInflate);
            if (operaListItem == null) {
                i = 2131362170;
            } else if (((LinearLayout) w1h.j(2131362414, constraintLayoutInflate)) == null) {
                i = 2131362414;
            } else if (((ImageView) w1h.j(2131363183, constraintLayoutInflate)) != null) {
                MaterialButton materialButtonJ = w1h.j(2131363193, constraintLayoutInflate);
                if (materialButtonJ == null) {
                    i = 2131363193;
                } else if (w1h.j(2131363370, constraintLayoutInflate) != null) {
                    OperaListItem operaListItem2 = (OperaListItem) w1h.j(2131363864, constraintLayoutInflate);
                    if (operaListItem2 != null) {
                        TextView textView = (TextView) w1h.j(2131363951, constraintLayoutInflate);
                        if (textView != null) {
                            s9iVar = new s9i(operaListItem, operaListItem2, materialButtonJ, textView, (byte) 18, false);
                        }
                    } else {
                        i = 2131363864;
                    }
                } else {
                    i = 2131363370;
                }
            } else {
                i = 2131363183;
            }
            t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
            return;
        }
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        ConstraintLayout constraintLayoutInflate2 = layoutInflater.inflate(2131558934, viewGroup2, false);
        viewGroup2.addView(constraintLayoutInflate2);
        OperaListItem operaListItem3 = (OperaListItem) w1h.j(2131362170, constraintLayoutInflate2);
        if (operaListItem3 == null) {
            i = 2131362170;
        } else if (((LinearLayout) w1h.j(2131362414, constraintLayoutInflate2)) == null) {
            i = 2131362414;
        } else if (((ImageView) w1h.j(2131363183, constraintLayoutInflate2)) != null) {
            MaterialButton materialButtonJ2 = w1h.j(2131363193, constraintLayoutInflate2);
            if (materialButtonJ2 == null) {
                i = 2131363193;
            } else if (w1h.j(2131363370, constraintLayoutInflate2) != null) {
                OperaListItem operaListItem4 = (OperaListItem) w1h.j(2131363864, constraintLayoutInflate2);
                if (operaListItem4 != null) {
                    TextView textView2 = (TextView) w1h.j(2131363951, constraintLayoutInflate2);
                    if (textView2 != null) {
                        s9iVar = new s9i(operaListItem3, operaListItem4, materialButtonJ2, textView2, (byte) 18, false);
                    }
                } else {
                    i = 2131363864;
                }
            } else {
                i = 2131363370;
            }
        } else {
            i = 2131363183;
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(i)));
        return;
        this.s = s9iVar;
        byte b2 = 4;
        SpannableString spannableStringD = n1h.d(getString(2132019309), new owj[]{new owj("<ps>", "</ps>", new jng(2, requireContext(), new rl((byte) 4)))});
        s9i s9iVar2 = this.s;
        if (s9iVar2 == null) {
            s9iVar2 = null;
        }
        phj.u0((TextView) s9iVar2.e, spannableStringD);
        n3b n3bVar = (n3b) ((q2b) this.t.getValue()).c.g();
        s9i s9iVar3 = this.s;
        if (s9iVar3 == null) {
            s9iVar3 = null;
        }
        ((OperaListItem) s9iVar3.b).setChecked(n3bVar.a);
        ((OperaListItem) s9iVar3.c).setChecked(n3bVar.b);
        ((MaterialButton) s9iVar3.d).setEnabled(n3bVar.c);
        s9i s9iVar4 = this.s;
        ((OperaListItem) (s9iVar4 == null ? null : s9iVar4).b).u = new vlf(this) { // from class: n2b
            public final /* synthetic */ o2b b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem5, boolean z2) {
                byte b3 = b;
                boolean z3 = true;
                o2b o2bVar = this.b;
                switch (b3) {
                    case 0:
                        q2b q2bVar = (q2b) o2bVar.t.getValue();
                        boolean z4 = ((n3b) q2bVar.c.g()).b;
                        pde pdeVar = q2bVar.c;
                        if (!z2 && !z4) {
                            z3 = false;
                        }
                        pdeVar.r(new n3b(z2, z4, z3));
                        break;
                    default:
                        q2b q2bVar2 = (q2b) o2bVar.t.getValue();
                        boolean z5 = ((n3b) q2bVar2.c.g()).a;
                        pde pdeVar2 = q2bVar2.c;
                        if (!z5 && !z2) {
                            z3 = false;
                        }
                        pdeVar2.r(new n3b(z5, z2, z3));
                        break;
                }
            }
        };
        final byte b3 = 1;
        ((OperaListItem) (s9iVar4 == null ? null : s9iVar4).c).u = new vlf(this) { // from class: n2b
            public final /* synthetic */ o2b b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem5, boolean z2) {
                byte b32 = b3;
                boolean z3 = true;
                o2b o2bVar = this.b;
                switch (b32) {
                    case 0:
                        q2b q2bVar = (q2b) o2bVar.t.getValue();
                        boolean z4 = ((n3b) q2bVar.c.g()).b;
                        pde pdeVar = q2bVar.c;
                        if (!z2 && !z4) {
                            z3 = false;
                        }
                        pdeVar.r(new n3b(z2, z4, z3));
                        break;
                    default:
                        q2b q2bVar2 = (q2b) o2bVar.t.getValue();
                        boolean z5 = ((n3b) q2bVar2.c.g()).a;
                        pde pdeVar2 = q2bVar2.c;
                        if (!z5 && !z2) {
                            z3 = false;
                        }
                        pdeVar2.r(new n3b(z5, z2, z3));
                        break;
                }
            }
        };
        ((MaterialButton) (s9iVar4 != null ? s9iVar4 : null).d).setOnClickListener(new sma(this, b2));
    }

    @Override // defpackage.ltl
    public final void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        super.onConfigurationChanged(configuration);
        int i = this.u;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.u = i2;
            G0(getLayoutInflater(), this.u == 1);
        }
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) throws Resources.NotFoundException {
        this.r = viewGroup;
        int i = getResources().getConfiguration().orientation;
        this.u = i;
        byte b = 1;
        G0(layoutInflater, i == 1);
        xf8.i0(((q2b) this.t.getValue()).c, getViewLifecycleOwner(), viewGroup, (List) null, new iwa(this, b));
    }
}
