package defpackage;

import android.content.res.ColorStateList;
import android.widget.ImageView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.DropShadowFrameLayout;

/* loaded from: classes.dex */
public final class z6k extends ab2 {
    public final b7k d;
    public final dnj e;
    public w6k f;

    public z6k(b7k b7kVar, pde pdeVar, pde pdeVar2, dnj dnjVar) {
        super((DropShadowFrameLayout) b7kVar.b);
        this.d = b7kVar;
        this.e = dnjVar;
        final byte b = 0;
        a26.T(pdeVar, this.c, new f7f(this) { // from class: y6k
            public final /* synthetic */ z6k b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                laj lajVarG;
                byte b2 = b;
                z6k z6kVar = this.b;
                switch (b2) {
                    case 0:
                        f6k f6kVar = (f6k) obj;
                        if (f6kVar != null) {
                            zch zchVar = f6kVar.a;
                            if (!(zchVar instanceof g6k)) {
                                if (!zchVar.equals(h6k.a)) {
                                    h9o.p();
                                    break;
                                }
                            } else {
                                p37.l0(((g6k) zchVar).a, ((i) z6kVar).itemView);
                                break;
                            }
                        }
                        break;
                    default:
                        w6k w6kVar = ((f8k) obj).e;
                        z6kVar.f = w6kVar;
                        z6kVar.b0();
                        b7k b7kVar2 = z6kVar.d;
                        DropShadowFrameLayout dropShadowFrameLayout = (DropShadowFrameLayout) b7kVar2.b;
                        int iOrdinal = w6kVar.ordinal();
                        if (iOrdinal == 0) {
                            lajVarG = null;
                        } else if (iOrdinal != 1) {
                            h9o.p();
                            break;
                        } else {
                            lajVarG = u0h.g(((DropShadowFrameLayout) b7kVar2.b).getContext(), maj.b);
                        }
                        dropShadowFrameLayout.b(lajVarG);
                        break;
                }
            }
        });
        final byte b2 = 1;
        a26.T(pdeVar2, this.c, new f7f(this) { // from class: y6k
            public final /* synthetic */ z6k b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                laj lajVarG;
                byte b22 = b2;
                z6k z6kVar = this.b;
                switch (b22) {
                    case 0:
                        f6k f6kVar = (f6k) obj;
                        if (f6kVar != null) {
                            zch zchVar = f6kVar.a;
                            if (!(zchVar instanceof g6k)) {
                                if (!zchVar.equals(h6k.a)) {
                                    h9o.p();
                                    break;
                                }
                            } else {
                                p37.l0(((g6k) zchVar).a, ((i) z6kVar).itemView);
                                break;
                            }
                        }
                        break;
                    default:
                        w6k w6kVar = ((f8k) obj).e;
                        z6kVar.f = w6kVar;
                        z6kVar.b0();
                        b7k b7kVar2 = z6kVar.d;
                        DropShadowFrameLayout dropShadowFrameLayout = (DropShadowFrameLayout) b7kVar2.b;
                        int iOrdinal = w6kVar.ordinal();
                        if (iOrdinal == 0) {
                            lajVarG = null;
                        } else if (iOrdinal != 1) {
                            h9o.p();
                            break;
                        } else {
                            lajVarG = u0h.g(((DropShadowFrameLayout) b7kVar2.b).getContext(), maj.b);
                        }
                        dropShadowFrameLayout.b(lajVarG);
                        break;
                }
            }
        });
        ImageView imageView = (ImageView) b7kVar.c;
        kkf kkfVar = new kkf(this, (byte) 23);
        dll dllVarS = q9n.s(imageView);
        if (dllVarS == null) {
            return;
        }
        u8n.b(dllVarS, imageView, kkfVar);
    }

    public final void b0() {
        int iT;
        w6k w6kVar = this.f;
        if (w6kVar == null) {
            return;
        }
        ImageView imageView = (ImageView) this.d.c;
        int iOrdinal = w6kVar.ordinal();
        dnj dnjVar = this.e;
        if (iOrdinal == 0) {
            iT = ((Boolean) dnjVar.invoke()).booleanValue() ? f03.t(2130970474, imageView.getContext(), 2131101243) : -16777216;
        } else {
            if (iOrdinal != 1) {
                h9o.p();
                return;
            }
            iT = ((Boolean) dnjVar.invoke()).booleanValue() ? f03.t(2130970480, imageView.getContext(), 2131101243) : -1;
        }
        imageView.setImageTintList(ColorStateList.valueOf(iT));
        imageView.setAlpha(f03.V(2130969971, imageView.getContext()) ? 0.85f : 0.75f);
    }
}
