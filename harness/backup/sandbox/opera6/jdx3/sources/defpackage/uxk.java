package defpackage;

import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.w;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.material.button.MaterialButton;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.Collections;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Luxk;", "Li93;", "<init>", "()V", "el7", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class uxk extends i93 {
    public static final /* synthetic */ xtb[] w = {new d6h(uxk.class, "binding", "getBinding()Lcom/opera/android/databinding/FragmentSyncSettingsBinding;", 0)};
    public final ktl t;
    public final zyk u;
    public ImageView v;

    public uxk() {
        super(2132021734, 2131755037, 4);
        this.t = F0(new gpk((byte) 6));
        this.u = z4c.b(new yse(this, (byte) 19));
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return I0();
    }

    public final wm9 H0() {
        xtb xtbVar = w[0];
        a5n a5nVar = this.t.b;
        Objects.requireNonNull(a5nVar);
        return (wm9) a5nVar;
    }

    public final dyk I0() {
        return (dyk) this.u.getValue();
    }

    @Override // defpackage.k24, defpackage.ryl
    public final void h0(w wVar) {
        if (gge.G0(wVar)) {
            return;
        }
        super.h0(wVar);
    }

    @Override // defpackage.ltl
    public final void onResume() {
        zxk zxkVar;
        CancellationSignal cancellationSignal;
        super.onResume();
        boolean z = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(requireContext()) == 0;
        H0().f.setVisibility(z ? 0 : 8);
        H0().c.setVisibility(z ? 0 : 8);
        dyk dykVarI0 = I0();
        if (!dykVarI0.f.f() || (cancellationSignal = (zxkVar = dykVarI0.e).j) == null || cancellationSignal.isCanceled()) {
            return;
        }
        zxkVar.j = zxkVar.c.g(true, new qlk(zxkVar, (byte) 15), new zzh(zxkVar, (byte) 19));
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        OperaIconedMessage operaIconedMessage = H0().g.b;
        ((MaterialButton) operaIconedMessage.a.f).setText(null);
        operaIconedMessage.c();
        H0().f.setOnClickListener(new sxk(this, (byte) 5));
        final byte b = 0;
        H0().h.u = new vlf(this) { // from class: txk
            public final /* synthetic */ uxk b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b2 = b;
                uxk uxkVar = this.b;
                switch (b2) {
                    case 0:
                        xtb[] xtbVarArr = uxk.w;
                        dyk dykVarI0 = uxkVar.I0();
                        zxk zxkVar = dykVarI0.e;
                        db dbVar = dykVarI0.f;
                        if (!xgh.s(dbVar, dykVarI0.i)) {
                            if (!dbVar.f()) {
                                if (z) {
                                    dykVarI0.g();
                                    zxkVar.i = false;
                                    zxkVar.g.a = true;
                                    zxkVar.b();
                                    break;
                                }
                            } else {
                                zxkVar.i = z;
                                zxkVar.g.a = true;
                                zxkVar.b();
                                break;
                            }
                        } else if (z) {
                            kxk kxkVar = dykVarI0.j;
                            xih.y(kxkVar.e, (zwk) kxkVar.d.b.get(), new l31(new dnj(dykVarI0, (byte) 22), (byte) 5), null);
                            zxkVar.i = false;
                            zxkVar.g.a = true;
                            zxkVar.b();
                            break;
                        }
                        break;
                    default:
                        xtb[] xtbVarArr2 = uxk.w;
                        dyk dykVarI02 = uxkVar.I0();
                        if (dykVarI02.k.r() < 2) {
                            if (z) {
                                na2.T(dykVarI02.j.e);
                                dykVarI02.e.b();
                                break;
                            }
                        } else {
                            if (!z) {
                                dykVarI02.l.a();
                            }
                            dykVarI02.b.V(z ? 1 : 0, "my_flow_visible");
                            break;
                        }
                        break;
                }
            }
        };
        final byte b2 = 1;
        H0().c.u = new vlf(this) { // from class: txk
            public final /* synthetic */ uxk b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b22 = b2;
                uxk uxkVar = this.b;
                switch (b22) {
                    case 0:
                        xtb[] xtbVarArr = uxk.w;
                        dyk dykVarI0 = uxkVar.I0();
                        zxk zxkVar = dykVarI0.e;
                        db dbVar = dykVarI0.f;
                        if (!xgh.s(dbVar, dykVarI0.i)) {
                            if (!dbVar.f()) {
                                if (z) {
                                    dykVarI0.g();
                                    zxkVar.i = false;
                                    zxkVar.g.a = true;
                                    zxkVar.b();
                                    break;
                                }
                            } else {
                                zxkVar.i = z;
                                zxkVar.g.a = true;
                                zxkVar.b();
                                break;
                            }
                        } else if (z) {
                            kxk kxkVar = dykVarI0.j;
                            xih.y(kxkVar.e, (zwk) kxkVar.d.b.get(), new l31(new dnj(dykVarI0, (byte) 22), (byte) 5), null);
                            zxkVar.i = false;
                            zxkVar.g.a = true;
                            zxkVar.b();
                            break;
                        }
                        break;
                    default:
                        xtb[] xtbVarArr2 = uxk.w;
                        dyk dykVarI02 = uxkVar.I0();
                        if (dykVarI02.k.r() < 2) {
                            if (z) {
                                na2.T(dykVarI02.j.e);
                                dykVarI02.e.b();
                                break;
                            }
                        } else {
                            if (!z) {
                                dykVarI02.l.a();
                            }
                            dykVarI02.b.V(z ? 1 : 0, "my_flow_visible");
                            break;
                        }
                        break;
                }
            }
        };
        H0().b.setOnClickListener(new sxk(this, (byte) 6));
        OperaIconedMessage operaIconedMessage2 = H0().e.b;
        ((MaterialButton) operaIconedMessage2.a.f).setOnClickListener(new sxk(this, (byte) 7));
        H0().e.b.b(new sxk(this, b2));
        OperaIconedMessage operaIconedMessage3 = H0().i.b;
        byte b3 = 2;
        ((MaterialButton) operaIconedMessage3.a.f).setOnClickListener(new sxk(this, b3));
        H0().i.b.b(new sxk(this, (byte) 3));
        H0().g.b.b(new sxk(this, (byte) 4));
        I0().n.j(getViewLifecycleOwner(), new w4i(new n6k((Object) this, (byte) 17), (byte) 19));
        v9j v9jVar = I0().e.f;
        ndc viewLifecycleOwner = getViewLifecycleOwner();
        LinearLayout linearLayout = H0().a;
        el7 el7Var = new el7(this, b3);
        xf8.i0(v9jVar, viewLifecycleOwner, linearLayout, Collections.singletonList(el7Var), new qzg(this, (byte) 26));
    }

    @Override // defpackage.ltl
    public final void x0(itd itdVar) {
        View actionView = itdVar.findItem(2131361845).getActionView();
        ImageView imageView = actionView != null ? (ImageView) actionView.findViewById(2131364638) : null;
        this.v = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new sxk(this, (byte) 0));
        }
    }
}
