package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class owa {
    public static final long j;
    public static final long k;
    public static final /* synthetic */ int l = 0;
    public final Context a;
    public final ShapeDrawable b;
    public final fwk c;
    public final o92 d;
    public final zyk e;
    public final ld9 f;
    public final jwa g;
    public final zyk h;
    public final nwa i;

    static {
        on7 on7Var = pn7.b;
        un7 un7Var = un7.d;
        j = cs5.x0(1000, un7Var);
        k = cs5.x0(5000, un7Var);
    }

    public owa(Context context, kze kzeVar, p12 p12Var, dll dllVar) throws Resources.NotFoundException {
        this.a = context;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.b = shapeDrawable;
        final byte b = 1;
        fwk fwkVar = new fwk(true);
        this.c = fwkVar;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165329);
        ixh ixhVar = wz3.a;
        this.d = ic4.R(new LayerDrawable(new w3a[]{new w3a(ic4.R(shapeDrawable, dimensionPixelSize - (ixhVar.k(context) << 1)), 17, true), new w3a(ic4.R(fwkVar, (context.getResources().getDimensionPixelSize(2131165329) - (ixhVar.k(context) << 1)) - (z7h.h(context, 2.0f) << 1)), 17, true)}), context.getResources().getDimensionPixelSize(2131165329));
        this.e = z4c.b(new hv((Object) this, (Object) dllVar, (Object) kzeVar, (byte) 16));
        this.f = new ld9(this, (byte) 24);
        jwa jwaVar = new jwa(kzeVar, k);
        this.g = jwaVar;
        this.h = z4c.b(new be8((byte) 22));
        final byte b2 = 0;
        this.i = new nwa(this, (byte) 0);
        a26.V(dllVar, kzeVar, new rw0(this, (byte) 5));
        a26.T((kze) p12Var.b, kzeVar, new f7f(this) { // from class: mwa
            public final /* synthetic */ owa b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b2;
                owa owaVar = this.b;
                switch (b3) {
                    case 0:
                        vjd vjdVar = (vjd) obj;
                        jwa jwaVar2 = owaVar.g;
                        hwa hwaVar = new hwa(vjdVar.m);
                        ArrayList arrayListJ = j95.j(new hwa[]{hwaVar});
                        Bundle bundle = vjdVar.I;
                        String[] stringArray = bundle != null ? bundle.getStringArray("com.opera.android.media.AI_POD_ICONS") : null;
                        if (stringArray != null && stringArray.length != 0) {
                            for (String str : stringArray) {
                                if (str != null) {
                                    Uri uri = Uri.parse(str);
                                    if (!Intrinsics.a(uri, hwaVar.a)) {
                                        arrayListJ.add(new hwa(uri));
                                    }
                                }
                            }
                        }
                        if (!arrayListJ.equals(jwaVar2.c)) {
                            jwaVar2.c = arrayListJ;
                            jwaVar2.d = 0;
                            jwaVar2.a();
                            jwaVar2.b();
                            break;
                        }
                        break;
                    default:
                        hwa hwaVar2 = (hwa) obj;
                        zyk zykVar = owaVar.h;
                        deg degVar = (deg) zykVar.getValue();
                        nwa nwaVar = owaVar.i;
                        degVar.b(nwaVar);
                        Context context2 = owaVar.a;
                        deg degVar2 = (deg) zykVar.getValue();
                        Uri uri2 = hwaVar2 != null ? hwaVar2.a : null;
                        int iH = z7h.h(context2, 128.0f);
                        dwh dwhVarG = degVar2.g(uri2);
                        dwhVarG.b.b(iH, iH);
                        dwhVarG.c(Bitmap.Config.RGB_565);
                        dwhVarG.b();
                        dwhVarG.j();
                        dwhVarG.f(nwaVar);
                        break;
                }
            }
        });
        a26.T(jwaVar.b, kzeVar, new f7f(this) { // from class: mwa
            public final /* synthetic */ owa b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b;
                owa owaVar = this.b;
                switch (b3) {
                    case 0:
                        vjd vjdVar = (vjd) obj;
                        jwa jwaVar2 = owaVar.g;
                        hwa hwaVar = new hwa(vjdVar.m);
                        ArrayList arrayListJ = j95.j(new hwa[]{hwaVar});
                        Bundle bundle = vjdVar.I;
                        String[] stringArray = bundle != null ? bundle.getStringArray("com.opera.android.media.AI_POD_ICONS") : null;
                        if (stringArray != null && stringArray.length != 0) {
                            for (String str : stringArray) {
                                if (str != null) {
                                    Uri uri = Uri.parse(str);
                                    if (!Intrinsics.a(uri, hwaVar.a)) {
                                        arrayListJ.add(new hwa(uri));
                                    }
                                }
                            }
                        }
                        if (!arrayListJ.equals(jwaVar2.c)) {
                            jwaVar2.c = arrayListJ;
                            jwaVar2.d = 0;
                            jwaVar2.a();
                            jwaVar2.b();
                            break;
                        }
                        break;
                    default:
                        hwa hwaVar2 = (hwa) obj;
                        zyk zykVar = owaVar.h;
                        deg degVar = (deg) zykVar.getValue();
                        nwa nwaVar = owaVar.i;
                        degVar.b(nwaVar);
                        Context context2 = owaVar.a;
                        deg degVar2 = (deg) zykVar.getValue();
                        Uri uri2 = hwaVar2 != null ? hwaVar2.a : null;
                        int iH = z7h.h(context2, 128.0f);
                        dwh dwhVarG = degVar2.g(uri2);
                        dwhVarG.b.b(iH, iH);
                        dwhVarG.c(Bitmap.Config.RGB_565);
                        dwhVarG.b();
                        dwhVarG.j();
                        dwhVarG.f(nwaVar);
                        break;
                }
            }
        });
        shapeDrawable.getPaint().setColor(f03.t(2130969332, context, 2131101243));
        shapeDrawable.invalidateSelf();
    }
}
