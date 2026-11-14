package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.view.ViewGroup;
import com.leanplum.utils.SizeUtil;
import com.opera.android.settings.SettingsManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class s9 implements p5j {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.p5j
    public final void M(String str) throws Resources.NotFoundException {
        wxe t8fVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                t9 t9Var = (t9) obj;
                if (Arrays.asList("text_wrap", "default_webpage_zoom", "force_enable_zoom", "user_agent").contains(str)) {
                    t9Var.h();
                    break;
                }
                break;
            case 1:
                hv0 hv0Var = (hv0) obj;
                if (str.hashCode() == 1204458606 && str.equals("ai_assistant_menu_shortcut")) {
                    hv0Var.c.c();
                    break;
                }
                break;
            case 2:
                yu1 yu1Var = (yu1) obj;
                if (e82.E(new String[]{"app_theme", "app_theme_accent", "darken_websites_dark_theme", "app_layout", "toolbar_disposition_classic", "toolbar_disposition_tablet", "addressbar_position", "night_mode", "app_font"}).contains(str)) {
                    yu1Var.c();
                    break;
                }
                break;
            case 3:
                zw1 zw1Var = (zw1) obj;
                if ("eula_accepted.gdpr".equals(str) && zw1Var.b.i("eula_accepted.gdpr")) {
                    zw1Var.a();
                    break;
                }
                break;
            case 4:
                igi igiVar = (igi) obj;
                if (((Set) igiVar.g).contains(str)) {
                    igiVar.F0();
                    break;
                }
                break;
            case 5:
                qb7 qb7Var = (qb7) obj;
                if (str.hashCode() == 1672563757 && str.equals("toolbar_bottom_actions")) {
                    qb7Var.z();
                    break;
                }
                break;
            case 6:
                ami amiVar = (ami) obj;
                if (((Set) amiVar.h).contains(str)) {
                    amiVar.E();
                    break;
                }
                break;
            case 7:
                tah tahVar = (tah) obj;
                if (str.hashCode() == 1672563757 && str.equals("toolbar_bottom_actions")) {
                    ((ViewGroup) tahVar.h).removeAllViews();
                    ((hd) tahVar.k).x(vtp.I((SettingsManager) tahVar.c, (fw3) tahVar.d));
                    break;
                }
                break;
            case 8:
                ny3 ny3Var = (ny3) obj;
                if (e82.E(new String[]{"startup_mode", "tab_disposition", "tab_auto_grouping", "ongoing_installation_location_reset"}).contains(str)) {
                    ny3Var.c();
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                dl4 dl4Var = (dl4) obj;
                if (Collections.singleton("automatic_card_save_ask").contains(str)) {
                    dl4Var.g();
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                p35 p35Var = (p35) obj;
                if (str.equals("exit_dialog_enabled")) {
                    p35Var.u.setChecked(p35Var.v.i("exit_dialog_enabled"));
                    p35Var.u.u = new jl4((Object) p35Var, (byte) 13);
                    break;
                }
                break;
            case 11:
                igi igiVar2 = (igi) obj;
                if ("compression".equals(str)) {
                    igiVar2.A0();
                    break;
                }
                break;
            case 12:
                yk6 yk6Var = (yk6) obj;
                int iHashCode = str.hashCode();
                if (iHashCode != 27919559) {
                    if (iHashCode != 1204458606 || !str.equals("ai_assistant_menu_shortcut")) {
                    }
                } else if (!str.equals("ai_assistant_ask_aria")) {
                }
                yk6Var.e();
                break;
            case 13:
                e29 e29Var = (e29) obj;
                if (Arrays.asList("offline_pages_location", "downloads_location", "concurrent_downloads", "ask_before_downloading").contains(str)) {
                    nak nakVar = e29Var.e;
                    SettingsManager settingsManager = e29Var.c;
                    Uri uriM = settingsManager.m();
                    v61 v61Var = e29Var.b;
                    String strJ = sko.j("~/", v61.b(v61Var.a, uriM));
                    if (settingsManager.O()) {
                        t8fVar = s8f.m;
                    } else {
                        t8fVar = new t8f(sko.j("~/", v61.b(v61Var.a, settingsManager.t(false))));
                    }
                    d29 d29Var = new d29(strJ, t8fVar, settingsManager.n("concurrent_downloads"), settingsManager.i("ask_before_downloading"));
                    nakVar.getClass();
                    nakVar.k((Object) null, d29Var);
                    break;
                }
                break;
            case 14:
                wjh wjhVar = (wjh) obj;
                SettingsManager settingsManager2 = (SettingsManager) wjhVar.b;
                if ("enable_newsfeed".equals(str) && !settingsManager2.i("enable_newsfeed") && ((o59) wjhVar.f) != null) {
                    settingsManager2.H((s9) wjhVar.d);
                    wjhVar.f = null;
                    break;
                }
                break;
            case 15:
                ((wj9) obj).b.c();
                break;
            case 16:
                h0a h0aVar = (h0a) obj;
                if ("enable_google_ai_mode".equals(str)) {
                    h0aVar.a();
                    break;
                }
                break;
            case 17:
                x79 x79Var = (x79) obj;
                if ("ongoing_installation_location_reset".equals(str)) {
                    x79Var.P(true);
                    break;
                }
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                p0c p0cVar = (p0c) obj;
                if (str.equals("recommendations_language_region")) {
                    p0cVar.a();
                    break;
                }
                break;
            case 19:
                j1c j1cVar = (j1c) obj;
                if (((Set) j1cVar.f).contains(str)) {
                    j1cVar.k();
                    break;
                }
                break;
            case SizeUtil.textSize0 /* 20 */:
                vpc vpcVar = (vpc) obj;
                if (str.equals("enable_newsfeed")) {
                    vpcVar.b();
                    break;
                }
                break;
            case 21:
                iyc iycVar = (iyc) obj;
                if (iycVar.f == null) {
                    if (str.equals("process_location") || str.equals("eula_accepted.gdpr")) {
                        iycVar.a();
                        break;
                    }
                }
                break;
            case SizeUtil.textSize1 /* 22 */:
                frd frdVar = (frd) obj;
                if (str.hashCode() == 1243576650 && str.equals("media_background_play")) {
                    nak nakVar2 = frdVar.g;
                    erd erdVar = new erd(frdVar.b.i("media_background_play"), ((Boolean) frdVar.e.invoke()).booleanValue(), frdVar.f);
                    nakVar2.getClass();
                    nakVar2.k((Object) null, erdVar);
                    break;
                }
                break;
            case 23:
                hge hgeVar = (hge) obj;
                if (str.equals("my_flow_visible")) {
                    hgeVar.a();
                    break;
                }
                break;
            case SizeUtil.textSize2 /* 24 */:
                wte wteVar = (wte) obj;
                if (wteVar.h.contains(str)) {
                    if (str.equals("recommendations_language_region") && !wteVar.a()) {
                        wteVar.l.e();
                        break;
                    } else {
                        wteVar.b();
                        break;
                    }
                }
                break;
            case 25:
                fue fueVar = (fue) obj;
                if ("news_is_blocked_by_personalization_change".equals(str)) {
                    fueVar.d();
                    break;
                }
                break;
            case 26:
                d3f d3fVar = (d3f) obj;
                if (xsk.e.contains(str)) {
                    d3fVar.g();
                    break;
                }
                break;
            case 27:
                k6g k6gVar = (k6g) obj;
                int iHashCode2 = str.hashCode();
                if (iHashCode2 == -1428838441) {
                    if (str.equals("enable_sync")) {
                        j6g j6gVar = k6gVar.k;
                        boolean zA = j6gVar.a();
                        j6gVar.c.getClass();
                        i6g i6gVar = new i6g(zA, zwk.c(3));
                        if (!Intrinsics.a(j6gVar.e, i6gVar)) {
                            j6gVar.e = i6gVar;
                            j6gVar.d.invoke();
                        }
                        k6gVar.a();
                        break;
                    }
                } else if (iHashCode2 == 722236706 && str.equals("password_manager_autosave")) {
                    k6gVar.a();
                    break;
                }
                break;
            case 28:
                kcg kcgVar = (kcg) obj;
                if (kcgVar.g.contains(str)) {
                    kcgVar.a((ipf) kcgVar.c.d.g());
                    break;
                }
                break;
            default:
                tlg tlgVar = (tlg) obj;
                if (str.hashCode() == -1374344975 && str.equals("speed_dial.plus_button")) {
                    tlgVar.S();
                    break;
                }
                break;
        }
    }
}
