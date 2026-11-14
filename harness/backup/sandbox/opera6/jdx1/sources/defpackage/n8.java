package defpackage;

/* loaded from: classes.dex */
public final class n8 extends k8 {
    public static n8 q;
    public static final hyh r = hyh.b;
    public static final hyh s = hyh.a;
    public njl o;
    public k0j p;

    public final int[] R(int i) {
        int iE;
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
                try {
                    k0j k0jVar = this.p;
                    if (k0jVar == null) {
                        k0jVar = null;
                    }
                    voh vohVarG = k0jVar.g();
                    int iRound = Math.round(vohVarG.d - vohVarG.b);
                    if (i <= 0) {
                        i = 0;
                    }
                    njl njlVar = this.o;
                    if (njlVar == null) {
                        njlVar = null;
                    }
                    int iD = njlVar.b.d(i);
                    njl njlVar2 = this.o;
                    if (njlVar2 == null) {
                        njlVar2 = null;
                    }
                    float f = njlVar2.b.f(iD) + iRound;
                    njl njlVar3 = this.o;
                    if (njlVar3 == null) {
                        njlVar3 = null;
                    }
                    float f2 = njlVar3.b.f(njlVar3.b.f - 1);
                    njl njlVar4 = this.o;
                    if (f < f2) {
                        iE = (njlVar4 != null ? njlVar4 : null).b.e(f);
                    } else {
                        iE = (njlVar4 != null ? njlVar4 : null).b.f;
                    }
                    return V(i, s0(iE - 1, s) + 1);
                } catch (IllegalStateException unused) {
                }
            }
        }
        return null;
    }

    public final int[] h0(int i) {
        int iE;
        String str = (String) ((k8) this).a;
        if (str == null) {
            str = null;
        }
        if (str.length() > 0 && i > 0) {
            try {
                k0j k0jVar = this.p;
                if (k0jVar == null) {
                    k0jVar = null;
                }
                voh vohVarG = k0jVar.g();
                int iRound = Math.round(vohVarG.d - vohVarG.b);
                String str2 = (String) ((k8) this).a;
                if (str2 == null) {
                    str2 = null;
                }
                int length = str2.length();
                if (length <= i) {
                    i = length;
                }
                njl njlVar = this.o;
                if (njlVar == null) {
                    njlVar = null;
                }
                int iD = njlVar.b.d(i);
                njl njlVar2 = this.o;
                if (njlVar2 == null) {
                    njlVar2 = null;
                }
                float f = njlVar2.b.f(iD) - iRound;
                if (f > 0.0f) {
                    njl njlVar3 = this.o;
                    if (njlVar3 == null) {
                        njlVar3 = null;
                    }
                    iE = njlVar3.b.e(f);
                } else {
                    iE = 0;
                }
                String str3 = (String) ((k8) this).a;
                if (i == (str3 != null ? str3 : null).length() && iE < iD) {
                    iE++;
                }
                return V(s0(iE, r), i);
            } catch (IllegalStateException unused) {
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
