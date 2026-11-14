package defpackage;

import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class a61 implements xj4 {
    public final hnl a;
    public final fd4 b;
    public final xfk c;
    public final gb4 d;
    public final sgk e;

    public a61(hnl hnlVar, fd4 fd4Var, xfk xfkVar, gb4 gb4Var, sgk sgkVar) {
        this.a = hnlVar;
        this.b = fd4Var;
        this.c = xfkVar;
        this.d = gb4Var;
        this.e = sgkVar;
    }

    @Override // defpackage.xj4
    public final wj4 a(wc4 wc4Var, Map map, dk4 dk4Var) throws Exception {
        cd4 cd4VarB;
        fd4 fd4Var = this.b;
        if (fd4Var.h != 2) {
            uac.k(phj.y0(this.b.h), " for Extension CameraGraph", "Unsupported session mode: ");
            return null;
        }
        Object obj = fd4Var.g.get(re4.a);
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num == null) {
            qp2.n("The CameraPipeKeys.camera2ExtensionMode must be set in the sessionParameters of the CameraGraph.Config when creating an Extension CameraGraph.");
            return null;
        }
        int iIntValue = num.intValue();
        if (this.b.d != null) {
            qp2.n("Reprocessing is not supported for Extensions");
            return null;
        }
        ma4 ma4Var = (ma4) ((fb4) this.d).a(wc4Var.G());
        Set set = (Set) ma4Var.g.getValue();
        sgk sgkVar = this.e;
        if (!set.contains(Integer.valueOf(iIntValue))) {
            StringBuilder sb = new StringBuilder();
            sb.append(wc4Var);
            sb.append(" does not support extension mode ");
            sb.append(iIntValue);
            sb.append(". Supported extensions are ");
            sb.append(set);
            sgkVar.getClass();
        }
        if (this.b.e != null) {
            synchronized (ma4Var.f) {
                cd4VarB = (cd4) ma4Var.f.get(Integer.valueOf(iIntValue));
            }
            if (cd4VarB == null) {
                fb4 fb4Var = ma4Var.c;
                String str = ma4Var.a;
                int i = Build.VERSION.SDK_INT;
                if (i < 31) {
                    throw new Exception(sko.i(i, "Extension sessions are only supported on Android S or higher. Device SDK is "));
                }
                try {
                    Trace.beginSection(((Object) sd4.b(str)) + "#awaitExtensionMetadata");
                    synchronized (fb4Var.g) {
                        cd4 cd4VarB2 = (cd4) fb4Var.g.get(str);
                        if (cd4VarB2 != null) {
                            cd4VarB = cd4VarB2;
                        } else if (fb4Var.e()) {
                            cd4VarB = fb4Var.b(iIntValue, str, true);
                        } else {
                            cd4VarB2 = fb4Var.b(iIntValue, str, false);
                            fb4Var.g.put(str, cd4VarB2);
                            cd4VarB = cd4VarB2;
                        }
                    }
                    Trace.endSection();
                    synchronized (ma4Var.f) {
                        ma4Var.f.put(Integer.valueOf(iIntValue), cd4VarB);
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            sgk sgkVar2 = this.e;
            if (!((Boolean) ((ja4) cd4VarB).d.getValue()).booleanValue()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(wc4Var);
                sb2.append(" does not support Postview streams");
                sgkVar2.getClass();
            }
            if (this.b.e.a.size() != 1) {
                qp2.n("Postview streams can only have one OutputStream.config object");
                return null;
            }
        }
        buf bufVarI = uup.i(this.b, this.c, map);
        if (bufVarI.a.isEmpty()) {
            Objects.toString(this.b);
            dk4Var.a();
            return qii.b;
        }
        if (!bufVarI.b.isEmpty()) {
            qp2.n("Deferred output is not supported for Extensions");
            return null;
        }
        kl8 kl8Var = new kl8(dk4Var);
        ArrayList arrayList = bufVarI.a;
        wd2 wd2Var = new wd2(this.a.a(), (byte) 1);
        fd4 fd4Var2 = this.b;
        if (wc4Var.D(new jl8(arrayList, wd2Var, dk4Var, fd4Var2.f, fd4Var2.g, Integer.valueOf(iIntValue), kl8Var, bufVarI.c))) {
            return new vj4(bufVarI.b, bufVarI.d);
        }
        wc4Var.toString();
        Objects.toString(dk4Var);
        dk4Var.a();
        return qii.b;
    }
}
