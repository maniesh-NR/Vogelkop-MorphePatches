package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* loaded from: classes.dex */
public final class iic implements lud, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public itd c;
    public ExpandedMenuView d;
    public kud e;
    public hic f;

    public iic(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    @Override // defpackage.lud
    public final boolean b(akk akkVar) {
        boolean zHasVisibleItems = akkVar.hasVisibleItems();
        Context context = akkVar.a;
        if (!zHasVisibleItems) {
            return false;
        }
        ktd ktdVar = new ktd();
        ktdVar.a = akkVar;
        az0 az0Var = new az0(context);
        iic iicVar = new iic(az0Var.getContext());
        ktdVar.c = iicVar;
        iicVar.e = ktdVar;
        akkVar.b(iicVar, context);
        iic iicVar2 = ktdVar.c;
        hic hicVar = iicVar2.f;
        if (hicVar == null) {
            hicVar = new hic(iicVar2);
            iicVar2.f = hicVar;
        }
        wy0 wy0Var = az0Var.a;
        wy0Var.o = hicVar;
        wy0Var.p = ktdVar;
        View view = akkVar.p;
        if (view != null) {
            wy0Var.e = view;
        } else {
            wy0Var.c = akkVar.o;
            az0Var.setTitle(akkVar.n);
        }
        wy0Var.n = ktdVar;
        bz0 bz0VarCreate = az0Var.create();
        ktdVar.b = bz0VarCreate;
        bz0VarCreate.setOnDismissListener(ktdVar);
        WindowManager.LayoutParams attributes = ktdVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        ktdVar.b.show();
        kud kudVar = this.e;
        if (kudVar == null) {
            return true;
        }
        kudVar.p(akkVar);
        return true;
    }

    @Override // defpackage.lud
    public final boolean c(ptd ptdVar) {
        return false;
    }

    @Override // defpackage.lud
    public final void d(kud kudVar) {
        throw null;
    }

    @Override // defpackage.lud
    public final void e() {
        hic hicVar = this.f;
        if (hicVar != null) {
            hicVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.lud
    public final void f(itd itdVar, boolean z) {
        kud kudVar = this.e;
        if (kudVar != null) {
            kudVar.f(itdVar, z);
        }
    }

    @Override // defpackage.lud
    public final boolean g() {
        return false;
    }

    @Override // defpackage.lud
    public final boolean h(ptd ptdVar) {
        return false;
    }

    @Override // defpackage.lud
    public final void i(Context context, itd itdVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = itdVar;
        hic hicVar = this.f;
        if (hicVar != null) {
            hicVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.f.getItem(i), this, 0);
    }
}
