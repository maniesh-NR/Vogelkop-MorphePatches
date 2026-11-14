package ads_mobile_sdk;

import androidx.webkit.Profile;
import defpackage.ybh;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class gq3 extends kuk implements Function2 {
    public final /* synthetic */ Profile a;
    public final /* synthetic */ yq3 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gq3(Profile profile, yq3 yq3Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.a = profile;
        this.b = yq3Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Profile profile = this.a;
        yq3 yq3Var = this.b;
        switch (b) {
            case 0:
                return new gq3(profile, yq3Var, mt5Var, (byte) 0);
            default:
                return new gq3(profile, yq3Var, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Profile profile = this.a;
        yq3 yq3Var = this.b;
        switch (b) {
            case 0:
                return new gq3(profile, yq3Var, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            default:
                return new gq3(profile, yq3Var, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        Profile profile = this.a;
        yq3 yq3Var = this.b;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                AtomicBoolean atomicBoolean = ho3.a;
                qr0 qr0Var = yq3Var.c;
                qr0Var.getClass();
                Set<String> setN0 = CollectionsKt.n0((List) qr0Var.a("gads:webview_quic_hints_domain_list", Arrays.asList("https://fonts.googleapis.com", "https://googleads.g.doubleclick.net", "https://lh3.googleusercontent.com", "https://pagead2.googlesyndication.com", "https://pubads.g.doubleclick.net", "https://redirector.gvt1.com", "https://redirector.gvt1-cn.com", "https://static.doubleclick.net", "https://s0.2mdn.net", "https://s1.2mdn.net", "https://tpc.googlesyndication.com", "https://www.googletagservices.com", "https://www.gstatic.com"), fo.a$15));
                if (ho3.b.get()) {
                    try {
                        profile.addQuicHints(setN0);
                    } catch (Throwable unused) {
                        ho3.b.set(false);
                    }
                }
                break;
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                qr0 qr0Var2 = yq3Var.c;
                qr0Var2.getClass();
                for (String str : (List) qr0Var2.a("gads:webview_preconnect_domain_list", Arrays.asList("https://fonts.googleapis.com", "https://googleads.g.doubleclick.net", "https://lh3.googleusercontent.com", "https://pagead2.googlesyndication.com", "https://pubads.g.doubleclick.net", "https://redirector.gvt1.com", "https://redirector.gvt1-cn.com", "https://static.doubleclick.net", "https://s0.2mdn.net", "https://s1.2mdn.net", "https://tpc.googlesyndication.com", "https://www.googletagservices.com", "https://www.gstatic.com"), fo.a$15)) {
                    AtomicBoolean atomicBoolean2 = ho3.a;
                    if (ho3.c.get()) {
                        try {
                            profile.preconnect(str);
                        } catch (Throwable unused2) {
                            ho3.c.set(false);
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}
