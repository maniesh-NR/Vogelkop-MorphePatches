package defpackage;

import ads_mobile_sdk.br3;
import ads_mobile_sdk.cr3;
import ads_mobile_sdk.cy0;
import ads_mobile_sdk.fo;
import ads_mobile_sdk.qr0;
import ads_mobile_sdk.zl1;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.ImageDecoder;
import android.util.Size;
import android.webkit.WebSettings;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class xwa extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xwa(Object obj, int i, int i2, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = obj;
        this.u = i;
        this.v = i2;
        this.x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwa(ywa ywaVar, int i, int i2, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 0;
        this.x = ywaVar;
        this.u = i;
        this.v = i2;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                xwa xwaVar = new xwa((ywa) obj2, this.u, this.v, mt5Var);
                xwaVar.w = obj;
                return xwaVar;
            case 1:
                return new xwa((cy0) this.w, this.u, this.v, (zl1) obj2, mt5Var, (byte) 1);
            default:
                return new xwa((File) this.w, this.u, this.v, (Context) obj2, mt5Var, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        Object obj2 = this.x;
        final int i = this.v;
        final int i2 = this.u;
        switch (b) {
            case 0:
                cxa cxaVar = (cxa) this.w;
                px5 px5Var = px5.a;
                ybh.y(obj);
                ywa ywaVar = (ywa) obj2;
                ywaVar.h0().c.setEnabled(cxaVar != cxa.b);
                if (cxaVar == cxa.a) {
                    ywaVar.h0().d.setDisplayedChild(i2);
                } else if (cxaVar == cxa.c) {
                    ywaVar.h0().d.setDisplayedChild(i);
                }
                return Unit.a;
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                cy0 cy0Var = (cy0) this.w;
                cy0Var.a(new cr3(br3.b, i2, i, 8));
                WebSettings settings = cy0Var.getSettings();
                qr0 qr0Var = ((zl1) obj2).a;
                qr0Var.getClass();
                Boolean bool = Boolean.FALSE;
                fo foVar = fo.a;
                settings.setUseWideViewPort(((Boolean) qr0Var.a("gads:use_wide_viewport:enabled", bool, foVar)).booleanValue());
                WebSettings settings2 = cy0Var.getSettings();
                qr0Var.getClass();
                settings2.setLoadWithOverviewMode(((Boolean) qr0Var.a("gads:load_with_overview_mode:enabled", bool, foVar)).booleanValue());
                return Unit.a;
            default:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                final Context context = (Context) obj2;
                return ImageDecoder.decodeDrawable(ImageDecoder.createSource((File) this.w), new ImageDecoder.OnHeaderDecodedListener() { // from class: qip
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        Size sizeC = elp.c(imageInfo.getSize(), i2, i);
                        imageDecoder.setTargetSize(sizeC.getWidth(), sizeC.getHeight());
                        List list = r8p.a;
                        if (((ActivityManager) context.getSystemService("activity")).isLowRamDevice()) {
                            imageDecoder.setMemorySizePolicy(0);
                        }
                    }
                });
        }
    }
}
