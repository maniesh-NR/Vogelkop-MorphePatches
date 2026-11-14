package defpackage;

import J.N;
import ads_mobile_sdk.a90;
import ads_mobile_sdk.dt2;
import ads_mobile_sdk.eq2;
import ads_mobile_sdk.fw0;
import ads_mobile_sdk.hh3;
import ads_mobile_sdk.ih1;
import ads_mobile_sdk.kh3;
import ads_mobile_sdk.mv0;
import ads_mobile_sdk.ou0;
import ads_mobile_sdk.rg3;
import ads_mobile_sdk.s8;
import ads_mobile_sdk.tu0;
import ads_mobile_sdk.uw0;
import ads_mobile_sdk.ux2;
import ads_mobile_sdk.wk2;
import android.os.Bundle;
import com.opera.android.search.YandexPromotionTabHelper;
import java.util.concurrent.CancellationException;
import org.chromium.media.MediaCodecBridge;

/* loaded from: classes.dex */
public final class p94 implements Runnable {
    public final /* synthetic */ byte a;
    public final int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p94(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public p94(t66 t66Var, int i, Bundle bundle) {
        this.a = (byte) 1;
        this.c = t66Var;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((qyn) this.c).S(this.b);
                return;
            case 1:
                a90 a90Var = ((t66) this.c).b;
                int i = this.b;
                ux2 ux2Var = a90Var.a.c;
                fw0 fw0Var = fw0.CUI_NAME_CUSTOM_TABS_NAVIGATION_EVENT;
                kh3 kh3Var = new kh3(new eq2(), new ih1(), new dt2(), new s8());
                l08 l08Var = l08.a;
                if (hh3.b().a == null) {
                    wk2 wk2VarA = ux2.a(ux2Var, fw0Var, l08Var, kh3Var);
                    try {
                        hh3.a().e().A = Integer.valueOf(i);
                        wk2VarA.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            wk2VarA.b(th);
                            if (th instanceof iyo) {
                                throw th;
                            }
                            wk2VarA.a(th);
                            if (th instanceof kql) {
                                throw new uw0((kql) th);
                            }
                            if (th instanceof CancellationException) {
                                throw new ou0(th);
                            }
                            if (!(th instanceof mv0)) {
                                throw new tu0(th);
                            }
                            throw th;
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                vtp.v(wk2VarA, th2);
                                throw th3;
                            }
                        }
                    }
                }
                rg3 rg3VarA = hh3.a(fw0Var, l08Var, true);
                try {
                    hh3.a().e().A = Integer.valueOf(i);
                    rg3VarA.close();
                    return;
                } catch (Throwable th4) {
                    try {
                        rg3VarA.b(th4);
                        if (th4 instanceof iyo) {
                            throw th4;
                        }
                        rg3VarA.a(th4);
                        if (th4 instanceof kql) {
                            throw new uw0((kql) th4);
                        }
                        if (th4 instanceof CancellationException) {
                            throw new ou0(th4);
                        }
                        if (!(th4 instanceof mv0)) {
                            throw new tu0(th4);
                        }
                        throw th4;
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            vtp.v(rg3VarA, th5);
                            throw th6;
                        }
                    }
                }
            case 2:
                zdb zdbVar = (zdb) this.c;
                zdbVar.f = true;
                zdbVar.b.b().q().q(this.b);
                return;
            case 3:
                ((ldd) this.c).h.H0(this.b);
                return;
            case 4:
                MediaCodecBridge mediaCodecBridge = (MediaCodecBridge) this.c;
                int i2 = this.b;
                synchronized (mediaCodecBridge) {
                    if (mediaCodecBridge.k != i2) {
                        return;
                    }
                    mediaCodecBridge.i = false;
                    return;
                }
            default:
                long j = ((YandexPromotionTabHelper) this.c).b;
                if (j != 0) {
                    N.MEYJh61W(j, this.b);
                    return;
                }
                return;
        }
    }
}
