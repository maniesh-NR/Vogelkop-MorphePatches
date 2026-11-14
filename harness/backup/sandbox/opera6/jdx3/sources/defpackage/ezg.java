package defpackage;

import com.opera.android.settings.SettingsManager;
import com.opera.android.startup.WelcomeActivity;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class ezg implements p5j {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ezg(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        boolean zI;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                hzg hzgVar = (hzg) obj;
                if (Arrays.asList("ad_blocking", "tracker_blocker", "accept_cookies", "block_popups", "exit_clear_data_categories", "exit_dialog_enabled").contains(str)) {
                    hzgVar.g();
                    break;
                }
                break;
            case 1:
                ((SettingsManager) obj).Q(str);
                break;
            case 2:
                daj dajVar = (daj) obj;
                if (Arrays.asList("ai_assistant_menu_shortcut", "compression", "ad_blocking", "tracker_blocker", "night_mode").contains(str)) {
                    dajVar.g();
                    break;
                }
                break;
            case 3:
                gyj gyjVar = (gyj) obj;
                if (str.equals("speed_dial.plus_button") && gyjVar.e != (zI = gyjVar.b.i("speed_dial.plus_button"))) {
                    gyjVar.e = zI;
                    ((s9i) gyjVar.c.b).k0(zI);
                    break;
                }
                break;
            case 4:
                w6j w6jVar = (w6j) obj;
                if (((Set) w6jVar.e).contains(str)) {
                    w6jVar.t();
                    break;
                }
                break;
            case 5:
                ne5 ne5Var = (ne5) obj;
                if (str.hashCode() == 1760257413 && str.equals("enable_start_page_customize_button")) {
                    ne5Var.V();
                    break;
                }
                break;
            case 6:
                i7k i7kVar = (i7k) obj;
                if (str.hashCode() == 1174547699 && str.equals("enable_search_shortcuts_tablet")) {
                    i7kVar.A();
                    break;
                }
                break;
            case 7:
                k8k k8kVar = (k8k) obj;
                if (str.hashCode() == -35279278 && str.equals("enable_search_shortcuts")) {
                    k8kVar.A();
                    break;
                }
                break;
            case 8:
                ctl ctlVar = (ctl) obj;
                if (str.hashCode() == 306086345 && str.equals("addressbar_position")) {
                    ctlVar.c();
                }
                if (str.hashCode() == 1066600200 && str.equals("app_layout")) {
                    ctlVar.c();
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                r4m r4mVar = (r4m) obj;
                if ("translation_source".equals(str) && !r4mVar.g.b.E().a) {
                    r4mVar.b0();
                }
                y4m y4mVar = r4mVar.b;
                v3m v3mVar = y4mVar.d;
                if (!"translate_web_pages_enabled".equals(str)) {
                    if ("translate_web_pages_to_language".equals(str)) {
                        szb szbVar = y4mVar.i;
                        szb szbVarD = v3mVar.d();
                        y4mVar.i = szbVarD;
                        if (!Objects.equals(szbVar, szbVarD)) {
                            r4m r4mVar2 = y4mVar.f;
                            if (((d5m) r4mVar2.d.h.g()).b()) {
                                r4mVar2.c0(new o4m(r4mVar2, (byte) 2));
                            }
                            y4mVar.v0();
                            break;
                        }
                    }
                } else {
                    y4mVar.j = v3mVar.g();
                    y4mVar.v0();
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                t6n t6nVar = (t6n) obj;
                if (str.equals("wallpaper_rotation_category") || str.equals("wallpaper_rotation_enabled")) {
                    t6nVar.U(t6nVar.c.d());
                    break;
                }
                break;
            case 11:
                qkn qknVar = (qkn) obj;
                if (str.equals("wallpaper_current")) {
                    qknVar.d();
                    break;
                }
                break;
            case 12:
                qln qlnVar = (qln) obj;
                if ("wallpaper_current".equals(str)) {
                    qlnVar.a(new oln(qlnVar, (byte) 1), 1);
                    break;
                }
                break;
            default:
                WelcomeActivity welcomeActivity = (WelcomeActivity) obj;
                int i = WelcomeActivity.w;
                if ("app_theme_accent".equals(str)) {
                    welcomeActivity.C();
                    break;
                }
                break;
        }
    }
}
