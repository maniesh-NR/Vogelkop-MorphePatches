package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class kim implements DialogInterface.OnShowListener {
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        View viewFindViewById = ((Dialog) dialogInterface).findViewById(2131362514);
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorD = BottomSheetBehavior.D(viewFindViewById);
            bottomSheetBehaviorD.M(3);
            bottomSheetBehaviorD.K = true;
        }
    }
}
