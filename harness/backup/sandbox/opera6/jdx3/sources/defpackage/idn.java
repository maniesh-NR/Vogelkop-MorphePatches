package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.opera.api.Callback;
import java.util.Collections;

/* loaded from: classes.dex */
public final class idn extends f73 {
    public final /* synthetic */ byte h = 0;
    public final Resources i;
    public fdn j;
    public ac1 k;
    public final Callback l;

    public idn(View view, tah tahVar, hdn hdnVar) {
        super(owc.a(view), tahVar);
        this.i = view.getResources();
        this.l = hdnVar;
    }

    public idn(View view, tah tahVar, hdn hdnVar, byte b) {
        super(owc.a(view), tahVar);
        this.i = view.getResources();
        this.l = hdnVar;
    }

    @Override // defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) throws Resources.NotFoundException {
        pkm pkmVar;
        int i;
        int i2;
        byte b = this.h;
        tah tahVar = this.e;
        Resources resources = this.i;
        switch (b) {
            case 0:
                if (!z) {
                    fdn fdnVar = ((ixc) ja2Var).b;
                    this.j = fdnVar;
                    int size = Collections.unmodifiableList(fdnVar.g).size();
                    this.k = new ac1(fdnVar.c, resources.getQuantityString(2131886093, size, Integer.valueOf(size)), 2131232031, ((ydn) tahVar.d).c.isEnabled() ? 2130970586 : 2130969303, new obn(this, fdnVar, (byte) 3));
                    break;
                }
                break;
            default:
                if (!z) {
                    fdn fdnVar2 = ((nxc) ja2Var).b;
                    this.j = fdnVar2;
                    String str = fdnVar2.c;
                    String string = resources.getString(2132022145);
                    if (Collections.unmodifiableList(this.j.g).size() > 1) {
                        int i3 = ((ydn) tahVar.d).c.isEnabled() ? 2130970586 : 2130969303;
                        pkmVar = new pkm(this, (byte) 10);
                        i = 2131232031;
                        i2 = i3;
                    } else {
                        pkmVar = null;
                        i = 0;
                        i2 = 0;
                    }
                    this.k = new ac1(str, string, i, i2, pkmVar);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.f73
    public final ac1 b0() {
        switch (this.h) {
        }
        return this.k;
    }

    @Override // defpackage.f73
    public final fdn c0() {
        switch (this.h) {
        }
        return this.j;
    }
}
