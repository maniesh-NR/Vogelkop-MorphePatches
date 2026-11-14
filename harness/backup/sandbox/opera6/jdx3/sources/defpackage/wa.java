package defpackage;

import J.N;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.b;
import com.opera.android.history.HistoryManager;
import com.opera.android.history.e;
import com.opera.android.widget.ThumbScroller;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.base.Callback;
import org.chromium.components.embedder_support.delegate.HtmlColorPickerBridge;
import org.chromium.components.messages.MessageWrapper;
import org.chromium.components.navigation_interception.InterceptNavigationDelegate;
import org.chromium.components.signin.AccountCapabilitiesFetcher;
import org.chromium.components.signin.base.AccountCapabilities;
import org.chromium.content.browser.input.SelectPopup;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.media.MediaDrmBridge;

/* loaded from: classes.dex */
public final /* synthetic */ class wa implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wa(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // org.chromium.base.Callback
    /* renamed from: onResult */
    public final void c(Object obj) {
        d23 d23Var;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                AccountCapabilitiesFetcher accountCapabilitiesFetcher = (AccountCapabilitiesFetcher) obj2;
                N.M8lmDXtQ((AccountCapabilities) obj, accountCapabilitiesFetcher.b);
                accountCapabilitiesFetcher.b = 0L;
                break;
            case 1:
                jb jbVar = (jb) obj2;
                AtomicReference atomicReference = (AtomicReference) jbVar.h;
                atomicReference.set((List) obj);
                if (!tjj.c.b()) {
                    if (((AtomicReference) jbVar.f).get() != null && atomicReference.get() != null) {
                        jbVar.a();
                        break;
                    }
                } else {
                    jbVar.h();
                    break;
                }
                break;
            case 2:
                ((kh) obj2).a(((Integer) obj).intValue() > 0);
                break;
            case 3:
                ((b7f) ((u59) obj2).b).d(new auj((byte) 8));
                break;
            case 4:
                ((com.opera.api.Callback) obj2).run(null);
                break;
            case 5:
                ng3 ng3Var = (ng3) obj2;
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 0) {
                    ng3Var.d.d = (Size) ng3Var.a.c;
                }
                r72 r72Var = (r72) ng3Var.c.b;
                if (iIntValue != 13 && iIntValue != 14) {
                    if (iIntValue != 0) {
                        r72Var.e(2);
                        break;
                    } else {
                        r72Var.e(4);
                        vzk vzkVar = ((ng3) r72Var.c).a;
                        Size size = vzkVar == null ? null : (Size) vzkVar.c;
                        Point point = vzkVar != null ? (Point) vzkVar.d : null;
                        h7f h7fVar = (h7f) r72Var.d;
                        g7f g7fVarH = am2.h(h7fVar, h7fVar);
                        while (g7fVarH.hasNext()) {
                            ((goi) g7fVarH.next()).a(size, point);
                        }
                        break;
                    }
                } else {
                    r72Var.e(1);
                    break;
                }
                break;
            case 6:
                int i = BrowserActivity.E1;
                ((BrowserActivity) obj2).v.d((dtl) obj);
                break;
            case 7:
                ((az3) obj2).M((dtl) obj);
                break;
            case 8:
                nz4 nz4Var = (nz4) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                uz4 uz4Var = nz4Var.i;
                if (uz4Var == null) {
                    if (zBooleanValue) {
                        nz4Var.i = new uz4((ThumbScroller) LayoutInflater.from(nz4Var.getContext()).inflate(2131559442, (ViewGroup) nz4Var.f.J).findViewById(2131364744), nz4Var.f, nz4Var.c);
                        break;
                    }
                } else {
                    uz4Var.b(zBooleanValue);
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((g55) obj2).e((Uri) obj);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((qp7) obj2).b(2131364811, (iyh) obj);
                break;
            case 11:
                tm8 tm8Var = (tm8) obj2;
                if (((Integer) obj).intValue() != 1 && (d23Var = tm8Var.u) != null) {
                    d23Var.c(sm8.c());
                    break;
                }
                break;
            case 12:
                gv3 gv3Var = (gv3) obj2;
                if (!Intrinsics.a((String) obj, "true")) {
                    ysj ysjVarJ0 = gv3Var.b.J0();
                    glj gljVar = new glj(new rxh(2132019203), 2500);
                    ysjVarJ0.getClass();
                    ysjVarJ0.b(gljVar, ijm.b);
                    break;
                }
                break;
            case 13:
                e eVar = (e) obj2;
                HistoryManager.NativeHistoryEntry[] nativeHistoryEntryArr = (HistoryManager.NativeHistoryEntry[]) obj;
                if (eVar.j != null) {
                    eVar.f.r(nativeHistoryEntryArr);
                    break;
                }
                break;
            case 14:
                int iIntValue2 = ((Integer) obj).intValue();
                long j = ((HtmlColorPickerBridge) obj2).a;
                if (j != 0) {
                    N.MQeIvBzp(j, iIntValue2);
                    break;
                }
                break;
            case 15:
                ((ota) obj2).c(((Boolean) obj).booleanValue());
                break;
            case 16:
                HashMap map = InterceptNavigationDelegate.a;
                N.MyCmcUgV(((NavigationHandle) obj2).x, ((Boolean) obj).booleanValue());
                break;
            case 17:
                Integer num = (Integer) obj;
                num.getClass();
                ((wa) ((vzk) obj2).b).c(num);
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                g1d g1dVar = (g1d) obj2;
                Bitmap bitmap = (Bitmap) obj;
                g1dVar.d = bitmap;
                if (bitmap != null) {
                    bitmap.getAllocationByteCount();
                }
                g1dVar.b(3);
                break;
            case 19:
                MediaDrmBridge mediaDrmBridge = (MediaDrmBridge) obj2;
                UUID uuid = MediaDrmBridge.n;
                if (!((Boolean) obj).booleanValue()) {
                    mediaDrmBridge.l();
                    break;
                } else {
                    mediaDrmBridge.b();
                    break;
                }
            case SizeUtil.textSize0 /* 20 */:
                int iIntValue3 = ((Integer) obj).intValue();
                long j2 = ((MessageWrapper) obj2).a;
                if (j2 != 0) {
                    N.M6PkOWjr(j2, iIntValue3);
                    break;
                }
                break;
            case 21:
                vve vveVar = (vve) obj2;
                vveVar.o();
                vveVar.f = (Activity) obj;
                vveVar.q();
                break;
            case SizeUtil.textSize1 /* 22 */:
                ((z1h) obj2).b((Boolean) obj);
                break;
            case 23:
                ((Consumer) obj2).accept((Rect) obj);
                break;
            case SizeUtil.textSize2 /* 24 */:
                ((SelectPopup) obj2).b((int[]) obj);
                break;
            case 25:
                ((xnj) obj2).invoke(null);
                break;
            case 26:
                ((nml) obj2).a((String) obj);
                break;
            default:
                b bVar = (b) obj2;
                if (!bVar.d) {
                    bVar.d = true;
                    bVar.b.f(false);
                    break;
                }
                break;
        }
    }
}
