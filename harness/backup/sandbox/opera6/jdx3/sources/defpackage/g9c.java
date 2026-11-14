package defpackage;

import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public final class g9c extends o73 {
    public final y0a j;

    public g9c(y0a y0aVar) {
        this.j = y0aVar;
    }

    @Override // defpackage.o73
    public final int d(View view) {
        return 8388611;
    }

    @Override // defpackage.o73
    public final int g() {
        return 2130970559;
    }

    @Override // defpackage.dog
    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.j.run(menuItem.getTitle().toString());
        return true;
    }
}
