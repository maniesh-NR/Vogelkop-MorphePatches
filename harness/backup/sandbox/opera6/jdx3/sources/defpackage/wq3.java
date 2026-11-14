package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class wq3 extends vq3 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wq3(Context context, byte b) {
        super(context);
        this.f = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wq3(Context context, int i, boolean z, byte b) {
        super(context, i, z);
        this.f = b;
    }

    @Override // defpackage.vq3
    public final void a(ViewGroup viewGroup) {
        switch (this.f) {
            case 2:
                BottomSheetBehavior bottomSheetBehaviorD = BottomSheetBehavior.D(viewGroup);
                bottomSheetBehaviorD.L((int) (fan.a(48.0f, viewGroup.getResources()) * 5.83f));
                bottomSheetBehaviorD.K = false;
                bottomSheetBehaviorD.K(true);
                bottomSheetBehaviorD.M(4);
                z46 z46Var = this.a;
                rhj rhjVar = new rhj(this, z46Var, z46Var.findViewById(2131362514));
                ArrayList arrayList = bottomSheetBehaviorD.a0;
                arrayList.clear();
                arrayList.add(rhjVar);
                break;
            default:
                super.a(viewGroup);
                break;
        }
    }
}
