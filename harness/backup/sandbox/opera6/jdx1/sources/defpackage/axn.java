package defpackage;

import androidx.webkit.WebViewFeature;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class axn {
    public static final li1 A;
    public static final li1 B;
    public static final li1 C;
    public static final li1 D;
    public static final li1 E;
    public static final li1 F;
    public static final li1 G;
    public static final li1 a;
    public static final li1 b;
    public static final li1 c;
    public static final li1 d;
    public static final li1 e;
    public static final li1 f;
    public static final li1 g;
    public static final li1 h;
    public static final li1 i;
    public static final li1 j;
    public static final li1 k;
    public static final li1 l;
    public static final li1 m;
    public static final li1 n;
    public static final li1 o;
    public static final li1 p;
    public static final zwn q;
    public static final li1 r;
    public static final zwn s;
    public static final li1 t;
    public static final li1 u;
    public static final li1 v;
    public static final li1 w;
    public static final li1 x;
    public static final li1 y;
    public static final li1 z;

    static {
        new li1(WebViewFeature.VISUAL_STATE_CALLBACK, WebViewFeature.VISUAL_STATE_CALLBACK, (byte) 0);
        new li1(WebViewFeature.OFF_SCREEN_PRERASTER, WebViewFeature.OFF_SCREEN_PRERASTER, (byte) 0);
        new li1(WebViewFeature.SAFE_BROWSING_ENABLE, WebViewFeature.SAFE_BROWSING_ENABLE, (byte) 3);
        new li1(WebViewFeature.DISABLED_ACTION_MODE_MENU_ITEMS, WebViewFeature.DISABLED_ACTION_MODE_MENU_ITEMS, (byte) 1);
        a = new li1(WebViewFeature.START_SAFE_BROWSING, WebViewFeature.START_SAFE_BROWSING, (byte) 4);
        new li1(WebViewFeature.SAFE_BROWSING_WHITELIST, WebViewFeature.SAFE_BROWSING_WHITELIST, (byte) 4);
        new li1(WebViewFeature.SAFE_BROWSING_WHITELIST, WebViewFeature.SAFE_BROWSING_ALLOWLIST, (byte) 4);
        b = new li1(WebViewFeature.SAFE_BROWSING_ALLOWLIST, WebViewFeature.SAFE_BROWSING_WHITELIST, (byte) 4);
        c = new li1(WebViewFeature.SAFE_BROWSING_ALLOWLIST, WebViewFeature.SAFE_BROWSING_ALLOWLIST, (byte) 4);
        d = new li1(WebViewFeature.SAFE_BROWSING_PRIVACY_POLICY_URL, WebViewFeature.SAFE_BROWSING_PRIVACY_POLICY_URL, (byte) 4);
        new li1(WebViewFeature.SERVICE_WORKER_BASIC_USAGE, WebViewFeature.SERVICE_WORKER_BASIC_USAGE, (byte) 1);
        new li1(WebViewFeature.SERVICE_WORKER_CACHE_MODE, WebViewFeature.SERVICE_WORKER_CACHE_MODE, (byte) 1);
        new li1(WebViewFeature.SERVICE_WORKER_CONTENT_ACCESS, WebViewFeature.SERVICE_WORKER_CONTENT_ACCESS, (byte) 1);
        new li1(WebViewFeature.SERVICE_WORKER_FILE_ACCESS, WebViewFeature.SERVICE_WORKER_FILE_ACCESS, (byte) 1);
        new li1(WebViewFeature.SERVICE_WORKER_BLOCK_NETWORK_LOADS, WebViewFeature.SERVICE_WORKER_BLOCK_NETWORK_LOADS, (byte) 1);
        new li1(WebViewFeature.SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST, WebViewFeature.SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST, (byte) 1);
        new li1(WebViewFeature.RECEIVE_WEB_RESOURCE_ERROR, WebViewFeature.RECEIVE_WEB_RESOURCE_ERROR, (byte) 0);
        new li1(WebViewFeature.RECEIVE_HTTP_ERROR, WebViewFeature.RECEIVE_HTTP_ERROR, (byte) 0);
        new li1(WebViewFeature.SHOULD_OVERRIDE_WITH_REDIRECTS, WebViewFeature.SHOULD_OVERRIDE_WITH_REDIRECTS, (byte) 1);
        new li1(WebViewFeature.SAFE_BROWSING_HIT, WebViewFeature.SAFE_BROWSING_HIT, (byte) 4);
        new li1(WebViewFeature.WEB_RESOURCE_REQUEST_IS_REDIRECT, WebViewFeature.WEB_RESOURCE_REQUEST_IS_REDIRECT, (byte) 1);
        new li1(WebViewFeature.WEB_RESOURCE_ERROR_GET_DESCRIPTION, WebViewFeature.WEB_RESOURCE_ERROR_GET_DESCRIPTION, (byte) 0);
        new li1(WebViewFeature.WEB_RESOURCE_ERROR_GET_CODE, WebViewFeature.WEB_RESOURCE_ERROR_GET_CODE, (byte) 0);
        new li1(WebViewFeature.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY, WebViewFeature.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY, (byte) 4);
        new li1(WebViewFeature.SAFE_BROWSING_RESPONSE_PROCEED, WebViewFeature.SAFE_BROWSING_RESPONSE_PROCEED, (byte) 4);
        new li1(WebViewFeature.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL, WebViewFeature.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL, (byte) 4);
        new li1(WebViewFeature.WEB_MESSAGE_PORT_POST_MESSAGE, WebViewFeature.WEB_MESSAGE_PORT_POST_MESSAGE, (byte) 0);
        new li1(WebViewFeature.WEB_MESSAGE_PORT_CLOSE, WebViewFeature.WEB_MESSAGE_PORT_CLOSE, (byte) 0);
        e = new li1(WebViewFeature.WEB_MESSAGE_ARRAY_BUFFER, WebViewFeature.WEB_MESSAGE_ARRAY_BUFFER, (byte) 2);
        new li1(WebViewFeature.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK, WebViewFeature.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK, (byte) 0);
        new li1(WebViewFeature.CREATE_WEB_MESSAGE_CHANNEL, WebViewFeature.CREATE_WEB_MESSAGE_CHANNEL, (byte) 0);
        f = new li1(WebViewFeature.POST_WEB_MESSAGE, WebViewFeature.POST_WEB_MESSAGE, (byte) 0);
        new li1(WebViewFeature.WEB_MESSAGE_CALLBACK_ON_MESSAGE, WebViewFeature.WEB_MESSAGE_CALLBACK_ON_MESSAGE, (byte) 0);
        g = new li1(WebViewFeature.GET_WEB_VIEW_CLIENT, WebViewFeature.GET_WEB_VIEW_CLIENT, (byte) 3);
        h = new li1(WebViewFeature.GET_WEB_CHROME_CLIENT, WebViewFeature.GET_WEB_CHROME_CLIENT, (byte) 3);
        i = new li1(WebViewFeature.GET_WEB_VIEW_RENDERER, WebViewFeature.GET_WEB_VIEW_RENDERER, (byte) 6);
        new li1(WebViewFeature.WEB_VIEW_RENDERER_TERMINATE, WebViewFeature.WEB_VIEW_RENDERER_TERMINATE, (byte) 6);
        new li1(WebViewFeature.TRACING_CONTROLLER_BASIC_USAGE, WebViewFeature.TRACING_CONTROLLER_BASIC_USAGE, (byte) 5);
        new h9k();
        new h9k();
        new h9k();
        j = new li1(WebViewFeature.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE, WebViewFeature.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE, (byte) 6);
        new li1(WebViewFeature.ALGORITHMIC_DARKENING, WebViewFeature.ALGORITHMIC_DARKENING, (byte) 7);
        Pattern.compile("\\A\\d+");
        new li1(WebViewFeature.PROXY_OVERRIDE, "PROXY_OVERRIDE:3", (byte) 2);
        k = new li1(WebViewFeature.MULTI_PROCESS, "MULTI_PROCESS_QUERY", (byte) 2);
        l = new li1(WebViewFeature.FORCE_DARK, WebViewFeature.FORCE_DARK, (byte) 6);
        m = new li1(WebViewFeature.FORCE_DARK_STRATEGY, "FORCE_DARK_BEHAVIOR", (byte) 2);
        n = new li1(WebViewFeature.WEB_MESSAGE_LISTENER, WebViewFeature.WEB_MESSAGE_LISTENER, (byte) 2);
        o = new li1(WebViewFeature.DOCUMENT_START_SCRIPT, "DOCUMENT_START_SCRIPT:1", (byte) 2);
        new li1(WebViewFeature.PROXY_OVERRIDE_REVERSE_BYPASS, WebViewFeature.PROXY_OVERRIDE_REVERSE_BYPASS, (byte) 2);
        p = new li1(WebViewFeature.GET_VARIATIONS_HEADER, WebViewFeature.GET_VARIATIONS_HEADER, (byte) 2);
        new li1(WebViewFeature.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY, WebViewFeature.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY, (byte) 2);
        new li1(WebViewFeature.GET_COOKIE_INFO, WebViewFeature.GET_COOKIE_INFO, (byte) 2);
        new li1(WebViewFeature.REQUESTED_WITH_HEADER_ALLOW_LIST, WebViewFeature.REQUESTED_WITH_HEADER_ALLOW_LIST, (byte) 2);
        new li1(WebViewFeature.USER_AGENT_METADATA, WebViewFeature.USER_AGENT_METADATA, (byte) 2);
        new zwn(WebViewFeature.USER_AGENT_METADATA_FORM_FACTORS, WebViewFeature.USER_AGENT_METADATA, (byte) 0);
        q = new zwn(WebViewFeature.MULTI_PROFILE, WebViewFeature.MULTI_PROFILE, (byte) 1);
        new li1(WebViewFeature.ATTRIBUTION_REGISTRATION_BEHAVIOR, "ATTRIBUTION_BEHAVIOR", (byte) 2);
        new li1(WebViewFeature.WEBVIEW_MEDIA_INTEGRITY_API_STATUS, "WEBVIEW_INTEGRITY_API_STATUS", (byte) 2);
        r = new li1(WebViewFeature.MUTE_AUDIO, WebViewFeature.MUTE_AUDIO, (byte) 2);
        new li1(WebViewFeature.WEB_AUTHENTICATION, WebViewFeature.WEB_AUTHENTICATION, (byte) 2);
        new li1(WebViewFeature.SPECULATIVE_LOADING, "SPECULATIVE_LOADING", (byte) 2);
        new li1(WebViewFeature.BACK_FORWARD_CACHE, WebViewFeature.BACK_FORWARD_CACHE, (byte) 2);
        new li1(WebViewFeature.BACK_FORWARD_CACHE_SETTINGS, WebViewFeature.BACK_FORWARD_CACHE_SETTINGS, (byte) 2);
        new li1(WebViewFeature.DELETE_BROWSING_DATA, "WEB_STORAGE_DELETE_BROWSING_DATA", (byte) 2);
        s = new zwn(WebViewFeature.PROFILE_URL_PREFETCH, WebViewFeature.PROFILE_URL_PREFETCH, (byte) 2);
        t = new li1("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP", (byte) 2);
        u = new li1("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP_ASYNC_STARTUP_LOCATIONS", (byte) 2);
        v = new li1(WebViewFeature.DEFAULT_TRAFFICSTATS_TAGGING, WebViewFeature.DEFAULT_TRAFFICSTATS_TAGGING, (byte) 2);
        w = new li1(WebViewFeature.PRERENDER_WITH_URL, "PRERENDER_URL_V3", (byte) 2);
        x = new li1(WebViewFeature.SPECULATIVE_LOADING_CONFIG, WebViewFeature.SPECULATIVE_LOADING_CONFIG, (byte) 2);
        y = new li1(WebViewFeature.SAVE_STATE, WebViewFeature.SAVE_STATE, (byte) 2);
        z = new li1(WebViewFeature.NAVIGATION_CALLBACK_BASIC, WebViewFeature.NAVIGATION_CALLBACK_BASIC, (byte) 2);
        A = new li1(WebViewFeature.NAVIGATION_LISTENER_V1, "WEB_VIEW_NAVIGATION_LISTENER_V1", (byte) 2);
        B = new li1(WebViewFeature.PROVIDER_WEAKLY_REF_WEBVIEW, WebViewFeature.PROVIDER_WEAKLY_REF_WEBVIEW, (byte) 2);
        new li1(WebViewFeature.PAYMENT_REQUEST, WebViewFeature.PAYMENT_REQUEST, (byte) 2);
        new li1(WebViewFeature.WEBVIEW_BUILDER_EXPERIMENTAL_V1, "WEBVIEW_BUILDER_V1", (byte) 2);
        new li1(WebViewFeature.COOKIE_INTERCEPT, WebViewFeature.COOKIE_INTERCEPT, (byte) 2);
        C = new li1(WebViewFeature.WARM_UP_RENDERER_PROCESS, WebViewFeature.WARM_UP_RENDERER_PROCESS, (byte) 2);
        D = new li1(WebViewFeature.ORIGIN_MATCHED_HEADERS, "EXTRA_HEADER_FOR_ORIGINS", (byte) 2);
        E = new li1(WebViewFeature.CUSTOM_REQUEST_HEADERS, WebViewFeature.CUSTOM_REQUEST_HEADERS, (byte) 2);
        new h9k();
        new h9k();
        new h9k();
        F = new li1(WebViewFeature.PRECONNECT, WebViewFeature.PRECONNECT, (byte) 2);
        G = new li1(WebViewFeature.ADD_QUIC_HINTS_V1, "ADD_QUIC_HINTS_V1", (byte) 2);
        new li1(WebViewFeature.HYPERLINK_CONTEXT_MENU_ITEMS, WebViewFeature.HYPERLINK_CONTEXT_MENU_ITEMS, (byte) 2);
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0041. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(java.lang.String r5) {
        /*
            java.util.HashSet r0 = defpackage.li1.d
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r0.next()
            li1 r2 = (defpackage.li1) r2
            java.lang.String r3 = r2.a
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto Lf
            r1.add(r2)
            goto Lf
        L27:
            boolean r0 = r1.isEmpty()
            r2 = 0
            if (r0 != 0) goto L57
            java.util.Iterator r5 = r1.iterator()
        L32:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r5.next()
            li1 r0 = (defpackage.li1) r0
            byte r1 = r0.c
            r3 = 1
            switch(r1) {
                case 0: goto L4c;
                case 1: goto L4c;
                case 2: goto L4a;
                case 3: goto L4c;
                case 4: goto L4c;
                case 5: goto L4c;
                case 6: goto L4c;
                default: goto L44;
            }
        L44:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r1 >= r4) goto L4c
        L4a:
            r1 = r2
            goto L4d
        L4c:
            r1 = r3
        L4d:
            if (r1 != 0) goto L55
            boolean r0 = r0.a()
            if (r0 == 0) goto L32
        L55:
            return r3
        L56:
            return r2
        L57:
            java.lang.String r0 = "Unknown feature "
            java.lang.String r5 = r0.concat(r5)
            h9o.r(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axn.b(java.lang.String):boolean");
    }
}
