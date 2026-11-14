package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.chromium.ChromiumContainerView;
import com.opera.api.Callback;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class yt3 implements Callback {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ yt3(cbk cbkVar, hq8 hq8Var, int i, boolean z, qpm qpmVar, Runnable runnable) {
        this.d = cbkVar;
        this.e = hq8Var;
        this.b = i;
        this.c = z;
        this.f = qpmVar;
        this.g = runnable;
    }

    public /* synthetic */ yt3(d7l d7lVar, FrameLayout frameLayout, View view, BrowserActivity browserActivity, int i, boolean z) {
        this.d = d7lVar;
        this.e = frameLayout;
        this.f = view;
        this.g = browserActivity;
        this.b = i;
        this.c = z;
    }

    public /* synthetic */ yt3(qln qlnVar, Integer num, boolean z, String str, int i, Callback callback) {
        this.d = qlnVar;
        this.e = num;
        this.c = z;
        this.f = str;
        this.b = i;
        this.g = callback;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                d7l d7lVar = (d7l) obj5;
                FrameLayout frameLayout = (FrameLayout) obj4;
                View view = (View) obj3;
                BrowserActivity browserActivity = (BrowserActivity) obj2;
                yni yniVar = (yni) obj;
                int i = BrowserActivity.E1;
                Bitmap bitmap = yniVar != null ? yniVar.a : null;
                ChromiumContainerView chromiumContainerViewE0 = browserActivity.e0();
                k6l k6lVar = browserActivity.V;
                k6l k6lVar2 = k6lVar == null ? null : k6lVar;
                if (bitmap != null) {
                    new xbf(d7lVar, frameLayout, view, chromiumContainerViewE0, k6lVar2, new w3a(new InsetDrawable((Drawable) new BitmapDrawable(view.getContext().getResources(), bitmap), 0, this.b, 0, 0), 48, false), this.c);
                    break;
                } else {
                    k6lVar2.C(d7lVar, 3);
                    break;
                }
            case 1:
                cbk cbkVar = (cbk) obj5;
                hq8 hq8Var = (hq8) obj4;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList = (ArrayList) cbkVar.d;
                lgf lgfVar = (lgf) cbkVar.e;
                arrayList.add(new fzj((Context) lgfVar.c, (esk) lgfVar.e, hq8Var.h(), hq8Var.i(p6l.a), this.b, this.c, (Drawable) obj, (qpm) obj3, runnable));
                cbkVar.b();
                break;
            default:
                ((dnn) obj).a(new m59((qln) obj5, (Integer) obj4, this.c, (String) obj3, this.b, (Callback) obj2));
                break;
        }
    }
}
