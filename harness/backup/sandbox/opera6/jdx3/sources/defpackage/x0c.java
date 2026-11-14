package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final /* synthetic */ class x0c implements h93, s3m, vlf {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f1c b;

    public /* synthetic */ x0c(f1c f1cVar, byte b) {
        this.a = b;
        this.b = f1cVar;
    }

    @Override // defpackage.s3m
    public final void a(szb szbVar) {
        this.b.z.j(szbVar, 0, false);
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
        f1c f1cVar = this.b;
        switch (b) {
            case 2:
                v3m v3mVar = f1cVar.z;
                if (v3mVar.g() != z) {
                    v3mVar.b.V(z ? 1 : 0, "translate_web_pages_enabled");
                    v3mVar.i(v3mVar.d());
                    break;
                }
                break;
            default:
                f1cVar.x.V(((OperaListItem) f1cVar.B.f).isChecked() ? 1 : 0, "translate_web_pages_backup_translation_method_enabled");
                break;
        }
    }
}
