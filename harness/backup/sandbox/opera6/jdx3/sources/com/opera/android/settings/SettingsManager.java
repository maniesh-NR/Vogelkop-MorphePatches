package com.opera.android.settings;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import com.opera.android.browser.SafeBrowsingBridge;
import com.opera.android.utilities.DisplayUtil;
import defpackage.a7j;
import defpackage.ac8;
import defpackage.b3c;
import defpackage.b7j;
import defpackage.bf9;
import defpackage.d7j;
import defpackage.e7j;
import defpackage.ezg;
import defpackage.f7j;
import defpackage.g7j;
import defpackage.h7j;
import defpackage.i0l;
import defpackage.ii;
import defpackage.kag;
import defpackage.l0c;
import defpackage.l7j;
import defpackage.lag;
import defpackage.n7j;
import defpackage.ne6;
import defpackage.nzk;
import defpackage.o7j;
import defpackage.op0;
import defpackage.owe;
import defpackage.p5j;
import defpackage.p7j;
import defpackage.q25;
import defpackage.q5j;
import defpackage.q7j;
import defpackage.r25;
import defpackage.r7j;
import defpackage.s29;
import defpackage.umi;
import defpackage.v3m;
import defpackage.vgi;
import defpackage.w6f;
import defpackage.wnh;
import defpackage.xnh;
import defpackage.y9j;
import defpackage.z25;
import defpackage.z4m;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.chromium.base.CommandLine;
import org.chromium.base.PathUtils;

/* loaded from: classes.dex */
public final class SettingsManager implements w6f {
    public final y9j a;
    public final e7j b;
    public final Bundle c;
    public final CommandLine d;
    public final CopyOnWriteArraySet e = new CopyOnWriteArraySet();
    public final ii f = new ii(22);
    public final SystemSettings g;
    public boolean h;
    public boolean i;

    public SettingsManager(y9j y9jVar, Context context, CommandLine commandLine, umi umiVar) {
        this.a = y9jVar;
        e7j e7jVar = (i0l.g() || DisplayUtil.a(context)) ? e7j.d : e7j.c;
        this.b = e7jVar;
        Bundle bundle = new Bundle();
        bundle.putInt("eula_accepted.gdpr", 0);
        bundle.putInt("version_code", 0);
        bundle.putInt("app_layout", e7jVar.ordinal());
        bundle.putInt("app_icon", 0);
        bundle.putInt("app_font", 0);
        bundle.putInt("app_theme", 2);
        bundle.putInt("app_theme_accent", 6);
        bundle.putInt("addressbar_position", 0);
        bundle.putInt("compression", 0);
        bundle.putInt("ad_blocking", 0);
        byte b = 1;
        bundle.putInt("accept_cookies", 1);
        bundle.putInt("startup_mode", i0l.g() ? 1 : 0);
        bundle.putInt("javascript", 1);
        bundle.putInt("image_mode", 3);
        bundle.putInt("user_agent", i0l.g() ? 1 : 0);
        bundle.putInt("block_popups", 1);
        bundle.putInt("tab_disposition", 0);
        bundle.putInt("tab_auto_grouping", 1);
        bundle.putInt("text_wrap", 1);
        bundle.putInt("force_enable_zoom", 1);
        bundle.putInt("default_webpage_zoom", 100);
        bundle.putString("installation_id", "");
        bundle.putInt("welcome_dialog_dismissed", 0);
        bundle.putString("turbo_client_id", "");
        bundle.putString("turbo_suggested_server", "");
        bundle.putInt("obml_text_size", 1);
        bundle.putInt("obml_single_column_view", 0);
        bundle.putInt("obml_protocol", 1);
        bundle.putString("branding", "");
        bundle.putInt("ga_usage_statistics", 1);
        bundle.putInt("background_sync_permission_defualt", 0);
        bundle.putInt("periodic_background_sync_permission_default", 2);
        bundle.putInt("location_permission_defualt", 2);
        bundle.putInt("notifications_permission_defualt", 2);
        bundle.putInt("camera_permission_defualt", 2);
        bundle.putInt("permission_permission_defualt", 2);
        bundle.putInt("enable_reading_mode_as_default", (DisplayUtil.a(context) ? o7j.DISABLED : o7j.AUTO).ordinal());
        bundle.putInt("enable_newsfeed", !DisplayUtil.a(context) ? 1 : 0);
        bundle.putInt("hide_bottombar", 0);
        if (i0l.g()) {
            bundle.putInt("toolbar_disposition_classic", 0);
            bundle.putInt("toolbar_disposition_tablet", 0);
        } else {
            bundle.putInt("toolbar_disposition_classic", 2);
            bundle.putInt("toolbar_disposition_tablet", 1);
        }
        bundle.putString("toolbar_bottom_actions", null);
        bundle.putInt("is_pre_news_user", 0);
        bundle.putString("recommendations_language_region", null);
        bundle.putInt("speed_dial.large_icons", context.getResources().getBoolean(2131034128) ? 1 : 0);
        bundle.putInt("speed_dial.shape", 0);
        bundle.putInt("speed_dial.enabled", 1);
        bundle.putInt("speed_dial.plus_button", 1);
        bundle.putInt("autocomplete_omnibar", 1);
        bundle.putInt("enable_suggested_speed_dials", 1);
        bundle.putInt("enable_suggested_speed_dials_on_start_page", 0);
        bundle.putInt("enable_frequently_visited_sites", 0);
        bundle.putInt("enable_trending_searches", 1);
        bundle.putInt("enable_recent_searches", 1);
        bundle.putInt("enable_suggestion_provider_clipboard", 1);
        bundle.putInt("enable_suggestion_provider_bookmarks", 1);
        bundle.putInt("enable_suggestion_provider_history", 1);
        bundle.putInt("enable_suggestion_provider_recommendations", 1);
        bundle.putInt("enable_suggestion_provider_speeddials", 1);
        bundle.putInt("enable_suggestion_provider_ai_prompts", 1);
        bundle.putInt("enable_suggestion_provider_ai_recent_activity", 1);
        bundle.putInt("tabui_layout_mode", b3c.b.ordinal());
        bundle.putInt("night_mode", 0);
        bundle.putInt("night_mode_dimming", 100);
        bundle.putInt("night_mode_temperature", MessageTemplateConstants.Values.CENTER_POPUP_WIDTH);
        bundle.putInt("night_mode_overlay_keyboard", 0);
        bundle.putInt("night_mode_switch_theme", 1);
        bundle.putInt("night_mode_schedule", 0);
        bundle.putLong("night_mode_schedule_start", 79200000L);
        bundle.putLong("night_mode_schedule_end", 28800000L);
        bundle.putInt("enable_sync", 1);
        bundle.putInt("enable_google_ai_mode", 1);
        bundle.putInt("password_manager_autosave", 0);
        bundle.putInt("external_apps_permission_default", 2);
        bundle.putInt("camera_pan_tilt_zoom__permission_default", 2);
        bundle.putInt("protected_media_identifier_permission_default", 2);
        bundle.putInt("automatic_downloads_permission_default", 2);
        bundle.putInt("local_network_permission_default", 2);
        bundle.putInt("show_conflicting_settings_warning", 1);
        bundle.putString("wallpaper_current", "NETWORK_529");
        bundle.putLong("manual_wallpaper_first_occurrence", 0L);
        bundle.putInt("automatic_card_save_ask", 1);
        bundle.putInt("banner_blocker", 0);
        bundle.putInt("vpn_search_bypass", 1);
        bundle.putInt("personalized_default", -1);
        bundle.putInt("inside_eea", 1);
        bundle.putInt("news_is_blocked_by_personalization_change", 0);
        bundle.putInt("darken_websites", 1);
        bundle.putInt("darken_websites_dark_theme", 0);
        bundle.putInt("my_flow_visible", 1);
        bundle.putInt("collect_website_categories", 0);
        bundle.putInt("collect_partner_visits", 0);
        bundle.putInt("process_news_topics", 0);
        bundle.putInt("process_location", 0);
        bundle.putInt("exit_dialog_enabled", 1);
        bundle.putString("exit_clear_data_categories", z4o.r(new r25[]{new q25((byte) 0), new z25((byte) 0)}));
        bundle.putInt("tracker_blocker", 1);
        bundle.putInt("tab_switch_swipe_gesture_enabled", 1);
        bundle.putInt("main_menu_swipe_gesture_enabled", !"LGE".equalsIgnoreCase(Build.MANUFACTURER) ? 1 : 0);
        bundle.putInt("thumb_scroller_enabled", 1);
        bundle.putInt("dns_over_https_enabled", 0);
        bundle.putInt("dns_over_https_mode", 0);
        bundle.putString("dns_over_https_custom_server_template", "");
        bundle.putInt("enable_start_page_customize_button", 1);
        bundle.putInt("enable_start_page_opera_logo", 1);
        bundle.putInt("enable_continue_booking", 0);
        bundle.putInt("enable_search_shortcuts", 1);
        bundle.putInt("enable_search_shortcuts_tablet", 1);
        bundle.putInt("enable_weather", 1);
        z4m z4mVar = z4m.OPERA;
        bundle.putInt("translation_source", 0);
        bundle.putInt("translate_web_pages_enabled", 0);
        bundle.putInt("translate_web_pages_backup_translation_method_enabled", 0);
        bundle.putInt("safe_browsing_enabled", 1);
        bundle.putInt("live_scores_enabled", 1);
        bundle.putInt("live_scores_odds_enabled", 1);
        bundle.putInt("page_menu_show_open_in_external_app", 1);
        bundle.putInt("ai_assistant_menu_shortcut", 1);
        bundle.putString("wallpaper_rotation_category", "most_popular");
        bundle.putInt("wallpaper_rotation_enabled", 0);
        bundle.putInt("lock_password_manager", -1);
        bundle.putInt("ai_assistant_ask_aria", 1);
        bundle.putInt("has_waited_for_startup_dependencies", 0);
        bundle.putInt("vpn_pro_in_app_notification", 1);
        bundle.putInt("wallpaper_in_app_notification", 1);
        bundle.putInt("feedback_in_app_notification", 1);
        bundle.putInt("product_and_service_in_app_notification", 1);
        bundle.putInt("feature_tips_notification", 1);
        bundle.putInt("rewards_notifications", 1);
        bundle.putInt("esim_notifications", 1);
        bundle.putInt("ongoing_installation_location_reset", 0);
        bundle.putInt("ask_before_downloading", 1);
        bundle.putInt("concurrent_downloads", -1);
        bundle.putInt("ad_blocking_mode", 0);
        bundle.putString("ad_blocking_mode.selected_custom_lists", null);
        bundle.putInt("onboarding_deleted", 0);
        bundle.putInt("enable_rewards", 1);
        bundle.putInt("media_background_play", 1);
        bundle.putInt("enable_product_suggestion", 1);
        bundle.putInt("reader_mode_zoom_level", -1);
        bundle.putInt("reader_mode_text_wrap", -1);
        this.c = bundle;
        this.d = commandLine;
        this.g = new SystemSettings(context.getApplicationContext().getContentResolver(), umiVar);
        y9jVar.a(new ezg(this, b));
    }

    public static String B(ne6 ne6Var) {
        return "sync_data_type_" + ne6Var.b;
    }

    public static boolean K(lag lagVar) {
        int iOrdinal = lagVar.ordinal();
        return iOrdinal == 2 || iOrdinal == 3;
    }

    public static String S(lag lagVar) {
        switch (lagVar.ordinal()) {
            case 1:
                return "notifications_permission_defualt";
            case 2:
                return "location_permission_defualt";
            case 3:
                return "protected_media_identifier_permission_default";
            case 4:
                return "permission_permission_defualt";
            case 5:
                return "camera_permission_defualt";
            case 6:
                return "external_apps_permission_default";
            case 7:
                return "automatic_downloads_permission_default";
            case 8:
                return "local_network_permission_default";
            default:
                return null;
        }
    }

    public static Uri o(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(PathUtils.a(0));
        File file = new File(z1m.l(sb, File.separator, "saved_pages"));
        if (z && !file.exists()) {
            HashSet hashSet = s29.a;
            file.mkdirs();
        }
        return Uri.fromFile(file);
    }

    public final boolean A(xnh xnhVar) {
        return i("enable_suggested_speed_dials_on_start_page") && ((wnh) xnhVar.i()).a(134217728);
    }

    public final q7j C() {
        return q7j.values()[n("tab_disposition")];
    }

    public final r7j D(e7j e7jVar) {
        int iN;
        int iOrdinal = e7jVar.ordinal();
        if (iOrdinal == 0) {
            iN = n("toolbar_disposition_classic");
        } else {
            if (iOrdinal != 1) {
                h9o.e();
                return null;
            }
            iN = n("toolbar_disposition_tablet");
        }
        return r7j.values()[iN];
    }

    public final z4m E() {
        return z4m.values()[n("translation_source")];
    }

    public final boolean G() {
        return this.a.getInt("inside_eea", -1) != -1;
    }

    public final boolean I() {
        return this.a.getInt("personalized_default", -1) != -1;
    }

    public final boolean J() {
        return n("version_code") == 0;
    }

    public final boolean M() {
        return u("personalized_news") && i("process_news_topics");
    }

    public final boolean N() {
        return (J() || n("version_code") == 1910404306) ? false : true;
    }

    public final boolean O() {
        String string = this.a.getString("offline_pages_location", null);
        return string != null && string.isEmpty();
    }

    public final boolean P(nzk nzkVar) {
        if (!owe.c.a.get() || !i("night_mode_switch_theme")) {
            int iOrdinal = f7j.values()[n("app_theme")].ordinal();
            if (iOrdinal != 1 && (iOrdinal != 2 || nzkVar == null || !nzkVar.a)) {
                return false;
            }
        }
        return true;
    }

    public final void Q(String str) {
        ac8.a(new q5j(this, str));
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((p5j) it.next()).M(str);
        }
    }

    public final void R(int i, String str) {
        this.a.o(i, this.c.getInt(str, 0), str);
    }

    @Override // defpackage.w6f
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void H(p5j p5jVar) {
        this.e.remove(p5jVar);
    }

    public final void U(g7j g7jVar, boolean z) {
        V(g7jVar.ordinal(), "app_theme_accent");
        if (z) {
            V(1, "app_theme_accent_changed_by_user");
        }
    }

    public final void V(int i, String str) {
        this.a.q(i, this.c.getInt(str, 0), str);
    }

    public final void W(long j, String str) {
        this.a.i(j, this.c.getLong(str, 0L), str);
    }

    public final void X(int i) {
        int iA = vep.A(i);
        if (iA == 0) {
            V(1, "night_mode");
            V(0, "night_mode_schedule");
            return;
        }
        if (iA == 1) {
            V(0, "night_mode");
            return;
        }
        if (iA == 2) {
            V(1, "night_mode");
            V(1, "night_mode_schedule");
        } else {
            if (iA != 3) {
                return;
            }
            V(1, "night_mode");
            V(2, "night_mode_schedule");
        }
    }

    public final void Y(String str, String str2) {
        this.a.m(str, str2, this.c.getString(str, null));
    }

    public final boolean Z() {
        return f() == e7j.d;
    }

    @Override // defpackage.w6f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void F(p5j p5jVar) {
        this.e.add(p5jVar);
    }

    public final a7j b() {
        int iN = n("ad_blocking_mode");
        for (a7j a7jVar : a7j.values()) {
            if (a7jVar.ordinal() == iN) {
                return a7jVar;
            }
        }
        return a7j.a;
    }

    public final b7j c() {
        return b7j.values()[n("addressbar_position")];
    }

    public final d7j e() {
        return d7j.d(n("app_icon"));
    }

    public final e7j f() {
        if (this.d.c("force-tablet-ui")) {
            return e7j.d;
        }
        int iN = n("app_layout");
        return (iN < 0 || iN >= e7j.values().length) ? this.b : e7j.values()[iN];
    }

    public final g7j g() {
        return g7j.values()[n("app_theme_accent")];
    }

    public final boolean getAdBlocking() {
        return i("ad_blocking");
    }

    public final int getBlockPopupsInt() {
        return n("block_popups");
    }

    public final boolean getCompression() {
        return i("compression");
    }

    public final int getCookiesInt() {
        int iN = n("accept_cookies");
        if (iN == 1 && this.i) {
            return 2;
        }
        return iN;
    }

    public final int getDefaultWebpageZoom() {
        return n("default_webpage_zoom");
    }

    public final boolean getForceEnableZoom() {
        return i("force_enable_zoom");
    }

    public final boolean getJavaScript() {
        return i("javascript");
    }

    public final boolean getMediaBackgroundPlay() {
        return i("media_background_play");
    }

    public final boolean getPersonalizedAds() {
        return u("personalized_ads");
    }

    @Nullable
    public final Boolean getReaderModeTextWrap() {
        int iN = n("reader_mode_text_wrap");
        if (iN == 0) {
            return Boolean.FALSE;
        }
        if (iN > 0) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Nullable
    public final Integer getReaderModeZoomLevel() {
        int iN = n("reader_mode_zoom_level");
        if (iN == -1) {
            return null;
        }
        return Integer.valueOf(iN);
    }

    public final boolean getSafeBrowsingEnabled() {
        if (!i("safe_browsing_enabled")) {
            return false;
        }
        Context context = t8.a;
        vgi vgiVar = SafeBrowsingBridge.a;
        return ((wnh) xnh.t(context).i()).b(8192);
    }

    public final boolean getSendUsageStatistics() {
        return i("ga_usage_statistics");
    }

    public final boolean getTextWrap() {
        return i("text_wrap");
    }

    @Nullable
    public final String getTurboClientId() {
        return z("turbo_client_id");
    }

    @NonNull
    public final String getTurboDeviceId() {
        return Build.MODEL;
    }

    public final int getTurboImageQualityMode() {
        int iN = n("image_mode");
        if (iN == 1) {
            return 2;
        }
        if (iN == 2) {
            return 3;
        }
        if (iN != 3) {
            return iN != 4 ? 1 : 5;
        }
        return 4;
    }

    @Nullable
    public final String getTurboSuggestedServer() {
        return z("turbo_suggested_server");
    }

    public final boolean getUseDesktopUserAgent() {
        return n("user_agent") == 1;
    }

    public final boolean h() {
        return i("ad_blocking") && i("banner_blocker");
    }

    public final boolean hasDarkThemedUi() {
        return P(null);
    }

    public final boolean i(String str) {
        return n(str) != 0;
    }

    public final h7j j(String str) {
        y9j y9jVar = this.a;
        return new h7j(i(str), y9jVar.contains(str) ? op0.d : y9jVar.d(str) ? op0.c : op0.b);
    }

    public final kag k(lag lagVar) {
        String strS = S(lagVar);
        int iN = strS != null ? n(strS) : -1;
        kag kagVar = kag.ASK;
        return iN == 2 ? kagVar : iN == 0 ? !K(lagVar) ? kagVar : kag.GRANTED : kag.DENIED;
    }

    public final l7j l() {
        return l7j.values()[n("dns_over_https_mode")];
    }

    public final Uri m() {
        String string = this.a.getString("downloads_location", null);
        return string != null ? Uri.parse(string) : Uri.fromFile((File) this.f.get());
    }

    public final int n(String str) {
        return this.a.getInt(str, this.c.getInt(str, 0));
    }

    public final n7j p() {
        n7j n7jVar;
        int iN = n("lock_password_manager");
        n7j[] n7jVarArrValues = n7j.values();
        int length = n7jVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                n7jVar = null;
                break;
            }
            n7jVar = n7jVarArrValues[i];
            if (n7jVar.d == iN) {
                break;
            }
            i++;
        }
        return n7jVar == null ? n7j.ALWAYS_LOCKED : n7jVar;
    }

    public final long q(String str) {
        return this.a.getLong(str, this.c.getLong(str, 0L));
    }

    public final boolean r(bf9 bf9Var) {
        return i("my_flow_visible") && bf9Var.t() && bf9Var.r() >= 2;
    }

    public final int s() {
        if (!i("night_mode")) {
            return 2;
        }
        int iN = n("night_mode_schedule");
        if (iN != 1) {
            return iN != 2 ? 1 : 4;
        }
        return 3;
    }

    public final void setTurboClientId(@Nullable String str) {
        Y("turbo_client_id", str);
    }

    public final void setTurboSuggestedServer(@Nullable String str) {
        Y("turbo_suggested_server", str);
    }

    public final boolean shouldDetectLanguageAutomatically() {
        return v3m.f(t8.a) && i("translate_web_pages_enabled");
    }

    public final Uri t(boolean z) {
        String string = this.a.getString("offline_pages_location", null);
        return string != null ? string.isEmpty() ? o(z) : Uri.parse(string) : Uri.fromFile(s29.f(new File((File) this.f.get(), "Offline pages"), z));
    }

    public final boolean u(String str) {
        return this.a.getInt(str, n("personalized_default") > 0 ? 1 : 0) != 0;
    }

    public final l0c v() {
        int iIndexOf;
        String strZ = z("recommendations_language_region");
        if (TextUtils.isEmpty(strZ) || (iIndexOf = strZ.indexOf(58)) == -1) {
            return null;
        }
        return new l0c(strZ.substring(0, iIndexOf), strZ.substring(iIndexOf + 1));
    }

    public final p7j x() {
        return p7j.values()[n("speed_dial.shape")];
    }

    public final int y() {
        return vep.B(3)[n("startup_mode")];
    }

    public final String z(String str) {
        String string = this.c.getString(str);
        if (string == null) {
            string = "";
        }
        return this.a.getString(str, string);
    }
}
