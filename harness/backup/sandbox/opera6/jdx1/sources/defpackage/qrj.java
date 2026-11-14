package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class qrj extends ifc {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qrj(Context context, byte b) {
        super(context);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrj(RecyclerView recyclerView) {
        super(recyclerView.getContext());
        this.a = (byte) 1;
    }

    @Override // defpackage.ifc
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        switch (this.a) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.calculateSpeedPerPixel(displayMetrics);
        }
    }

    @Override // defpackage.ifc
    public final int getVerticalSnapPreference() {
        switch (this.a) {
            case 1:
                return -1;
            default:
                return super.getVerticalSnapPreference();
        }
    }
}
