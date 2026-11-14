package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.opera.android.custom_views.StylingImageView;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class z3m extends o73 {
    public final Context j;
    public final crk k;
    public final jjg l;
    public final f0c m;
    public final k4m n;
    public Callback o;
    public szb p;
    public boolean q;

    public z3m(Context context, crk crkVar, jjg jjgVar, f0c f0cVar, k4m k4mVar) {
        this.j = context;
        this.k = crkVar;
        this.l = jjgVar;
        this.m = f0cVar;
        this.n = k4mVar;
    }

    @Override // defpackage.o73
    public final void m(r9i r9iVar, View view) {
        Context context = this.j;
        ArrayList arrayListJ = nb6.J(sfe.M0(v3m.c(context), new qw8(this, (byte) 5)));
        Collections.sort(arrayListJ, new omj((byte) 15));
        final byte b = 0;
        ArrayList arrayListJ2 = nb6.J(new zlb(arrayListJ, new f15(this, (byte) 6), (byte) 0));
        ((o66) r9iVar.d).m = 17;
        ((o66) r9iVar.d).v = fan.a(224.0f, view.getResources());
        m66 m66Var = (m66) r9iVar.c;
        if (this.q) {
            int size = arrayListJ2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListJ2.get(i);
                i++;
                final y3m y3mVar = (y3m) obj;
                ptd ptdVarA = m66Var.a(0, 0, 0, "");
                ptdVarA.d(q(y3mVar, this.k.test(y3mVar.a)));
                ptdVarA.p = new MenuItem.OnMenuItemClickListener(this) { // from class: w3m
                    public final /* synthetic */ z3m b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        byte b2 = b;
                        y3m y3mVar2 = y3mVar;
                        z3m z3mVar = this.b;
                        switch (b2) {
                            case 0:
                                Callback callback = z3mVar.o;
                                if (callback != null) {
                                    callback.run(y3mVar2.a);
                                    break;
                                }
                                break;
                            default:
                                Callback callback2 = z3mVar.o;
                                if (callback2 != null) {
                                    callback2.run(y3mVar2.a);
                                    break;
                                }
                                break;
                        }
                        return true;
                    }
                };
            }
            ptd ptdVarA2 = m66Var.a(0, 0, 0, "");
            ptdVarA2.setEnabled(false);
            ptdVarA2.setActionView(2131558670);
        }
        int size2 = arrayListJ.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayListJ.get(i2);
            i2++;
            final y3m y3mVar2 = (y3m) obj2;
            ptd ptdVarA3 = m66Var.a(0, 0, 0, "");
            final byte b2 = 1;
            ptdVarA3.d(q(y3mVar2, !this.q && y3mVar2.a.equals(this.p)));
            ptdVarA3.p = new MenuItem.OnMenuItemClickListener(this) { // from class: w3m
                public final /* synthetic */ z3m b;

                {
                    this.b = this;
                }

                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    byte b22 = b2;
                    y3m y3mVar22 = y3mVar2;
                    z3m z3mVar = this.b;
                    switch (b22) {
                        case 0:
                            Callback callback = z3mVar.o;
                            if (callback != null) {
                                callback.run(y3mVar22.a);
                                break;
                            }
                            break;
                        default:
                            Callback callback2 = z3mVar.o;
                            if (callback2 != null) {
                                callback2.run(y3mVar22.a);
                                break;
                            }
                            break;
                    }
                    return true;
                }
            };
        }
        if (this.q || this.p != null) {
            return;
        }
        ptd ptdVarA4 = m66Var.a(0, 0, 0, "");
        ptdVarA4.setEnabled(false);
        ptdVarA4.setActionView(2131558670);
        ptd ptdVarA5 = m66Var.a(0, 0, 0, "");
        View viewInflate = LayoutInflater.from(context).inflate(2131559055, (ViewGroup) null, false);
        TextView textView = (TextView) w1h.j(2131363525, viewInflate);
        if (textView == null) {
            t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131363525)));
            return;
        }
        phj.Z(textView);
        textView.setText(n1h.d(this.m.a.a(2132022081), new owj[]{new owj("<link>", "</link>", new x3m(textView.getContext()))}));
        ptdVarA5.d((LinearLayout) viewInflate);
        ptdVarA5.p = new axe(this, (byte) 5);
    }

    @Override // defpackage.o73
    public final void n(r9i r9iVar) {
        if (this.q || this.p != null) {
            return;
        }
        l56 l56Var = ((o66) r9iVar.d).f;
        ListView listView = l56Var == null ? null : ((ListPopupWindow) l56Var).c;
        if (listView == null) {
            return;
        }
        listView.setSelection(listView.getAdapter().getCount() - 1);
    }

    @Override // defpackage.dog
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return true;
    }

    public final LinearLayout q(y3m y3mVar, boolean z) {
        ov0 ov0VarE = ov0.e(LayoutInflater.from(this.j).inflate(2131559056, (ViewGroup) null, false));
        ((TextView) ov0VarE.d).setText(y3mVar.b);
        ((StylingImageView) ov0VarE.c).setVisibility(z ? 0 : 4);
        return (LinearLayout) ov0VarE.b;
    }
}
