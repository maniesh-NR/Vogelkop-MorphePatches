package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.widget.FaqItemView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a3f extends i93 implements o37 {
    public final ua7 t;
    public final zyk u;
    public final ktl v;
    public static final /* synthetic */ xtb[] x = {new d6h(a3f.class, "binding", "getBinding()Lcom/opera/android/databinding/FragmentNotificationsSettingsBinding;", 0)};
    public static final i06 w = new i06((byte) 21);

    public a3f(gjm gjmVar) {
        super(2132021553, 0, 14);
        this.t = new ua7((Fragment) this, gjmVar);
        this.u = z4c.b(new yse(this, (byte) 1));
        this.v = F0(new rqd((byte) 24));
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return I0();
    }

    public final fm9 H0() {
        xtb xtbVar = x[0];
        a5n a5nVar = this.v.b;
        Objects.requireNonNull(a5nVar);
        return (fm9) a5nVar;
    }

    public final d3f I0() {
        return (d3f) this.u.getValue();
    }

    @Override // defpackage.ltl
    public final void onResume() {
        super.onResume();
        x0f x0fVar = I0().d;
        x0fVar.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = ((NotificationManager) x0fVar.a.getSystemService("notification")).getNotificationChannels().iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((NotificationChannel) it.next()).getId());
        }
        x0fVar.c.n(x0fVar.b.e(new u0f(x0fVar, (byte) 2)).c(new u0f(x0fVar, (byte) 3)), linkedHashSet);
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final byte b = 6;
        H0().j.setOnClickListener(new zvd(this, (byte) 6));
        final byte b2 = 1;
        H0().f.u = new vlf(this) { // from class: y2f
            public final /* synthetic */ a3f b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b3 = b2;
                a3f a3fVar = this.b;
                switch (b3) {
                    case 0:
                        a3fVar.I0().b.V(z ? 1 : 0, "rewards_notifications");
                        break;
                    case 1:
                        a3fVar.I0().b.V(z ? 1 : 0, "vpn_pro_in_app_notification");
                        break;
                    case 2:
                        a3fVar.I0().b.V(z ? 1 : 0, "wallpaper_in_app_notification");
                        break;
                    case 3:
                        a3fVar.I0().b.V(z ? 1 : 0, "feedback_in_app_notification");
                        break;
                    case 4:
                        a3fVar.I0().b.V(z ? 1 : 0, "product_and_service_in_app_notification");
                        break;
                    case 5:
                        a3fVar.I0().b.V(z ? 1 : 0, "feature_tips_notification");
                        break;
                    default:
                        a3fVar.I0().b.V(z ? 1 : 0, "esim_notifications");
                        break;
                }
            }
        };
        final byte b3 = 2;
        H0().i.u = new vlf(this) { // from class: y2f
            public final /* synthetic */ a3f b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b32 = b3;
                a3f a3fVar = this.b;
                switch (b32) {
                    case 0:
                        a3fVar.I0().b.V(z ? 1 : 0, "rewards_notifications");
                        break;
                    case 1:
                        a3fVar.I0().b.V(z ? 1 : 0, "vpn_pro_in_app_notification");
                        break;
                    case 2:
                        a3fVar.I0().b.V(z ? 1 : 0, "wallpaper_in_app_notification");
                        break;
                    case 3:
                        a3fVar.I0().b.V(z ? 1 : 0, "feedback_in_app_notification");
                        break;
                    case 4:
                        a3fVar.I0().b.V(z ? 1 : 0, "product_and_service_in_app_notification");
                        break;
                    case 5:
                        a3fVar.I0().b.V(z ? 1 : 0, "feature_tips_notification");
                        break;
                    default:
                        a3fVar.I0().b.V(z ? 1 : 0, "esim_notifications");
                        break;
                }
            }
        };
        final byte b4 = 3;
        H0().e.u = new vlf(this) { // from class: y2f
            public final /* synthetic */ a3f b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b32 = b4;
                a3f a3fVar = this.b;
                switch (b32) {
                    case 0:
                        a3fVar.I0().b.V(z ? 1 : 0, "rewards_notifications");
                        break;
                    case 1:
                        a3fVar.I0().b.V(z ? 1 : 0, "vpn_pro_in_app_notification");
                        break;
                    case 2:
                        a3fVar.I0().b.V(z ? 1 : 0, "wallpaper_in_app_notification");
                        break;
                    case 3:
                        a3fVar.I0().b.V(z ? 1 : 0, "feedback_in_app_notification");
                        break;
                    case 4:
                        a3fVar.I0().b.V(z ? 1 : 0, "product_and_service_in_app_notification");
                        break;
                    case 5:
                        a3fVar.I0().b.V(z ? 1 : 0, "feature_tips_notification");
                        break;
                    default:
                        a3fVar.I0().b.V(z ? 1 : 0, "esim_notifications");
                        break;
                }
            }
        };
        final byte b5 = 4;
        H0().g.u = new vlf(this) { // from class: y2f
            public final /* synthetic */ a3f b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b32 = b5;
                a3f a3fVar = this.b;
                switch (b32) {
                    case 0:
                        a3fVar.I0().b.V(z ? 1 : 0, "rewards_notifications");
                        break;
                    case 1:
                        a3fVar.I0().b.V(z ? 1 : 0, "vpn_pro_in_app_notification");
                        break;
                    case 2:
                        a3fVar.I0().b.V(z ? 1 : 0, "wallpaper_in_app_notification");
                        break;
                    case 3:
                        a3fVar.I0().b.V(z ? 1 : 0, "feedback_in_app_notification");
                        break;
                    case 4:
                        a3fVar.I0().b.V(z ? 1 : 0, "product_and_service_in_app_notification");
                        break;
                    case 5:
                        a3fVar.I0().b.V(z ? 1 : 0, "feature_tips_notification");
                        break;
                    default:
                        a3fVar.I0().b.V(z ? 1 : 0, "esim_notifications");
                        break;
                }
            }
        };
        final byte b6 = 5;
        H0().d.u = new vlf(this) { // from class: y2f
            public final /* synthetic */ a3f b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b32 = b6;
                a3f a3fVar = this.b;
                switch (b32) {
                    case 0:
                        a3fVar.I0().b.V(z ? 1 : 0, "rewards_notifications");
                        break;
                    case 1:
                        a3fVar.I0().b.V(z ? 1 : 0, "vpn_pro_in_app_notification");
                        break;
                    case 2:
                        a3fVar.I0().b.V(z ? 1 : 0, "wallpaper_in_app_notification");
                        break;
                    case 3:
                        a3fVar.I0().b.V(z ? 1 : 0, "feedback_in_app_notification");
                        break;
                    case 4:
                        a3fVar.I0().b.V(z ? 1 : 0, "product_and_service_in_app_notification");
                        break;
                    case 5:
                        a3fVar.I0().b.V(z ? 1 : 0, "feature_tips_notification");
                        break;
                    default:
                        a3fVar.I0().b.V(z ? 1 : 0, "esim_notifications");
                        break;
                }
            }
        };
        H0().c.u = new vlf(this) { // from class: y2f
            public final /* synthetic */ a3f b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b32 = b;
                a3f a3fVar = this.b;
                switch (b32) {
                    case 0:
                        a3fVar.I0().b.V(z ? 1 : 0, "rewards_notifications");
                        break;
                    case 1:
                        a3fVar.I0().b.V(z ? 1 : 0, "vpn_pro_in_app_notification");
                        break;
                    case 2:
                        a3fVar.I0().b.V(z ? 1 : 0, "wallpaper_in_app_notification");
                        break;
                    case 3:
                        a3fVar.I0().b.V(z ? 1 : 0, "feedback_in_app_notification");
                        break;
                    case 4:
                        a3fVar.I0().b.V(z ? 1 : 0, "product_and_service_in_app_notification");
                        break;
                    case 5:
                        a3fVar.I0().b.V(z ? 1 : 0, "feature_tips_notification");
                        break;
                    default:
                        a3fVar.I0().b.V(z ? 1 : 0, "esim_notifications");
                        break;
                }
            }
        };
        final byte b7 = 0;
        H0().h.u = new vlf(this) { // from class: y2f
            public final /* synthetic */ a3f b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b32 = b7;
                a3f a3fVar = this.b;
                switch (b32) {
                    case 0:
                        a3fVar.I0().b.V(z ? 1 : 0, "rewards_notifications");
                        break;
                    case 1:
                        a3fVar.I0().b.V(z ? 1 : 0, "vpn_pro_in_app_notification");
                        break;
                    case 2:
                        a3fVar.I0().b.V(z ? 1 : 0, "wallpaper_in_app_notification");
                        break;
                    case 3:
                        a3fVar.I0().b.V(z ? 1 : 0, "feedback_in_app_notification");
                        break;
                    case 4:
                        a3fVar.I0().b.V(z ? 1 : 0, "product_and_service_in_app_notification");
                        break;
                    case 5:
                        a3fVar.I0().b.V(z ? 1 : 0, "feature_tips_notification");
                        break;
                    default:
                        a3fVar.I0().b.V(z ? 1 : 0, "esim_notifications");
                        break;
                }
            }
        };
        I0().h.j(getViewLifecycleOwner(), new iwa(new zbe((byte) 15), (byte) 13));
        xf8.i0(I0().f, getViewLifecycleOwner(), H0().a, (List) null, new d8d(this, (byte) 15));
        String string = getString(2132017591);
        FaqItemView faqItemView = H0().b;
        CharSequence charSequenceV = sko.v(getString(2132020076, new Object[]{string}), "\n\n", getString(2132020077, new Object[]{string}));
        vs vsVar = faqItemView.q;
        ((StylingTextView) (vsVar != null ? vsVar : null).d).setText(charSequenceV);
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.t;
    }
}
