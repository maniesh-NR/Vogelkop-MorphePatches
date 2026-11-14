package defpackage;

import J.N;
import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.compat.quirk.UseTorchAsFlashQuirk;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.browser.chromium.bitmap_generation.LongScreenshotsTabService;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.chromium.components.paintpreview.player.PlayerCompositorDelegateImpl;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public class r72 implements m7h, dxg {
    public byte a;
    public final Object b;
    public Object c;
    public final Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public r72(int i, h9o h9oVar) {
        this.c = new Object();
        this.a = i;
        this.b = new ArrayDeque(i);
        this.d = h9oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r72(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public r72(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = (byte) 16;
        ArrayList arrayList2 = new ArrayList();
        this.d = arrayList2;
        if (bitmap.isRecycled()) {
            qp2.o("Bitmap is not valid");
            throw null;
        }
        arrayList2.add(r9i.f);
        this.b = bitmap;
        arrayList.add(bcl.d);
        arrayList.add(bcl.e);
        arrayList.add(bcl.f);
        arrayList.add(bcl.g);
        arrayList.add(bcl.h);
        arrayList.add(bcl.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r72(da6 da6Var, fa6 fa6Var, a21 a21Var, int i) {
        this.b = da6Var;
        this.c = fa6Var;
        this.d = a21Var;
        this.a = i;
    }

    public r72(dx3 dx3Var, WebContentsWrapper webContentsWrapper) {
        WebContentsImpl webContentsImplE = webContentsWrapper.e();
        zg zgVar = new zg();
        zgVar.b = webContentsImplE;
        zgVar.a = (int) Math.floor(fb7.a(dx3Var).g / webContentsImplE.g.h);
        zgVar.c = new Rect(0, -1, 0, (zgVar.a * 10) - 1);
        this.b = new ArrayList();
        this.d = new h7f();
        ng3 ng3Var = new ng3(webContentsWrapper, zgVar, new ga6(this, (byte) 9));
        this.c = ng3Var;
        LongScreenshotsTabService longScreenshotsTabService = ng3Var.b;
        if (longScreenshotsTabService == null) {
            longScreenshotsTabService = (LongScreenshotsTabService) N.MfVKZ1LP();
            ng3Var.b = longScreenshotsTabService;
        }
        longScreenshotsTabService.a = ng3Var;
        Rect rect = (Rect) zgVar.c;
        if (longScreenshotsTabService.b == 0) {
            longScreenshotsTabService.processCaptureTabStatus(9);
        } else if (webContentsWrapper.h()) {
            longScreenshotsTabService.processCaptureTabStatus(5);
        } else {
            WebContents webContentsE = webContentsWrapper.e();
            N.MCHCGMmO(longScreenshotsTabService.b, webContentsWrapper.i, webContentsE.s(), webContentsE, rect.left, rect.top, rect.width(), rect.height(), true);
        }
        ng3Var.e = 0.0f;
        e(5);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r72(java.lang.String r4, javax.crypto.spec.SecretKeySpec r5) throws java.security.GeneralSecurityException {
        /*
            r3 = this;
            r3.<init>()
            gxg r0 = new gxg
            r0.<init>(r3)
            r3.b = r0
            r1 = 2
            boolean r2 = fki.e(r1)
            if (r2 == 0) goto L8c
            r3.c = r4
            r3.d = r5
            byte[] r5 = r5.getEncoded()
            int r5 = r5.length
            r2 = 16
            if (r5 < r2) goto L84
            int r5 = r4.hashCode()
            r2 = -1
            switch(r5) {
                case -1823053428: goto L4e;
                case 392315023: goto L44;
                case 392315118: goto L3b;
                case 392316170: goto L31;
                case 392317873: goto L27;
                default: goto L26;
            }
        L26:
            goto L56
        L27:
            java.lang.String r5 = "HMACSHA512"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L56
            r1 = 4
            goto L59
        L31:
            java.lang.String r5 = "HMACSHA384"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L56
            r1 = 3
            goto L59
        L3b:
            java.lang.String r5 = "HMACSHA256"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L59
            goto L56
        L44:
            java.lang.String r5 = "HMACSHA224"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L56
            r1 = 1
            goto L59
        L4e:
            java.lang.String r5 = "HMACSHA1"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L58
        L56:
            r1 = r2
            goto L59
        L58:
            r1 = 0
        L59:
            switch(r1) {
                case 0: goto L7c;
                case 1: goto L77;
                case 2: goto L72;
                case 3: goto L6d;
                case 4: goto L68;
                default: goto L5c;
            }
        L5c:
            java.security.NoSuchAlgorithmException r3 = new java.security.NoSuchAlgorithmException
            java.lang.String r5 = "unknown Hmac algorithm: "
            java.lang.String r4 = r5.concat(r4)
            r3.<init>(r4)
            throw r3
        L68:
            r4 = 64
            r3.a = r4
            goto L80
        L6d:
            r4 = 48
            r3.a = r4
            goto L80
        L72:
            r4 = 32
            r3.a = r4
            goto L80
        L77:
            r4 = 28
            r3.a = r4
            goto L80
        L7c:
            r4 = 20
            r3.a = r4
        L80:
            r0.get()
            return
        L84:
            java.security.InvalidAlgorithmParameterException r3 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r4 = "key size too small, need at least 16 bytes"
            r3.<init>(r4)
            throw r3
        L8c:
            java.lang.String r3 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            defpackage.t3p.w(r3)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r72.<init>(java.lang.String, javax.crypto.spec.SecretKeySpec):void");
    }

    public r72(myk mykVar) {
        this.d = mykVar;
        q65 q65Var = new q65(new qlk(this, (byte) 19), (byte) 4);
        this.b = q65Var;
        this.a = (byte) 5;
        q65Var.B0(mykVar.d, 2L, TimeUnit.SECONDS);
    }

    public final Object a() {
        Object objRemoveLast;
        synchronized (this.c) {
            objRemoveLast = ((ArrayDeque) this.b).removeLast();
        }
        return objRemoveLast;
    }

    public final void b() {
        ng3 ng3Var = (ng3) this.c;
        if (ng3Var != null) {
            vzk vzkVar = ng3Var.a;
            if (vzkVar != null) {
                PlayerCompositorDelegateImpl playerCompositorDelegateImpl = (PlayerCompositorDelegateImpl) vzkVar.a;
                if (playerCompositorDelegateImpl != null) {
                    long j = playerCompositorDelegateImpl.b;
                    if (j != 0) {
                        N.MIRVkfIx(j);
                        playerCompositorDelegateImpl.b = 0L;
                    }
                    vzkVar.a = null;
                }
                ng3Var.a = null;
            }
            LongScreenshotsTabService longScreenshotsTabService = ng3Var.b;
            if (longScreenshotsTabService != null) {
                long j2 = longScreenshotsTabService.b;
                if (j2 != 0) {
                    N.MHeIURzF(j2);
                }
            }
            this.c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r9i c() {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r72.c():r9i");
    }

    public final boolean d() {
        boolean zIsEmpty;
        synchronized (this.c) {
            zIsEmpty = ((ArrayDeque) this.b).isEmpty();
        }
        return zIsEmpty;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i) {
        this.a = i;
        ArrayList arrayList = (ArrayList) this.b;
        int i2 = 0;
        if (i == 4) {
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((g1d) obj).a();
            }
            arrayList.clear();
        } else {
            int size2 = arrayList.size();
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                ((g1d) obj2).b(i);
            }
        }
        h7f h7fVar = (h7f) this.d;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((goi) g7fVarH.next()).b(this.a);
        }
    }

    public final Object get() {
        da6 da6Var = (da6) this.b;
        a21 a21Var = (a21) this.d;
        fa6 fa6Var = (fa6) this.c;
        byte b = this.a;
        switch (b) {
            case 0:
                vsm vsmVar = (vsm) ((m7h) a21Var.b).get();
                ctm ctmVar = (ctm) fa6Var.j.get();
                if (((m7h) a21Var.c).get() == null) {
                    return new wrm(vsmVar, ctmVar, (zrm) ((m7h) a21Var.l).get(), (m7h) a21Var.j, (m7h) a21Var.i, (m7h) a21Var.h);
                }
                h9o.t();
                return null;
            case 1:
                srm srmVar = (srm) a21Var.a;
                mf4 mf4Var = (mf4) fa6Var.x.get();
                srmVar.getClass();
                return new vsm(new rrm(srmVar, (byte) 0), mf4Var, srmVar.b, new rrm(srmVar, (byte) 1));
            case 2:
                ((srm) a21Var.a).getClass();
                return null;
            case 3:
                return new u07((m7h) a21Var.k, (ctm) fa6Var.j.get());
            case 4:
                m7h m7hVar = (m7h) a21Var.h;
                m7h m7hVar2 = (m7h) a21Var.e;
                vsm vsmVar2 = (vsm) ((m7h) a21Var.b).get();
                m7h m7hVar3 = (m7h) a21Var.j;
                ctm ctmVar2 = (ctm) fa6Var.j.get();
                yg4 yg4Var = (yg4) da6Var.a.g;
                alo.l(yg4Var);
                return new ism(m7hVar, m7hVar2, vsmVar2, m7hVar3, ctmVar2, yg4Var);
            case 5:
                ni4 ni4Var = tj4.f ? (ni4) ((m7h) a21Var.g).get() : (ni4) ((m7h) a21Var.f).get();
                alo.l(ni4Var);
                return ni4Var;
            case 6:
                ci4 ci4Var = (ci4) ((m7h) a21Var.d).get();
                n79 n79Var = (n79) fa6Var.q.get();
                kwl kwlVar = (kwl) fa6Var.p.get();
                x4n x4nVar = (x4n) fa6Var.t.get();
                ctm ctmVar3 = (ctm) fa6Var.j.get();
                tb5 tb5Var = (tb5) fa6Var.l.get();
                gf4 gf4Var = (gf4) fa6Var.i.get();
                return new rj4(ci4Var, n79Var, kwlVar, x4nVar, ctmVar3, tb5Var, gf4Var.a().a(UseTorchAsFlashQuirk.class) ? new plk(gf4Var, fa6Var.b.a(), (zhb) fa6Var.D.get()) : psp.g, (pe4) fa6Var.d.get(), (m7h) a21Var.e, (vsm) ((m7h) a21Var.b).get());
            case 7:
                return new ci4((pe4) fa6Var.d.get(), (vsm) ((m7h) a21Var.b).get(), (pdo) fa6Var.e.get(), (ctm) fa6Var.j.get(), fa6Var.a());
            case 8:
                return new nsm((vsm) ((m7h) a21Var.b).get(), fa6Var.a());
            case 9:
                return new tj4((pe4) fa6Var.d.get(), (m7h) a21Var.f, (ctm) fa6Var.j.get(), (kwl) fa6Var.p.get());
            case 10:
                ctm ctmVar4 = (ctm) fa6Var.j.get();
                qe4 qe4Var = (qe4) da6Var.a.d;
                alo.l(qe4Var);
                ygh yghVarA = ((gf4) fa6Var.i.get()).a();
                return new btm(ctmVar4, qe4Var, (yghVarA.a(ConfigureSurfaceToSecondarySessionFailQuirk.class) || yghVarA.a(PreviewOrientationIncorrectQuirk.class) || yghVarA.a(TextureViewIsClosedQuirk.class)) ? new bpd((byte) 20) : rbe.u, (w3j) ((m7h) a21Var.i).get());
            case 11:
                return ((srm) a21Var.a).c;
            default:
                throw new AssertionError((int) b);
        }
    }
}
