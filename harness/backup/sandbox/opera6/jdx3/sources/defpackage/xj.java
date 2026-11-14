package defpackage;

import J.N;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.i;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.tasks.OnSuccessListener;
import com.opera.android.browser.BrowserDataManager$CookiesAndLocalStorageUsageCallback;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.net.URL;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateParsingException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class xj implements vlf, n5o, dkj, u16, yjj, fkj, m9n, b27, xla, OnSuccessListener, m94, xo4, tj9, BrowserDataManager$CookiesAndLocalStorageUsageCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xj(ck ckVar, lk lkVar) {
        this.a = (byte) 1;
        this.c = ckVar;
        this.b = lkVar;
    }

    public /* synthetic */ xj(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.dkj
    public final void a() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 6:
                Context context = (Context) obj2;
                mlj mljVar = (mlj) obj;
                try {
                    Intent intent = new Intent();
                    intent.setAction("com.android.settings.TTS_SETTINGS");
                    intent.setFlags(268435456);
                    context.startActivity(intent);
                    break;
                } catch (ActivityNotFoundException unused) {
                    mljVar.a(new rxh(2132020203), 2500);
                    return;
                }
            case 7:
                nv6 nv6VarB = ((ru9) obj2).b();
                ((SharedPreferences.Editor) nv6VarB.a).putBoolean("ai.never_ask_for_mic_permission", true);
                nv6VarB.w();
                ((Runnable) obj).run();
                break;
            default:
                ((q3) obj2).invoke(Integer.valueOf(((ru2) obj).a));
                break;
        }
    }

    public final Object attachCompleter(l94 l94Var) {
        wg4 wg4Var = (wg4) this.b;
        Context context = (Context) this.c;
        Executor executor = wg4Var.d;
        executor.execute(new ug4(wg4Var, context, executor, 1, l94Var, SystemClock.elapsedRealtime()));
        return "CameraX initInternal";
    }

    public final Drawable b(xc xcVar) {
        Drawable drawableI0;
        rm5 rm5Var = xcVar.f;
        wo3 wo3Var = (wo3) this.b;
        k6l k6lVar = (k6l) this.c;
        if (xcVar.equals(xc.l)) {
            int i = m3l.h;
            Context context = wo3Var.J0().a.getContext();
            drawableI0 = new l3l(context, k6lVar, new m3l(context, null));
        } else {
            drawableI0 = j14.i0(xcVar.a, wo3Var.J0().a.getContext());
        }
        if (!(rm5Var instanceof wc) || !(drawableI0 instanceof LayerDrawable)) {
            return drawableI0;
        }
        return new b0j((LayerDrawable) drawableI0, 2131362631);
    }

    @Override // defpackage.yjj
    public final i c(ViewGroup viewGroup) {
        byte b = this.a;
        byte b2 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 13:
                mq2 mq2Var = (mq2) obj2;
                break;
            case 14:
                ws2 ws2Var = (ws2) obj2;
                bt2 bt2Var = (bt2) obj;
                View viewInflate = p37.U(viewGroup).inflate(2131558530, viewGroup, false);
                int i = 2131362708;
                if (((ImageView) w1h.j(2131362708, viewInflate)) != null) {
                    i = 2131363228;
                    Space space = (Space) w1h.j(2131363228, viewInflate);
                    if (space != null) {
                        i = 2131364556;
                        ImageView imageView = (ImageView) w1h.j(2131364556, viewInflate);
                        if (imageView != null) {
                            i = 2131364596;
                            TextView textView = (TextView) w1h.j(2131364596, viewInflate);
                            if (textView != null) {
                                i = 2131363525;
                                TextView textView2 = (TextView) w1h.j(2131363525, viewInflate);
                                if (textView2 != null) {
                                    break;
                                }
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                break;
            default:
                nv6 nv6Var = (nv6) obj2;
                hqk hqkVar = (hqk) obj;
                yq1 yq1VarInflate = p37.U(viewGroup).inflate(2131558581, viewGroup, false);
                if (yq1VarInflate == null) {
                    t3p.q("rootView");
                    break;
                } else {
                    break;
                }
        }
        return null;
    }

    @Override // defpackage.tj9
    public final void d(int i) throws CertificateParsingException {
        ((nrl) this.b).Q((kq4) ((lq4) this.c).a.get(i));
    }

    @Override // defpackage.fkj
    public final void e(gkj gkjVar, hjm hjmVar) {
        ((o5f) this.b).invoke(Boolean.valueOf(((lqh) this.c).a));
    }

    @Override // defpackage.xla
    public final void f(yla ylaVar) {
        f93 f93Var = (f93) this.b;
        yla ylaVar2 = (yla) this.c;
        g93 g93Var = f93Var.i;
        if (f93Var.h || ylaVar == null) {
            return;
        }
        g93Var.k.A(ylaVar);
        if (ylaVar.equals(ylaVar2)) {
            return;
        }
        g93Var.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ed, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r18) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xj.g(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // defpackage.m9n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.b
            o73 r0 = (defpackage.o73) r0
            java.lang.Object r5 = r5.c
            im7 r5 = (im7) r5
            int r1 = r0.i
            android.view.View r2 = r5.findViewById(r1)
            if (r2 == 0) goto L29
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            boolean r4 = r2.getGlobalVisibleRect(r3)
            if (r4 == 0) goto L29
            int r4 = r2.getHeight()
            int r3 = r3.height()
            if (r4 != r3) goto L29
            defpackage.qe6.N(r2)
            goto L59
        L29:
            r2 = 0
        L2a:
            android.widget.ListAdapter r3 = r5.getAdapter()
            int r3 = r3.getCount()
            if (r2 >= r3) goto L59
            android.widget.ListAdapter r3 = r5.getAdapter()
            java.lang.Object r3 = r3.getItem(r2)
            boolean r4 = r3 instanceof android.view.MenuItem
            if (r4 == 0) goto L48
            android.view.MenuItem r3 = (android.view.MenuItem) r3
            int r3 = r3.getItemId()
            if (r3 == r1) goto L4b
        L48:
            int r2 = r2 + 1
            goto L2a
        L4b:
            r5.setSelection(r2)
            br r2 = new br
            r3 = 4
            r2.<init>(r5, r1, r3)
            r3 = 250(0xfa, double:1.235E-321)
            r5.postDelayed(r2, r3)
        L59:
            r5 = -1
            r0.i = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xj.j():void");
    }

    @Override // defpackage.xo4
    public final PendingResult m(RemoteMediaClient remoteMediaClient) {
        zo4 zo4Var = (zo4) this.b;
        int[] iArr = (int[]) this.c;
        int length = iArr.length;
        int[] iArrCopyOf = new int[length];
        int i = 0;
        for (int i2 : iArr) {
            int[] iArr2 = zo4Var.l;
            if (i2 < iArr2.length) {
                iArrCopyOf[i] = iArr2[i2];
                i++;
            }
        }
        if (i == 0) {
            return null;
        }
        if (i == 1) {
            return remoteMediaClient.queueRemoveItem(iArrCopyOf[0], (JSONObject) null);
        }
        if (i < length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i);
        }
        return remoteMediaClient.queueRemoveItems(iArrCopyOf, (JSONObject) null);
    }

    public final void onSuccess(Object obj) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        ((dg7) this.b).run((byte[]) this.c);
    }

    @Override // defpackage.b27
    public final void p(boolean z) {
        d83 d83Var = (d83) this.b;
        w3g w3gVar = (w3g) this.c;
        int iA = w3g.a(d83Var.c, w3gVar);
        if (!z) {
            d83Var.notifyItemChanged(iA);
            return;
        }
        d83Var.c.remove(w3gVar);
        a4g a4gVar = (a4g) d83Var.b;
        List list = a4gVar.a;
        int iA2 = w3g.a(list, w3gVar);
        N.MvKxovNE(a4gVar.b, iA2);
        list.remove(iA2);
        d83Var.notifyItemRemoved(iA);
    }

    public final Object run() {
        return ((g71) this.b).c((URL) this.c);
    }

    @Override // com.opera.android.browser.BrowserDataManager$CookiesAndLocalStorageUsageCallback
    public final void run(String[] strArr, long j, boolean z) {
        String string;
        iu2 iu2Var = (iu2) this.b;
        s25 s25Var = (s25) this.c;
        if (!z) {
            iu2Var.run(qyn.C(s25Var, j, strArr.length, 2131886111, 2132021324));
            return;
        }
        int length = strArr.length;
        if (j == 0 && length == 0) {
            string = s25Var.a.getString(2132021324);
        } else {
            fp1 fp1Var = s25Var.a;
            string = fp1Var.getString(2132021266, aik.j(j, fp1Var), fp1Var.getResources().getQuantityString(2131886111, length, Integer.valueOf(length)));
        }
        iu2Var.run(string);
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((lk) obj2).H0().g(((ak) obj).W, z);
                break;
            case 1:
                ck ckVar = (ck) obj;
                lk lkVar = (lk) obj2;
                if (z) {
                    int iOrdinal = ckVar.Z.ordinal();
                    if (iOrdinal == 0) {
                        lkVar.H0().f.r(a7j.a);
                        break;
                    } else if (iOrdinal == 1) {
                        lkVar.H0().f.r(a7j.b);
                        break;
                    } else if (iOrdinal != 2) {
                        h9o.p();
                        break;
                    } else {
                        lkVar.H0().f.r(a7j.c);
                        break;
                    }
                }
                break;
            default:
                ((lk) obj2).H0().g(((zj) obj).W, z);
                break;
        }
    }
}
