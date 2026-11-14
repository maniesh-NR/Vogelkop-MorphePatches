package defpackage;

import android.provider.Settings;
import com.opera.android.BrowserActivity;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final /* synthetic */ class fxe implements vlf, h93 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kxe b;

    public /* synthetic */ fxe(kxe kxeVar, byte b) {
        this.a = b;
        this.b = kxeVar;
    }

    @Override // defpackage.h93
    public final void s() {
        BrowserActivity browserActivityO = q9n.o(this.b.requireContext());
        d8j d8jVar = browserActivityO != null ? (d8j) browserActivityO.g0.E(d8j.class) : null;
        if (d8jVar != null) {
            ((g8j) d8jVar).h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        byte b = this.a;
        kxe kxeVar = this.b;
        switch (b) {
            case 0:
                kxeVar.J.T(z, true);
                kxeVar.J0();
                break;
            case 1:
                kxeVar.y.V(z ? 1 : 0, "night_mode_switch_theme");
                break;
            case 2:
                kxeVar.y.V(z ? 1 : 0, "darken_websites");
                break;
            default:
                if (!z) {
                    kxeVar.L = false;
                } else if (!Settings.canDrawOverlays(operaListItem.getContext())) {
                    operaListItem.toggle();
                    kxeVar.L = true;
                    BrowserActivity activity = kxeVar.getActivity();
                    z77 z77Var = kxeVar.B;
                    wpe wpeVar = new wpe(kxeVar, activity);
                    z77Var.getClass();
                    z77Var.b(wpeVar, ijm.b);
                    break;
                }
                kxeVar.y.V(z ? 1 : 0, "night_mode_overlay_keyboard");
                break;
        }
    }
}
