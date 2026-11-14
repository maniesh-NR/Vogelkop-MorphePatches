package defpackage;

/* loaded from: classes.dex */
public final class hcn implements jxd {
    public final String a;
    public final String b;

    public hcn(String str, String str2) {
        this.a = cqp.L0(str);
        this.b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.jxd
    public final void b(ujd ujdVar) {
        String str = this.a;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = '\b';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = '\t';
                    break;
                }
                break;
        }
        String str2 = this.b;
        switch (c) {
            case 0:
                Integer numF0 = sgb.f0(str2);
                if (numF0 != null) {
                    ujdVar.o = numF0;
                    break;
                }
                break;
            case 1:
                Integer numF02 = sgb.f0(str2);
                if (numF02 != null) {
                    ujdVar.C = numF02;
                    break;
                }
                break;
            case 2:
                Integer numF03 = sgb.f0(str2);
                if (numF03 != null) {
                    ujdVar.n = numF03;
                    break;
                }
                break;
            case 3:
                ujdVar.c = str2;
                break;
            case 4:
                ujdVar.D = str2;
                break;
            case 5:
                ujdVar.a = str2;
                break;
            case 6:
                ujdVar.g = str2;
                break;
            case 7:
                Integer numF04 = sgb.f0(str2);
                if (numF04 != null) {
                    ujdVar.B = numF04;
                    break;
                }
                break;
            case '\b':
                ujdVar.d = str2;
                break;
            case '\t':
                ujdVar.b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hcn.class == obj.getClass()) {
            hcn hcnVar = (hcn) obj;
            if (this.a.equals(hcnVar.a) && this.b.equals(hcnVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + z1m.f(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
