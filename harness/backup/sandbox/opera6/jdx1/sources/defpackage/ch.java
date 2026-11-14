package defpackage;

import android.database.DataSetObserver;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class ch extends DataSetObserver {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hh b;

    public /* synthetic */ ch(hh hhVar, byte b) {
        this.a = b;
        this.b = hhVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int size;
        switch (this.a) {
            case 0:
                super.onChanged();
                this.b.a.notifyDataSetChanged();
                return;
            default:
                super.onChanged();
                hh hhVar = this.b;
                int count = hhVar.a.getCount();
                FrameLayout frameLayout = hhVar.e;
                if (count > 0) {
                    frameLayout.setEnabled(true);
                } else {
                    frameLayout.setEnabled(false);
                }
                int iD = hhVar.a.a.d();
                bh bhVar = hhVar.a.a;
                synchronized (bhVar.a) {
                    bhVar.a();
                    size = bhVar.c.size();
                }
                if (iD == 1 || (iD > 1 && size > 0)) {
                    hhVar.g.setVisibility(0);
                    hhVar.a.a.e();
                    hhVar.getContext().getPackageManager();
                    throw null;
                }
                hhVar.g.setVisibility(8);
                int visibility = hhVar.g.getVisibility();
                View view = hhVar.c;
                if (visibility == 0) {
                    view.setBackgroundDrawable(hhVar.d);
                    return;
                } else {
                    view.setBackgroundDrawable(null);
                    return;
                }
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.a) {
            case 0:
                super.onInvalidated();
                this.b.a.notifyDataSetInvalidated();
                break;
            default:
                super.onInvalidated();
                break;
        }
    }
}
