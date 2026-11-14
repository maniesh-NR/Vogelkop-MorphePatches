package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class au2 extends ygc implements jvk {
    public static final cs f = new cs((byte) 2);
    public final wth b;
    public final w4g c;
    public final flb d;
    public final mvk e;

    public au2(Context context, wth wthVar, w4g w4gVar) {
        super(f);
        this.b = wthVar;
        this.c = w4gVar;
        this.d = new flb(new nvk(context, this));
        this.e = nvk.v(2132018535);
    }

    @Override // defpackage.jvk
    public final void h(i iVar, hvk[] hvkVarArr) {
        mvk mvkVar = this.e;
        hvkVarArr[0] = mvkVar;
        hvkVarArr[1] = mvkVar;
    }

    @Override // defpackage.jvk
    public final void k(i iVar, hvk hvkVar) {
        int bindingAdapterPosition = iVar.getBindingAdapterPosition();
        w3g w3gVar = (w3g) ((ygc) this).a.f.get(bindingAdapterPosition);
        gv gvVar = new gv((Object) this, bindingAdapterPosition, (byte) 1);
        eu2 eu2Var = (eu2) this.b.b;
        hu2 hu2VarH0 = eu2Var.H0();
        ua7 ua7Var = eu2Var.w;
        hu2VarH0.b.c(new a27(w3gVar.c), ((gjm) ua7Var.c).a(ua7Var.p().getId()), new ug(new f9((Object) hu2VarH0, (Object) w3gVar, (Object) gvVar, (byte) 10), (byte) 9));
    }

    @Override // defpackage.jvk
    public final boolean n(i iVar) {
        return true;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super/*androidx.recyclerview.widget.d*/.onAttachedToRecyclerView(recyclerView);
        this.d.e(recyclerView);
    }

    public final void onBindViewHolder(i iVar, int i) {
        final zt2 zt2Var = (zt2) iVar;
        final w3g w3gVar = (w3g) ((ygc) this).a.f.get(i);
        zt2Var.getClass();
        zt2Var.f = Integer.valueOf(w3gVar.a);
        zt2Var.g = w3gVar.b.a;
        String str = w3gVar.c;
        zt2Var.h = str;
        new i4g(zt2Var.d, w3gVar, zt2Var.e, zt2Var);
        OperaListItem operaListItem = zt2Var.b.b;
        operaListItem.E(new qxh(str));
        operaListItem.C(new qxh(w3gVar.f));
        final byte b = 0;
        operaListItem.setOnClickListener(new View.OnClickListener() { // from class: yt2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                w3g w3gVar2 = w3gVar;
                zt2 zt2Var2 = zt2Var;
                switch (b2) {
                    case 0:
                        hu2 hu2VarH0 = ((eu2) zt2Var2.c.b).H0();
                        x5g.b(hu2VarH0.e, new wx(hu2VarH0, w3gVar2, (byte) 13));
                        break;
                    default:
                        new xw(w3gVar2, zt2Var2.c, (byte) 2).p(view);
                        break;
                }
            }
        });
        final byte b2 = 1;
        operaListItem.w(new View.OnClickListener() { // from class: yt2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                w3g w3gVar2 = w3gVar;
                zt2 zt2Var2 = zt2Var;
                switch (b22) {
                    case 0:
                        hu2 hu2VarH0 = ((eu2) zt2Var2.c.b).H0();
                        x5g.b(hu2VarH0.e, new wx(hu2VarH0, w3gVar2, (byte) 13));
                        break;
                    default:
                        new xw(w3gVar2, zt2Var2.c, (byte) 2).p(view);
                        break;
                }
            }
        });
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new zt2(viewGroup, this.b, this.c);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super/*androidx.recyclerview.widget.d*/.onDetachedFromRecyclerView(recyclerView);
        this.d.e(null);
    }
}
