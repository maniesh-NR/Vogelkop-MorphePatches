package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.weather.ui.WeatherWidgetActivity;

/* loaded from: classes.dex */
public final class tpn extends Fragment implements o37 {
    public final ua7 a;
    public final th b = registerForActivityResult(new sh((byte) 1), new r2n(this, (byte) 15));

    public tpn(gjm gjmVar) {
        this.a = new ua7(this, gjmVar);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b.a(FullscreenWebActivity.e0(requireContext(), WeatherWidgetActivity.class, null, null, true, lqm.H), (nh) null);
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.a;
    }
}
