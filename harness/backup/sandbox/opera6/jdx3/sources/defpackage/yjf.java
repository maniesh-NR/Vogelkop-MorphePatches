package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class yjf {
    public static final Map a;
    public static final Set b;

    static {
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        map.put("media", rr4.a(2132020055, 2, "media", false, false, 1));
        hashSet.add("media");
        map.put("screen_capture", rr4.a(2132020062, 4, "screen_capture", false, false, 1));
        hashSet.add("screen_capture");
        map.put("news", new rr4("news", 2132020057, 2, true, false, 1, true, true));
        hashSet.add("news");
        map.put("downloads_active", rr4.a(2132020050, 2, "downloads_active", false, false, 0));
        hashSet.add("downloads_active");
        map.put("downloads_finished", rr4.a(2132020051, 1, "downloads_finished", true, false, 0));
        hashSet.add("downloads_finished");
        map.put("other", new rr4("other", 2132020059, 2, true, false, 0, false, true));
        hashSet.add("other");
        map.put("private_tabs", rr4.a(2132020060, 2, "private_tabs", true, false, 0));
        hashSet.add("private_tabs");
        map.put("com_appboy_default_notification_channel", new rr4("com_appboy_default_notification_channel", 2132020210, 3, true, false, 1, false, true));
        hashSet.add("com_appboy_default_notification_channel");
        map.put("wallet", new rr4("wallet", 2132020065, 4, true, false, 0, false, true));
        hashSet.add("wallet");
        map.put("installation", new rr4("installation", 2132020054, 4, true, false, 1, false, true));
        hashSet.add("installation");
        map.put("offline_pages_migration", rr4.a(2132020058, 2, "offline_pages_migration", false, false, 0));
        hashSet.add("offline_pages_migration");
        map.put("flow", new rr4("flow", 2132020052, 3, true, false, 0, false, true));
        hashSet.add("flow");
        map.put("account_and_subscriptions", new rr4("account_and_subscriptions", 2132020046, 4, true, false, 0, true, true));
        hashSet.add("account_and_subscriptions");
        map.put("livescore", new rr4("livescore", 2132019526, 4, true, false, 1, true, true));
        hashSet.add("livescore");
        map.put("rewards", new rr4("rewards", 2132020061, 4, true, false, 1, false, true));
        map.put("weather_forecast", rr4.a(2132020048, 2, "weather_forecast", false, true, 1));
        hashSet.add("weather_forecast");
        map.put("weather_alerts", new rr4("weather_alerts", 2132020063, 4, false, false, 1, true, true));
        hashSet.add("weather_alerts");
        map.put("esim", new rr4("esim", 2132018896, 3, false, false, 1, true, true));
        hashSet.add("esim");
        a = Collections.unmodifiableMap(map);
        b = Collections.unmodifiableSet(hashSet);
    }
}
