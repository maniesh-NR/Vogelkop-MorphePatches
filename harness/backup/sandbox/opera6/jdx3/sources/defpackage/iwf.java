package defpackage;

import android.view.MenuItem;
import android.widget.CompoundButton;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final /* synthetic */ class iwf implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iwf(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                kwf kwfVar = (kwf) obj2;
                MenuItem menuItem = (MenuItem) obj;
                if (compoundButton.isEnabled()) {
                    kwf kwfVar2 = (kwf) kwfVar.p.b;
                    nwf nwfVar = kwfVar2.l;
                    if (menuItem.getItemId() != 2131363812) {
                        if (menuItem.getItemId() == 2131363821) {
                            nwfVar.getClass();
                            new lwf(nwfVar, (byte) 16);
                            kwfVar2.b();
                            break;
                        }
                    } else {
                        nwfVar.getClass();
                        new mwf(nwfVar, z, (byte) 1);
                        kwfVar2.b();
                        break;
                    }
                }
                break;
            case 1:
                r3i r3iVar = (r3i) obj2;
                r9i r9iVar = (r9i) obj;
                if (compoundButton.isEnabled()) {
                    r3iVar.k = z;
                    r3iVar.j.invoke(Boolean.valueOf(z));
                    o66 o66Var = (o66) r9iVar.d;
                    if (o66Var.j()) {
                        o66Var.f.dismiss();
                        break;
                    }
                }
                break;
            default:
                g7j g7jVar = (g7j) obj;
                jmn jmnVar = (jmn) ((jl6) obj2).g;
                SettingsManager settingsManager = jmnVar.F;
                if (!z) {
                    settingsManager.U(jmnVar.J, false);
                    break;
                } else {
                    settingsManager.U(g7jVar, false);
                    break;
                }
        }
    }
}
