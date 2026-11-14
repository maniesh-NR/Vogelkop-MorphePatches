package defpackage;

import J.N;
import android.content.Context;
import android.os.CancellationSignal;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.opera.android.account.auth.EditProfileAuthActivity;
import com.opera.android.settings.SettingsManager;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.text.c;
import org.chromium.content.browser.input.DateTimeChooserAndroid;
import org.chromium.content.browser.input.ImeAdapterImpl;
import org.chromium.gfx.mojom.Rect;
import org.chromium.mojo.system.impl.CoreImpl;

/* loaded from: classes.dex */
public class ga6 implements ywh, uif, rk8, ph, rr9, wga, ez4, l0p, g1i, y7, hsd {
    public final /* synthetic */ byte a;
    public Object b;

    public ga6(byte b) {
        this.a = b;
        switch (b) {
            case 27:
                this.b = new HashSet();
                break;
            default:
                hu3 hu3Var = new hu3();
                this.b = hu3Var;
                if (!hu3Var.b) {
                    if (hu3Var.c) {
                        cpg.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    hu3Var.a();
                    hu3Var.c = true;
                    break;
                }
                break;
        }
    }

    public ga6(Context context, View view) {
        this.a = (byte) 6;
        this.b = new u85(context, view);
    }

    public ga6(ddc ddcVar, pad padVar, wx6 wx6Var, ole oleVar, xm5 xm5Var) {
        this.a = (byte) 4;
        this.b = wx6Var;
    }

    public /* synthetic */ ga6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public ga6(ygh yghVar) {
        this.a = (byte) 22;
        this.b = yghVar.b(IncorrectJpegMetadataQuirk.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ga6 j(android.view.View r2, android.view.View r3, boolean r4) {
        /*
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            int r0 = r2.width
            int r2 = r2.height
            if (r0 >= 0) goto L14
            if (r2 >= 0) goto L14
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            int r0 = r2.width
            int r2 = r2.height
        L14:
            if (r4 == 0) goto L24
            if (r0 > 0) goto L1e
            if (r2 <= 0) goto L24
            int r3 = r2 << 4
            int r0 = r3 / 9
        L1e:
            if (r2 > 0) goto L24
            int r2 = r0 * 9
            int r2 = r2 / 16
        L24:
            r3 = 11
            if (r0 <= 0) goto L35
            if (r2 <= 0) goto L35
            ga6 r4 = new ga6
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>(r0, r2)
            r4.<init>(r1, r3)
            return r4
        L35:
            ga6 r4 = new ga6
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>(r0, r2)
            r4.<init>(r1, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ga6.j(android.view.View, android.view.View, boolean):ga6");
    }

    public static ga6 m(ImageView imageView, View view) {
        return j(imageView, view, imageView.getScaleType() == ImageView.ScaleType.CENTER_CROP);
    }

    public final void a(z7 z7Var, z4o z4oVar) {
        new CancellationSignal().setOnCancelListener(new mg5(((g77) this.b).B(z7Var, new lra(z4oVar)), (byte) 2));
    }

    @Override // defpackage.uif
    public final void b(boolean z) {
        if (z) {
            ((EditProfileAuthActivity) this.b).finish();
        }
    }

    public final void c(ArrayList arrayList) {
        m5h.c(arrayList, new bm8(this, (byte) 27));
    }

    @Override // defpackage.ez4
    public final void close() {
        ((l2b) this.b).finish();
    }

    @Override // defpackage.ez4
    public final void d() {
    }

    @Override // defpackage.hsd
    public final void e(cie cieVar) {
        jsd jsdVar = (jsd) this.b;
        z5p z5pVar = new z5p(jsdVar.getContext(), null);
        jsdVar.a(z5pVar);
        jsdVar.a.put(cieVar, z5pVar);
        cieVar.w0 = z5pVar;
        jsd.c(z5pVar, cieVar);
    }

    public final void f(String str, String str2, String str3, w98 w98Var) {
        d06 d06Var = (d06) this.b;
        if (d06Var != null) {
            d06Var.f(str, str2, str3, w98Var);
        }
    }

    public final boolean g(vho vhoVar) {
        dro droVar = vhoVar.a().j;
        if (droVar == dro.b) {
            return droVar.a.contains(vhoVar.a);
        }
        return false;
    }

    public final int getHeight() {
        return ((ExtendedFloatingActionButton) this.b).P();
    }

    public final int getPaddingEnd() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.b;
        return (extendedFloatingActionButton.P() - ((MaterialButton) extendedFloatingActionButton).p) / 2;
    }

    public final int getPaddingStart() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.b;
        return (extendedFloatingActionButton.P() - ((MaterialButton) extendedFloatingActionButton).p) / 2;
    }

    public final int getWidth() {
        return ((ExtendedFloatingActionButton) this.b).P();
    }

    public final void h(z7 z7Var, y7 y7Var) {
        new CancellationSignal().setOnCancelListener(new mg5(((g77) this.b).B(z7Var, new kra(y7Var)), (byte) 2));
    }

    @Override // defpackage.uif
    public final void i(zhj zhjVar) {
        ac8.a(zhjVar);
    }

    public final void k(Object obj) {
        oh ohVar = (oh) obj;
        w wVar = (w) this.b;
        yl9 yl9Var = (yl9) wVar.H.pollFirst();
        if (yl9Var != null) {
            String str = yl9Var.a;
            int i = yl9Var.b;
            Fragment fragmentC = wVar.c.c(str);
            if (fragmentC == null) {
                return;
            }
            fragmentC.onActivityResult(i, ohVar.a, ohVar.b);
        }
    }

    @Override // defpackage.y7
    public final void l() {
        ((azc) this.b).h(true, false);
    }

    public final ViewGroup.LayoutParams n() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.b;
        return new ViewGroup.LayoutParams(extendedFloatingActionButton.P(), extendedFloatingActionButton.P());
    }

    public final void o(int i, vjk vjkVar) {
        ImeAdapterImpl imeAdapterImpl = (ImeAdapterImpl) this.b;
        long j = imeAdapterImpl.a;
        if (j == 0) {
            return;
        }
        int i2 = (int) imeAdapterImpl.f.g.k;
        vjkVar.d.c -= i2;
        Rect rect = vjkVar.e;
        if (rect != null) {
            rect.c -= i2;
        }
        bp bpVar = new bp((CoreImpl) null, (int) ((uik) vjkVar).a);
        vjkVar.a(bpVar);
        zg zgVar = (zg) bpVar.b;
        ((ByteBuffer) zgVar.c).position(0);
        ((ByteBuffer) zgVar.c).limit(zgVar.a);
        ByteBuffer byteBuffer = (ByteBuffer) zgVar.c;
        if (((ArrayList) zgVar.d).isEmpty()) {
            N.M3wL9MnJ(j, i, byteBuffer);
        } else {
            yt7.k("Handles are discarded.");
        }
    }

    @Override // defpackage.rr9
    public final void onFailure(Throwable th) throws Exception {
        switch (this.a) {
            case 14:
                ((l94) this.b).d(th);
                break;
            default:
                ((qya) this.b).close();
                break;
        }
    }

    @Override // defpackage.rr9
    public final void onSuccess(Object obj) {
        switch (this.a) {
            case 14:
                l94 l94Var = (l94) this.b;
                try {
                    l94Var.b(obj);
                    break;
                } catch (Throwable th) {
                    l94Var.d(th);
                    return;
                }
            default:
                break;
        }
    }

    public final boolean p() {
        SettingsManager settingsManager = (SettingsManager) this.b;
        if (!settingsManager.a.contains("wallpaper_current") || !settingsManager.a.contains("manual_wallpaper_first_occurrence")) {
            return true;
        }
        if (settingsManager.q("manual_wallpaper_first_occurrence") == 0) {
            String strZ = settingsManager.z("wallpaper_current");
            if (c.q(strZ, "NETWORK_", false) || strZ.equals("THEME_WALLPAPER")) {
                return true;
            }
        }
        return false;
    }

    public final void q(double d) {
        long j = ((DateTimeChooserAndroid) this.b).a;
        if (j == 0) {
            return;
        }
        N.MgUhdCLo(j, d);
    }

    @Override // defpackage.y7
    public final void z(String str, boolean z) {
        ((azc) this.b).h(false, z);
    }
}
