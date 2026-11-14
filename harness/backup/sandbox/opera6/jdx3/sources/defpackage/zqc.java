package defpackage;

import J.N;
import android.content.res.Resources;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.browser.chromium.OperaBrowserContextHandle;
import com.opera.android.settings.SettingsManager;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class zqc implements lkf {
    public final dx3 a;
    public final dw3 b;
    public final j4c c;
    public final dw3 d;
    public final dw3 e;
    public final ew3 f;
    public final ew3 g;
    public final wyn h;
    public final umi i;
    public final dw3 j;
    public final dw3 k;
    public final dw3 l;
    public final dw3 m;
    public final dw3 n;
    public final zyk o;
    public final zyk p;
    public final zyk q;

    public zqc(dx3 dx3Var, dw3 dw3Var, j4c j4cVar, dw3 dw3Var2, uu1 uu1Var, dw3 dw3Var3, ew3 ew3Var, ew3 ew3Var2, wyn wynVar, umi umiVar, dw3 dw3Var4, dw3 dw3Var5, dw3 dw3Var6, dw3 dw3Var7, dw3 dw3Var8) {
        this.a = dx3Var;
        this.b = dw3Var;
        this.c = j4cVar;
        this.d = dw3Var2;
        this.e = dw3Var3;
        this.f = ew3Var;
        this.g = ew3Var2;
        this.h = wynVar;
        this.i = umiVar;
        this.j = dw3Var4;
        this.k = dw3Var5;
        this.l = dw3Var6;
        this.m = dw3Var7;
        this.n = dw3Var8;
        final byte b = 0;
        this.o = z4c.b(new Function0(this) { // from class: xqc
            public final /* synthetic */ zqc b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                zqc zqcVar = this.b;
                switch (b2) {
                    case 0:
                        return new sqc(zqcVar.a, zqcVar.i);
                    case 1:
                        return new vrc(zqcVar.a, zqcVar.b.b.J(), zqcVar.c, zqcVar.d, (orm) zqcVar.e.get(), zqcVar.h, new vx(zqcVar, (byte) 23), zqcVar.j, zqcVar.k, zqcVar.l, zqcVar.m);
                    default:
                        return new wll(zqcVar.a);
                }
            }
        });
        final byte b2 = 1;
        this.p = z4c.b(new Function0(this) { // from class: xqc
            public final /* synthetic */ zqc b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                zqc zqcVar = this.b;
                switch (b22) {
                    case 0:
                        return new sqc(zqcVar.a, zqcVar.i);
                    case 1:
                        return new vrc(zqcVar.a, zqcVar.b.b.J(), zqcVar.c, zqcVar.d, (orm) zqcVar.e.get(), zqcVar.h, new vx(zqcVar, (byte) 23), zqcVar.j, zqcVar.k, zqcVar.l, zqcVar.m);
                    default:
                        return new wll(zqcVar.a);
                }
            }
        });
        final byte b3 = 2;
        this.q = z4c.b(new Function0(this) { // from class: xqc
            public final /* synthetic */ zqc b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b3;
                zqc zqcVar = this.b;
                switch (b22) {
                    case 0:
                        return new sqc(zqcVar.a, zqcVar.i);
                    case 1:
                        return new vrc(zqcVar.a, zqcVar.b.b.J(), zqcVar.c, zqcVar.d, (orm) zqcVar.e.get(), zqcVar.h, new vx(zqcVar, (byte) 23), zqcVar.j, zqcVar.k, zqcVar.l, zqcVar.m);
                    default:
                        return new wll(zqcVar.a);
                }
            }
        });
    }

    public final Fragment b(Class cls) throws Resources.NotFoundException {
        if (!Intrinsics.a(cls, lrc.class)) {
            return null;
        }
        vrc vrcVar = (vrc) this.p.getValue();
        boolean zBooleanValue = ((Boolean) this.g.get()).booleanValue();
        xd5 xd5Var = vrcVar.a;
        List listY = StringsKt.Y("", new String[]{"#"}, 0, 6);
        Uri.Builder builderEncodedPath = Uri.parse("opera-livescore://ui/").buildUpon().encodedPath((String) CollectionsKt.K(listY));
        if (listY.size() > 1) {
            builderEncodedPath.encodedFragment((String) listY.get(1));
        }
        Uri uriBuild = builderEncodedPath.build();
        SettingsManager settingsManager = vrcVar.b;
        Resources resources = xd5Var.getResources();
        String scheme = uriBuild.getScheme();
        if (scheme == null) {
            scheme = "";
        }
        String host = uriBuild.getHost();
        String str = host != null ? host : "";
        boolean z = resources.getBoolean(2131034131);
        if (scheme.length() != 0 && str.length() != 0) {
            N.MdX$dmbm(zBooleanValue ? (OperaBrowserContextHandle) N.MGWafL4o() : (OperaBrowserContextHandle) N.M4QvXpDD(), scheme, str, oup.n0(djh.c(settingsManager.n("default_webpage_zoom"), 50, z ? 200 : 130)));
        }
        WebContentsWrapper webContentsWrapper = new WebContentsWrapper(xd5Var.j, (WebContents) N.M_FZHKB_(zBooleanValue, false), 7);
        webContentsWrapper.g(null);
        SettingsManager settingsManager2 = vrcVar.b;
        d06 d06Var = dp7.a;
        z8b z8bVar = (z8b) d06Var.a;
        ua7 ua7Var = (ua7) z8bVar.a;
        if (ua7Var != null) {
            ua7Var.C(xd5Var);
        }
        urc urcVar = new urc(webContentsWrapper, new g8c(vrcVar), new rkc((Object) vrcVar, (byte) 9), settingsManager2, z8bVar.E(xd5Var), vrcVar.c, vrcVar.e, vrcVar.f, vrcVar.g, (cs6) vrcVar.h.get(), (xoc) vrcVar.i.get(), vrcVar.j, vrcVar.k);
        z8b z8bVar2 = (z8b) d06Var.a;
        ua7 ua7Var2 = (ua7) z8bVar2.a;
        xd5 xd5Var2 = this.a;
        if (ua7Var2 != null) {
            ua7Var2.C(xd5Var2);
        }
        return new lrc(urcVar, new qrc(urcVar, z8bVar2.E(xd5Var2), new dnb(xd5Var2, (byte) 12)), (wll) this.q.getValue(), this.n.b.B(), this.f, new yqc(urcVar), u55.Ro, (orm) this.e.get());
    }
}
