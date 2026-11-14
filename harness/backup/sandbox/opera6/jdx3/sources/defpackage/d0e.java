package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class d0e extends f0e {
    public final u4l i;
    public final v8a j;
    public final s9i k;
    public yzd l;
    public int m;

    public d0e(sf2 sf2Var, pde pdeVar, u4l u4lVar, pde pdeVar2, v8a v8aVar, yhe yheVar, pde pdeVar3, s9i s9iVar, s2 s2Var) {
        super(sf2Var, pdeVar, pdeVar2, yheVar, pdeVar3);
        this.i = u4lVar;
        this.j = v8aVar;
        this.k = s9iVar;
        ImageView imageView = sf2Var.b;
        lzb lzbVar = new lzb(this, (byte) 14);
        dll dllVarS = q9n.s(imageView);
        if (dllVarS != null) {
            u8n.b(dllVarS, imageView, lzbVar);
        }
        imageView.setOnClickListener(new jf7(this, s2Var, (byte) 23));
        a26.U(v8aVar, this.f, new f85(this, (byte) 2), new q4b(this, (byte) 24));
        final byte b = 0;
        a26.T(pdeVar2, this.f, new f7f(this) { // from class: c0e
            public final /* synthetic */ d0e b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                d0e d0eVar = this.b;
                switch (b2) {
                    case 0:
                        d0eVar.X();
                        break;
                    default:
                        d0eVar.Y();
                        break;
                }
            }
        });
        final byte b2 = 1;
        a26.T((pde) s9iVar.c, this.f, new f7f(this) { // from class: c0e
            public final /* synthetic */ d0e b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                d0e d0eVar = this.b;
                switch (b22) {
                    case 0:
                        d0eVar.X();
                        break;
                    default:
                        d0eVar.Y();
                        break;
                }
            }
        });
    }

    @Override // defpackage.f0e
    public final View V() {
        yzd yzdVar = this.l;
        if (yzdVar == null) {
            return null;
        }
        int i = yzdVar.a;
        RecyclerView recyclerView = ((z5l) this.d.b).f;
        h6n it = new g6n(recyclerView).iterator();
        while (true) {
            h6n h6nVar = it;
            if (!h6nVar.hasNext()) {
                return null;
            }
            View view = (View) h6nVar.next();
            i iVarT = recyclerView.T(view);
            if ((iVarT instanceof h85) && i == ((h85) iVarT).i.b) {
                return view;
            }
        }
    }

    public final void X() {
        Integer numValueOf;
        yzd yzdVar = this.l;
        if (yzdVar != null) {
            sf2 sf2Var = this.b;
            Context context = sf2Var.b.getContext();
            txj txjVar = ((eyj) this.c.g()).l;
            if (txjVar == null) {
                return;
            }
            cyj cyjVar = txjVar.g;
            yzd yzdVar2 = this.l;
            if (yzdVar2 == null) {
                numValueOf = 0;
            } else {
                u8a u8aVar = (u8a) this.j.g.get(Integer.valueOf(yzdVar2.a));
                numValueOf = u8aVar != null ? Integer.valueOf(u8aVar.b) : null;
            }
            if (numValueOf != null) {
                this.m = numValueOf.intValue();
            }
            y7h y7hVar = cyjVar.b;
            pxj pxjVar = cyjVar.h;
            c9i c9iVar = new c9i(y7hVar.l(context), txjVar.h.a(context));
            ArrayList arrayList = new ArrayList();
            int i = pxjVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new c9i(cyjVar.c.l(context), txjVar.i.a(context)));
            }
            k4a k4aVar = new k4a();
            int iK = pxjVar.b.k(context);
            if (iK != k4aVar.a) {
                k4aVar.a = iK;
                k4aVar.a();
            }
            k4aVar.d(arrayList);
            k4l k4lVarB = this.i.a(yzdVar.a).b();
            w3a w3aVar = new w3a(j14.D(txjVar.k.k(context), k4lVarB.a.a(context)), 17, false);
            String str = String.format(Locale.getDefault(), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.m)}, 1));
            if (str.length() > 2) {
                str = "…";
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{w3aVar, new ngl(str, Typeface.DEFAULT, txjVar.l.k(context), k4lVarB.b.a(context))});
            ImageView imageView = sf2Var.b;
            LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{c9iVar, k4aVar, layerDrawable});
            int iK2 = txjVar.j.k(context);
            layerDrawable2.setLayerInset(1, iK2, iK2, iK2, iK2);
            imageView.setImageDrawable(layerDrawable2);
        }
    }

    public final void Y() {
        yzd yzdVar = this.l;
        if (yzdVar != null) {
            ArrayList arrayList = yzdVar.b;
            ImageView imageView = this.b.b;
            s9i s9iVar = this.k;
            imageView.setSelected(s9iVar.Y() && s9iVar.X(arrayList));
        }
    }
}
