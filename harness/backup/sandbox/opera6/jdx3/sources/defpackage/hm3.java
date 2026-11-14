package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.widget.CompoundButton;
import com.appsflyer.internal.j;
import com.google.android.material.chip.Chip;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final /* synthetic */ class hm3 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hm3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) throws Resources.NotFoundException {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                xw xwVar = (xw) obj;
                im3 im3Var = (im3) xwVar.l;
                j.d((SharedPreferences) im3Var.x.b.j.get(), "show_full_address", z);
                xm3 xm3Var = im3Var.x.s;
                if (xm3Var != null) {
                    xm3Var.notifyDataSetChanged();
                }
                xwVar.b();
                break;
            case 1:
                Chip chip = (Chip) obj;
                Rect rect = Chip.x;
                tw2 tw2Var = chip.j;
                if (tw2Var != null) {
                    ev4 ev4Var = (ev4) tw2Var.b;
                    if (!z ? ev4Var.n(chip, ev4Var.c) : ev4Var.c(chip)) {
                        ev4Var.h();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    break;
                }
                break;
            default:
                OperaListItem operaListItem = (OperaListItem) obj;
                vlf vlfVar = operaListItem.u;
                if (vlfVar != null) {
                    vlfVar.u(operaListItem, z);
                }
                operaListItem.I(z);
                break;
        }
    }
}
