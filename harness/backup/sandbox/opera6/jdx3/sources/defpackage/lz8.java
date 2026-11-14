package defpackage;

import com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.url.Origin;

/* loaded from: classes.dex */
public final /* synthetic */ class lz8 implements Function1 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ lz8(sz8 sz8Var, Fido2PrivilegedApiClient fido2PrivilegedApiClient, cx9 cx9Var, dx3 dx3Var, RenderFrameHost renderFrameHost, Origin origin, boolean z, ek2 ek2Var) {
        this.c = sz8Var;
        this.d = fido2PrivilegedApiClient;
        this.e = cx9Var;
        this.f = dx3Var;
        this.g = renderFrameHost;
        this.h = origin;
        this.b = z;
        this.i = ek2Var;
    }

    public /* synthetic */ lz8(ue5 ue5Var, g1b g1bVar, utm utmVar, Function0 function0, Function0 function02, Function0 function03, Function1 function1, boolean z) {
        this.c = g1bVar;
        this.d = function1;
        this.b = z;
        this.e = utmVar;
        this.f = function0;
        this.g = function02;
        this.h = function03;
        this.i = ue5Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (b) {
            case 0:
                ((sz8) obj8).g((Fido2PrivilegedApiClient) obj7, (cx9) obj6, (dx3) obj5, (RenderFrameHost) obj4, (Origin) obj3, this.b, (ek2) obj2, (byte[]) obj);
                break;
            default:
                g1b g1bVar = (g1b) obj8;
                Function1 function1 = (Function1) obj7;
                Function0 function0 = (Function0) obj5;
                Function0 function02 = (Function0) obj4;
                Function0 function03 = (Function0) obj3;
                ue5 ue5Var = (ue5) obj2;
                h6c h6cVar = (h6c) obj;
                h6c.O(h6cVar, "balance-bar", new ue5(903495323, new x6d((utm) obj6, (byte) 0), true), 2);
                if (g1bVar != null) {
                    h6c.O(h6cVar, "nav-buttons", new ue5(-1161040074, new l5c(g1bVar, function0, function02, function03, (byte) 6), true), 2);
                }
                function1.invoke(h6cVar);
                if (this.b) {
                    h6c.O(h6cVar, "legal-disclaimer", new ue5(-1440289811, new uhf(ue5Var, (byte) 2), true), 2);
                }
                break;
        }
        return Unit.a;
    }
}
