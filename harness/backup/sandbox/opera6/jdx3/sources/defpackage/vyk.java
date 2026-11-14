package defpackage;

import J.N;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.d;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.sync.SyncedSession;
import com.opera.android.sync.SyncedSessionTab;
import com.opera.android.sync.SyncedSessionWindow;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import com.opera.android.widget.ThemeableLottieAnimationView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/* loaded from: classes.dex */
public class vyk extends y93 {
    public int D;

    public vyk() {
        super(2132021797, 0);
    }

    @Override // defpackage.y93
    public final d G0(Object obj, LinearLayoutManager linearLayoutManager) {
        SyncedSessionWindow[] syncedSessionWindowArr = (SyncedSessionWindow[]) N.MD0ZtbWr(((SyncedSession) obj).a);
        ArrayList arrayList = new ArrayList();
        for (SyncedSessionWindow syncedSessionWindow : syncedSessionWindowArr) {
            arrayList.addAll(Arrays.asList((SyncedSessionTab[]) N.Mn0q_taN(syncedSessionWindow.a, syncedSessionWindow.b)));
        }
        return new ev5(this, (SyncedSessionTab[]) arrayList.toArray(new SyncedSessionTab[arrayList.size()]));
    }

    @Override // defpackage.y93
    public final Date J0(Object obj) {
        SyncedSession syncedSession = (SyncedSession) obj;
        syncedSession.getClass();
        return new Date(syncedSession.c.getTime());
    }

    @Override // defpackage.y93
    public final String K0(Object obj) {
        return ((SyncedSession) obj).b;
    }

    @Override // defpackage.y93
    public final void N0() {
        ((ThemeableLottieAnimationView) this.r.d).setVisibility(8);
        ((StylingImageView) this.r.f).setVisibility(0);
        ((StylingTextView) this.r.b).setText(2132021796);
        ((StylingImageView) this.r.f).setImageDrawable(sgb.F(2131232687, requireContext()));
        ((OperaMaterialButton) this.r.e).setVisibility(8);
    }

    @Override // defpackage.y93
    public final void O0() {
        ((ThemeableLottieAnimationView) this.r.d).setVisibility(8);
        ((StylingImageView) this.r.f).setVisibility(0);
        ((StylingTextView) this.r.b).setText(2132021769);
        ((StylingImageView) this.r.f).setImageDrawable(sgb.F(2131232686, requireContext()));
        ((OperaMaterialButton) this.r.e).setVisibility(0);
        ((OperaMaterialButton) this.r.e).setOnClickListener(new h4i((Object) this, (byte) 22));
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.D = getResources().getDimensionPixelSize(2131167630);
    }
}
