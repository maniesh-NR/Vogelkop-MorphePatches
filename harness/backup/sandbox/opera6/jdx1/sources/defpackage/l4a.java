package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class l4a extends nb6 {
    public final /* synthetic */ byte k;

    public /* synthetic */ l4a(byte b) {
        this.k = b;
    }

    @Override // defpackage.nb6
    public final int t(View view, int i, int i2) {
        switch (this.k) {
            case 4:
                if (view.getVisibility() != 8) {
                    int baseline = view.getBaseline();
                    if (baseline == -1) {
                        break;
                    }
                }
                break;
        }
        return LinearLayoutManager.INVALID_OFFSET;
    }

    @Override // defpackage.nb6
    public final r4a u() {
        switch (this.k) {
            case 4:
                return new n4a();
            default:
                return super.u();
        }
    }

    @Override // defpackage.nb6
    public final String w() {
        switch (this.k) {
            case 0:
                return "UNDEFINED";
            case 1:
                return "LEADING";
            case 2:
                return "TRAILING";
            case 3:
                return "CENTER";
            case 4:
                return "BASELINE";
            default:
                return "FILL";
        }
    }

    @Override // defpackage.nb6
    public final int y(int i, View view) {
        switch (this.k) {
            case 0:
                return LinearLayoutManager.INVALID_OFFSET;
            case 1:
            case 4:
            default:
                return 0;
            case 2:
                return i;
            case 3:
                return i >> 1;
        }
    }

    @Override // defpackage.nb6
    public final int z(int i, int i2) {
        switch (this.k) {
            case 5:
                return i2;
            default:
                return i;
        }
    }
}
