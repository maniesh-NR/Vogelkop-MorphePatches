package defpackage;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.leanplum.utils.SizeUtil;
import com.opera.android.browser.BrowserFragment;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;

/* loaded from: classes.dex */
public class ole implements w7e, ec2, tif, hpf, ez4 {
    public Object a;

    public ole(byte b) {
        switch (b) {
            case 8:
                this.a = new AtomicBoolean(false);
                break;
            case SizeUtil.textSize1 /* 22 */:
                this.a = new ByteArrayOutputStream();
                break;
            case SizeUtil.textSize2 /* 24 */:
                this.a = new pfe();
                break;
            default:
                this.a = new e9(this);
                break;
        }
    }

    public /* synthetic */ ole(Object obj) {
        this.a = obj;
    }

    public ole(xd5 xd5Var) {
        this.a = new pde(xd5Var.getResources().getConfiguration());
        xd5Var.addOnConfigurationChangedListener(new jg4(this, xd5Var, (byte) 1));
    }

    public static String p(String str, f19 f19Var, boolean z) throws NoSuchAlgorithmException {
        String strConcat = f19Var.a;
        if (z) {
            strConcat = ".temp".concat(strConcat);
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                strReplaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return sko.k("lottie_cache_", strReplaceAll, strConcat);
    }

    public final File A() {
        File file = new File(((kw0) this.a).a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public boolean B(int i, int i2, Bundle bundle) {
        return false;
    }

    public final void C(b3g b3gVar) {
        osf osfVar = (osf) this.a;
        ArrayList arrayListB = b3gVar.b();
        int i = b3gVar.b;
        osfVar.getClass();
        if (!arrayListB.isEmpty()) {
            osfVar.a(new gv(i, (Collection) arrayListB, (byte) 3));
        }
        ArrayList arrayListB2 = b3gVar.b();
        int size = arrayListB2.size();
        byte b = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListB2.get(i2);
            i2++;
            if (((a3g) obj).c > 0) {
                new rml(Unit.a, osfVar.a).a(new msf(osfVar, b)).m(osfVar.d);
                return;
            }
        }
    }

    public final boolean D() {
        SelectionPopupControllerImpl selectionPopupControllerImpl = ((ue) this.a).h;
        return !((selectionPopupControllerImpl instanceof SelectionPopupControllerImpl) && selectionPopupControllerImpl.s);
    }

    public final boolean E(String str) {
        return (((ue) this.a).h.r || str.trim().isEmpty() || !D()) ? false : true;
    }

    public final void F(int i) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.a;
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
    }

    public final yb6 G(AssetManager assetManager, String str) {
        return new e19(assetManager, str, (byte) 1);
    }

    public final void H(int i, Object obj, zmi zmiVar) {
        w75 w75Var = (w75) this.a;
        w75Var.s(i, 3);
        zmiVar.e((v5) obj, w75Var.a);
        w75Var.s(i, 4);
    }

    @Override // defpackage.hpf
    public final void I(fpf fpfVar) {
        ((y53) this.a).b.l.d0(fpfVar.d.isEmpty() ? kh0.d : kh0.e);
    }

    public final void J(int i, Object obj, zmi zmiVar) {
        v5 v5Var = (v5) obj;
        w75 w75Var = (w75) this.a;
        w75Var.s(i, 2);
        w75Var.u(v5Var.a(zmiVar));
        zmiVar.e(v5Var, this);
    }

    public final File K(String str, InputStream inputStream, f19 f19Var) throws NoSuchAlgorithmException, IOException {
        File file = new File(A(), p(str, f19Var, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    public final void b() {
        pj2 pj2Var = (pj2) this.a;
        if (pj2Var.isAdded()) {
            pj2Var.G0(false);
            String string = pj2Var.getString(2132021775);
            pj2Var.r.setVisibility(0);
            pj2Var.r.setText(string);
        }
    }

    @Override // defpackage.ez4
    public final void close() {
        z4k z4kVar = ((uy3) this.a).c;
        if (z4kVar != null) {
            d7l d7lVar = (d7l) z4kVar.b;
            BrowserFragment browserFragment = (BrowserFragment) d7lVar.d.b;
            b2l b2lVarR = browserFragment.g.r(d7lVar.j.getId());
            if (b2lVarR == null) {
                return;
            }
            browserFragment.g.k(b2lVarR);
        }
    }

    @Override // defpackage.ez4
    public final void d() {
        z4k z4kVar = ((uy3) this.a).c;
        if (z4kVar != null) {
            d7l d7lVar = (d7l) z4kVar.b;
            BrowserFragment browserFragment = (BrowserFragment) d7lVar.d.b;
            b2l b2lVarR = browserFragment.g.r(d7lVar.j.getId());
            if (b2lVarR == null) {
                return;
            }
            browserFragment.g.C(b2lVarR, 3);
        }
    }

    public void e(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
    }

    public final void g(n18 n18Var) throws IOException {
        try {
            ((ByteArrayOutputStream) this.a).write(n18Var.getEncoded());
        } catch (Exception e) {
            h9o.s(e.getMessage(), e);
        }
    }

    @Override // defpackage.hpf
    public final void h(cpf cpfVar) {
        ((y53) this.a).b.l.d0(kh0.c);
    }

    public final void m(byte[] bArr) throws IOException {
        try {
            ((ByteArrayOutputStream) this.a).write(bArr);
        } catch (Exception e) {
            h9o.s(e.getMessage(), e);
        }
    }

    @Override // defpackage.hpf
    public final void n(epf epfVar) {
    }

    public AccessibilityNodeInfoCompat o(int i) {
        return null;
    }

    public List q() {
        return null;
    }

    @Override // defpackage.hpf
    public final void r(gpf gpfVar) {
        ((y53) this.a).b.l.d0(kh0.b);
    }

    public AccessibilityNodeInfoCompat s(int i) {
        return null;
    }

    public final f99 t() {
        return (f99) ((zyk) ((g77) this.a).a).getValue();
    }

    public final void v(tvh tvhVar) {
        b();
    }

    public final v7e w(d5o d5oVar) {
        return new fc2((AssetManager) this.a, this, (byte) 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x01f8, code lost:
    
        if (na2.Z(r9, r0, r8) == r7) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x011c -> B:32:0x0139). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0195 -> B:37:0x019f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(defpackage.a12 r21, esk r22, defpackage.qca r23, nt5 r24) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ole.x(a12, esk, qca, nt5):java.lang.Object");
    }

    public final void y(vi2 vi2Var) {
        pj2 pj2Var = (pj2) this.a;
        if (pj2Var.isAdded()) {
            int i = vi2Var.c;
            String str = (String) vi2Var.g;
            if (i == -1) {
                if (TextUtils.isEmpty(vi2Var.a)) {
                    return;
                }
                jpo.Q(pj2Var.y, vi2Var);
                return;
            }
            pj2Var.G0(false);
            if (!TextUtils.isEmpty(str)) {
                pj2Var.r.setVisibility(0);
                pj2Var.r.setText(str);
            } else {
                String string = pj2Var.getString(2132021775);
                pj2Var.r.setVisibility(0);
                pj2Var.r.setText(string);
            }
        }
    }

    public final void z(nc3 nc3Var) {
        tn tnVar = (tn) this.a;
        tnVar.a = true;
        tnVar.d = nc3Var;
        ArrayList arrayList = new ArrayList((HashSet) tnVar.c);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hc3 hc3Var = (hc3) obj;
            hc3Var.c = nc3Var;
            hc3Var.d = true;
            n61 n61Var = hc3Var.b;
            if (n61Var != null) {
                n61Var.c(nc3Var);
                hc3Var.b = null;
                hc3Var.d = false;
            }
        }
    }
}
