package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.widget.MenuSettingsListItem;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hcg extends i93 implements o37 {
    public static final /* synthetic */ xtb[] x = {new d6h(hcg.class, "binding", "getBinding()Lcom/opera/android/databinding/FragmentPersonalDataSettingsBinding;", 0)};
    public final d7h t;
    public final ua7 u;
    public final ktl v;
    public final zyk w;

    public hcg(gjm gjmVar, d7h d7hVar) {
        super(2132021363, 0, 14);
        this.t = d7hVar;
        this.u = new ua7((Fragment) this, gjmVar);
        this.v = F0(new odf((byte) 17));
        this.w = z4c.b(new yse(this, (byte) 5));
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return I0();
    }

    public final km9 H0() {
        xtb xtbVar = x[0];
        a5n a5nVar = this.v.b;
        Objects.requireNonNull(a5nVar);
        return (km9) a5nVar;
    }

    public final lcg I0() {
        return (lcg) this.w.getValue();
    }

    public final void J0(MenuSettingsListItem menuSettingsListItem, int i) {
        ((StylingTextView) menuSettingsListItem.b.b).setText(getResources().getQuantityString(2131886172, i, Integer.valueOf(i)));
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ImageView imageView = H0().d;
        final byte b = 1;
        kkf kkfVar = new kkf(this, (byte) 1);
        q9n.e(imageView, kkfVar);
        kkfVar.a(imageView);
        final byte b2 = 0;
        H0().b.setOnClickListener(new View.OnClickListener(this) { // from class: gcg
            public final /* synthetic */ hcg b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b2;
                hcg hcgVar = this.b;
                switch (b3) {
                    case 0:
                        kxk kxkVar = (kxk) hcgVar.I0().e;
                        db dbVar = (db) kxkVar.a.get();
                        ((dpf) ((xb) kxkVar.b.b.get()).e.g()).a(new z8b(kxkVar.e, dbVar));
                        break;
                    case 1:
                        ((kxk) hcgVar.I0().e).a(new int[0]);
                        break;
                    case 2:
                        ((ot2) hcgVar.I0().d).d();
                        break;
                    case 3:
                        ((ot2) hcgVar.I0().d).b(new int[0]);
                        break;
                    case 4:
                        ((ot2) hcgVar.I0().d).a(new int[0]);
                        break;
                    default:
                        ((ot2) hcgVar.I0().d).b.e(new sr2(), false);
                        break;
                }
            }
        });
        H0().k.setOnClickListener(new View.OnClickListener(this) { // from class: gcg
            public final /* synthetic */ hcg b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b;
                hcg hcgVar = this.b;
                switch (b3) {
                    case 0:
                        kxk kxkVar = (kxk) hcgVar.I0().e;
                        db dbVar = (db) kxkVar.a.get();
                        ((dpf) ((xb) kxkVar.b.b.get()).e.g()).a(new z8b(kxkVar.e, dbVar));
                        break;
                    case 1:
                        ((kxk) hcgVar.I0().e).a(new int[0]);
                        break;
                    case 2:
                        ((ot2) hcgVar.I0().d).d();
                        break;
                    case 3:
                        ((ot2) hcgVar.I0().d).b(new int[0]);
                        break;
                    case 4:
                        ((ot2) hcgVar.I0().d).a(new int[0]);
                        break;
                    default:
                        ((ot2) hcgVar.I0().d).b.e(new sr2(), false);
                        break;
                }
            }
        });
        final byte b3 = 2;
        H0().j.setOnClickListener(new View.OnClickListener(this) { // from class: gcg
            public final /* synthetic */ hcg b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b3;
                hcg hcgVar = this.b;
                switch (b32) {
                    case 0:
                        kxk kxkVar = (kxk) hcgVar.I0().e;
                        db dbVar = (db) kxkVar.a.get();
                        ((dpf) ((xb) kxkVar.b.b.get()).e.g()).a(new z8b(kxkVar.e, dbVar));
                        break;
                    case 1:
                        ((kxk) hcgVar.I0().e).a(new int[0]);
                        break;
                    case 2:
                        ((ot2) hcgVar.I0().d).d();
                        break;
                    case 3:
                        ((ot2) hcgVar.I0().d).b(new int[0]);
                        break;
                    case 4:
                        ((ot2) hcgVar.I0().d).a(new int[0]);
                        break;
                    default:
                        ((ot2) hcgVar.I0().d).b.e(new sr2(), false);
                        break;
                }
            }
        });
        final byte b4 = 3;
        H0().h.setOnClickListener(new View.OnClickListener(this) { // from class: gcg
            public final /* synthetic */ hcg b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b4;
                hcg hcgVar = this.b;
                switch (b32) {
                    case 0:
                        kxk kxkVar = (kxk) hcgVar.I0().e;
                        db dbVar = (db) kxkVar.a.get();
                        ((dpf) ((xb) kxkVar.b.b.get()).e.g()).a(new z8b(kxkVar.e, dbVar));
                        break;
                    case 1:
                        ((kxk) hcgVar.I0().e).a(new int[0]);
                        break;
                    case 2:
                        ((ot2) hcgVar.I0().d).d();
                        break;
                    case 3:
                        ((ot2) hcgVar.I0().d).b(new int[0]);
                        break;
                    case 4:
                        ((ot2) hcgVar.I0().d).a(new int[0]);
                        break;
                    default:
                        ((ot2) hcgVar.I0().d).b.e(new sr2(), false);
                        break;
                }
            }
        });
        final byte b5 = 4;
        H0().g.setOnClickListener(new View.OnClickListener(this) { // from class: gcg
            public final /* synthetic */ hcg b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b5;
                hcg hcgVar = this.b;
                switch (b32) {
                    case 0:
                        kxk kxkVar = (kxk) hcgVar.I0().e;
                        db dbVar = (db) kxkVar.a.get();
                        ((dpf) ((xb) kxkVar.b.b.get()).e.g()).a(new z8b(kxkVar.e, dbVar));
                        break;
                    case 1:
                        ((kxk) hcgVar.I0().e).a(new int[0]);
                        break;
                    case 2:
                        ((ot2) hcgVar.I0().d).d();
                        break;
                    case 3:
                        ((ot2) hcgVar.I0().d).b(new int[0]);
                        break;
                    case 4:
                        ((ot2) hcgVar.I0().d).a(new int[0]);
                        break;
                    default:
                        ((ot2) hcgVar.I0().d).b.e(new sr2(), false);
                        break;
                }
            }
        });
        final byte b6 = 5;
        H0().i.setOnClickListener(new View.OnClickListener(this) { // from class: gcg
            public final /* synthetic */ hcg b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b6;
                hcg hcgVar = this.b;
                switch (b32) {
                    case 0:
                        kxk kxkVar = (kxk) hcgVar.I0().e;
                        db dbVar = (db) kxkVar.a.get();
                        ((dpf) ((xb) kxkVar.b.b.get()).e.g()).a(new z8b(kxkVar.e, dbVar));
                        break;
                    case 1:
                        ((kxk) hcgVar.I0().e).a(new int[0]);
                        break;
                    case 2:
                        ((ot2) hcgVar.I0().d).d();
                        break;
                    case 3:
                        ((ot2) hcgVar.I0().d).b(new int[0]);
                        break;
                    case 4:
                        ((ot2) hcgVar.I0().d).a(new int[0]);
                        break;
                    default:
                        ((ot2) hcgVar.I0().d).b.e(new sr2(), false);
                        break;
                }
            }
        });
        xf8.i0(I0().f.f, getViewLifecycleOwner(), H0().a, (List) null, new d8d(this, (byte) 21));
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.u;
    }
}
