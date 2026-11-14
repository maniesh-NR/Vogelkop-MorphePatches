package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class ru9 {
    public static final lu9 c = new lu9("vpn.vpnpro.quick_settings_tile_added");
    public static final mu9 d = new mu9("vpn.vpnpro.upsell_banner_version");
    public static final lu9 e = new lu9("vpn.vpnpro.upsell_banner_closed");
    public static final lu9 f = new lu9("crypto.wallet.wallet_removed");
    public static final qu9 g;
    public static final pu9 h;
    public static final lu9 i;
    public static final pu9 j;
    public static final lu9 k;
    public static final lu9 l;
    public static final Object m;
    public static ru9 n;
    public final SharedPreferences a;
    public final i7f b = new i7f();

    static {
        new lu9("premium.opera_account_promotion.dialog_shown");
        g = new qu9("startpage.feed_category_id");
        h = new pu9("rewards.claimed_wallpapers");
        i = new lu9("startpage.allow_extended_behavior");
        j = new pu9("wallpaper.unlocked_ids");
        new qu9("osp.analytics_host");
        new qu9("osp.analytics_key");
        new qu9("osp.behavior_host");
        new qu9("osp.behavior_key");
        new qu9("osp.requests_host");
        new qu9("osp.requests_key");
        new qu9("osp.onboarding_host");
        new qu9("osp.onboarding_key");
        new qu9("osp.domains_host");
        new qu9("osp.domains_key");
        new lu9("tab_gallery.tabui2_selection_menu_hint_bubble_shown");
        k = new lu9("rewards.has_opened_ui");
        l = new lu9("vpn_pro.kill_switch.on");
        m = new Object();
    }

    public ru9(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public static ru9 c(Context context) {
        ru9 ru9Var;
        synchronized (m) {
            ru9Var = n;
            if (ru9Var == null) {
                ru9Var = new ru9(context.getSharedPreferences("general_prefs", 0));
                n = ru9Var;
            }
        }
        return ru9Var;
    }

    public final void a(n1 n1Var) {
        this.b.b(n1Var);
        this.a.registerOnSharedPreferenceChangeListener((nu9) n1Var.b);
    }

    public final nv6 b() {
        return new nv6(this.a.edit());
    }

    public final void d(n1 n1Var) {
        this.b.c(n1Var);
        this.a.unregisterOnSharedPreferenceChangeListener((nu9) n1Var.b);
    }
}
