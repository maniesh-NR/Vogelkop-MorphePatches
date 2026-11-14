package defpackage;

import J.N;
import android.app.Activity;
import android.content.pm.PackageInfo;
import android.credentials.CredentialManager;
import android.os.Build;
import com.google.android.gms.fido.Fido;
import com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient;
import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.browser.dialog.DialogDelegate;
import com.opera.android.browser.webauth.OperaWebAuthnCredentialsDelegateBridge;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.content.browser.framehost.RenderFrameHostImpl;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;
import org.chromium.url.Origin;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class ek2 implements neb {
    public final RenderFrameHost a;
    public final WebContents b;
    public final ArrayDeque c = new ArrayDeque();
    public final HashSet d = new HashSet();
    public sz8 e;
    public boolean f;
    public final Origin g;
    public n61 h;
    public n61 i;

    public ek2(RenderFrameHost renderFrameHost) {
        this.a = renderFrameHost;
        this.g = renderFrameHost.d();
        WebContents webContents = ((RenderFrameHostImpl) renderFrameHost).b;
        this.b = (webContents == null || !(webContents instanceof WebContents)) ? null : webContents;
    }

    public static ysn m(ak2 ak2Var, boolean z) {
        ysn ysnVar = new ysn(24);
        ysnVar.b = ak2Var.a;
        ysnVar.c = z;
        return ysnVar;
    }

    public static dx9 p(int i, rw9 rw9Var) {
        dx9 dx9Var = new dx9((byte) 0);
        sw9 sw9Var = new sw9(32);
        sw9Var.c = rw9Var;
        sw9Var.b = i;
        dx9Var.a = (byte) 0;
        dx9Var.c = sw9Var;
        return dx9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean q(dx3 dx3Var) {
        if (dx3Var != 0) {
            PackageInfo packageInfoU = r9n.u(dx3Var, "com.google.android.gms", 0L);
            if ((packageInfoU == null ? 0 : packageInfoU.versionCode) >= 16890000) {
                return true;
            }
        }
        return false;
    }

    public final void close() {
        qg2 qg2Var = new qg2((byte) 1);
        HashSet hashSet = this.d;
        hashSet.forEach(qg2Var);
        hashSet.clear();
        this.f = false;
        this.h = null;
        this.i = null;
        this.e = null;
    }

    public final void h(k8e k8eVar) {
        close();
    }

    public final void k() {
        if (!this.f || this.i == null) {
            return;
        }
        sz8 sz8Var = this.e;
        int iA = vep.A(sz8Var.b);
        if (iA == 1) {
            sz8Var.b = 5;
            ek2 ek2Var = sz8Var.c;
            if (ek2Var != null) {
                ek2Var.s(13);
                sz8Var.c = null;
                return;
            }
            return;
        }
        if (iA != 2) {
            if (iA == 3) {
                sz8Var.b = 5;
                return;
            }
            return;
        }
        sz8Var.b(this.a);
        sz8Var.b = 1;
        ek2 ek2Var2 = sz8Var.c;
        if (ek2Var2 != null) {
            ek2Var2.s(13);
            sz8Var.c = null;
        }
    }

    public final sz8 l() {
        sz8 sz8Var = new sz8(new bk2(this, (byte) 0));
        this.d.add(sz8Var);
        return sz8Var;
    }

    public final void n(final n61 n61Var) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(m(ak2.CAPABILITY_RELATED_ORIGINS, true));
        dx3 dx3VarL = dx3.L(this.b);
        boolean zQ = q(dx3VarL);
        arrayList.add(m(ak2.CAPABILITY_HYBRID_TRANSPORT, zQ));
        arrayList.add(m(ak2.CAPABILITY_PPAA, zQ));
        if (!zQ) {
            arrayList.add(m(ak2.CAPABILITY_CONDITIONAL_GET, false));
            arrayList.add(m(ak2.CAPABILITY_UVPAA, false));
            n61Var.k((ysn[]) arrayList.toArray(new ysn[0]));
        } else {
            this.c.add(new yj2() { // from class: dk2
                public final void a(boolean z) {
                    ysn ysnVarM = ek2.m(ak2.CAPABILITY_CONDITIONAL_GET, z);
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(ysnVarM);
                    arrayList2.add(ek2.m(ak2.CAPABILITY_UVPAA, z));
                    n61Var.k((ysn[]) arrayList2.toArray(new ysn[0]));
                }
            });
            l();
            sz8.h(dx3VarL, this);
        }
    }

    public final void o(final cx9 cx9Var, n61 n61Var) {
        Fido2PrivilegedApiClient fido2PrivilegedApiClient = null;
        if (this.f) {
            n61Var.d(p(1, null));
            return;
        }
        this.i = n61Var;
        this.f = true;
        final dx3 dx3VarL = dx3.L(this.b);
        if (!q(dx3VarL) || cx9Var.c == null) {
            s(11);
            return;
        }
        final sz8 sz8VarL = l();
        this.e = sz8VarL;
        b9h b9hVar = cx9Var.c;
        int i = Build.VERSION.SDK_INT;
        final RenderFrameHost renderFrameHost = this.a;
        final Origin origin = this.g;
        if (i >= 34 && dx3VarL.R().R() != null) {
            renderFrameHost.e(b9hVar.d, origin, new nz8(sz8VarL, this, b9hVar, dx3VarL, origin, cx9Var));
            return;
        }
        tz8 tz8VarR = dx3VarL.R();
        Activity activity = tz8VarR.a;
        if (activity != null && (fido2PrivilegedApiClient = tz8VarR.b) == null) {
            fido2PrivilegedApiClient = Fido.getFido2PrivilegedApiClient(activity);
            tz8VarR.b = fido2PrivilegedApiClient;
        }
        if (fido2PrivilegedApiClient == null) {
            s(32);
            return;
        }
        String str = b9hVar.d;
        final Fido2PrivilegedApiClient fido2PrivilegedApiClient2 = fido2PrivilegedApiClient;
        renderFrameHost.e(str, origin, new Callback() { // from class: oz8
            @Override // org.chromium.base.Callback
            /* renamed from: onResult */
            public final void c(Object obj) {
                cx9 cx9Var2;
                boolean z;
                RenderFrameHost.WebAuthSecurityChecksResults webAuthSecurityChecksResults = (RenderFrameHost.WebAuthSecurityChecksResults) obj;
                int i2 = webAuthSecurityChecksResults.b;
                final ek2 ek2Var = this;
                if (i2 != 0) {
                    ek2Var.s(i2);
                    return;
                }
                final boolean z2 = webAuthSecurityChecksResults.a;
                cx9 cx9Var3 = cx9Var;
                final b9h b9hVar2 = cx9Var3.c;
                y8h[] y8hVarArr = b9hVar2.e;
                if (y8hVarArr == null || y8hVarArr.length == 0) {
                    cx9Var2 = cx9Var3;
                    z = false;
                } else {
                    cx9Var2 = cx9Var3;
                    z = true;
                }
                if (!z) {
                    b9hVar2.h.c = false;
                }
                int i3 = cx9Var2.b;
                final sz8 sz8Var = sz8VarL;
                final Fido2PrivilegedApiClient fido2PrivilegedApiClient3 = fido2PrivilegedApiClient2;
                final dx3 dx3Var = dx3VarL;
                final boolean z3 = z;
                final cx9 cx9Var4 = cx9Var2;
                final RenderFrameHost renderFrameHost2 = renderFrameHost;
                final Origin origin2 = origin;
                if (i3 != 1 && z3) {
                    sz8Var.g(fido2PrivilegedApiClient3, cx9Var4, dx3Var, renderFrameHost2, origin2, z2, ek2Var, (byte[]) null);
                    return;
                }
                sz8Var.b = 2;
                sz8Var.c = ek2Var;
                try {
                    Task credentialList = fido2PrivilegedApiClient3.getCredentialList(b9hVar2.d);
                    credentialList.addOnSuccessListener(new OnSuccessListener() { // from class: pz8
                        public final void onSuccess(Object obj2) {
                            int i4;
                            List list = (List) obj2;
                            sz8 sz8Var2 = sz8Var;
                            if (sz8Var2.b == 5) {
                                sz8Var2.b = 1;
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list.iterator();
                            while (true) {
                                i4 = 0;
                                if (!it.hasNext()) {
                                    break;
                                }
                                FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) it.next();
                                if (fidoCredentialDetails.getIsDiscoverable()) {
                                    if (z3) {
                                        y8h[] y8hVarArr2 = b9hVar2.e;
                                        int length = y8hVarArr2.length;
                                        while (true) {
                                            if (i4 < length) {
                                                if (Arrays.equals(fidoCredentialDetails.getCredentialId(), y8hVarArr2[i4].c)) {
                                                    arrayList.add(fidoCredentialDetails);
                                                    break;
                                                }
                                                i4++;
                                            }
                                        }
                                    } else {
                                        arrayList.add(fidoCredentialDetails);
                                    }
                                }
                            }
                            cx9 cx9Var5 = cx9Var4;
                            int i5 = cx9Var5.b;
                            Fido2PrivilegedApiClient fido2PrivilegedApiClient4 = fido2PrivilegedApiClient3;
                            dx3 dx3Var2 = dx3Var;
                            RenderFrameHost renderFrameHost3 = renderFrameHost2;
                            Origin origin3 = origin2;
                            boolean z4 = z2;
                            ek2 ek2Var2 = ek2Var;
                            if (i5 != 1 && arrayList.isEmpty()) {
                                sz8Var2.b = 1;
                                sz8Var2.g(fido2PrivilegedApiClient4, cx9Var5, dx3Var2, renderFrameHost3, origin3, z4, ek2Var2, (byte[]) null);
                                return;
                            }
                            sz8Var2.b = 3;
                            sz8Var2.c = ek2Var2;
                            tyn tynVar = sz8Var2.d;
                            if (tynVar == null) {
                                WebContents webContents = sz8Var2.a.b.b;
                                GURL gurl = ChromiumContent.V;
                                ChromiumContent chromiumContent = (ChromiumContent) N.Mo8CJari(webContents);
                                tynVar = chromiumContent == null ? null : new tyn(chromiumContent);
                                sz8Var2.d = tynVar;
                            }
                            int i6 = cx9Var5.b;
                            if (tynVar == null) {
                                if (i6 != 1) {
                                    sz8Var2.g(fido2PrivilegedApiClient4, cx9Var5, dx3Var2, renderFrameHost3, origin3, z4, ek2Var2, new byte[0]);
                                    return;
                                }
                                return;
                            }
                            boolean z5 = i6 == 1;
                            lz8 lz8Var = new lz8(sz8Var2, fido2PrivilegedApiClient4, cx9Var5, dx3Var2, renderFrameHost3, origin3, z4, ek2Var2);
                            LinkedHashMap linkedHashMap = tynVar.a;
                            ChromiumContent chromiumContent2 = tynVar.b;
                            if (chromiumContent2 == null) {
                                lz8Var.invoke(new byte[0]);
                                return;
                            }
                            if (!z5) {
                                cej cejVar = (cej) linkedHashMap.get(renderFrameHost3.c());
                                if (cejVar != null) {
                                    cejVar.finish(hjm.b);
                                }
                                xq3 xq3Var = new xq3(arrayList, lz8Var, (byte) 11);
                                linkedHashMap.put(renderFrameHost3.c(), xq3Var);
                                DialogDelegate dialogDelegate = chromiumContent2.p;
                                if (dialogDelegate != null) {
                                    dialogDelegate.d(xq3Var);
                                    return;
                                }
                                return;
                            }
                            rpf rpfVar = tynVar.c;
                            if (rpfVar != null) {
                                rpfVar.a();
                            }
                            WebContents webContentsE = chromiumContent2.e();
                            tu tuVar = new tu(lz8Var, (byte) 15);
                            ArrayList arrayList2 = OperaWebAuthnCredentialsDelegateBridge.a;
                            rpf rpfVar2 = new rpf(webContentsE, renderFrameHost3, tuVar);
                            OperaWebAuthnCredentialsDelegateBridge.CredentialDetails[] credentialDetailsArr = new OperaWebAuthnCredentialsDelegateBridge.CredentialDetails[arrayList.size()];
                            while (i4 < arrayList.size()) {
                                FidoCredentialDetails fidoCredentialDetails2 = (FidoCredentialDetails) arrayList.get(i4);
                                credentialDetailsArr[i4] = new OperaWebAuthnCredentialsDelegateBridge.CredentialDetails(fidoCredentialDetails2.getCredentialId(), fidoCredentialDetails2.getUserName(), fidoCredentialDetails2.getUserDisplayName(), fidoCredentialDetails2.getUserId());
                                i4++;
                            }
                            N.MCF7cEPC(webContentsE, renderFrameHost3, credentialDetailsArr);
                            tynVar.c = rpfVar2;
                        }
                    });
                    credentialList.addOnFailureListener(new bk2(ek2Var, (byte) 4));
                } catch (IllegalArgumentException unused) {
                    ek2Var.s(32);
                }
            }
        });
    }

    public final void r(final x8h x8hVar, n61 n61Var) {
        Fido2PrivilegedApiClient fido2PrivilegedApiClient = null;
        if (this.f) {
            n61Var.b(1, (z7d) null, (zsn) null);
            return;
        }
        this.h = n61Var;
        this.f = true;
        final dx3 dx3VarL = dx3.L(this.b);
        if (!q(dx3VarL)) {
            s(11);
            return;
        }
        final sz8 sz8VarL = l();
        this.e = sz8VarL;
        int i = Build.VERSION.SDK_INT;
        RenderFrameHost renderFrameHost = this.a;
        final Origin origin = this.g;
        if (i >= 34 && dx3VarL.R().R() != null) {
            renderFrameHost.a(x8hVar.b.b, origin, x8hVar.s, new Callback() { // from class: iz8
                @Override // org.chromium.base.Callback
                /* renamed from: onResult */
                public final void c(Object obj) throws JSONException {
                    RenderFrameHost.WebAuthSecurityChecksResults webAuthSecurityChecksResults = (RenderFrameHost.WebAuthSecurityChecksResults) obj;
                    int i2 = webAuthSecurityChecksResults.b;
                    ek2 ek2Var = this;
                    if (i2 != 0) {
                        ek2Var.s(i2);
                        return;
                    }
                    boolean z = webAuthSecurityChecksResults.a;
                    x8h x8hVar2 = x8hVar;
                    boolean z2 = x8hVar2.q;
                    dx3 dx3Var = dx3VarL;
                    CredentialManager credentialManagerR = dx3Var.R().R();
                    if (credentialManagerR == null) {
                        ek2Var.s(32);
                        return;
                    }
                    Origin origin2 = origin;
                    String strF = sz8.f(origin2);
                    byte[] bArr = x8hVar2.d;
                    String str = x8hVar2.b.b;
                    sz8 sz8Var = sz8VarL;
                    new a16(dx3Var, credentialManagerR).c(x8hVar2, sz8.f(origin2), sz8Var.e, sz8Var.a(0, strF, bArr, z, str, origin2), z2, ek2Var);
                }
            });
            return;
        }
        tz8 tz8VarR = dx3VarL.R();
        Activity activity = tz8VarR.a;
        if (activity != null && (fido2PrivilegedApiClient = tz8VarR.b) == null) {
            fido2PrivilegedApiClient = Fido.getFido2PrivilegedApiClient(activity);
            tz8VarR.b = fido2PrivilegedApiClient;
        }
        if (fido2PrivilegedApiClient == null) {
            s(32);
        } else {
            renderFrameHost.a(x8hVar.b.b, origin, x8hVar.s, new nz8(sz8VarL, this, fido2PrivilegedApiClient, x8hVar, dx3VarL, origin));
        }
    }

    public final void s(int i) {
        if (this.f) {
            n61 n61Var = this.h;
            if (n61Var != null) {
                n61Var.b(i, (z7d) null, (zsn) null);
            } else {
                n61 n61Var2 = this.i;
                if (n61Var2 != null) {
                    n61Var2.d(p(i, null));
                }
            }
            this.f = false;
            this.h = null;
            this.i = null;
            this.e = null;
        }
    }

    public final void t(rw9 rw9Var) {
        if (this.f) {
            this.i.d(p(0, rw9Var));
            this.f = false;
            this.h = null;
            this.i = null;
            this.e = null;
        }
    }
}
