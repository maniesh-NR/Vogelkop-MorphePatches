package defpackage;

import android.view.View;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bno implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bno(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                zro zroVar = view instanceof zro ? (zro) view : null;
                if (zroVar != null) {
                    ((ny3) obj).a(zroVar);
                    break;
                }
                break;
            default:
                nxo nxoVar = (nxo) obj;
                if (!nxoVar.r) {
                    if (nxoVar.d() && !nxoVar.p) {
                        nxoVar.i.g(JavaScriptMessage$MsgType.start);
                        nxoVar.r = false;
                        break;
                    }
                } else {
                    nxoVar.g();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ny3 ny3Var = (ny3) obj;
                Intrinsics.a((zro) ny3Var.j, view);
                lzo lzoVar = (lzo) ny3Var.h;
                if (lzoVar != null) {
                    lzoVar.b();
                    break;
                }
                break;
            default:
                ((nxo) obj).f();
                break;
        }
    }
}
