package defpackage;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r3i extends o73 {
    public final qfl j;
    public boolean k;

    public r3i(qfl qflVar) {
        this.j = qflVar;
    }

    @Override // defpackage.o73
    public final void m(r9i r9iVar, View view) {
        r9iVar.L(2131755056);
        MenuItem menuItemFindItem = ((m66) r9iVar.c).findItem(2131363465);
        byte b = 1;
        menuItemFindItem.setVisible(true);
        menuItemFindItem.setActionView(2131559199);
        View actionView = menuItemFindItem.getActionView();
        if (actionView != null) {
            l5b l5bVar = q9n.c;
            SwitchCompat switchCompatFindViewById = actionView.findViewById(2131363261);
            Objects.requireNonNull(switchCompatFindViewById);
            SwitchCompat switchCompat = switchCompatFindViewById;
            switchCompat.setChecked(this.k);
            switchCompat.setOnCheckedChangeListener(new iwf(this, r9iVar, b));
        }
    }

    @Override // defpackage.dog
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131363465) {
            return false;
        }
        View actionView = menuItem.getActionView();
        if (actionView == null) {
            return true;
        }
        l5b l5bVar = q9n.c;
        SwitchCompat switchCompatFindViewById = actionView.findViewById(2131363261);
        Objects.requireNonNull(switchCompatFindViewById);
        switchCompatFindViewById.toggle();
        return true;
    }
}
