package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class fw9 extends i93 implements o37 {
    public static final /* synthetic */ xtb[] w = {new d6h(fw9.class, "binding", "getBinding()Lcom/opera/android/databinding/FragmentGestureShortcutSettingsBinding;", 0)};
    public final ua7 t;
    public final ktl u;
    public final zyk v;

    public fw9(gjm gjmVar) {
        super(2132021221, 0, 14);
        this.t = new ua7((Fragment) this, gjmVar);
        this.u = F0(new s49((byte) 14));
        this.v = z4c.b(new t2(this, (byte) 21));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void J0(OperaListItem operaListItem, f03 f03Var) {
        if (f03Var.equals(kw9.l)) {
            operaListItem.setVisibility(8);
        } else if (!(f03Var instanceof lw9)) {
            h9o.p();
        } else {
            operaListItem.setVisibility(0);
            operaListItem.t(((lw9) f03Var).l);
        }
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return I0();
    }

    public final pl9 H0() {
        xtb xtbVar = w[0];
        a5n a5nVar = this.u.b;
        Objects.requireNonNull(a5nVar);
        return (pl9) a5nVar;
    }

    public final iw9 I0() {
        return (iw9) this.v.getValue();
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final byte b = 0;
        H0().b.u = new vlf(this) { // from class: ew9
            public final /* synthetic */ fw9 b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b2 = b;
                fw9 fw9Var = this.b;
                switch (b2) {
                    case 0:
                        fw9Var.I0().b.V(z ? 1 : 0, "main_menu_swipe_gesture_enabled");
                        break;
                    case 1:
                        fw9Var.I0().b.V(z ? 1 : 0, "tab_switch_swipe_gesture_enabled");
                        break;
                    default:
                        fw9Var.I0().b.V(z ? 1 : 0, "thumb_scroller_enabled");
                        break;
                }
            }
        };
        final byte b2 = 1;
        H0().e.u = new vlf(this) { // from class: ew9
            public final /* synthetic */ fw9 b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b22 = b2;
                fw9 fw9Var = this.b;
                switch (b22) {
                    case 0:
                        fw9Var.I0().b.V(z ? 1 : 0, "main_menu_swipe_gesture_enabled");
                        break;
                    case 1:
                        fw9Var.I0().b.V(z ? 1 : 0, "tab_switch_swipe_gesture_enabled");
                        break;
                    default:
                        fw9Var.I0().b.V(z ? 1 : 0, "thumb_scroller_enabled");
                        break;
                }
            }
        };
        final byte b3 = 2;
        H0().d.u = new vlf(this) { // from class: ew9
            public final /* synthetic */ fw9 b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b22 = b3;
                fw9 fw9Var = this.b;
                switch (b22) {
                    case 0:
                        fw9Var.I0().b.V(z ? 1 : 0, "main_menu_swipe_gesture_enabled");
                        break;
                    case 1:
                        fw9Var.I0().b.V(z ? 1 : 0, "tab_switch_swipe_gesture_enabled");
                        break;
                    default:
                        fw9Var.I0().b.V(z ? 1 : 0, "thumb_scroller_enabled");
                        break;
                }
            }
        };
        H0().c.setOnClickListener(new yk4(this, (byte) 28));
        xf8.i0(I0().h, getViewLifecycleOwner(), H0().a, (List) null, new cl4(this, (byte) 24));
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.t;
    }
}
