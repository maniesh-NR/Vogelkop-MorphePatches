package defpackage;

import android.graphics.Bitmap;
import android.view.TextureView;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zgo implements eig {
    public final /* synthetic */ kvo a;
    public final /* synthetic */ ujo b;

    public zgo(ujo ujoVar, kvo kvoVar) {
        this.b = ujoVar;
        this.a = kvoVar;
    }

    public final void F(rhg rhgVar) {
        ujo ujoVar = this.b;
        ujoVar.c = (short) 256;
        n9h n9hVar = ujoVar.d;
        if (n9hVar == null || ((jn) n9hVar.c) == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) n9hVar.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            vsp vspVar = (vsp) obj;
            jn jnVar = (jn) n9hVar.c;
            if (vspVar.c) {
                vspVar.a(JavaScriptMessage$MsgType.error, jnVar, (Object) null);
                vspVar.a.remove(jnVar);
            }
        }
    }

    public final void P(boolean z) {
        Bitmap bitmap;
        ujo ujoVar = this.b;
        TextureView textureView = ujoVar.f;
        if (textureView == null || (bitmap = textureView.getBitmap()) == null) {
            return;
        }
        ujoVar.e = bitmap;
    }

    public final void h(int i) {
        dn dnVar;
        ujo ujoVar = this.b;
        if (i == 3) {
            ujoVar.c = (short) 9;
            fzo fzoVar = this.a.a.g;
            if (fzoVar == null || (dnVar = (dn) fzoVar.b) == null) {
                return;
            }
            dnVar.i();
            return;
        }
        if (i == 4) {
            ujoVar.c = (short) 65;
            n9h n9hVar = ujoVar.d;
            if (n9hVar == null || ((jn) n9hVar.c) == null) {
                return;
            }
            ArrayList arrayList = (ArrayList) n9hVar.b;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                vsp vspVar = (vsp) obj;
                jn jnVar = (jn) n9hVar.c;
                if (vspVar.c) {
                    vspVar.a(JavaScriptMessage$MsgType.end, jnVar, (Object) null);
                    vspVar.a.remove(jnVar);
                }
            }
        }
    }
}
