package defpackage;

import android.view.MenuItem;
import androidx.appcompat.widget.SwitchCompat;

/* loaded from: classes.dex */
public final class sbf {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sbf(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(ukh ukhVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                vbf vbfVar = (vbf) obj;
                boolean z = ukhVar.b;
                boolean z2 = ukhVar.c;
                boolean z3 = ukhVar.d;
                vbfVar.q();
                vbfVar.r(2L, z);
                vbfVar.r(4L, z2);
                vbfVar.r(512L, z3);
                tbf tbfVar = vbfVar.t;
                qwi qwiVarA = tbfVar.a();
                vbfVar.q();
                tbfVar.d = qwiVarA;
                vbfVar.u();
                break;
            default:
                MenuItem menuItemFindItem = ((m66) ((kwf) ((s9i) obj).e).f().c).findItem(2131363821);
                boolean z4 = ukhVar.b;
                menuItemFindItem.setEnabled(z4);
                SwitchCompat switchCompatY = q9n.y(2131363261, menuItemFindItem.getActionView());
                switchCompatY.setEnabled(false);
                switchCompatY.setChecked(ukhVar.c);
                switchCompatY.setEnabled(z4);
                break;
        }
    }
}
