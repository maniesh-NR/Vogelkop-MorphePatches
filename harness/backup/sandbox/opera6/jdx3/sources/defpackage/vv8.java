package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public class vv8 implements wv8 {
    public final /* synthetic */ byte a;

    public /* synthetic */ vv8(byte b) {
        this.a = b;
    }

    @Override // defpackage.wv8
    public String a(yz yzVar) {
        Uri uri;
        switch (this.a) {
            case 0:
                return "";
            default:
                qhe qheVar = (qhe) ((gnf) yzVar).u.e.getValue();
                String string = (qheVar == null || (uri = qheVar.a) == null) ? null : uri.toString();
                return string != null ? string : "";
        }
    }

    @Override // defpackage.wv8
    public final double b(yz yzVar) {
        switch (this.a) {
            case 0:
                return 0.0d;
            default:
                c4p c4pVarJ = ((gnf) yzVar).u.b().j();
                Double d = c4pVarJ != null ? (Double) c4pVarJ.m.getValue() : null;
                if (d != null) {
                    return d.doubleValue();
                }
                return 0.0d;
        }
    }

    @Override // defpackage.wv8
    public String c(yz yzVar) {
        switch (this.a) {
            case 0:
                return "";
            default:
                String strF = ((gnf) yzVar).u.f();
                return strF != null ? strF : "";
        }
    }

    @Override // defpackage.wv8
    public CharSequence e(yz yzVar) {
        switch (this.a) {
            case 0:
                return "";
            default:
                c4p c4pVarJ = ((gnf) yzVar).u.b().j();
                String str = c4pVarJ != null ? (String) c4pVarJ.n.getValue() : null;
                return str != null ? str : "";
        }
    }

    @Override // defpackage.wv8
    public final CharSequence f(yz yzVar) {
        switch (this.a) {
            case 0:
                return "";
            default:
                String strC = ((gnf) yzVar).u.c();
                return strC != null ? strC : "";
        }
    }

    @Override // defpackage.wv8
    public CharSequence g(yz yzVar) {
        switch (this.a) {
            case 0:
                return "";
            default:
                c4p c4pVarJ = ((gnf) yzVar).u.b().j();
                String str = c4pVarJ != null ? (String) c4pVarJ.i.getValue() : null;
                return str != null ? str : "";
        }
    }
}
