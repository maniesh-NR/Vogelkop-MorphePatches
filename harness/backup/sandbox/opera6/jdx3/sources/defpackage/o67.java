package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class o67 {
    public static final j5j a;
    public static final List b;

    static {
        g5j g5jVar = h5j.b;
        Boolean bool = Boolean.FALSE;
        c67 c67Var = new c67(p57.b, new ah5((byte) 28));
        l5j l5jVar = l5j.b;
        j5j j5jVar = new j5j("Developer mode", "If enabled the app enables other developer settings", g5jVar, l5jVar, bool, c67Var);
        f5j f5jVar = h5j.a;
        j5j j5jVar2 = new j5j("Use staging Mobile Auth", "If enabled the app connects to the staging Mobile Auth server", f5jVar, l5jVar, bool, new c67(m67.b, new l57((byte) 0)));
        j5j j5jVar3 = new j5j("Use test net", "Specifies which blockchain the app connects to", g5jVar, l5jVar, bool, new c67(b67.b, new l57((byte) 9)));
        j5j j5jVar4 = new j5j("Debuggable web views", "If enabled, WebViews are enabled for debugging", new n57((byte) 0), l5jVar, bool, new c67(n67.b, new l57((byte) 19)));
        j5j j5jVar5 = new j5j("Country code", "2-letter country code used in various MiniPay APIs", f5jVar, new n5j(new m57((byte) 5), new u4h((byte) 15)), "", new c67(o57.b, new l57((byte) 20)));
        j5j j5jVar6 = new j5j("Simulate full cloud storage", "If enabled, cloud storage used for backups will be considered full", f5jVar, l5jVar, bool, new c67(g67.b, new l57((byte) 21)));
        j5j j5jVar7 = new j5j("Simulate save error from cloud storage", "If enabled, cloud storage returns an error upon save", f5jVar, l5jVar, bool, new c67(h67.b, new l57((byte) 22)));
        j5j j5jVar8 = new j5j("Timeout in minutes to reset navigation", "After this period (in minutes) in background, the app should navigate back to the home screen", f5jVar, new n5j(m5j.b, new m57((byte) 0), a67.a), 60, new c67(new m57((byte) 3), new l57((byte) 23)));
        j5j j5jVar9 = new j5j("Highlight provisional transactions", "Highlight transactions that are not received from the history api with \"provisional\".", g5jVar, l5jVar, bool, new c67(new m57((byte) 6), new l57((byte) 24)));
        j5j j5jVar10 = new j5j("Enable Virtual Account", "Overrides Firebase feature flag, and enables user to create virtual account", f5jVar, l5jVar, bool, new c67(u57.b, new l57((byte) 25)));
        k5j k5jVar = new k5j(uqh.a(t97.class), e82.B(t97.values()));
        t97.a.getClass();
        j5j j5jVar11 = new j5j("Discover environment", "Select which environment should be used as the data source for the Discover feature", f5jVar, k5jVar, t97.b, new c67(new m57((byte) 7), new l57((byte) 26)));
        Boolean bool2 = Boolean.TRUE;
        j5j j5jVar12 = new j5j("Filter discover data", "Whether we should filter featured cards and mini apps according to the user's country, platform, app type, and app version.", f5jVar, l5jVar, bool2, new c67(y57.b, new l57((byte) 27)));
        j5j j5jVar13 = new j5j("Show provider label for Local Payments", "Whether the local payment should display a label with the provider name", f5jVar, l5jVar, bool, new c67(f67.b, new ah5((byte) 29)));
        j5j j5jVar14 = new j5j("Enable digital cards", "Enables virtual cards powered by Gnosis", f5jVar, l5jVar, bool, new c67(v57.b, new l57((byte) 1)));
        j5j j5jVar15 = new j5j("Enable WalletConnect Pay", "Lets a scanned WalletConnect Pay link open the payment screen.", g5jVar, l5jVar, bool, new c67(w57.b, new l57((byte) 2)));
        j5j j5jVar16 = new j5j("Use native Intercom messenger", "Opens support in the native Intercom SDK instead of the web messenger. Experimental, and the session is unverified until the backend serves identity verification tokens.", f5jVar, l5jVar, bool, new c67(s57.b, new l57((byte) 3)));
        j5j j5jVar17 = new j5j("Use fake Gnosis API", "Test against mocked virtual cards API", f5jVar, l5jVar, bool, new c67(k67.b, new l57((byte) 4)));
        j5j j5jVar18 = new j5j("Use Gnosis sandbox", "Connect to the Gnosis sandbox environment instead of production", f5jVar, l5jVar, bool, new c67(l67.b, new l57((byte) 5)));
        j5j j5jVar19 = new j5j("Fail Gnosis API", "Fail all the requests to the Gnosis API", f5jVar, l5jVar, bool, new c67(x57.b, new l57((byte) 6)));
        j5j j5jVar20 = new j5j("Skip virtual card account restoration during onboarding", "Skips virtual card account restoration during onboarding in order to show the 'Restore Card' screen in the Cards tab.", f5jVar, l5jVar, bool, new c67(i67.b, new l57((byte) 7)));
        k5j k5jVar2 = new k5j(uqh.a(nan.class), nan.e);
        nan.b.getClass();
        j5j j5jVar21 = new j5j("Virtual card provider", "Set the current virtual card provider to be used in MiniPay", f5jVar, k5jVar2, nan.c, new c67(new tb6((byte) 29), new l57((byte) 8)));
        j5j j5jVar22 = new j5j("Rain API key", "API key sent to the Rain cards API. Not shipped with the app — paste your own, otherwise Rain requests are rejected.", f5jVar, new n5j(new m57((byte) 1), new u4h((byte) 15)), "", new c67(d67.b, new l57((byte) 10)));
        j5j j5jVar23 = new j5j("Enable Sumsub KYC", "Enables entry point UI to go through Sumsub KYC, and authorize MiniPay to share data", f5jVar, l5jVar, bool, new c67(t57.b, new l57((byte) 11)));
        j5j j5jVar24 = new j5j("Force lock screen", "Force enable lock screen", f5jVar, l5jVar, bool, new c67(z57.b, new l57((byte) 12)));
        k5j k5jVar3 = new k5j(uqh.a(ft8.class), e82.B(ft8.values()));
        ft8.a.getClass();
        j5j j5jVar25 = new j5j("Feature config API environment", "Select which environment (endpoint) should be used for the Feature config API", f5jVar, k5jVar3, ft8.b, new c67(new m57((byte) 2), new l57((byte) 13)));
        j5j j5jVar26 = new j5j("Squid withdraws", "Withdraw to exchange with squid", f5jVar, l5jVar, bool, new c67(j67.b, new l57((byte) 14)));
        j5j j5jVar27 = new j5j("Enable Daimo Apple Pay", "Overrides platform and country checks to enable Daimo Apple Pay in the deposit sheet", f5jVar, l5jVar, bool, new c67(r57.b, new l57((byte) 15)));
        j5j j5jVar28 = new j5j("Dynamic tipping", "Use dynamic tip calculation when estimating transaction fees", f5jVar, l5jVar, bool2, new c67(q57.b, new l57((byte) 16)));
        a = j5jVar28;
        j5j j5jVar29 = new j5j("Report to Peek", "If enabled, internal stats reports are sent to Peek for inspection", f5jVar, l5jVar, bool, new c67(e67.b, new l57((byte) 17)));
        k5j k5jVar4 = new k5j(uqh.a(nrk.class), e82.B(nrk.values()));
        nrk.a.getClass();
        b = Arrays.asList(j5jVar, j5jVar3, j5jVar4, j5jVar2, j5jVar5, j5jVar6, j5jVar7, j5jVar8, j5jVar9, j5jVar10, j5jVar13, j5jVar11, j5jVar12, j5jVar14, j5jVar15, j5jVar16, j5jVar17, j5jVar18, j5jVar19, j5jVar20, j5jVar21, j5jVar22, j5jVar23, j5jVar24, j5jVar26, j5jVar25, j5jVar27, j5jVar28, j5jVar29, new j5j("Sumsub environment", "Select which environment should be used for the Sumsub KYC flow", f5jVar, k5jVar4, nrk.b, new c67(new m57((byte) 4), new l57((byte) 18))));
    }
}
