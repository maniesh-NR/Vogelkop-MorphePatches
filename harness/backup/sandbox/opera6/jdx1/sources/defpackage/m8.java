package defpackage;

/* loaded from: classes.dex */
public final class m8 extends k8 {
    public static m8 p;
    public static final hyh q = hyh.b;
    public static final hyh r = hyh.a;
    public njl o;

    public final int[] R(int i) {
        int iD;
        String str = (String) ((k8) this).a;
        if (str == null) {
            str = null;
        }
        if (str.length() > 0) {
            String str2 = (String) ((k8) this).a;
            if (str2 == null) {
                str2 = null;
            }
            if (i < str2.length()) {
                njl njlVar = this.o;
                hyh hyhVar = q;
                if (i < 0) {
                    if (njlVar == null) {
                        njlVar = null;
                    }
                    iD = njlVar.b.d(0);
                } else {
                    if (njlVar == null) {
                        njlVar = null;
                    }
                    int iD2 = njlVar.b.d(i);
                    iD = s0(iD2, hyhVar) == i ? iD2 : iD2 + 1;
                }
                njl njlVar2 = this.o;
                if (njlVar2 == null) {
                    njlVar2 = null;
                }
                if (iD < njlVar2.b.f) {
                    return V(s0(iD, hyhVar), s0(iD, r) + 1);
                }
            }
        }
        return null;
    }

    public final int[] h0(int i) {
        int iD;
        String str = (String) ((k8) this).a;
        if (str == null) {
            str = null;
        }
        if (str.length() > 0 && i > 0) {
            String str2 = (String) ((k8) this).a;
            if (str2 == null) {
                str2 = null;
            }
            int length = str2.length();
            njl njlVar = this.o;
            hyh hyhVar = r;
            if (i > length) {
                if (njlVar == null) {
                    njlVar = null;
                }
                String str3 = (String) ((k8) this).a;
                if (str3 == null) {
                    str3 = null;
                }
                iD = njlVar.b.d(str3.length());
            } else {
                if (njlVar == null) {
                    njlVar = null;
                }
                int iD2 = njlVar.b.d(i);
                iD = s0(iD2, hyhVar) + 1 == i ? iD2 : iD2 - 1;
            }
            if (iD >= 0) {
                return V(s0(iD, q), s0(iD, hyhVar) + 1);
            }
        }
        return null;
    }

    public final int s0(int i, hyh hyhVar) {
        njl njlVar = this.o;
        if (njlVar == null) {
            njlVar = null;
        }
        int iG = njlVar.g(i);
        njl njlVar2 = this.o;
        if (njlVar2 == null) {
            njlVar2 = null;
        }
        hyh hyhVarH = njlVar2.h(iG);
        njl njlVar3 = this.o;
        if (hyhVar != hyhVarH) {
            return (njlVar3 != null ? njlVar3 : null).g(i);
        }
        return njl.d(njlVar3 != null ? njlVar3 : null, i) - 1;
    }
}
