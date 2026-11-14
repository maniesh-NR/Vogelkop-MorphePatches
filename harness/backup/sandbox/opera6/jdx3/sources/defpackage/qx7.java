package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.emojipicker.EmojiPickerView;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.utilities.DisplayUtil;

/* loaded from: classes.dex */
public final class qx7 extends lj {
    public final gjm r;
    public kf s;

    /* JADX WARN: Illegal instructions before constructor call */
    public qx7(gjm gjmVar) {
        u7k u7kVarJ = u7k.j(2131558551);
        u7kVarJ.s(2132018039);
        itl itlVar = (itl) u7kVarJ.a;
        itlVar.e = true;
        super(itlVar);
        this.r = gjmVar;
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        kf kfVar = this.s;
        if (kfVar == null) {
            kfVar = null;
        }
        ((EmojiPickerView) kfVar.c).k = new ip1(this, (byte) 4);
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        CoordinatorLayout coordinatorLayoutFindViewById = statusBarDrawingFrameLayout.findViewById(2131362473);
        CoordinatorLayout coordinatorLayout = coordinatorLayoutFindViewById;
        EmojiPickerView emojiPickerViewJ = w1h.j(2131363889, coordinatorLayoutFindViewById);
        if (emojiPickerViewJ == null) {
            t3p.q("Missing required view with ID: ".concat(coordinatorLayoutFindViewById.getResources().getResourceName(2131363889)));
            return;
        }
        this.s = new kf((byte) 5, (View) coordinatorLayout, (Object) emojiPickerViewJ);
        p0(coordinatorLayout, emojiPickerViewJ);
        if (DisplayUtil.e(requireContext())) {
            kf kfVar = this.s;
            if (kfVar == null) {
                kfVar = null;
            }
            ((EmojiPickerView) kfVar.c).c(15);
        }
    }
}
